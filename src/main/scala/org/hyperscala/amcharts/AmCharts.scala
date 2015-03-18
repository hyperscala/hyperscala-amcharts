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
object AmCharts extends Module {
  val name = "amcharts"
  val version = Version(3, 9, 0)

  override def init(website: Website) = {
    website.addClassPath("/amcharts", "amcharts")
  }

  override def load(webpage: Webpage) = {
    webpage.head.contents += new tag.Link(href = "/amcharts/style.css")
    webpage.head.contents += new tag.Script(src = "/amcharts/amcharts.js")
  }

  def verifyPie(webpage: Webpage) = verifyScript(webpage, "pie")
  def verifySerial(webpage: Webpage) = verifyScript(webpage, "serial")
  def verifyStock(webpage: Webpage) = verifyScript(webpage, "amstock")

  private def verifyScript(webpage: Webpage, name: String) = if (!hasScript(webpage, name)) {
    webpage.head.contents += new tag.Script(src = s"/amcharts/$name.js")
  }

  private def hasScript(webpage: Webpage, name: String) = webpage.head.byTag[tag.Script].find(s => s.src() == s"/amcharts/$name.js").nonEmpty
}
