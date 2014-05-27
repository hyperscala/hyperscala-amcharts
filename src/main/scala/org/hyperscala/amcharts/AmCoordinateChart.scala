package org.hyperscala.amcharts

import org.powerscala.Color

/**
 * @author Matt Hicks <matt@outr.com>
 */
trait AmCoordinateChart[D] extends AmChart[D] {
  lazy val colors = property[List[Color]]("colors", AmCoordinateChart.DefaultColors)
  lazy val graphs = property[List[AmGraph]]("graphs", Nil)
  lazy val gridAboveGraphs = property[Boolean]("gridAboveGraphs", false)
  lazy val guides = property[List[Guide]]("guides", Nil)
  lazy val sequencedAnimation = property[Boolean]("sequencedAnimation", true)
  lazy val startAlpha = property[Double]("startAlpha", 0.0)
  lazy val startDuration = property[Double]("startDuration", 1.0)
  lazy val startEffect = property[String]("startEffect", "bounce")
  lazy val urlTarget = property[String]("urlTarget", "_self")
  lazy val valueAxes = property[List[ValueAxis]]("valueAxes", List(ValueAxis()))
}

object AmCoordinateChart {
  val DefaultColors = List("#FF6600", "#FCD202", "#B0DE09", "#0D8ECF", "#2A0CD0", "#CD0D74", "#CC0000", "#00CC00", "#0000CC", "#DDDDDD", "#999999", "#333333", "#990000").map(Color(_))
}