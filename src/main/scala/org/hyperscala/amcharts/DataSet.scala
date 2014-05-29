package org.hyperscala.amcharts

import org.hyperscala.javascript.JSObjectWithDefault
import org.powerscala.Color

/**
 * @author Matt Hicks <matt@outr.com>
 */
case class DataSet[D](categoryField: Option[String] = None,
                      color: Option[Color] = None,
                      compared: Boolean = false,
                      dataProvider: List[D] = Nil,
                      fieldMappings: List[FieldMapping] = Nil,
                      showInCompare: Boolean = true,
                      showInSelect: Boolean = true,
                      stockEvents: List[StockEvent] = Nil,
                      title: Option[String] = None) extends JSObjectWithDefault {
  def default = DataSet.Default
}

object DataSet {
  val Default = apply()
}