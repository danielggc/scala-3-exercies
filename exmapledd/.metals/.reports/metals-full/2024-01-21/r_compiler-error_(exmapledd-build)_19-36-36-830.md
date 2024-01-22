file://<WORKSPACE>/build.sbt
### file%3A%2F%2F%2Fhome%2Fdgc7%2Fproyectos%2Fscala%2Fexercies%2Fexmapledd%2Fbuild.sbt:11: error: illegal start of simple expression
  .enablePlugins(ScalaJSPlugin)
  ^

occurred in the presentation compiler.

action parameters:
uri: file://<WORKSPACE>/build.sbt
text:
```scala
import _root_.scala.xml.{TopScope=>$scope}
import _root_.sbt._
import _root_.sbt.Keys._
import _root_.sbt.nio.Keys._
import _root_.sbt.ScriptedPlugin.autoImport._, _root_.sbt.plugins.JUnitXmlReportPlugin.autoImport._, _root_.sbt.plugins.MiniDependencyTreePlugin.autoImport._, _root_.bloop.integrations.sbt.BloopPlugin.autoImport._, _root_.org.scalajs.sbtplugin.ScalaJSPlugin.autoImport._, _root_.org.portablescala.sbtplatformdeps.PlatformDepsPlugin.autoImport._
import _root_.sbt.plugins.IvyPlugin, _root_.sbt.plugins.JvmPlugin, _root_.sbt.plugins.CorePlugin, _root_.sbt.ScriptedPlugin, _root_.sbt.plugins.SbtPlugin, _root_.sbt.plugins.SemanticdbPlugin, _root_.sbt.plugins.JUnitXmlReportPlugin, _root_.sbt.plugins.Giter8TemplatePlugin, _root_.sbt.plugins.MiniDependencyTreePlugin, _root_.bloop.integrations.sbt.BloopPlugin, _root_.org.scalajs.sbtplugin.ScalaJSJUnitPlugin, _root_.org.scalajs.sbtplugin.ScalaJSPlugin, _root_.org.portablescala.sbtplatformdeps.PlatformDepsPlugin
import org.scalajs.linker.interface.ModuleSplitStyle


lazy val frontend = 
  .enablePlugins(ScalaJSPlugin)
  .enablePlugins(ScalablyTypedConverterExternalNpmPlugin)
  .settings(
    scalaVersion := "3.3.0",

    // Tell Scala.js that this is an application with a main method
    scalaJSUseMainModuleInitializer := true,

    /* Configure Scala.js to emit modules in the optimal way to
     * connect to Vite's incremental reload.
     * - emit ECMAScript modules
     * - emit as many small modules as possible for classes in the "org" package
     * - emit as few (large) modules as possible for all other classes
     *   (in particular, for the standard library)
     */
    scalaJSLinkerConfig ~= {
      _.withModuleKind(ModuleKind.ESModule)
        .withModuleSplitStyle(
          ModuleSplitStyle.SmallModulesFor(List("org")))
    },
    libraryDependencies += "org.scala-js" %%% "scalajs-dom" % "2.4.0",
    libraryDependencies += "com.raquo" %%% "laminar" % "16.0.0",
    libraryDependencies += "com.raquo" %%% "airstream" % "16.0.0",
    libraryDependencies += "be.doeraene" %%% "web-components-ui5" % "1.10.0",
    libraryDependencies += "dev.optics" %% "monocle-core" % "3.1.0",
    libraryDependencies += "dev.optics" %% "monocle-macro" % "3.1.0",
    libraryDependencies += "com.github.japgolly.scalacss" %%% "core" % "1.0.0",
    libraryDependencies += "com.raquo" %%% "waypoint" % "7.0.0",
    libraryDependencies += "be.doeraene" %%% "url-dsl" % "0.6.0",
    libraryDependencies += "com.lihaoyi" %%% "upickle" % "3.1.2",
    libraryDependencies += "org.typelevel" %%% "cats-core" % "2.9.0",
    libraryDependencies += "org.typelevel" %%% "cats-kernel" % "2.9.0",
    libraryDependencies += "io.laminext" %%% "fetch" % "0.16.2",
    libraryDependencies += "org.scala-js" %%% "scala-js-macrotask-executor" % "1.1.1",
    libraryDependencies += "org.webjars.npm" % "jszip" % "3.8.0",

    externalNpm := baseDirectory.value,

  )
```



#### Error stacktrace:

```
scala.meta.internal.parsers.ScalametaParser.simpleExpr0(ScalametaParser.scala:2290)
	scala.meta.internal.parsers.ScalametaParser.simpleExpr(ScalametaParser.scala:2243)
	scala.meta.internal.parsers.ScalametaParser.prefixExpr(ScalametaParser.scala:2226)
	scala.meta.internal.parsers.ScalametaParser.postfixExpr(ScalametaParser.scala:2100)
	scala.meta.internal.parsers.ScalametaParser.$anonfun$expr$2(ScalametaParser.scala:1682)
	scala.meta.internal.parsers.ScalametaParser.atPosOpt(ScalametaParser.scala:322)
	scala.meta.internal.parsers.ScalametaParser.autoPosOpt(ScalametaParser.scala:366)
	scala.meta.internal.parsers.ScalametaParser.expr(ScalametaParser.scala:1587)
	scala.meta.internal.parsers.ScalametaParser.expr(ScalametaParser.scala:1486)
	scala.meta.internal.parsers.ScalametaParser.$anonfun$patDefOrDcl$1(ScalametaParser.scala:3609)
	scala.meta.internal.parsers.ScalametaParser.autoEndPos(ScalametaParser.scala:368)
	scala.meta.internal.parsers.ScalametaParser.autoEndPos(ScalametaParser.scala:373)
	scala.meta.internal.parsers.ScalametaParser.patDefOrDcl(ScalametaParser.scala:3596)
	scala.meta.internal.parsers.ScalametaParser.defOrDclOrSecondaryCtor(ScalametaParser.scala:3558)
	scala.meta.internal.parsers.ScalametaParser.nonLocalDefOrDcl(ScalametaParser.scala:3543)
	scala.meta.internal.parsers.ScalametaParser$$anonfun$1.applyOrElse(ScalametaParser.scala:4404)
	scala.meta.internal.parsers.ScalametaParser$$anonfun$1.applyOrElse(ScalametaParser.scala:4399)
	scala.PartialFunction.$anonfun$runWith$1$adapted(PartialFunction.scala:145)
	scala.meta.internal.parsers.ScalametaParser.statSeqBuf(ScalametaParser.scala:4462)
	scala.meta.internal.parsers.ScalametaParser.$anonfun$batchSource$13(ScalametaParser.scala:4696)
	scala.Option.getOrElse(Option.scala:189)
	scala.meta.internal.parsers.ScalametaParser.$anonfun$batchSource$1(ScalametaParser.scala:4696)
	scala.meta.internal.parsers.ScalametaParser.atPos(ScalametaParser.scala:319)
	scala.meta.internal.parsers.ScalametaParser.autoPos(ScalametaParser.scala:365)
	scala.meta.internal.parsers.ScalametaParser.batchSource(ScalametaParser.scala:4652)
	scala.meta.internal.parsers.ScalametaParser.$anonfun$source$1(ScalametaParser.scala:4645)
	scala.meta.internal.parsers.ScalametaParser.atPos(ScalametaParser.scala:319)
	scala.meta.internal.parsers.ScalametaParser.autoPos(ScalametaParser.scala:365)
	scala.meta.internal.parsers.ScalametaParser.source(ScalametaParser.scala:4645)
	scala.meta.internal.parsers.ScalametaParser.entrypointSource(ScalametaParser.scala:4650)
	scala.meta.internal.parsers.ScalametaParser.parseSourceImpl(ScalametaParser.scala:135)
	scala.meta.internal.parsers.ScalametaParser.$anonfun$parseSource$1(ScalametaParser.scala:132)
	scala.meta.internal.parsers.ScalametaParser.parseRuleAfterBOF(ScalametaParser.scala:59)
	scala.meta.internal.parsers.ScalametaParser.parseRule(ScalametaParser.scala:54)
	scala.meta.internal.parsers.ScalametaParser.parseSource(ScalametaParser.scala:132)
	scala.meta.parsers.Parse$.$anonfun$parseSource$1(Parse.scala:29)
	scala.meta.parsers.Parse$$anon$1.apply(Parse.scala:36)
	scala.meta.parsers.Api$XtensionParseDialectInput.parse(Api.scala:25)
	scala.meta.internal.semanticdb.scalac.ParseOps$XtensionCompilationUnitSource.toSource(ParseOps.scala:17)
	scala.meta.internal.semanticdb.scalac.TextDocumentOps$XtensionCompilationUnitDocument.toTextDocument(TextDocumentOps.scala:206)
	scala.meta.internal.pc.SemanticdbTextDocumentProvider.textDocument(SemanticdbTextDocumentProvider.scala:54)
	scala.meta.internal.pc.ScalaPresentationCompiler.$anonfun$semanticdbTextDocument$1(ScalaPresentationCompiler.scala:374)
```
#### Short summary: 

file%3A%2F%2F%2Fhome%2Fdgc7%2Fproyectos%2Fscala%2Fexercies%2Fexmapledd%2Fbuild.sbt:11: error: illegal start of simple expression
  .enablePlugins(ScalaJSPlugin)
  ^