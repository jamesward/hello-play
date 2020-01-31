package controllers

import play.api.mvc.InjectedController

class MainController extends InjectedController {
  def index = Action {
    Ok("hello, world")
  }
}
