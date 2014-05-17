package org.hyperscala.amcharts

import org.hyperscala.module.Module
import org.powerscala.Version
import com.outr.net.http.session.Session
import org.hyperscala.html._
import org.hyperscala.web.{Website, Webpage}

/**
 * This module is a wrapper around http://www.amcharts.com
 *
 * @author Matt Hicks <matt@outr.com>
 */
object Amcharts extends Module {
  val name = "amcharts"
  val version = Version(3, 4, 10)

  override def init[S <: Session](website: Website[S]) = {
    website.addClassPath("/amcharts", "amcharts")
  }

  override def load[S <: Session](webpage: Webpage[S]) = {
    webpage.head.contents += new tag.Script(src = "/amcharts/amcharts.js")
  }

  def verifyPie[S <: Session](webpage: Webpage[S]) = verifyScript(webpage, "pie")

  private def verifyScript[S <: Session](webpage: Webpage[S], name: String) = if (!hasScript(webpage, name)) {
    webpage.head.contents += new tag.Script(src = s"/amcharts/$name.js")
  }

  private def hasScript[S <: Session](webpage: Webpage[S], name: String) = webpage.head.byTag[tag.Script].find(s => s.src() == s"/amcharts/$name.js").nonEmpty
}
