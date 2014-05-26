package org.hyperscala.amcharts

import org.powerscala.Color

/**
 * @author Matt Hicks <matt@outr.com>
 */
case class Title(alpha: Double = 1.0,
                 bold: Boolean = false,
                 color: Option[Color] = None,
                 id: Option[String] = None,
                 size: Option[Double] = None,
                 text: Option[String] = None)