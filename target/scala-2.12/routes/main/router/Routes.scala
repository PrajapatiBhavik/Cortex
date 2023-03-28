// @GENERATOR:play-routes-compiler
// @SOURCE:conf/routes

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._

import play.api.mvc._

import _root_.controllers.Assets.Asset

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:6
  Home_8: org.thp.cortex.controllers.Home,
  // @LINE:7
  StatusCtrl_1: org.thp.cortex.controllers.StatusCtrl,
  // @LINE:8
  AuthenticationCtrl_9: org.thp.cortex.controllers.AuthenticationCtrl,
  // @LINE:17
  AnalyzerCtrl_10: org.thp.cortex.controllers.AnalyzerCtrl,
  // @LINE:21
  JobCtrl_0: org.thp.cortex.controllers.JobCtrl,
  // @LINE:23
  ResponderCtrl_2: org.thp.cortex.controllers.ResponderCtrl,
  // @LINE:32
  MispCtrl_4: org.thp.cortex.controllers.MispCtrl,
  // @LINE:55
  AnalyzerConfigCtrl_5: org.thp.cortex.controllers.AnalyzerConfigCtrl,
  // @LINE:59
  ResponderConfigCtrl_13: org.thp.cortex.controllers.ResponderConfigCtrl,
  // @LINE:72
  StreamCtrl_7: org.thp.cortex.controllers.StreamCtrl,
  // @LINE:76
  MigrationCtrl_15: org.elastic4play.controllers.MigrationCtrl,
  // @LINE:77
  AttachmentCtrl_6: org.thp.cortex.controllers.AttachmentCtrl,
  // @LINE:80
  DBListCtrl_3: org.thp.cortex.controllers.DBListCtrl,
  // @LINE:87
  UserCtrl_14: org.thp.cortex.controllers.UserCtrl,
  // @LINE:104
  OrganizationCtrl_11: org.thp.cortex.controllers.OrganizationCtrl,
  // @LINE:112
  AssetCtrl_12: org.thp.cortex.controllers.AssetCtrl,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:6
    Home_8: org.thp.cortex.controllers.Home,
    // @LINE:7
    StatusCtrl_1: org.thp.cortex.controllers.StatusCtrl,
    // @LINE:8
    AuthenticationCtrl_9: org.thp.cortex.controllers.AuthenticationCtrl,
    // @LINE:17
    AnalyzerCtrl_10: org.thp.cortex.controllers.AnalyzerCtrl,
    // @LINE:21
    JobCtrl_0: org.thp.cortex.controllers.JobCtrl,
    // @LINE:23
    ResponderCtrl_2: org.thp.cortex.controllers.ResponderCtrl,
    // @LINE:32
    MispCtrl_4: org.thp.cortex.controllers.MispCtrl,
    // @LINE:55
    AnalyzerConfigCtrl_5: org.thp.cortex.controllers.AnalyzerConfigCtrl,
    // @LINE:59
    ResponderConfigCtrl_13: org.thp.cortex.controllers.ResponderConfigCtrl,
    // @LINE:72
    StreamCtrl_7: org.thp.cortex.controllers.StreamCtrl,
    // @LINE:76
    MigrationCtrl_15: org.elastic4play.controllers.MigrationCtrl,
    // @LINE:77
    AttachmentCtrl_6: org.thp.cortex.controllers.AttachmentCtrl,
    // @LINE:80
    DBListCtrl_3: org.thp.cortex.controllers.DBListCtrl,
    // @LINE:87
    UserCtrl_14: org.thp.cortex.controllers.UserCtrl,
    // @LINE:104
    OrganizationCtrl_11: org.thp.cortex.controllers.OrganizationCtrl,
    // @LINE:112
    AssetCtrl_12: org.thp.cortex.controllers.AssetCtrl
  ) = this(errorHandler, Home_8, StatusCtrl_1, AuthenticationCtrl_9, AnalyzerCtrl_10, JobCtrl_0, ResponderCtrl_2, MispCtrl_4, AnalyzerConfigCtrl_5, ResponderConfigCtrl_13, StreamCtrl_7, MigrationCtrl_15, AttachmentCtrl_6, DBListCtrl_3, UserCtrl_14, OrganizationCtrl_11, AssetCtrl_12, "/")

  def withPrefix(addPrefix: String): Routes = {
    val prefix = play.api.routing.Router.concatPrefix(addPrefix, this.prefix)
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, Home_8, StatusCtrl_1, AuthenticationCtrl_9, AnalyzerCtrl_10, JobCtrl_0, ResponderCtrl_2, MispCtrl_4, AnalyzerConfigCtrl_5, ResponderConfigCtrl_13, StreamCtrl_7, MigrationCtrl_15, AttachmentCtrl_6, DBListCtrl_3, UserCtrl_14, OrganizationCtrl_11, AssetCtrl_12, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix, """org.thp.cortex.controllers.Home.redirect"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/health""", """org.thp.cortex.controllers.StatusCtrl.health"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/logout""", """org.thp.cortex.controllers.AuthenticationCtrl.logout()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/login""", """org.thp.cortex.controllers.AuthenticationCtrl.login()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/ssoLogin""", """org.thp.cortex.controllers.AuthenticationCtrl.ssoLogin()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/ssoLogin""", """org.thp.cortex.controllers.AuthenticationCtrl.ssoLogin()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/status""", """org.thp.cortex.controllers.StatusCtrl.get"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/alert""", """org.thp.cortex.controllers.StatusCtrl.getAlerts"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/analyzer""", """org.thp.cortex.controllers.AnalyzerCtrl.find"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/analyzer/_search""", """org.thp.cortex.controllers.AnalyzerCtrl.find"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/analyzer/""" + "$" + """id<[^/]+>""", """org.thp.cortex.controllers.AnalyzerCtrl.get(id:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/analyzer/type/""" + "$" + """dataType<[^/]+>""", """org.thp.cortex.controllers.AnalyzerCtrl.listForType(dataType:String)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/analyzer/""" + "$" + """id<[^/]+>/run""", """org.thp.cortex.controllers.JobCtrl.createAnalyzerJob(id:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/responder""", """org.thp.cortex.controllers.ResponderCtrl.find"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/responder/_search""", """org.thp.cortex.controllers.ResponderCtrl.find"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/responder/""" + "$" + """id<[^/]+>""", """org.thp.cortex.controllers.ResponderCtrl.get(id:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/responder/type/""" + "$" + """dataType<[^/]+>""", """org.thp.cortex.controllers.ResponderCtrl.listForType(dataType:String)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/responder/""" + "$" + """id<[^/]+>/run""", """org.thp.cortex.controllers.JobCtrl.createResponderJob(id:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/job/""" + "$" + """id<[^/]+>/waitreport""", """org.thp.cortex.controllers.JobCtrl.waitReport(id:String, atMost:String ?= "1minute")"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """modules""", """org.thp.cortex.controllers.MispCtrl.modules"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """query""", """org.thp.cortex.controllers.MispCtrl.query"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/job/""" + "$" + """id<[^/]+>/artifacts""", """org.thp.cortex.controllers.JobCtrl.listArtifacts(id:String)"""),
    ("""DELETE""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/analyzer/""" + "$" + """id<[^/]+>""", """org.thp.cortex.controllers.AnalyzerCtrl.delete(id:String)"""),
    ("""PATCH""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/analyzer/""" + "$" + """id<[^/]+>""", """org.thp.cortex.controllers.AnalyzerCtrl.update(id:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/analyzerdefinition""", """org.thp.cortex.controllers.AnalyzerCtrl.listDefinitions"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/analyzerdefinition/scan""", """org.thp.cortex.controllers.AnalyzerCtrl.scan"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/organization/analyzer""", """org.thp.cortex.controllers.AnalyzerCtrl.find"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/organization/analyzer/_search""", """org.thp.cortex.controllers.AnalyzerCtrl.find"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/organization/analyzer/""" + "$" + """analyzerId<[^/]+>""", """org.thp.cortex.controllers.AnalyzerCtrl.create(analyzerId:String)"""),
    ("""DELETE""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/responder/""" + "$" + """id<[^/]+>""", """org.thp.cortex.controllers.ResponderCtrl.delete(id:String)"""),
    ("""PATCH""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/responder/""" + "$" + """id<[^/]+>""", """org.thp.cortex.controllers.ResponderCtrl.update(id:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/responderdefinition""", """org.thp.cortex.controllers.ResponderCtrl.listDefinitions"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/responderdefinition/scan""", """org.thp.cortex.controllers.ResponderCtrl.scan"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/organization/responder""", """org.thp.cortex.controllers.ResponderCtrl.find"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/organization/responder/_search""", """org.thp.cortex.controllers.ResponderCtrl.find"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/organization/responder/""" + "$" + """responderId<[^/]+>""", """org.thp.cortex.controllers.ResponderCtrl.create(responderId:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/analyzerconfig/""" + "$" + """analyzerConfigName<[^/]+>""", """org.thp.cortex.controllers.AnalyzerConfigCtrl.get(analyzerConfigName:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/analyzerconfig""", """org.thp.cortex.controllers.AnalyzerConfigCtrl.list"""),
    ("""PATCH""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/analyzerconfig/""" + "$" + """analyzerConfigName<[^/]+>""", """org.thp.cortex.controllers.AnalyzerConfigCtrl.update(analyzerConfigName:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/responderconfig/""" + "$" + """responderConfigName<[^/]+>""", """org.thp.cortex.controllers.ResponderConfigCtrl.get(responderConfigName:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/responderconfig""", """org.thp.cortex.controllers.ResponderConfigCtrl.list"""),
    ("""PATCH""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/responderconfig/""" + "$" + """responderConfigName<[^/]+>""", """org.thp.cortex.controllers.ResponderConfigCtrl.update(responderConfigName:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/job""", """org.thp.cortex.controllers.JobCtrl.list(dataTypeFilter:Option[String], dataFilter:Option[String], analyzerFilter:Option[String], range:Option[String])"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/job/_search""", """org.thp.cortex.controllers.JobCtrl.find"""),
    ("""DELETE""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/job/""" + "$" + """id<[^/]+>""", """org.thp.cortex.controllers.JobCtrl.delete(id:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/job/""" + "$" + """id<[^/]+>""", """org.thp.cortex.controllers.JobCtrl.get(id:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/job/""" + "$" + """id<[^/]+>/report""", """org.thp.cortex.controllers.JobCtrl.report(id:String)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/job/status""", """org.thp.cortex.controllers.JobCtrl.getJobStatus"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/stream""", """org.thp.cortex.controllers.StreamCtrl.create()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/stream/status""", """org.thp.cortex.controllers.StreamCtrl.status"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/stream/""" + "$" + """streamId<[^/]+>""", """org.thp.cortex.controllers.StreamCtrl.get(streamId:String)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/maintenance/migrate""", """org.elastic4play.controllers.MigrationCtrl.migrate"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/datastore/""" + "$" + """hash<[^/]+>""", """org.thp.cortex.controllers.AttachmentCtrl.download(hash:String, name:Option[String])"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/datastorezip/""" + "$" + """hash<[^/]+>""", """org.thp.cortex.controllers.AttachmentCtrl.downloadZip(hash:String, name:Option[String])"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/list""", """org.thp.cortex.controllers.DBListCtrl.list()"""),
    ("""DELETE""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/list/""" + "$" + """itemId<[^/]+>""", """org.thp.cortex.controllers.DBListCtrl.deleteItem(itemId:String)"""),
    ("""PATCH""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/list/""" + "$" + """itemId<[^/]+>""", """org.thp.cortex.controllers.DBListCtrl.updateItem(itemId:String)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/list/""" + "$" + """listName<[^/]+>""", """org.thp.cortex.controllers.DBListCtrl.addItem(listName:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/list/""" + "$" + """listName<[^/]+>""", """org.thp.cortex.controllers.DBListCtrl.listItems(listName:String)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/list/""" + "$" + """listName<[^/]+>/_exists""", """org.thp.cortex.controllers.DBListCtrl.itemExists(listName:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/user/current""", """org.thp.cortex.controllers.UserCtrl.currentUser()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/user""", """org.thp.cortex.controllers.UserCtrl.find()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/user/_search""", """org.thp.cortex.controllers.UserCtrl.find()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/organization/user""", """org.thp.cortex.controllers.UserCtrl.find()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/organization/user/_search""", """org.thp.cortex.controllers.UserCtrl.find()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/organization/""" + "$" + """organizationId<[^/]+>/user""", """org.thp.cortex.controllers.UserCtrl.findForOrganization(organizationId:String)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/organization/""" + "$" + """organizationId<[^/]+>/user/_search""", """org.thp.cortex.controllers.UserCtrl.findForOrganization(organizationId:String)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/user""", """org.thp.cortex.controllers.UserCtrl.create()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/user/""" + "$" + """userId<[^/]+>""", """org.thp.cortex.controllers.UserCtrl.get(userId:String)"""),
    ("""DELETE""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/user/""" + "$" + """userId<[^/]+>""", """org.thp.cortex.controllers.UserCtrl.delete(userId:String)"""),
    ("""PATCH""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/user/""" + "$" + """userId<[^/]+>""", """org.thp.cortex.controllers.UserCtrl.update(userId:String)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/user/""" + "$" + """userId<[^/]+>/password/set""", """org.thp.cortex.controllers.UserCtrl.setPassword(userId:String)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/user/""" + "$" + """userId<[^/]+>/password/change""", """org.thp.cortex.controllers.UserCtrl.changePassword(userId:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/user/""" + "$" + """userId<[^/]+>/key""", """org.thp.cortex.controllers.UserCtrl.getKey(userId:String)"""),
    ("""DELETE""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/user/""" + "$" + """userId<[^/]+>/key""", """org.thp.cortex.controllers.UserCtrl.removeKey(userId:String)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/user/""" + "$" + """userId<[^/]+>/key/renew""", """org.thp.cortex.controllers.UserCtrl.renewKey(userId:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/organization""", """org.thp.cortex.controllers.OrganizationCtrl.find"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/organization/_search""", """org.thp.cortex.controllers.OrganizationCtrl.find"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/organization/_stats""", """org.thp.cortex.controllers.OrganizationCtrl.stats"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/organization/""" + "$" + """id<[^/]+>""", """org.thp.cortex.controllers.OrganizationCtrl.get(id:String)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/organization""", """org.thp.cortex.controllers.OrganizationCtrl.create"""),
    ("""PATCH""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/organization/""" + "$" + """id<[^/]+>""", """org.thp.cortex.controllers.OrganizationCtrl.update(id:String)"""),
    ("""DELETE""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/organization/""" + "$" + """id<[^/]+>""", """org.thp.cortex.controllers.OrganizationCtrl.delete(id:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """""" + "$" + """file<.+>""", """org.thp.cortex.controllers.AssetCtrl.get(file:String)"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:6
  private[this] lazy val org_thp_cortex_controllers_Home_redirect0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val org_thp_cortex_controllers_Home_redirect0_invoker = createInvoker(
    Home_8.redirect,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "org.thp.cortex.controllers.Home",
      "redirect",
      Nil,
      "GET",
      this.prefix + """""",
      """""",
      Seq()
    )
  )

  // @LINE:7
  private[this] lazy val org_thp_cortex_controllers_StatusCtrl_health1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/health")))
  )
  private[this] lazy val org_thp_cortex_controllers_StatusCtrl_health1_invoker = createInvoker(
    StatusCtrl_1.health,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "org.thp.cortex.controllers.StatusCtrl",
      "health",
      Nil,
      "GET",
      this.prefix + """api/health""",
      """""",
      Seq()
    )
  )

  // @LINE:8
  private[this] lazy val org_thp_cortex_controllers_AuthenticationCtrl_logout2_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/logout")))
  )
  private[this] lazy val org_thp_cortex_controllers_AuthenticationCtrl_logout2_invoker = createInvoker(
    AuthenticationCtrl_9.logout(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "org.thp.cortex.controllers.AuthenticationCtrl",
      "logout",
      Nil,
      "GET",
      this.prefix + """api/logout""",
      """""",
      Seq()
    )
  )

  // @LINE:9
  private[this] lazy val org_thp_cortex_controllers_AuthenticationCtrl_login3_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/login")))
  )
  private[this] lazy val org_thp_cortex_controllers_AuthenticationCtrl_login3_invoker = createInvoker(
    AuthenticationCtrl_9.login(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "org.thp.cortex.controllers.AuthenticationCtrl",
      "login",
      Nil,
      "POST",
      this.prefix + """api/login""",
      """""",
      Seq()
    )
  )

  // @LINE:10
  private[this] lazy val org_thp_cortex_controllers_AuthenticationCtrl_ssoLogin4_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/ssoLogin")))
  )
  private[this] lazy val org_thp_cortex_controllers_AuthenticationCtrl_ssoLogin4_invoker = createInvoker(
    AuthenticationCtrl_9.ssoLogin(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "org.thp.cortex.controllers.AuthenticationCtrl",
      "ssoLogin",
      Nil,
      "GET",
      this.prefix + """api/ssoLogin""",
      """""",
      Seq()
    )
  )

  // @LINE:11
  private[this] lazy val org_thp_cortex_controllers_AuthenticationCtrl_ssoLogin5_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/ssoLogin")))
  )
  private[this] lazy val org_thp_cortex_controllers_AuthenticationCtrl_ssoLogin5_invoker = createInvoker(
    AuthenticationCtrl_9.ssoLogin(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "org.thp.cortex.controllers.AuthenticationCtrl",
      "ssoLogin",
      Nil,
      "POST",
      this.prefix + """api/ssoLogin""",
      """""",
      Seq()
    )
  )

  // @LINE:15
  private[this] lazy val org_thp_cortex_controllers_StatusCtrl_get6_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/status")))
  )
  private[this] lazy val org_thp_cortex_controllers_StatusCtrl_get6_invoker = createInvoker(
    StatusCtrl_1.get,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "org.thp.cortex.controllers.StatusCtrl",
      "get",
      Nil,
      "GET",
      this.prefix + """api/status""",
      """##################
 API used by TheHive""",
      Seq()
    )
  )

  // @LINE:16
  private[this] lazy val org_thp_cortex_controllers_StatusCtrl_getAlerts7_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/alert")))
  )
  private[this] lazy val org_thp_cortex_controllers_StatusCtrl_getAlerts7_invoker = createInvoker(
    StatusCtrl_1.getAlerts,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "org.thp.cortex.controllers.StatusCtrl",
      "getAlerts",
      Nil,
      "GET",
      this.prefix + """api/alert""",
      """""",
      Seq()
    )
  )

  // @LINE:17
  private[this] lazy val org_thp_cortex_controllers_AnalyzerCtrl_find8_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/analyzer")))
  )
  private[this] lazy val org_thp_cortex_controllers_AnalyzerCtrl_find8_invoker = createInvoker(
    AnalyzerCtrl_10.find,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "org.thp.cortex.controllers.AnalyzerCtrl",
      "find",
      Nil,
      "GET",
      this.prefix + """api/analyzer""",
      """""",
      Seq()
    )
  )

  // @LINE:18
  private[this] lazy val org_thp_cortex_controllers_AnalyzerCtrl_find9_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/analyzer/_search")))
  )
  private[this] lazy val org_thp_cortex_controllers_AnalyzerCtrl_find9_invoker = createInvoker(
    AnalyzerCtrl_10.find,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "org.thp.cortex.controllers.AnalyzerCtrl",
      "find",
      Nil,
      "POST",
      this.prefix + """api/analyzer/_search""",
      """""",
      Seq()
    )
  )

  // @LINE:19
  private[this] lazy val org_thp_cortex_controllers_AnalyzerCtrl_get10_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/analyzer/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val org_thp_cortex_controllers_AnalyzerCtrl_get10_invoker = createInvoker(
    AnalyzerCtrl_10.get(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "org.thp.cortex.controllers.AnalyzerCtrl",
      "get",
      Seq(classOf[String]),
      "GET",
      this.prefix + """api/analyzer/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:20
  private[this] lazy val org_thp_cortex_controllers_AnalyzerCtrl_listForType11_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/analyzer/type/"), DynamicPart("dataType", """[^/]+""",true)))
  )
  private[this] lazy val org_thp_cortex_controllers_AnalyzerCtrl_listForType11_invoker = createInvoker(
    AnalyzerCtrl_10.listForType(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "org.thp.cortex.controllers.AnalyzerCtrl",
      "listForType",
      Seq(classOf[String]),
      "GET",
      this.prefix + """api/analyzer/type/""" + "$" + """dataType<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:21
  private[this] lazy val org_thp_cortex_controllers_JobCtrl_createAnalyzerJob12_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/analyzer/"), DynamicPart("id", """[^/]+""",true), StaticPart("/run")))
  )
  private[this] lazy val org_thp_cortex_controllers_JobCtrl_createAnalyzerJob12_invoker = createInvoker(
    JobCtrl_0.createAnalyzerJob(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "org.thp.cortex.controllers.JobCtrl",
      "createAnalyzerJob",
      Seq(classOf[String]),
      "POST",
      this.prefix + """api/analyzer/""" + "$" + """id<[^/]+>/run""",
      """""",
      Seq()
    )
  )

  // @LINE:23
  private[this] lazy val org_thp_cortex_controllers_ResponderCtrl_find13_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/responder")))
  )
  private[this] lazy val org_thp_cortex_controllers_ResponderCtrl_find13_invoker = createInvoker(
    ResponderCtrl_2.find,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "org.thp.cortex.controllers.ResponderCtrl",
      "find",
      Nil,
      "GET",
      this.prefix + """api/responder""",
      """""",
      Seq()
    )
  )

  // @LINE:24
  private[this] lazy val org_thp_cortex_controllers_ResponderCtrl_find14_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/responder/_search")))
  )
  private[this] lazy val org_thp_cortex_controllers_ResponderCtrl_find14_invoker = createInvoker(
    ResponderCtrl_2.find,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "org.thp.cortex.controllers.ResponderCtrl",
      "find",
      Nil,
      "POST",
      this.prefix + """api/responder/_search""",
      """""",
      Seq()
    )
  )

  // @LINE:25
  private[this] lazy val org_thp_cortex_controllers_ResponderCtrl_get15_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/responder/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val org_thp_cortex_controllers_ResponderCtrl_get15_invoker = createInvoker(
    ResponderCtrl_2.get(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "org.thp.cortex.controllers.ResponderCtrl",
      "get",
      Seq(classOf[String]),
      "GET",
      this.prefix + """api/responder/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:26
  private[this] lazy val org_thp_cortex_controllers_ResponderCtrl_listForType16_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/responder/type/"), DynamicPart("dataType", """[^/]+""",true)))
  )
  private[this] lazy val org_thp_cortex_controllers_ResponderCtrl_listForType16_invoker = createInvoker(
    ResponderCtrl_2.listForType(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "org.thp.cortex.controllers.ResponderCtrl",
      "listForType",
      Seq(classOf[String]),
      "GET",
      this.prefix + """api/responder/type/""" + "$" + """dataType<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:27
  private[this] lazy val org_thp_cortex_controllers_JobCtrl_createResponderJob17_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/responder/"), DynamicPart("id", """[^/]+""",true), StaticPart("/run")))
  )
  private[this] lazy val org_thp_cortex_controllers_JobCtrl_createResponderJob17_invoker = createInvoker(
    JobCtrl_0.createResponderJob(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "org.thp.cortex.controllers.JobCtrl",
      "createResponderJob",
      Seq(classOf[String]),
      "POST",
      this.prefix + """api/responder/""" + "$" + """id<[^/]+>/run""",
      """""",
      Seq()
    )
  )

  // @LINE:29
  private[this] lazy val org_thp_cortex_controllers_JobCtrl_waitReport18_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/job/"), DynamicPart("id", """[^/]+""",true), StaticPart("/waitreport")))
  )
  private[this] lazy val org_thp_cortex_controllers_JobCtrl_waitReport18_invoker = createInvoker(
    JobCtrl_0.waitReport(fakeValue[String], fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "org.thp.cortex.controllers.JobCtrl",
      "waitReport",
      Seq(classOf[String], classOf[String]),
      "GET",
      this.prefix + """api/job/""" + "$" + """id<[^/]+>/waitreport""",
      """""",
      Seq()
    )
  )

  // @LINE:32
  private[this] lazy val org_thp_cortex_controllers_MispCtrl_modules19_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("modules")))
  )
  private[this] lazy val org_thp_cortex_controllers_MispCtrl_modules19_invoker = createInvoker(
    MispCtrl_4.modules,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "org.thp.cortex.controllers.MispCtrl",
      "modules",
      Nil,
      "GET",
      this.prefix + """modules""",
      """###################
 API used by MISP""",
      Seq()
    )
  )

  // @LINE:33
  private[this] lazy val org_thp_cortex_controllers_MispCtrl_query20_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("query")))
  )
  private[this] lazy val org_thp_cortex_controllers_MispCtrl_query20_invoker = createInvoker(
    MispCtrl_4.query,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "org.thp.cortex.controllers.MispCtrl",
      "query",
      Nil,
      "POST",
      this.prefix + """query""",
      """""",
      Seq()
    )
  )

  // @LINE:36
  private[this] lazy val org_thp_cortex_controllers_JobCtrl_listArtifacts21_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/job/"), DynamicPart("id", """[^/]+""",true), StaticPart("/artifacts")))
  )
  private[this] lazy val org_thp_cortex_controllers_JobCtrl_listArtifacts21_invoker = createInvoker(
    JobCtrl_0.listArtifacts(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "org.thp.cortex.controllers.JobCtrl",
      "listArtifacts",
      Seq(classOf[String]),
      "GET",
      this.prefix + """api/job/""" + "$" + """id<[^/]+>/artifacts""",
      """""",
      Seq()
    )
  )

  // @LINE:38
  private[this] lazy val org_thp_cortex_controllers_AnalyzerCtrl_delete22_route = Route("DELETE",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/analyzer/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val org_thp_cortex_controllers_AnalyzerCtrl_delete22_invoker = createInvoker(
    AnalyzerCtrl_10.delete(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "org.thp.cortex.controllers.AnalyzerCtrl",
      "delete",
      Seq(classOf[String]),
      "DELETE",
      this.prefix + """api/analyzer/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:39
  private[this] lazy val org_thp_cortex_controllers_AnalyzerCtrl_update23_route = Route("PATCH",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/analyzer/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val org_thp_cortex_controllers_AnalyzerCtrl_update23_invoker = createInvoker(
    AnalyzerCtrl_10.update(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "org.thp.cortex.controllers.AnalyzerCtrl",
      "update",
      Seq(classOf[String]),
      "PATCH",
      this.prefix + """api/analyzer/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:40
  private[this] lazy val org_thp_cortex_controllers_AnalyzerCtrl_listDefinitions24_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/analyzerdefinition")))
  )
  private[this] lazy val org_thp_cortex_controllers_AnalyzerCtrl_listDefinitions24_invoker = createInvoker(
    AnalyzerCtrl_10.listDefinitions,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "org.thp.cortex.controllers.AnalyzerCtrl",
      "listDefinitions",
      Nil,
      "GET",
      this.prefix + """api/analyzerdefinition""",
      """""",
      Seq()
    )
  )

  // @LINE:41
  private[this] lazy val org_thp_cortex_controllers_AnalyzerCtrl_scan25_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/analyzerdefinition/scan")))
  )
  private[this] lazy val org_thp_cortex_controllers_AnalyzerCtrl_scan25_invoker = createInvoker(
    AnalyzerCtrl_10.scan,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "org.thp.cortex.controllers.AnalyzerCtrl",
      "scan",
      Nil,
      "POST",
      this.prefix + """api/analyzerdefinition/scan""",
      """""",
      Seq()
    )
  )

  // @LINE:42
  private[this] lazy val org_thp_cortex_controllers_AnalyzerCtrl_find26_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/organization/analyzer")))
  )
  private[this] lazy val org_thp_cortex_controllers_AnalyzerCtrl_find26_invoker = createInvoker(
    AnalyzerCtrl_10.find,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "org.thp.cortex.controllers.AnalyzerCtrl",
      "find",
      Nil,
      "GET",
      this.prefix + """api/organization/analyzer""",
      """""",
      Seq()
    )
  )

  // @LINE:43
  private[this] lazy val org_thp_cortex_controllers_AnalyzerCtrl_find27_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/organization/analyzer/_search")))
  )
  private[this] lazy val org_thp_cortex_controllers_AnalyzerCtrl_find27_invoker = createInvoker(
    AnalyzerCtrl_10.find,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "org.thp.cortex.controllers.AnalyzerCtrl",
      "find",
      Nil,
      "GET",
      this.prefix + """api/organization/analyzer/_search""",
      """""",
      Seq()
    )
  )

  // @LINE:44
  private[this] lazy val org_thp_cortex_controllers_AnalyzerCtrl_create28_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/organization/analyzer/"), DynamicPart("analyzerId", """[^/]+""",true)))
  )
  private[this] lazy val org_thp_cortex_controllers_AnalyzerCtrl_create28_invoker = createInvoker(
    AnalyzerCtrl_10.create(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "org.thp.cortex.controllers.AnalyzerCtrl",
      "create",
      Seq(classOf[String]),
      "POST",
      this.prefix + """api/organization/analyzer/""" + "$" + """analyzerId<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:46
  private[this] lazy val org_thp_cortex_controllers_ResponderCtrl_delete29_route = Route("DELETE",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/responder/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val org_thp_cortex_controllers_ResponderCtrl_delete29_invoker = createInvoker(
    ResponderCtrl_2.delete(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "org.thp.cortex.controllers.ResponderCtrl",
      "delete",
      Seq(classOf[String]),
      "DELETE",
      this.prefix + """api/responder/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:47
  private[this] lazy val org_thp_cortex_controllers_ResponderCtrl_update30_route = Route("PATCH",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/responder/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val org_thp_cortex_controllers_ResponderCtrl_update30_invoker = createInvoker(
    ResponderCtrl_2.update(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "org.thp.cortex.controllers.ResponderCtrl",
      "update",
      Seq(classOf[String]),
      "PATCH",
      this.prefix + """api/responder/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:48
  private[this] lazy val org_thp_cortex_controllers_ResponderCtrl_listDefinitions31_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/responderdefinition")))
  )
  private[this] lazy val org_thp_cortex_controllers_ResponderCtrl_listDefinitions31_invoker = createInvoker(
    ResponderCtrl_2.listDefinitions,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "org.thp.cortex.controllers.ResponderCtrl",
      "listDefinitions",
      Nil,
      "GET",
      this.prefix + """api/responderdefinition""",
      """""",
      Seq()
    )
  )

  // @LINE:49
  private[this] lazy val org_thp_cortex_controllers_ResponderCtrl_scan32_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/responderdefinition/scan")))
  )
  private[this] lazy val org_thp_cortex_controllers_ResponderCtrl_scan32_invoker = createInvoker(
    ResponderCtrl_2.scan,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "org.thp.cortex.controllers.ResponderCtrl",
      "scan",
      Nil,
      "POST",
      this.prefix + """api/responderdefinition/scan""",
      """""",
      Seq()
    )
  )

  // @LINE:50
  private[this] lazy val org_thp_cortex_controllers_ResponderCtrl_find33_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/organization/responder")))
  )
  private[this] lazy val org_thp_cortex_controllers_ResponderCtrl_find33_invoker = createInvoker(
    ResponderCtrl_2.find,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "org.thp.cortex.controllers.ResponderCtrl",
      "find",
      Nil,
      "GET",
      this.prefix + """api/organization/responder""",
      """""",
      Seq()
    )
  )

  // @LINE:51
  private[this] lazy val org_thp_cortex_controllers_ResponderCtrl_find34_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/organization/responder/_search")))
  )
  private[this] lazy val org_thp_cortex_controllers_ResponderCtrl_find34_invoker = createInvoker(
    ResponderCtrl_2.find,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "org.thp.cortex.controllers.ResponderCtrl",
      "find",
      Nil,
      "GET",
      this.prefix + """api/organization/responder/_search""",
      """""",
      Seq()
    )
  )

  // @LINE:52
  private[this] lazy val org_thp_cortex_controllers_ResponderCtrl_create35_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/organization/responder/"), DynamicPart("responderId", """[^/]+""",true)))
  )
  private[this] lazy val org_thp_cortex_controllers_ResponderCtrl_create35_invoker = createInvoker(
    ResponderCtrl_2.create(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "org.thp.cortex.controllers.ResponderCtrl",
      "create",
      Seq(classOf[String]),
      "POST",
      this.prefix + """api/organization/responder/""" + "$" + """responderId<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:55
  private[this] lazy val org_thp_cortex_controllers_AnalyzerConfigCtrl_get36_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/analyzerconfig/"), DynamicPart("analyzerConfigName", """[^/]+""",true)))
  )
  private[this] lazy val org_thp_cortex_controllers_AnalyzerConfigCtrl_get36_invoker = createInvoker(
    AnalyzerConfigCtrl_5.get(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "org.thp.cortex.controllers.AnalyzerConfigCtrl",
      "get",
      Seq(classOf[String]),
      "GET",
      this.prefix + """api/analyzerconfig/""" + "$" + """analyzerConfigName<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:56
  private[this] lazy val org_thp_cortex_controllers_AnalyzerConfigCtrl_list37_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/analyzerconfig")))
  )
  private[this] lazy val org_thp_cortex_controllers_AnalyzerConfigCtrl_list37_invoker = createInvoker(
    AnalyzerConfigCtrl_5.list,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "org.thp.cortex.controllers.AnalyzerConfigCtrl",
      "list",
      Nil,
      "GET",
      this.prefix + """api/analyzerconfig""",
      """""",
      Seq()
    )
  )

  // @LINE:57
  private[this] lazy val org_thp_cortex_controllers_AnalyzerConfigCtrl_update38_route = Route("PATCH",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/analyzerconfig/"), DynamicPart("analyzerConfigName", """[^/]+""",true)))
  )
  private[this] lazy val org_thp_cortex_controllers_AnalyzerConfigCtrl_update38_invoker = createInvoker(
    AnalyzerConfigCtrl_5.update(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "org.thp.cortex.controllers.AnalyzerConfigCtrl",
      "update",
      Seq(classOf[String]),
      "PATCH",
      this.prefix + """api/analyzerconfig/""" + "$" + """analyzerConfigName<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:59
  private[this] lazy val org_thp_cortex_controllers_ResponderConfigCtrl_get39_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/responderconfig/"), DynamicPart("responderConfigName", """[^/]+""",true)))
  )
  private[this] lazy val org_thp_cortex_controllers_ResponderConfigCtrl_get39_invoker = createInvoker(
    ResponderConfigCtrl_13.get(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "org.thp.cortex.controllers.ResponderConfigCtrl",
      "get",
      Seq(classOf[String]),
      "GET",
      this.prefix + """api/responderconfig/""" + "$" + """responderConfigName<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:60
  private[this] lazy val org_thp_cortex_controllers_ResponderConfigCtrl_list40_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/responderconfig")))
  )
  private[this] lazy val org_thp_cortex_controllers_ResponderConfigCtrl_list40_invoker = createInvoker(
    ResponderConfigCtrl_13.list,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "org.thp.cortex.controllers.ResponderConfigCtrl",
      "list",
      Nil,
      "GET",
      this.prefix + """api/responderconfig""",
      """""",
      Seq()
    )
  )

  // @LINE:61
  private[this] lazy val org_thp_cortex_controllers_ResponderConfigCtrl_update41_route = Route("PATCH",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/responderconfig/"), DynamicPart("responderConfigName", """[^/]+""",true)))
  )
  private[this] lazy val org_thp_cortex_controllers_ResponderConfigCtrl_update41_invoker = createInvoker(
    ResponderConfigCtrl_13.update(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "org.thp.cortex.controllers.ResponderConfigCtrl",
      "update",
      Seq(classOf[String]),
      "PATCH",
      this.prefix + """api/responderconfig/""" + "$" + """responderConfigName<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:64
  private[this] lazy val org_thp_cortex_controllers_JobCtrl_list42_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/job")))
  )
  private[this] lazy val org_thp_cortex_controllers_JobCtrl_list42_invoker = createInvoker(
    JobCtrl_0.list(fakeValue[Option[String]], fakeValue[Option[String]], fakeValue[Option[String]], fakeValue[Option[String]]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "org.thp.cortex.controllers.JobCtrl",
      "list",
      Seq(classOf[Option[String]], classOf[Option[String]], classOf[Option[String]], classOf[Option[String]]),
      "GET",
      this.prefix + """api/job""",
      """""",
      Seq()
    )
  )

  // @LINE:65
  private[this] lazy val org_thp_cortex_controllers_JobCtrl_find43_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/job/_search")))
  )
  private[this] lazy val org_thp_cortex_controllers_JobCtrl_find43_invoker = createInvoker(
    JobCtrl_0.find,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "org.thp.cortex.controllers.JobCtrl",
      "find",
      Nil,
      "POST",
      this.prefix + """api/job/_search""",
      """""",
      Seq()
    )
  )

  // @LINE:66
  private[this] lazy val org_thp_cortex_controllers_JobCtrl_delete44_route = Route("DELETE",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/job/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val org_thp_cortex_controllers_JobCtrl_delete44_invoker = createInvoker(
    JobCtrl_0.delete(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "org.thp.cortex.controllers.JobCtrl",
      "delete",
      Seq(classOf[String]),
      "DELETE",
      this.prefix + """api/job/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:67
  private[this] lazy val org_thp_cortex_controllers_JobCtrl_get45_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/job/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val org_thp_cortex_controllers_JobCtrl_get45_invoker = createInvoker(
    JobCtrl_0.get(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "org.thp.cortex.controllers.JobCtrl",
      "get",
      Seq(classOf[String]),
      "GET",
      this.prefix + """api/job/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:68
  private[this] lazy val org_thp_cortex_controllers_JobCtrl_report46_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/job/"), DynamicPart("id", """[^/]+""",true), StaticPart("/report")))
  )
  private[this] lazy val org_thp_cortex_controllers_JobCtrl_report46_invoker = createInvoker(
    JobCtrl_0.report(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "org.thp.cortex.controllers.JobCtrl",
      "report",
      Seq(classOf[String]),
      "GET",
      this.prefix + """api/job/""" + "$" + """id<[^/]+>/report""",
      """""",
      Seq()
    )
  )

  // @LINE:69
  private[this] lazy val org_thp_cortex_controllers_JobCtrl_getJobStatus47_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/job/status")))
  )
  private[this] lazy val org_thp_cortex_controllers_JobCtrl_getJobStatus47_invoker = createInvoker(
    JobCtrl_0.getJobStatus,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "org.thp.cortex.controllers.JobCtrl",
      "getJobStatus",
      Nil,
      "POST",
      this.prefix + """api/job/status""",
      """""",
      Seq()
    )
  )

  // @LINE:72
  private[this] lazy val org_thp_cortex_controllers_StreamCtrl_create48_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/stream")))
  )
  private[this] lazy val org_thp_cortex_controllers_StreamCtrl_create48_invoker = createInvoker(
    StreamCtrl_7.create(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "org.thp.cortex.controllers.StreamCtrl",
      "create",
      Nil,
      "POST",
      this.prefix + """api/stream""",
      """""",
      Seq()
    )
  )

  // @LINE:73
  private[this] lazy val org_thp_cortex_controllers_StreamCtrl_status49_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/stream/status")))
  )
  private[this] lazy val org_thp_cortex_controllers_StreamCtrl_status49_invoker = createInvoker(
    StreamCtrl_7.status,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "org.thp.cortex.controllers.StreamCtrl",
      "status",
      Nil,
      "GET",
      this.prefix + """api/stream/status""",
      """""",
      Seq()
    )
  )

  // @LINE:74
  private[this] lazy val org_thp_cortex_controllers_StreamCtrl_get50_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/stream/"), DynamicPart("streamId", """[^/]+""",true)))
  )
  private[this] lazy val org_thp_cortex_controllers_StreamCtrl_get50_invoker = createInvoker(
    StreamCtrl_7.get(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "org.thp.cortex.controllers.StreamCtrl",
      "get",
      Seq(classOf[String]),
      "GET",
      this.prefix + """api/stream/""" + "$" + """streamId<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:76
  private[this] lazy val org_elastic4play_controllers_MigrationCtrl_migrate51_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/maintenance/migrate")))
  )
  private[this] lazy val org_elastic4play_controllers_MigrationCtrl_migrate51_invoker = createInvoker(
    MigrationCtrl_15.migrate,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "org.elastic4play.controllers.MigrationCtrl",
      "migrate",
      Nil,
      "POST",
      this.prefix + """api/maintenance/migrate""",
      """""",
      Seq()
    )
  )

  // @LINE:77
  private[this] lazy val org_thp_cortex_controllers_AttachmentCtrl_download52_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/datastore/"), DynamicPart("hash", """[^/]+""",true)))
  )
  private[this] lazy val org_thp_cortex_controllers_AttachmentCtrl_download52_invoker = createInvoker(
    AttachmentCtrl_6.download(fakeValue[String], fakeValue[Option[String]]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "org.thp.cortex.controllers.AttachmentCtrl",
      "download",
      Seq(classOf[String], classOf[Option[String]]),
      "GET",
      this.prefix + """api/datastore/""" + "$" + """hash<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:78
  private[this] lazy val org_thp_cortex_controllers_AttachmentCtrl_downloadZip53_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/datastorezip/"), DynamicPart("hash", """[^/]+""",true)))
  )
  private[this] lazy val org_thp_cortex_controllers_AttachmentCtrl_downloadZip53_invoker = createInvoker(
    AttachmentCtrl_6.downloadZip(fakeValue[String], fakeValue[Option[String]]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "org.thp.cortex.controllers.AttachmentCtrl",
      "downloadZip",
      Seq(classOf[String], classOf[Option[String]]),
      "GET",
      this.prefix + """api/datastorezip/""" + "$" + """hash<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:80
  private[this] lazy val org_thp_cortex_controllers_DBListCtrl_list54_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/list")))
  )
  private[this] lazy val org_thp_cortex_controllers_DBListCtrl_list54_invoker = createInvoker(
    DBListCtrl_3.list(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "org.thp.cortex.controllers.DBListCtrl",
      "list",
      Nil,
      "GET",
      this.prefix + """api/list""",
      """""",
      Seq()
    )
  )

  // @LINE:81
  private[this] lazy val org_thp_cortex_controllers_DBListCtrl_deleteItem55_route = Route("DELETE",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/list/"), DynamicPart("itemId", """[^/]+""",true)))
  )
  private[this] lazy val org_thp_cortex_controllers_DBListCtrl_deleteItem55_invoker = createInvoker(
    DBListCtrl_3.deleteItem(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "org.thp.cortex.controllers.DBListCtrl",
      "deleteItem",
      Seq(classOf[String]),
      "DELETE",
      this.prefix + """api/list/""" + "$" + """itemId<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:82
  private[this] lazy val org_thp_cortex_controllers_DBListCtrl_updateItem56_route = Route("PATCH",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/list/"), DynamicPart("itemId", """[^/]+""",true)))
  )
  private[this] lazy val org_thp_cortex_controllers_DBListCtrl_updateItem56_invoker = createInvoker(
    DBListCtrl_3.updateItem(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "org.thp.cortex.controllers.DBListCtrl",
      "updateItem",
      Seq(classOf[String]),
      "PATCH",
      this.prefix + """api/list/""" + "$" + """itemId<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:83
  private[this] lazy val org_thp_cortex_controllers_DBListCtrl_addItem57_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/list/"), DynamicPart("listName", """[^/]+""",true)))
  )
  private[this] lazy val org_thp_cortex_controllers_DBListCtrl_addItem57_invoker = createInvoker(
    DBListCtrl_3.addItem(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "org.thp.cortex.controllers.DBListCtrl",
      "addItem",
      Seq(classOf[String]),
      "POST",
      this.prefix + """api/list/""" + "$" + """listName<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:84
  private[this] lazy val org_thp_cortex_controllers_DBListCtrl_listItems58_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/list/"), DynamicPart("listName", """[^/]+""",true)))
  )
  private[this] lazy val org_thp_cortex_controllers_DBListCtrl_listItems58_invoker = createInvoker(
    DBListCtrl_3.listItems(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "org.thp.cortex.controllers.DBListCtrl",
      "listItems",
      Seq(classOf[String]),
      "GET",
      this.prefix + """api/list/""" + "$" + """listName<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:85
  private[this] lazy val org_thp_cortex_controllers_DBListCtrl_itemExists59_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/list/"), DynamicPart("listName", """[^/]+""",true), StaticPart("/_exists")))
  )
  private[this] lazy val org_thp_cortex_controllers_DBListCtrl_itemExists59_invoker = createInvoker(
    DBListCtrl_3.itemExists(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "org.thp.cortex.controllers.DBListCtrl",
      "itemExists",
      Seq(classOf[String]),
      "POST",
      this.prefix + """api/list/""" + "$" + """listName<[^/]+>/_exists""",
      """""",
      Seq()
    )
  )

  // @LINE:87
  private[this] lazy val org_thp_cortex_controllers_UserCtrl_currentUser60_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/user/current")))
  )
  private[this] lazy val org_thp_cortex_controllers_UserCtrl_currentUser60_invoker = createInvoker(
    UserCtrl_14.currentUser(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "org.thp.cortex.controllers.UserCtrl",
      "currentUser",
      Nil,
      "GET",
      this.prefix + """api/user/current""",
      """""",
      Seq()
    )
  )

  // @LINE:88
  private[this] lazy val org_thp_cortex_controllers_UserCtrl_find61_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/user")))
  )
  private[this] lazy val org_thp_cortex_controllers_UserCtrl_find61_invoker = createInvoker(
    UserCtrl_14.find(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "org.thp.cortex.controllers.UserCtrl",
      "find",
      Nil,
      "GET",
      this.prefix + """api/user""",
      """""",
      Seq()
    )
  )

  // @LINE:89
  private[this] lazy val org_thp_cortex_controllers_UserCtrl_find62_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/user/_search")))
  )
  private[this] lazy val org_thp_cortex_controllers_UserCtrl_find62_invoker = createInvoker(
    UserCtrl_14.find(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "org.thp.cortex.controllers.UserCtrl",
      "find",
      Nil,
      "POST",
      this.prefix + """api/user/_search""",
      """""",
      Seq()
    )
  )

  // @LINE:90
  private[this] lazy val org_thp_cortex_controllers_UserCtrl_find63_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/organization/user")))
  )
  private[this] lazy val org_thp_cortex_controllers_UserCtrl_find63_invoker = createInvoker(
    UserCtrl_14.find(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "org.thp.cortex.controllers.UserCtrl",
      "find",
      Nil,
      "GET",
      this.prefix + """api/organization/user""",
      """""",
      Seq()
    )
  )

  // @LINE:91
  private[this] lazy val org_thp_cortex_controllers_UserCtrl_find64_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/organization/user/_search")))
  )
  private[this] lazy val org_thp_cortex_controllers_UserCtrl_find64_invoker = createInvoker(
    UserCtrl_14.find(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "org.thp.cortex.controllers.UserCtrl",
      "find",
      Nil,
      "POST",
      this.prefix + """api/organization/user/_search""",
      """""",
      Seq()
    )
  )

  // @LINE:92
  private[this] lazy val org_thp_cortex_controllers_UserCtrl_findForOrganization65_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/organization/"), DynamicPart("organizationId", """[^/]+""",true), StaticPart("/user")))
  )
  private[this] lazy val org_thp_cortex_controllers_UserCtrl_findForOrganization65_invoker = createInvoker(
    UserCtrl_14.findForOrganization(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "org.thp.cortex.controllers.UserCtrl",
      "findForOrganization",
      Seq(classOf[String]),
      "GET",
      this.prefix + """api/organization/""" + "$" + """organizationId<[^/]+>/user""",
      """""",
      Seq()
    )
  )

  // @LINE:93
  private[this] lazy val org_thp_cortex_controllers_UserCtrl_findForOrganization66_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/organization/"), DynamicPart("organizationId", """[^/]+""",true), StaticPart("/user/_search")))
  )
  private[this] lazy val org_thp_cortex_controllers_UserCtrl_findForOrganization66_invoker = createInvoker(
    UserCtrl_14.findForOrganization(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "org.thp.cortex.controllers.UserCtrl",
      "findForOrganization",
      Seq(classOf[String]),
      "POST",
      this.prefix + """api/organization/""" + "$" + """organizationId<[^/]+>/user/_search""",
      """""",
      Seq()
    )
  )

  // @LINE:94
  private[this] lazy val org_thp_cortex_controllers_UserCtrl_create67_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/user")))
  )
  private[this] lazy val org_thp_cortex_controllers_UserCtrl_create67_invoker = createInvoker(
    UserCtrl_14.create(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "org.thp.cortex.controllers.UserCtrl",
      "create",
      Nil,
      "POST",
      this.prefix + """api/user""",
      """""",
      Seq()
    )
  )

  // @LINE:95
  private[this] lazy val org_thp_cortex_controllers_UserCtrl_get68_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/user/"), DynamicPart("userId", """[^/]+""",true)))
  )
  private[this] lazy val org_thp_cortex_controllers_UserCtrl_get68_invoker = createInvoker(
    UserCtrl_14.get(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "org.thp.cortex.controllers.UserCtrl",
      "get",
      Seq(classOf[String]),
      "GET",
      this.prefix + """api/user/""" + "$" + """userId<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:96
  private[this] lazy val org_thp_cortex_controllers_UserCtrl_delete69_route = Route("DELETE",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/user/"), DynamicPart("userId", """[^/]+""",true)))
  )
  private[this] lazy val org_thp_cortex_controllers_UserCtrl_delete69_invoker = createInvoker(
    UserCtrl_14.delete(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "org.thp.cortex.controllers.UserCtrl",
      "delete",
      Seq(classOf[String]),
      "DELETE",
      this.prefix + """api/user/""" + "$" + """userId<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:97
  private[this] lazy val org_thp_cortex_controllers_UserCtrl_update70_route = Route("PATCH",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/user/"), DynamicPart("userId", """[^/]+""",true)))
  )
  private[this] lazy val org_thp_cortex_controllers_UserCtrl_update70_invoker = createInvoker(
    UserCtrl_14.update(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "org.thp.cortex.controllers.UserCtrl",
      "update",
      Seq(classOf[String]),
      "PATCH",
      this.prefix + """api/user/""" + "$" + """userId<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:98
  private[this] lazy val org_thp_cortex_controllers_UserCtrl_setPassword71_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/user/"), DynamicPart("userId", """[^/]+""",true), StaticPart("/password/set")))
  )
  private[this] lazy val org_thp_cortex_controllers_UserCtrl_setPassword71_invoker = createInvoker(
    UserCtrl_14.setPassword(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "org.thp.cortex.controllers.UserCtrl",
      "setPassword",
      Seq(classOf[String]),
      "POST",
      this.prefix + """api/user/""" + "$" + """userId<[^/]+>/password/set""",
      """""",
      Seq()
    )
  )

  // @LINE:99
  private[this] lazy val org_thp_cortex_controllers_UserCtrl_changePassword72_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/user/"), DynamicPart("userId", """[^/]+""",true), StaticPart("/password/change")))
  )
  private[this] lazy val org_thp_cortex_controllers_UserCtrl_changePassword72_invoker = createInvoker(
    UserCtrl_14.changePassword(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "org.thp.cortex.controllers.UserCtrl",
      "changePassword",
      Seq(classOf[String]),
      "POST",
      this.prefix + """api/user/""" + "$" + """userId<[^/]+>/password/change""",
      """""",
      Seq()
    )
  )

  // @LINE:100
  private[this] lazy val org_thp_cortex_controllers_UserCtrl_getKey73_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/user/"), DynamicPart("userId", """[^/]+""",true), StaticPart("/key")))
  )
  private[this] lazy val org_thp_cortex_controllers_UserCtrl_getKey73_invoker = createInvoker(
    UserCtrl_14.getKey(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "org.thp.cortex.controllers.UserCtrl",
      "getKey",
      Seq(classOf[String]),
      "GET",
      this.prefix + """api/user/""" + "$" + """userId<[^/]+>/key""",
      """""",
      Seq()
    )
  )

  // @LINE:101
  private[this] lazy val org_thp_cortex_controllers_UserCtrl_removeKey74_route = Route("DELETE",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/user/"), DynamicPart("userId", """[^/]+""",true), StaticPart("/key")))
  )
  private[this] lazy val org_thp_cortex_controllers_UserCtrl_removeKey74_invoker = createInvoker(
    UserCtrl_14.removeKey(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "org.thp.cortex.controllers.UserCtrl",
      "removeKey",
      Seq(classOf[String]),
      "DELETE",
      this.prefix + """api/user/""" + "$" + """userId<[^/]+>/key""",
      """""",
      Seq()
    )
  )

  // @LINE:102
  private[this] lazy val org_thp_cortex_controllers_UserCtrl_renewKey75_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/user/"), DynamicPart("userId", """[^/]+""",true), StaticPart("/key/renew")))
  )
  private[this] lazy val org_thp_cortex_controllers_UserCtrl_renewKey75_invoker = createInvoker(
    UserCtrl_14.renewKey(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "org.thp.cortex.controllers.UserCtrl",
      "renewKey",
      Seq(classOf[String]),
      "POST",
      this.prefix + """api/user/""" + "$" + """userId<[^/]+>/key/renew""",
      """""",
      Seq()
    )
  )

  // @LINE:104
  private[this] lazy val org_thp_cortex_controllers_OrganizationCtrl_find76_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/organization")))
  )
  private[this] lazy val org_thp_cortex_controllers_OrganizationCtrl_find76_invoker = createInvoker(
    OrganizationCtrl_11.find,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "org.thp.cortex.controllers.OrganizationCtrl",
      "find",
      Nil,
      "GET",
      this.prefix + """api/organization""",
      """""",
      Seq()
    )
  )

  // @LINE:105
  private[this] lazy val org_thp_cortex_controllers_OrganizationCtrl_find77_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/organization/_search")))
  )
  private[this] lazy val org_thp_cortex_controllers_OrganizationCtrl_find77_invoker = createInvoker(
    OrganizationCtrl_11.find,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "org.thp.cortex.controllers.OrganizationCtrl",
      "find",
      Nil,
      "POST",
      this.prefix + """api/organization/_search""",
      """""",
      Seq()
    )
  )

  // @LINE:106
  private[this] lazy val org_thp_cortex_controllers_OrganizationCtrl_stats78_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/organization/_stats")))
  )
  private[this] lazy val org_thp_cortex_controllers_OrganizationCtrl_stats78_invoker = createInvoker(
    OrganizationCtrl_11.stats,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "org.thp.cortex.controllers.OrganizationCtrl",
      "stats",
      Nil,
      "POST",
      this.prefix + """api/organization/_stats""",
      """""",
      Seq()
    )
  )

  // @LINE:107
  private[this] lazy val org_thp_cortex_controllers_OrganizationCtrl_get79_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/organization/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val org_thp_cortex_controllers_OrganizationCtrl_get79_invoker = createInvoker(
    OrganizationCtrl_11.get(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "org.thp.cortex.controllers.OrganizationCtrl",
      "get",
      Seq(classOf[String]),
      "GET",
      this.prefix + """api/organization/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:108
  private[this] lazy val org_thp_cortex_controllers_OrganizationCtrl_create80_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/organization")))
  )
  private[this] lazy val org_thp_cortex_controllers_OrganizationCtrl_create80_invoker = createInvoker(
    OrganizationCtrl_11.create,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "org.thp.cortex.controllers.OrganizationCtrl",
      "create",
      Nil,
      "POST",
      this.prefix + """api/organization""",
      """""",
      Seq()
    )
  )

  // @LINE:109
  private[this] lazy val org_thp_cortex_controllers_OrganizationCtrl_update81_route = Route("PATCH",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/organization/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val org_thp_cortex_controllers_OrganizationCtrl_update81_invoker = createInvoker(
    OrganizationCtrl_11.update(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "org.thp.cortex.controllers.OrganizationCtrl",
      "update",
      Seq(classOf[String]),
      "PATCH",
      this.prefix + """api/organization/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:110
  private[this] lazy val org_thp_cortex_controllers_OrganizationCtrl_delete82_route = Route("DELETE",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/organization/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val org_thp_cortex_controllers_OrganizationCtrl_delete82_invoker = createInvoker(
    OrganizationCtrl_11.delete(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "org.thp.cortex.controllers.OrganizationCtrl",
      "delete",
      Seq(classOf[String]),
      "DELETE",
      this.prefix + """api/organization/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:112
  private[this] lazy val org_thp_cortex_controllers_AssetCtrl_get83_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val org_thp_cortex_controllers_AssetCtrl_get83_invoker = createInvoker(
    AssetCtrl_12.get(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "org.thp.cortex.controllers.AssetCtrl",
      "get",
      Seq(classOf[String]),
      "GET",
      this.prefix + """""" + "$" + """file<.+>""",
      """""",
      Seq()
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:6
    case org_thp_cortex_controllers_Home_redirect0_route(params@_) =>
      call { 
        org_thp_cortex_controllers_Home_redirect0_invoker.call(Home_8.redirect)
      }
  
    // @LINE:7
    case org_thp_cortex_controllers_StatusCtrl_health1_route(params@_) =>
      call { 
        org_thp_cortex_controllers_StatusCtrl_health1_invoker.call(StatusCtrl_1.health)
      }
  
    // @LINE:8
    case org_thp_cortex_controllers_AuthenticationCtrl_logout2_route(params@_) =>
      call { 
        org_thp_cortex_controllers_AuthenticationCtrl_logout2_invoker.call(AuthenticationCtrl_9.logout())
      }
  
    // @LINE:9
    case org_thp_cortex_controllers_AuthenticationCtrl_login3_route(params@_) =>
      call { 
        org_thp_cortex_controllers_AuthenticationCtrl_login3_invoker.call(AuthenticationCtrl_9.login())
      }
  
    // @LINE:10
    case org_thp_cortex_controllers_AuthenticationCtrl_ssoLogin4_route(params@_) =>
      call { 
        org_thp_cortex_controllers_AuthenticationCtrl_ssoLogin4_invoker.call(AuthenticationCtrl_9.ssoLogin())
      }
  
    // @LINE:11
    case org_thp_cortex_controllers_AuthenticationCtrl_ssoLogin5_route(params@_) =>
      call { 
        org_thp_cortex_controllers_AuthenticationCtrl_ssoLogin5_invoker.call(AuthenticationCtrl_9.ssoLogin())
      }
  
    // @LINE:15
    case org_thp_cortex_controllers_StatusCtrl_get6_route(params@_) =>
      call { 
        org_thp_cortex_controllers_StatusCtrl_get6_invoker.call(StatusCtrl_1.get)
      }
  
    // @LINE:16
    case org_thp_cortex_controllers_StatusCtrl_getAlerts7_route(params@_) =>
      call { 
        org_thp_cortex_controllers_StatusCtrl_getAlerts7_invoker.call(StatusCtrl_1.getAlerts)
      }
  
    // @LINE:17
    case org_thp_cortex_controllers_AnalyzerCtrl_find8_route(params@_) =>
      call { 
        org_thp_cortex_controllers_AnalyzerCtrl_find8_invoker.call(AnalyzerCtrl_10.find)
      }
  
    // @LINE:18
    case org_thp_cortex_controllers_AnalyzerCtrl_find9_route(params@_) =>
      call { 
        org_thp_cortex_controllers_AnalyzerCtrl_find9_invoker.call(AnalyzerCtrl_10.find)
      }
  
    // @LINE:19
    case org_thp_cortex_controllers_AnalyzerCtrl_get10_route(params@_) =>
      call(params.fromPath[String]("id", None)) { (id) =>
        org_thp_cortex_controllers_AnalyzerCtrl_get10_invoker.call(AnalyzerCtrl_10.get(id))
      }
  
    // @LINE:20
    case org_thp_cortex_controllers_AnalyzerCtrl_listForType11_route(params@_) =>
      call(params.fromPath[String]("dataType", None)) { (dataType) =>
        org_thp_cortex_controllers_AnalyzerCtrl_listForType11_invoker.call(AnalyzerCtrl_10.listForType(dataType))
      }
  
    // @LINE:21
    case org_thp_cortex_controllers_JobCtrl_createAnalyzerJob12_route(params@_) =>
      call(params.fromPath[String]("id", None)) { (id) =>
        org_thp_cortex_controllers_JobCtrl_createAnalyzerJob12_invoker.call(JobCtrl_0.createAnalyzerJob(id))
      }
  
    // @LINE:23
    case org_thp_cortex_controllers_ResponderCtrl_find13_route(params@_) =>
      call { 
        org_thp_cortex_controllers_ResponderCtrl_find13_invoker.call(ResponderCtrl_2.find)
      }
  
    // @LINE:24
    case org_thp_cortex_controllers_ResponderCtrl_find14_route(params@_) =>
      call { 
        org_thp_cortex_controllers_ResponderCtrl_find14_invoker.call(ResponderCtrl_2.find)
      }
  
    // @LINE:25
    case org_thp_cortex_controllers_ResponderCtrl_get15_route(params@_) =>
      call(params.fromPath[String]("id", None)) { (id) =>
        org_thp_cortex_controllers_ResponderCtrl_get15_invoker.call(ResponderCtrl_2.get(id))
      }
  
    // @LINE:26
    case org_thp_cortex_controllers_ResponderCtrl_listForType16_route(params@_) =>
      call(params.fromPath[String]("dataType", None)) { (dataType) =>
        org_thp_cortex_controllers_ResponderCtrl_listForType16_invoker.call(ResponderCtrl_2.listForType(dataType))
      }
  
    // @LINE:27
    case org_thp_cortex_controllers_JobCtrl_createResponderJob17_route(params@_) =>
      call(params.fromPath[String]("id", None)) { (id) =>
        org_thp_cortex_controllers_JobCtrl_createResponderJob17_invoker.call(JobCtrl_0.createResponderJob(id))
      }
  
    // @LINE:29
    case org_thp_cortex_controllers_JobCtrl_waitReport18_route(params@_) =>
      call(params.fromPath[String]("id", None), params.fromQuery[String]("atMost", Some("1minute"))) { (id, atMost) =>
        org_thp_cortex_controllers_JobCtrl_waitReport18_invoker.call(JobCtrl_0.waitReport(id, atMost))
      }
  
    // @LINE:32
    case org_thp_cortex_controllers_MispCtrl_modules19_route(params@_) =>
      call { 
        org_thp_cortex_controllers_MispCtrl_modules19_invoker.call(MispCtrl_4.modules)
      }
  
    // @LINE:33
    case org_thp_cortex_controllers_MispCtrl_query20_route(params@_) =>
      call { 
        org_thp_cortex_controllers_MispCtrl_query20_invoker.call(MispCtrl_4.query)
      }
  
    // @LINE:36
    case org_thp_cortex_controllers_JobCtrl_listArtifacts21_route(params@_) =>
      call(params.fromPath[String]("id", None)) { (id) =>
        org_thp_cortex_controllers_JobCtrl_listArtifacts21_invoker.call(JobCtrl_0.listArtifacts(id))
      }
  
    // @LINE:38
    case org_thp_cortex_controllers_AnalyzerCtrl_delete22_route(params@_) =>
      call(params.fromPath[String]("id", None)) { (id) =>
        org_thp_cortex_controllers_AnalyzerCtrl_delete22_invoker.call(AnalyzerCtrl_10.delete(id))
      }
  
    // @LINE:39
    case org_thp_cortex_controllers_AnalyzerCtrl_update23_route(params@_) =>
      call(params.fromPath[String]("id", None)) { (id) =>
        org_thp_cortex_controllers_AnalyzerCtrl_update23_invoker.call(AnalyzerCtrl_10.update(id))
      }
  
    // @LINE:40
    case org_thp_cortex_controllers_AnalyzerCtrl_listDefinitions24_route(params@_) =>
      call { 
        org_thp_cortex_controllers_AnalyzerCtrl_listDefinitions24_invoker.call(AnalyzerCtrl_10.listDefinitions)
      }
  
    // @LINE:41
    case org_thp_cortex_controllers_AnalyzerCtrl_scan25_route(params@_) =>
      call { 
        org_thp_cortex_controllers_AnalyzerCtrl_scan25_invoker.call(AnalyzerCtrl_10.scan)
      }
  
    // @LINE:42
    case org_thp_cortex_controllers_AnalyzerCtrl_find26_route(params@_) =>
      call { 
        org_thp_cortex_controllers_AnalyzerCtrl_find26_invoker.call(AnalyzerCtrl_10.find)
      }
  
    // @LINE:43
    case org_thp_cortex_controllers_AnalyzerCtrl_find27_route(params@_) =>
      call { 
        org_thp_cortex_controllers_AnalyzerCtrl_find27_invoker.call(AnalyzerCtrl_10.find)
      }
  
    // @LINE:44
    case org_thp_cortex_controllers_AnalyzerCtrl_create28_route(params@_) =>
      call(params.fromPath[String]("analyzerId", None)) { (analyzerId) =>
        org_thp_cortex_controllers_AnalyzerCtrl_create28_invoker.call(AnalyzerCtrl_10.create(analyzerId))
      }
  
    // @LINE:46
    case org_thp_cortex_controllers_ResponderCtrl_delete29_route(params@_) =>
      call(params.fromPath[String]("id", None)) { (id) =>
        org_thp_cortex_controllers_ResponderCtrl_delete29_invoker.call(ResponderCtrl_2.delete(id))
      }
  
    // @LINE:47
    case org_thp_cortex_controllers_ResponderCtrl_update30_route(params@_) =>
      call(params.fromPath[String]("id", None)) { (id) =>
        org_thp_cortex_controllers_ResponderCtrl_update30_invoker.call(ResponderCtrl_2.update(id))
      }
  
    // @LINE:48
    case org_thp_cortex_controllers_ResponderCtrl_listDefinitions31_route(params@_) =>
      call { 
        org_thp_cortex_controllers_ResponderCtrl_listDefinitions31_invoker.call(ResponderCtrl_2.listDefinitions)
      }
  
    // @LINE:49
    case org_thp_cortex_controllers_ResponderCtrl_scan32_route(params@_) =>
      call { 
        org_thp_cortex_controllers_ResponderCtrl_scan32_invoker.call(ResponderCtrl_2.scan)
      }
  
    // @LINE:50
    case org_thp_cortex_controllers_ResponderCtrl_find33_route(params@_) =>
      call { 
        org_thp_cortex_controllers_ResponderCtrl_find33_invoker.call(ResponderCtrl_2.find)
      }
  
    // @LINE:51
    case org_thp_cortex_controllers_ResponderCtrl_find34_route(params@_) =>
      call { 
        org_thp_cortex_controllers_ResponderCtrl_find34_invoker.call(ResponderCtrl_2.find)
      }
  
    // @LINE:52
    case org_thp_cortex_controllers_ResponderCtrl_create35_route(params@_) =>
      call(params.fromPath[String]("responderId", None)) { (responderId) =>
        org_thp_cortex_controllers_ResponderCtrl_create35_invoker.call(ResponderCtrl_2.create(responderId))
      }
  
    // @LINE:55
    case org_thp_cortex_controllers_AnalyzerConfigCtrl_get36_route(params@_) =>
      call(params.fromPath[String]("analyzerConfigName", None)) { (analyzerConfigName) =>
        org_thp_cortex_controllers_AnalyzerConfigCtrl_get36_invoker.call(AnalyzerConfigCtrl_5.get(analyzerConfigName))
      }
  
    // @LINE:56
    case org_thp_cortex_controllers_AnalyzerConfigCtrl_list37_route(params@_) =>
      call { 
        org_thp_cortex_controllers_AnalyzerConfigCtrl_list37_invoker.call(AnalyzerConfigCtrl_5.list)
      }
  
    // @LINE:57
    case org_thp_cortex_controllers_AnalyzerConfigCtrl_update38_route(params@_) =>
      call(params.fromPath[String]("analyzerConfigName", None)) { (analyzerConfigName) =>
        org_thp_cortex_controllers_AnalyzerConfigCtrl_update38_invoker.call(AnalyzerConfigCtrl_5.update(analyzerConfigName))
      }
  
    // @LINE:59
    case org_thp_cortex_controllers_ResponderConfigCtrl_get39_route(params@_) =>
      call(params.fromPath[String]("responderConfigName", None)) { (responderConfigName) =>
        org_thp_cortex_controllers_ResponderConfigCtrl_get39_invoker.call(ResponderConfigCtrl_13.get(responderConfigName))
      }
  
    // @LINE:60
    case org_thp_cortex_controllers_ResponderConfigCtrl_list40_route(params@_) =>
      call { 
        org_thp_cortex_controllers_ResponderConfigCtrl_list40_invoker.call(ResponderConfigCtrl_13.list)
      }
  
    // @LINE:61
    case org_thp_cortex_controllers_ResponderConfigCtrl_update41_route(params@_) =>
      call(params.fromPath[String]("responderConfigName", None)) { (responderConfigName) =>
        org_thp_cortex_controllers_ResponderConfigCtrl_update41_invoker.call(ResponderConfigCtrl_13.update(responderConfigName))
      }
  
    // @LINE:64
    case org_thp_cortex_controllers_JobCtrl_list42_route(params@_) =>
      call(params.fromQuery[Option[String]]("dataTypeFilter", None), params.fromQuery[Option[String]]("dataFilter", None), params.fromQuery[Option[String]]("analyzerFilter", None), params.fromQuery[Option[String]]("range", None)) { (dataTypeFilter, dataFilter, analyzerFilter, range) =>
        org_thp_cortex_controllers_JobCtrl_list42_invoker.call(JobCtrl_0.list(dataTypeFilter, dataFilter, analyzerFilter, range))
      }
  
    // @LINE:65
    case org_thp_cortex_controllers_JobCtrl_find43_route(params@_) =>
      call { 
        org_thp_cortex_controllers_JobCtrl_find43_invoker.call(JobCtrl_0.find)
      }
  
    // @LINE:66
    case org_thp_cortex_controllers_JobCtrl_delete44_route(params@_) =>
      call(params.fromPath[String]("id", None)) { (id) =>
        org_thp_cortex_controllers_JobCtrl_delete44_invoker.call(JobCtrl_0.delete(id))
      }
  
    // @LINE:67
    case org_thp_cortex_controllers_JobCtrl_get45_route(params@_) =>
      call(params.fromPath[String]("id", None)) { (id) =>
        org_thp_cortex_controllers_JobCtrl_get45_invoker.call(JobCtrl_0.get(id))
      }
  
    // @LINE:68
    case org_thp_cortex_controllers_JobCtrl_report46_route(params@_) =>
      call(params.fromPath[String]("id", None)) { (id) =>
        org_thp_cortex_controllers_JobCtrl_report46_invoker.call(JobCtrl_0.report(id))
      }
  
    // @LINE:69
    case org_thp_cortex_controllers_JobCtrl_getJobStatus47_route(params@_) =>
      call { 
        org_thp_cortex_controllers_JobCtrl_getJobStatus47_invoker.call(JobCtrl_0.getJobStatus)
      }
  
    // @LINE:72
    case org_thp_cortex_controllers_StreamCtrl_create48_route(params@_) =>
      call { 
        org_thp_cortex_controllers_StreamCtrl_create48_invoker.call(StreamCtrl_7.create())
      }
  
    // @LINE:73
    case org_thp_cortex_controllers_StreamCtrl_status49_route(params@_) =>
      call { 
        org_thp_cortex_controllers_StreamCtrl_status49_invoker.call(StreamCtrl_7.status)
      }
  
    // @LINE:74
    case org_thp_cortex_controllers_StreamCtrl_get50_route(params@_) =>
      call(params.fromPath[String]("streamId", None)) { (streamId) =>
        org_thp_cortex_controllers_StreamCtrl_get50_invoker.call(StreamCtrl_7.get(streamId))
      }
  
    // @LINE:76
    case org_elastic4play_controllers_MigrationCtrl_migrate51_route(params@_) =>
      call { 
        org_elastic4play_controllers_MigrationCtrl_migrate51_invoker.call(MigrationCtrl_15.migrate)
      }
  
    // @LINE:77
    case org_thp_cortex_controllers_AttachmentCtrl_download52_route(params@_) =>
      call(params.fromPath[String]("hash", None), params.fromQuery[Option[String]]("name", None)) { (hash, name) =>
        org_thp_cortex_controllers_AttachmentCtrl_download52_invoker.call(AttachmentCtrl_6.download(hash, name))
      }
  
    // @LINE:78
    case org_thp_cortex_controllers_AttachmentCtrl_downloadZip53_route(params@_) =>
      call(params.fromPath[String]("hash", None), params.fromQuery[Option[String]]("name", None)) { (hash, name) =>
        org_thp_cortex_controllers_AttachmentCtrl_downloadZip53_invoker.call(AttachmentCtrl_6.downloadZip(hash, name))
      }
  
    // @LINE:80
    case org_thp_cortex_controllers_DBListCtrl_list54_route(params@_) =>
      call { 
        org_thp_cortex_controllers_DBListCtrl_list54_invoker.call(DBListCtrl_3.list())
      }
  
    // @LINE:81
    case org_thp_cortex_controllers_DBListCtrl_deleteItem55_route(params@_) =>
      call(params.fromPath[String]("itemId", None)) { (itemId) =>
        org_thp_cortex_controllers_DBListCtrl_deleteItem55_invoker.call(DBListCtrl_3.deleteItem(itemId))
      }
  
    // @LINE:82
    case org_thp_cortex_controllers_DBListCtrl_updateItem56_route(params@_) =>
      call(params.fromPath[String]("itemId", None)) { (itemId) =>
        org_thp_cortex_controllers_DBListCtrl_updateItem56_invoker.call(DBListCtrl_3.updateItem(itemId))
      }
  
    // @LINE:83
    case org_thp_cortex_controllers_DBListCtrl_addItem57_route(params@_) =>
      call(params.fromPath[String]("listName", None)) { (listName) =>
        org_thp_cortex_controllers_DBListCtrl_addItem57_invoker.call(DBListCtrl_3.addItem(listName))
      }
  
    // @LINE:84
    case org_thp_cortex_controllers_DBListCtrl_listItems58_route(params@_) =>
      call(params.fromPath[String]("listName", None)) { (listName) =>
        org_thp_cortex_controllers_DBListCtrl_listItems58_invoker.call(DBListCtrl_3.listItems(listName))
      }
  
    // @LINE:85
    case org_thp_cortex_controllers_DBListCtrl_itemExists59_route(params@_) =>
      call(params.fromPath[String]("listName", None)) { (listName) =>
        org_thp_cortex_controllers_DBListCtrl_itemExists59_invoker.call(DBListCtrl_3.itemExists(listName))
      }
  
    // @LINE:87
    case org_thp_cortex_controllers_UserCtrl_currentUser60_route(params@_) =>
      call { 
        org_thp_cortex_controllers_UserCtrl_currentUser60_invoker.call(UserCtrl_14.currentUser())
      }
  
    // @LINE:88
    case org_thp_cortex_controllers_UserCtrl_find61_route(params@_) =>
      call { 
        org_thp_cortex_controllers_UserCtrl_find61_invoker.call(UserCtrl_14.find())
      }
  
    // @LINE:89
    case org_thp_cortex_controllers_UserCtrl_find62_route(params@_) =>
      call { 
        org_thp_cortex_controllers_UserCtrl_find62_invoker.call(UserCtrl_14.find())
      }
  
    // @LINE:90
    case org_thp_cortex_controllers_UserCtrl_find63_route(params@_) =>
      call { 
        org_thp_cortex_controllers_UserCtrl_find63_invoker.call(UserCtrl_14.find())
      }
  
    // @LINE:91
    case org_thp_cortex_controllers_UserCtrl_find64_route(params@_) =>
      call { 
        org_thp_cortex_controllers_UserCtrl_find64_invoker.call(UserCtrl_14.find())
      }
  
    // @LINE:92
    case org_thp_cortex_controllers_UserCtrl_findForOrganization65_route(params@_) =>
      call(params.fromPath[String]("organizationId", None)) { (organizationId) =>
        org_thp_cortex_controllers_UserCtrl_findForOrganization65_invoker.call(UserCtrl_14.findForOrganization(organizationId))
      }
  
    // @LINE:93
    case org_thp_cortex_controllers_UserCtrl_findForOrganization66_route(params@_) =>
      call(params.fromPath[String]("organizationId", None)) { (organizationId) =>
        org_thp_cortex_controllers_UserCtrl_findForOrganization66_invoker.call(UserCtrl_14.findForOrganization(organizationId))
      }
  
    // @LINE:94
    case org_thp_cortex_controllers_UserCtrl_create67_route(params@_) =>
      call { 
        org_thp_cortex_controllers_UserCtrl_create67_invoker.call(UserCtrl_14.create())
      }
  
    // @LINE:95
    case org_thp_cortex_controllers_UserCtrl_get68_route(params@_) =>
      call(params.fromPath[String]("userId", None)) { (userId) =>
        org_thp_cortex_controllers_UserCtrl_get68_invoker.call(UserCtrl_14.get(userId))
      }
  
    // @LINE:96
    case org_thp_cortex_controllers_UserCtrl_delete69_route(params@_) =>
      call(params.fromPath[String]("userId", None)) { (userId) =>
        org_thp_cortex_controllers_UserCtrl_delete69_invoker.call(UserCtrl_14.delete(userId))
      }
  
    // @LINE:97
    case org_thp_cortex_controllers_UserCtrl_update70_route(params@_) =>
      call(params.fromPath[String]("userId", None)) { (userId) =>
        org_thp_cortex_controllers_UserCtrl_update70_invoker.call(UserCtrl_14.update(userId))
      }
  
    // @LINE:98
    case org_thp_cortex_controllers_UserCtrl_setPassword71_route(params@_) =>
      call(params.fromPath[String]("userId", None)) { (userId) =>
        org_thp_cortex_controllers_UserCtrl_setPassword71_invoker.call(UserCtrl_14.setPassword(userId))
      }
  
    // @LINE:99
    case org_thp_cortex_controllers_UserCtrl_changePassword72_route(params@_) =>
      call(params.fromPath[String]("userId", None)) { (userId) =>
        org_thp_cortex_controllers_UserCtrl_changePassword72_invoker.call(UserCtrl_14.changePassword(userId))
      }
  
    // @LINE:100
    case org_thp_cortex_controllers_UserCtrl_getKey73_route(params@_) =>
      call(params.fromPath[String]("userId", None)) { (userId) =>
        org_thp_cortex_controllers_UserCtrl_getKey73_invoker.call(UserCtrl_14.getKey(userId))
      }
  
    // @LINE:101
    case org_thp_cortex_controllers_UserCtrl_removeKey74_route(params@_) =>
      call(params.fromPath[String]("userId", None)) { (userId) =>
        org_thp_cortex_controllers_UserCtrl_removeKey74_invoker.call(UserCtrl_14.removeKey(userId))
      }
  
    // @LINE:102
    case org_thp_cortex_controllers_UserCtrl_renewKey75_route(params@_) =>
      call(params.fromPath[String]("userId", None)) { (userId) =>
        org_thp_cortex_controllers_UserCtrl_renewKey75_invoker.call(UserCtrl_14.renewKey(userId))
      }
  
    // @LINE:104
    case org_thp_cortex_controllers_OrganizationCtrl_find76_route(params@_) =>
      call { 
        org_thp_cortex_controllers_OrganizationCtrl_find76_invoker.call(OrganizationCtrl_11.find)
      }
  
    // @LINE:105
    case org_thp_cortex_controllers_OrganizationCtrl_find77_route(params@_) =>
      call { 
        org_thp_cortex_controllers_OrganizationCtrl_find77_invoker.call(OrganizationCtrl_11.find)
      }
  
    // @LINE:106
    case org_thp_cortex_controllers_OrganizationCtrl_stats78_route(params@_) =>
      call { 
        org_thp_cortex_controllers_OrganizationCtrl_stats78_invoker.call(OrganizationCtrl_11.stats)
      }
  
    // @LINE:107
    case org_thp_cortex_controllers_OrganizationCtrl_get79_route(params@_) =>
      call(params.fromPath[String]("id", None)) { (id) =>
        org_thp_cortex_controllers_OrganizationCtrl_get79_invoker.call(OrganizationCtrl_11.get(id))
      }
  
    // @LINE:108
    case org_thp_cortex_controllers_OrganizationCtrl_create80_route(params@_) =>
      call { 
        org_thp_cortex_controllers_OrganizationCtrl_create80_invoker.call(OrganizationCtrl_11.create)
      }
  
    // @LINE:109
    case org_thp_cortex_controllers_OrganizationCtrl_update81_route(params@_) =>
      call(params.fromPath[String]("id", None)) { (id) =>
        org_thp_cortex_controllers_OrganizationCtrl_update81_invoker.call(OrganizationCtrl_11.update(id))
      }
  
    // @LINE:110
    case org_thp_cortex_controllers_OrganizationCtrl_delete82_route(params@_) =>
      call(params.fromPath[String]("id", None)) { (id) =>
        org_thp_cortex_controllers_OrganizationCtrl_delete82_invoker.call(OrganizationCtrl_11.delete(id))
      }
  
    // @LINE:112
    case org_thp_cortex_controllers_AssetCtrl_get83_route(params@_) =>
      call(params.fromPath[String]("file", None)) { (file) =>
        org_thp_cortex_controllers_AssetCtrl_get83_invoker.call(AssetCtrl_12.get(file))
      }
  }
}
