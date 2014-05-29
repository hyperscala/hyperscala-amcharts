package org.hyperscala.amcharts

import org.hyperscala.javascript.JSObject

/**
 * @author Matt Hicks <matt@outr.com>
 */
case class Period(period: String, count: Int, label: String, selected: Boolean = false) extends JSObject