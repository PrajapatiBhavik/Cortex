// @GENERATOR:play-routes-compiler
// @SOURCE:conf/routes

package org.elastic4play.controllers;

import router.RoutesPrefix;

public class routes {
  
  public static final org.elastic4play.controllers.ReverseMigrationCtrl MigrationCtrl = new org.elastic4play.controllers.ReverseMigrationCtrl(RoutesPrefix.byNamePrefix());

  public static class javascript {
    
    public static final org.elastic4play.controllers.javascript.ReverseMigrationCtrl MigrationCtrl = new org.elastic4play.controllers.javascript.ReverseMigrationCtrl(RoutesPrefix.byNamePrefix());
  }

}
