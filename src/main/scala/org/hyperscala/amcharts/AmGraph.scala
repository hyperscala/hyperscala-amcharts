package org.hyperscala.amcharts

import org.powerscala.Color
import org.hyperscala.javascript.dsl.JSFunction1
import org.hyperscala.javascript.JSObjectWithDefault
import org.powerscala.reflect.CaseValue

/**
 * @author Matt Hicks <matt@outr.com>
 */
case class AmGraph(alphaField: Option[String] = None,
                   balloonColor: Option[Color] = None,
                   balloonFunction: Option[JSFunction1[Any, Unit]] = None,
                   balloonText: String = "[[value]]",
                   behindColumns: Boolean = false,
                   bullet: String = "none",
                   bulletAlpha: Double = 1.0,
                   bulletAxis: Option[ValueAxis] = None,
                   bulletBorderAlpha: Double = 0.0,
                   bulletBorderColor: Option[Color] = None,
                   bulletBorderThickness: Double = 2.0,
                   bulletColor: Option[Color] = None,
                   bulletField: Option[String] = None,
                   bulletOffset: Double = 0.0,
                   bulletSize: Double = 8.0,
                   bulletSizeField: Option[String] = None,
                   closeField: Option[String] = None,
                   clustered: Boolean = true,
                   color: Option[Color] = None,
                   colorField: Option[String] = None,
                   columnWidth: Option[Double] = None,
                   connect: Boolean = true,
                   cornerRadiusTop: Double = 0.0,
                   cursorBulletAlpha: Double = 1.0,
                   customBullet: Option[String] = None,
                   customBulletField: Option[String] = None,
                   customMarker: Option[String] = None,
                   dashLength: Double = 0.0,
                   dashLengthField: Option[String] = None,
                   descriptionField: Option[String] = None,
                   errorField: Option[String] = None,
                   fillAlphas: Double = 0.0,
                   fillColors: Option[Color] = None,
                   fillColorsField: Option[String] = None,
                   fillToGraph: Option[AmGraph] = None,
                   fontSize: Option[Double] = None,
                   gradientOrientation: String = "vertical",
                   hidden: Boolean = false,
                   hideBulletsCount: Int = 0,
                   highField: Option[String] = None,
                   id: Option[String] = None,
                   includeInMinMax: Boolean = true,
                   labelColorField: Option[String] = None,
                   labelPosition: String = "top",
                   labelText: Option[String] = None,
                   legendAlpha: Option[Double] = None,
                   legendColor: Option[Color] = None,
                   legendPeriodValueText: Option[String] = None,
                   legendValueText: Option[String] = None,
                   lineAlpha: Double = 1.0,
                   lineColor: Option[Color] = None,
                   lineColorField: Option[String] = None,
                   lineThickness: Double = 1.0,
                   lowField: Option[String] = None,
                   markerType: Option[String] = None,
                   maxBulletSize: Double = 50.0,
                   minDistance: Double = 1.0,
                   negativeBase: Double = 0.0,
                   negativeFillAlphas: Option[Double] = None,
                   negativeFillColors: Option[Color] = None,
                   negativeLineAlpha: Double = 1.0,
                   negativeLineColor: Option[Color] = None,
                   newStack: Boolean = false,
                   noStepRisers: Boolean = false,
                   openField: Option[String] = None,
                   pattern: Option[Pattern] = None,
                   patternField: Option[String] = None,
                   periodSpan: Double = 1.0,
                   pointPosition: String = "middle",
                   precision: Option[Double] = None,
                   showAllValueLabels: Boolean = false,
                   showBalloon: Boolean = true,
                   showBalloonAt: String = "close",
                   showBulletsAt: String = "close",
                   showHandOnHover: Boolean = false,
                   stackable: Boolean = true,
                   title: Option[String] = None,
                   graphType: String = "line",
                   urlField: Option[String] = None,
                   urlTarget: Option[String] = None,
                   valueAxis: ValueAxis = ValueAxis(),
                   valueField: Option[String] = None,
                   visibleInLegend: Boolean = true,
                   xAxis: ValueAxis = ValueAxis(),
                   xField: Option[String] = None,
                   yAxis: ValueAxis = ValueAxis(),
                   yField: Option[String] = None) extends JSObjectWithDefault {
  override def default = AmGraph.Default

  override protected def fieldName(cv: CaseValue) = cv.name match {
    case "graphType" => Some("type")
    case _ => super.fieldName(cv)
  }
}

object AmGraph {
  val Default = apply()
}