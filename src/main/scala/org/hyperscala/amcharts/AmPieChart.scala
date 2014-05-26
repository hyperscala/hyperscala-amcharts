package org.hyperscala.amcharts

import org.hyperscala.html._

/**
 * @author Matt Hicks <matt@outr.com>
 */
class AmPieChart[D](val wrapped: tag.Div)(implicit val manifest: Manifest[D]) extends AmSlicedChart[D] {
  def chartType = "AmPieChart"

  lazy val angle = property[Double]("angle", 0.0)
  lazy val balloonText = property[String]("balloonText", "[[title]]: [[percents]]% ([[value]])[[description]]")
  lazy val depth3D = property[Double]("depth3D", 0.0)
  lazy val innerRadius = property[String]("innerRadius", "0")
  lazy val labelRadius = property[Double]("labelRadius", 20.0)
  lazy val labelRadiusField = property[String]("labelRadiusField", null)
  lazy val labelText = property[String]("labelText", "[[title]]: [[percents]]%")
  lazy val minRadius = property[Double]("minRadius", 10.0)
  lazy val pieAlpha = property[Double]("pieAlpha", 1.0)
  lazy val pieX = property[String]("pieX", null)
  lazy val pieY = property[String]("pieY", null)
  lazy val pullOutRadius = property[String]("pullOutRadius", "20%")
  lazy val radius = property[String]("radius", null)
  lazy val startAngle = property[Double]("startAngle", 90.0)
  lazy val startRadius = property[String]("startRadius", "500%")
}