package org.hyperscala.amcharts

import org.powerscala.Color
import org.hyperscala.javascript.JSObjectWithDefault

/**
 * @author Matt Hicks <matt@outr.com>
 */
case class Legend(align: String = "left",
                  autoMargins: Boolean = true,
                  backgroundAlpha: Double = 0.0,
                  backgroundColor: Color = Color.White,
                  borderAlpha: Double = 0.0,
                  borderColor: Color = Color.Black,
                  bottom: Double = 0.0,
                  color: Color = Color.Black,
                  divId: String = null,
                  equalWidths: Boolean = true,
                  fontSize: Double = 11.0,
                  horizontalGap: Double = 0.0,
                  labelText: String = "[[title]]",
                  left: Double = 0.0,
                  marginBottom: Double = 0.0,
                  marginLeft: Double = 20.0,
                  marginRight: Double = 20.0,
                  marginTop: Double = 0.0,
                  markerBorderAlpha: Double = 1.0,
                  markerBorderColor: Color = null,
                  markerBorderThickness: Double = 1.0,
                  markerDisabledColor: Color = Color("#aab3b3"),
                  markerLabelGap: Double = 5.0,
                  markerSize: Double = 16.0,
                  markerType: String = "square",
                  maxColumns: Int = -1,
                  periodValueText: String = null,
                  position: String = "bottom",
                  reversedOrder: Boolean = false,
                  right: Double = 0.0,
                  rollOverColor: Color = Color("#cc0000"),
                  rollOverGraphAlpha: Double = 1.0,
                  showEntries: Boolean = true,
                  spacing: Double = 10.0,
                  switchable: Boolean = true,
                  switchColor: Color = Color.White,
                  switchType: String = "x",
                  textClickEnabled: Boolean = false,
                  top: Double = 0.0,
                  useGraphSettings: Boolean = false,
                  useMarkerColorForLabels: Boolean = false,
                  useMarkerColorForValues: Boolean = false,
                  valueAlign: String = "right",
                  valueText: String = "[[value]]",
                  valueWidth: Double = 50.0,
                  verticalGap: Double = 10.0,
                  width: Double = 0.0) extends JSObjectWithDefault {
  override def default = Legend.Default
}

object Legend {
  val Default = Legend()
}