package org.hyperscala.amcharts

import org.powerscala.Color
import org.hyperscala.javascript.JSObjectWithDefault

/**
 * @author Matt Hicks <matt@outr.com>
 */
case class ChartCursor(adjustment: Double = 0.0,
                       animationDuration: Double = 0.3,
                       bulletsEnabled: Boolean = false,
                       bulletSize: Double = 8.0,
                       categoryBalloonAlpha: Double = 1.0,
                       categoryBalloonColor: Option[Color] = None,
                       categoryBalloonDateFormat: String = "MMM DD, YYYY",
                       categoryBalloonEnabled: Boolean = true,
                       color: Color = Color.White,
                       cursorAlpha: Double = 1.0,
                       cursorColor: Color = Color("#cc0000"),
                       cursorPosition: String = "middle",
                       enabled: Boolean = true,
                       fullWidth: Boolean = false,
                       graphBulletSize: Double = 1.7,
                       oneBalloonOnly: Boolean = false,
                       pan: Boolean = false,
                       selectionAlpha: Double = 0.2,
                       selectWithoutZooming: Boolean = false,
                       showNextAvailable: Boolean = false,
                       valueBalloonsEnabled: Boolean = true,
                       zoomable: Boolean = true) extends JSObjectWithDefault {
  override def default = ChartCursor.Default
}

object ChartCursor {
  val Default = apply()
}