name := "hyperscala-amcharts"

organization := "org.hyperscala"

version := "1.0"

scalaVersion := "2.10.3"

libraryDependencies += "org.hyperscala" %% "hyperscala-ui" % "latest.integration"

libraryDependencies += "com.outr.net" %% "outrnet-jetty" % "latest.integration"

libraryDependencies += "org.scalatest" % "scalatest_2.10" % "latest.release" % "test"

testOptions in Test += Tests.Argument("-oDF")

seq(Revolver.settings: _*)
