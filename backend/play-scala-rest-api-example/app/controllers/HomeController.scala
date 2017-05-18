package controllers

import play.api.libs.json.Json
import play.api.mvc.{Action, Controller}

/**
  * A very small controller that renders a home page.
  */
class HomeController extends Controller {

  def index = Action { implicit request =>
    Ok("Done")
  }

  def alerts = Action { implicit request =>
    Ok("THIS COMES FROM THE BACKEND!")
  }

  def serve = Action { implicit request =>
    Ok(Json.parse(
      """
        {
           "user": "test_user",
           "stage": "beta"
        }
      """))
  }
}
