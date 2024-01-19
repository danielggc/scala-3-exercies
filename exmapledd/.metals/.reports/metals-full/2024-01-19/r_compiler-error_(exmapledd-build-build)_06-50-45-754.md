jar:file://<HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/org/scala-sbt/main_2.12/1.9.6/main_2.12-1.9.6-sources.jar!/sbt/nio/Watch.scala
### java.lang.AssertionError: assertion failed: 
  Event
     while compiling: jar:file://<HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/org/scala-sbt/main_2.12/1.9.6/main_2.12-1.9.6-sources.jar!/sbt/nio/Watch.scala
        during phase: globalPhase=<no phase>, enteringPhase=typer
     library version: version 2.12.18
    compiler version: version 2.12.18
  reconstructed args: -deprecation -Wconf:cat=unused-nowarn:s -Wconf:cat=unused-nowarn:s -Wconf:cat=unused-nowarn:s -Wconf:cat=deprecation:w -Wconf:cat=deprecation:ws -Wconf:cat=feature:ws -Wconf:cat=optimizer:ws -classpath <WORKSPACE>/project/project/.bloop/exmapledd-build-build/bloop-bsp-clients-classes/classes-Metals-0-XXoQk1SAOlmGrWvlG9jw==:<HOME>/.cache/bloop/semanticdb/com.sourcegraph.semanticdb-javac.0.9.8/semanticdb-javac-0.9.8.jar:<HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/org/scala-sbt/sbt/1.9.6/sbt-1.9.6.jar:<HOME>/.sbt/boot/scala-2.12.18/lib/scala-library.jar:<HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/ch/epfl/scala/sbt-bloop_2.12_1.0/1.5.13/sbt-bloop-1.5.13.jar:<HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/org/scala-sbt/main_2.12/1.9.6/main_2.12-1.9.6.jar:<HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/org/scala-sbt/io_2.12/1.9.1/io_2.12-1.9.1.jar:<HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/ch/epfl/scala/bloop-config_2.12/1.5.5/bloop-config_2.12-1.5.5.jar:<HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/org/scala-sbt/logic_2.12/1.9.6/logic_2.12-1.9.6.jar:<HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/org/scala-sbt/actions_2.12/1.9.6/actions_2.12-1.9.6.jar:<HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/org/scala-sbt/main-settings_2.12/1.9.6/main-settings_2.12-1.9.6.jar:<HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/org/scala-sbt/run_2.12/1.9.6/run_2.12-1.9.6.jar:<HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/org/scala-sbt/command_2.12/1.9.6/command_2.12-1.9.6.jar:<HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/org/scala-sbt/collections_2.12/1.9.6/collections_2.12-1.9.6.jar:<HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/org/scala-sbt/scripted-plugin_2.12/1.9.6/scripted-plugin_2.12-1.9.6.jar:<HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/org/scala-sbt/zinc-lm-integration_2.12/1.9.6/zinc-lm-integration_2.12-1.9.6.jar:<HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/org/scala-sbt/util-logging_2.12/1.9.6/util-logging_2.12-1.9.6.jar:<HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/org/scala-lang/modules/scala-xml_2.12/2.2.0/scala-xml_2.12-2.2.0.jar:<HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/org/scala-sbt/launcher-interface/1.4.2/launcher-interface-1.4.2.jar:<HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/com/github/ben-manes/caffeine/caffeine/2.8.5/caffeine-2.8.5.jar:<HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/io/get-coursier/lm-coursier-shaded_2.12/2.1.1/lm-coursier-shaded_2.12-2.1.1.jar:<HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/org/apache/logging/log4j/log4j-api/2.17.1/log4j-api-2.17.1.jar:<HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/org/apache/logging/log4j/log4j-core/2.17.1/log4j-core-2.17.1.jar:<HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/org/apache/logging/log4j/log4j-slf4j-impl/2.17.1/log4j-slf4j-impl-2.17.1.jar:<HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/org/scala-sbt/librarymanagement-core_2.12/1.9.3/librarymanagement-core_2.12-1.9.3.jar:<HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/org/scala-sbt/librarymanagement-ivy_2.12/1.9.3/librarymanagement-ivy_2.12-1.9.3.jar:<HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/org/scala-sbt/compiler-interface/1.9.5/compiler-interface-1.9.5.jar:<HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/org/scala-sbt/zinc-compile_2.12/1.9.5/zinc-compile_2.12-1.9.5.jar:<HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/com/swoval/file-tree-views/2.1.10/file-tree-views-2.1.10.jar:<HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/net/java/dev/jna/jna/5.13.0/jna-5.13.0.jar:<HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/net/java/dev/jna/jna-platform/5.13.0/jna-platform-5.13.0.jar:<HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/com/github/plokhotnyuk/jsoniter-scala/jsoniter-scala-core_2.12/2.4.0/jsoniter-scala-core_2.12-2.4.0.jar:<HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/org/scala-sbt/util-relation_2.12/1.9.6/util-relation_2.12-1.9.6.jar:<HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/org/scala-sbt/completion_2.12/1.9.6/completion_2.12-1.9.6.jar:<HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/org/scala-sbt/task-system_2.12/1.9.6/task-system_2.12-1.9.6.jar:<HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/org/scala-sbt/tasks_2.12/1.9.6/tasks_2.12-1.9.6.jar:<HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/org/scala-sbt/testing_2.12/1.9.6/testing_2.12-1.9.6.jar:<HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/org/scala-sbt/util-tracking_2.12/1.9.6/util-tracking_2.12-1.9.6.jar:<HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/com/eed3si9n/sjson-new-scalajson_2.12/0.9.1/sjson-new-scalajson_2.12-0.9.1.jar:<HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/org/jline/jline-terminal/3.19.0/jline-terminal-3.19.0.jar:<HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/org/scala-sbt/zinc-classpath_2.12/1.9.5/zinc-classpath_2.12-1.9.5.jar:<HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/org/scala-sbt/zinc-apiinfo_2.12/1.9.5/zinc-apiinfo_2.12-1.9.5.jar:<HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/org/scala-sbt/zinc_2.12/1.9.5/zinc_2.12-1.9.5.jar:<HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/org/scala-sbt/core-macros_2.12/1.9.6/core-macros_2.12-1.9.6.jar:<HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/org/scala-sbt/util-cache_2.12/1.9.6/util-cache_2.12-1.9.6.jar:<HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/org/scala-sbt/util-control_2.12/1.9.6/util-control_2.12-1.9.6.jar:<HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/org/scala-sbt/protocol_2.12/1.9.6/protocol_2.12-1.9.6.jar:<HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/com/eed3si9n/sjson-new-core_2.12/0.9.1/sjson-new-core_2.12-0.9.1.jar:<HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/org/scala-sbt/template-resolver/0.1/template-resolver-0.1.jar:<HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/org/scala-sbt/util-position_2.12/1.9.6/util-position_2.12-1.9.6.jar:<HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/org/scala-sbt/zinc-compile-core_2.12/1.9.5/zinc-compile-core_2.12-1.9.5.jar:<HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/org/scala-sbt/util-interface/1.9.6/util-interface-1.9.6.jar:<HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/org/scala-sbt/jline/jline/2.14.7-sbt-a1b0ffbb8f64bb820f4f84a0c07a0c0964507493/jline-2.14.7-sbt-a1b0ffbb8f64bb820f4f84a0c07a0c0964507493.jar:<HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/org/jline/jline-terminal-jna/3.19.0/jline-terminal-jna-3.19.0.jar:<HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/org/jline/jline-terminal-jansi/3.19.0/jline-terminal-jansi-3.19.0.jar:<HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/com/lmax/disruptor/3.4.2/disruptor-3.4.2.jar:<HOME>/.sbt/boot/scala-2.12.18/lib/scala-reflect.jar:<HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/org/checkerframework/checker-qual/3.4.1/checker-qual-3.4.1.jar:<HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/com/google/errorprone/error_prone_annotations/2.4.0/error_prone_annotations-2.4.0.jar:<HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/org/scala-lang/modules/scala-collection-compat_2.12/2.10.0/scala-collection-compat_2.12-2.10.0.jar:<HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/org/slf4j/slf4j-api/1.7.36/slf4j-api-1.7.36.jar:<HOME>/.sbt/boot/scala-2.12.18/lib/scala-compiler.jar:<HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/com/jcraft/jsch/0.1.54/jsch-0.1.54.jar:<HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/com/eed3si9n/gigahorse-apache-http_2.12/0.7.0/gigahorse-apache-http_2.12-0.7.0.jar:<HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/org/scala-sbt/ivy/ivy/2.3.0-sbt-396a783bba347016e7fe30dacc60d355be607fe2/ivy-2.3.0-sbt-396a783bba347016e7fe30dacc60d355be607fe2.jar:<HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/org/jline/jline-reader/3.19.0/jline-reader-3.19.0.jar:<HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/org/jline/jline-builtins/3.19.0/jline-builtins-3.19.0.jar:<HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/org/scala-sbt/test-agent/1.9.6/test-agent-1.9.6.jar:<HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/org/scala-sbt/test-interface/1.0/test-interface-1.0.jar:<HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/com/eed3si9n/shaded-jawn-parser_2.12/0.9.1/shaded-jawn-parser_2.12-0.9.1.jar:<HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/com/eed3si9n/shaded-scalajson_2.12/1.0.0-M4/shaded-scalajson_2.12-1.0.0-M4.jar:<HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/org/scala-sbt/compiler-bridge_2.12/1.9.5/compiler-bridge_2.12-1.9.5.jar:<HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/org/scala-sbt/zinc-classfile_2.12/1.9.5/zinc-classfile_2.12-1.9.5.jar:<HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/org/scala-sbt/zinc-core_2.12/1.9.5/zinc-core_2.12-1.9.5.jar:<HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/org/scala-sbt/zinc-persist_2.12/1.9.5/zinc-persist_2.12-1.9.5.jar:<HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/com/eed3si9n/sjson-new-murmurhash_2.12/0.9.1/sjson-new-murmurhash_2.12-0.9.1.jar:<HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/org/scala-sbt/ipcsocket/ipcsocket/1.6.2/ipcsocket-1.6.2.jar:<HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/org/scala-lang/modules/scala-parser-combinators_2.12/1.1.2/scala-parser-combinators_2.12-1.1.2.jar:<HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/net/openhft/zero-allocation-hashing/0.10.1/zero-allocation-hashing-0.10.1.jar:<HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/org/fusesource/jansi/jansi/2.1.0/jansi-2.1.0.jar:<HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/com/eed3si9n/gigahorse-core_2.12/0.7.0/gigahorse-core_2.12-0.7.0.jar:<HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/com/eed3si9n/shaded-apache-httpasyncclient/0.7.0/shaded-apache-httpasyncclient-0.7.0.jar:<HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/org/jline/jline-style/3.19.0/jline-style-3.19.0.jar:<HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/org/scala-sbt/zinc-persist-core-assembly/1.9.5/zinc-persist-core-assembly-1.9.5.jar:<HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/org/scala-sbt/sbinary_2.12/0.5.1/sbinary_2.12-0.5.1.jar:<HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/com/typesafe/ssl-config-core_2.12/0.6.1/ssl-config-core_2.12-0.6.1.jar:<HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/org/reactivestreams/reactive-streams/1.0.3/reactive-streams-1.0.3.jar:<HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/com/typesafe/config/1.4.2/config-1.4.2.jar -Xplugin-require:semanticdb -Xsource:3.0.0 -Yrangepos -Ymacro-expand:discard -Ycache-plugin-class-loader:last-modified -Ypresentation-any-thread

  last tree to typer: Ident(Trigger)
       tree position: line 452 of jar:file://<HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/org/scala-sbt/main_2.12/1.9.6/main_2.12-1.9.6-sources.jar!/sbt/nio/Watch.scala
              symbol: <none>
   symbol definition: <none> (a NoSymbol)
      symbol package: <none>
       symbol owners: 
           call site: <none> in <none>

== Source file context for tree position ==

   449    * A constant function that returns [[Trigger]].
   450    */
   451   final val trigger: (Int, Event) => Watch.Action = { (_: Int, _: Event) =>
   452     Trigger
   453   }.label("Watched.trigger")
   454 
   455   /**

occurred in the presentation compiler.

action parameters:
uri: jar:file://<HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/org/scala-sbt/main_2.12/1.9.6/main_2.12-1.9.6-sources.jar!/sbt/nio/Watch.scala
text:
```scala
import _root_.scala.xml.{TopScope=>$scope}
import _root_.sbt._
import _root_.sbt.Keys._
import _root_.sbt.nio.Keys._
import _root_.sbt.ScriptedPlugin.autoImport._, _root_.sbt.plugins.JUnitXmlReportPlugin.autoImport._, _root_.sbt.plugins.MiniDependencyTreePlugin.autoImport._, _root_.bloop.integrations.sbt.BloopPlugin.autoImport._
import _root_.sbt.plugins.IvyPlugin, _root_.sbt.plugins.JvmPlugin, _root_.sbt.plugins.CorePlugin, _root_.sbt.ScriptedPlugin, _root_.sbt.plugins.SbtPlugin, _root_.sbt.plugins.SemanticdbPlugin, _root_.sbt.plugins.JUnitXmlReportPlugin, _root_.sbt.plugins.Giter8TemplatePlugin, _root_.sbt.plugins.MiniDependencyTreePlugin, _root_.bloop.integrations.sbt.BloopPlugin
/*
 * sbt
 * Copyright 2023, Scala center
 * Copyright 2011 - 2022, Lightbend, Inc.
 * Copyright 2008 - 2010, Mark Harrah
 * Licensed under Apache License 2.0 (see LICENSE)
 */

package sbt.nio

import java.nio.file.Path
import java.time.format.{ DateTimeFormatter, TextStyle }
import java.time.{ Instant, ZoneId, ZonedDateTime }
import java.util.Locale
import java.util.concurrent.TimeUnit

import sbt.BasicCommandStrings.{ ContinuousExecutePrefix, TerminateAction }
import sbt.SlashSyntax0._
import sbt._
import sbt.internal.LabeledFunctions._
import sbt.internal.nio.FileEvent
import sbt.internal.util.complete.Parser
import sbt.internal.util.complete.Parser._
import sbt.nio.Keys._
import sbt.nio.file.FileAttributes
import sbt.util.{ Level, Logger }

import scala.annotation.tailrec
import scala.collection.mutable
import scala.concurrent.duration._
import scala.util.control.NonFatal

object Watch {

  /**
   * Represents a file event that has been detected during a continuous build.
   */
  sealed trait Event {

    /**
     * The path that triggered the event.
     *
     * @return the path that triggered the event.
     */
    def path: Path

    /**
     * The time specified in milliseconds from the epoch at which this event occurred.
     *
     * @return the time at which the event occurred.
     */
    def occurredAt: FiniteDuration
  }
  private[this] val formatter = DateTimeFormatter.ofPattern("yyyy-MMM-dd HH:mm:ss.SSS")
  private[this] val timeZone = ZoneId.systemDefault
  private[this] val timeZoneName = timeZone.getDisplayName(TextStyle.SHORT, Locale.getDefault)
  private[this] implicit class DurationOps(val d: Duration) extends AnyVal {
    def finite: FiniteDuration = d match {
      case f: FiniteDuration => f
      case _                 => new FiniteDuration(Long.MaxValue, TimeUnit.MILLISECONDS)
    }
    def toEpochString: String = {
      val zdt = ZonedDateTime.ofInstant(Instant.ofEpochMilli(d.toMillis), timeZone)
      s"${formatter.format(zdt)} $timeZoneName"
    }
  }
  private[sbt] implicit class EventOps(val event: Event) extends AnyVal {
    def toEpochString: String = event.occurredAt.toEpochString
  }
  private[sbt] object Event {
    trait Impl { self: Event =>
      private val name = self.getClass.getSimpleName
      override def equals(o: Any): Boolean = o match {
        case that: Event => this.path == that.path
        case _           => false
      }
      override def hashCode: Int = path.hashCode
      override def toString: String = s"$name($path)"
    }
    def fromIO(fileEvent: FileEvent[FileAttributes]): Watch.Event = fileEvent match {
      case c @ FileEvent.Creation(p, _) => new Watch.Creation(p, c.occurredAt.value.finite)
      case d @ FileEvent.Deletion(p, _) => new Watch.Deletion(p, d.occurredAt.value.finite)
      case u @ FileEvent.Update(p, _, _) =>
        new Watch.Update(p, u.occurredAt.value.finite)
    }
  }
  final class Creation private[sbt] (
      override val path: Path,
      override val occurredAt: FiniteDuration
  ) extends Event
      with Event.Impl {
    override def toString: String = s"Creation($path, ${occurredAt.toEpochString})"
  }
  object Creation {
    def apply(event: FileEvent[FileAttributes]): Creation =
      new Creation(event.path, event.occurredAt.value.finite)
    def unapply(creation: Creation): Option[Path] = Some(creation.path)
  }
  final class Deletion private[sbt] (
      override val path: Path,
      override val occurredAt: FiniteDuration
  ) extends Event
      with Event.Impl {
    override def toString: String = s"Deletion($path, ${occurredAt.toEpochString})"
  }
  object Deletion {
    def apply(event: FileEvent[FileAttributes]): Deletion =
      new Deletion(event.path, event.occurredAt.value.finite)
    def unapply(deletion: Deletion): Option[Path] = Some(deletion.path)
  }
  final class Update private[sbt] (
      override val path: Path,
      override val occurredAt: FiniteDuration
  ) extends Event
      with Event.Impl {
    override def toString: String = s"Update($path, ${occurredAt.toEpochString})"
  }
  object Update {
    def apply(event: FileEvent[FileAttributes]): Update =
      new Update(event.path, event.occurredAt.value.finite)
    def unapply(update: Update): Option[Path] = Some(update.path)
  }

  /**
   * This trait is used to control the state of Watch. The [[Watch.Trigger]] action
   * indicates that Watch should re-run the input task. The [[Watch.CancelWatch]]
   * actions indicate that Watch should exit and return the [[Watch.CancelWatch]]
   * instance that caused the function to exit. The [[Watch.Ignore]] action is used to indicate
   * that the method should keep polling for new actions.
   */
  sealed trait Action

  /**
   * Provides a default `Ordering` for actions. Lower values correspond to higher priority actions.
   * [[CancelWatch]] is higher priority than [[ContinueWatch]].
   */
  object Action {
    implicit object ordering extends Ordering[Action] {
      override def compare(left: Action, right: Action): Int = (left, right) match {
        case (a: ContinueWatch, b: ContinueWatch) => ContinueWatch.ordering.compare(a, b)
        case (_: ContinueWatch, _: CancelWatch)   => 1
        case (a: CancelWatch, b: CancelWatch)     => CancelWatch.ordering.compare(a, b)
        case (_: CancelWatch, _: ContinueWatch)   => -1
      }
    }
  }

  /**
   * Action that indicates that the watch should stop.
   */
  sealed trait CancelWatch extends Action

  /**
   * Action that does not terminate the watch but might trigger a build.
   */
  sealed trait ContinueWatch extends Action

  /**
   * Provides a default `Ordering` for classes extending [[ContinueWatch]]. [[Trigger]] is higher
   * priority than [[Ignore]].
   */
  object ContinueWatch {

    /**
     * A default `Ordering` for [[ContinueWatch]]. [[Trigger]] is higher priority than [[Ignore]].
     */
    implicit object ordering extends Ordering[ContinueWatch] {
      override def compare(left: ContinueWatch, right: ContinueWatch): Int = left match {
        case ShowOptions => if (right == ShowOptions) 0 else -1
        case Ignore      => if (right == Ignore) 0 else 1
        case Trigger     => if (right == Trigger) 0 else if (right == ShowOptions) 1 else -1
      }
    }
  }

  /**
   * Action that indicates that the watch should stop.
   */
  case object CancelWatch extends CancelWatch {

    /**
     * A default `Ordering` for [[ContinueWatch]]. The priority of each type of [[CancelWatch]]
     * is reflected by the ordering of the case statements in the [[ordering.compare]] method,
     * e.g. [[Custom]] is higher priority than [[HandleError]].
     */
    implicit object ordering extends Ordering[CancelWatch] {
      override def compare(left: CancelWatch, right: CancelWatch): Int = left match {
        // Note that a negative return value means the left CancelWatch is preferred to the right
        // CancelWatch while the inverse is true for a positive return value. This logic could
        // likely be simplified, but the pattern matching approach makes it very clear what happens
        // for each type of Action.
        case _: Custom =>
          right match {
            case _: Custom => 0
            case _         => -1
          }
        case _: HandleError =>
          right match {
            case _: Custom      => 1
            case _: HandleError => 0
            case _              => -1
          }
        case Prompt =>
          right match {
            case Prompt                          => 0
            case CancelWatch | Reload | (_: Run) => -1
            case _                               => 1
          }
        case _: Run =>
          right match {
            case _: Run               => 0
            case CancelWatch | Reload => -1
            case _                    => 1
          }
        case CancelWatch =>
          right match {
            case CancelWatch => 0
            case Reload      => -1
            case _           => 1
          }
        case Reload => if (right == Reload) 0 else 1
      }
    }
  }

  /**
   * Action that indicates that an error has occurred. The watch will be terminated when this action
   * is produced.
   */
  sealed class HandleError(val throwable: Throwable) extends CancelWatch {
    override def equals(o: Any): Boolean = o match {
      case that: HandleError => this.throwable == that.throwable
      case _                 => false
    }
    override def hashCode: Int = throwable.hashCode
    override def toString: String = s"HandleError($throwable)"
  }
  object HandleError {
    def unapply(h: HandleError): Option[Throwable] = Some(h.throwable)
  }

  /**
   * Action that indicates that an error has occurred. The watch will be terminated when this action
   * is produced.
   */
  private[sbt] final class HandleUnexpectedError(override val throwable: Throwable)
      extends HandleError(throwable) {
    override def toString: String = s"HandleUnexpectedError($throwable)"
  }
  object HandleUnexpectedError {
    def unapply(h: HandleUnexpectedError): Option[Throwable] = Some(h.throwable)
  }

  /**
   * Action that indicates that the watch should continue as though nothing happened. This may be
   * because, for example, no user input was yet available. This trait can be used when we don't
   * want to take action but we do want to perform a side effect like printing options to the
   * terminal.
   */
  sealed trait Ignore extends ContinueWatch

  /**
   * Action that indicates that the available options should be printed.
   */
  case object ShowOptions extends Ignore

  /**
   * Action that indicates that the watch should continue as though nothing happened. This may be
   * because, for example, no user input was yet available.
   */
  case object Ignore extends Ignore

  /**
   * Action that indicates that the watch should pause while the build is reloaded. This is used to
   * automatically reload the project when the build files (e.g. build.sbt) are changed.
   */
  case object Reload extends CancelWatch

  /**
   * Action that indicates that we should exit and run the provided command.
   *
   * @param commands the commands to run after we exit the watch
   */
  final class Run(val commands: String*) extends CancelWatch {
    override def toString: String = s"Run(${commands.mkString(", ")})"
  }
  // For now leave this private in case this isn't the best unapply type signature since it can't
  // be evolved in a binary compatible way.
  object Run {
    def apply(commands: String*): Run = new Watch.Run(commands: _*)
    def unapply(r: Run): Option[List[Exec]] = Some(r.commands.toList.map(Exec(_, None)))
  }

  case object Prompt extends CancelWatch

  /**
   * Action that indicates that the watch process should re-run the command.
   */
  case object Trigger extends ContinueWatch

  /**
   * A user defined Action. It is not sealed so that the user can create custom instances. If
   * the onStart or nextAction function passed into Watch returns [[Watch.Custom]], then
   * the watch will terminate.
   */
  trait Custom extends CancelWatch

  trait InputOption {
    private[sbt] def parser: Parser[Watch.Action]
    def input: String
    def display: String
    def description: String
    override def toString: String =
      s"InputOption(input = $input, display = $display, description = $description)"
  }
  object InputOption {
    private class impl(
        override val input: String,
        override val display: String,
        override val description: String,
        action: Action
    ) extends InputOption {
      override private[sbt] def parser: Parser[Watch.Action] = input ^^^ action
    }
    def apply(key: Char, description: String, action: Action): InputOption =
      new impl(key.toString, s"'$key'", description, action)
    def apply(key: Char, display: String, description: String, action: Action): InputOption =
      new impl(key.toString, display, description, action)
    def apply(
        display: String,
        description: String,
        action: Action,
        chars: Char*
    ): InputOption =
      new impl(chars.mkString("|"), display, description, action) {
        override private[sbt] def parser: Parser[Watch.Action] = chars match {
          case Seq(c)            => c ^^^ action
          case Seq(h, rest @ _*) => rest.foldLeft(h: Parser[Char])(_ | _) ^^^ action
        }
      }
    def apply(input: String, description: String, action: Action): InputOption =
      new impl(input, s"'$input'", description, action)
    def apply(input: String, display: String, description: String, action: Action): InputOption =
      new impl(input, display, description, action)
  }

  private type NextAction = Int => Watch.Action

  @deprecated(
    "Unused in sbt but left for binary compatibility. Use five argument version instead.",
    "1.4.0"
  )
  def apply(
      task: () => Unit,
      onStart: () => Watch.Action,
      nextAction: () => Watch.Action,
  ): Watch.Action = apply(0, _ => task(), _ => onStart(), _ => nextAction(), recursive = true)

  /**
   * Runs a task and then blocks until the task is ready to run again or we no longer wish to
   * block execution.
   *
   * @param task the aggregated task to run with each iteration
   * @param onStart function to be invoked before we start polling for events
   * @param nextAction function that returns the next state transition [[Watch.Action]].
   * @return the exit [[Watch.Action]] that can be used to potentially modify the build state and
   *         the count of the number of iterations that were run. If
   */
  def apply(
      initialCount: Int,
      task: Int => Unit,
      onStart: NextAction,
      nextAction: NextAction,
      recursive: Boolean
  ): Watch.Action = {
    def safeNextAction(count: Int, delegate: NextAction): Watch.Action =
      try delegate(count)
      catch {
        case NonFatal(t) =>
          System.err.println(s"Watch caught unexpected error:")
          t.printStackTrace(System.err)
          new HandleError(t)
      }
    @tailrec def next(count: Int): Watch.Action = safeNextAction(count, nextAction) match {
      // This should never return Ignore due to this condition.
      case Ignore => next(count)
      case action => action
    }
    @tailrec def impl(count: Int): Watch.Action = {
      task(count)
      safeNextAction(count, onStart) match {
        case Ignore =>
          next(count) match {
            case Trigger =>
              if (recursive) impl(count + 1)
              else {
                task(count)
                Watch.Trigger
              }
            case action => action
          }
        case Trigger =>
          if (recursive) impl(count + 1)
          else {
            task(count)
            Watch.Trigger
          }
        case a => a
      }
    }
    try impl(initialCount)
    catch { case NonFatal(t) => new HandleError(t) }
  }

  private[sbt] object NullLogger extends Logger {
    override def trace(t: => Throwable): Unit = {}
    override def success(message: => String): Unit = {}
    override def log(level: Level.Value, message: => String): Unit = {}
  }

  /**
   * Traverse all of the events and find the one for which we give the highest
   * weight. Within the [[Action]] hierarchy:
   * [[Custom]] > [[HandleError]] > [[CancelWatch]] > [[Reload]] > [[Trigger]] > [[Ignore]]
   * the first event of each kind is returned so long as there are no higher priority events
   * in the collection. For example, if there are multiple events that all return [[Trigger]], then
   * the first one is returned. If, on the other hand, one of the events returns [[Reload]],
   * then that event "wins" and the [[Reload]] action is returned with the [[Event[FileAttributes]]] that triggered it.
   *
   * @param events the ([[Action]], [[Event[FileAttributes]]]) pairs
   * @return the ([[Action]], [[Event[FileAttributes]]]) pair with highest weight if the input events
   *         are non empty.
   */
  @inline
  private[sbt] def aggregate(events: Seq[(Action, Event)]): Option[(Action, Event)] =
    if (events.isEmpty) None else Some(events.minBy(_._1))

  private implicit class StringToExec(val s: String) extends AnyVal {
    def toExec: Exec = Exec(s, None)
  }

  /**
   * A constant function that returns [[Trigger]].
   */
  final val trigger: (Int, Event) => Watch.Action = { (_: Int, _: Event) =>
    Trigger
  }.label("Watched.trigger")

  /**
   * The minimum delay between build triggers for the same file. If the file is detected
   * to have changed within this period from the last build trigger, the event will be discarded.
   */
  final val defaultAntiEntropy: FiniteDuration = 500.milliseconds

  /**
   * The duration for which we will poll for new file events when we are buffering events
   * after an initial event has been detected to avoid spurious rebuilds.
   *
   * If this value is ever updated, please update the comment in Continuous.getFileEvents.
   */
  final val defaultAntiEntropyPollPeriod: FiniteDuration = 5.milliseconds

  /**
   * The duration in wall clock time for which a FileEventMonitor will retain anti-entropy
   * events for files. This is an implementation detail of the FileEventMonitor. It should
   * hopefully not need to be set by the users. It is needed because when a task takes a long time
   * to run, it is possible that events will be detected for the file that triggered the build that
   * occur within the anti-entropy period. We still allow it to be configured to limit the memory
   * usage of the FileEventMonitor (but this is somewhat unlikely to be a problem).
   */
  final val defaultAntiEntropyRetentionPeriod: FiniteDuration = 10.minutes

  /**
   * The duration for which we delay triggering when a file is deleted. This is needed because
   * many programs implement save as a file move of a temporary file onto the target file.
   * Depending on how the move is implemented, this may be detected as a deletion immediately
   * followed by a creation. If we trigger immediately on delete, we may, for example, try to
   * compile before all of the source files are actually available. The longer this value is set,
   * the less likely we are to spuriously trigger a build before all files are available, but
   * the longer it will take to trigger a build when the file is actually deleted and not renamed.
   */
  final val defaultDeletionQuarantinePeriod: FiniteDuration = 50.milliseconds

  /**
   * Converts user input to an Action with the following rules:
   * 1) 'x' or 'X' will exit sbt
   * 2) 'r' or 'R' will trigger a build
   * 3) new line characters cancel the watch and return to the shell
   */
  final def defaultInputParser(options: Seq[Watch.InputOption]): Parser[Action] =
    distinctOptions(options) match {
      case Seq()             => (('\n': Parser[Char]) | '\r' | 4.toChar) ^^^ Run("")
      case Seq(h, rest @ _*) => rest.foldLeft(h.parser)(_ | _.parser)
    }
  final val defaultInputOptions: Seq[Watch.InputOption] = Seq(
    Watch.InputOption("<enter>", "interrupt (exits sbt in batch mode)", CancelWatch, '\n', '\r'),
    Watch.InputOption(4.toChar, "<ctrl-d>", "interrupt (exits sbt in batch mode)", CancelWatch),
    Watch.InputOption('l', "reload the build", Reload),
    Watch.InputOption('r', "re-run the command", Trigger),
    Watch.InputOption('s', "return to shell", Prompt),
    Watch.InputOption('q', "quit sbt", Run(TerminateAction)),
    Watch.InputOption('?', "print options", ShowOptions)
  )

  def defaultInputOptionsMessage(options: Seq[InputOption]): String = {
    val opts = distinctOptions(options).sortBy(_.input)
    val alignmentLength = opts.map(_.display.length).max + 1
    val formatted =
      opts.map(o => s"${o.display}${" " * (alignmentLength - o.display.length)}: ${o.description}")
    s"Options:\n${formatted.mkString("  ", "\n  ", "")}"
  }
  private def distinctOptions(options: Seq[InputOption]): Seq[InputOption] = {
    val distinctOpts = mutable.Set.empty[String]
    val opts = new mutable.ArrayBuffer[InputOption]
    (options match {
      case Seq() => defaultInputOptions.headOption.toSeq
      case s     => s
    }).reverse.foreach { o =>
      if (distinctOpts.add(o.input)) opts += o
    }
    opts.toSeq.reverse
  }
  private def waitMessage(project: ProjectRef, commands: Seq[String]): Seq[String] = {
    val cmds = commands.map(project.project + "/" + _.trim).mkString("; ")
    Seq(
      s"Monitoring source files for $cmds...",
      s"Press <enter> to interrupt or '?' for more options."
    )
  }

  /**
   * A function that prints out the current iteration count and gives instructions for exiting
   * or triggering the build.
   */
  val defaultStartWatch: (Int, ProjectRef, Seq[String]) => Option[String] = {
    (count: Int, project: ProjectRef, commands: Seq[String]) =>
      {
        val countStr = s"$count. "
        Some(s"$countStr${waitMessage(project, commands).mkString(s"\n${" " * countStr.length}")}")
      }
  }.label("Watched.defaultStartWatch")

  /**
   * Default no-op callback.
   */
  val defaultBeforeCommand: () => Unit = (() => {}).label("Watch.defaultBeforeCommand")

  private[sbt] val defaultCommandOnTermination: (Action, String, Int, State) => State =
    onTerminationImpl(ContinuousExecutePrefix).label("Watched.defaultCommandOnTermination")
  private[sbt] val defaultTaskOnTermination: (Action, String, Int, State) => State =
    onTerminationImpl("watch", ContinuousExecutePrefix)
      .label("Watched.defaultTaskOnTermination")

  /**
   * Default handler to transform the state when the watch terminates. When the [[Watch.Action]]
   * is [[Reload]], the handler will prepend the original command (prefixed by ~) to the
   * [[State.remainingCommands]] and then invoke the [[StateOps.reload]] method. When the
   * [[Watch.Action]] is [[HandleError]], the handler returns the result of [[StateOps.fail]].
   * When the [[Watch.Action]] is [[Watch.Run]], we add the commands specified by
   * [[Watch.Run.commands]] to the stat's remaining commands. Otherwise the original state is
   * returned.
   */
  private def onTerminationImpl(
      watchPrefixes: String*
  ): (Action, String, Int, State) => State = { (action, command, count, state) =>
    val prefix = watchPrefixes.head
    val rc = state.remainingCommands
      .filterNot(c => watchPrefixes.exists(c.commandLine.trim.startsWith))
    action match {
      case Run(commands) => state.copy(remainingCommands = commands ++ rc)
      case Reload =>
        state.copy(remainingCommands = "reload".toExec :: s"$prefix $count $command".toExec :: rc)
      case _: HandleError => state.copy(remainingCommands = rc).fail
      case _              => state.copy(remainingCommands = rc)
    }
  }

  /**
   * A constant function that always returns `None`. When
   * `Keys.watchTriggeredMessage := Watched.defaultOnTriggerMessage`, then nothing is logged when
   * a build is triggered.
   */
  final val defaultOnTriggerMessage: (Int, Path, Seq[String]) => Option[String] =
    ((_: Int, path: Path, commands: Seq[String]) => {
      val msg = s"Build triggered by $path. " +
        s"Running ${commands.mkString("'", "; ", "'")}."
      Some(msg)
    }).label("Watched.defaultOnTriggerMessage")

  final val noTriggerMessage: (Int, Path, Seq[String]) => Option[String] =
    (_, _, _) => None

  /**
   * The minimum delay between file system polling when a `PollingWatchService` is used.
   */
  final val defaultPollInterval: FiniteDuration = 500.milliseconds

  /**
   * Clears the console screen when evaluated.
   */
  final val clearScreen: () => Unit =
    (() => println("\u001b[2J\u001b[0;0H")).label("Watch.clearScreen")

  /**
   * A function that first clears the screen and then returns the default on trigger message.
   */
  final val clearScreenOnTrigger: (Int, Path, Seq[String]) => Option[String] = {
    (count: Int, path: Path, commands: Seq[String]) =>
      clearScreen()
      defaultOnTriggerMessage(count, path, commands)
  }.label("Watch.clearScreenOnTrigger")

  private[sbt] def defaults: Seq[Def.Setting[_]] = Seq(
    sbt.Keys.watchAntiEntropy :== Watch.defaultAntiEntropy,
    watchAntiEntropyRetentionPeriod :== Watch.defaultAntiEntropyRetentionPeriod,
    watchLogLevel :== Level.Info,
    watchBeforeCommand :== Watch.defaultBeforeCommand,
    watchOnFileInputEvent :== Watch.trigger,
    watchDeletionQuarantinePeriod :== Watch.defaultDeletionQuarantinePeriod,
    sbt.Keys.watchService :== Watched.newWatchService,
    watchInputOptions :== Watch.defaultInputOptions,
    watchStartMessage :== Watch.defaultStartWatch,
    watchTriggeredMessage :== Watch.defaultOnTriggerMessage,
    watchForceTriggerOnAnyChange :== false,
    watchPersistFileStamps := (ThisBuild / sbt.Keys.turbo).value,
    watchTriggers :== Nil,
    watchAntiEntropyPollPeriod := Watch.defaultAntiEntropyPollPeriod,
  )
}

```



#### Error stacktrace:

```
scala.reflect.internal.SymbolTable.throwAssertionError(SymbolTable.scala:185)
	scala.reflect.internal.Symbols$Symbol.completeInfo(Symbols.scala:1525)
	scala.reflect.internal.Symbols$Symbol.info(Symbols.scala:1514)
	scala.reflect.internal.Symbols$Symbol.tpeHK(Symbols.scala:1468)
	scala.reflect.internal.Types$Type.computeMemberType(Types.scala:735)
	scala.reflect.internal.Types$Type.memberType(Types.scala:732)
	scala.reflect.internal.Types.defineUnderlyingOfSingleType(Types.scala:1289)
	scala.reflect.internal.Types.defineUnderlyingOfSingleType$(Types.scala:1283)
	scala.reflect.internal.SymbolTable.defineUnderlyingOfSingleType(SymbolTable.scala:28)
	scala.reflect.internal.Types$SingleType.underlying(Types.scala:1243)
	scala.reflect.internal.Types$SimpleTypeProxy.typeSymbolDirect(Types.scala:160)
	scala.reflect.internal.Types$SimpleTypeProxy.typeSymbolDirect$(Types.scala:160)
	scala.reflect.internal.Types$SingletonType.typeSymbolDirect(Types.scala:1108)
	scala.reflect.internal.Types$Type.implicitMembers(Types.scala:624)
	scala.tools.nsc.typechecker.Implicits$ImplicitSearch.getClassParts$1(Implicits.scala:1237)
	scala.tools.nsc.typechecker.Implicits$ImplicitSearch.getParts$1(Implicits.scala:1270)
	scala.tools.nsc.typechecker.Implicits$ImplicitSearch.$anonfun$companionImplicitMap$3(Implicits.scala:1277)
	scala.tools.nsc.typechecker.Implicits$ImplicitSearch.getParts$1(Implicits.scala:1277)
	scala.tools.nsc.typechecker.Implicits$ImplicitSearch.$anonfun$companionImplicitMap$3(Implicits.scala:1277)
	scala.tools.nsc.typechecker.Implicits$ImplicitSearch.getParts$1(Implicits.scala:1277)
	scala.tools.nsc.typechecker.Implicits$ImplicitSearch.companionImplicitMap(Implicits.scala:1314)
	scala.tools.nsc.typechecker.Implicits$ImplicitSearch.implicitsOfExpectedType(Implicits.scala:1334)
	scala.tools.nsc.typechecker.Implicits$ImplicitSearch.bestImplicit(Implicits.scala:1598)
	scala.tools.nsc.typechecker.Implicits.inferImplicit1(Implicits.scala:111)
	scala.tools.nsc.typechecker.Implicits.inferImplicit(Implicits.scala:93)
	scala.tools.nsc.typechecker.Implicits.inferImplicit$(Implicits.scala:90)
	scala.meta.internal.pc.MetalsGlobal$MetalsInteractiveAnalyzer.inferImplicit(MetalsGlobal.scala:68)
	scala.tools.nsc.typechecker.Implicits.inferImplicitView(Implicits.scala:52)
	scala.tools.nsc.typechecker.Implicits.inferImplicitView$(Implicits.scala:51)
	scala.meta.internal.pc.MetalsGlobal$MetalsInteractiveAnalyzer.inferImplicitView(MetalsGlobal.scala:68)
	scala.tools.nsc.typechecker.Typers$Typer.inferView(Typers.scala:323)
	scala.tools.nsc.typechecker.Typers$Typer.adaptToMember(Typers.scala:1307)
	scala.tools.nsc.typechecker.Typers$Typer.$anonfun$adaptToMemberWithArgs$7(Typers.scala:1357)
	scala.tools.nsc.typechecker.Typers$Typer.$anonfun$silent$2(Typers.scala:726)
	scala.tools.nsc.typechecker.Typers$Typer.silent(Typers.scala:726)
	scala.tools.nsc.typechecker.Typers$Typer.adaptToMemberWithArgs(Typers.scala:1357)
	scala.tools.nsc.typechecker.Typers$Typer.typedSelect$1(Typers.scala:5104)
	scala.tools.nsc.typechecker.Typers$Typer.typedSelectOrSuperCall$1(Typers.scala:5226)
	scala.tools.nsc.typechecker.Typers$Typer.typed1(Typers.scala:5768)
	scala.tools.nsc.typechecker.Typers$Typer.typed(Typers.scala:5812)
	scala.tools.nsc.typechecker.Typers$Typer.$anonfun$typed1$39(Typers.scala:4918)
	scala.tools.nsc.typechecker.Typers$Typer.silent(Typers.scala:713)
	scala.tools.nsc.typechecker.Typers$Typer.normalTypedApply$1(Typers.scala:4920)
	scala.tools.nsc.typechecker.Typers$Typer.typedApply$1(Typers.scala:4950)
	scala.tools.nsc.typechecker.Typers$Typer.typed1(Typers.scala:5767)
	scala.tools.nsc.typechecker.Typers$Typer.typed(Typers.scala:5812)
	scala.tools.nsc.typechecker.Typers$Typer.typedValDefImpl(Typers.scala:6028)
	scala.tools.nsc.typechecker.Typers$Typer.typedValDef(Typers.scala:2077)
	scala.tools.nsc.typechecker.Typers$Typer.typed1(Typers.scala:5731)
	scala.tools.nsc.typechecker.Typers$Typer.typed(Typers.scala:5812)
	scala.tools.nsc.typechecker.Typers$Typer.typedStat$1(Typers.scala:5876)
	scala.tools.nsc.typechecker.Typers$Typer.$anonfun$typedStats$10(Typers.scala:3356)
	scala.tools.nsc.typechecker.Typers$Typer.typedStats(Typers.scala:3356)
	scala.tools.nsc.typechecker.Typers$Typer.typedTemplate(Typers.scala:2038)
	scala.tools.nsc.typechecker.Typers$Typer.typedModuleDef(Typers.scala:1904)
	scala.tools.nsc.typechecker.Typers$Typer.typed1(Typers.scala:5734)
	scala.tools.nsc.typechecker.Typers$Typer.typed(Typers.scala:5812)
	scala.tools.nsc.typechecker.Typers$Typer.typedStat$1(Typers.scala:5876)
	scala.tools.nsc.typechecker.Typers$Typer.$anonfun$typedStats$10(Typers.scala:3356)
	scala.tools.nsc.typechecker.Typers$Typer.typedStats(Typers.scala:3356)
	scala.tools.nsc.typechecker.Typers$Typer.typedPackageDef$1(Typers.scala:5444)
	scala.tools.nsc.typechecker.Typers$Typer.typed1(Typers.scala:5736)
	scala.tools.nsc.typechecker.Typers$Typer.typed(Typers.scala:5812)
	scala.tools.nsc.typechecker.Analyzer$typerFactory$TyperPhase.apply(Analyzer.scala:114)
	scala.tools.nsc.Global$GlobalPhase.applyPhase(Global.scala:453)
	scala.tools.nsc.interactive.Global$TyperRun.$anonfun$applyPhase$1(Global.scala:1341)
	scala.tools.nsc.interactive.Global$TyperRun.applyPhase(Global.scala:1341)
	scala.tools.nsc.interactive.Global$TyperRun.typeCheck(Global.scala:1334)
	scala.tools.nsc.interactive.Global.typeCheck(Global.scala:666)
	scala.meta.internal.pc.SemanticdbTextDocumentProvider.textDocument(SemanticdbTextDocumentProvider.scala:33)
	scala.meta.internal.pc.ScalaPresentationCompiler.$anonfun$semanticdbTextDocument$1(ScalaPresentationCompiler.scala:374)
```
#### Short summary: 

java.lang.AssertionError: assertion failed: 
  Event
     while compiling: jar:file://<HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/org/scala-sbt/main_2.12/1.9.6/main_2.12-1.9.6-sources.jar!/sbt/nio/Watch.scala
        during phase: globalPhase=<no phase>, enteringPhase=typer
     library version: version 2.12.18
    compiler version: version 2.12.18
  reconstructed args: -deprecation -Wconf:cat=unused-nowarn:s -Wconf:cat=unused-nowarn:s -Wconf:cat=unused-nowarn:s -Wconf:cat=deprecation:w -Wconf:cat=deprecation:ws -Wconf:cat=feature:ws -Wconf:cat=optimizer:ws -classpath <WORKSPACE>/project/project/.bloop/exmapledd-build-build/bloop-bsp-clients-classes/classes-Metals-0-XXoQk1SAOlmGrWvlG9jw==:<HOME>/.cache/bloop/semanticdb/com.sourcegraph.semanticdb-javac.0.9.8/semanticdb-javac-0.9.8.jar:<HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/org/scala-sbt/sbt/1.9.6/sbt-1.9.6.jar:<HOME>/.sbt/boot/scala-2.12.18/lib/scala-library.jar:<HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/ch/epfl/scala/sbt-bloop_2.12_1.0/1.5.13/sbt-bloop-1.5.13.jar:<HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/org/scala-sbt/main_2.12/1.9.6/main_2.12-1.9.6.jar:<HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/org/scala-sbt/io_2.12/1.9.1/io_2.12-1.9.1.jar:<HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/ch/epfl/scala/bloop-config_2.12/1.5.5/bloop-config_2.12-1.5.5.jar:<HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/org/scala-sbt/logic_2.12/1.9.6/logic_2.12-1.9.6.jar:<HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/org/scala-sbt/actions_2.12/1.9.6/actions_2.12-1.9.6.jar:<HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/org/scala-sbt/main-settings_2.12/1.9.6/main-settings_2.12-1.9.6.jar:<HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/org/scala-sbt/run_2.12/1.9.6/run_2.12-1.9.6.jar:<HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/org/scala-sbt/command_2.12/1.9.6/command_2.12-1.9.6.jar:<HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/org/scala-sbt/collections_2.12/1.9.6/collections_2.12-1.9.6.jar:<HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/org/scala-sbt/scripted-plugin_2.12/1.9.6/scripted-plugin_2.12-1.9.6.jar:<HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/org/scala-sbt/zinc-lm-integration_2.12/1.9.6/zinc-lm-integration_2.12-1.9.6.jar:<HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/org/scala-sbt/util-logging_2.12/1.9.6/util-logging_2.12-1.9.6.jar:<HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/org/scala-lang/modules/scala-xml_2.12/2.2.0/scala-xml_2.12-2.2.0.jar:<HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/org/scala-sbt/launcher-interface/1.4.2/launcher-interface-1.4.2.jar:<HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/com/github/ben-manes/caffeine/caffeine/2.8.5/caffeine-2.8.5.jar:<HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/io/get-coursier/lm-coursier-shaded_2.12/2.1.1/lm-coursier-shaded_2.12-2.1.1.jar:<HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/org/apache/logging/log4j/log4j-api/2.17.1/log4j-api-2.17.1.jar:<HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/org/apache/logging/log4j/log4j-core/2.17.1/log4j-core-2.17.1.jar:<HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/org/apache/logging/log4j/log4j-slf4j-impl/2.17.1/log4j-slf4j-impl-2.17.1.jar:<HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/org/scala-sbt/librarymanagement-core_2.12/1.9.3/librarymanagement-core_2.12-1.9.3.jar:<HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/org/scala-sbt/librarymanagement-ivy_2.12/1.9.3/librarymanagement-ivy_2.12-1.9.3.jar:<HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/org/scala-sbt/compiler-interface/1.9.5/compiler-interface-1.9.5.jar:<HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/org/scala-sbt/zinc-compile_2.12/1.9.5/zinc-compile_2.12-1.9.5.jar:<HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/com/swoval/file-tree-views/2.1.10/file-tree-views-2.1.10.jar:<HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/net/java/dev/jna/jna/5.13.0/jna-5.13.0.jar:<HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/net/java/dev/jna/jna-platform/5.13.0/jna-platform-5.13.0.jar:<HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/com/github/plokhotnyuk/jsoniter-scala/jsoniter-scala-core_2.12/2.4.0/jsoniter-scala-core_2.12-2.4.0.jar:<HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/org/scala-sbt/util-relation_2.12/1.9.6/util-relation_2.12-1.9.6.jar:<HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/org/scala-sbt/completion_2.12/1.9.6/completion_2.12-1.9.6.jar:<HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/org/scala-sbt/task-system_2.12/1.9.6/task-system_2.12-1.9.6.jar:<HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/org/scala-sbt/tasks_2.12/1.9.6/tasks_2.12-1.9.6.jar:<HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/org/scala-sbt/testing_2.12/1.9.6/testing_2.12-1.9.6.jar:<HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/org/scala-sbt/util-tracking_2.12/1.9.6/util-tracking_2.12-1.9.6.jar:<HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/com/eed3si9n/sjson-new-scalajson_2.12/0.9.1/sjson-new-scalajson_2.12-0.9.1.jar:<HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/org/jline/jline-terminal/3.19.0/jline-terminal-3.19.0.jar:<HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/org/scala-sbt/zinc-classpath_2.12/1.9.5/zinc-classpath_2.12-1.9.5.jar:<HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/org/scala-sbt/zinc-apiinfo_2.12/1.9.5/zinc-apiinfo_2.12-1.9.5.jar:<HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/org/scala-sbt/zinc_2.12/1.9.5/zinc_2.12-1.9.5.jar:<HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/org/scala-sbt/core-macros_2.12/1.9.6/core-macros_2.12-1.9.6.jar:<HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/org/scala-sbt/util-cache_2.12/1.9.6/util-cache_2.12-1.9.6.jar:<HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/org/scala-sbt/util-control_2.12/1.9.6/util-control_2.12-1.9.6.jar:<HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/org/scala-sbt/protocol_2.12/1.9.6/protocol_2.12-1.9.6.jar:<HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/com/eed3si9n/sjson-new-core_2.12/0.9.1/sjson-new-core_2.12-0.9.1.jar:<HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/org/scala-sbt/template-resolver/0.1/template-resolver-0.1.jar:<HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/org/scala-sbt/util-position_2.12/1.9.6/util-position_2.12-1.9.6.jar:<HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/org/scala-sbt/zinc-compile-core_2.12/1.9.5/zinc-compile-core_2.12-1.9.5.jar:<HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/org/scala-sbt/util-interface/1.9.6/util-interface-1.9.6.jar:<HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/org/scala-sbt/jline/jline/2.14.7-sbt-a1b0ffbb8f64bb820f4f84a0c07a0c0964507493/jline-2.14.7-sbt-a1b0ffbb8f64bb820f4f84a0c07a0c0964507493.jar:<HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/org/jline/jline-terminal-jna/3.19.0/jline-terminal-jna-3.19.0.jar:<HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/org/jline/jline-terminal-jansi/3.19.0/jline-terminal-jansi-3.19.0.jar:<HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/com/lmax/disruptor/3.4.2/disruptor-3.4.2.jar:<HOME>/.sbt/boot/scala-2.12.18/lib/scala-reflect.jar:<HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/org/checkerframework/checker-qual/3.4.1/checker-qual-3.4.1.jar:<HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/com/google/errorprone/error_prone_annotations/2.4.0/error_prone_annotations-2.4.0.jar:<HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/org/scala-lang/modules/scala-collection-compat_2.12/2.10.0/scala-collection-compat_2.12-2.10.0.jar:<HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/org/slf4j/slf4j-api/1.7.36/slf4j-api-1.7.36.jar:<HOME>/.sbt/boot/scala-2.12.18/lib/scala-compiler.jar:<HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/com/jcraft/jsch/0.1.54/jsch-0.1.54.jar:<HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/com/eed3si9n/gigahorse-apache-http_2.12/0.7.0/gigahorse-apache-http_2.12-0.7.0.jar:<HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/org/scala-sbt/ivy/ivy/2.3.0-sbt-396a783bba347016e7fe30dacc60d355be607fe2/ivy-2.3.0-sbt-396a783bba347016e7fe30dacc60d355be607fe2.jar:<HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/org/jline/jline-reader/3.19.0/jline-reader-3.19.0.jar:<HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/org/jline/jline-builtins/3.19.0/jline-builtins-3.19.0.jar:<HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/org/scala-sbt/test-agent/1.9.6/test-agent-1.9.6.jar:<HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/org/scala-sbt/test-interface/1.0/test-interface-1.0.jar:<HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/com/eed3si9n/shaded-jawn-parser_2.12/0.9.1/shaded-jawn-parser_2.12-0.9.1.jar:<HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/com/eed3si9n/shaded-scalajson_2.12/1.0.0-M4/shaded-scalajson_2.12-1.0.0-M4.jar:<HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/org/scala-sbt/compiler-bridge_2.12/1.9.5/compiler-bridge_2.12-1.9.5.jar:<HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/org/scala-sbt/zinc-classfile_2.12/1.9.5/zinc-classfile_2.12-1.9.5.jar:<HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/org/scala-sbt/zinc-core_2.12/1.9.5/zinc-core_2.12-1.9.5.jar:<HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/org/scala-sbt/zinc-persist_2.12/1.9.5/zinc-persist_2.12-1.9.5.jar:<HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/com/eed3si9n/sjson-new-murmurhash_2.12/0.9.1/sjson-new-murmurhash_2.12-0.9.1.jar:<HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/org/scala-sbt/ipcsocket/ipcsocket/1.6.2/ipcsocket-1.6.2.jar:<HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/org/scala-lang/modules/scala-parser-combinators_2.12/1.1.2/scala-parser-combinators_2.12-1.1.2.jar:<HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/net/openhft/zero-allocation-hashing/0.10.1/zero-allocation-hashing-0.10.1.jar:<HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/org/fusesource/jansi/jansi/2.1.0/jansi-2.1.0.jar:<HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/com/eed3si9n/gigahorse-core_2.12/0.7.0/gigahorse-core_2.12-0.7.0.jar:<HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/com/eed3si9n/shaded-apache-httpasyncclient/0.7.0/shaded-apache-httpasyncclient-0.7.0.jar:<HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/org/jline/jline-style/3.19.0/jline-style-3.19.0.jar:<HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/org/scala-sbt/zinc-persist-core-assembly/1.9.5/zinc-persist-core-assembly-1.9.5.jar:<HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/org/scala-sbt/sbinary_2.12/0.5.1/sbinary_2.12-0.5.1.jar:<HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/com/typesafe/ssl-config-core_2.12/0.6.1/ssl-config-core_2.12-0.6.1.jar:<HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/org/reactivestreams/reactive-streams/1.0.3/reactive-streams-1.0.3.jar:<HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/com/typesafe/config/1.4.2/config-1.4.2.jar -Xplugin-require:semanticdb -Xsource:3.0.0 -Yrangepos -Ymacro-expand:discard -Ycache-plugin-class-loader:last-modified -Ypresentation-any-thread

  last tree to typer: Ident(Trigger)
       tree position: line 452 of jar:file://<HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/org/scala-sbt/main_2.12/1.9.6/main_2.12-1.9.6-sources.jar!/sbt/nio/Watch.scala
              symbol: <none>
   symbol definition: <none> (a NoSymbol)
      symbol package: <none>
       symbol owners: 
           call site: <none> in <none>

== Source file context for tree position ==

   449    * A constant function that returns [[Trigger]].
   450    */
   451   final val trigger: (Int, Event) => Watch.Action = { (_: Int, _: Event) =>
   452     Trigger
   453   }.label("Watched.trigger")
   454 
   455   /**