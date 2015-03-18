package org.hyperscala.amcharts.example

import org.hyperscala.html._
import org.hyperscala.web.Webpage
import org.hyperscala.javascript.JSObject
import org.hyperscala.amcharts.{AmPieChart, AmChart, AmCharts}
import org.hyperscala.realtime._
import org.powerscala.Color

/**
 * @author Matt Hicks <matt@outr.com>
 */
class PieSimplePage extends Webpage {
  require(Realtime)
  require(AmCharts)

  val chartDiv = new tag.Div(id = "chartdiv") {
    style.width := 100.pct
    style.height := 400.px
  }
  body.contents += chartDiv

  val data = List(
    CountryData("Czech Republic", 301.90),
    CountryData("Ireland", 201.10),
    CountryData("Germany", 165.80),
    CountryData("Australia", 139.90),
    CountryData("Austria", 128.30),
    CountryData("UK", 99.00),
    CountryData("Belgium", 60.00)
  )
  val chart = AmChart(new AmPieChart[CountryData](chartDiv) {
    dataProvider := data
    titleField := "country"
    valueField := "litres"
    outlineColor := Color.White
    outlineAlpha := 0.8
    outlineThickness := 2.0
  })

  body.contents += new tag.Button(content = "Change") {
    clickEvent.onRealtime {
      case evt => {
        chart.dataProvider := List(
          CountryData("Czech Republic", 301.90),
          CountryData("Ireland", 201.10),
          CountryData("Germany", 165.80),
          CountryData("Australia", 139.90)
        )
      }
    }
  }
}

case class CountryData(country: String, litres: Double) extends JSObject