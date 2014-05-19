package org.hyperscala.amcharts

import org.powerscala.Color

/**
 * @author Matt Hicks <matt@outr.com>
 */
trait AmSlicedChart[D] extends AmChart[D] {
  val titleField = property[String]("titleField", null)
  val valueField = property[String]("valueField", null)
  val outlineColor = property("outlineColor", Color.White)
  val outlineAlpha = property("outlineAlpha", 0.0)
  val outlineThickness = property("outlineThickness", 1.0)
}
