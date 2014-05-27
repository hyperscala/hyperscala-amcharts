package org.hyperscala.amcharts

import org.powerscala.Color
import org.hyperscala.javascript.JSObjectWithDefault

/**
 * @author Matt Hicks <matt@outr.com>
 */
case class CategoryAxis(autoGridCount: Boolean = true,
                        autoRotateAngle: Option[Double] = None,
                        autoRotateCount: Option[Int] = None,
                        autoWrap: Boolean = false,
                        axisAlpha: Double = 1.0,
                        axisColor: Color = Color.Black,
                        axisThickness: Double = 1.0,
                        axisX: Option[Double] = None,
                        axisY: Option[Double] = None,
                        boldPeriodBeginning: Boolean = true,
                        centerLabelOnFullPeriod: Boolean = true,
                        color: Option[Color] = None,
                        dashLength: Double = 0.0,
                        equalSpacing: Boolean = false,
                        fillAlpha: Double = 0.0,
                        fillColor: Color = Color.White,
                        firstDayOfWeek: Int = 1,
                        fontSize: Option[Double] = None,
                        forceShowField: Option[String] = None,
                        gridAlpha: Double = 0.15,
                        gridColor: Color = Color.Black,
                        gridCount: Int = 5,
                        gridPosition: String = "middle",
                        gridThickness: Double = 1.0,
                        guides: List[Guide] = Nil,
                        ignoreAxisWidth: Boolean = false,
                        inside: Boolean = false,
                        labelFrequency: Double = 1.0,
                        labelRotation: Double = 0.0,
                        labelsEnabled: Boolean = true,
                        markPeriodChange: Boolean = true,
                        minHorizontalGap: Double = 75.0,
                        minorGridAlpha: Double = 0.07,
                        minorGridEnabled: Boolean = false,
                        minPeriod: String = "DD",
                        minVerticalGap: Double = 35.0,
                        offset: Double = 0.0,
                        parseDates: Boolean = false,
                        position: String = "bottom",
                        showFirstLabel: Boolean = true,
                        showLastLabel: Boolean = true,
                        startOnAxis: Boolean = false,
                        tickLength: Double = 5.0,
                        title: Option[String] = None,
                        titleBold: Boolean = true,
                        titleColor: Option[Color] = None,
                        titleFontSize: Option[Double] = None,
                        twoLineMode: Boolean = false) extends JSObjectWithDefault {
  override def default = CategoryAxis.Default
}

object CategoryAxis {
  val Default = apply()
}