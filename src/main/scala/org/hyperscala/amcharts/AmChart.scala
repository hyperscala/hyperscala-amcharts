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
  object legend {
    lazy val align = property[String]("legend.align", "left")
    lazy val autoMargins = property[Boolean]("legend.autoMargins", true)
    lazy val backgroundAlpha = property[Double]("legend.backgroundAlpha", 0.0)
    lazy val backgroundColor = property[Color]("legend.backgroundColor", Color.White)
    lazy val borderAlpha = property[Double]("legend.borderAlpha", 0.0)
    lazy val borderColor = property[Color]("legend.borderColor", Color.Black)
    lazy val bottom = property[Double]("legend.bottom", 0.0)
    lazy val color = property[Color]("legend.color", Color.Black)
    lazy val divId = property[String]("legend.divId", null)
    lazy val equalWidths = property[Boolean]("legend.equalWidths", true)
    lazy val fontSize = property[Double]("legend.fontSize", 11.0)
    lazy val horizontalGap = property[Double]("legend.horizontalGap", 0.0)
    lazy val labelText = property[String]("legend.labelText", "[[title]]")
    lazy val left = property[Double]("legend.left", 0.0)
    lazy val marginBottom = property[Double]("legend.marginBottom", 0.0)
    lazy val marginLeft = property[Double]("legend.marginLeft", 20.0)
    lazy val marginRight = property[Double]("legend.marginRight", 20.0)
    lazy val marginTop = property[Double]("legend.marginTop", 0.0)
    lazy val markerBorderAlpha = property[Double]("legend.markerBorderAlpha", 1.0)
    lazy val markerBorderColor = property[Color]("legend.markerBorderColor", null)
    lazy val markerBorderThickness = property[Double]("legend.markerBorderThickness", 1.0)
    lazy val markerDisabledColor = property[Color]("legend.markerDisabledColor", Color("#aab3b3"))
    lazy val markerLabelGap = property[Double]("legend.markerLabelGap", 5.0)
    lazy val markerSize = property[Double]("legend.markerSize", 16.0)
    lazy val markerType = property[String]("legend.markerType", "square")
    lazy val maxColumns = property[Int]("legend.maxColumns", -1)
    lazy val periodValueText = property[String]("legend.periodValueText", null)
    lazy val position = property[String]("legend.position", "bottom")
    lazy val reversedOrder = property[Boolean]("legend.reversedOrder", false)
    lazy val right = property[Double]("legend.right", 0.0)
    lazy val rollOverColor = property[Color]("legend.rollOverColor", Color("#cc0000"))
    lazy val rollOverGraphAlpha = property[Double]("legend.rollOverGraphAlpha", 1.0)
    lazy val showEntries = property[Boolean]("legend.showEntries", true)
    lazy val spacing = property[Double]("legend.spacing", 10.0)
    lazy val switchable = property[Boolean]("legend.switchable", true)
    lazy val switchColor = property[Color]("legend.switchColor", Color.White)
    lazy val switchType = property[String]("legend.switchType", "x")
    lazy val textClickEnabled = property[Boolean]("legend.textClickEnabled", false)
    lazy val top = property[Double]("legend.top", 0.0)
    lazy val useGraphSettings = property[Boolean]("legend.useGraphSettings", false)
    lazy val useMarkerColorForLabels = property[Boolean]("legend.useMarkerColorForLabels", false)
    lazy val useMarkerColorForValues = property[Boolean]("legend.useMarkerColorForValues", false)
    lazy val valueAlign = property[String]("legend.valueAlign", "right")
    lazy val valueText = property[String]("legend.valueText", "[[value]]")
    lazy val valueWidth = property[Double]("legend.valueWidth", 50.0)
    lazy val verticalGap = property[Double]("legend.verticalGap", 10.0)
    lazy val width = property[Double]("legend.width", 0.0)
  }
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