import org.scalajs.linker.interface.ModuleSplitStyle

lazy val frontend = project.in(file("app"))
  .enablePlugins(ScalaJSPlugin)
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
      //  libraryDependencies += "com.github.jwt-scala" %% "jwt-circe" % "9.4.4"


  )