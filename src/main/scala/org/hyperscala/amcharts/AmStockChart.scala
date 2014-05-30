package org.hyperscala.amcharts

import org.hyperscala.html._

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

  override protected def initializeComponent(values: Map[String, Any]) = {
    AmCharts.verifyStock(webpage)

    super.initializeComponent(values)
  }
}
