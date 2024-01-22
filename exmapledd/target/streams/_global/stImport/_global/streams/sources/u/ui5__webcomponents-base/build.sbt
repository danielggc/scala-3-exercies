organization := "org.scalablytyped"
name := "ui5__webcomponents-base"
version := "1.10.0-63d406"
scalaVersion := "3.3.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scala-js" %%% "scalajs-dom" % "2.3.0",
  "org.scalablytyped" %%% "lit-html" % "2.8.0-256b33",
  "org.scalablytyped" %%% "std" % "4.9-569980",
  "org.scalablytyped" %%% "trusted-types" % "2.0.7-533186")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
