package org.hyperscala.amcharts

import org.hyperscala.javascript.JSObject
import org.powerscala.Color
import java.util.Date
import org.powerscala.reflect.CaseValue

/**
 * @author Matt Hicks <matt@outr.com>
 */
case class StockEvent(backgroundAlpha: Double = 1.0,
                      backgroundColor: Color = Color("#dadada"),
                      borderAlpha: Double = 1.0,
                      borderColor: Color = Color("#888888"),
                      color: Color = Color.Black,
                      date: Option[Date] = None,
                      description: Option[String] = None,
                      graph: Option[StockGraph] = None,
                      rollOverColor: Color = Color("#cc0000"),
                      showOnAxis: Boolean = false,
                      text: Option[String] = None,
                      eventType: String = "sign",
                      url: Option[String] = None,
                      urlTarget: Option[String] = None) extends JSObject {
  override protected def fieldName(cv: CaseValue) = cv.name match {
    case "eventType" => Some("type")
    case _ => super.fieldName(cv)
  }
}