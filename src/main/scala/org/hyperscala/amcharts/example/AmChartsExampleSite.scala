package org.hyperscala.amcharts.example

import org.hyperscala.web.{Scope, Website}
import com.outr.net.http.session.MapSession
import com.outr.net.http.jetty.JettyApplication
import com.outr.net.http.request.HttpRequest

/**
 * @author Matt Hicks <matt@outr.com>
 */
object AmChartsExampleSite extends Website[MapSession] with JettyApplication {
  val pieSimple = page(new PieSimplePage, Scope.Page, "/pieSimple.html")

  override protected def createSession(request: HttpRequest, id: String) = new MapSession(id, this)

  override protected def defaultPort = 8886
}
