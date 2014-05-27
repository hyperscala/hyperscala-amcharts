package org.hyperscala.amcharts

/**
 * @author Matt Hicks <matt@outr.com>
 */
case class Pattern(url: String,
                   width: Int,
                   height: Int,
                   x: Option[Int] = None,
                   y: Option[Int] = None,
                   randomX: Option[Int] = None,
                   randomY: Option[Int] = None)