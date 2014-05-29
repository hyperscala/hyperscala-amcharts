package org.hyperscala.amcharts.example

import org.hyperscala.web.Webpage
import org.hyperscala.realtime.Realtime
import org.hyperscala.amcharts._
import org.hyperscala.html._
import scala.Some
import java.util.{Date, Calendar}
import org.hyperscala.javascript.JSObject

/**
 * @author Matt Hicks <matt@outr.com>
 */
class StockSimplePage extends Webpage(AmChartsExampleSite) {
  require(Realtime)
  require(AmCharts)

  val chartDiv = new tag.Div(id = "chartdiv") {
    style.width := 100.pct
    style.height := 600.px
  }
  body.contents += chartDiv

  val data = List()

  val valuePanel = AmChart(new StockPanel[StockData](chartDiv) {
    showCategoryAxis := false
    title := "Value"
    percentHeight := 70.0
    stockGraphs := List(
      StockGraph(id = Some("g1"), valueField = Some("value"), comparable = true, compareField = Some("value"), bullet = "round", balloonText = "[[title]]:<b>[[value]]</b>", compareGraphBalloonText = Some("[[title]]:<b>[[value]]</b>"), compareGraphBullet = Some("round"))
    )
    stockLegend := StockLegend(periodValueTextComparing = Some("[[percents.value.close]]%"), periodValueTextRegular = Some("[[value.close]]"))
  })
  val volumePanel = AmChart(new StockPanel[StockData](chartDiv) {
    title := "Volume"
    percentHeight := 30.0
    stockGraphs := List(
      StockGraph(valueField = Some("volume"), graphType = "column", showBalloon = false, fillAlphas = 1.0)
    )
    stockLegend := StockLegend(periodValueTextRegular = Some("[[value.close]]"))
  })
  val chart = AmChart(new AmStockChart[StockData](chartDiv) {
    pathToImages := "/amcharts/images/"
    val chartData1 = generateData(500, 40, 100, 1000, 500)
    val chartData2 = generateData(500, 100, 200, 1000, 600)
    val chartData3 = generateData(500, 100, 200, 1000, 600)
    val chartData4 = generateData(500, 100, 200, 100, 600)
    dataSets := List(
      DataSet(title = Some("first data set"), fieldMappings = List(FieldMapping("value", "value"), FieldMapping("volume", "volume")), dataProvider = chartData1, categoryField = Some("date")),
      DataSet(title = Some("second data set"), fieldMappings = List(FieldMapping("value", "value"), FieldMapping("volume", "volume")), dataProvider = chartData2, categoryField = Some("date")),
      DataSet(title = Some("third data set"), fieldMappings = List(FieldMapping("value", "value"), FieldMapping("volume", "volume")), dataProvider = chartData3, categoryField = Some("date")),
      DataSet(title = Some("fourth data set"), fieldMappings = List(FieldMapping("value", "value"), FieldMapping("volume", "volume")), dataProvider = chartData4, categoryField = Some("date"))
    )
    panels := List(valuePanel, volumePanel)
    chartScrollbarSettings := ChartScrollbarSettings(graph = Some("g1"))
    chartCursorSettings := ChartCursorSettings(valueBalloonsEnabled = true)
    periodSelector := PeriodSelector(position = "left", periods = List(Period("DD", 10, "10 days"), Period("MM", 1, "1 month", selected = true), Period("YYYY", 1, "1 year"), Period("YTD", 0, "YTD"), Period("MAX", 0, "MAX")))
    dataSetSelector := DataSetSelector(position = "left")
  })

  def generateData(total: Int, mod1: Int, mod2: Int, mod3: Int, mod4: Int) = {
    val start = Calendar.getInstance()
    start.add(Calendar.DAY_OF_YEAR, -total)
    (0 until total).map(i => {
      start.add(Calendar.DAY_OF_YEAR, 1)
      val date = new Date(start.getTimeInMillis)
      val value = math.round(math.random * (mod1 + i)) + mod2 + i
      val volume = math.round(math.random * (mod3 + i)) + mod4 + i * 2
      StockData(date, value, volume)
    }).toList
  }
}

case class StockData(date: Date, value: Long, volume: Long) extends JSObject