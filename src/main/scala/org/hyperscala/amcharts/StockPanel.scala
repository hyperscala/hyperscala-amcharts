package org.hyperscala.amcharts

import org.hyperscala.html._
import java.util.Date
import org.powerscala.Color

/**
 * @author Matt Hicks <matt@outr.com>
 */
class StockPanel[D](wrapped: tag.Div)(implicit manifest: Manifest[D]) extends AmSerialChart[D](wrapped) {
  override def chartType = "StockPanel"

  writeTag := false     // Don't write this tag out

  lazy val allowTurningOff = property("allowTurningOff", false)
  lazy val drawingIconsEnabled = property("drawingIconsEnabled", false)
  lazy val drawOnAxis = property[ValueAxis]("drawOnAxis", null)
  lazy val eraseAll = property("eraseAll", false)
  lazy val iconSize = property("iconSize", 18.0)
  lazy val percentHeight = property("percentHeight", 0.0)
  lazy val recalculateFromDate = property[Date]("recalculateFromDate", null)
  lazy val recalculateFromPercents = property("recalculateFromPercents", "whenComparing")
  lazy val showCategoryAxis = property("showCategoryAxis", true)
  lazy val showComparedOnTop = property("showComparedOnTop", true)
  lazy val stockGraphs = property[List[StockGraph]]("stockGraphs", Nil)
  lazy val stockLegend = property[StockLegend]("stockLegend", null)
  lazy val title = property[String]("title", null)
  lazy val trendLineAlpha = property("trendLineAlpha", 1.0)
  lazy val trendLineColor = property("trendLineColor", Color("#00cc00"))
  lazy val trendLineDashLength = property("trendLineDashLength", 0.0)
  lazy val trendLineThickness = property("trendLineThicksness", 2.0)
}
