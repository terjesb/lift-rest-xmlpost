package bootstrap.liftweb

import net.liftweb._
import util._
import Helpers._
import common._
import http._
import sitemap._
import Loc._
import nevi._

/**
 * A class that's instantiated early and run.  It allows the application
 * to modify lift's environment
 */

class Boot {
  def boot {
    // Force the request to be UTF-8
    LiftRules.early.append(_.setCharacterEncoding("UTF-8"))

    // Use HTML5 for rendering
    LiftRules.htmlProperties.default.set((r: Req) =>
      new Html5Properties(r.userAgent))

    LiftRules.statelessDispatchTable.append(IDocService)
  }
}

