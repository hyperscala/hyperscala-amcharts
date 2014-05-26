package org.hyperscala.amcharts

import org.powerscala.Color

/**
 * @author Matt Hicks <matt@outr.com>
 */
trait AmSlicedChart[D] extends AmChart[D] {
  lazy val alpha = property[Double]("alpha", 1.0)
  lazy val alphaField = property[String]("alphaField", null)
  lazy val baseColor = property[Color]("baseColor", null)
  lazy val brightnessStep = property[Double]("brightnessStep", 30.0)
  lazy val colorField = property[String]("colorField", null)
  lazy val colors = property[List[Color]]("colors", AmSlicedChart.DefaultColors)
  lazy val descriptionField = property[String]("descriptionField", null)
  lazy val gradientRatio = property[List[Double]]("gradientRatio", Nil)
  lazy val groupedAlpha = property[Double]("groupedAlpha", 1.0)
  lazy val groupedColor = property[Color]("groupedColor", null)
  lazy val groupedDescription = property[String]("groupedDescription", null)
  lazy val groupedPulled = property[Boolean]("groupedPulled", false)
  lazy val groupedTitle = property[String]("groupedTitle", "Other")
  lazy val groupPercent = property[Double]("groupPercent", 0.0)
  lazy val hideLabelsPercent = property[Double]("hideLabelsPercent", 0.0)
  lazy val hoverAlpha = property[Double]("hoverAlpha", 1.0)
  lazy val labelsEnabled = property[Boolean]("labelsEnabled", true)
  lazy val labelTickAlpha = property[Double]("labelTickAlpha", 0.2)
  lazy val labelTickColor = property[Color]("labelTickColor", Color.Black)
  lazy val marginBottom = property[Double]("marginBottom", 10.0)
  lazy val marginLeft = property[Double]("marginLeft", 0.0)
  lazy val marginRight = property[Double]("marginRight", 0.0)
  lazy val marginTop = property[Double]("marginTop", 10.0)
  lazy val outlineAlpha = property[Double]("outlineAlpha", 0.0)
  lazy val outlineColor = property[Color]("outlineColor", Color.White)
  lazy val outlineThickness = property[Double]("outlineThickness", 1.0)
  lazy val patternField = property[String]("patternField", null)
  lazy val pulledField = property[String]("pulledField", null)
  lazy val pullOutDuration = property[Double]("pullOutDuration", 1.0)
  lazy val pullOutEffect = property[String]("pullOutEffect", "bounce")
  lazy val pullOutOnlyOne = property[Boolean]("pullOutOnlyOne", false)
  lazy val sequencedAnimation = property[Boolean]("sequencedAnimation", true)
  lazy val startAlpha = property[Double]("startAlpha", 0.0)
  lazy val startDuration = property[Double]("startDuration", 1.0)
  lazy val startEffect = property[String]("startEffect", "bounce")
  lazy val titleField = property[String]("titleField", null)
  lazy val urlField = property[String]("urlField", null)
  lazy val urlTarget = property[String]("urlTarget", "_self")
  lazy val valueField = property[String]("valueField", null)
  lazy val visibleInLegendField = property[String]("visibleInLegendField", null)
}

object AmSlicedChart {
  val DefaultColors = List("#FF0F00", "#FF6600", "#FF9E01", "#FCD202", "#F8FF01", "#B0DE09", "#04D215", "#0D8ECF", "#0D52D1", "#2A0CD0", "#8A0CCF", "#CD0D74", "#754DEB", "#DDDDDD", "#999999", "#333333", "#000000", "#57032A", "#CA9726", "#990000", "#4B0C25").map(s => Color(s))
}