package typings.ui5WebcomponentsBase

import typings.litHtml.mod.TemplateResult
import typings.std.TemplateStringsArray
import typings.ui5WebcomponentsBase.distCustomElementsScopeUtilsMod.Rules
import typings.ui5WebcomponentsBase.ui5WebcomponentsBaseInts.`1`
import typings.ui5WebcomponentsBase.ui5WebcomponentsBaseInts.`2`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCustomElementsScopeMod {
  
  @JSImport("@ui5/webcomponents-base/dist/CustomElementsScope", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@ui5/webcomponents-base/dist/CustomElementsScope", "LitStatic")
  @js.native
  open class LitStatic () extends StObject
  object LitStatic {
    
    @JSImport("@ui5/webcomponents-base/dist/CustomElementsScope", "LitStatic")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("@ui5/webcomponents-base/dist/CustomElementsScope", "LitStatic.html")
    @js.native
    def html: js.Function2[/* strings */ TemplateStringsArray, /* repeated */ Any, TemplateResult[`1` | `2`]] = js.native
    inline def html_=(x: js.Function2[/* strings */ TemplateStringsArray, /* repeated */ Any, TemplateResult[`1` | `2`]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("html")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("@ui5/webcomponents-base/dist/CustomElementsScope", "LitStatic.svg")
    @js.native
    def svg: js.Function2[/* strings */ TemplateStringsArray, /* repeated */ Any, TemplateResult[`1` | `2`]] = js.native
    inline def svg_=(x: js.Function2[/* strings */ TemplateStringsArray, /* repeated */ Any, TemplateResult[`1` | `2`]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("svg")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("@ui5/webcomponents-base/dist/CustomElementsScope", "LitStatic.unsafeStatic")
    @js.native
    def unsafeStatic: js.Function1[/* value */ String, js.Object] = js.native
    inline def unsafeStatic_=(x: js.Function1[/* value */ String, js.Object]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("unsafeStatic")(x.asInstanceOf[js.Any])
  }
  
  /**
    * Returns the rules, governing which custom element tags to scope and which not. By default, all elements
    * starting with "ui5-" are scoped. The default rules are: {include: [/^ui5-/]}.
    *
    * @public
    * @returns {Object}
    */
  inline def getCustomElementsScopingRules(): Rules = ^.asInstanceOf[js.Dynamic].applyDynamic("getCustomElementsScopingRules")().asInstanceOf[Rules]
  
  /**
    * Returns the currently set scoping suffix, or undefined if not set.
    *
    * @public
    * @returns {String|undefined}
    */
  inline def getCustomElementsScopingSuffix(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getCustomElementsScopingSuffix")().asInstanceOf[String]
  
  /**
    * Returns the currently set scoping suffix, if any and if the tag should be scoped, or undefined otherwise.
    *
    * @public
    * @param tag
    * @returns {String}
    */
  inline def getEffectiveScopingSuffixForTag(tag: String): js.UndefOr[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getEffectiveScopingSuffixForTag")(tag.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[String]]
  
  /**
    * Sets the rules, governing which custom element tags to scope and which not, f.e.
    * setCustomElementsScopingRules({include: [/^ui5-/]}, exclude: [/^ui5-mylib-/, /^ui5-carousel$/]);
    * will scope all elements starting with "ui5-" but not the ones starting with "ui5-mylib-" and not "ui5-carousel".
    *
    * @public
    * @param rules Object with "include" and "exclude" properties, both arrays of regular expressions. Note that "include"
    * rules are applied first and "exclude" rules second.
    */
  inline def setCustomElementsScopingRules(rules: Rules): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setCustomElementsScopingRules")(rules.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /**
    * Sets the suffix to be used for custom elements scoping, f.e. pass "demo" to get tags such as "ui5-button-demo".
    * Note: by default all tags starting with "ui5-" will be scoped, unless you change this by calling "setCustomElementsScopingRules"
    *
    * @public
    * @param suffix The scoping suffix
    */
  inline def setCustomElementsScopingSuffix(suffix: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setCustomElementsScopingSuffix")(suffix.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /**
    * Determines whether custom elements with the given tag should be scoped or not.
    * The tag is first matched against the "include" rules and then against the "exclude" rules and the
    * result is cached until new rules are set.
    *
    * @public
    * @param tag
    */
  inline def shouldScopeCustomElement(tag: String): js.UndefOr[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("shouldScopeCustomElement")(tag.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[Boolean]]
}
