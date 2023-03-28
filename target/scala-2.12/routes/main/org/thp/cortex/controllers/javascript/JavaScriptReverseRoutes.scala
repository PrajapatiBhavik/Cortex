// @GENERATOR:play-routes-compiler
// @SOURCE:conf/routes

import play.api.routing.JavaScriptReverseRoute


import _root_.controllers.Assets.Asset

// @LINE:6
package org.thp.cortex.controllers.javascript {

  // @LINE:80
  class ReverseDBListCtrl(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:82
    def updateItem: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "org.thp.cortex.controllers.DBListCtrl.updateItem",
      """
        function(itemId0) {
          return _wA({method:"PATCH", url:"""" + _prefix + { _defaultPrefix } + """" + "api/list/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("itemId", itemId0))})
        }
      """
    )
  
    // @LINE:83
    def addItem: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "org.thp.cortex.controllers.DBListCtrl.addItem",
      """
        function(listName0) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "api/list/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("listName", listName0))})
        }
      """
    )
  
    // @LINE:81
    def deleteItem: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "org.thp.cortex.controllers.DBListCtrl.deleteItem",
      """
        function(itemId0) {
          return _wA({method:"DELETE", url:"""" + _prefix + { _defaultPrefix } + """" + "api/list/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("itemId", itemId0))})
        }
      """
    )
  
    // @LINE:80
    def list: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "org.thp.cortex.controllers.DBListCtrl.list",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "api/list"})
        }
      """
    )
  
    // @LINE:85
    def itemExists: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "org.thp.cortex.controllers.DBListCtrl.itemExists",
      """
        function(listName0) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "api/list/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("listName", listName0)) + "/_exists"})
        }
      """
    )
  
    // @LINE:84
    def listItems: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "org.thp.cortex.controllers.DBListCtrl.listItems",
      """
        function(listName0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "api/list/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("listName", listName0))})
        }
      """
    )
  
  }

  // @LINE:104
  class ReverseOrganizationCtrl(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:108
    def create: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "org.thp.cortex.controllers.OrganizationCtrl.create",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "api/organization"})
        }
      """
    )
  
    // @LINE:104
    def find: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "org.thp.cortex.controllers.OrganizationCtrl.find",
      """
        function() {
        
          if (true) {
            return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "api/organization"})
          }
        
        }
      """
    )
  
    // @LINE:106
    def stats: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "org.thp.cortex.controllers.OrganizationCtrl.stats",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "api/organization/_stats"})
        }
      """
    )
  
    // @LINE:110
    def delete: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "org.thp.cortex.controllers.OrganizationCtrl.delete",
      """
        function(id0) {
          return _wA({method:"DELETE", url:"""" + _prefix + { _defaultPrefix } + """" + "api/organization/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
    // @LINE:109
    def update: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "org.thp.cortex.controllers.OrganizationCtrl.update",
      """
        function(id0) {
          return _wA({method:"PATCH", url:"""" + _prefix + { _defaultPrefix } + """" + "api/organization/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
    // @LINE:107
    def get: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "org.thp.cortex.controllers.OrganizationCtrl.get",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "api/organization/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
  }

  // @LINE:7
  class ReverseStatusCtrl(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:7
    def health: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "org.thp.cortex.controllers.StatusCtrl.health",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "api/health"})
        }
      """
    )
  
    // @LINE:15
    def get: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "org.thp.cortex.controllers.StatusCtrl.get",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "api/status"})
        }
      """
    )
  
    // @LINE:16
    def getAlerts: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "org.thp.cortex.controllers.StatusCtrl.getAlerts",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "api/alert"})
        }
      """
    )
  
  }

  // @LINE:59
  class ReverseResponderConfigCtrl(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:59
    def get: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "org.thp.cortex.controllers.ResponderConfigCtrl.get",
      """
        function(responderConfigName0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "api/responderconfig/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("responderConfigName", responderConfigName0))})
        }
      """
    )
  
    // @LINE:60
    def list: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "org.thp.cortex.controllers.ResponderConfigCtrl.list",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "api/responderconfig"})
        }
      """
    )
  
    // @LINE:61
    def update: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "org.thp.cortex.controllers.ResponderConfigCtrl.update",
      """
        function(responderConfigName0) {
          return _wA({method:"PATCH", url:"""" + _prefix + { _defaultPrefix } + """" + "api/responderconfig/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("responderConfigName", responderConfigName0))})
        }
      """
    )
  
  }

  // @LINE:87
  class ReverseUserCtrl(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:92
    def findForOrganization: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "org.thp.cortex.controllers.UserCtrl.findForOrganization",
      """
        function(organizationId0) {
        
          if (true) {
            return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "api/organization/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("organizationId", organizationId0)) + "/user"})
          }
        
        }
      """
    )
  
    // @LINE:101
    def removeKey: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "org.thp.cortex.controllers.UserCtrl.removeKey",
      """
        function(userId0) {
          return _wA({method:"DELETE", url:"""" + _prefix + { _defaultPrefix } + """" + "api/user/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("userId", userId0)) + "/key"})
        }
      """
    )
  
    // @LINE:94
    def create: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "org.thp.cortex.controllers.UserCtrl.create",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "api/user"})
        }
      """
    )
  
    // @LINE:88
    def find: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "org.thp.cortex.controllers.UserCtrl.find",
      """
        function() {
        
          if (true) {
            return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "api/user"})
          }
        
        }
      """
    )
  
    // @LINE:98
    def setPassword: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "org.thp.cortex.controllers.UserCtrl.setPassword",
      """
        function(userId0) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "api/user/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("userId", userId0)) + "/password/set"})
        }
      """
    )
  
    // @LINE:102
    def renewKey: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "org.thp.cortex.controllers.UserCtrl.renewKey",
      """
        function(userId0) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "api/user/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("userId", userId0)) + "/key/renew"})
        }
      """
    )
  
    // @LINE:87
    def currentUser: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "org.thp.cortex.controllers.UserCtrl.currentUser",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "api/user/current"})
        }
      """
    )
  
    // @LINE:99
    def changePassword: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "org.thp.cortex.controllers.UserCtrl.changePassword",
      """
        function(userId0) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "api/user/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("userId", userId0)) + "/password/change"})
        }
      """
    )
  
    // @LINE:96
    def delete: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "org.thp.cortex.controllers.UserCtrl.delete",
      """
        function(userId0) {
          return _wA({method:"DELETE", url:"""" + _prefix + { _defaultPrefix } + """" + "api/user/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("userId", userId0))})
        }
      """
    )
  
    // @LINE:100
    def getKey: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "org.thp.cortex.controllers.UserCtrl.getKey",
      """
        function(userId0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "api/user/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("userId", userId0)) + "/key"})
        }
      """
    )
  
    // @LINE:97
    def update: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "org.thp.cortex.controllers.UserCtrl.update",
      """
        function(userId0) {
          return _wA({method:"PATCH", url:"""" + _prefix + { _defaultPrefix } + """" + "api/user/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("userId", userId0))})
        }
      """
    )
  
    // @LINE:95
    def get: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "org.thp.cortex.controllers.UserCtrl.get",
      """
        function(userId0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "api/user/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("userId", userId0))})
        }
      """
    )
  
  }

  // @LINE:72
  class ReverseStreamCtrl(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:72
    def create: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "org.thp.cortex.controllers.StreamCtrl.create",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "api/stream"})
        }
      """
    )
  
    // @LINE:73
    def status: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "org.thp.cortex.controllers.StreamCtrl.status",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "api/stream/status"})
        }
      """
    )
  
    // @LINE:74
    def get: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "org.thp.cortex.controllers.StreamCtrl.get",
      """
        function(streamId0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "api/stream/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("streamId", streamId0))})
        }
      """
    )
  
  }

  // @LINE:77
  class ReverseAttachmentCtrl(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:77
    def download: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "org.thp.cortex.controllers.AttachmentCtrl.download",
      """
        function(hash0,name1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "api/datastore/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("hash", hash0)) + _qS([(""" + implicitly[play.api.mvc.QueryStringBindable[Option[String]]].javascriptUnbind + """)("name", name1)])})
        }
      """
    )
  
    // @LINE:78
    def downloadZip: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "org.thp.cortex.controllers.AttachmentCtrl.downloadZip",
      """
        function(hash0,name1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "api/datastorezip/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("hash", hash0)) + _qS([(""" + implicitly[play.api.mvc.QueryStringBindable[Option[String]]].javascriptUnbind + """)("name", name1)])})
        }
      """
    )
  
  }

  // @LINE:23
  class ReverseResponderCtrl(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:23
    def find: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "org.thp.cortex.controllers.ResponderCtrl.find",
      """
        function() {
        
          if (true) {
            return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "api/responder"})
          }
        
        }
      """
    )
  
    // @LINE:26
    def listForType: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "org.thp.cortex.controllers.ResponderCtrl.listForType",
      """
        function(dataType0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "api/responder/type/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("dataType", dataType0))})
        }
      """
    )
  
    // @LINE:49
    def scan: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "org.thp.cortex.controllers.ResponderCtrl.scan",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "api/responderdefinition/scan"})
        }
      """
    )
  
    // @LINE:52
    def create: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "org.thp.cortex.controllers.ResponderCtrl.create",
      """
        function(responderId0) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "api/organization/responder/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("responderId", responderId0))})
        }
      """
    )
  
    // @LINE:46
    def delete: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "org.thp.cortex.controllers.ResponderCtrl.delete",
      """
        function(id0) {
          return _wA({method:"DELETE", url:"""" + _prefix + { _defaultPrefix } + """" + "api/responder/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
    // @LINE:47
    def update: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "org.thp.cortex.controllers.ResponderCtrl.update",
      """
        function(id0) {
          return _wA({method:"PATCH", url:"""" + _prefix + { _defaultPrefix } + """" + "api/responder/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
    // @LINE:25
    def get: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "org.thp.cortex.controllers.ResponderCtrl.get",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "api/responder/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
    // @LINE:48
    def listDefinitions: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "org.thp.cortex.controllers.ResponderCtrl.listDefinitions",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "api/responderdefinition"})
        }
      """
    )
  
  }

  // @LINE:17
  class ReverseAnalyzerCtrl(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:17
    def find: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "org.thp.cortex.controllers.AnalyzerCtrl.find",
      """
        function() {
        
          if (true) {
            return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "api/analyzer"})
          }
        
        }
      """
    )
  
    // @LINE:20
    def listForType: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "org.thp.cortex.controllers.AnalyzerCtrl.listForType",
      """
        function(dataType0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "api/analyzer/type/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("dataType", dataType0))})
        }
      """
    )
  
    // @LINE:41
    def scan: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "org.thp.cortex.controllers.AnalyzerCtrl.scan",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "api/analyzerdefinition/scan"})
        }
      """
    )
  
    // @LINE:44
    def create: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "org.thp.cortex.controllers.AnalyzerCtrl.create",
      """
        function(analyzerId0) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "api/organization/analyzer/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("analyzerId", analyzerId0))})
        }
      """
    )
  
    // @LINE:38
    def delete: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "org.thp.cortex.controllers.AnalyzerCtrl.delete",
      """
        function(id0) {
          return _wA({method:"DELETE", url:"""" + _prefix + { _defaultPrefix } + """" + "api/analyzer/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
    // @LINE:39
    def update: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "org.thp.cortex.controllers.AnalyzerCtrl.update",
      """
        function(id0) {
          return _wA({method:"PATCH", url:"""" + _prefix + { _defaultPrefix } + """" + "api/analyzer/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
    // @LINE:19
    def get: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "org.thp.cortex.controllers.AnalyzerCtrl.get",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "api/analyzer/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
    // @LINE:40
    def listDefinitions: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "org.thp.cortex.controllers.AnalyzerCtrl.listDefinitions",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "api/analyzerdefinition"})
        }
      """
    )
  
  }

  // @LINE:112
  class ReverseAssetCtrl(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:112
    def get: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "org.thp.cortex.controllers.AssetCtrl.get",
      """
        function(file0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + (""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("file", file0)})
        }
      """
    )
  
  }

  // @LINE:55
  class ReverseAnalyzerConfigCtrl(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:55
    def get: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "org.thp.cortex.controllers.AnalyzerConfigCtrl.get",
      """
        function(analyzerConfigName0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "api/analyzerconfig/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("analyzerConfigName", analyzerConfigName0))})
        }
      """
    )
  
    // @LINE:56
    def list: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "org.thp.cortex.controllers.AnalyzerConfigCtrl.list",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "api/analyzerconfig"})
        }
      """
    )
  
    // @LINE:57
    def update: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "org.thp.cortex.controllers.AnalyzerConfigCtrl.update",
      """
        function(analyzerConfigName0) {
          return _wA({method:"PATCH", url:"""" + _prefix + { _defaultPrefix } + """" + "api/analyzerconfig/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("analyzerConfigName", analyzerConfigName0))})
        }
      """
    )
  
  }

  // @LINE:6
  class ReverseHome(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:6
    def redirect: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "org.thp.cortex.controllers.Home.redirect",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + """"})
        }
      """
    )
  
  }

  // @LINE:32
  class ReverseMispCtrl(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:32
    def modules: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "org.thp.cortex.controllers.MispCtrl.modules",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "modules"})
        }
      """
    )
  
    // @LINE:33
    def query: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "org.thp.cortex.controllers.MispCtrl.query",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "query"})
        }
      """
    )
  
  }

  // @LINE:8
  class ReverseAuthenticationCtrl(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:8
    def logout: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "org.thp.cortex.controllers.AuthenticationCtrl.logout",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "api/logout"})
        }
      """
    )
  
    // @LINE:9
    def login: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "org.thp.cortex.controllers.AuthenticationCtrl.login",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "api/login"})
        }
      """
    )
  
    // @LINE:10
    def ssoLogin: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "org.thp.cortex.controllers.AuthenticationCtrl.ssoLogin",
      """
        function() {
        
          if (true) {
            return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "api/ssoLogin"})
          }
        
        }
      """
    )
  
  }

  // @LINE:21
  class ReverseJobCtrl(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:27
    def createResponderJob: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "org.thp.cortex.controllers.JobCtrl.createResponderJob",
      """
        function(id0) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "api/responder/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("id", id0)) + "/run"})
        }
      """
    )
  
    // @LINE:65
    def find: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "org.thp.cortex.controllers.JobCtrl.find",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "api/job/_search"})
        }
      """
    )
  
    // @LINE:69
    def getJobStatus: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "org.thp.cortex.controllers.JobCtrl.getJobStatus",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "api/job/status"})
        }
      """
    )
  
    // @LINE:29
    def waitReport: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "org.thp.cortex.controllers.JobCtrl.waitReport",
      """
        function(id0,atMost1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "api/job/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("id", id0)) + "/waitreport" + _qS([(atMost1 == null ? null : (""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("atMost", atMost1))])})
        }
      """
    )
  
    // @LINE:21
    def createAnalyzerJob: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "org.thp.cortex.controllers.JobCtrl.createAnalyzerJob",
      """
        function(id0) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "api/analyzer/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("id", id0)) + "/run"})
        }
      """
    )
  
    // @LINE:66
    def delete: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "org.thp.cortex.controllers.JobCtrl.delete",
      """
        function(id0) {
          return _wA({method:"DELETE", url:"""" + _prefix + { _defaultPrefix } + """" + "api/job/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
    // @LINE:36
    def listArtifacts: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "org.thp.cortex.controllers.JobCtrl.listArtifacts",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "api/job/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("id", id0)) + "/artifacts"})
        }
      """
    )
  
    // @LINE:64
    def list: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "org.thp.cortex.controllers.JobCtrl.list",
      """
        function(dataTypeFilter0,dataFilter1,analyzerFilter2,range3) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "api/job" + _qS([(""" + implicitly[play.api.mvc.QueryStringBindable[Option[String]]].javascriptUnbind + """)("dataTypeFilter", dataTypeFilter0), (""" + implicitly[play.api.mvc.QueryStringBindable[Option[String]]].javascriptUnbind + """)("dataFilter", dataFilter1), (""" + implicitly[play.api.mvc.QueryStringBindable[Option[String]]].javascriptUnbind + """)("analyzerFilter", analyzerFilter2), (""" + implicitly[play.api.mvc.QueryStringBindable[Option[String]]].javascriptUnbind + """)("range", range3)])})
        }
      """
    )
  
    // @LINE:67
    def get: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "org.thp.cortex.controllers.JobCtrl.get",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "api/job/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
    // @LINE:68
    def report: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "org.thp.cortex.controllers.JobCtrl.report",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "api/job/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("id", id0)) + "/report"})
        }
      """
    )
  
  }


}
