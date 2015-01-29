name := "hyperscala-amcharts"

organization := "org.hyperscala"

version := "1.0"

scalaVersion := "2.11.4"

libraryDependencies += "org.hyperscala" %% "hyperscala-ui" % "0.9.3"

libraryDependencies += "com.outr.net" %% "outrnet-jetty" % "1.1.3"

libraryDependencies += "org.scalatest" %% "scalatest" % "latest.release" % "test"

testOptions in Test += Tests.Argument("-oDF")

seq(Revolver.settings: _*)
