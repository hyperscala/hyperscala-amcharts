package org.hyperscala.amcharts.example

import org.hyperscala.web.Webpage
import org.hyperscala.realtime.Realtime
import org.hyperscala.amcharts._
import org.hyperscala.html._
import org.hyperscala.javascript.JSObject
import org.hyperscala.amcharts.ValueAxis
import scala.Some

/**
 * @author Matt Hicks <matt@outr.com>
 */
class LineSimplePage extends Webpage(AmChartsExampleSite) {
  require(Realtime)
  require(AmCharts)

  val chartDiv = new tag.Div(id = "chartdiv") {
    style.width := 100.pct
    style.height := 400.px
  }
  body.contents += chartDiv

  val data = List(
    CompaniesValue("2013-11-30", 104, 124),
    CompaniesValue("2013-12-01", 108, 148),
    CompaniesValue("2013-12-02", 103, 103),
    CompaniesValue("2013-12-03", 105, 185),
    CompaniesValue("2013-12-04", 136, 106),
    CompaniesValue("2013-12-05", 138, 118),
    CompaniesValue("2013-12-06", 113, 193),
    CompaniesValue("2013-12-07", 131, 181),
    CompaniesValue("2013-12-08", 114, 174),
    CompaniesValue("2013-12-09", 124, 164)
  )
  val chart = AmChart(new AmSerialChart[CompaniesValue](chartDiv) {
    dataProvider := data
    dataDateFormat := "YYYY-MM-DD"
    pathToImages := "/amcharts/images/"
    valueAxes := List(ValueAxis(maximum = Some(200.0), minimum = Some(100.0), axisAlpha = 0.0))
    graphs := List(AmGraph(bullet = "round", valueField = Some("company1Value")), AmGraph(bullet = "round", valueField = Some("company2Value")))
    chartCursor := ChartCursor(cursorAlpha = 0.0)
    categoryField := "date"
    categoryAxis := CategoryAxis(parseDates = true)
  })
}

case class CompaniesValue(date: String, company1Value: Double, company2Value: Double) extends JSObject