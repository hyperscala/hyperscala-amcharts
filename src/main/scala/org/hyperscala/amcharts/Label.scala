package org.hyperscala.amcharts

import org.powerscala.Color

/**
 * @author Matt Hicks <matt@outr.com>
 */
case class Label(align: String = "left",
                 alpha: Double = 1.0,
                 bold: Boolean = false,
                 color: Option[Color] = None,
                 id: Option[String] = None,
                 rotation: Double = 0.0,
                 size: Option[Double] = None,
                 text: Option[String] = None,
                 url: Option[String] = None,
                 x: Option[String] = None,
                 y: Option[String] = None)