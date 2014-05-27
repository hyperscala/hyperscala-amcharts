package org.hyperscala.amcharts

import org.powerscala.Color
import org.hyperscala.javascript.JSObjectWithDefault

/**
 * @author Matt Hicks <matt@outr.com>
 */
case class ValueAxis(autoGridCount: Boolean = true,
                     axisAlpha: Double = 1.0,
                     axisColor: Color = Color.Black,
                     axisThickness: Double = 1.0,
                     axisTitleOffset: Double = 10.0,
                     axisX: Option[Double] = None,
                     axisY: Option[Double] = None,
                     baseCoord: Option[Double] = None,
                     baseValue: Double = 0.0,
                     color: Option[Color] = None,
                     dashLength: Double = 0.0,
                     duration: Option[String] = None,
                     durationUnits: String = "{DD:'d. ', hh:':', mm:':',ss:''}",
                     fillAlpha: Double = 0.0,
                     fillColor: Color = Color.White,
                     fontSize: Option[Double] = None,
                     gridAlpha: Double = 0.15,
                     gridColor: Color = Color.Black,
                     gridCount: Int = 5,
                     gridThickness: Double = 1.0,
                     gridType: String = "polygons",
                     guides: List[Guide] = Nil,
                     id: Option[String] = None,
                     ignoreAxisWidth: Boolean = false,
                     includeGuidesInMinMax: Boolean = false,
                     includeHidden: Boolean = false,
                     inside: Boolean = false,
                     integersOnly: Boolean = false,
                     labelFrequency: Double = 1.0,
                     labelFunction: Option[(Double, String, ValueAxis) => String] = None,
                     labelRotation: Double = 0.0,
                     labelsEnabled: Boolean = true,
                     logarithmic: Boolean = false,
                     maximum: Option[Double] = None,
                     minimum: Option[Double] = None,
                     minMaxMultiplier: Double = 1.0,
                     minHorizontalGap: Double = 75.0,
                     minorGridAlpha: Double = 0.07,
                     minorGridEnabled: Boolean = false,
                     minVerticalGap: Double = 35.0,
                     offset: Double = 0.0,
                     position: String = "left",
                     precision: Option[Double] = None,
                     radarCategoriesEnabled: Boolean = true,
                     recalculateToPercents: Boolean = false,
                     reversed: Boolean = false,
                     showFirstLabel: Boolean = true,
                     showLastLabel: Boolean = true,
                     stackType: String = "none",
                     step: Option[Double] = None,
                     synchronizationMultiplier: Option[Double] = None,
                     synchronizeWith: Option[ValueAxis] = None,
                     tickLength: Double = 5.0,
                     title: Option[String] = None,
                     titleBold: Boolean = true,
                     titleColor: Option[Color] = None,
                     titleFontSize: Option[Double] = None,
                     totalText: Option[String] = None,
                     totalTextColor: Option[Color] = None,
                     unit: Option[String] = None,
                     unitPosition: String = "right",
                     usePrefixes: Boolean = false,
                     useScientificNotation: Boolean = false) extends JSObjectWithDefault {
  override def default = ValueAxis.Default
}

object ValueAxis {
  val Default = apply()
}