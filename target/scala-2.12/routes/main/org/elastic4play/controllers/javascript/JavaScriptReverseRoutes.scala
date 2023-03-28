// @GENERATOR:play-routes-compiler
// @SOURCE:conf/routes

import play.api.routing.JavaScriptReverseRoute


import _root_.controllers.Assets.Asset

// @LINE:76
package org.elastic4play.controllers.javascript {

  // @LINE:76
  class ReverseMigrationCtrl(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:76
    def migrate: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "org.elastic4play.controllers.MigrationCtrl.migrate",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "api/maintenance/migrate"})
        }
      """
    )
  
  }


}
