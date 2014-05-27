package org.hyperscala.amcharts

import org.powerscala.Color
import java.util.Date

/**
 * @author Matt Hicks <matt@outr.com>
 */
case class Guide(above: Boolean = false,
                 angle: Option[Double] = None,
                 balloonColor: Option[Color] = None,
                 balloonText: Option[String] = None,
                 category: Option[String] = None,
                 dashLength: Option[Double] = None,
                 date: Option[Date] = None,
                 fillAlpha: Option[Double] = None,
                 fillColor: Option[Color] = None,
                 fontSize: Option[Double] = None,
                 id: Option[String] = None,
                 inside: Option[Boolean] = None,
                 label: Option[String] = None,
                 labelRotation: Option[Double] = None,
                 lineAlpha: Option[Double] = None,
                 lineColor: Option[Color] = None,
                 lineThickness: Option[Double] = None,
                 position: Option[String] = None,
                 tickLength: Option[Double] = None,
                 toAngle: Option[Double] = None,
                 toCategory: Option[String] = None,
                 toDate: Option[Date] = None,
                 toValue: Option[Double] = None,
                 value: Option[Double] = None,
                 valueAxis: Option[ValueAxis] = None)
