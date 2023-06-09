package org.thp.cortex.controllers

import java.net.URLEncoder
import java.nio.file.Files
import akka.stream.scaladsl.FileIO

import javax.inject.{Inject, Singleton}
import net.lingala.zip4j.ZipFile
import net.lingala.zip4j.model.ZipParameters
import net.lingala.zip4j.model.enums.{CompressionLevel, EncryptionMethod}
import org.elastic4play.Timed
import org.elastic4play.controllers.Authenticated
import org.elastic4play.models.AttachmentAttributeFormat
import org.elastic4play.services.{AttachmentSrv, ExecutionContextSrv}
import org.thp.cortex.models.Roles
import play.api.http.HttpEntity
import play.api.libs.Files.DefaultTemporaryFileCreator
import play.api.mvc._
import play.api.{mvc, Configuration}

/** Controller used to access stored attachments (plain or zipped)
  */
@Singleton
class AttachmentCtrl(
    password: String,
    tempFileCreator: DefaultTemporaryFileCreator,
    attachmentSrv: AttachmentSrv,
    authenticated: Authenticated,
    components: ControllerComponents,
    executionContextSrv: ExecutionContextSrv
) extends AbstractController(components) {

  @Inject() def this(
      configuration: Configuration,
      tempFileCreator: DefaultTemporaryFileCreator,
      attachmentSrv: AttachmentSrv,
      authenticated: Authenticated,
      components: ControllerComponents,
      executionContextSrv: ExecutionContextSrv
  ) =
    this(configuration.get[String]("datastore.attachment.password"), tempFileCreator, attachmentSrv, authenticated, components, executionContextSrv)

  /** Download an attachment, identified by its hash, in plain format
    * File name can be specified. This method is not protected : browser will
    * open the document directly. It must be used only for safe file
    */
  @Timed("controllers.AttachmentCtrl.download")
  def download(hash: String, name: Option[String]): Action[AnyContent] = authenticated(Roles.read) { _ =>
    executionContextSrv.withDefault { implicit ec =>
      if (hash.startsWith("{{")) // angularjs hack
        NoContent
      else if (name.getOrElse("").intersect(AttachmentAttributeFormat.forbiddenChar).nonEmpty)
        mvc.Results.BadRequest("File name is invalid")
      else
        Result(
          header = ResponseHeader(
            200,
            Map(
              "Content-Disposition" ->
                s"""attachment; filename="${URLEncoder
                  .encode(name.getOrElse(hash), "utf-8")}"""",
              "Content-Transfer-Encoding" -> "binary"
            )
          ),
          body = HttpEntity.Streamed(attachmentSrv.source(hash), None, None)
        )
    }
  }

  /** Download an attachment, identified by its hash, in zip format.
    * Zip file is protected by the password "malware"
    * File name can be specified (zip extension is append)
    */
  @Timed("controllers.AttachmentCtrl.downloadZip")
  def downloadZip(hash: String, name: Option[String]): Action[AnyContent] = authenticated(Roles.read) { _ =>
    executionContextSrv.withDefault { implicit ec =>
      if (name.getOrElse("").intersect(AttachmentAttributeFormat.forbiddenChar).nonEmpty)
        BadRequest("File name is invalid")
      else {
        val f = tempFileCreator.create("zip", hash).path
        Files.delete(f)
        val zipFile = new ZipFile(f.toFile)
        zipFile.setPassword(password.toCharArray)
        val zipParams = new ZipParameters
        zipParams.setCompressionLevel(CompressionLevel.FASTEST)
        zipParams.setEncryptFiles(true)
        zipParams.setEncryptionMethod(EncryptionMethod.ZIP_STANDARD)
        zipParams.setFileNameInZip(name.getOrElse(hash))
        zipFile.addStream(attachmentSrv.stream(hash), zipParams)

        Result(
          header = ResponseHeader(
            200,
            Map(
              "Content-Disposition"       -> s"""attachment; filename="${URLEncoder.encode(name.getOrElse(hash), "utf-8")}.zip"""",
              "Content-Type"              -> "application/zip",
              "Content-Transfer-Encoding" -> "binary",
              "Content-Length"            -> Files.size(f).toString
            )
          ),
          body = HttpEntity.Streamed(FileIO.fromPath(f), Some(Files.size(f)), Some("application/zip"))
        )
      }
    }
  }
}
