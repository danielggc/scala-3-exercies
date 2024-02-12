package typings.ui5Webcomponents.anon

import org.scalablytyped.runtime.Instantiable0
import org.scalajs.dom.DocumentFragment
import org.scalajs.dom.HTMLElement
import typings.ui5WebcomponentsBase.anon.Host
import typings.ui5WebcomponentsBase.anon.TypeofUI5Element
import typings.ui5WebcomponentsBase.distRendererExecuteTemplateMod.TemplateFunction
import typings.ui5WebcomponentsBase.distRendererExecuteTemplateMod.TemplateFunctionResult
import typings.ui5WebcomponentsBase.distUi5elementMod.UI5Element
import typings.ui5WebcomponentsBase.distUi5elementmetadataMod.Metadata
import typings.ui5WebcomponentsBase.distUi5elementmetadataMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Typeofdefault extends StObject {
  
  /**
    * @private
    */
  /* static member */
  def _generateAccessors(): Unit
  
  /* static member */
  var _metadata: default
  
  /**
    * @private
    */
  /* static member */
  def _needsShadowDOM(): Boolean
  
  /**
    * @private
    */
  /* static member */
  def _needsStaticArea(): Boolean
  
  /* static member */
  var decoratorMetadata: Metadata
  
  /**
    * Registers a UI5 Web Component in the browser window object
    * @public
    * @returns {Promise<UI5Element>}
    */
  /* static member */
  def define(): js.Promise[TypeofUI5Element & Instantiable0[UI5Element]]
  
  /**
    * Returns an instance of UI5ElementMetadata.js representing this UI5 Web Component's full metadata (its and its parents')
    * Note: not to be confused with the "get metadata()" method, which returns an object for this class's metadata only
    * @public
    * @returns {UI5ElementMetadata}
    */
  /* static member */
  def getMetadata(): default
  
  /**
    * Returns a list of the unique dependencies for this UI5 Web Component
    *
    * @public
    */
  /* static member */
  def getUniqueDependencies(): js.Array[TypeofUI5Element & Instantiable0[UI5Element]]
  
  /**
    * Hook that will be called upon custom element definition
    *
    * @protected
    * @returns {Promise<void>}
    */
  /* static member */
  def onDefine(): js.Promise[Unit]
  
  def render(
    templateFunctionResult: TemplateFunctionResult,
    container: DocumentFragment,
    styleStrOrHrefsArr: String,
    forStaticArea: Boolean,
    options: Host
  ): Unit
  def render(
    templateFunctionResult: TemplateFunctionResult,
    container: DocumentFragment,
    styleStrOrHrefsArr: js.Array[String],
    forStaticArea: Boolean,
    options: Host
  ): Unit
  def render(
    templateFunctionResult: TemplateFunctionResult,
    container: DocumentFragment,
    styleStrOrHrefsArr: Unit,
    forStaticArea: Boolean,
    options: Host
  ): Unit
  /* static member */
  def render(
    templateFunctionResult: TemplateFunctionResult,
    container: HTMLElement,
    styleStrOrHrefsArr: String,
    forStaticArea: Boolean,
    options: Host
  ): Unit
  def render(
    templateFunctionResult: TemplateFunctionResult,
    container: HTMLElement,
    styleStrOrHrefsArr: js.Array[String],
    forStaticArea: Boolean,
    options: Host
  ): Unit
  def render(
    templateFunctionResult: TemplateFunctionResult,
    container: HTMLElement,
    styleStrOrHrefsArr: Unit,
    forStaticArea: Boolean,
    options: Host
  ): Unit
  /* static member */
  @JSName("render")
  var render_Original: js.Function5[
    /* templateFunctionResult */ TemplateFunctionResult, 
    /* container */ HTMLElement | DocumentFragment, 
    /* styleStrOrHrefsArr */ js.UndefOr[String | js.Array[String]], 
    /* forStaticArea */ Boolean, 
    /* options */ Host, 
    Unit
  ]
  
  /* static member */
  var staticAreaTemplate: js.UndefOr[TemplateFunction] = js.undefined
  
  /* static member */
  var template: js.UndefOr[TemplateFunction] = js.undefined
  
  /**
    * Returns a promise that resolves whenever all dependencies for this UI5 Web Component have resolved
    *
    * @returns {Promise}
    */
  /* static member */
  def whenDependenciesDefined(): js.Promise[js.Array[TypeofUI5Element & Instantiable0[UI5Element]]]
}
object Typeofdefault {
  
  inline def apply(
    _generateAccessors: () => Unit,
    _metadata: default,
    _needsShadowDOM: () => Boolean,
    _needsStaticArea: () => Boolean,
    decoratorMetadata: Metadata,
    define: () => js.Promise[TypeofUI5Element & Instantiable0[UI5Element]],
    getMetadata: () => default,
    getUniqueDependencies: () => js.Array[TypeofUI5Element & Instantiable0[UI5Element]],
    onDefine: () => js.Promise[Unit],
    render: (/* templateFunctionResult */ TemplateFunctionResult, /* container */ HTMLElement | DocumentFragment, /* styleStrOrHrefsArr */ js.UndefOr[String | js.Array[String]], /* forStaticArea */ Boolean, /* options */ Host) => Unit,
    whenDependenciesDefined: () => js.Promise[js.Array[TypeofUI5Element & Instantiable0[UI5Element]]]
  ): Typeofdefault = {
    val __obj = js.Dynamic.literal(_generateAccessors = js.Any.fromFunction0(_generateAccessors), _metadata = _metadata.asInstanceOf[js.Any], _needsShadowDOM = js.Any.fromFunction0(_needsShadowDOM), _needsStaticArea = js.Any.fromFunction0(_needsStaticArea), decoratorMetadata = decoratorMetadata.asInstanceOf[js.Any], define = js.Any.fromFunction0(define), getMetadata = js.Any.fromFunction0(getMetadata), getUniqueDependencies = js.Any.fromFunction0(getUniqueDependencies), onDefine = js.Any.fromFunction0(onDefine), render = js.Any.fromFunction5(render), whenDependenciesDefined = js.Any.fromFunction0(whenDependenciesDefined))
    __obj.asInstanceOf[Typeofdefault]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Typeofdefault] (val x: Self) extends AnyVal {
    
    inline def setDecoratorMetadata(value: Metadata): Self = StObject.set(x, "decoratorMetadata", value.asInstanceOf[js.Any])
    
    inline def setDefine(value: () => js.Promise[TypeofUI5Element & Instantiable0[UI5Element]]): Self = StObject.set(x, "define", js.Any.fromFunction0(value))
    
    inline def setGetMetadata(value: () => default): Self = StObject.set(x, "getMetadata", js.Any.fromFunction0(value))
    
    inline def setGetUniqueDependencies(value: () => js.Array[TypeofUI5Element & Instantiable0[UI5Element]]): Self = StObject.set(x, "getUniqueDependencies", js.Any.fromFunction0(value))
    
    inline def setOnDefine(value: () => js.Promise[Unit]): Self = StObject.set(x, "onDefine", js.Any.fromFunction0(value))
    
    inline def setRender(
      value: (/* templateFunctionResult */ TemplateFunctionResult, /* container */ HTMLElement | DocumentFragment, /* styleStrOrHrefsArr */ js.UndefOr[String | js.Array[String]], /* forStaticArea */ Boolean, /* options */ Host) => Unit
    ): Self = StObject.set(x, "render", js.Any.fromFunction5(value))
    
    inline def setStaticAreaTemplate(
      value: (/* component */ typings.ui5WebcomponentsBase.distUi5elementMod.default, /* tagsToScope */ js.Array[String], /* scope */ js.UndefOr[String]) => TemplateFunctionResult
    ): Self = StObject.set(x, "staticAreaTemplate", js.Any.fromFunction3(value))
    
    inline def setStaticAreaTemplateUndefined: Self = StObject.set(x, "staticAreaTemplate", js.undefined)
    
    inline def setTemplate(
      value: (/* component */ typings.ui5WebcomponentsBase.distUi5elementMod.default, /* tagsToScope */ js.Array[String], /* scope */ js.UndefOr[String]) => TemplateFunctionResult
    ): Self = StObject.set(x, "template", js.Any.fromFunction3(value))
    
    inline def setTemplateUndefined: Self = StObject.set(x, "template", js.undefined)
    
    inline def setWhenDependenciesDefined(value: () => js.Promise[js.Array[TypeofUI5Element & Instantiable0[UI5Element]]]): Self = StObject.set(x, "whenDependenciesDefined", js.Any.fromFunction0(value))
    
    inline def set_generateAccessors(value: () => Unit): Self = StObject.set(x, "_generateAccessors", js.Any.fromFunction0(value))
    
    inline def set_metadata(value: default): Self = StObject.set(x, "_metadata", value.asInstanceOf[js.Any])
    
    inline def set_needsShadowDOM(value: () => Boolean): Self = StObject.set(x, "_needsShadowDOM", js.Any.fromFunction0(value))
    
    inline def set_needsStaticArea(value: () => Boolean): Self = StObject.set(x, "_needsStaticArea", js.Any.fromFunction0(value))
  }
}
