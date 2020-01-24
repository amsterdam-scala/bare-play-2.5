package controllers

import javax.inject.Singleton
import play.api.mvc.{ Action, Controller }

@Singleton
class Application extends Controller {
  def hello = Action(Ok("Hello"))
}
