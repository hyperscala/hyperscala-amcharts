package org.hyperscala.amcharts

import org.hyperscala.javascript.JSObjectWithDefault

/**
 * @author Matt Hicks <matt@outr.com>
 */
case class PeriodSelector(dateFormat: String = "DD-MM-YYYY",
                          fromText: String = "From:",
                          hideOutOfScopePeriods: Boolean = true,
                          inputFieldsEnabled: Boolean = true,
                          inputFieldWidth: Double = 100.0,
                          periods: List[Period] = Nil,
                          periodsText: String = "Zoom:",
                          position: String = "bottom",
                          selectFromStart: Boolean = false,
                          toText: String = "To:",
                          width: Double = 180.0) extends JSObjectWithDefault {
  def default = PeriodSelector.Default
}

object PeriodSelector {
  val Default = apply()
}