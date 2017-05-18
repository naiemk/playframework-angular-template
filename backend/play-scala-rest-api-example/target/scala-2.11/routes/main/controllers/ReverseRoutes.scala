
// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/bana/nk/playframework-angular-template/backend/play-scala-rest-api-example/conf/routes
// @DATE:Thu May 18 01:44:55 EDT 2017

import play.api.mvc.{ QueryStringBindable, PathBindable, Call, JavascriptLiteral }
import play.core.routing.{ HandlerDef, ReverseRouteContext, queryString, dynamicString }


import _root_.controllers.Assets.Asset

// @LINE:1
package controllers {

  // @LINE:1
  class ReverseHomeController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:3
    def alerts(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "api/alerts")
    }
  
    // @LINE:2
    def serve(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "api/serve")
    }
  
    // @LINE:1
    def index(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "api")
    }
  
  }

  // @LINE:9
  class ReverseExternalAssets(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:9
    def at(file:String): Call = {
      implicit val _rrc = new ReverseRouteContext(Map(("path", java.nio.file.Paths.get(java.nio.file.Paths.get(play.Environment.simple().rootPath().getAbsolutePath).getParent.getParent.getParent.toString,"frontend/SB-Admin-BS4-Angular-4/build").toString)))
      Call("GET", _prefix + { _defaultPrefix } + implicitly[PathBindable[String]].unbind("file", file))
    }
  
  }


}
