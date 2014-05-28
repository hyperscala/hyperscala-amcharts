package org.hyperscala.amcharts.example

import org.hyperscala.web.Webpage
import org.hyperscala.realtime.Realtime
import org.hyperscala.amcharts._
import org.hyperscala.html._
import scala.Some
import org.powerscala.Color
import org.hyperscala.javascript.JSObject

/**
 * @author Matt Hicks <matt@outr.com>
 */
class BarSimplePage extends Webpage(AmChartsExampleSite) {
  require(Realtime)
  require(AmCharts)

  val chartDiv = new tag.Div(id = "chartdiv") {
    style.width := 100.pct
    style.height := 400.px
  }
  body.contents += chartDiv

  val data = List(
    ValueChange("UBER", 900000.0, 0.0, 700000.0),
    ValueChange("NICE", 650000.0, 100000.0, 150000.0),
    ValueChange("EH", 450000.0, 0.0, 100000.0)
  )
  val chart = AmChart(new AmSerialChart[ValueChange](chartDiv) {
    dataProvider := data
    categoryField := "ticker"
    plotAreaBorderAlpha := 0.2
    rotate := false
    categoryAxis := CategoryAxis(gridAlpha = 0.1, axisAlpha = 0.0, gridPosition = "start")
    valueAxes := List(ValueAxis(stackType = "regular", gridAlpha = 0.1, axisAlpha = 0.0))
    val balloonText = "" //<b><span style='color:#C72C95'>[[title]]</b></span><br><span style='font-size:14px'>[[ticker]]: <b>[[value]]</b></span>"
    graphs := List(
      AmGraph(title = Some("Purchase Value"), labelText = Some("[[value]]"), valueField = Some("purchased"), graphType = "column", lineAlpha = 0.0, fillAlphas = 1.0, lineColor = Some(Color("#c72c95")), balloonText = balloonText),
      AmGraph(title = Some("Free Stock Value"), labelText = Some("[[value]]"), valueField = Some("free"), graphType = "column", lineAlpha = 0.0, fillAlphas = 1.0, lineColor = Some(Color("#d8e0bd")), balloonText = balloonText),
      AmGraph(title = Some("Price Change (gain/loss)"), labelText = Some("[[value]]"), valueField = Some("change"), graphType = "column", lineAlpha = 0.0, fillAlphas = 1.0, lineColor = Some(Color("#b3dbd4")), balloonText = balloonText)
    )
    legend := Legend(position = "right", borderAlpha = 0.3, horizontalGap = 10.0, switchType = "v")
    creditsPosition := "top-right"
  })
}

case class ValueChange(ticker: String, purchased: Double, free: Double, change: Double) extends JSObject