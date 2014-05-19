package org.hyperscala.amcharts

import org.hyperscala.html._

/**
 * @author Matt Hicks <matt@outr.com>
 */
class AmPieChart[D](val wrapped: tag.Div)(implicit val manifest: Manifest[D]) extends AmSlicedChart[D] {
  def chartType = "AmPieChart"

  val autoInit = false
}