package org.hyperscala.amcharts

import org.hyperscala.html._
import org.hyperscala.javascript.JavaScriptContent
import org.hyperscala.realtime.Realtime
import org.hyperscala.selector.Selector

/**
 * @author Matt Hicks <matt@outr.com>
 */
class AmStockChart[D](val wrapped: tag.Div)(implicit val manifest: Manifest[D]) extends AmChart[D] {
  def typeName = "stock"

  lazy val chartCursorSettings = property("chartCursorSettings", ChartCursorSettings.Default)
  lazy val chartScrollbarSettings = property("chartScrollbarSettings", ChartScrollbarSettings.Default)
  lazy val dataSetSelector = property[DataSetSelector]("dataSetSelector", null)
  lazy val dataSets = property[List[DataSet[D]]]("dataSets", Nil)
  lazy val panels = property[List[StockPanel[D]]]("panels", Nil)
  lazy val periodSelector = property[PeriodSelector]("periodSelector", null)

  dataSets.change.on {
    case evt => if (initialized) validateData()      // Make sure the data gets updated on the screen
  }

  override protected def initializeComponent(values: Map[String, Any]) = {
    AmCharts.verifyStock(webpage)

    super.initializeComponent(values)
  }

  override def validateData() = {     // Work-around to make sure the chart updates
    Realtime.sendJavaScript(webpage, s"window.charts['$id'].mainDataSet = window.charts['$id'].dataSets[0];", onlyRealtime = false, selector = Some(Selector.id(wrapped)))
    super.validateData()
  }
}
