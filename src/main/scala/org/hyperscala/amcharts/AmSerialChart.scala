package org.hyperscala.amcharts

import org.hyperscala.html._
import java.util.Date

/**
 * @author Matt Hicks <matt@outr.com>
 */
class AmSerialChart[D](val wrapped: tag.Div)(implicit val manifest: Manifest[D]) extends AmRectangularChart[D] {
  def typeName = "serial"

  lazy val balloonDateFormat = property("balloonDateFormat", "MMM DD, YYYY")
  lazy val categoryAxis = property[CategoryAxis]("categoryAxis", null)
  lazy val categoryField = property[String]("categoryField", null)
  lazy val columnSpacing = property("columnSpacing", 5.0)
  lazy val columnSpacing3D = property("columnSpacing3D", 0.0)
  lazy val columnWidth = property("columnWidth", 0.8)
  lazy val dataDateFormat = property[String]("dataDateFormat", null)
  lazy val endDate = property[Date]("endDate", null)
  lazy val endIndex = property[Int]("endIndex", -1)
  lazy val maxSelectedSeries = property("maxSelectedSeries", -1)
  lazy val maxSelectedTime = property("maxSelectedTime", 0)
  lazy val mouseWheelScrollEnabled = property("mouseWheelScrollEnabled", false)
  lazy val rotate = property("rotate", false)
  lazy val startDate = property[Date]("startDate", null)
  lazy val startIndex = property("startIndex", -1)
  lazy val zoomOutOnDataUpdate = property("zoomOutOnDataUpdate", true)

  override protected def initializeComponent(values: Map[String, Any]) = {
    AmCharts.verifySerial(webpage)

    super.initializeComponent(values)
  }
}
