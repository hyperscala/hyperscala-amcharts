package org.hyperscala.amcharts

import org.hyperscala.web.WrappedComponent
import org.hyperscala.html._
import org.hyperscala.javascript.JavaScriptContent
import org.hyperscala.realtime.Realtime
import org.hyperscala.selector.Selector

/**
 * @author Matt Hicks <matt@outr.com>
 */
trait AmChart[D] extends WrappedComponent[tag.Div] {
  protected def chartType: String

  implicit def manifest: Manifest[D]

  val dataProvider = property[Seq[D]]("dataProvider", Nil)

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