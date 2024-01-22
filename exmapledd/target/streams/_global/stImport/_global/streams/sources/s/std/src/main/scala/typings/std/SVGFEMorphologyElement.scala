package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Corresponds to the <feMorphology> element. */
@js.native
trait SVGFEMorphologyElement
  extends StObject
     with SVGElement
     with SVGFilterPrimitiveStandardAttributes {
  
  /* standard dom */
  val SVG_MORPHOLOGY_OPERATOR_DILATE: Double = js.native
  
  /* standard dom */
  val SVG_MORPHOLOGY_OPERATOR_ERODE: Double = js.native
  
  /* standard dom */
  val SVG_MORPHOLOGY_OPERATOR_UNKNOWN: Double = js.native
  
  /* InferMemberOverrides */
  override def addEventListener(`type`: java.lang.String, callback: EventListenerOrEventListenerObject): Unit = js.native
  /* InferMemberOverrides */
  override def addEventListener(`type`: java.lang.String, callback: EventListenerOrEventListenerObject, options: scala.Boolean): Unit = js.native
  /* InferMemberOverrides */
  override def addEventListener(
    `type`: java.lang.String,
    callback: EventListenerOrEventListenerObject,
    options: AddEventListenerOptions
  ): Unit = js.native
  
  /* standard dom */
  val in1: org.scalajs.dom.SVGAnimatedString = js.native
  
  /* standard dom */
  val operator: org.scalajs.dom.SVGAnimatedEnumeration = js.native
  
  /* standard dom */
  val radiusX: org.scalajs.dom.SVGAnimatedNumber = js.native
  
  /* standard dom */
  val radiusY: org.scalajs.dom.SVGAnimatedNumber = js.native
  
  /* InferMemberOverrides */
  override def removeEventListener(`type`: java.lang.String, callback: EventListenerOrEventListenerObject): Unit = js.native
  /* InferMemberOverrides */
  override def removeEventListener(
    `type`: java.lang.String,
    callback: EventListenerOrEventListenerObject,
    options: org.scalajs.dom.EventListenerOptions
  ): Unit = js.native
  /* InferMemberOverrides */
  override def removeEventListener(`type`: java.lang.String, callback: EventListenerOrEventListenerObject, options: scala.Boolean): Unit = js.native
}
