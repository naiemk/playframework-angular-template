
// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/bana/nk/playframework-angular-template/backend/play-scala-rest-api-example/conf/routes
// @DATE:Thu May 18 01:44:55 EDT 2017

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._
import play.core.j._

import play.api.mvc._

import _root_.controllers.Assets.Asset

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:1
  HomeController_0: controllers.HomeController,
  // @LINE:5
  v1_post_PostRouter_0: v1.post.PostRouter,
  // @LINE:9
  ExternalAssets_1: controllers.ExternalAssets,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:1
    HomeController_0: controllers.HomeController,
    // @LINE:5
    v1_post_PostRouter_0: v1.post.PostRouter,
    // @LINE:9
    ExternalAssets_1: controllers.ExternalAssets
  ) = this(errorHandler, HomeController_0, v1_post_PostRouter_0, ExternalAssets_1, "/")

  import ReverseRouteContext.empty

  def withPrefix(prefix: String): Routes = {
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, HomeController_0, v1_post_PostRouter_0, ExternalAssets_1, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api""", """controllers.HomeController.index"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/serve""", """controllers.HomeController.serve"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/alerts""", """controllers.HomeController.alerts"""),
    prefixed_v1_post_PostRouter_0_3.router.documentation,
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """""" + "$" + """file<.+>""", """controllers.ExternalAssets.at(path:String = java.nio.file.Paths.get(java.nio.file.Paths.get(play.Environment.simple().rootPath().getAbsolutePath).getParent.getParent.getParent.toString,"frontend/SB-Admin-BS4-Angular-4/build").toString, file:String)"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:1
  private[this] lazy val controllers_HomeController_index0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api")))
  )
  private[this] lazy val controllers_HomeController_index0_invoker = createInvoker(
    HomeController_0.index,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "index",
      Nil,
      "GET",
      """""",
      this.prefix + """api"""
    )
  )

  // @LINE:2
  private[this] lazy val controllers_HomeController_serve1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/serve")))
  )
  private[this] lazy val controllers_HomeController_serve1_invoker = createInvoker(
    HomeController_0.serve,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "serve",
      Nil,
      "GET",
      """""",
      this.prefix + """api/serve"""
    )
  )

  // @LINE:3
  private[this] lazy val controllers_HomeController_alerts2_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/alerts")))
  )
  private[this] lazy val controllers_HomeController_alerts2_invoker = createInvoker(
    HomeController_0.alerts,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "alerts",
      Nil,
      "GET",
      """""",
      this.prefix + """api/alerts"""
    )
  )

  // @LINE:5
  private[this] val prefixed_v1_post_PostRouter_0_3 = Include(v1_post_PostRouter_0.withPrefix(this.prefix + (if (this.prefix.endsWith("/")) "" else "/") + "v1/posts"))

  // @LINE:9
  private[this] lazy val controllers_ExternalAssets_at4_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_ExternalAssets_at4_invoker = createInvoker(
    ExternalAssets_1.at(fakeValue[String], fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ExternalAssets",
      "at",
      Seq(classOf[String], classOf[String]),
      "GET",
      """ Map static resources from the ../../../fronted/<frontend-project>/build folder to the / URL path""",
      this.prefix + """""" + "$" + """file<.+>"""
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:1
    case controllers_HomeController_index0_route(params) =>
      call { 
        controllers_HomeController_index0_invoker.call(HomeController_0.index)
      }
  
    // @LINE:2
    case controllers_HomeController_serve1_route(params) =>
      call { 
        controllers_HomeController_serve1_invoker.call(HomeController_0.serve)
      }
  
    // @LINE:3
    case controllers_HomeController_alerts2_route(params) =>
      call { 
        controllers_HomeController_alerts2_invoker.call(HomeController_0.alerts)
      }
  
    // @LINE:5
    case prefixed_v1_post_PostRouter_0_3(handler) => handler
  
    // @LINE:9
    case controllers_ExternalAssets_at4_route(params) =>
      call(Param[String]("path", Right(java.nio.file.Paths.get(java.nio.file.Paths.get(play.Environment.simple().rootPath().getAbsolutePath).getParent.getParent.getParent.toString,"frontend/SB-Admin-BS4-Angular-4/build").toString)), params.fromPath[String]("file", None)) { (path, file) =>
        controllers_ExternalAssets_at4_invoker.call(ExternalAssets_1.at(path, file))
      }
  }
}
