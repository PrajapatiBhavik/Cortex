// @GENERATOR:play-routes-compiler
// @SOURCE:conf/routes

import play.api.mvc.Call


import _root_.controllers.Assets.Asset

// @LINE:6
package org.thp.cortex.controllers {

  // @LINE:80
  class ReverseDBListCtrl(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:82
    def updateItem(itemId:String): Call = {
      
      Call("PATCH", _prefix + { _defaultPrefix } + "api/list/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("itemId", itemId)))
    }
  
    // @LINE:83
    def addItem(listName:String): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "api/list/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("listName", listName)))
    }
  
    // @LINE:81
    def deleteItem(itemId:String): Call = {
      
      Call("DELETE", _prefix + { _defaultPrefix } + "api/list/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("itemId", itemId)))
    }
  
    // @LINE:80
    def list(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "api/list")
    }
  
    // @LINE:85
    def itemExists(listName:String): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "api/list/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("listName", listName)) + "/_exists")
    }
  
    // @LINE:84
    def listItems(listName:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "api/list/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("listName", listName)))
    }
  
  }

  // @LINE:104
  class ReverseOrganizationCtrl(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:108
    def create: Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "api/organization")
    }
  
    // @LINE:104
    def find: Call = {
    
      () match {
      
        // @LINE:104
        case ()  =>
          
          Call("GET", _prefix + { _defaultPrefix } + "api/organization")
      
      }
    
    }
  
    // @LINE:106
    def stats: Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "api/organization/_stats")
    }
  
    // @LINE:110
    def delete(id:String): Call = {
      
      Call("DELETE", _prefix + { _defaultPrefix } + "api/organization/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("id", id)))
    }
  
    // @LINE:109
    def update(id:String): Call = {
      
      Call("PATCH", _prefix + { _defaultPrefix } + "api/organization/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("id", id)))
    }
  
    // @LINE:107
    def get(id:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "api/organization/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("id", id)))
    }
  
  }

  // @LINE:7
  class ReverseStatusCtrl(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:7
    def health: Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "api/health")
    }
  
    // @LINE:15
    def get: Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "api/status")
    }
  
    // @LINE:16
    def getAlerts: Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "api/alert")
    }
  
  }

  // @LINE:59
  class ReverseResponderConfigCtrl(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:59
    def get(responderConfigName:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "api/responderconfig/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("responderConfigName", responderConfigName)))
    }
  
    // @LINE:60
    def list: Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "api/responderconfig")
    }
  
    // @LINE:61
    def update(responderConfigName:String): Call = {
      
      Call("PATCH", _prefix + { _defaultPrefix } + "api/responderconfig/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("responderConfigName", responderConfigName)))
    }
  
  }

  // @LINE:87
  class ReverseUserCtrl(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:92
    def findForOrganization(organizationId:String): Call = {
    
      (organizationId: @unchecked) match {
      
        // @LINE:92
        case (organizationId)  =>
          
          Call("GET", _prefix + { _defaultPrefix } + "api/organization/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("organizationId", organizationId)) + "/user")
      
      }
    
    }
  
    // @LINE:101
    def removeKey(userId:String): Call = {
      
      Call("DELETE", _prefix + { _defaultPrefix } + "api/user/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("userId", userId)) + "/key")
    }
  
    // @LINE:94
    def create(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "api/user")
    }
  
    // @LINE:88
    def find(): Call = {
    
      () match {
      
        // @LINE:88
        case ()  =>
          
          Call("GET", _prefix + { _defaultPrefix } + "api/user")
      
      }
    
    }
  
    // @LINE:98
    def setPassword(userId:String): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "api/user/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("userId", userId)) + "/password/set")
    }
  
    // @LINE:102
    def renewKey(userId:String): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "api/user/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("userId", userId)) + "/key/renew")
    }
  
    // @LINE:87
    def currentUser(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "api/user/current")
    }
  
    // @LINE:99
    def changePassword(userId:String): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "api/user/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("userId", userId)) + "/password/change")
    }
  
    // @LINE:96
    def delete(userId:String): Call = {
      
      Call("DELETE", _prefix + { _defaultPrefix } + "api/user/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("userId", userId)))
    }
  
    // @LINE:100
    def getKey(userId:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "api/user/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("userId", userId)) + "/key")
    }
  
    // @LINE:97
    def update(userId:String): Call = {
      
      Call("PATCH", _prefix + { _defaultPrefix } + "api/user/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("userId", userId)))
    }
  
    // @LINE:95
    def get(userId:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "api/user/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("userId", userId)))
    }
  
  }

  // @LINE:72
  class ReverseStreamCtrl(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:72
    def create(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "api/stream")
    }
  
    // @LINE:73
    def status: Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "api/stream/status")
    }
  
    // @LINE:74
    def get(streamId:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "api/stream/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("streamId", streamId)))
    }
  
  }

  // @LINE:77
  class ReverseAttachmentCtrl(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:77
    def download(hash:String, name:Option[String]): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "api/datastore/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("hash", hash)) + play.core.routing.queryString(List(Some(implicitly[play.api.mvc.QueryStringBindable[Option[String]]].unbind("name", name)))))
    }
  
    // @LINE:78
    def downloadZip(hash:String, name:Option[String]): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "api/datastorezip/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("hash", hash)) + play.core.routing.queryString(List(Some(implicitly[play.api.mvc.QueryStringBindable[Option[String]]].unbind("name", name)))))
    }
  
  }

  // @LINE:23
  class ReverseResponderCtrl(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:23
    def find: Call = {
    
      () match {
      
        // @LINE:23
        case ()  =>
          
          Call("GET", _prefix + { _defaultPrefix } + "api/responder")
      
      }
    
    }
  
    // @LINE:26
    def listForType(dataType:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "api/responder/type/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("dataType", dataType)))
    }
  
    // @LINE:49
    def scan: Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "api/responderdefinition/scan")
    }
  
    // @LINE:52
    def create(responderId:String): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "api/organization/responder/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("responderId", responderId)))
    }
  
    // @LINE:46
    def delete(id:String): Call = {
      
      Call("DELETE", _prefix + { _defaultPrefix } + "api/responder/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("id", id)))
    }
  
    // @LINE:47
    def update(id:String): Call = {
      
      Call("PATCH", _prefix + { _defaultPrefix } + "api/responder/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("id", id)))
    }
  
    // @LINE:25
    def get(id:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "api/responder/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("id", id)))
    }
  
    // @LINE:48
    def listDefinitions: Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "api/responderdefinition")
    }
  
  }

  // @LINE:17
  class ReverseAnalyzerCtrl(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:17
    def find: Call = {
    
      () match {
      
        // @LINE:17
        case ()  =>
          
          Call("GET", _prefix + { _defaultPrefix } + "api/analyzer")
      
      }
    
    }
  
    // @LINE:20
    def listForType(dataType:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "api/analyzer/type/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("dataType", dataType)))
    }
  
    // @LINE:41
    def scan: Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "api/analyzerdefinition/scan")
    }
  
    // @LINE:44
    def create(analyzerId:String): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "api/organization/analyzer/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("analyzerId", analyzerId)))
    }
  
    // @LINE:38
    def delete(id:String): Call = {
      
      Call("DELETE", _prefix + { _defaultPrefix } + "api/analyzer/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("id", id)))
    }
  
    // @LINE:39
    def update(id:String): Call = {
      
      Call("PATCH", _prefix + { _defaultPrefix } + "api/analyzer/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("id", id)))
    }
  
    // @LINE:19
    def get(id:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "api/analyzer/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("id", id)))
    }
  
    // @LINE:40
    def listDefinitions: Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "api/analyzerdefinition")
    }
  
  }

  // @LINE:112
  class ReverseAssetCtrl(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:112
    def get(file:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + implicitly[play.api.mvc.PathBindable[String]].unbind("file", file))
    }
  
  }

  // @LINE:55
  class ReverseAnalyzerConfigCtrl(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:55
    def get(analyzerConfigName:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "api/analyzerconfig/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("analyzerConfigName", analyzerConfigName)))
    }
  
    // @LINE:56
    def list: Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "api/analyzerconfig")
    }
  
    // @LINE:57
    def update(analyzerConfigName:String): Call = {
      
      Call("PATCH", _prefix + { _defaultPrefix } + "api/analyzerconfig/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("analyzerConfigName", analyzerConfigName)))
    }
  
  }

  // @LINE:6
  class ReverseHome(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:6
    def redirect: Call = {
      
      Call("GET", _prefix)
    }
  
  }

  // @LINE:32
  class ReverseMispCtrl(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:32
    def modules: Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "modules")
    }
  
    // @LINE:33
    def query: Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "query")
    }
  
  }

  // @LINE:8
  class ReverseAuthenticationCtrl(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:8
    def logout(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "api/logout")
    }
  
    // @LINE:9
    def login(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "api/login")
    }
  
    // @LINE:10
    def ssoLogin(): Call = {
    
      () match {
      
        // @LINE:10
        case ()  =>
          
          Call("GET", _prefix + { _defaultPrefix } + "api/ssoLogin")
      
      }
    
    }
  
  }

  // @LINE:21
  class ReverseJobCtrl(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:27
    def createResponderJob(id:String): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "api/responder/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("id", id)) + "/run")
    }
  
    // @LINE:65
    def find: Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "api/job/_search")
    }
  
    // @LINE:69
    def getJobStatus: Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "api/job/status")
    }
  
    // @LINE:29
    def waitReport(id:String, atMost:String = "1minute"): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "api/job/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("id", id)) + "/waitreport" + play.core.routing.queryString(List(if(atMost == "1minute") None else Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("atMost", atMost)))))
    }
  
    // @LINE:21
    def createAnalyzerJob(id:String): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "api/analyzer/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("id", id)) + "/run")
    }
  
    // @LINE:66
    def delete(id:String): Call = {
      
      Call("DELETE", _prefix + { _defaultPrefix } + "api/job/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("id", id)))
    }
  
    // @LINE:36
    def listArtifacts(id:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "api/job/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("id", id)) + "/artifacts")
    }
  
    // @LINE:64
    def list(dataTypeFilter:Option[String], dataFilter:Option[String], analyzerFilter:Option[String], range:Option[String]): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "api/job" + play.core.routing.queryString(List(Some(implicitly[play.api.mvc.QueryStringBindable[Option[String]]].unbind("dataTypeFilter", dataTypeFilter)), Some(implicitly[play.api.mvc.QueryStringBindable[Option[String]]].unbind("dataFilter", dataFilter)), Some(implicitly[play.api.mvc.QueryStringBindable[Option[String]]].unbind("analyzerFilter", analyzerFilter)), Some(implicitly[play.api.mvc.QueryStringBindable[Option[String]]].unbind("range", range)))))
    }
  
    // @LINE:67
    def get(id:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "api/job/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("id", id)))
    }
  
    // @LINE:68
    def report(id:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "api/job/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("id", id)) + "/report")
    }
  
  }


}
