package org.hyperscala.amcharts

import org.hyperscala.javascript.JSObjectWithDefault

/**
 * @author Matt Hicks <matt@outr.com>
 */
case class DataSetSelector(comboBoxSelectText: String = "Select...",
                           compareText: String = "Compare to:",
                           listHeight: Double = 150.0,
                           position: String = "right, left, top, bottom",
                           selectText: String = "Select:",
                           width: Double = 180.0) extends JSObjectWithDefault {
  def default = DataSetSelector.Default
}

object DataSetSelector {
  val Default = apply()
}