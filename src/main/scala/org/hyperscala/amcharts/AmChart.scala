package org.hyperscala.amcharts

import org.hyperscala.web.WrappedComponent
import org.hyperscala.html._
import org.hyperscala.javascript.JavaScriptContent
import org.hyperscala.realtime.Realtime
import org.hyperscala.selector.Selector
import org.powerscala.Color

/**
 * @author Matt Hicks <matt@outr.com>
 */
trait AmChart[D] extends WrappedComponent[tag.Div] {
  protected def chartType: String

  val autoInit = false
  implicit def manifest: Manifest[D]

  lazy val allLabels = property[List[Label]]("allLabels", Nil)
  object amExport {
    lazy val bottom = property[String]("amExport.bottom", null)
    lazy val buttonAlpha = property[Double]("amExport.buttonAlpha", 0.75)
    lazy val buttonIcon = property[String]("amExport.buttonIcon", "export.png")
    lazy val buttonRollOverColor = property[Color]("amExport.buttonRollOverColor", Color("#efefef"))
    lazy val buttonTitle = property[String]("amExport.buttonTitle", "Save chart as an image")
    lazy val exportJPG = property[Boolean]("amExport.exportJPG", false)
    lazy val exportPDF = property[Boolean]("amExport.exportPDF", false)
    lazy val exportPNG = property[Boolean]("amExport.exportPNG", true)
    lazy val exportSVG = property[Boolean]("amExport.exportSVG", false)
    lazy val imageBackgroundColor = property[Color]("amExport.imageBackgroundColor", Color.White)
    lazy val imageFileName = property[String]("amExport.imageFileName", "amChart")
    lazy val left = property[String]("amExport.left", null)
    lazy val right = property[String]("amExport.right", null)
    lazy val textRollOverColor = property[Color]("amExport.textRollOverColor", Color("#cc0000"))
    lazy val top = property[String]("amExport.top", null)
  }
  lazy val backgroundAlpha = property[Double]("backgroundAlpha", 0.0)
  lazy val backgroundColor = property[Color]("backgroundColor", Color.White)
  object balloon {
    lazy val adjustBorderColor = property[Boolean]("balloon.adjustBorderColor", false)
    lazy val borderAlpha = property[Double]("balloon.borderAlpha", 1.0)
    lazy val borderColor = property[Color]("balloon.borderColor", Color.White)
    lazy val borderThickness = property[Double]("balloon.borderThickness", 2.0)
    lazy val color = property[Color]("balloon.color", Color.White)
    lazy val cornerRadius = property[Double]("balloon.cornerRadius", 6.0)
    lazy val fillAlpha = property[Double]("balloon.fillAlpha", 1.0)
    lazy val fillColor = property[Color]("balloon.fillColor", Color("#cc0000"))
    lazy val fontSize = property[Double]("balloon.fontSize", 0.0)
    lazy val horizontalPadding = property[Double]("balloon.horizontalPadding", 8.0)
    lazy val pointerWidth = property[Double]("balloon.pointerWidth", 10.0)
    lazy val showBullet = property[Boolean]("balloon.showBullet", false)
    lazy val textAlign = property[String]("balloon.textAlign", "middle")
    lazy val textShadowColor = property[Color]("balloon.textShadowColor", Color.Black)
    lazy val verticalPadding = property[Double]("balloon.verticalPadding", 5.0)
  }
  lazy val borderAlpha = property[Double]("borderAlpha", 0.0)
  lazy val borderColor = property[Color]("borderColor", Color.Black)
  lazy val color = property[Color]("color", Color.Black)
  lazy val creditsPosition = property[String]("creditsPosition", "top-left")
  lazy val dataProvider = property[Seq[D]]("dataProvider", Nil)
  lazy val decimalSeparator = property[String]("decimalSeparator", ".")
  lazy val fontFamily = property[String]("fontFamily", "Verdana")
  lazy val fontSize = property[Double]("fontSize", 11.0)
  lazy val handDrawn = property[Boolean]("handDrawn", false)
  lazy val handDrawnScatter = property[Double]("handDrawnScatter", 2.0)
  lazy val handDrawnThickness = property[Double]("handDrawnThickness", 1.0)
  lazy val hideBalloonTime = property[Long]("hideBalloonTime", 150)
  lazy val language = property[String]("language", null)
  lazy val legend = property[Legend]("legend", null)
  lazy val legendDiv = property[String]("legendDiv", null)
  lazy val panEventsEnabled = property[Boolean]("panEventsEnabled", true)
  lazy val pathToImages = property[String]("pathToImages", null)
  lazy val percentPrecision = property[Double]("percentPrecision", 2.0)
  lazy val precision = property[Double]("precision", -1.0)
  lazy val theme = property[String]("theme", "none")
  lazy val thousandsSeparator = property[String]("thousandsSeparator", ",")
  lazy val titles = property[List[Title]]("titles", Nil)
  lazy val usePrefixes = property[Boolean]("usePrefixes", false)

  override protected def initializeComponent(values: Map[String, Any]) = {
    val b = new StringBuilder
    b.append(s"var chart = new AmCharts.$chartType();\r\n")
    values.foreach {
      case (key, value) => {
        b.append(s"chart.${key} = ${JavaScriptContent.toJS(value)};\r\n")
      }
    }
    val id = wrapped.identity
    b.append(s"$$('#$id').data('chart', chart);\r\n")
    b.append(s"""chart.write("$id");\r\n""")
    println(s"Sending: $b")
    Realtime.sendJavaScript(webpage, b.toString(), onlyRealtime = false, selector = Some(Selector.id(id)))
  }

  override protected def modify(key: String, value: Any) = {
    val script = s"""$$('#${wrapped.identity}').data('chart').$key = ${JavaScriptContent.toJS(value)};"""
    val js = if (key == "dataProvider") {
      s"$script $$('#${wrapped.identity}').data('chart').validateData();"
    } else {
      script
    }
    Realtime.sendJavaScript(webpage, js, onlyRealtime = false, selector = Some(Selector.id(wrapped)))
  }
}

object AmChart {
  def apply[D](chart: AmChart[D]) = {
    chart.init()
    chart
  }
}