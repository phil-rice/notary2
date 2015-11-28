package controllers.notary

import play.api._
import play.api.mvc._
import play.api.http.LazyHttpErrorHandler

object NotaryController extends Controller {
  def index = Action { Ok("Hello World") }
}

object NotaryAssets extends controllers.AssetsBuilder(LazyHttpErrorHandler)