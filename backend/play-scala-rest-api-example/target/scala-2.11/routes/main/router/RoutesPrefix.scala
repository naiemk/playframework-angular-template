
// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/bana/nk/playframework-angular-template/backend/play-scala-rest-api-example/conf/routes
// @DATE:Thu May 18 01:44:55 EDT 2017


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
