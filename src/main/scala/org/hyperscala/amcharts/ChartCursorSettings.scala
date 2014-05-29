package org.hyperscala.amcharts

import org.hyperscala.javascript.JSObjectWithDefault
import org.powerscala.Color

/**
 * @author Matt Hicks <matt@outr.com>
 */
case class ChartCursorSettings(balloonPointerOrientation: String = "horizontal",
                               bulletsEnabled: Option[Boolean] = None,
                               bulletSize: Option[Double] = None,
                               categoryBalloonAlpha: Option[Double] = None,
                               categoryBalloonColor: Option[Color] = None,
                               categoryBalloonDateFormats: List[DateFormat] = ChartCursorSettings.DefaultDateFormats,
                               categoryBalloonEnabled: Option[Boolean] = None,
                               cursorAlpha: Option[Double] = None,
                               cursorColor: Option[Color] = None,
                               cursorPosition: Option[String] = None,
                               enabled: Boolean = true,
                               pan: Option[Boolean] = None,
                               valueBalloonsEnabled: Boolean = false,
                               zoomable: Option[Boolean] = None) extends JSObjectWithDefault {
  def default = ChartCursorSettings.Default
}

object ChartCursorSettings {
  val Default = apply()
  val DefaultDateFormats = List(
    DateFormat("YYYY", "YYYY"),
    DateFormat("MM", "MMM, YYYY"),
    DateFormat("WW", "MMM DD, YYYY"),
    DateFormat("DD", "MMM DD, YYYY"),
    DateFormat("hh", "JJ:NN"),
    DateFormat("mm", "JJ:NN"),
    DateFormat("ss", "JJ:NN:SS"),
    DateFormat("fff", "JJ:NN:SS")
  )
}