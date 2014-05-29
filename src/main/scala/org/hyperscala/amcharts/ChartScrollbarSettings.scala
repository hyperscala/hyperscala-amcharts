package org.hyperscala.amcharts

import org.hyperscala.javascript.JSObjectWithDefault
import org.powerscala.Color

/**
 * @author Matt Hicks <matt@outr.com>
 */
case class ChartScrollbarSettings(autoGridCount: Boolean = true,
                                  backgroundAlpha: Option[Double] = None,
                                  backgroundColor: Option[Color] = None,
                                  color: Option[Color] = None,
                                  dragIconHeight: Double = 18.0,
                                  dragIconWidth: Double = 11.0,
                                  enabled: Boolean = true,
                                  fontSize: Option[Double] = None,
                                  graph: Option[AmGraph] = None,
                                  graphFillAlpha: Option[Double] = None,
                                  graphFillColor: Option[Color] = None,
                                  graphLineAlpha: Option[Double] = None,
                                  graphLineColor: Option[Color] = None,
                                  graphType: Option[String] = None,
                                  gridAlpha: Option[Double] = None,
                                  gridColor: Option[Color] = None,
                                  gridCount: Option[Int] = None,
                                  height: Double = 40.0,
                                  hideResizeGrips: Boolean = false,
                                  markPeriodChange: Option[Boolean] = None,
                                  position: String = "bottom",
                                  scrollDuration: Option[Double] = None,
                                  selectedBackgroundAlpha: Option[Double] = None,
                                  selectedBackgroundColor: Option[Color] = None,
                                  selectedGraphFillAlpha: Option[Double] = None,
                                  selectedGraphFillColor: Option[Color] = None,
                                  selectedGraphLineAlpha: Option[Double] = None,
                                  selectedGraphLineColor: Option[Color] = None,
                                  updateOnReleaseOnly: Boolean = true,
                                  usePeriod: Option[String] = None) extends JSObjectWithDefault {
  def default = ChartScrollbarSettings.Default
}

object ChartScrollbarSettings {
  val Default = apply()
}