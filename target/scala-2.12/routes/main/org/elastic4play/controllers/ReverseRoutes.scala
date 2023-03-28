// @GENERATOR:play-routes-compiler
// @SOURCE:conf/routes

import play.api.mvc.Call


import _root_.controllers.Assets.Asset

// @LINE:76
package org.elastic4play.controllers {

  // @LINE:76
  class ReverseMigrationCtrl(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:76
    def migrate: Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "api/maintenance/migrate")
    }
  
  }


}
