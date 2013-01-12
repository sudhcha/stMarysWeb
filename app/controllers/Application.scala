package controllers

import play.api._
import play.api.mvc._

object Application extends Controller {
  
  def index = Action {
    Ok(views.html.index(""))
  }
  
  def priest = Action {
    Ok(views.html.priest(""))
  }
  
  def maps = Action {
    Ok(views.html.maps(""))
  }
  
}