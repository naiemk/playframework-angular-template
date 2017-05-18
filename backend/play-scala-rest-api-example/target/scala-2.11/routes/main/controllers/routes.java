
// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/bana/nk/playframework-angular-template/backend/play-scala-rest-api-example/conf/routes
// @DATE:Thu May 18 01:44:55 EDT 2017

package controllers;

import router.RoutesPrefix;

public class routes {
  
  public static final controllers.ReverseHomeController HomeController = new controllers.ReverseHomeController(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseExternalAssets ExternalAssets = new controllers.ReverseExternalAssets(RoutesPrefix.byNamePrefix());

  public static class javascript {
    
    public static final controllers.javascript.ReverseHomeController HomeController = new controllers.javascript.ReverseHomeController(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseExternalAssets ExternalAssets = new controllers.javascript.ReverseExternalAssets(RoutesPrefix.byNamePrefix());
  }

}
