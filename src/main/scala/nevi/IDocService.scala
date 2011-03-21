package nevi

import net.liftweb._
import util._
import Helpers._
import common._
import http._
import rest._

object IDocService extends RestHelper {
  serve {
    case "idoc" :: _ XmlPost xml -> _ =>
      <response/>
  }
}
