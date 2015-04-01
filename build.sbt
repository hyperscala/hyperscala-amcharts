name := "hyperscala-amcharts"

organization := "org.hyperscala"

version := "0.10.1-SNAPSHOT"

scalaVersion := "2.11.6"

libraryDependencies += "org.hyperscala" %% "hyperscala-ui" % "0.10.1-SNAPSHOT"

libraryDependencies += "com.outr.net" %% "outrnet-jetty" % "1.1.5-SNAPSHOT"

libraryDependencies += "org.scalatest" %% "scalatest" % "2.2.4" % "test"

testOptions in Test += Tests.Argument("-oDF")

seq(Revolver.settings: _*)
