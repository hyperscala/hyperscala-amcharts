name := "hyperscala-amcharts"

organization := "org.hyperscala"

version := "0.10.2-SNAPSHOT"

scalaVersion := "2.11.7"

libraryDependencies += "org.hyperscala" %% "hyperscala-ui" % "0.10.2-SNAPSHOT"

libraryDependencies += "com.outr.net" %% "outrnet-jetty" % "1.1.6-SNAPSHOT"

libraryDependencies += "org.scalatest" %% "scalatest" % "2.2.5" % "test"

testOptions in Test += Tests.Argument("-oDF")

seq(Revolver.settings: _*)
