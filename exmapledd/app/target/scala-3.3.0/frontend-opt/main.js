'use strict';
import * as $i_$0040ui5$002fwebcomponents$002dfiori$002fdist$002fUploadCollection$002ejs from "@ui5/webcomponents-fiori/dist/UploadCollection.js";
import * as $i_$0040ui5$002fwebcomponents$002dfiori$002fdist$002fUploadCollectionItem$002ejs from "@ui5/webcomponents-fiori/dist/UploadCollectionItem.js";
import * as $i_$0040ui5$002fwebcomponents$002dicons$002fdist$002fadd$002ejs from "@ui5/webcomponents-icons/dist/add.js";
import * as $i_$0040ui5$002fwebcomponents$002fdist$002fButton$002ejs from "@ui5/webcomponents/dist/Button.js";
import * as $i_$0040ui5$002fwebcomponents$002fdist$002fFileUploader$002ejs from "@ui5/webcomponents/dist/FileUploader.js";
import * as $i_$0040ui5$002fwebcomponents$002fdist$002fLabel$002ejs from "@ui5/webcomponents/dist/Label.js";
import * as $i_$0040ui5$002fwebcomponents$002fdist$002fTitle$002ejs from "@ui5/webcomponents/dist/Title.js";
import * as $j_org$002escalajs$002edom$002e$002dD$002dO$002dM$002dList$0024$002dD$002dO$002dM$002dList$002dSeq from "./org.scalajs.dom.-D-O-M-List$-D-O-M-List-Seq.js";
import * as $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong from "./org.scalajs.linker.runtime.-Runtime-Long.js";
/** @constructor */
function $c_LZipExample_ZipExample$() {
  /*<skip>*/
}
$c_LZipExample_ZipExample$.prototype = new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$h_O();
$c_LZipExample_ZipExample$.prototype.constructor = $c_LZipExample_ZipExample$;
/** @constructor */
function $h_LZipExample_ZipExample$() {
  /*<skip>*/
}
$h_LZipExample_ZipExample$.prototype = $c_LZipExample_ZipExample$.prototype;
$c_LZipExample_ZipExample$.prototype.decompressFile__Lorg_scalajs_dom_File__s_concurrent_Future = (function(file) {
  var jsZip = Object();
  var fileReader = new FileReader();
  var promise = $ct_s_concurrent_impl_Promise$DefaultPromise__(new $c_s_concurrent_impl_Promise$DefaultPromise());
  fileReader.onload = ((event) => {
    var arrayBuffer = fileReader.result;
    var p = jsZip.loadAsync(new Blob([arrayBuffer]));
    $m_sjs_js_Thenable$ThenableOps$().toFuture$extension__sjs_js_Thenable__s_concurrent_Future(p).flatMap__F1__s_concurrent_ExecutionContext__s_concurrent_Future(new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$c_sjsr_AnonFunction1(((_$1) => {
      var p$1 = jsZip.file("data1.txt").async("string");
      var contentPromise = $m_sjs_js_Thenable$ThenableOps$().toFuture$extension__sjs_js_Thenable__s_concurrent_Future(p$1);
      return contentPromise.map__F1__s_concurrent_ExecutionContext__s_concurrent_Future(new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$c_sjsr_AnonFunction1(((_$2) => $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$dp_toString__T(_$2))), $m_sjs_concurrent_JSExecutionContext$Implicits$().sjs_concurrent_JSExecutionContext$Implicits$__f_queue)
    })), $m_sjs_concurrent_JSExecutionContext$Implicits$().sjs_concurrent_JSExecutionContext$Implicits$__f_queue).onComplete__F1__s_concurrent_ExecutionContext__V(new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$c_sjsr_AnonFunction1(((x$1) => {
      var x$1$1 = x$1;
      if ((x$1$1 instanceof $c_s_util_Success)) {
        var content = x$1$1.s_util_Success__f_value;
        return $f_s_concurrent_Promise__success__O__s_concurrent_Promise(promise, content)
      };
      if ((x$1$1 instanceof $c_s_util_Failure)) {
        var error = x$1$1.s_util_Failure__f_exception;
        return $f_s_concurrent_Promise__failure__jl_Throwable__s_concurrent_Promise(promise, error)
      };
      throw new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$c_s_MatchError(x$1$1)
    })), $m_sjs_concurrent_JSExecutionContext$Implicits$().sjs_concurrent_JSExecutionContext$Implicits$__f_queue)
  });
  fileReader.onerror = ((event$2) => {
    var cause = $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$ct_jl_RuntimeException__T__(new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$c_jl_RuntimeException(), ("Error al leer el archivo: " + fileReader.error));
    return $f_s_concurrent_Promise__failure__jl_Throwable__s_concurrent_Promise(promise, cause)
  });
  fileReader.readAsArrayBuffer(file);
  return promise
});
var $d_LZipExample_ZipExample$ = new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$TypeData().initClass({
  LZipExample_ZipExample$: 0
}, false, "ZipExample.ZipExample$", {
  LZipExample_ZipExample$: 1,
  O: 1
});
$c_LZipExample_ZipExample$.prototype.$classData = $d_LZipExample_ZipExample$;
var $n_LZipExample_ZipExample$;
function $m_LZipExample_ZipExample$() {
  if ((!$n_LZipExample_ZipExample$)) {
    $n_LZipExample_ZipExample$ = new $c_LZipExample_ZipExample$()
  };
  return $n_LZipExample_ZipExample$
}
function $f_Lbe_doeraene_webcomponents_WebComponent__$init$__V($thiz) {
  $thiz.be$doeraene$webcomponents$WebComponent$_setter_$id_$eq__Lcom_raquo_laminar_keys_HtmlProp__V($m_Lcom_raquo_laminar_api_package$().Lcom_raquo_laminar_api_package$__f_L.idAttr__Lcom_raquo_laminar_keys_HtmlProp())
}
function $f_Lbe_doeraene_webcomponents_WebComponent__apply__sci_Seq__Lcom_raquo_laminar_nodes_ReactiveHtmlElement($thiz, mods) {
  return $thiz.tag__Lcom_raquo_laminar_tags_HtmlTag().apply__sci_Seq__Lcom_raquo_laminar_nodes_ReactiveHtmlElement(mods.map__F1__O(new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$c_sjsr_AnonFunction1(((x$1) => {
    if ($is_Lcom_raquo_laminar_modifiers_Modifier(x$1)) {
      var mod = x$1;
      return new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$c_sjsr_AnonFunction1(((_$1) => mod))
    };
    if ($is_F1(x$1)) {
      var mod$3 = x$1;
      return mod$3
    };
    throw new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$c_s_MatchError(x$1)
  }))).map__F1__O(new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$c_sjsr_AnonFunction1(((_$2) => {
    var _$2$1 = _$2;
    return _$2$1.apply__O__O($thiz)
  }))))
}
function $is_Lbe_doeraene_webcomponents_WebComponent(obj) {
  return (!(!((obj && obj.$classData) && obj.$classData.ancestors.Lbe_doeraene_webcomponents_WebComponent)))
}
function $isArrayOf_Lbe_doeraene_webcomponents_WebComponent(obj, depth) {
  return (!(!(((obj && obj.$classData) && (obj.$classData.arrayDepth === depth)) && obj.$classData.arrayBase.ancestors.Lbe_doeraene_webcomponents_WebComponent)))
}
/** @constructor */
function $c_Lbe_doeraene_webcomponents_ui5_Button$events$() {
  this.Lbe_doeraene_webcomponents_ui5_Button$events$__f_onClick = null;
  $n_Lbe_doeraene_webcomponents_ui5_Button$events$ = this;
  this.Lbe_doeraene_webcomponents_ui5_Button$events$__f_onClick = new $c_Lcom_raquo_laminar_keys_EventProp("click")
}
$c_Lbe_doeraene_webcomponents_ui5_Button$events$.prototype = new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$h_O();
$c_Lbe_doeraene_webcomponents_ui5_Button$events$.prototype.constructor = $c_Lbe_doeraene_webcomponents_ui5_Button$events$;
/** @constructor */
function $h_Lbe_doeraene_webcomponents_ui5_Button$events$() {
  /*<skip>*/
}
$h_Lbe_doeraene_webcomponents_ui5_Button$events$.prototype = $c_Lbe_doeraene_webcomponents_ui5_Button$events$.prototype;
var $d_Lbe_doeraene_webcomponents_ui5_Button$events$ = new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$TypeData().initClass({
  Lbe_doeraene_webcomponents_ui5_Button$events$: 0
}, false, "be.doeraene.webcomponents.ui5.Button$events$", {
  Lbe_doeraene_webcomponents_ui5_Button$events$: 1,
  O: 1
});
$c_Lbe_doeraene_webcomponents_ui5_Button$events$.prototype.$classData = $d_Lbe_doeraene_webcomponents_ui5_Button$events$;
var $n_Lbe_doeraene_webcomponents_ui5_Button$events$;
function $m_Lbe_doeraene_webcomponents_ui5_Button$events$() {
  if ((!$n_Lbe_doeraene_webcomponents_ui5_Button$events$)) {
    $n_Lbe_doeraene_webcomponents_ui5_Button$events$ = new $c_Lbe_doeraene_webcomponents_ui5_Button$events$()
  };
  return $n_Lbe_doeraene_webcomponents_ui5_Button$events$
}
/** @constructor */
function $c_Lbe_doeraene_webcomponents_ui5_FileUploader$RawElement$() {
  /*<skip>*/
}
$c_Lbe_doeraene_webcomponents_ui5_FileUploader$RawElement$.prototype = new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$h_O();
$c_Lbe_doeraene_webcomponents_ui5_FileUploader$RawElement$.prototype.constructor = $c_Lbe_doeraene_webcomponents_ui5_FileUploader$RawElement$;
/** @constructor */
function $h_Lbe_doeraene_webcomponents_ui5_FileUploader$RawElement$() {
  /*<skip>*/
}
$h_Lbe_doeraene_webcomponents_ui5_FileUploader$RawElement$.prototype = $c_Lbe_doeraene_webcomponents_ui5_FileUploader$RawElement$.prototype;
$c_Lbe_doeraene_webcomponents_ui5_FileUploader$RawElement$.prototype.files__Lbe_doeraene_webcomponents_ui5_FileUploader$RawElement__sci_List = (function(element) {
  var domList = element.files;
  var this$2 = new $j_org$002escalajs$002edom$002e$002dD$002dO$002dM$002dList$0024$002dD$002dO$002dM$002dList$002dSeq.$c_Lorg_scalajs_dom_DOMList$DOMListSeq(domList);
  $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$m_sci_List$();
  return $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$m_sci_Nil$().prependedAll__sc_IterableOnce__sci_List(this$2)
});
var $d_Lbe_doeraene_webcomponents_ui5_FileUploader$RawElement$ = new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$TypeData().initClass({
  Lbe_doeraene_webcomponents_ui5_FileUploader$RawElement$: 0
}, false, "be.doeraene.webcomponents.ui5.FileUploader$RawElement$", {
  Lbe_doeraene_webcomponents_ui5_FileUploader$RawElement$: 1,
  O: 1
});
$c_Lbe_doeraene_webcomponents_ui5_FileUploader$RawElement$.prototype.$classData = $d_Lbe_doeraene_webcomponents_ui5_FileUploader$RawElement$;
var $n_Lbe_doeraene_webcomponents_ui5_FileUploader$RawElement$;
function $m_Lbe_doeraene_webcomponents_ui5_FileUploader$RawElement$() {
  if ((!$n_Lbe_doeraene_webcomponents_ui5_FileUploader$RawElement$)) {
    $n_Lbe_doeraene_webcomponents_ui5_FileUploader$RawElement$ = new $c_Lbe_doeraene_webcomponents_ui5_FileUploader$RawElement$()
  };
  return $n_Lbe_doeraene_webcomponents_ui5_FileUploader$RawElement$
}
/** @constructor */
function $c_Lbe_doeraene_webcomponents_ui5_FileUploader$events$() {
  this.Lbe_doeraene_webcomponents_ui5_FileUploader$events$__f_onChange = null;
  $n_Lbe_doeraene_webcomponents_ui5_FileUploader$events$ = this;
  this.Lbe_doeraene_webcomponents_ui5_FileUploader$events$__f_onChange = new $c_Lcom_raquo_laminar_keys_EventProp("change")
}
$c_Lbe_doeraene_webcomponents_ui5_FileUploader$events$.prototype = new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$h_O();
$c_Lbe_doeraene_webcomponents_ui5_FileUploader$events$.prototype.constructor = $c_Lbe_doeraene_webcomponents_ui5_FileUploader$events$;
/** @constructor */
function $h_Lbe_doeraene_webcomponents_ui5_FileUploader$events$() {
  /*<skip>*/
}
$h_Lbe_doeraene_webcomponents_ui5_FileUploader$events$.prototype = $c_Lbe_doeraene_webcomponents_ui5_FileUploader$events$.prototype;
var $d_Lbe_doeraene_webcomponents_ui5_FileUploader$events$ = new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$TypeData().initClass({
  Lbe_doeraene_webcomponents_ui5_FileUploader$events$: 0
}, false, "be.doeraene.webcomponents.ui5.FileUploader$events$", {
  Lbe_doeraene_webcomponents_ui5_FileUploader$events$: 1,
  O: 1
});
$c_Lbe_doeraene_webcomponents_ui5_FileUploader$events$.prototype.$classData = $d_Lbe_doeraene_webcomponents_ui5_FileUploader$events$;
var $n_Lbe_doeraene_webcomponents_ui5_FileUploader$events$;
function $m_Lbe_doeraene_webcomponents_ui5_FileUploader$events$() {
  if ((!$n_Lbe_doeraene_webcomponents_ui5_FileUploader$events$)) {
    $n_Lbe_doeraene_webcomponents_ui5_FileUploader$events$ = new $c_Lbe_doeraene_webcomponents_ui5_FileUploader$events$()
  };
  return $n_Lbe_doeraene_webcomponents_ui5_FileUploader$events$
}
/** @constructor */
function $c_Lbe_doeraene_webcomponents_ui5_UploadCollection$events$() {
  this.Lbe_doeraene_webcomponents_ui5_UploadCollection$events$__f_onDrop = null;
  this.Lbe_doeraene_webcomponents_ui5_UploadCollection$events$__f_onItemDelete = null;
  $n_Lbe_doeraene_webcomponents_ui5_UploadCollection$events$ = this;
  this.Lbe_doeraene_webcomponents_ui5_UploadCollection$events$__f_onDrop = new $c_Lcom_raquo_laminar_keys_EventProp("drop");
  this.Lbe_doeraene_webcomponents_ui5_UploadCollection$events$__f_onItemDelete = new $c_Lcom_raquo_laminar_keys_EventProp("item-delete");
  new $c_Lcom_raquo_laminar_keys_EventProp("selection-change")
}
$c_Lbe_doeraene_webcomponents_ui5_UploadCollection$events$.prototype = new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$h_O();
$c_Lbe_doeraene_webcomponents_ui5_UploadCollection$events$.prototype.constructor = $c_Lbe_doeraene_webcomponents_ui5_UploadCollection$events$;
/** @constructor */
function $h_Lbe_doeraene_webcomponents_ui5_UploadCollection$events$() {
  /*<skip>*/
}
$h_Lbe_doeraene_webcomponents_ui5_UploadCollection$events$.prototype = $c_Lbe_doeraene_webcomponents_ui5_UploadCollection$events$.prototype;
var $d_Lbe_doeraene_webcomponents_ui5_UploadCollection$events$ = new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$TypeData().initClass({
  Lbe_doeraene_webcomponents_ui5_UploadCollection$events$: 0
}, false, "be.doeraene.webcomponents.ui5.UploadCollection$events$", {
  Lbe_doeraene_webcomponents_ui5_UploadCollection$events$: 1,
  O: 1
});
$c_Lbe_doeraene_webcomponents_ui5_UploadCollection$events$.prototype.$classData = $d_Lbe_doeraene_webcomponents_ui5_UploadCollection$events$;
var $n_Lbe_doeraene_webcomponents_ui5_UploadCollection$events$;
function $m_Lbe_doeraene_webcomponents_ui5_UploadCollection$events$() {
  if ((!$n_Lbe_doeraene_webcomponents_ui5_UploadCollection$events$)) {
    $n_Lbe_doeraene_webcomponents_ui5_UploadCollection$events$ = new $c_Lbe_doeraene_webcomponents_ui5_UploadCollection$events$()
  };
  return $n_Lbe_doeraene_webcomponents_ui5_UploadCollection$events$
}
/** @constructor */
function $c_Lbe_doeraene_webcomponents_ui5_UploadCollection$slots$() {
  this.Lbe_doeraene_webcomponents_ui5_UploadCollection$slots$__f_header = null;
  $n_Lbe_doeraene_webcomponents_ui5_UploadCollection$slots$ = this;
  this.Lbe_doeraene_webcomponents_ui5_UploadCollection$slots$__f_header = new $c_Lbe_doeraene_webcomponents_ui5_internal_Slot("header")
}
$c_Lbe_doeraene_webcomponents_ui5_UploadCollection$slots$.prototype = new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$h_O();
$c_Lbe_doeraene_webcomponents_ui5_UploadCollection$slots$.prototype.constructor = $c_Lbe_doeraene_webcomponents_ui5_UploadCollection$slots$;
/** @constructor */
function $h_Lbe_doeraene_webcomponents_ui5_UploadCollection$slots$() {
  /*<skip>*/
}
$h_Lbe_doeraene_webcomponents_ui5_UploadCollection$slots$.prototype = $c_Lbe_doeraene_webcomponents_ui5_UploadCollection$slots$.prototype;
var $d_Lbe_doeraene_webcomponents_ui5_UploadCollection$slots$ = new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$TypeData().initClass({
  Lbe_doeraene_webcomponents_ui5_UploadCollection$slots$: 0
}, false, "be.doeraene.webcomponents.ui5.UploadCollection$slots$", {
  Lbe_doeraene_webcomponents_ui5_UploadCollection$slots$: 1,
  O: 1
});
$c_Lbe_doeraene_webcomponents_ui5_UploadCollection$slots$.prototype.$classData = $d_Lbe_doeraene_webcomponents_ui5_UploadCollection$slots$;
var $n_Lbe_doeraene_webcomponents_ui5_UploadCollection$slots$;
function $m_Lbe_doeraene_webcomponents_ui5_UploadCollection$slots$() {
  if ((!$n_Lbe_doeraene_webcomponents_ui5_UploadCollection$slots$)) {
    $n_Lbe_doeraene_webcomponents_ui5_UploadCollection$slots$ = new $c_Lbe_doeraene_webcomponents_ui5_UploadCollection$slots$()
  };
  return $n_Lbe_doeraene_webcomponents_ui5_UploadCollection$slots$
}
/** @constructor */
function $c_Lbe_doeraene_webcomponents_ui5_UploadCollectionItem$slots$() {
  this.Lbe_doeraene_webcomponents_ui5_UploadCollectionItem$slots$__f_thumbnail = null;
  $n_Lbe_doeraene_webcomponents_ui5_UploadCollectionItem$slots$ = this;
  this.Lbe_doeraene_webcomponents_ui5_UploadCollectionItem$slots$__f_thumbnail = new $c_Lbe_doeraene_webcomponents_ui5_internal_Slot("thumbnail")
}
$c_Lbe_doeraene_webcomponents_ui5_UploadCollectionItem$slots$.prototype = new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$h_O();
$c_Lbe_doeraene_webcomponents_ui5_UploadCollectionItem$slots$.prototype.constructor = $c_Lbe_doeraene_webcomponents_ui5_UploadCollectionItem$slots$;
/** @constructor */
function $h_Lbe_doeraene_webcomponents_ui5_UploadCollectionItem$slots$() {
  /*<skip>*/
}
$h_Lbe_doeraene_webcomponents_ui5_UploadCollectionItem$slots$.prototype = $c_Lbe_doeraene_webcomponents_ui5_UploadCollectionItem$slots$.prototype;
var $d_Lbe_doeraene_webcomponents_ui5_UploadCollectionItem$slots$ = new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$TypeData().initClass({
  Lbe_doeraene_webcomponents_ui5_UploadCollectionItem$slots$: 0
}, false, "be.doeraene.webcomponents.ui5.UploadCollectionItem$slots$", {
  Lbe_doeraene_webcomponents_ui5_UploadCollectionItem$slots$: 1,
  O: 1
});
$c_Lbe_doeraene_webcomponents_ui5_UploadCollectionItem$slots$.prototype.$classData = $d_Lbe_doeraene_webcomponents_ui5_UploadCollectionItem$slots$;
var $n_Lbe_doeraene_webcomponents_ui5_UploadCollectionItem$slots$;
function $m_Lbe_doeraene_webcomponents_ui5_UploadCollectionItem$slots$() {
  if ((!$n_Lbe_doeraene_webcomponents_ui5_UploadCollectionItem$slots$)) {
    $n_Lbe_doeraene_webcomponents_ui5_UploadCollectionItem$slots$ = new $c_Lbe_doeraene_webcomponents_ui5_UploadCollectionItem$slots$()
  };
  return $n_Lbe_doeraene_webcomponents_ui5_UploadCollectionItem$slots$
}
function $is_Lbe_doeraene_webcomponents_ui5_configkeys_ButtonDesign(obj) {
  return (!(!((obj && obj.$classData) && obj.$classData.ancestors.Lbe_doeraene_webcomponents_ui5_configkeys_ButtonDesign)))
}
function $isArrayOf_Lbe_doeraene_webcomponents_ui5_configkeys_ButtonDesign(obj, depth) {
  return (!(!(((obj && obj.$classData) && (obj.$classData.arrayDepth === depth)) && obj.$classData.arrayBase.ancestors.Lbe_doeraene_webcomponents_ui5_configkeys_ButtonDesign)))
}
var $d_Lbe_doeraene_webcomponents_ui5_configkeys_ButtonDesign = new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$TypeData().initClass({
  Lbe_doeraene_webcomponents_ui5_configkeys_ButtonDesign: 0
}, true, "be.doeraene.webcomponents.ui5.configkeys.ButtonDesign", {
  Lbe_doeraene_webcomponents_ui5_configkeys_ButtonDesign: 1,
  O: 1
});
function $f_Lbe_doeraene_webcomponents_ui5_configkeys_EnumerationString__valueFromString__s_PartialFunction($thiz) {
  var this$4 = $thiz.allValues__sci_List();
  var f = ((v) => {
    var self = $thiz.valueOf__O__T(v);
    return new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$c_T2(self, v)
  });
  if ((this$4 === $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$m_sci_Nil$())) {
    var this$6 = $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$m_sci_Nil$()
  } else {
    var arg1 = this$4.head__O();
    var h = new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$c_sci_$colon$colon(f(arg1), $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$m_sci_Nil$());
    var t = h;
    var rest = this$4.tail__O();
    while ((rest !== $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$m_sci_Nil$())) {
      var arg1$1 = rest.head__O();
      var nx = new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$c_sci_$colon$colon(f(arg1$1), $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$m_sci_Nil$());
      t.sci_$colon$colon__f_next = nx;
      t = nx;
      rest = rest.tail__O()
    };
    var this$6 = h
  };
  $m_s_$less$colon$less$();
  return $m_sci_Map$().from__sc_IterableOnce__sci_Map(this$6)
}
function $f_Lbe_doeraene_webcomponents_ui5_configkeys_EnumerationString__fromString__T__s_Option($thiz, s) {
  return $thiz.valueFromString__s_PartialFunction().lift__F1().apply__O__O(s)
}
/** @constructor */
function $c_Lbe_doeraene_webcomponents_ui5_configkeys_IconName$() {
  /*<skip>*/
}
$c_Lbe_doeraene_webcomponents_ui5_configkeys_IconName$.prototype = new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$h_O();
$c_Lbe_doeraene_webcomponents_ui5_configkeys_IconName$.prototype.constructor = $c_Lbe_doeraene_webcomponents_ui5_configkeys_IconName$;
/** @constructor */
function $h_Lbe_doeraene_webcomponents_ui5_configkeys_IconName$() {
  /*<skip>*/
}
$h_Lbe_doeraene_webcomponents_ui5_configkeys_IconName$.prototype = $c_Lbe_doeraene_webcomponents_ui5_configkeys_IconName$.prototype;
$c_Lbe_doeraene_webcomponents_ui5_configkeys_IconName$.prototype.add__Lbe_doeraene_webcomponents_ui5_configkeys_IconName = (function() {
  $i_$0040ui5$002fwebcomponents$002dicons$002fdist$002fadd$002ejs.default;
  return "add"
});
var $d_Lbe_doeraene_webcomponents_ui5_configkeys_IconName$ = new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$TypeData().initClass({
  Lbe_doeraene_webcomponents_ui5_configkeys_IconName$: 0
}, false, "be.doeraene.webcomponents.ui5.configkeys.IconName$", {
  Lbe_doeraene_webcomponents_ui5_configkeys_IconName$: 1,
  O: 1
});
$c_Lbe_doeraene_webcomponents_ui5_configkeys_IconName$.prototype.$classData = $d_Lbe_doeraene_webcomponents_ui5_configkeys_IconName$;
var $n_Lbe_doeraene_webcomponents_ui5_configkeys_IconName$;
function $m_Lbe_doeraene_webcomponents_ui5_configkeys_IconName$() {
  if ((!$n_Lbe_doeraene_webcomponents_ui5_configkeys_IconName$)) {
    $n_Lbe_doeraene_webcomponents_ui5_configkeys_IconName$ = new $c_Lbe_doeraene_webcomponents_ui5_configkeys_IconName$()
  };
  return $n_Lbe_doeraene_webcomponents_ui5_configkeys_IconName$
}
function $is_Lbe_doeraene_webcomponents_ui5_configkeys_ListMode(obj) {
  return (!(!((obj && obj.$classData) && obj.$classData.ancestors.Lbe_doeraene_webcomponents_ui5_configkeys_ListMode)))
}
function $isArrayOf_Lbe_doeraene_webcomponents_ui5_configkeys_ListMode(obj, depth) {
  return (!(!(((obj && obj.$classData) && (obj.$classData.arrayDepth === depth)) && obj.$classData.arrayBase.ancestors.Lbe_doeraene_webcomponents_ui5_configkeys_ListMode)))
}
var $d_Lbe_doeraene_webcomponents_ui5_configkeys_ListMode = new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$TypeData().initClass({
  Lbe_doeraene_webcomponents_ui5_configkeys_ListMode: 0
}, true, "be.doeraene.webcomponents.ui5.configkeys.ListMode", {
  Lbe_doeraene_webcomponents_ui5_configkeys_ListMode: 1,
  O: 1
});
function $is_Lbe_doeraene_webcomponents_ui5_configkeys_TitleLevel(obj) {
  return (!(!((obj && obj.$classData) && obj.$classData.ancestors.Lbe_doeraene_webcomponents_ui5_configkeys_TitleLevel)))
}
function $isArrayOf_Lbe_doeraene_webcomponents_ui5_configkeys_TitleLevel(obj, depth) {
  return (!(!(((obj && obj.$classData) && (obj.$classData.arrayDepth === depth)) && obj.$classData.arrayBase.ancestors.Lbe_doeraene_webcomponents_ui5_configkeys_TitleLevel)))
}
var $d_Lbe_doeraene_webcomponents_ui5_configkeys_TitleLevel = new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$TypeData().initClass({
  Lbe_doeraene_webcomponents_ui5_configkeys_TitleLevel: 0
}, true, "be.doeraene.webcomponents.ui5.configkeys.TitleLevel", {
  Lbe_doeraene_webcomponents_ui5_configkeys_TitleLevel: 1,
  O: 1
});
/** @constructor */
function $c_Lbe_doeraene_webcomponents_ui5_internal_Slot(name) {
  this.Lbe_doeraene_webcomponents_ui5_internal_Slot__f_name = null;
  this.Lbe_doeraene_webcomponents_ui5_internal_Slot__f_slot = null;
  this.Lbe_doeraene_webcomponents_ui5_internal_Slot__f_name = name;
  $m_Lcom_raquo_laminar_api_package$();
  var codec = $m_Lcom_raquo_laminar_codecs_package$().Lcom_raquo_laminar_codecs_package$__f_StringAsIsCodec;
  this.Lbe_doeraene_webcomponents_ui5_internal_Slot__f_slot = new $c_Lcom_raquo_laminar_keys_HtmlAttr("slot", codec)
}
$c_Lbe_doeraene_webcomponents_ui5_internal_Slot.prototype = new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$h_O();
$c_Lbe_doeraene_webcomponents_ui5_internal_Slot.prototype.constructor = $c_Lbe_doeraene_webcomponents_ui5_internal_Slot;
/** @constructor */
function $h_Lbe_doeraene_webcomponents_ui5_internal_Slot() {
  /*<skip>*/
}
$h_Lbe_doeraene_webcomponents_ui5_internal_Slot.prototype = $c_Lbe_doeraene_webcomponents_ui5_internal_Slot.prototype;
$c_Lbe_doeraene_webcomponents_ui5_internal_Slot.prototype.$colon$eq__Lcom_raquo_laminar_nodes_ReactiveHtmlElement__Lcom_raquo_laminar_modifiers_Inserter = (function(element) {
  var $$x1 = $m_Lcom_raquo_laminar_api_package$().Lcom_raquo_laminar_api_package$__f_L.Lcom_raquo_laminar_api_package$$anon$1__f_Val;
  var mods = $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$m_sr_ScalaRunTime$().wrapRefArray__AO__sci_ArraySeq(new ($d_Lcom_raquo_laminar_modifiers_Modifier.getArrayOf().constr)([this.Lbe_doeraene_webcomponents_ui5_internal_Slot__f_slot.$colon$eq__O__Lcom_raquo_laminar_modifiers_KeySetter(this.Lbe_doeraene_webcomponents_ui5_internal_Slot__f_name)]));
  return this.$less$minus$minus__Lcom_raquo_airstream_core_Observable__Lcom_raquo_laminar_modifiers_Inserter($$x1.apply__O__Lcom_raquo_airstream_state_Val($f_Lcom_raquo_laminar_nodes_ReactiveElement__amend__sci_Seq__Lcom_raquo_laminar_nodes_ReactiveElement(element, mods)))
});
$c_Lbe_doeraene_webcomponents_ui5_internal_Slot.prototype.$less$minus$minus__Lcom_raquo_airstream_core_Observable__Lcom_raquo_laminar_modifiers_Inserter = (function(elementObservable) {
  $m_Lcom_raquo_laminar_api_package$();
  var childSource = elementObservable.map__F1__Lcom_raquo_airstream_core_Observable(new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$c_sjsr_AnonFunction1(((_$1) => {
    var _$1$1 = _$1;
    var mods = $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$m_sr_ScalaRunTime$().wrapRefArray__AO__sci_ArraySeq(new ($d_Lcom_raquo_laminar_modifiers_Modifier.getArrayOf().constr)([this.Lbe_doeraene_webcomponents_ui5_internal_Slot__f_slot.$colon$eq__O__Lcom_raquo_laminar_modifiers_KeySetter(this.Lbe_doeraene_webcomponents_ui5_internal_Slot__f_name)]));
    return $f_Lcom_raquo_laminar_nodes_ReactiveElement__amend__sci_Seq__Lcom_raquo_laminar_nodes_ReactiveElement(_$1$1, mods)
  })));
  return $m_Lcom_raquo_laminar_modifiers_ChildInserter$().apply__Lcom_raquo_airstream_core_Observable__Lcom_raquo_laminar_modifiers_RenderableNode__Lcom_raquo_laminar_modifiers_Inserter(childSource.toObservable__Lcom_raquo_airstream_core_Observable(), $m_Lcom_raquo_laminar_modifiers_RenderableNode$().Lcom_raquo_laminar_modifiers_RenderableNode$__f_nodeRenderable)
});
var $d_Lbe_doeraene_webcomponents_ui5_internal_Slot = new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$TypeData().initClass({
  Lbe_doeraene_webcomponents_ui5_internal_Slot: 0
}, false, "be.doeraene.webcomponents.ui5.internal.Slot", {
  Lbe_doeraene_webcomponents_ui5_internal_Slot: 1,
  O: 1
});
$c_Lbe_doeraene_webcomponents_ui5_internal_Slot.prototype.$classData = $d_Lbe_doeraene_webcomponents_ui5_internal_Slot;
/** @constructor */
function $c_Lcom_raquo_airstream_combine_CombineObservable$() {
  /*<skip>*/
}
$c_Lcom_raquo_airstream_combine_CombineObservable$.prototype = new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$h_O();
$c_Lcom_raquo_airstream_combine_CombineObservable$.prototype.constructor = $c_Lcom_raquo_airstream_combine_CombineObservable$;
/** @constructor */
function $h_Lcom_raquo_airstream_combine_CombineObservable$() {
  /*<skip>*/
}
$h_Lcom_raquo_airstream_combine_CombineObservable$.prototype = $c_Lcom_raquo_airstream_combine_CombineObservable$.prototype;
$c_Lcom_raquo_airstream_combine_CombineObservable$.prototype.jsArrayCombinator__Lcom_raquo_ew_JsArray__F1__s_util_Try = (function(trys, combinator) {
  var elem = false;
  elem = true;
  var i = 0;
  var len = (trys.length | 0);
  while ((i < len)) {
    var t = trys[i];
    var t$1 = t;
    if (t$1.isFailure__Z()) {
      var ev$6 = false;
      elem = ev$6
    };
    i = ((1 + i) | 0)
  };
  if (elem) {
    var values = trys.map(((_$3) => {
      var _$3$1 = _$3;
      return _$3$1.get__O()
    }));
    var value = combinator.apply__O__O(values);
    return new $c_s_util_Success(value)
  } else {
    var arr = trys.map(((x$1) => {
      var x$1$1 = x$1;
      if ((x$1$1 instanceof $c_s_util_Failure)) {
        var err = x$1$1.s_util_Failure__f_exception;
        return new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$c_s_Some(err)
      } else {
        return $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$m_s_None$()
      }
    }));
    var errors = $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$m_sci_IndexedSeq$().from__sc_IterableOnce__sci_IndexedSeq($j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$ct_sjs_js_WrappedArray__sjs_js_Array__(new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$c_sjs_js_WrappedArray(), arr));
    var exception = new $c_Lcom_raquo_airstream_core_AirstreamError$CombinedError(errors);
    return new $c_s_util_Failure(exception)
  }
});
var $d_Lcom_raquo_airstream_combine_CombineObservable$ = new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$TypeData().initClass({
  Lcom_raquo_airstream_combine_CombineObservable$: 0
}, false, "com.raquo.airstream.combine.CombineObservable$", {
  Lcom_raquo_airstream_combine_CombineObservable$: 1,
  O: 1
});
$c_Lcom_raquo_airstream_combine_CombineObservable$.prototype.$classData = $d_Lcom_raquo_airstream_combine_CombineObservable$;
var $n_Lcom_raquo_airstream_combine_CombineObservable$;
function $m_Lcom_raquo_airstream_combine_CombineObservable$() {
  if ((!$n_Lcom_raquo_airstream_combine_CombineObservable$)) {
    $n_Lcom_raquo_airstream_combine_CombineObservable$ = new $c_Lcom_raquo_airstream_combine_CombineObservable$()
  };
  return $n_Lcom_raquo_airstream_combine_CombineObservable$
}
/** @constructor */
function $c_Lcom_raquo_airstream_combine_generated_CombinableStream$() {
  /*<skip>*/
}
$c_Lcom_raquo_airstream_combine_generated_CombinableStream$.prototype = new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$h_O();
$c_Lcom_raquo_airstream_combine_generated_CombinableStream$.prototype.constructor = $c_Lcom_raquo_airstream_combine_generated_CombinableStream$;
/** @constructor */
function $h_Lcom_raquo_airstream_combine_generated_CombinableStream$() {
  /*<skip>*/
}
$h_Lcom_raquo_airstream_combine_generated_CombinableStream$.prototype = $c_Lcom_raquo_airstream_combine_generated_CombinableStream$.prototype;
$c_Lcom_raquo_airstream_combine_generated_CombinableStream$.prototype.sample$extension__Lcom_raquo_airstream_core_EventStream__Lcom_raquo_airstream_core_Source$SignalSource__Lcom_raquo_airstream_core_EventStream = (function(this$, s1) {
  var combinator = new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$c_sjsr_AnonFunction1(((arr) => arr[1]));
  var sampledSignals = $m_Lcom_raquo_ew_JsArray$().apply__sci_Seq__Lcom_raquo_ew_JsArray($j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$m_sr_ScalaRunTime$().wrapRefArray__AO__sci_ArraySeq(new ($d_Lcom_raquo_airstream_core_Signal.getArrayOf().constr)([s1.toObservable__Lcom_raquo_airstream_core_Signal()])));
  return new $c_Lcom_raquo_airstream_combine_SampleCombineStreamN(this$, sampledSignals, combinator)
});
var $d_Lcom_raquo_airstream_combine_generated_CombinableStream$ = new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$TypeData().initClass({
  Lcom_raquo_airstream_combine_generated_CombinableStream$: 0
}, false, "com.raquo.airstream.combine.generated.CombinableStream$", {
  Lcom_raquo_airstream_combine_generated_CombinableStream$: 1,
  O: 1
});
$c_Lcom_raquo_airstream_combine_generated_CombinableStream$.prototype.$classData = $d_Lcom_raquo_airstream_combine_generated_CombinableStream$;
var $n_Lcom_raquo_airstream_combine_generated_CombinableStream$;
function $m_Lcom_raquo_airstream_combine_generated_CombinableStream$() {
  if ((!$n_Lcom_raquo_airstream_combine_generated_CombinableStream$)) {
    $n_Lcom_raquo_airstream_combine_generated_CombinableStream$ = new $c_Lcom_raquo_airstream_combine_generated_CombinableStream$()
  };
  return $n_Lcom_raquo_airstream_combine_generated_CombinableStream$
}
/** @constructor */
function $c_Lcom_raquo_airstream_common_InternalParentObserver$() {
  /*<skip>*/
}
$c_Lcom_raquo_airstream_common_InternalParentObserver$.prototype = new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$h_O();
$c_Lcom_raquo_airstream_common_InternalParentObserver$.prototype.constructor = $c_Lcom_raquo_airstream_common_InternalParentObserver$;
/** @constructor */
function $h_Lcom_raquo_airstream_common_InternalParentObserver$() {
  /*<skip>*/
}
$h_Lcom_raquo_airstream_common_InternalParentObserver$.prototype = $c_Lcom_raquo_airstream_common_InternalParentObserver$.prototype;
$c_Lcom_raquo_airstream_common_InternalParentObserver$.prototype.fromTry__Lcom_raquo_airstream_core_Observable__F2__Lcom_raquo_airstream_common_InternalParentObserver = (function(parent, onTry) {
  return new $c_Lcom_raquo_airstream_common_InternalParentObserver$$anon$2(parent, onTry)
});
var $d_Lcom_raquo_airstream_common_InternalParentObserver$ = new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$TypeData().initClass({
  Lcom_raquo_airstream_common_InternalParentObserver$: 0
}, false, "com.raquo.airstream.common.InternalParentObserver$", {
  Lcom_raquo_airstream_common_InternalParentObserver$: 1,
  O: 1
});
$c_Lcom_raquo_airstream_common_InternalParentObserver$.prototype.$classData = $d_Lcom_raquo_airstream_common_InternalParentObserver$;
var $n_Lcom_raquo_airstream_common_InternalParentObserver$;
function $m_Lcom_raquo_airstream_common_InternalParentObserver$() {
  if ((!$n_Lcom_raquo_airstream_common_InternalParentObserver$)) {
    $n_Lcom_raquo_airstream_common_InternalParentObserver$ = new $c_Lcom_raquo_airstream_common_InternalParentObserver$()
  };
  return $n_Lcom_raquo_airstream_common_InternalParentObserver$
}
/** @constructor */
function $c_Lcom_raquo_airstream_core_EventStream$() {
  $n_Lcom_raquo_airstream_core_EventStream$ = this;
  this.fromCustomSource__F1__F4__F1__Lcom_raquo_airstream_core_EventStream(new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$c_sjsr_AnonFunction1(((_$7) => false)), new $c_sjsr_AnonFunction4(((_$8, _$9, _$10, _$11) => (void 0))), new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$c_sjsr_AnonFunction1(((v1) => (void 0))))
}
$c_Lcom_raquo_airstream_core_EventStream$.prototype = new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$h_O();
$c_Lcom_raquo_airstream_core_EventStream$.prototype.constructor = $c_Lcom_raquo_airstream_core_EventStream$;
/** @constructor */
function $h_Lcom_raquo_airstream_core_EventStream$() {
  /*<skip>*/
}
$h_Lcom_raquo_airstream_core_EventStream$.prototype = $c_Lcom_raquo_airstream_core_EventStream$.prototype;
$c_Lcom_raquo_airstream_core_EventStream$.prototype.fromCustomSource__F1__F4__F1__Lcom_raquo_airstream_core_EventStream = (function(shouldStart, start, stop) {
  return new $c_Lcom_raquo_airstream_custom_CustomStreamSource(new $c_sjsr_AnonFunction4(((fireValue, fireError, getStartIndex, getIsStarted) => {
    var fireValue$1 = fireValue;
    var fireError$1 = fireError;
    var getStartIndex$1 = getStartIndex;
    var getIsStarted$1 = getIsStarted;
    return $m_Lcom_raquo_airstream_custom_CustomSource$Config$().apply__F0__F0__Lcom_raquo_airstream_custom_CustomSource$Config(new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$c_sjsr_AnonFunction0((() => {
      start.apply__O__O__O__O__O(fireValue$1, fireError$1, getStartIndex$1, getIsStarted$1)
    })), new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$c_sjsr_AnonFunction0((() => {
      stop.apply__O__O(getStartIndex$1.apply__O())
    }))).when__F0__Lcom_raquo_airstream_custom_CustomSource$Config(new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$c_sjsr_AnonFunction0((() => (!(!shouldStart.apply__O__O(getStartIndex$1.apply__O()))))))
  })))
});
var $d_Lcom_raquo_airstream_core_EventStream$ = new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$TypeData().initClass({
  Lcom_raquo_airstream_core_EventStream$: 0
}, false, "com.raquo.airstream.core.EventStream$", {
  Lcom_raquo_airstream_core_EventStream$: 1,
  O: 1
});
$c_Lcom_raquo_airstream_core_EventStream$.prototype.$classData = $d_Lcom_raquo_airstream_core_EventStream$;
var $n_Lcom_raquo_airstream_core_EventStream$;
function $m_Lcom_raquo_airstream_core_EventStream$() {
  if ((!$n_Lcom_raquo_airstream_core_EventStream$)) {
    $n_Lcom_raquo_airstream_core_EventStream$ = new $c_Lcom_raquo_airstream_core_EventStream$()
  };
  return $n_Lcom_raquo_airstream_core_EventStream$
}
function $is_Lcom_raquo_airstream_core_InternalObserver(obj) {
  return (!(!((obj && obj.$classData) && obj.$classData.ancestors.Lcom_raquo_airstream_core_InternalObserver)))
}
function $isArrayOf_Lcom_raquo_airstream_core_InternalObserver(obj, depth) {
  return (!(!(((obj && obj.$classData) && (obj.$classData.arrayDepth === depth)) && obj.$classData.arrayBase.ancestors.Lcom_raquo_airstream_core_InternalObserver)))
}
var $d_Lcom_raquo_airstream_core_InternalObserver = new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$TypeData().initClass({
  Lcom_raquo_airstream_core_InternalObserver: 0
}, true, "com.raquo.airstream.core.InternalObserver", {
  Lcom_raquo_airstream_core_InternalObserver: 1,
  O: 1
});
function $f_Lcom_raquo_airstream_core_Named__displayName__T($thiz) {
  var x = $thiz.maybeDisplayName__O();
  return ((x === (void 0)) ? $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$c_O.prototype.toString__T.call($thiz) : x)
}
/** @constructor */
function $c_Lcom_raquo_airstream_core_Observer$() {
  $n_Lcom_raquo_airstream_core_Observer$ = this;
  var this$2 = $m_Lcom_raquo_airstream_core_Observer$();
  var onNext = new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$c_sjsr_AnonFunction1(((_$1) => (void 0)));
  this$2.withRecover__F1__s_PartialFunction__Z__Lcom_raquo_airstream_core_Observer(onNext, $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$m_s_PartialFunction$().s_PartialFunction$__f_empty_pf, true)
}
$c_Lcom_raquo_airstream_core_Observer$.prototype = new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$h_O();
$c_Lcom_raquo_airstream_core_Observer$.prototype.constructor = $c_Lcom_raquo_airstream_core_Observer$;
/** @constructor */
function $h_Lcom_raquo_airstream_core_Observer$() {
  /*<skip>*/
}
$h_Lcom_raquo_airstream_core_Observer$.prototype = $c_Lcom_raquo_airstream_core_Observer$.prototype;
$c_Lcom_raquo_airstream_core_Observer$.prototype.withRecover__F1__s_PartialFunction__Z__Lcom_raquo_airstream_core_Observer = (function(onNext, onError, handleObserverErrors) {
  return new $c_Lcom_raquo_airstream_core_Observer$$anon$8(handleObserverErrors, onNext, onError)
});
$c_Lcom_raquo_airstream_core_Observer$.prototype.fromTry__s_PartialFunction__Z__Lcom_raquo_airstream_core_Observer = (function(onTry, handleObserverErrors) {
  return new $c_Lcom_raquo_airstream_core_Observer$$anon$9(handleObserverErrors, onTry)
});
var $d_Lcom_raquo_airstream_core_Observer$ = new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$TypeData().initClass({
  Lcom_raquo_airstream_core_Observer$: 0
}, false, "com.raquo.airstream.core.Observer$", {
  Lcom_raquo_airstream_core_Observer$: 1,
  O: 1
});
$c_Lcom_raquo_airstream_core_Observer$.prototype.$classData = $d_Lcom_raquo_airstream_core_Observer$;
var $n_Lcom_raquo_airstream_core_Observer$;
function $m_Lcom_raquo_airstream_core_Observer$() {
  if ((!$n_Lcom_raquo_airstream_core_Observer$)) {
    $n_Lcom_raquo_airstream_core_Observer$ = new $c_Lcom_raquo_airstream_core_Observer$()
  };
  return $n_Lcom_raquo_airstream_core_Observer$
}
/** @constructor */
function $c_Lcom_raquo_airstream_core_ObserverList$() {
  /*<skip>*/
}
$c_Lcom_raquo_airstream_core_ObserverList$.prototype = new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$h_O();
$c_Lcom_raquo_airstream_core_ObserverList$.prototype.constructor = $c_Lcom_raquo_airstream_core_ObserverList$;
/** @constructor */
function $h_Lcom_raquo_airstream_core_ObserverList$() {
  /*<skip>*/
}
$h_Lcom_raquo_airstream_core_ObserverList$.prototype = $c_Lcom_raquo_airstream_core_ObserverList$.prototype;
$c_Lcom_raquo_airstream_core_ObserverList$.prototype.removeObserverNow$extension__Lcom_raquo_ew_JsArray__O__Z = (function(this$, observer) {
  var index = (this$.indexOf(observer) | 0);
  var shouldRemove = (index !== (-1));
  if (shouldRemove) {
    this$.splice(index, 1)
  };
  return shouldRemove
});
var $d_Lcom_raquo_airstream_core_ObserverList$ = new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$TypeData().initClass({
  Lcom_raquo_airstream_core_ObserverList$: 0
}, false, "com.raquo.airstream.core.ObserverList$", {
  Lcom_raquo_airstream_core_ObserverList$: 1,
  O: 1
});
$c_Lcom_raquo_airstream_core_ObserverList$.prototype.$classData = $d_Lcom_raquo_airstream_core_ObserverList$;
var $n_Lcom_raquo_airstream_core_ObserverList$;
function $m_Lcom_raquo_airstream_core_ObserverList$() {
  if ((!$n_Lcom_raquo_airstream_core_ObserverList$)) {
    $n_Lcom_raquo_airstream_core_ObserverList$ = new $c_Lcom_raquo_airstream_core_ObserverList$()
  };
  return $n_Lcom_raquo_airstream_core_ObserverList$
}
/** @constructor */
function $c_Lcom_raquo_airstream_core_Protected() {
  /*<skip>*/
}
$c_Lcom_raquo_airstream_core_Protected.prototype = new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$h_O();
$c_Lcom_raquo_airstream_core_Protected.prototype.constructor = $c_Lcom_raquo_airstream_core_Protected;
/** @constructor */
function $h_Lcom_raquo_airstream_core_Protected() {
  /*<skip>*/
}
$h_Lcom_raquo_airstream_core_Protected.prototype = $c_Lcom_raquo_airstream_core_Protected.prototype;
var $d_Lcom_raquo_airstream_core_Protected = new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$TypeData().initClass({
  Lcom_raquo_airstream_core_Protected: 0
}, false, "com.raquo.airstream.core.Protected", {
  Lcom_raquo_airstream_core_Protected: 1,
  O: 1
});
$c_Lcom_raquo_airstream_core_Protected.prototype.$classData = $d_Lcom_raquo_airstream_core_Protected;
/** @constructor */
function $c_Lcom_raquo_airstream_core_Protected$() {
  this.Lcom_raquo_airstream_core_Protected$__f_protectedAccessEvidence = null;
  $n_Lcom_raquo_airstream_core_Protected$ = this;
  this.Lcom_raquo_airstream_core_Protected$__f_protectedAccessEvidence = new $c_Lcom_raquo_airstream_core_Protected()
}
$c_Lcom_raquo_airstream_core_Protected$.prototype = new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$h_O();
$c_Lcom_raquo_airstream_core_Protected$.prototype.constructor = $c_Lcom_raquo_airstream_core_Protected$;
/** @constructor */
function $h_Lcom_raquo_airstream_core_Protected$() {
  /*<skip>*/
}
$h_Lcom_raquo_airstream_core_Protected$.prototype = $c_Lcom_raquo_airstream_core_Protected$.prototype;
$c_Lcom_raquo_airstream_core_Protected$.prototype.maxTopoRank__Lcom_raquo_airstream_core_Observable__Lcom_raquo_ew_JsArray__I = (function(observable, observables) {
  return this.maxTopoRank__I__Lcom_raquo_ew_JsArray__I(($m_Lcom_raquo_airstream_core_Protected$(), observable.topoRank__I()), observables)
});
$c_Lcom_raquo_airstream_core_Protected$.prototype.maxTopoRank__I__Lcom_raquo_ew_JsArray__I = (function(minRank, observables) {
  var elem = 0;
  elem = minRank;
  var i = 0;
  var len = (observables.length | 0);
  while ((i < len)) {
    var observable = observables[i];
    var observable$1 = observable;
    $m_Lcom_raquo_airstream_core_Protected$();
    var rank = observable$1.topoRank__I();
    if ((rank > elem)) {
      var ev$2 = rank;
      elem = ev$2
    };
    i = ((1 + i) | 0)
  };
  return elem
});
var $d_Lcom_raquo_airstream_core_Protected$ = new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$TypeData().initClass({
  Lcom_raquo_airstream_core_Protected$: 0
}, false, "com.raquo.airstream.core.Protected$", {
  Lcom_raquo_airstream_core_Protected$: 1,
  O: 1
});
$c_Lcom_raquo_airstream_core_Protected$.prototype.$classData = $d_Lcom_raquo_airstream_core_Protected$;
var $n_Lcom_raquo_airstream_core_Protected$;
function $m_Lcom_raquo_airstream_core_Protected$() {
  if ((!$n_Lcom_raquo_airstream_core_Protected$)) {
    $n_Lcom_raquo_airstream_core_Protected$ = new $c_Lcom_raquo_airstream_core_Protected$()
  };
  return $n_Lcom_raquo_airstream_core_Protected$
}
/** @constructor */
function $c_Lcom_raquo_airstream_core_Signal$() {
  this.Lcom_raquo_airstream_core_Signal$__f_lastUpdateId = 0;
  this.Lcom_raquo_airstream_core_Signal$__f_lastUpdateId = 0
}
$c_Lcom_raquo_airstream_core_Signal$.prototype = new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$h_O();
$c_Lcom_raquo_airstream_core_Signal$.prototype.constructor = $c_Lcom_raquo_airstream_core_Signal$;
/** @constructor */
function $h_Lcom_raquo_airstream_core_Signal$() {
  /*<skip>*/
}
$h_Lcom_raquo_airstream_core_Signal$.prototype = $c_Lcom_raquo_airstream_core_Signal$.prototype;
$c_Lcom_raquo_airstream_core_Signal$.prototype.nextUpdateId__I = (function() {
  if ((this.Lcom_raquo_airstream_core_Signal$__f_lastUpdateId === 2147483647)) {
    this.Lcom_raquo_airstream_core_Signal$__f_lastUpdateId = 1
  } else {
    this.Lcom_raquo_airstream_core_Signal$__f_lastUpdateId = ((1 + this.Lcom_raquo_airstream_core_Signal$__f_lastUpdateId) | 0)
  };
  return this.Lcom_raquo_airstream_core_Signal$__f_lastUpdateId
});
var $d_Lcom_raquo_airstream_core_Signal$ = new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$TypeData().initClass({
  Lcom_raquo_airstream_core_Signal$: 0
}, false, "com.raquo.airstream.core.Signal$", {
  Lcom_raquo_airstream_core_Signal$: 1,
  O: 1
});
$c_Lcom_raquo_airstream_core_Signal$.prototype.$classData = $d_Lcom_raquo_airstream_core_Signal$;
var $n_Lcom_raquo_airstream_core_Signal$;
function $m_Lcom_raquo_airstream_core_Signal$() {
  if ((!$n_Lcom_raquo_airstream_core_Signal$)) {
    $n_Lcom_raquo_airstream_core_Signal$ = new $c_Lcom_raquo_airstream_core_Signal$()
  };
  return $n_Lcom_raquo_airstream_core_Signal$
}
/** @constructor */
function $c_Lcom_raquo_airstream_core_Transaction(code) {
  this.Lcom_raquo_airstream_core_Transaction__f_code = null;
  this.Lcom_raquo_airstream_core_Transaction__f_maybePendingObservables = null;
  this.Lcom_raquo_airstream_core_Transaction__f_code = code;
  this.Lcom_raquo_airstream_core_Transaction__f_maybePendingObservables = (void 0);
  $m_Lcom_raquo_airstream_core_Transaction$pendingTransactions$().add__Lcom_raquo_airstream_core_Transaction__V(this)
}
$c_Lcom_raquo_airstream_core_Transaction.prototype = new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$h_O();
$c_Lcom_raquo_airstream_core_Transaction.prototype.constructor = $c_Lcom_raquo_airstream_core_Transaction;
/** @constructor */
function $h_Lcom_raquo_airstream_core_Transaction() {
  /*<skip>*/
}
$h_Lcom_raquo_airstream_core_Transaction.prototype = $c_Lcom_raquo_airstream_core_Transaction.prototype;
$c_Lcom_raquo_airstream_core_Transaction.prototype.containsPendingObservable__Lcom_raquo_airstream_core_SyncObservable__Z = (function(observable) {
  var x = this.Lcom_raquo_airstream_core_Transaction__f_maybePendingObservables;
  if ((x === (void 0))) {
    var x$1 = (void 0)
  } else {
    var _$1 = x;
    var a = _$1.contains__O__Z(observable);
    var x$1 = a
  };
  return (!(!((x$1 === (void 0)) ? false : x$1)))
});
$c_Lcom_raquo_airstream_core_Transaction.prototype.enqueuePendingObservable__Lcom_raquo_airstream_core_SyncObservable__V = (function(observable) {
  var x = this.Lcom_raquo_airstream_core_Transaction__f_maybePendingObservables;
  if ((x === (void 0))) {
    var newQueue = new $c_Lcom_raquo_airstream_util_JsPriorityQueue(new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$c_sjsr_AnonFunction1(((observable$1) => {
      var observable$2 = observable$1;
      $m_Lcom_raquo_airstream_core_Protected$();
      return observable$2.Lcom_raquo_airstream_combine_SampleCombineStreamN__f_topoRank
    })));
    this.Lcom_raquo_airstream_core_Transaction__f_maybePendingObservables = newQueue;
    var $$x1 = newQueue
  } else {
    var $$x1 = x
  };
  var queue = $$x1;
  queue.enqueue__O__V(observable)
});
function $isArrayOf_Lcom_raquo_airstream_core_Transaction(obj, depth) {
  return (!(!(((obj && obj.$classData) && (obj.$classData.arrayDepth === depth)) && obj.$classData.arrayBase.ancestors.Lcom_raquo_airstream_core_Transaction)))
}
var $d_Lcom_raquo_airstream_core_Transaction = new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$TypeData().initClass({
  Lcom_raquo_airstream_core_Transaction: 0
}, false, "com.raquo.airstream.core.Transaction", {
  Lcom_raquo_airstream_core_Transaction: 1,
  O: 1
});
$c_Lcom_raquo_airstream_core_Transaction.prototype.$classData = $d_Lcom_raquo_airstream_core_Transaction;
/** @constructor */
function $c_Lcom_raquo_airstream_core_Transaction$() {
  this.Lcom_raquo_airstream_core_Transaction$__f_com$raquo$airstream$core$Transaction$$$throwDeadTrxError = null;
  $n_Lcom_raquo_airstream_core_Transaction$ = this;
  this.Lcom_raquo_airstream_core_Transaction$__f_com$raquo$airstream$core$Transaction$$$throwDeadTrxError = new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$c_sjsr_AnonFunction1(((trx) => {
    var trx$1 = trx;
    throw $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$ct_jl_Exception__T__(new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$c_jl_Exception(), (("Attempted to run Transaction " + trx$1) + " after it was already executed."))
  }))
}
$c_Lcom_raquo_airstream_core_Transaction$.prototype = new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$h_O();
$c_Lcom_raquo_airstream_core_Transaction$.prototype.constructor = $c_Lcom_raquo_airstream_core_Transaction$;
/** @constructor */
function $h_Lcom_raquo_airstream_core_Transaction$() {
  /*<skip>*/
}
$h_Lcom_raquo_airstream_core_Transaction$.prototype = $c_Lcom_raquo_airstream_core_Transaction$.prototype;
$c_Lcom_raquo_airstream_core_Transaction$.prototype.com$raquo$airstream$core$Transaction$$$run__Lcom_raquo_airstream_core_Transaction__V = (function(transaction) {
  try {
    transaction.Lcom_raquo_airstream_core_Transaction__f_code.apply__O__O(transaction);
    var x = transaction.Lcom_raquo_airstream_core_Transaction__f_maybePendingObservables;
    if ((x !== (void 0))) {
      var pendingObservables = x;
      while (((pendingObservables.Lcom_raquo_airstream_util_JsPriorityQueue__f_queue.length | 0) !== 0)) {
        if (((pendingObservables.Lcom_raquo_airstream_util_JsPriorityQueue__f_queue.length | 0) === 0)) {
          throw $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$ct_jl_Exception__T__(new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$c_jl_Exception(), "Unable to dequeue an empty JsPriorityQueue")
        };
        pendingObservables.Lcom_raquo_airstream_util_JsPriorityQueue__f_queue.shift().syncFire__Lcom_raquo_airstream_core_Transaction__V(transaction)
      }
    }
  } catch (e) {
    var e$2 = ((e instanceof $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$c_jl_Throwable) ? e : new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$c_sjs_js_JavaScriptException(e));
    $m_Lcom_raquo_airstream_core_AirstreamError$().sendUnhandledError__jl_Throwable__V(e$2)
  } finally {
    $m_Lcom_raquo_airstream_core_Transaction$pendingTransactions$().done__Lcom_raquo_airstream_core_Transaction__V(transaction)
  }
});
var $d_Lcom_raquo_airstream_core_Transaction$ = new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$TypeData().initClass({
  Lcom_raquo_airstream_core_Transaction$: 0
}, false, "com.raquo.airstream.core.Transaction$", {
  Lcom_raquo_airstream_core_Transaction$: 1,
  O: 1
});
$c_Lcom_raquo_airstream_core_Transaction$.prototype.$classData = $d_Lcom_raquo_airstream_core_Transaction$;
var $n_Lcom_raquo_airstream_core_Transaction$;
function $m_Lcom_raquo_airstream_core_Transaction$() {
  if ((!$n_Lcom_raquo_airstream_core_Transaction$)) {
    $n_Lcom_raquo_airstream_core_Transaction$ = new $c_Lcom_raquo_airstream_core_Transaction$()
  };
  return $n_Lcom_raquo_airstream_core_Transaction$
}
function $p_Lcom_raquo_airstream_core_Transaction$onStart$__resolve__V($thiz) {
  if ((($thiz.Lcom_raquo_airstream_core_Transaction$onStart$__f_pendingCallbacks.length | 0) > 0)) {
    new $c_Lcom_raquo_airstream_core_Transaction(new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$c_sjsr_AnonFunction1(((trx) => {
      var trx$1 = trx;
      while ((($thiz.Lcom_raquo_airstream_core_Transaction$onStart$__f_pendingCallbacks.length | 0) > 0)) {
        var callback = $thiz.Lcom_raquo_airstream_core_Transaction$onStart$__f_pendingCallbacks.pop();
        try {
          callback.apply__O__O(trx$1)
        } catch (e) {
          var e$2 = ((e instanceof $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$c_jl_Throwable) ? e : new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$c_sjs_js_JavaScriptException(e));
          $m_Lcom_raquo_airstream_core_AirstreamError$().sendUnhandledError__jl_Throwable__V(e$2)
        }
      }
    })))
  }
}
/** @constructor */
function $c_Lcom_raquo_airstream_core_Transaction$onStart$() {
  this.Lcom_raquo_airstream_core_Transaction$onStart$__f_level = 0;
  this.Lcom_raquo_airstream_core_Transaction$onStart$__f_pendingCallbacks = null;
  $n_Lcom_raquo_airstream_core_Transaction$onStart$ = this;
  this.Lcom_raquo_airstream_core_Transaction$onStart$__f_level = 0;
  this.Lcom_raquo_airstream_core_Transaction$onStart$__f_pendingCallbacks = $m_Lcom_raquo_ew_JsArray$().apply__sci_Seq__Lcom_raquo_ew_JsArray($j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$m_sr_ScalaRunTime$().wrapRefArray__AO__sci_ArraySeq(new ($d_F1.getArrayOf().constr)([])))
}
$c_Lcom_raquo_airstream_core_Transaction$onStart$.prototype = new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$h_O();
$c_Lcom_raquo_airstream_core_Transaction$onStart$.prototype.constructor = $c_Lcom_raquo_airstream_core_Transaction$onStart$;
/** @constructor */
function $h_Lcom_raquo_airstream_core_Transaction$onStart$() {
  /*<skip>*/
}
$h_Lcom_raquo_airstream_core_Transaction$onStart$.prototype = $c_Lcom_raquo_airstream_core_Transaction$onStart$.prototype;
var $d_Lcom_raquo_airstream_core_Transaction$onStart$ = new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$TypeData().initClass({
  Lcom_raquo_airstream_core_Transaction$onStart$: 0
}, false, "com.raquo.airstream.core.Transaction$onStart$", {
  Lcom_raquo_airstream_core_Transaction$onStart$: 1,
  O: 1
});
$c_Lcom_raquo_airstream_core_Transaction$onStart$.prototype.$classData = $d_Lcom_raquo_airstream_core_Transaction$onStart$;
var $n_Lcom_raquo_airstream_core_Transaction$onStart$;
function $m_Lcom_raquo_airstream_core_Transaction$onStart$() {
  if ((!$n_Lcom_raquo_airstream_core_Transaction$onStart$)) {
    $n_Lcom_raquo_airstream_core_Transaction$onStart$ = new $c_Lcom_raquo_airstream_core_Transaction$onStart$()
  };
  return $n_Lcom_raquo_airstream_core_Transaction$onStart$
}
function $p_Lcom_raquo_airstream_core_Transaction$pendingTransactions$__maybeChildrenFor__Lcom_raquo_airstream_core_Transaction__O($thiz, transaction) {
  return $thiz.Lcom_raquo_airstream_core_Transaction$pendingTransactions$__f_children.get(transaction)
}
function $p_Lcom_raquo_airstream_core_Transaction$pendingTransactions$__pushToStack__Lcom_raquo_airstream_core_Transaction__V($thiz, transaction) {
  $thiz.Lcom_raquo_airstream_core_Transaction$pendingTransactions$__f_stack.unshift(transaction)
}
function $p_Lcom_raquo_airstream_core_Transaction$pendingTransactions$__popStack__O($thiz) {
  return $thiz.Lcom_raquo_airstream_core_Transaction$pendingTransactions$__f_stack.shift()
}
function $p_Lcom_raquo_airstream_core_Transaction$pendingTransactions$__enqueueChild__Lcom_raquo_airstream_core_Transaction__Lcom_raquo_airstream_core_Transaction__V($thiz, parent, newChild) {
  var maybeChildren = $p_Lcom_raquo_airstream_core_Transaction$pendingTransactions$__maybeChildrenFor__Lcom_raquo_airstream_core_Transaction__O($thiz, parent);
  var noChildrenFound = (maybeChildren === (void 0));
  var newChildren = ((maybeChildren === (void 0)) ? $m_Lcom_raquo_ew_JsArray$().apply__sci_Seq__Lcom_raquo_ew_JsArray($j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$m_sr_ScalaRunTime$().wrapRefArray__AO__sci_ArraySeq(new ($d_Lcom_raquo_airstream_core_Transaction.getArrayOf().constr)([]))) : maybeChildren);
  newChildren.push(newChild);
  if (noChildrenFound) {
    $thiz.Lcom_raquo_airstream_core_Transaction$pendingTransactions$__f_children.set(parent, newChildren)
  }
}
function $p_Lcom_raquo_airstream_core_Transaction$pendingTransactions$__dequeueChild__Lcom_raquo_airstream_core_Transaction__O($thiz, parent) {
  var maybeParentChildren = $p_Lcom_raquo_airstream_core_Transaction$pendingTransactions$__maybeChildrenFor__Lcom_raquo_airstream_core_Transaction__O($thiz, parent);
  var x = (((maybeParentChildren === (void 0)) || ((maybeParentChildren.length | 0) > 0)) ? maybeParentChildren : (void 0));
  if ((x === (void 0))) {
    return (void 0)
  } else {
    var nextChild = x.shift();
    if (((x.length | 0) === 0)) {
      (!(!$thiz.Lcom_raquo_airstream_core_Transaction$pendingTransactions$__f_children.delete(parent)))
    };
    return nextChild
  }
}
/** @constructor */
function $c_Lcom_raquo_airstream_core_Transaction$pendingTransactions$() {
  this.Lcom_raquo_airstream_core_Transaction$pendingTransactions$__f_stack = null;
  this.Lcom_raquo_airstream_core_Transaction$pendingTransactions$__f_children = null;
  $n_Lcom_raquo_airstream_core_Transaction$pendingTransactions$ = this;
  this.Lcom_raquo_airstream_core_Transaction$pendingTransactions$__f_stack = $m_Lcom_raquo_ew_JsArray$().apply__sci_Seq__Lcom_raquo_ew_JsArray($j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$m_sr_ScalaRunTime$().wrapRefArray__AO__sci_ArraySeq(new ($d_Lcom_raquo_airstream_core_Transaction.getArrayOf().constr)([])));
  this.Lcom_raquo_airstream_core_Transaction$pendingTransactions$__f_children = new Map()
}
$c_Lcom_raquo_airstream_core_Transaction$pendingTransactions$.prototype = new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$h_O();
$c_Lcom_raquo_airstream_core_Transaction$pendingTransactions$.prototype.constructor = $c_Lcom_raquo_airstream_core_Transaction$pendingTransactions$;
/** @constructor */
function $h_Lcom_raquo_airstream_core_Transaction$pendingTransactions$() {
  /*<skip>*/
}
$h_Lcom_raquo_airstream_core_Transaction$pendingTransactions$.prototype = $c_Lcom_raquo_airstream_core_Transaction$pendingTransactions$.prototype;
$c_Lcom_raquo_airstream_core_Transaction$pendingTransactions$.prototype.add__Lcom_raquo_airstream_core_Transaction__V = (function(newTransaction) {
  var x = this.peekStack__O();
  if ((x === (void 0))) {
    $p_Lcom_raquo_airstream_core_Transaction$pendingTransactions$__pushToStack__Lcom_raquo_airstream_core_Transaction__V(this, newTransaction);
    $m_Lcom_raquo_airstream_core_Transaction$().com$raquo$airstream$core$Transaction$$$run__Lcom_raquo_airstream_core_Transaction__V(newTransaction)
  } else {
    var currentTransaction = x;
    $p_Lcom_raquo_airstream_core_Transaction$pendingTransactions$__enqueueChild__Lcom_raquo_airstream_core_Transaction__Lcom_raquo_airstream_core_Transaction__V(this, currentTransaction, newTransaction)
  }
});
$c_Lcom_raquo_airstream_core_Transaction$pendingTransactions$.prototype.done__Lcom_raquo_airstream_core_Transaction__V = (function(transaction) {
  var x = this.peekStack__O();
  if ((!((x !== (void 0)) && $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$m_sr_BoxesRunTime$().equals__O__O__Z(transaction, x)))) {
    throw $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$ct_jl_Exception__T__(new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$c_jl_Exception(), "Transaction queue error: Completed transaction is not the first in stack. This is a bug in Airstream.")
  };
  this.putNextTransactionOnStack__Lcom_raquo_airstream_core_Transaction__V(transaction);
  transaction.Lcom_raquo_airstream_core_Transaction__f_code = $m_Lcom_raquo_airstream_core_Transaction$().Lcom_raquo_airstream_core_Transaction$__f_com$raquo$airstream$core$Transaction$$$throwDeadTrxError;
  var x$1 = this.peekStack__O();
  if ((x$1 === (void 0))) {
    if (((this.Lcom_raquo_airstream_core_Transaction$pendingTransactions$__f_children.size | 0) > 0)) {
      var numChildren = new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$c_sr_IntRef(0);
      this.Lcom_raquo_airstream_core_Transaction$pendingTransactions$__f_children.forEach(((transactions, _$2) => {
        var ev$14 = ((numChildren.sr_IntRef__f_elem + (transactions.length | 0)) | 0);
        numChildren.sr_IntRef__f_elem = ev$14
      }));
      throw $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$ct_jl_Exception__T__(new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$c_jl_Exception(), (((("Transaction queue error: Stack cleared, but a total of " + numChildren.sr_IntRef__f_elem) + " children for ") + (this.Lcom_raquo_airstream_core_Transaction$pendingTransactions$__f_children.size | 0)) + " transactions remain. This is a bug in Airstream."))
    }
  } else {
    var nextTransaction = x$1;
    $m_Lcom_raquo_airstream_core_Transaction$().com$raquo$airstream$core$Transaction$$$run__Lcom_raquo_airstream_core_Transaction__V(nextTransaction)
  }
});
$c_Lcom_raquo_airstream_core_Transaction$pendingTransactions$.prototype.putNextTransactionOnStack__Lcom_raquo_airstream_core_Transaction__V = (function(doneTransaction) {
  var x = $p_Lcom_raquo_airstream_core_Transaction$pendingTransactions$__dequeueChild__Lcom_raquo_airstream_core_Transaction__O(this, doneTransaction);
  if ((x === (void 0))) {
    $p_Lcom_raquo_airstream_core_Transaction$pendingTransactions$__popStack__O(this);
    var x$1 = this.peekStack__O();
    if ((x$1 !== (void 0))) {
      var parentTransaction = x$1;
      this.putNextTransactionOnStack__Lcom_raquo_airstream_core_Transaction__V(parentTransaction)
    }
  } else {
    var nextChild = x;
    $p_Lcom_raquo_airstream_core_Transaction$pendingTransactions$__pushToStack__Lcom_raquo_airstream_core_Transaction__V(this, nextChild)
  }
});
$c_Lcom_raquo_airstream_core_Transaction$pendingTransactions$.prototype.peekStack__O = (function() {
  return this.Lcom_raquo_airstream_core_Transaction$pendingTransactions$__f_stack[0]
});
var $d_Lcom_raquo_airstream_core_Transaction$pendingTransactions$ = new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$TypeData().initClass({
  Lcom_raquo_airstream_core_Transaction$pendingTransactions$: 0
}, false, "com.raquo.airstream.core.Transaction$pendingTransactions$", {
  Lcom_raquo_airstream_core_Transaction$pendingTransactions$: 1,
  O: 1
});
$c_Lcom_raquo_airstream_core_Transaction$pendingTransactions$.prototype.$classData = $d_Lcom_raquo_airstream_core_Transaction$pendingTransactions$;
var $n_Lcom_raquo_airstream_core_Transaction$pendingTransactions$;
function $m_Lcom_raquo_airstream_core_Transaction$pendingTransactions$() {
  if ((!$n_Lcom_raquo_airstream_core_Transaction$pendingTransactions$)) {
    $n_Lcom_raquo_airstream_core_Transaction$pendingTransactions$ = new $c_Lcom_raquo_airstream_core_Transaction$pendingTransactions$()
  };
  return $n_Lcom_raquo_airstream_core_Transaction$pendingTransactions$
}
/** @constructor */
function $c_Lcom_raquo_airstream_custom_CustomSource$Config(onWillStart, onStart, onStop) {
  this.Lcom_raquo_airstream_custom_CustomSource$Config__f_onWillStart = null;
  this.Lcom_raquo_airstream_custom_CustomSource$Config__f_onStart = null;
  this.Lcom_raquo_airstream_custom_CustomSource$Config__f_onStop = null;
  this.Lcom_raquo_airstream_custom_CustomSource$Config__f_onWillStart = onWillStart;
  this.Lcom_raquo_airstream_custom_CustomSource$Config__f_onStart = onStart;
  this.Lcom_raquo_airstream_custom_CustomSource$Config__f_onStop = onStop
}
$c_Lcom_raquo_airstream_custom_CustomSource$Config.prototype = new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$h_O();
$c_Lcom_raquo_airstream_custom_CustomSource$Config.prototype.constructor = $c_Lcom_raquo_airstream_custom_CustomSource$Config;
/** @constructor */
function $h_Lcom_raquo_airstream_custom_CustomSource$Config() {
  /*<skip>*/
}
$h_Lcom_raquo_airstream_custom_CustomSource$Config.prototype = $c_Lcom_raquo_airstream_custom_CustomSource$Config.prototype;
$c_Lcom_raquo_airstream_custom_CustomSource$Config.prototype.when__F0__Lcom_raquo_airstream_custom_CustomSource$Config = (function(passes) {
  var passed = new $c_sr_BooleanRef(false);
  return new $c_Lcom_raquo_airstream_custom_CustomSource$Config(new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$c_sjsr_AnonFunction0((() => {
    var ev$1 = (!(!passes.apply__O()));
    passed.sr_BooleanRef__f_elem = ev$1;
    if (passed.sr_BooleanRef__f_elem) {
      this.Lcom_raquo_airstream_custom_CustomSource$Config__f_onWillStart.apply__O()
    }
  })), new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$c_sjsr_AnonFunction0((() => {
    if (passed.sr_BooleanRef__f_elem) {
      this.Lcom_raquo_airstream_custom_CustomSource$Config__f_onStart.apply__O()
    }
  })), new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$c_sjsr_AnonFunction0((() => {
    if (passed.sr_BooleanRef__f_elem) {
      this.Lcom_raquo_airstream_custom_CustomSource$Config__f_onStop.apply__O()
    };
    var ev$2 = false;
    passed.sr_BooleanRef__f_elem = ev$2
  })))
});
function $isArrayOf_Lcom_raquo_airstream_custom_CustomSource$Config(obj, depth) {
  return (!(!(((obj && obj.$classData) && (obj.$classData.arrayDepth === depth)) && obj.$classData.arrayBase.ancestors.Lcom_raquo_airstream_custom_CustomSource$Config)))
}
var $d_Lcom_raquo_airstream_custom_CustomSource$Config = new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$TypeData().initClass({
  Lcom_raquo_airstream_custom_CustomSource$Config: 0
}, false, "com.raquo.airstream.custom.CustomSource$Config", {
  Lcom_raquo_airstream_custom_CustomSource$Config: 1,
  O: 1
});
$c_Lcom_raquo_airstream_custom_CustomSource$Config.prototype.$classData = $d_Lcom_raquo_airstream_custom_CustomSource$Config;
/** @constructor */
function $c_Lcom_raquo_airstream_custom_CustomSource$Config$() {
  /*<skip>*/
}
$c_Lcom_raquo_airstream_custom_CustomSource$Config$.prototype = new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$h_O();
$c_Lcom_raquo_airstream_custom_CustomSource$Config$.prototype.constructor = $c_Lcom_raquo_airstream_custom_CustomSource$Config$;
/** @constructor */
function $h_Lcom_raquo_airstream_custom_CustomSource$Config$() {
  /*<skip>*/
}
$h_Lcom_raquo_airstream_custom_CustomSource$Config$.prototype = $c_Lcom_raquo_airstream_custom_CustomSource$Config$.prototype;
$c_Lcom_raquo_airstream_custom_CustomSource$Config$.prototype.apply__F0__F0__Lcom_raquo_airstream_custom_CustomSource$Config = (function(onStart, onStop) {
  return new $c_Lcom_raquo_airstream_custom_CustomSource$Config(new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$c_sjsr_AnonFunction0((() => (void 0))), onStart, onStop)
});
var $d_Lcom_raquo_airstream_custom_CustomSource$Config$ = new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$TypeData().initClass({
  Lcom_raquo_airstream_custom_CustomSource$Config$: 0
}, false, "com.raquo.airstream.custom.CustomSource$Config$", {
  Lcom_raquo_airstream_custom_CustomSource$Config$: 1,
  O: 1
});
$c_Lcom_raquo_airstream_custom_CustomSource$Config$.prototype.$classData = $d_Lcom_raquo_airstream_custom_CustomSource$Config$;
var $n_Lcom_raquo_airstream_custom_CustomSource$Config$;
function $m_Lcom_raquo_airstream_custom_CustomSource$Config$() {
  if ((!$n_Lcom_raquo_airstream_custom_CustomSource$Config$)) {
    $n_Lcom_raquo_airstream_custom_CustomSource$Config$ = new $c_Lcom_raquo_airstream_custom_CustomSource$Config$()
  };
  return $n_Lcom_raquo_airstream_custom_CustomSource$Config$
}
function $p_Lcom_raquo_airstream_ownership_DynamicOwner__removeSubscriptionNow__Lcom_raquo_airstream_ownership_DynamicSubscription__V($thiz, subscription) {
  var index = ($thiz.Lcom_raquo_airstream_ownership_DynamicOwner__f_subscriptions.indexOf(subscription) | 0);
  if ((index !== (-1))) {
    $thiz.Lcom_raquo_airstream_ownership_DynamicOwner__f_subscriptions.splice(index, 1);
    var this$1 = $thiz.Lcom_raquo_airstream_ownership_DynamicOwner__f__maybeCurrentOwner;
    if ((!this$1.isEmpty__Z())) {
      subscription.onDeactivate__V()
    }
  } else {
    throw $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$ct_jl_Exception__T__(new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$c_jl_Exception(), "Can not remove DynamicSubscription from DynamicOwner: subscription not found. Did you already kill it?")
  }
}
function $p_Lcom_raquo_airstream_ownership_DynamicOwner__removePendingSubscriptionsNow__V($thiz) {
  while ((($thiz.Lcom_raquo_airstream_ownership_DynamicOwner__f_pendingSubscriptionRemovals.length | 0) > 0)) {
    var subscriptionToRemove = $thiz.Lcom_raquo_airstream_ownership_DynamicOwner__f_pendingSubscriptionRemovals.shift();
    $p_Lcom_raquo_airstream_ownership_DynamicOwner__removeSubscriptionNow__Lcom_raquo_airstream_ownership_DynamicSubscription__V($thiz, subscriptionToRemove)
  }
}
/** @constructor */
function $c_Lcom_raquo_airstream_ownership_DynamicOwner(onAccessAfterKilled) {
  this.Lcom_raquo_airstream_ownership_DynamicOwner__f_onAccessAfterKilled = null;
  this.Lcom_raquo_airstream_ownership_DynamicOwner__f_subscriptions = null;
  this.Lcom_raquo_airstream_ownership_DynamicOwner__f_isSafeToRemoveSubscription = false;
  this.Lcom_raquo_airstream_ownership_DynamicOwner__f_pendingSubscriptionRemovals = null;
  this.Lcom_raquo_airstream_ownership_DynamicOwner__f__maybeCurrentOwner = null;
  this.Lcom_raquo_airstream_ownership_DynamicOwner__f_numPrependedSubs = 0;
  this.Lcom_raquo_airstream_ownership_DynamicOwner__f_onAccessAfterKilled = onAccessAfterKilled;
  this.Lcom_raquo_airstream_ownership_DynamicOwner__f_subscriptions = $m_Lcom_raquo_ew_JsArray$().apply__sci_Seq__Lcom_raquo_ew_JsArray($j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$m_sr_ScalaRunTime$().wrapRefArray__AO__sci_ArraySeq(new ($d_Lcom_raquo_airstream_ownership_DynamicSubscription.getArrayOf().constr)([])));
  this.Lcom_raquo_airstream_ownership_DynamicOwner__f_isSafeToRemoveSubscription = true;
  this.Lcom_raquo_airstream_ownership_DynamicOwner__f_pendingSubscriptionRemovals = $m_Lcom_raquo_ew_JsArray$().apply__sci_Seq__Lcom_raquo_ew_JsArray($j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$m_sr_ScalaRunTime$().wrapRefArray__AO__sci_ArraySeq(new ($d_Lcom_raquo_airstream_ownership_DynamicSubscription.getArrayOf().constr)([])));
  this.Lcom_raquo_airstream_ownership_DynamicOwner__f__maybeCurrentOwner = $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$m_s_None$();
  this.Lcom_raquo_airstream_ownership_DynamicOwner__f_numPrependedSubs = 0
}
$c_Lcom_raquo_airstream_ownership_DynamicOwner.prototype = new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$h_O();
$c_Lcom_raquo_airstream_ownership_DynamicOwner.prototype.constructor = $c_Lcom_raquo_airstream_ownership_DynamicOwner;
/** @constructor */
function $h_Lcom_raquo_airstream_ownership_DynamicOwner() {
  /*<skip>*/
}
$h_Lcom_raquo_airstream_ownership_DynamicOwner.prototype = $c_Lcom_raquo_airstream_ownership_DynamicOwner.prototype;
$c_Lcom_raquo_airstream_ownership_DynamicOwner.prototype.activate__V = (function() {
  var this$1 = this.Lcom_raquo_airstream_ownership_DynamicOwner__f__maybeCurrentOwner;
  if ((!(!this$1.isEmpty__Z()))) {
    var this$2 = $m_Lcom_raquo_airstream_core_Transaction$onStart$();
    this$2.Lcom_raquo_airstream_core_Transaction$onStart$__f_level = ((1 + this$2.Lcom_raquo_airstream_core_Transaction$onStart$__f_level) | 0);
    try {
      var newOwner = new $c_Lcom_raquo_airstream_ownership_OneTimeOwner(this.Lcom_raquo_airstream_ownership_DynamicOwner__f_onAccessAfterKilled);
      this.Lcom_raquo_airstream_ownership_DynamicOwner__f__maybeCurrentOwner = new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$c_s_Some(newOwner);
      this.Lcom_raquo_airstream_ownership_DynamicOwner__f_isSafeToRemoveSubscription = false;
      this.Lcom_raquo_airstream_ownership_DynamicOwner__f_numPrependedSubs = 0;
      var i = 0;
      var originalNumSubs = (this.Lcom_raquo_airstream_ownership_DynamicOwner__f_subscriptions.length | 0);
      while ((i < originalNumSubs)) {
        var ix = ((i + this.Lcom_raquo_airstream_ownership_DynamicOwner__f_numPrependedSubs) | 0);
        var sub = this.Lcom_raquo_airstream_ownership_DynamicOwner__f_subscriptions[ix];
        sub.onActivate__Lcom_raquo_airstream_ownership_Owner__V(newOwner);
        i = ((1 + i) | 0)
      };
      $p_Lcom_raquo_airstream_ownership_DynamicOwner__removePendingSubscriptionsNow__V(this);
      this.Lcom_raquo_airstream_ownership_DynamicOwner__f_isSafeToRemoveSubscription = true;
      this.Lcom_raquo_airstream_ownership_DynamicOwner__f_numPrependedSubs = 0
    } finally {
      this$2.Lcom_raquo_airstream_core_Transaction$onStart$__f_level = (((-1) + this$2.Lcom_raquo_airstream_core_Transaction$onStart$__f_level) | 0);
      if ((this$2.Lcom_raquo_airstream_core_Transaction$onStart$__f_level === 0)) {
        $p_Lcom_raquo_airstream_core_Transaction$onStart$__resolve__V(this$2)
      }
    }
  } else {
    throw $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$ct_jl_Exception__T__(new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$c_jl_Exception(), (("Can not activate " + this) + ": it is already active"))
  }
});
$c_Lcom_raquo_airstream_ownership_DynamicOwner.prototype.deactivate__V = (function() {
  var this$1 = this.Lcom_raquo_airstream_ownership_DynamicOwner__f__maybeCurrentOwner;
  if ((!this$1.isEmpty__Z())) {
    this.Lcom_raquo_airstream_ownership_DynamicOwner__f_isSafeToRemoveSubscription = false;
    var arr = this.Lcom_raquo_airstream_ownership_DynamicOwner__f_subscriptions;
    var i = 0;
    var len = (arr.length | 0);
    while ((i < len)) {
      var _$1 = arr[i];
      var _$1$1 = _$1;
      _$1$1.onDeactivate__V();
      i = ((1 + i) | 0)
    };
    $p_Lcom_raquo_airstream_ownership_DynamicOwner__removePendingSubscriptionsNow__V(this);
    var this$4 = this.Lcom_raquo_airstream_ownership_DynamicOwner__f__maybeCurrentOwner;
    if ((!this$4.isEmpty__Z())) {
      var arg1 = this$4.get__O();
      var _$2 = arg1;
      _$2.killSubscriptions__V()
    };
    $p_Lcom_raquo_airstream_ownership_DynamicOwner__removePendingSubscriptionsNow__V(this);
    this.Lcom_raquo_airstream_ownership_DynamicOwner__f_isSafeToRemoveSubscription = true;
    this.Lcom_raquo_airstream_ownership_DynamicOwner__f__maybeCurrentOwner = $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$m_s_None$()
  } else {
    throw $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$ct_jl_Exception__T__(new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$c_jl_Exception(), "Can not deactivate DynamicOwner: it is not active")
  }
});
$c_Lcom_raquo_airstream_ownership_DynamicOwner.prototype.addSubscription__Lcom_raquo_airstream_ownership_DynamicSubscription__Z__V = (function(subscription, prepend) {
  if (prepend) {
    this.Lcom_raquo_airstream_ownership_DynamicOwner__f_numPrependedSubs = ((1 + this.Lcom_raquo_airstream_ownership_DynamicOwner__f_numPrependedSubs) | 0);
    this.Lcom_raquo_airstream_ownership_DynamicOwner__f_subscriptions.unshift(subscription)
  } else {
    this.Lcom_raquo_airstream_ownership_DynamicOwner__f_subscriptions.push(subscription)
  };
  var this$1 = this.Lcom_raquo_airstream_ownership_DynamicOwner__f__maybeCurrentOwner;
  if ((!this$1.isEmpty__Z())) {
    var arg1 = this$1.get__O();
    var o = arg1;
    subscription.onActivate__Lcom_raquo_airstream_ownership_Owner__V(o)
  }
});
$c_Lcom_raquo_airstream_ownership_DynamicOwner.prototype.removeSubscription__Lcom_raquo_airstream_ownership_DynamicSubscription__V = (function(subscription) {
  if (this.Lcom_raquo_airstream_ownership_DynamicOwner__f_isSafeToRemoveSubscription) {
    $p_Lcom_raquo_airstream_ownership_DynamicOwner__removeSubscriptionNow__Lcom_raquo_airstream_ownership_DynamicSubscription__V(this, subscription)
  } else {
    this.Lcom_raquo_airstream_ownership_DynamicOwner__f_pendingSubscriptionRemovals.push(subscription)
  }
});
function $isArrayOf_Lcom_raquo_airstream_ownership_DynamicOwner(obj, depth) {
  return (!(!(((obj && obj.$classData) && (obj.$classData.arrayDepth === depth)) && obj.$classData.arrayBase.ancestors.Lcom_raquo_airstream_ownership_DynamicOwner)))
}
var $d_Lcom_raquo_airstream_ownership_DynamicOwner = new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$TypeData().initClass({
  Lcom_raquo_airstream_ownership_DynamicOwner: 0
}, false, "com.raquo.airstream.ownership.DynamicOwner", {
  Lcom_raquo_airstream_ownership_DynamicOwner: 1,
  O: 1
});
$c_Lcom_raquo_airstream_ownership_DynamicOwner.prototype.$classData = $d_Lcom_raquo_airstream_ownership_DynamicOwner;
/** @constructor */
function $c_Lcom_raquo_airstream_ownership_DynamicSubscription(dynamicOwner, activate, prepend) {
  this.Lcom_raquo_airstream_ownership_DynamicSubscription__f_dynamicOwner = null;
  this.Lcom_raquo_airstream_ownership_DynamicSubscription__f_activate = null;
  this.Lcom_raquo_airstream_ownership_DynamicSubscription__f_maybeCurrentSubscription = null;
  this.Lcom_raquo_airstream_ownership_DynamicSubscription__f_dynamicOwner = dynamicOwner;
  this.Lcom_raquo_airstream_ownership_DynamicSubscription__f_activate = activate;
  this.Lcom_raquo_airstream_ownership_DynamicSubscription__f_maybeCurrentSubscription = $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$m_s_None$();
  dynamicOwner.addSubscription__Lcom_raquo_airstream_ownership_DynamicSubscription__Z__V(this, prepend)
}
$c_Lcom_raquo_airstream_ownership_DynamicSubscription.prototype = new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$h_O();
$c_Lcom_raquo_airstream_ownership_DynamicSubscription.prototype.constructor = $c_Lcom_raquo_airstream_ownership_DynamicSubscription;
/** @constructor */
function $h_Lcom_raquo_airstream_ownership_DynamicSubscription() {
  /*<skip>*/
}
$h_Lcom_raquo_airstream_ownership_DynamicSubscription.prototype = $c_Lcom_raquo_airstream_ownership_DynamicSubscription.prototype;
$c_Lcom_raquo_airstream_ownership_DynamicSubscription.prototype.kill__V = (function() {
  this.Lcom_raquo_airstream_ownership_DynamicSubscription__f_dynamicOwner.removeSubscription__Lcom_raquo_airstream_ownership_DynamicSubscription__V(this)
});
$c_Lcom_raquo_airstream_ownership_DynamicSubscription.prototype.onActivate__Lcom_raquo_airstream_ownership_Owner__V = (function(owner) {
  var this$1 = $m_Lcom_raquo_airstream_core_Transaction$onStart$();
  this$1.Lcom_raquo_airstream_core_Transaction$onStart$__f_level = ((1 + this$1.Lcom_raquo_airstream_core_Transaction$onStart$__f_level) | 0);
  try {
    this.Lcom_raquo_airstream_ownership_DynamicSubscription__f_maybeCurrentSubscription = this.Lcom_raquo_airstream_ownership_DynamicSubscription__f_activate.apply__O__O(owner)
  } finally {
    this$1.Lcom_raquo_airstream_core_Transaction$onStart$__f_level = (((-1) + this$1.Lcom_raquo_airstream_core_Transaction$onStart$__f_level) | 0);
    if ((this$1.Lcom_raquo_airstream_core_Transaction$onStart$__f_level === 0)) {
      $p_Lcom_raquo_airstream_core_Transaction$onStart$__resolve__V(this$1)
    }
  }
});
$c_Lcom_raquo_airstream_ownership_DynamicSubscription.prototype.onDeactivate__V = (function() {
  var this$1 = this.Lcom_raquo_airstream_ownership_DynamicSubscription__f_maybeCurrentSubscription;
  if ((!this$1.isEmpty__Z())) {
    var arg1 = this$1.get__O();
    var currentSubscription = arg1;
    currentSubscription.kill__V();
    this.Lcom_raquo_airstream_ownership_DynamicSubscription__f_maybeCurrentSubscription = $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$m_s_None$()
  }
});
function $isArrayOf_Lcom_raquo_airstream_ownership_DynamicSubscription(obj, depth) {
  return (!(!(((obj && obj.$classData) && (obj.$classData.arrayDepth === depth)) && obj.$classData.arrayBase.ancestors.Lcom_raquo_airstream_ownership_DynamicSubscription)))
}
var $d_Lcom_raquo_airstream_ownership_DynamicSubscription = new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$TypeData().initClass({
  Lcom_raquo_airstream_ownership_DynamicSubscription: 0
}, false, "com.raquo.airstream.ownership.DynamicSubscription", {
  Lcom_raquo_airstream_ownership_DynamicSubscription: 1,
  O: 1
});
$c_Lcom_raquo_airstream_ownership_DynamicSubscription.prototype.$classData = $d_Lcom_raquo_airstream_ownership_DynamicSubscription;
/** @constructor */
function $c_Lcom_raquo_airstream_ownership_DynamicSubscription$() {
  /*<skip>*/
}
$c_Lcom_raquo_airstream_ownership_DynamicSubscription$.prototype = new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$h_O();
$c_Lcom_raquo_airstream_ownership_DynamicSubscription$.prototype.constructor = $c_Lcom_raquo_airstream_ownership_DynamicSubscription$;
/** @constructor */
function $h_Lcom_raquo_airstream_ownership_DynamicSubscription$() {
  /*<skip>*/
}
$h_Lcom_raquo_airstream_ownership_DynamicSubscription$.prototype = $c_Lcom_raquo_airstream_ownership_DynamicSubscription$.prototype;
$c_Lcom_raquo_airstream_ownership_DynamicSubscription$.prototype.unsafe__Lcom_raquo_airstream_ownership_DynamicOwner__F1__Z__Lcom_raquo_airstream_ownership_DynamicSubscription = (function(dynamicOwner, activate, prepend) {
  return new $c_Lcom_raquo_airstream_ownership_DynamicSubscription(dynamicOwner, new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$c_sjsr_AnonFunction1(((owner) => {
    var owner$1 = owner;
    var value = activate.apply__O__O(owner$1);
    return new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$c_s_Some(value)
  })), prepend)
});
$c_Lcom_raquo_airstream_ownership_DynamicSubscription$.prototype.subscribeCallback__Lcom_raquo_airstream_ownership_DynamicOwner__F1__Z__Lcom_raquo_airstream_ownership_DynamicSubscription = (function(dynamicOwner, activate, prepend) {
  return new $c_Lcom_raquo_airstream_ownership_DynamicSubscription(dynamicOwner, new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$c_sjsr_AnonFunction1(((owner) => {
    var owner$1 = owner;
    activate.apply__O__O(owner$1);
    return $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$m_s_None$()
  })), prepend)
});
$c_Lcom_raquo_airstream_ownership_DynamicSubscription$.prototype.subscribeSink__Lcom_raquo_airstream_ownership_DynamicOwner__Lcom_raquo_airstream_core_Observable__Lcom_raquo_airstream_core_Sink__Lcom_raquo_airstream_ownership_DynamicSubscription = (function(dynamicOwner, observable, sink) {
  return $m_Lcom_raquo_airstream_ownership_DynamicSubscription$().unsafe__Lcom_raquo_airstream_ownership_DynamicOwner__F1__Z__Lcom_raquo_airstream_ownership_DynamicSubscription(dynamicOwner, new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$c_sjsr_AnonFunction1(((owner) => {
    var owner$1 = owner;
    var observer = sink.toObserver__Lcom_raquo_airstream_core_Observer();
    return $f_Lcom_raquo_airstream_core_WritableObservable__addObserver__Lcom_raquo_airstream_core_Observer__Lcom_raquo_airstream_ownership_Owner__Lcom_raquo_airstream_ownership_Subscription(observable, observer, owner$1)
  })), false)
});
var $d_Lcom_raquo_airstream_ownership_DynamicSubscription$ = new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$TypeData().initClass({
  Lcom_raquo_airstream_ownership_DynamicSubscription$: 0
}, false, "com.raquo.airstream.ownership.DynamicSubscription$", {
  Lcom_raquo_airstream_ownership_DynamicSubscription$: 1,
  O: 1
});
$c_Lcom_raquo_airstream_ownership_DynamicSubscription$.prototype.$classData = $d_Lcom_raquo_airstream_ownership_DynamicSubscription$;
var $n_Lcom_raquo_airstream_ownership_DynamicSubscription$;
function $m_Lcom_raquo_airstream_ownership_DynamicSubscription$() {
  if ((!$n_Lcom_raquo_airstream_ownership_DynamicSubscription$)) {
    $n_Lcom_raquo_airstream_ownership_DynamicSubscription$ = new $c_Lcom_raquo_airstream_ownership_DynamicSubscription$()
  };
  return $n_Lcom_raquo_airstream_ownership_DynamicSubscription$
}
function $f_Lcom_raquo_airstream_ownership_Owner__$init$__V($thiz) {
  $thiz.com$raquo$airstream$ownership$Owner$_setter_$subscriptions_$eq__Lcom_raquo_ew_JsArray__V($m_Lcom_raquo_ew_JsArray$().apply__sci_Seq__Lcom_raquo_ew_JsArray($j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$m_sr_ScalaRunTime$().wrapRefArray__AO__sci_ArraySeq(new ($d_Lcom_raquo_airstream_ownership_Subscription.getArrayOf().constr)([]))))
}
function $f_Lcom_raquo_airstream_ownership_Owner__killSubscriptions__V($thiz) {
  var arr = $thiz.subscriptions__Lcom_raquo_ew_JsArray();
  var i = 0;
  var len = (arr.length | 0);
  while ((i < len)) {
    var _$1 = arr[i];
    var _$1$1 = _$1;
    $p_Lcom_raquo_airstream_ownership_Subscription__safeCleanup__V(_$1$1);
    i = ((1 + i) | 0)
  };
  $thiz.subscriptions__Lcom_raquo_ew_JsArray().length = 0
}
function $f_Lcom_raquo_airstream_ownership_Owner__onKilledExternally__Lcom_raquo_airstream_ownership_Subscription__V($thiz, subscription) {
  var index = ($thiz.subscriptions__Lcom_raquo_ew_JsArray().indexOf(subscription) | 0);
  if ((index !== (-1))) {
    $thiz.subscriptions__Lcom_raquo_ew_JsArray().splice(index, 1)
  } else {
    throw $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$ct_jl_Exception__T__(new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$c_jl_Exception(), "Can not remove Subscription from Owner: subscription not found.")
  }
}
function $f_Lcom_raquo_airstream_ownership_Owner__own__Lcom_raquo_airstream_ownership_Subscription__V($thiz, subscription) {
  $thiz.subscriptions__Lcom_raquo_ew_JsArray().push(subscription)
}
function $is_Lcom_raquo_airstream_ownership_Owner(obj) {
  return (!(!((obj && obj.$classData) && obj.$classData.ancestors.Lcom_raquo_airstream_ownership_Owner)))
}
function $isArrayOf_Lcom_raquo_airstream_ownership_Owner(obj, depth) {
  return (!(!(((obj && obj.$classData) && (obj.$classData.arrayDepth === depth)) && obj.$classData.arrayBase.ancestors.Lcom_raquo_airstream_ownership_Owner)))
}
function $p_Lcom_raquo_airstream_ownership_Subscription__safeCleanup__V($thiz) {
  if ((!$thiz.Lcom_raquo_airstream_ownership_Subscription__f__isKilled)) {
    $thiz.Lcom_raquo_airstream_ownership_Subscription__f_cleanup.apply__O();
    $thiz.Lcom_raquo_airstream_ownership_Subscription__f__isKilled = true
  } else {
    throw $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$ct_jl_Exception__T__(new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$c_jl_Exception(), "Can not kill Subscription: it was already killed.")
  }
}
/** @constructor */
function $c_Lcom_raquo_airstream_ownership_Subscription(owner, cleanup) {
  this.Lcom_raquo_airstream_ownership_Subscription__f_owner = null;
  this.Lcom_raquo_airstream_ownership_Subscription__f_cleanup = null;
  this.Lcom_raquo_airstream_ownership_Subscription__f__isKilled = false;
  this.Lcom_raquo_airstream_ownership_Subscription__f_owner = owner;
  this.Lcom_raquo_airstream_ownership_Subscription__f_cleanup = cleanup;
  this.Lcom_raquo_airstream_ownership_Subscription__f__isKilled = false;
  owner.own__Lcom_raquo_airstream_ownership_Subscription__V(this)
}
$c_Lcom_raquo_airstream_ownership_Subscription.prototype = new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$h_O();
$c_Lcom_raquo_airstream_ownership_Subscription.prototype.constructor = $c_Lcom_raquo_airstream_ownership_Subscription;
/** @constructor */
function $h_Lcom_raquo_airstream_ownership_Subscription() {
  /*<skip>*/
}
$h_Lcom_raquo_airstream_ownership_Subscription.prototype = $c_Lcom_raquo_airstream_ownership_Subscription.prototype;
$c_Lcom_raquo_airstream_ownership_Subscription.prototype.kill__V = (function() {
  $p_Lcom_raquo_airstream_ownership_Subscription__safeCleanup__V(this);
  var this$1 = this.Lcom_raquo_airstream_ownership_Subscription__f_owner;
  $f_Lcom_raquo_airstream_ownership_Owner__onKilledExternally__Lcom_raquo_airstream_ownership_Subscription__V(this$1, this)
});
function $isArrayOf_Lcom_raquo_airstream_ownership_Subscription(obj, depth) {
  return (!(!(((obj && obj.$classData) && (obj.$classData.arrayDepth === depth)) && obj.$classData.arrayBase.ancestors.Lcom_raquo_airstream_ownership_Subscription)))
}
var $d_Lcom_raquo_airstream_ownership_Subscription = new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$TypeData().initClass({
  Lcom_raquo_airstream_ownership_Subscription: 0
}, false, "com.raquo.airstream.ownership.Subscription", {
  Lcom_raquo_airstream_ownership_Subscription: 1,
  O: 1
});
$c_Lcom_raquo_airstream_ownership_Subscription.prototype.$classData = $d_Lcom_raquo_airstream_ownership_Subscription;
/** @constructor */
function $c_Lcom_raquo_airstream_ownership_TransferableSubscription(activate, deactivate) {
  this.Lcom_raquo_airstream_ownership_TransferableSubscription__f_activate = null;
  this.Lcom_raquo_airstream_ownership_TransferableSubscription__f_deactivate = null;
  this.Lcom_raquo_airstream_ownership_TransferableSubscription__f_maybeSubscription = null;
  this.Lcom_raquo_airstream_ownership_TransferableSubscription__f_isLiveTransferInProgress = false;
  this.Lcom_raquo_airstream_ownership_TransferableSubscription__f_activate = activate;
  this.Lcom_raquo_airstream_ownership_TransferableSubscription__f_deactivate = deactivate;
  this.Lcom_raquo_airstream_ownership_TransferableSubscription__f_maybeSubscription = $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$m_s_None$();
  this.Lcom_raquo_airstream_ownership_TransferableSubscription__f_isLiveTransferInProgress = false
}
$c_Lcom_raquo_airstream_ownership_TransferableSubscription.prototype = new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$h_O();
$c_Lcom_raquo_airstream_ownership_TransferableSubscription.prototype.constructor = $c_Lcom_raquo_airstream_ownership_TransferableSubscription;
/** @constructor */
function $h_Lcom_raquo_airstream_ownership_TransferableSubscription() {
  /*<skip>*/
}
$h_Lcom_raquo_airstream_ownership_TransferableSubscription.prototype = $c_Lcom_raquo_airstream_ownership_TransferableSubscription.prototype;
$c_Lcom_raquo_airstream_ownership_TransferableSubscription.prototype.isCurrentOwnerActive__Z = (function() {
  var this$1 = this.Lcom_raquo_airstream_ownership_TransferableSubscription__f_maybeSubscription;
  if ((!this$1.isEmpty__Z())) {
    var arg1 = this$1.get__O();
    var _$1 = arg1;
    var this$2 = _$1.Lcom_raquo_airstream_ownership_DynamicSubscription__f_dynamicOwner;
    var this$3 = this$2.Lcom_raquo_airstream_ownership_DynamicOwner__f__maybeCurrentOwner;
    return (!this$3.isEmpty__Z())
  } else {
    return false
  }
});
$c_Lcom_raquo_airstream_ownership_TransferableSubscription.prototype.setOwner__Lcom_raquo_airstream_ownership_DynamicOwner__V = (function(nextOwner) {
  if (this.Lcom_raquo_airstream_ownership_TransferableSubscription__f_isLiveTransferInProgress) {
    throw $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$ct_jl_Exception__T__(new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$c_jl_Exception(), "Unable to set owner on DynamicTransferableSubscription while a transfer on this subscription is already in progress.")
  };
  var this$1 = this.Lcom_raquo_airstream_ownership_TransferableSubscription__f_maybeSubscription;
  if ((!this$1.isEmpty__Z())) {
    var arg1 = this$1.get__O();
    var _$2 = arg1;
    var x$2 = _$2.Lcom_raquo_airstream_ownership_DynamicSubscription__f_dynamicOwner;
    var $$x1 = (nextOwner === x$2)
  } else {
    var $$x1 = false
  };
  if ((!$$x1)) {
    if (this.isCurrentOwnerActive__Z()) {
      var this$2 = nextOwner.Lcom_raquo_airstream_ownership_DynamicOwner__f__maybeCurrentOwner;
      var $$x2 = (!this$2.isEmpty__Z())
    } else {
      var $$x2 = false
    };
    if ($$x2) {
      this.Lcom_raquo_airstream_ownership_TransferableSubscription__f_isLiveTransferInProgress = true
    };
    var this$3 = this.Lcom_raquo_airstream_ownership_TransferableSubscription__f_maybeSubscription;
    if ((!this$3.isEmpty__Z())) {
      var arg1$1 = this$3.get__O();
      var subscription = arg1$1;
      subscription.kill__V();
      this.Lcom_raquo_airstream_ownership_TransferableSubscription__f_maybeSubscription = $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$m_s_None$()
    };
    var newPilotSubscription = $m_Lcom_raquo_airstream_ownership_DynamicSubscription$().unsafe__Lcom_raquo_airstream_ownership_DynamicOwner__F1__Z__Lcom_raquo_airstream_ownership_DynamicSubscription(nextOwner, new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$c_sjsr_AnonFunction1(((parentOwner) => {
      var parentOwner$1 = parentOwner;
      if ((!this.Lcom_raquo_airstream_ownership_TransferableSubscription__f_isLiveTransferInProgress)) {
        this.Lcom_raquo_airstream_ownership_TransferableSubscription__f_activate.apply__O()
      };
      return new $c_Lcom_raquo_airstream_ownership_Subscription(parentOwner$1, new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$c_sjsr_AnonFunction0((() => {
        if ((!this.Lcom_raquo_airstream_ownership_TransferableSubscription__f_isLiveTransferInProgress)) {
          this.Lcom_raquo_airstream_ownership_TransferableSubscription__f_deactivate.apply__O()
        }
      })))
    })), false);
    this.Lcom_raquo_airstream_ownership_TransferableSubscription__f_maybeSubscription = new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$c_s_Some(newPilotSubscription);
    this.Lcom_raquo_airstream_ownership_TransferableSubscription__f_isLiveTransferInProgress = false
  }
});
$c_Lcom_raquo_airstream_ownership_TransferableSubscription.prototype.clearOwner__V = (function() {
  if (this.Lcom_raquo_airstream_ownership_TransferableSubscription__f_isLiveTransferInProgress) {
    throw $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$ct_jl_Exception__T__(new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$c_jl_Exception(), "Unable to clear owner on DynamicTransferableSubscription while a transfer on this subscription is already in progress.")
  };
  var this$1 = this.Lcom_raquo_airstream_ownership_TransferableSubscription__f_maybeSubscription;
  if ((!this$1.isEmpty__Z())) {
    var arg1 = this$1.get__O();
    var subscription = arg1;
    subscription.kill__V()
  };
  this.Lcom_raquo_airstream_ownership_TransferableSubscription__f_maybeSubscription = $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$m_s_None$()
});
var $d_Lcom_raquo_airstream_ownership_TransferableSubscription = new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$TypeData().initClass({
  Lcom_raquo_airstream_ownership_TransferableSubscription: 0
}, false, "com.raquo.airstream.ownership.TransferableSubscription", {
  Lcom_raquo_airstream_ownership_TransferableSubscription: 1,
  O: 1
});
$c_Lcom_raquo_airstream_ownership_TransferableSubscription.prototype.$classData = $d_Lcom_raquo_airstream_ownership_TransferableSubscription;
/** @constructor */
function $c_Lcom_raquo_airstream_state_Val$() {
  /*<skip>*/
}
$c_Lcom_raquo_airstream_state_Val$.prototype = new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$h_O();
$c_Lcom_raquo_airstream_state_Val$.prototype.constructor = $c_Lcom_raquo_airstream_state_Val$;
/** @constructor */
function $h_Lcom_raquo_airstream_state_Val$() {
  /*<skip>*/
}
$h_Lcom_raquo_airstream_state_Val$.prototype = $c_Lcom_raquo_airstream_state_Val$.prototype;
$c_Lcom_raquo_airstream_state_Val$.prototype.apply__O__Lcom_raquo_airstream_state_Val = (function(value) {
  var value$1 = new $c_s_util_Success(value);
  return new $c_Lcom_raquo_airstream_state_Val(value$1)
});
var $d_Lcom_raquo_airstream_state_Val$ = new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$TypeData().initClass({
  Lcom_raquo_airstream_state_Val$: 0
}, false, "com.raquo.airstream.state.Val$", {
  Lcom_raquo_airstream_state_Val$: 1,
  O: 1
});
$c_Lcom_raquo_airstream_state_Val$.prototype.$classData = $d_Lcom_raquo_airstream_state_Val$;
var $n_Lcom_raquo_airstream_state_Val$;
function $m_Lcom_raquo_airstream_state_Val$() {
  if ((!$n_Lcom_raquo_airstream_state_Val$)) {
    $n_Lcom_raquo_airstream_state_Val$ = new $c_Lcom_raquo_airstream_state_Val$()
  };
  return $n_Lcom_raquo_airstream_state_Val$
}
/** @constructor */
function $c_Lcom_raquo_airstream_state_Var$() {
  /*<skip>*/
}
$c_Lcom_raquo_airstream_state_Var$.prototype = new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$h_O();
$c_Lcom_raquo_airstream_state_Var$.prototype.constructor = $c_Lcom_raquo_airstream_state_Var$;
/** @constructor */
function $h_Lcom_raquo_airstream_state_Var$() {
  /*<skip>*/
}
$h_Lcom_raquo_airstream_state_Var$.prototype = $c_Lcom_raquo_airstream_state_Var$.prototype;
$c_Lcom_raquo_airstream_state_Var$.prototype.apply__O__Lcom_raquo_airstream_state_Var = (function(initial) {
  var initial$1 = new $c_s_util_Success(initial);
  return new $c_Lcom_raquo_airstream_state_SourceVar(initial$1)
});
var $d_Lcom_raquo_airstream_state_Var$ = new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$TypeData().initClass({
  Lcom_raquo_airstream_state_Var$: 0
}, false, "com.raquo.airstream.state.Var$", {
  Lcom_raquo_airstream_state_Var$: 1,
  O: 1
});
$c_Lcom_raquo_airstream_state_Var$.prototype.$classData = $d_Lcom_raquo_airstream_state_Var$;
var $n_Lcom_raquo_airstream_state_Var$;
function $m_Lcom_raquo_airstream_state_Var$() {
  if ((!$n_Lcom_raquo_airstream_state_Var$)) {
    $n_Lcom_raquo_airstream_state_Var$ = new $c_Lcom_raquo_airstream_state_Var$()
  };
  return $n_Lcom_raquo_airstream_state_Var$
}
/** @constructor */
function $c_Lcom_raquo_airstream_util_JsPriorityQueue(getRank) {
  this.Lcom_raquo_airstream_util_JsPriorityQueue__f_getRank = null;
  this.Lcom_raquo_airstream_util_JsPriorityQueue__f_queue = null;
  this.Lcom_raquo_airstream_util_JsPriorityQueue__f_getRank = getRank;
  this.Lcom_raquo_airstream_util_JsPriorityQueue__f_queue = $m_Lcom_raquo_ew_JsArray$().apply__sci_Seq__Lcom_raquo_ew_JsArray($j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$m_sr_ScalaRunTime$().genericWrapArray__O__sci_ArraySeq(new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$ac_O([])))
}
$c_Lcom_raquo_airstream_util_JsPriorityQueue.prototype = new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$h_O();
$c_Lcom_raquo_airstream_util_JsPriorityQueue.prototype.constructor = $c_Lcom_raquo_airstream_util_JsPriorityQueue;
/** @constructor */
function $h_Lcom_raquo_airstream_util_JsPriorityQueue() {
  /*<skip>*/
}
$h_Lcom_raquo_airstream_util_JsPriorityQueue.prototype = $c_Lcom_raquo_airstream_util_JsPriorityQueue.prototype;
$c_Lcom_raquo_airstream_util_JsPriorityQueue.prototype.enqueue__O__V = (function(item) {
  var itemRank = (this.Lcom_raquo_airstream_util_JsPriorityQueue__f_getRank.apply__O__O(item) | 0);
  var insertAtIndex = 0;
  var foundHigherRank = false;
  while (((insertAtIndex < (this.Lcom_raquo_airstream_util_JsPriorityQueue__f_queue.length | 0)) && (!foundHigherRank))) {
    if (((this.Lcom_raquo_airstream_util_JsPriorityQueue__f_getRank.apply__O__O(this.Lcom_raquo_airstream_util_JsPriorityQueue__f_queue[insertAtIndex]) | 0) > itemRank)) {
      foundHigherRank = true
    } else {
      insertAtIndex = ((1 + insertAtIndex) | 0)
    }
  };
  this.Lcom_raquo_airstream_util_JsPriorityQueue__f_queue.splice(insertAtIndex, 0, item)
});
$c_Lcom_raquo_airstream_util_JsPriorityQueue.prototype.contains__O__Z = (function(item) {
  return ((this.Lcom_raquo_airstream_util_JsPriorityQueue__f_queue.indexOf(item) | 0) !== (-1))
});
function $isArrayOf_Lcom_raquo_airstream_util_JsPriorityQueue(obj, depth) {
  return (!(!(((obj && obj.$classData) && (obj.$classData.arrayDepth === depth)) && obj.$classData.arrayBase.ancestors.Lcom_raquo_airstream_util_JsPriorityQueue)))
}
var $d_Lcom_raquo_airstream_util_JsPriorityQueue = new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$TypeData().initClass({
  Lcom_raquo_airstream_util_JsPriorityQueue: 0
}, false, "com.raquo.airstream.util.JsPriorityQueue", {
  Lcom_raquo_airstream_util_JsPriorityQueue: 1,
  O: 1
});
$c_Lcom_raquo_airstream_util_JsPriorityQueue.prototype.$classData = $d_Lcom_raquo_airstream_util_JsPriorityQueue;
/** @constructor */
function $c_Lcom_raquo_airstream_web_DomEventStream$() {
  /*<skip>*/
}
$c_Lcom_raquo_airstream_web_DomEventStream$.prototype = new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$h_O();
$c_Lcom_raquo_airstream_web_DomEventStream$.prototype.constructor = $c_Lcom_raquo_airstream_web_DomEventStream$;
/** @constructor */
function $h_Lcom_raquo_airstream_web_DomEventStream$() {
  /*<skip>*/
}
$h_Lcom_raquo_airstream_web_DomEventStream$.prototype = $c_Lcom_raquo_airstream_web_DomEventStream$.prototype;
$c_Lcom_raquo_airstream_web_DomEventStream$.prototype.apply__Lorg_scalajs_dom_EventTarget__T__Z__Lcom_raquo_airstream_core_EventStream = (function(eventTarget, eventKey, useCapture) {
  return new $c_Lcom_raquo_airstream_custom_CustomStreamSource(new $c_sjsr_AnonFunction4(((fireValue, _$1, _$2, _$3) => {
    var fireValue$1 = fireValue;
    var eventHandler = $m_sjs_js_Any$().fromFunction1__F1__sjs_js_Function1(fireValue$1);
    return $m_Lcom_raquo_airstream_custom_CustomSource$Config$().apply__F0__F0__Lcom_raquo_airstream_custom_CustomSource$Config(new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$c_sjsr_AnonFunction0((() => {
      eventTarget.addEventListener(eventKey, eventHandler, useCapture)
    })), new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$c_sjsr_AnonFunction0((() => {
      eventTarget.removeEventListener(eventKey, eventHandler, useCapture)
    })))
  })))
});
var $d_Lcom_raquo_airstream_web_DomEventStream$ = new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$TypeData().initClass({
  Lcom_raquo_airstream_web_DomEventStream$: 0
}, false, "com.raquo.airstream.web.DomEventStream$", {
  Lcom_raquo_airstream_web_DomEventStream$: 1,
  O: 1
});
$c_Lcom_raquo_airstream_web_DomEventStream$.prototype.$classData = $d_Lcom_raquo_airstream_web_DomEventStream$;
var $n_Lcom_raquo_airstream_web_DomEventStream$;
function $m_Lcom_raquo_airstream_web_DomEventStream$() {
  if ((!$n_Lcom_raquo_airstream_web_DomEventStream$)) {
    $n_Lcom_raquo_airstream_web_DomEventStream$ = new $c_Lcom_raquo_airstream_web_DomEventStream$()
  };
  return $n_Lcom_raquo_airstream_web_DomEventStream$
}
/** @constructor */
function $c_Lcom_raquo_ew_JsArray$() {
  /*<skip>*/
}
$c_Lcom_raquo_ew_JsArray$.prototype = new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$h_O();
$c_Lcom_raquo_ew_JsArray$.prototype.constructor = $c_Lcom_raquo_ew_JsArray$;
/** @constructor */
function $h_Lcom_raquo_ew_JsArray$() {
  /*<skip>*/
}
$h_Lcom_raquo_ew_JsArray$.prototype = $c_Lcom_raquo_ew_JsArray$.prototype;
$c_Lcom_raquo_ew_JsArray$.prototype.apply__sci_Seq__Lcom_raquo_ew_JsArray = (function(items) {
  return [...$m_sjsr_Compat$().toJSVarArgsImpl__sci_Seq__sjs_js_Array(items)]
});
var $d_Lcom_raquo_ew_JsArray$ = new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$TypeData().initClass({
  Lcom_raquo_ew_JsArray$: 0
}, false, "com.raquo.ew.JsArray$", {
  Lcom_raquo_ew_JsArray$: 1,
  O: 1
});
$c_Lcom_raquo_ew_JsArray$.prototype.$classData = $d_Lcom_raquo_ew_JsArray$;
var $n_Lcom_raquo_ew_JsArray$;
function $m_Lcom_raquo_ew_JsArray$() {
  if ((!$n_Lcom_raquo_ew_JsArray$)) {
    $n_Lcom_raquo_ew_JsArray$ = new $c_Lcom_raquo_ew_JsArray$()
  };
  return $n_Lcom_raquo_ew_JsArray$
}
/** @constructor */
function $c_Lcom_raquo_laminar_DomApi$() {
  this.Lcom_raquo_laminar_DomApi$__f_classNamesSeparatorRegex = null;
  $n_Lcom_raquo_laminar_DomApi$ = this;
  document.createElement("template");
  this.createSvgElement__Lcom_raquo_laminar_tags_SvgTag__Lorg_scalajs_dom_SVGElement($m_Lcom_raquo_laminar_api_package$().Lcom_raquo_laminar_api_package$__f_L.svg__Lcom_raquo_laminar_api_Laminar$svg$().svg__Lcom_raquo_laminar_tags_SvgTag());
  this.Lcom_raquo_laminar_DomApi$__f_classNamesSeparatorRegex = new RegExp(" ", "g")
}
$c_Lcom_raquo_laminar_DomApi$.prototype = new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$h_O();
$c_Lcom_raquo_laminar_DomApi$.prototype.constructor = $c_Lcom_raquo_laminar_DomApi$;
/** @constructor */
function $h_Lcom_raquo_laminar_DomApi$() {
  /*<skip>*/
}
$h_Lcom_raquo_laminar_DomApi$.prototype = $c_Lcom_raquo_laminar_DomApi$.prototype;
$c_Lcom_raquo_laminar_DomApi$.prototype.appendChild__Lorg_scalajs_dom_Node__Lorg_scalajs_dom_Node__Z = (function(parent, child) {
  try {
    parent.appendChild(child);
    return true
  } catch (e) {
    var e$2 = ((e instanceof $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$c_jl_Throwable) ? e : new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$c_sjs_js_JavaScriptException(e));
    if (((e$2 instanceof $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$c_sjs_js_JavaScriptException) && (!(!(e$2.sjs_js_JavaScriptException__f_exception instanceof DOMException))))) {
      return false
    };
    throw ((e$2 instanceof $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$c_sjs_js_JavaScriptException) ? e$2.sjs_js_JavaScriptException__f_exception : e$2)
  }
});
$c_Lcom_raquo_laminar_DomApi$.prototype.removeChild__Lorg_scalajs_dom_Node__Lorg_scalajs_dom_Node__Z = (function(parent, child) {
  try {
    parent.removeChild(child);
    return true
  } catch (e) {
    var e$2 = ((e instanceof $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$c_jl_Throwable) ? e : new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$c_sjs_js_JavaScriptException(e));
    if (((e$2 instanceof $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$c_sjs_js_JavaScriptException) && (!(!(e$2.sjs_js_JavaScriptException__f_exception instanceof DOMException))))) {
      return false
    };
    throw ((e$2 instanceof $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$c_sjs_js_JavaScriptException) ? e$2.sjs_js_JavaScriptException__f_exception : e$2)
  }
});
$c_Lcom_raquo_laminar_DomApi$.prototype.insertBefore__Lorg_scalajs_dom_Node__Lorg_scalajs_dom_Node__Lorg_scalajs_dom_Node__Z = (function(parent, newChild, referenceChild) {
  try {
    parent.insertBefore(newChild, referenceChild);
    return true
  } catch (e) {
    var e$2 = ((e instanceof $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$c_jl_Throwable) ? e : new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$c_sjs_js_JavaScriptException(e));
    if (((e$2 instanceof $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$c_sjs_js_JavaScriptException) && (!(!(e$2.sjs_js_JavaScriptException__f_exception instanceof DOMException))))) {
      return false
    };
    throw ((e$2 instanceof $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$c_sjs_js_JavaScriptException) ? e$2.sjs_js_JavaScriptException__f_exception : e$2)
  }
});
$c_Lcom_raquo_laminar_DomApi$.prototype.insertAfter__Lorg_scalajs_dom_Node__Lorg_scalajs_dom_Node__Lorg_scalajs_dom_Node__Z = (function(parent, newChild, referenceChild) {
  try {
    parent.insertBefore(newChild, referenceChild.nextSibling);
    return true
  } catch (e) {
    var e$2 = ((e instanceof $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$c_jl_Throwable) ? e : new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$c_sjs_js_JavaScriptException(e));
    if (((e$2 instanceof $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$c_sjs_js_JavaScriptException) && (!(!(e$2.sjs_js_JavaScriptException__f_exception instanceof DOMException))))) {
      return false
    };
    throw ((e$2 instanceof $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$c_sjs_js_JavaScriptException) ? e$2.sjs_js_JavaScriptException__f_exception : e$2)
  }
});
$c_Lcom_raquo_laminar_DomApi$.prototype.replaceChild__Lorg_scalajs_dom_Node__Lorg_scalajs_dom_Node__Lorg_scalajs_dom_Node__Z = (function(parent, newChild, oldChild) {
  try {
    parent.replaceChild(newChild, oldChild);
    return true
  } catch (e) {
    var e$2 = ((e instanceof $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$c_jl_Throwable) ? e : new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$c_sjs_js_JavaScriptException(e));
    if (((e$2 instanceof $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$c_sjs_js_JavaScriptException) && (!(!(e$2.sjs_js_JavaScriptException__f_exception instanceof DOMException))))) {
      return false
    };
    throw ((e$2 instanceof $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$c_sjs_js_JavaScriptException) ? e$2.sjs_js_JavaScriptException__f_exception : e$2)
  }
});
$c_Lcom_raquo_laminar_DomApi$.prototype.isDescendantOf__Lorg_scalajs_dom_Node__Lorg_scalajs_dom_Node__Z = (function(node, ancestor) {
  var node$tailLocal1 = node;
  while (true) {
    if ((node$tailLocal1.parentNode !== null)) {
      var effectiveParentNode = node$tailLocal1.parentNode
    } else {
      var maybeShadowHost = node$tailLocal1.host;
      $m_s_$less$colon$less$();
      var effectiveParentNode = ((maybeShadowHost === (void 0)) ? null : maybeShadowHost)
    };
    if ((effectiveParentNode !== null)) {
      if ($j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$m_sr_BoxesRunTime$().equals__O__O__Z(ancestor, effectiveParentNode)) {
        return true
      } else {
        node$tailLocal1 = effectiveParentNode
      }
    } else {
      return false
    }
  }
});
$c_Lcom_raquo_laminar_DomApi$.prototype.addEventListener__Lorg_scalajs_dom_Element__Lcom_raquo_laminar_modifiers_EventListener__V = (function(element, listener) {
  var prop = listener.Lcom_raquo_laminar_modifiers_EventListener__f_eventProcessor;
  element.addEventListener(prop.Lcom_raquo_laminar_keys_EventProcessor__f_eventProp.Lcom_raquo_laminar_keys_EventProp__f_name, listener.Lcom_raquo_laminar_modifiers_EventListener__f_domCallback, listener.Lcom_raquo_laminar_modifiers_EventListener__f_options)
});
$c_Lcom_raquo_laminar_DomApi$.prototype.removeEventListener__Lorg_scalajs_dom_Element__Lcom_raquo_laminar_modifiers_EventListener__V = (function(element, listener) {
  var prop = listener.Lcom_raquo_laminar_modifiers_EventListener__f_eventProcessor;
  element.removeEventListener(prop.Lcom_raquo_laminar_keys_EventProcessor__f_eventProp.Lcom_raquo_laminar_keys_EventProp__f_name, listener.Lcom_raquo_laminar_modifiers_EventListener__f_domCallback, listener.Lcom_raquo_laminar_modifiers_EventListener__f_options)
});
$c_Lcom_raquo_laminar_DomApi$.prototype.createHtmlElement__Lcom_raquo_laminar_tags_HtmlTag__Lorg_scalajs_dom_HTMLElement = (function(tag) {
  return document.createElement(tag.Lcom_raquo_laminar_tags_HtmlTag__f_name)
});
$c_Lcom_raquo_laminar_DomApi$.prototype.getHtmlAttribute__Lcom_raquo_laminar_nodes_ReactiveHtmlElement__Lcom_raquo_laminar_keys_HtmlAttr__O = (function(element, attr) {
  var x = this.getHtmlAttributeRaw__Lcom_raquo_laminar_nodes_ReactiveHtmlElement__Lcom_raquo_laminar_keys_HtmlAttr__O(element, attr);
  if ((x === (void 0))) {
    return (void 0)
  } else {
    var domValue = x;
    var a = attr.Lcom_raquo_laminar_keys_HtmlAttr__f_codec.decode__O__O(domValue);
    return a
  }
});
$c_Lcom_raquo_laminar_DomApi$.prototype.getHtmlAttributeRaw__Lcom_raquo_laminar_nodes_ReactiveHtmlElement__Lcom_raquo_laminar_keys_HtmlAttr__O = (function(element, attr) {
  var domValue = element.Lcom_raquo_laminar_nodes_ReactiveHtmlElement__f_ref.getAttributeNS(null, attr.Lcom_raquo_laminar_keys_HtmlAttr__f_name);
  return ((domValue !== null) ? domValue : (void 0))
});
$c_Lcom_raquo_laminar_DomApi$.prototype.setHtmlAttribute__Lcom_raquo_laminar_nodes_ReactiveHtmlElement__Lcom_raquo_laminar_keys_HtmlAttr__O__V = (function(element, attr, value) {
  var domValue = attr.Lcom_raquo_laminar_keys_HtmlAttr__f_codec.encode__O__O(value);
  this.setHtmlAttributeRaw__Lcom_raquo_laminar_nodes_ReactiveHtmlElement__Lcom_raquo_laminar_keys_HtmlAttr__T__V(element, attr, domValue)
});
$c_Lcom_raquo_laminar_DomApi$.prototype.setHtmlAttributeRaw__Lcom_raquo_laminar_nodes_ReactiveHtmlElement__Lcom_raquo_laminar_keys_HtmlAttr__T__V = (function(element, attr, domValue) {
  if ((domValue === null)) {
    this.removeHtmlAttribute__Lcom_raquo_laminar_nodes_ReactiveHtmlElement__Lcom_raquo_laminar_keys_HtmlAttr__V(element, attr)
  } else {
    element.Lcom_raquo_laminar_nodes_ReactiveHtmlElement__f_ref.setAttribute(attr.Lcom_raquo_laminar_keys_HtmlAttr__f_name, domValue)
  }
});
$c_Lcom_raquo_laminar_DomApi$.prototype.removeHtmlAttribute__Lcom_raquo_laminar_nodes_ReactiveHtmlElement__Lcom_raquo_laminar_keys_HtmlAttr__V = (function(element, attr) {
  element.Lcom_raquo_laminar_nodes_ReactiveHtmlElement__f_ref.removeAttribute(attr.Lcom_raquo_laminar_keys_HtmlAttr__f_name)
});
$c_Lcom_raquo_laminar_DomApi$.prototype.setHtmlStringStyle__Lcom_raquo_laminar_nodes_ReactiveHtmlElement__Lcom_raquo_laminar_keys_StyleProp__T__V = (function(element, styleProp, value) {
  var ref = element.Lcom_raquo_laminar_nodes_ReactiveHtmlElement__f_ref;
  var styleCssName = styleProp.Lcom_raquo_laminar_keys_StyleProp__f_name;
  var prefixes = styleProp.Lcom_raquo_laminar_keys_StyleProp__f_prefixes;
  var styleValue = ((value === null) ? null : value);
  if ((styleValue === null)) {
    prefixes.foreach__F1__V(new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$c_sjsr_AnonFunction1(((prefix) => {
      var prefix$1 = prefix;
      return ref.style.removeProperty((("" + prefix$1) + styleCssName))
    })));
    ref.style.removeProperty(styleCssName)
  } else {
    prefixes.foreach__F1__V(new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$c_sjsr_AnonFunction1(((prefix$2) => {
      var prefix$3 = prefix$2;
      var \u03b41$ = ref.style;
      \u03b41$.setProperty((("" + prefix$3) + styleCssName), styleValue)
    })));
    var \u03b42$ = ref.style;
    \u03b42$.setProperty(styleCssName, styleValue)
  }
});
$c_Lcom_raquo_laminar_DomApi$.prototype.createSvgElement__Lcom_raquo_laminar_tags_SvgTag__Lorg_scalajs_dom_SVGElement = (function(tag) {
  return document.createElementNS("http://www.w3.org/2000/svg", tag.Lcom_raquo_laminar_tags_SvgTag__f_name)
});
$c_Lcom_raquo_laminar_DomApi$.prototype.getSvgAttribute__Lcom_raquo_laminar_nodes_ReactiveSvgElement__Lcom_raquo_laminar_keys_SvgAttr__O = (function(element, attr) {
  var x = this.getSvgAttributeRaw__Lcom_raquo_laminar_nodes_ReactiveSvgElement__Lcom_raquo_laminar_keys_SvgAttr__O(element, attr);
  if ((x === (void 0))) {
    return (void 0)
  } else {
    var domValue = x;
    var a = attr.Lcom_raquo_laminar_keys_SvgAttr__f_codec.decode__O__O(domValue);
    return a
  }
});
$c_Lcom_raquo_laminar_DomApi$.prototype.getSvgAttributeRaw__Lcom_raquo_laminar_nodes_ReactiveSvgElement__Lcom_raquo_laminar_keys_SvgAttr__O = (function(element, attr) {
  var $$x2 = element.ref__Lorg_scalajs_dom_SVGElement();
  var this$2 = attr.Lcom_raquo_laminar_keys_SvgAttr__f_namespaceUri;
  $m_s_$less$colon$less$();
  var $$x1 = $$x2.getAttributeNS((this$2.isEmpty__Z() ? null : this$2.get__O()), attr.Lcom_raquo_laminar_keys_SvgAttr__f_localName);
  var domValue = $$x1;
  return ((domValue !== null) ? domValue : (void 0))
});
$c_Lcom_raquo_laminar_DomApi$.prototype.setSvgAttribute__Lcom_raquo_laminar_nodes_ReactiveSvgElement__Lcom_raquo_laminar_keys_SvgAttr__O__V = (function(element, attr, value) {
  var domValue = attr.Lcom_raquo_laminar_keys_SvgAttr__f_codec.encode__O__O(value);
  this.setSvgAttributeRaw__Lcom_raquo_laminar_nodes_ReactiveSvgElement__Lcom_raquo_laminar_keys_SvgAttr__T__V(element, attr, domValue)
});
$c_Lcom_raquo_laminar_DomApi$.prototype.setSvgAttributeRaw__Lcom_raquo_laminar_nodes_ReactiveSvgElement__Lcom_raquo_laminar_keys_SvgAttr__T__V = (function(element, attr, domValue) {
  if ((domValue === null)) {
    this.removeSvgAttribute__Lcom_raquo_laminar_nodes_ReactiveSvgElement__Lcom_raquo_laminar_keys_SvgAttr__V(element, attr)
  } else {
    var this$1 = attr.Lcom_raquo_laminar_keys_SvgAttr__f_namespaceUri;
    if (this$1.isEmpty__Z()) {
      element.ref__Lorg_scalajs_dom_SVGElement().setAttribute(attr.Lcom_raquo_laminar_keys_SvgAttr__f_name, domValue)
    } else {
      var arg1 = this$1.get__O();
      var namespaceUri = arg1;
      element.ref__Lorg_scalajs_dom_SVGElement().setAttributeNS(namespaceUri, attr.Lcom_raquo_laminar_keys_SvgAttr__f_name, domValue)
    }
  }
});
$c_Lcom_raquo_laminar_DomApi$.prototype.removeSvgAttribute__Lcom_raquo_laminar_nodes_ReactiveSvgElement__Lcom_raquo_laminar_keys_SvgAttr__V = (function(element, attr) {
  var $$x1 = element.ref__Lorg_scalajs_dom_SVGElement();
  var this$2 = attr.Lcom_raquo_laminar_keys_SvgAttr__f_namespaceUri;
  $m_s_$less$colon$less$();
  $$x1.removeAttributeNS((this$2.isEmpty__Z() ? null : this$2.get__O()), attr.Lcom_raquo_laminar_keys_SvgAttr__f_localName)
});
$c_Lcom_raquo_laminar_DomApi$.prototype.createCommentNode__T__Lorg_scalajs_dom_Comment = (function(text) {
  return document.createComment(text)
});
$c_Lcom_raquo_laminar_DomApi$.prototype.createTextNode__T__Lorg_scalajs_dom_Text = (function(text) {
  return document.createTextNode(text)
});
$c_Lcom_raquo_laminar_DomApi$.prototype.debugPath__Lorg_scalajs_dom_Node__sci_List__sci_List = (function(element, initial) {
  var initial$tailLocal1 = initial;
  var element$tailLocal1 = element;
  while (true) {
    var x54 = element$tailLocal1;
    if ((x54 === null)) {
      return initial$tailLocal1
    };
    var element$tailLocal1$tmp1 = element$tailLocal1.parentNode;
    var elem$2 = this.debugNodeDescription__Lorg_scalajs_dom_Node__T(element$tailLocal1);
    var this$1 = initial$tailLocal1;
    var initial$tailLocal1$tmp1 = new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$c_sci_$colon$colon(elem$2, this$1);
    element$tailLocal1 = element$tailLocal1$tmp1;
    initial$tailLocal1 = initial$tailLocal1$tmp1
  }
});
$c_Lcom_raquo_laminar_DomApi$.prototype.debugNodeDescription__Lorg_scalajs_dom_Node__T = (function(node) {
  if ((!(!(node instanceof HTMLElement)))) {
    var id = node.id;
    if (($j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$m_sc_StringOps$(), (id !== ""))) {
      var suffixStr = ("#" + id)
    } else {
      var classes = node.className;
      if (($j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$m_sc_StringOps$(), (classes !== ""))) {
        var self = classes.replace(this.Lcom_raquo_laminar_DomApi$__f_classNamesSeparatorRegex, ".");
        var suffixStr = ("." + self)
      } else {
        var suffixStr = ""
      }
    };
    var str = node.tagName;
    var self$1 = str.toLowerCase();
    return (self$1 + suffixStr)
  } else {
    return node.nodeName
  }
});
$c_Lcom_raquo_laminar_DomApi$.prototype.debugNodeOuterHtml__Lorg_scalajs_dom_Node__T = (function(node) {
  return ((!(!(node instanceof Element))) ? node.outerHTML : ((!(!(node instanceof Text))) ? (("Text(" + node.textContent) + ")") : ((!(!(node instanceof Comment))) ? (("Comment(" + node.textContent) + ")") : ((node === null) ? "<null>" : (("OtherNode(" + $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$dp_toString__T(node)) + ")")))))
});
var $d_Lcom_raquo_laminar_DomApi$ = new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$TypeData().initClass({
  Lcom_raquo_laminar_DomApi$: 0
}, false, "com.raquo.laminar.DomApi$", {
  Lcom_raquo_laminar_DomApi$: 1,
  O: 1
});
$c_Lcom_raquo_laminar_DomApi$.prototype.$classData = $d_Lcom_raquo_laminar_DomApi$;
var $n_Lcom_raquo_laminar_DomApi$;
function $m_Lcom_raquo_laminar_DomApi$() {
  if ((!$n_Lcom_raquo_laminar_DomApi$)) {
    $n_Lcom_raquo_laminar_DomApi$ = new $c_Lcom_raquo_laminar_DomApi$()
  };
  return $n_Lcom_raquo_laminar_DomApi$
}
/** @constructor */
function $c_Lcom_raquo_laminar_Implicits$RichSource$() {
  /*<skip>*/
}
$c_Lcom_raquo_laminar_Implicits$RichSource$.prototype = new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$h_O();
$c_Lcom_raquo_laminar_Implicits$RichSource$.prototype.constructor = $c_Lcom_raquo_laminar_Implicits$RichSource$;
/** @constructor */
function $h_Lcom_raquo_laminar_Implicits$RichSource$() {
  /*<skip>*/
}
$h_Lcom_raquo_laminar_Implicits$RichSource$.prototype = $c_Lcom_raquo_laminar_Implicits$RichSource$.prototype;
$c_Lcom_raquo_laminar_Implicits$RichSource$.prototype.$minus$minus$greater$extension__Lcom_raquo_airstream_core_Source__Lcom_raquo_airstream_core_Sink__Lcom_raquo_laminar_modifiers_Binder = (function(this$, sink) {
  var fn = new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$c_sjsr_AnonFunction1(((_$15) => {
    var _$15$1 = _$15;
    var observable = this$.toObservable__Lcom_raquo_airstream_core_Observable();
    return $m_Lcom_raquo_airstream_ownership_DynamicSubscription$().subscribeSink__Lcom_raquo_airstream_ownership_DynamicOwner__Lcom_raquo_airstream_core_Observable__Lcom_raquo_airstream_core_Sink__Lcom_raquo_airstream_ownership_DynamicSubscription(_$15$1.Lcom_raquo_laminar_nodes_ReactiveHtmlElement__f_dynamicOwner, observable, sink)
  }));
  return new $c_Lcom_raquo_laminar_modifiers_Binder$$anon$1(fn)
});
var $d_Lcom_raquo_laminar_Implicits$RichSource$ = new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$TypeData().initClass({
  Lcom_raquo_laminar_Implicits$RichSource$: 0
}, false, "com.raquo.laminar.Implicits$RichSource$", {
  Lcom_raquo_laminar_Implicits$RichSource$: 1,
  O: 1
});
$c_Lcom_raquo_laminar_Implicits$RichSource$.prototype.$classData = $d_Lcom_raquo_laminar_Implicits$RichSource$;
var $n_Lcom_raquo_laminar_Implicits$RichSource$;
function $m_Lcom_raquo_laminar_Implicits$RichSource$() {
  if ((!$n_Lcom_raquo_laminar_Implicits$RichSource$)) {
    $n_Lcom_raquo_laminar_Implicits$RichSource$ = new $c_Lcom_raquo_laminar_Implicits$RichSource$()
  };
  return $n_Lcom_raquo_laminar_Implicits$RichSource$
}
function $f_Lcom_raquo_laminar_api_Airstream__$init$__V($thiz) {
  $thiz.Lcom_raquo_laminar_api_package$$anon$1__f_Observer = $m_Lcom_raquo_airstream_core_Observer$();
  $m_Lcom_raquo_airstream_core_AirstreamError$();
  $thiz.Lcom_raquo_laminar_api_package$$anon$1__f_Val = $m_Lcom_raquo_airstream_state_Val$();
  $thiz.Lcom_raquo_laminar_api_package$$anon$1__f_Var = $m_Lcom_raquo_airstream_state_Var$()
}
/** @constructor */
function $c_Lcom_raquo_laminar_codecs_package$() {
  this.Lcom_raquo_laminar_codecs_package$__f_StringAsIsCodec = null;
  this.Lcom_raquo_laminar_codecs_package$__f_BooleanAsAttrPresenceCodec = null;
  $n_Lcom_raquo_laminar_codecs_package$ = this;
  this.Lcom_raquo_laminar_codecs_package$__f_StringAsIsCodec = ($m_Lcom_raquo_laminar_codecs_package$(), new $c_Lcom_raquo_laminar_codecs_package$$anon$2());
  $m_Lcom_raquo_laminar_codecs_package$();
  new $c_Lcom_raquo_laminar_codecs_package$$anon$2();
  $m_Lcom_raquo_laminar_codecs_package$();
  new $c_Lcom_raquo_laminar_codecs_package$$anon$2();
  this.Lcom_raquo_laminar_codecs_package$__f_BooleanAsAttrPresenceCodec = new $c_Lcom_raquo_laminar_codecs_package$$anon$1()
}
$c_Lcom_raquo_laminar_codecs_package$.prototype = new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$h_O();
$c_Lcom_raquo_laminar_codecs_package$.prototype.constructor = $c_Lcom_raquo_laminar_codecs_package$;
/** @constructor */
function $h_Lcom_raquo_laminar_codecs_package$() {
  /*<skip>*/
}
$h_Lcom_raquo_laminar_codecs_package$.prototype = $c_Lcom_raquo_laminar_codecs_package$.prototype;
var $d_Lcom_raquo_laminar_codecs_package$ = new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$TypeData().initClass({
  Lcom_raquo_laminar_codecs_package$: 0
}, false, "com.raquo.laminar.codecs.package$", {
  Lcom_raquo_laminar_codecs_package$: 1,
  O: 1
});
$c_Lcom_raquo_laminar_codecs_package$.prototype.$classData = $d_Lcom_raquo_laminar_codecs_package$;
var $n_Lcom_raquo_laminar_codecs_package$;
function $m_Lcom_raquo_laminar_codecs_package$() {
  if ((!$n_Lcom_raquo_laminar_codecs_package$)) {
    $n_Lcom_raquo_laminar_codecs_package$ = new $c_Lcom_raquo_laminar_codecs_package$()
  };
  return $n_Lcom_raquo_laminar_codecs_package$
}
function $f_Lcom_raquo_laminar_defs_complex_ComplexHtmlKeys__$init$__V($thiz) {
  $thiz.Lcom_raquo_laminar_api_package$$anon$1__f_className = $f_Lcom_raquo_laminar_defs_complex_ComplexHtmlKeys__stringCompositeHtmlAttr__T__T__Lcom_raquo_laminar_keys_CompositeKey($thiz, "class", " ")
}
function $f_Lcom_raquo_laminar_defs_complex_ComplexHtmlKeys__dataAttr__T__Lcom_raquo_laminar_keys_HtmlAttr($thiz, suffix) {
  return new $c_Lcom_raquo_laminar_keys_HtmlAttr(("data-" + suffix), $m_Lcom_raquo_laminar_codecs_package$().Lcom_raquo_laminar_codecs_package$__f_StringAsIsCodec)
}
function $f_Lcom_raquo_laminar_defs_complex_ComplexHtmlKeys__stringCompositeHtmlAttr__T__T__Lcom_raquo_laminar_keys_CompositeKey($thiz, name, separator) {
  var attr = new $c_Lcom_raquo_laminar_keys_HtmlAttr(name, $m_Lcom_raquo_laminar_codecs_package$().Lcom_raquo_laminar_codecs_package$__f_StringAsIsCodec);
  return new $c_Lcom_raquo_laminar_keys_CompositeKey(attr.Lcom_raquo_laminar_keys_HtmlAttr__f_name, new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$c_sjsr_AnonFunction1(((el) => {
    var el$1 = el;
    var x = $m_Lcom_raquo_laminar_DomApi$().getHtmlAttribute__Lcom_raquo_laminar_nodes_ReactiveHtmlElement__Lcom_raquo_laminar_keys_HtmlAttr__O(el$1, attr);
    return ((x === (void 0)) ? "" : x)
  })), new $c_sjsr_AnonFunction2(((el$2, value) => {
    var el$3 = el$2;
    var value$1 = value;
    $m_Lcom_raquo_laminar_DomApi$().setHtmlAttribute__Lcom_raquo_laminar_nodes_ReactiveHtmlElement__Lcom_raquo_laminar_keys_HtmlAttr__O__V(el$3, attr, value$1)
  })), separator)
}
function $f_Lcom_raquo_laminar_defs_complex_ComplexSvgKeys__$init$__V($thiz) {
  $thiz.Lcom_raquo_laminar_api_Laminar$svg$__f_className = $f_Lcom_raquo_laminar_defs_complex_ComplexSvgKeys__stringCompositeSvgAttr__T__T__Lcom_raquo_laminar_keys_CompositeKey($thiz, "class", " ")
}
function $f_Lcom_raquo_laminar_defs_complex_ComplexSvgKeys__stringCompositeSvgAttr__T__T__Lcom_raquo_laminar_keys_CompositeKey($thiz, name, separator) {
  var attr = new $c_Lcom_raquo_laminar_keys_SvgAttr(name, $m_Lcom_raquo_laminar_codecs_package$().Lcom_raquo_laminar_codecs_package$__f_StringAsIsCodec, $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$m_s_None$());
  return new $c_Lcom_raquo_laminar_keys_CompositeKey(attr.Lcom_raquo_laminar_keys_SvgAttr__f_name, new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$c_sjsr_AnonFunction1(((el) => {
    var el$1 = el;
    var x = $m_Lcom_raquo_laminar_DomApi$().getSvgAttribute__Lcom_raquo_laminar_nodes_ReactiveSvgElement__Lcom_raquo_laminar_keys_SvgAttr__O(el$1, attr);
    return ((x === (void 0)) ? "" : x)
  })), new $c_sjsr_AnonFunction2(((el$2, value) => {
    var el$3 = el$2;
    var value$1 = value;
    $m_Lcom_raquo_laminar_DomApi$().setSvgAttribute__Lcom_raquo_laminar_nodes_ReactiveSvgElement__Lcom_raquo_laminar_keys_SvgAttr__O__V(el$3, attr, value$1)
  })), separator)
}
/** @constructor */
function $c_Lcom_raquo_laminar_keys_CompositeKey$() {
  /*<skip>*/
}
$c_Lcom_raquo_laminar_keys_CompositeKey$.prototype = new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$h_O();
$c_Lcom_raquo_laminar_keys_CompositeKey$.prototype.constructor = $c_Lcom_raquo_laminar_keys_CompositeKey$;
/** @constructor */
function $h_Lcom_raquo_laminar_keys_CompositeKey$() {
  /*<skip>*/
}
$h_Lcom_raquo_laminar_keys_CompositeKey$.prototype = $c_Lcom_raquo_laminar_keys_CompositeKey$.prototype;
$c_Lcom_raquo_laminar_keys_CompositeKey$.prototype.normalize__T__T__sci_List = (function(items, separator) {
  if ((items === "")) {
    return $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$m_s_package$().s_package$__f_Nil
  } else {
    var arr = items.split(separator);
    var arr$1 = arr.filter(((_$1) => {
      var _$1$1 = _$1;
      $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$m_sc_StringOps$();
      return (_$1$1 !== "")
    }));
    var this$11 = $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$ct_sjs_js_WrappedArray__sjs_js_Array__(new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$c_sjs_js_WrappedArray(), arr$1);
    $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$m_sci_List$();
    return $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$m_sci_Nil$().prependedAll__sc_IterableOnce__sci_List(this$11)
  }
});
var $d_Lcom_raquo_laminar_keys_CompositeKey$ = new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$TypeData().initClass({
  Lcom_raquo_laminar_keys_CompositeKey$: 0
}, false, "com.raquo.laminar.keys.CompositeKey$", {
  Lcom_raquo_laminar_keys_CompositeKey$: 1,
  O: 1
});
$c_Lcom_raquo_laminar_keys_CompositeKey$.prototype.$classData = $d_Lcom_raquo_laminar_keys_CompositeKey$;
var $n_Lcom_raquo_laminar_keys_CompositeKey$;
function $m_Lcom_raquo_laminar_keys_CompositeKey$() {
  if ((!$n_Lcom_raquo_laminar_keys_CompositeKey$)) {
    $n_Lcom_raquo_laminar_keys_CompositeKey$ = new $c_Lcom_raquo_laminar_keys_CompositeKey$()
  };
  return $n_Lcom_raquo_laminar_keys_CompositeKey$
}
/** @constructor */
function $c_Lcom_raquo_laminar_keys_EventProcessor(eventProp, shouldUseCapture, shouldBePassive, processor) {
  this.Lcom_raquo_laminar_keys_EventProcessor__f_eventProp = null;
  this.Lcom_raquo_laminar_keys_EventProcessor__f_shouldUseCapture = false;
  this.Lcom_raquo_laminar_keys_EventProcessor__f_shouldBePassive = false;
  this.Lcom_raquo_laminar_keys_EventProcessor__f_processor = null;
  this.Lcom_raquo_laminar_keys_EventProcessor__f_eventProp = eventProp;
  this.Lcom_raquo_laminar_keys_EventProcessor__f_shouldUseCapture = shouldUseCapture;
  this.Lcom_raquo_laminar_keys_EventProcessor__f_shouldBePassive = shouldBePassive;
  this.Lcom_raquo_laminar_keys_EventProcessor__f_processor = processor
}
$c_Lcom_raquo_laminar_keys_EventProcessor.prototype = new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$h_O();
$c_Lcom_raquo_laminar_keys_EventProcessor.prototype.constructor = $c_Lcom_raquo_laminar_keys_EventProcessor;
/** @constructor */
function $h_Lcom_raquo_laminar_keys_EventProcessor() {
  /*<skip>*/
}
$h_Lcom_raquo_laminar_keys_EventProcessor.prototype = $c_Lcom_raquo_laminar_keys_EventProcessor.prototype;
$c_Lcom_raquo_laminar_keys_EventProcessor.prototype.preventDefault__Lcom_raquo_laminar_keys_EventProcessor = (function() {
  var newProcessor = new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$c_sjsr_AnonFunction1(((ev) => {
    var this$2 = this.Lcom_raquo_laminar_keys_EventProcessor__f_processor.apply__O__O(ev);
    if (this$2.isEmpty__Z()) {
      return $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$m_s_None$()
    } else {
      var arg1 = this$2.get__O();
      ev.preventDefault();
      return new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$c_s_Some(arg1)
    }
  }));
  return new $c_Lcom_raquo_laminar_keys_EventProcessor(this.Lcom_raquo_laminar_keys_EventProcessor__f_eventProp, this.Lcom_raquo_laminar_keys_EventProcessor__f_shouldUseCapture, this.Lcom_raquo_laminar_keys_EventProcessor__f_shouldBePassive, newProcessor)
});
$c_Lcom_raquo_laminar_keys_EventProcessor.prototype.map__F1__Lcom_raquo_laminar_keys_EventProcessor = (function(project) {
  var newProcessor = new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$c_sjsr_AnonFunction1(((ev) => {
    var this$2 = this.Lcom_raquo_laminar_keys_EventProcessor__f_processor.apply__O__O(ev);
    return (this$2.isEmpty__Z() ? $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$m_s_None$() : new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$c_s_Some(project.apply__O__O(this$2.get__O())))
  }));
  return new $c_Lcom_raquo_laminar_keys_EventProcessor(this.Lcom_raquo_laminar_keys_EventProcessor__f_eventProp, this.Lcom_raquo_laminar_keys_EventProcessor__f_shouldUseCapture, this.Lcom_raquo_laminar_keys_EventProcessor__f_shouldBePassive, newProcessor)
});
$c_Lcom_raquo_laminar_keys_EventProcessor.prototype.mapTo__F0__Lcom_raquo_laminar_keys_EventProcessor = (function(value) {
  var newProcessor = new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$c_sjsr_AnonFunction1(((ev) => {
    var this$2 = this.Lcom_raquo_laminar_keys_EventProcessor__f_processor.apply__O__O(ev);
    return (this$2.isEmpty__Z() ? $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$m_s_None$() : new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$c_s_Some((this$2.get__O(), value.apply__O())))
  }));
  return new $c_Lcom_raquo_laminar_keys_EventProcessor(this.Lcom_raquo_laminar_keys_EventProcessor__f_eventProp, this.Lcom_raquo_laminar_keys_EventProcessor__f_shouldUseCapture, this.Lcom_raquo_laminar_keys_EventProcessor__f_shouldBePassive, newProcessor)
});
var $d_Lcom_raquo_laminar_keys_EventProcessor = new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$TypeData().initClass({
  Lcom_raquo_laminar_keys_EventProcessor: 0
}, false, "com.raquo.laminar.keys.EventProcessor", {
  Lcom_raquo_laminar_keys_EventProcessor: 1,
  O: 1
});
$c_Lcom_raquo_laminar_keys_EventProcessor.prototype.$classData = $d_Lcom_raquo_laminar_keys_EventProcessor;
/** @constructor */
function $c_Lcom_raquo_laminar_keys_EventProcessor$() {
  /*<skip>*/
}
$c_Lcom_raquo_laminar_keys_EventProcessor$.prototype = new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$h_O();
$c_Lcom_raquo_laminar_keys_EventProcessor$.prototype.constructor = $c_Lcom_raquo_laminar_keys_EventProcessor$;
/** @constructor */
function $h_Lcom_raquo_laminar_keys_EventProcessor$() {
  /*<skip>*/
}
$h_Lcom_raquo_laminar_keys_EventProcessor$.prototype = $c_Lcom_raquo_laminar_keys_EventProcessor$.prototype;
$c_Lcom_raquo_laminar_keys_EventProcessor$.prototype.empty__Lcom_raquo_laminar_keys_EventProp__Z__Z__Lcom_raquo_laminar_keys_EventProcessor = (function(eventProp, shouldUseCapture, shouldBePassive) {
  return new $c_Lcom_raquo_laminar_keys_EventProcessor(eventProp, shouldUseCapture, shouldBePassive, new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$c_sjsr_AnonFunction1(((_$11) => new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$c_s_Some(_$11))))
});
var $d_Lcom_raquo_laminar_keys_EventProcessor$ = new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$TypeData().initClass({
  Lcom_raquo_laminar_keys_EventProcessor$: 0
}, false, "com.raquo.laminar.keys.EventProcessor$", {
  Lcom_raquo_laminar_keys_EventProcessor$: 1,
  O: 1
});
$c_Lcom_raquo_laminar_keys_EventProcessor$.prototype.$classData = $d_Lcom_raquo_laminar_keys_EventProcessor$;
var $n_Lcom_raquo_laminar_keys_EventProcessor$;
function $m_Lcom_raquo_laminar_keys_EventProcessor$() {
  if ((!$n_Lcom_raquo_laminar_keys_EventProcessor$)) {
    $n_Lcom_raquo_laminar_keys_EventProcessor$ = new $c_Lcom_raquo_laminar_keys_EventProcessor$()
  };
  return $n_Lcom_raquo_laminar_keys_EventProcessor$
}
/** @constructor */
function $c_Lcom_raquo_laminar_keys_Key() {
  /*<skip>*/
}
$c_Lcom_raquo_laminar_keys_Key.prototype = new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$h_O();
$c_Lcom_raquo_laminar_keys_Key.prototype.constructor = $c_Lcom_raquo_laminar_keys_Key;
/** @constructor */
function $h_Lcom_raquo_laminar_keys_Key() {
  /*<skip>*/
}
$h_Lcom_raquo_laminar_keys_Key.prototype = $c_Lcom_raquo_laminar_keys_Key.prototype;
/** @constructor */
function $c_Lcom_raquo_laminar_keys_SvgAttr$() {
  /*<skip>*/
}
$c_Lcom_raquo_laminar_keys_SvgAttr$.prototype = new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$h_O();
$c_Lcom_raquo_laminar_keys_SvgAttr$.prototype.constructor = $c_Lcom_raquo_laminar_keys_SvgAttr$;
/** @constructor */
function $h_Lcom_raquo_laminar_keys_SvgAttr$() {
  /*<skip>*/
}
$h_Lcom_raquo_laminar_keys_SvgAttr$.prototype = $c_Lcom_raquo_laminar_keys_SvgAttr$.prototype;
$c_Lcom_raquo_laminar_keys_SvgAttr$.prototype.namespaceUri__T__T = (function(namespace) {
  switch (namespace) {
    case "svg": {
      return "http://www.w3.org/2000/svg";
      break
    }
    case "xlink": {
      return "http://www.w3.org/1999/xlink";
      break
    }
    case "xml": {
      return "http://www.w3.org/XML/1998/namespace";
      break
    }
    case "xmlns": {
      return "http://www.w3.org/2000/xmlns/";
      break
    }
    default: {
      throw new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$c_s_MatchError(namespace)
    }
  }
});
var $d_Lcom_raquo_laminar_keys_SvgAttr$ = new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$TypeData().initClass({
  Lcom_raquo_laminar_keys_SvgAttr$: 0
}, false, "com.raquo.laminar.keys.SvgAttr$", {
  Lcom_raquo_laminar_keys_SvgAttr$: 1,
  O: 1
});
$c_Lcom_raquo_laminar_keys_SvgAttr$.prototype.$classData = $d_Lcom_raquo_laminar_keys_SvgAttr$;
var $n_Lcom_raquo_laminar_keys_SvgAttr$;
function $m_Lcom_raquo_laminar_keys_SvgAttr$() {
  if ((!$n_Lcom_raquo_laminar_keys_SvgAttr$)) {
    $n_Lcom_raquo_laminar_keys_SvgAttr$ = new $c_Lcom_raquo_laminar_keys_SvgAttr$()
  };
  return $n_Lcom_raquo_laminar_keys_SvgAttr$
}
/** @constructor */
function $c_Lcom_raquo_laminar_lifecycle_InsertContext(parentNode, sentinelNode, strictMode, extraNodeCount, extraNodes, extraNodesMap) {
  this.Lcom_raquo_laminar_lifecycle_InsertContext__f_parentNode = null;
  this.Lcom_raquo_laminar_lifecycle_InsertContext__f_sentinelNode = null;
  this.Lcom_raquo_laminar_lifecycle_InsertContext__f_strictMode = false;
  this.Lcom_raquo_laminar_lifecycle_InsertContext__f_extraNodeCount = 0;
  this.Lcom_raquo_laminar_lifecycle_InsertContext__f_extraNodes = null;
  this.Lcom_raquo_laminar_lifecycle_InsertContext__f_extraNodesMap = null;
  this.Lcom_raquo_laminar_lifecycle_InsertContext__f_parentNode = parentNode;
  this.Lcom_raquo_laminar_lifecycle_InsertContext__f_sentinelNode = sentinelNode;
  this.Lcom_raquo_laminar_lifecycle_InsertContext__f_strictMode = strictMode;
  this.Lcom_raquo_laminar_lifecycle_InsertContext__f_extraNodeCount = extraNodeCount;
  this.Lcom_raquo_laminar_lifecycle_InsertContext__f_extraNodes = extraNodes;
  this.Lcom_raquo_laminar_lifecycle_InsertContext__f_extraNodesMap = extraNodesMap
}
$c_Lcom_raquo_laminar_lifecycle_InsertContext.prototype = new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$h_O();
$c_Lcom_raquo_laminar_lifecycle_InsertContext.prototype.constructor = $c_Lcom_raquo_laminar_lifecycle_InsertContext;
/** @constructor */
function $h_Lcom_raquo_laminar_lifecycle_InsertContext() {
  /*<skip>*/
}
$h_Lcom_raquo_laminar_lifecycle_InsertContext.prototype = $c_Lcom_raquo_laminar_lifecycle_InsertContext.prototype;
$c_Lcom_raquo_laminar_lifecycle_InsertContext.prototype.forceSetStrictMode__V = (function() {
  if ((this.Lcom_raquo_laminar_lifecycle_InsertContext__f_strictMode || (this.Lcom_raquo_laminar_lifecycle_InsertContext__f_extraNodeCount !== 0))) {
    var $$x1 = $m_Lcom_raquo_laminar_DomApi$();
    var this$1 = this.Lcom_raquo_laminar_lifecycle_InsertContext__f_parentNode;
    throw $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$ct_jl_Exception__T__(new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$c_jl_Exception(), ("forceSetStrictMode invoked when not allowed, inside parent = " + $$x1.debugNodeOuterHtml__Lorg_scalajs_dom_Node__T(this$1.Lcom_raquo_laminar_nodes_ReactiveHtmlElement__f_ref)))
  };
  if ((this.Lcom_raquo_laminar_lifecycle_InsertContext__f_extraNodesMap === null)) {
    this.Lcom_raquo_laminar_lifecycle_InsertContext__f_extraNodesMap = new Map()
  };
  if ((!(!(!(this.Lcom_raquo_laminar_lifecycle_InsertContext__f_sentinelNode.ref__Lorg_scalajs_dom_Node() instanceof Comment))))) {
    var contentNode = this.Lcom_raquo_laminar_lifecycle_InsertContext__f_sentinelNode;
    var newSentinelNode = new $c_Lcom_raquo_laminar_nodes_CommentNode("");
    var $$x2 = $m_Lcom_raquo_laminar_DomApi$();
    var this$2 = this.Lcom_raquo_laminar_lifecycle_InsertContext__f_parentNode;
    $$x2.insertBefore__Lorg_scalajs_dom_Node__Lorg_scalajs_dom_Node__Lorg_scalajs_dom_Node__Z(this$2.Lcom_raquo_laminar_nodes_ReactiveHtmlElement__f_ref, newSentinelNode.Lcom_raquo_laminar_nodes_CommentNode__f_ref, contentNode.ref__Lorg_scalajs_dom_Node());
    this.Lcom_raquo_laminar_lifecycle_InsertContext__f_sentinelNode = newSentinelNode;
    this.Lcom_raquo_laminar_lifecycle_InsertContext__f_extraNodeCount = 1;
    var this$3 = $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$m_s_package$().s_package$__f_Nil;
    this.Lcom_raquo_laminar_lifecycle_InsertContext__f_extraNodes = new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$c_sci_$colon$colon(contentNode, this$3);
    this.Lcom_raquo_laminar_lifecycle_InsertContext__f_extraNodesMap.set(contentNode.ref__Lorg_scalajs_dom_Node(), contentNode)
  };
  this.Lcom_raquo_laminar_lifecycle_InsertContext__f_strictMode = true
});
$c_Lcom_raquo_laminar_lifecycle_InsertContext.prototype.removeOldChildNodesFromDOM__Lcom_raquo_laminar_nodes_ChildNode__V = (function(after) {
  var elem = this.Lcom_raquo_laminar_lifecycle_InsertContext__f_extraNodeCount;
  var elem$1 = 0;
  elem$1 = elem;
  while ((elem$1 > 0)) {
    var prevChildRef = after.ref__Lorg_scalajs_dom_Node().nextSibling;
    if ((prevChildRef === null)) {
      var ev$3 = 0;
      elem$1 = ev$3
    } else {
      var maybePrevChild = this.Lcom_raquo_laminar_lifecycle_InsertContext__f_extraNodesMap.get(prevChildRef);
      if ((maybePrevChild === (void 0))) {
        var ev$4 = 0;
        elem$1 = ev$4
      } else if ((maybePrevChild !== (void 0))) {
        var prevChild = maybePrevChild;
        $m_Lcom_raquo_laminar_nodes_ParentNode$().removeChild__Lcom_raquo_laminar_nodes_ParentNode__Lcom_raquo_laminar_nodes_ChildNode__Z(this.Lcom_raquo_laminar_lifecycle_InsertContext__f_parentNode, prevChild);
        var ev$5 = (((-1) + elem$1) | 0);
        elem$1 = ev$5
      }
    }
  }
});
function $isArrayOf_Lcom_raquo_laminar_lifecycle_InsertContext(obj, depth) {
  return (!(!(((obj && obj.$classData) && (obj.$classData.arrayDepth === depth)) && obj.$classData.arrayBase.ancestors.Lcom_raquo_laminar_lifecycle_InsertContext)))
}
var $d_Lcom_raquo_laminar_lifecycle_InsertContext = new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$TypeData().initClass({
  Lcom_raquo_laminar_lifecycle_InsertContext: 0
}, false, "com.raquo.laminar.lifecycle.InsertContext", {
  Lcom_raquo_laminar_lifecycle_InsertContext: 1,
  O: 1
});
$c_Lcom_raquo_laminar_lifecycle_InsertContext.prototype.$classData = $d_Lcom_raquo_laminar_lifecycle_InsertContext;
/** @constructor */
function $c_Lcom_raquo_laminar_lifecycle_InsertContext$() {
  /*<skip>*/
}
$c_Lcom_raquo_laminar_lifecycle_InsertContext$.prototype = new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$h_O();
$c_Lcom_raquo_laminar_lifecycle_InsertContext$.prototype.constructor = $c_Lcom_raquo_laminar_lifecycle_InsertContext$;
/** @constructor */
function $h_Lcom_raquo_laminar_lifecycle_InsertContext$() {
  /*<skip>*/
}
$h_Lcom_raquo_laminar_lifecycle_InsertContext$.prototype = $c_Lcom_raquo_laminar_lifecycle_InsertContext$.prototype;
$c_Lcom_raquo_laminar_lifecycle_InsertContext$.prototype.reserveSpotContext__Lcom_raquo_laminar_nodes_ReactiveElement__Z__Lcom_raquo_laminar_lifecycle_InsertContext = (function(parentNode, strictMode) {
  var sentinelNode = new $c_Lcom_raquo_laminar_nodes_CommentNode("");
  $m_Lcom_raquo_laminar_nodes_ParentNode$().appendChild__Lcom_raquo_laminar_nodes_ParentNode__Lcom_raquo_laminar_nodes_ChildNode__Z(parentNode, sentinelNode);
  return this.unsafeMakeReservedSpotContext__Lcom_raquo_laminar_nodes_ReactiveElement__Lcom_raquo_laminar_nodes_ChildNode__Z__Lcom_raquo_laminar_lifecycle_InsertContext(parentNode, sentinelNode, strictMode)
});
$c_Lcom_raquo_laminar_lifecycle_InsertContext$.prototype.unsafeMakeReservedSpotContext__Lcom_raquo_laminar_nodes_ReactiveElement__Lcom_raquo_laminar_nodes_ChildNode__Z__Lcom_raquo_laminar_lifecycle_InsertContext = (function(parentNode, sentinelNode, strictMode) {
  return new $c_Lcom_raquo_laminar_lifecycle_InsertContext(parentNode, sentinelNode, strictMode, 0, $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$m_s_package$().s_package$__f_Nil, (strictMode ? new Map() : null))
});
$c_Lcom_raquo_laminar_lifecycle_InsertContext$.prototype.nodesToMap__sci_Seq__Lcom_raquo_ew_JsMap = (function(nodes) {
  var acc = new Map();
  nodes.foreach__F1__V(new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$c_sjsr_AnonFunction1(((node) => {
    var node$1 = node;
    return acc.set(node$1.ref__Lorg_scalajs_dom_Node(), node$1)
  })));
  return acc
});
var $d_Lcom_raquo_laminar_lifecycle_InsertContext$ = new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$TypeData().initClass({
  Lcom_raquo_laminar_lifecycle_InsertContext$: 0
}, false, "com.raquo.laminar.lifecycle.InsertContext$", {
  Lcom_raquo_laminar_lifecycle_InsertContext$: 1,
  O: 1
});
$c_Lcom_raquo_laminar_lifecycle_InsertContext$.prototype.$classData = $d_Lcom_raquo_laminar_lifecycle_InsertContext$;
var $n_Lcom_raquo_laminar_lifecycle_InsertContext$;
function $m_Lcom_raquo_laminar_lifecycle_InsertContext$() {
  if ((!$n_Lcom_raquo_laminar_lifecycle_InsertContext$)) {
    $n_Lcom_raquo_laminar_lifecycle_InsertContext$ = new $c_Lcom_raquo_laminar_lifecycle_InsertContext$()
  };
  return $n_Lcom_raquo_laminar_lifecycle_InsertContext$
}
/** @constructor */
function $c_Lcom_raquo_laminar_lifecycle_MountContext(thisNode, owner) {
  this.Lcom_raquo_laminar_lifecycle_MountContext__f_thisNode = null;
  this.Lcom_raquo_laminar_lifecycle_MountContext__f_owner = null;
  this.Lcom_raquo_laminar_lifecycle_MountContext__f_thisNode = thisNode;
  this.Lcom_raquo_laminar_lifecycle_MountContext__f_owner = owner
}
$c_Lcom_raquo_laminar_lifecycle_MountContext.prototype = new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$h_O();
$c_Lcom_raquo_laminar_lifecycle_MountContext.prototype.constructor = $c_Lcom_raquo_laminar_lifecycle_MountContext;
/** @constructor */
function $h_Lcom_raquo_laminar_lifecycle_MountContext() {
  /*<skip>*/
}
$h_Lcom_raquo_laminar_lifecycle_MountContext.prototype = $c_Lcom_raquo_laminar_lifecycle_MountContext.prototype;
function $isArrayOf_Lcom_raquo_laminar_lifecycle_MountContext(obj, depth) {
  return (!(!(((obj && obj.$classData) && (obj.$classData.arrayDepth === depth)) && obj.$classData.arrayBase.ancestors.Lcom_raquo_laminar_lifecycle_MountContext)))
}
var $d_Lcom_raquo_laminar_lifecycle_MountContext = new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$TypeData().initClass({
  Lcom_raquo_laminar_lifecycle_MountContext: 0
}, false, "com.raquo.laminar.lifecycle.MountContext", {
  Lcom_raquo_laminar_lifecycle_MountContext: 1,
  O: 1
});
$c_Lcom_raquo_laminar_lifecycle_MountContext.prototype.$classData = $d_Lcom_raquo_laminar_lifecycle_MountContext;
/** @constructor */
function $c_Lcom_raquo_laminar_modifiers_ChildInserter$() {
  /*<skip>*/
}
$c_Lcom_raquo_laminar_modifiers_ChildInserter$.prototype = new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$h_O();
$c_Lcom_raquo_laminar_modifiers_ChildInserter$.prototype.constructor = $c_Lcom_raquo_laminar_modifiers_ChildInserter$;
/** @constructor */
function $h_Lcom_raquo_laminar_modifiers_ChildInserter$() {
  /*<skip>*/
}
$h_Lcom_raquo_laminar_modifiers_ChildInserter$.prototype = $c_Lcom_raquo_laminar_modifiers_ChildInserter$.prototype;
$c_Lcom_raquo_laminar_modifiers_ChildInserter$.prototype.apply__Lcom_raquo_airstream_core_Observable__Lcom_raquo_laminar_modifiers_RenderableNode__Lcom_raquo_laminar_modifiers_Inserter = (function(childSource, renderable) {
  return new $c_Lcom_raquo_laminar_modifiers_Inserter($j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$m_s_None$(), true, new $c_sjsr_AnonFunction2(((ctx, owner) => {
    var ctx$1 = ctx;
    var owner$1 = owner;
    if ((!ctx$1.Lcom_raquo_laminar_lifecycle_InsertContext__f_strictMode)) {
      ctx$1.forceSetStrictMode__V()
    };
    var maybeLastSeenChild = new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$c_sr_ObjectRef((void 0));
    var onNext = new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$c_sjsr_AnonFunction1(((newComponent) => {
      var newChildNode = renderable.asNode__O__Lcom_raquo_laminar_nodes_ChildNode(newComponent);
      var elem = ctx$1.Lcom_raquo_laminar_lifecycle_InsertContext__f_extraNodeCount;
      var elem$1 = 0;
      elem$1 = elem;
      var x = maybeLastSeenChild.sr_ObjectRef__f_elem;
      if ((x === (void 0))) {
        var $$x1 = true
      } else {
        var _$1 = x;
        var x$1 = _$1.ref__Lorg_scalajs_dom_Node();
        var y = ctx$1.Lcom_raquo_laminar_lifecycle_InsertContext__f_sentinelNode.ref__Lorg_scalajs_dom_Node().nextSibling;
        var $$x1 = $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$m_sr_BoxesRunTime$().equals__O__O__Z(x$1, y)
      };
      if ($$x1) {
        var x$2 = x
      } else {
        var x$2 = (void 0)
      };
      if ((x$2 === (void 0))) {
        $m_Lcom_raquo_laminar_nodes_ParentNode$().insertChildAfter__Lcom_raquo_laminar_nodes_ParentNode__Lcom_raquo_laminar_nodes_ChildNode__Lcom_raquo_laminar_nodes_ChildNode__Z(ctx$1.Lcom_raquo_laminar_lifecycle_InsertContext__f_parentNode, newChildNode, ctx$1.Lcom_raquo_laminar_lifecycle_InsertContext__f_sentinelNode)
      } else {
        var lastSeenChild = x$2;
        var replaced = $m_Lcom_raquo_laminar_nodes_ParentNode$().replaceChild__Lcom_raquo_laminar_nodes_ParentNode__Lcom_raquo_laminar_nodes_ChildNode__Lcom_raquo_laminar_nodes_ChildNode__Z(ctx$1.Lcom_raquo_laminar_lifecycle_InsertContext__f_parentNode, lastSeenChild, newChildNode);
        if ((replaced || (lastSeenChild === newChildNode))) {
          var ev$3 = (((-1) + elem$1) | 0);
          elem$1 = ev$3
        }
      };
      ctx$1.removeOldChildNodesFromDOM__Lcom_raquo_laminar_nodes_ChildNode__V(newChildNode);
      ctx$1.Lcom_raquo_laminar_lifecycle_InsertContext__f_extraNodesMap.clear();
      ctx$1.Lcom_raquo_laminar_lifecycle_InsertContext__f_extraNodesMap.set(newChildNode.ref__Lorg_scalajs_dom_Node(), newChildNode);
      var this$15 = $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$m_s_package$().s_package$__f_Nil;
      ctx$1.Lcom_raquo_laminar_lifecycle_InsertContext__f_extraNodes = new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$c_sci_$colon$colon(newChildNode, this$15);
      ctx$1.Lcom_raquo_laminar_lifecycle_InsertContext__f_extraNodeCount = 1;
      var ev$4 = newChildNode;
      maybeLastSeenChild.sr_ObjectRef__f_elem = ev$4;
      ev$4 = null
    }));
    return $f_Lcom_raquo_airstream_core_BaseObservable__foreach__F1__Lcom_raquo_airstream_ownership_Owner__Lcom_raquo_airstream_ownership_Subscription(childSource, onNext, owner$1)
  })))
});
var $d_Lcom_raquo_laminar_modifiers_ChildInserter$ = new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$TypeData().initClass({
  Lcom_raquo_laminar_modifiers_ChildInserter$: 0
}, false, "com.raquo.laminar.modifiers.ChildInserter$", {
  Lcom_raquo_laminar_modifiers_ChildInserter$: 1,
  O: 1
});
$c_Lcom_raquo_laminar_modifiers_ChildInserter$.prototype.$classData = $d_Lcom_raquo_laminar_modifiers_ChildInserter$;
var $n_Lcom_raquo_laminar_modifiers_ChildInserter$;
function $m_Lcom_raquo_laminar_modifiers_ChildInserter$() {
  if ((!$n_Lcom_raquo_laminar_modifiers_ChildInserter$)) {
    $n_Lcom_raquo_laminar_modifiers_ChildInserter$ = new $c_Lcom_raquo_laminar_modifiers_ChildInserter$()
  };
  return $n_Lcom_raquo_laminar_modifiers_ChildInserter$
}
/** @constructor */
function $c_Lcom_raquo_laminar_modifiers_ChildTextInserter$() {
  /*<skip>*/
}
$c_Lcom_raquo_laminar_modifiers_ChildTextInserter$.prototype = new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$h_O();
$c_Lcom_raquo_laminar_modifiers_ChildTextInserter$.prototype.constructor = $c_Lcom_raquo_laminar_modifiers_ChildTextInserter$;
/** @constructor */
function $h_Lcom_raquo_laminar_modifiers_ChildTextInserter$() {
  /*<skip>*/
}
$h_Lcom_raquo_laminar_modifiers_ChildTextInserter$.prototype = $c_Lcom_raquo_laminar_modifiers_ChildTextInserter$.prototype;
$c_Lcom_raquo_laminar_modifiers_ChildTextInserter$.prototype.apply__Lcom_raquo_airstream_core_Observable__Lcom_raquo_laminar_modifiers_RenderableText__Lcom_raquo_laminar_modifiers_Inserter = (function(textSource, renderable) {
  return new $c_Lcom_raquo_laminar_modifiers_Inserter($j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$m_s_None$(), false, new $c_sjsr_AnonFunction2(((ctx, owner) => {
    var ctx$1 = ctx;
    var owner$1 = owner;
    var maybeTextNode = new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$c_sr_ObjectRef((void 0));
    var onNext = new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$c_sjsr_AnonFunction1(((newValue) => {
      var x = maybeTextNode.sr_ObjectRef__f_elem;
      if ((x === (void 0))) {
        var newTextNode = new $c_Lcom_raquo_laminar_nodes_TextNode(renderable.asString__O__T(newValue));
        $m_Lcom_raquo_laminar_nodes_ParentNode$().replaceChild__Lcom_raquo_laminar_nodes_ParentNode__Lcom_raquo_laminar_nodes_ChildNode__Lcom_raquo_laminar_nodes_ChildNode__Z(ctx$1.Lcom_raquo_laminar_lifecycle_InsertContext__f_parentNode, ctx$1.Lcom_raquo_laminar_lifecycle_InsertContext__f_sentinelNode, newTextNode);
        var ev$2 = newTextNode;
        maybeTextNode.sr_ObjectRef__f_elem = ev$2;
        ev$2 = null;
        ctx$1.Lcom_raquo_laminar_lifecycle_InsertContext__f_sentinelNode = newTextNode;
        if (ctx$1.Lcom_raquo_laminar_lifecycle_InsertContext__f_strictMode) {
          ctx$1.Lcom_raquo_laminar_lifecycle_InsertContext__f_strictMode = false;
          ctx$1.removeOldChildNodesFromDOM__Lcom_raquo_laminar_nodes_ChildNode__V(newTextNode);
          ctx$1.Lcom_raquo_laminar_lifecycle_InsertContext__f_extraNodesMap.clear();
          ctx$1.Lcom_raquo_laminar_lifecycle_InsertContext__f_extraNodes = $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$m_s_package$().s_package$__f_Nil;
          ctx$1.Lcom_raquo_laminar_lifecycle_InsertContext__f_extraNodeCount = 0
        }
      } else {
        var textNode = x;
        textNode.Lcom_raquo_laminar_nodes_TextNode__f_ref.textContent = renderable.asString__O__T(newValue)
      }
    }));
    return $f_Lcom_raquo_airstream_core_BaseObservable__foreach__F1__Lcom_raquo_airstream_ownership_Owner__Lcom_raquo_airstream_ownership_Subscription(textSource, onNext, owner$1)
  })))
});
var $d_Lcom_raquo_laminar_modifiers_ChildTextInserter$ = new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$TypeData().initClass({
  Lcom_raquo_laminar_modifiers_ChildTextInserter$: 0
}, false, "com.raquo.laminar.modifiers.ChildTextInserter$", {
  Lcom_raquo_laminar_modifiers_ChildTextInserter$: 1,
  O: 1
});
$c_Lcom_raquo_laminar_modifiers_ChildTextInserter$.prototype.$classData = $d_Lcom_raquo_laminar_modifiers_ChildTextInserter$;
var $n_Lcom_raquo_laminar_modifiers_ChildTextInserter$;
function $m_Lcom_raquo_laminar_modifiers_ChildTextInserter$() {
  if ((!$n_Lcom_raquo_laminar_modifiers_ChildTextInserter$)) {
    $n_Lcom_raquo_laminar_modifiers_ChildTextInserter$ = new $c_Lcom_raquo_laminar_modifiers_ChildTextInserter$()
  };
  return $n_Lcom_raquo_laminar_modifiers_ChildTextInserter$
}
function $p_Lcom_raquo_laminar_modifiers_ChildrenInserter$__updateChildren__Lcom_raquo_ew_JsMap__sci_Seq__Lcom_raquo_ew_JsMap__Lcom_raquo_laminar_nodes_ReactiveElement__Lcom_raquo_laminar_nodes_ChildNode__I__I($thiz, prevChildren, nextChildren, nextChildrenMap, parentNode, sentinelNode, prevChildrenCount) {
  var index = new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$c_sr_IntRef(0);
  var currentChildrenCount = new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$c_sr_IntRef(prevChildrenCount);
  var elem = sentinelNode.ref__Lorg_scalajs_dom_Node().nextSibling;
  var prevChildRef = new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$c_sr_ObjectRef(elem);
  var lastIndexChild = new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$c_sr_ObjectRef(sentinelNode);
  nextChildren.foreach__F1__V(new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$c_sjsr_AnonFunction1(((nextChild) => {
    var nextChild$1 = nextChild;
    if ((currentChildrenCount.sr_IntRef__f_elem <= index.sr_IntRef__f_elem)) {
      $m_Lcom_raquo_laminar_nodes_ParentNode$().insertChildAfter__Lcom_raquo_laminar_nodes_ParentNode__Lcom_raquo_laminar_nodes_ChildNode__Lcom_raquo_laminar_nodes_ChildNode__Z(parentNode, nextChild$1, lastIndexChild.sr_ObjectRef__f_elem);
      var ev$3 = nextChild$1.ref__Lorg_scalajs_dom_Node();
      prevChildRef.sr_ObjectRef__f_elem = ev$3;
      ev$3 = null;
      var ev$4 = ((1 + currentChildrenCount.sr_IntRef__f_elem) | 0);
      currentChildrenCount.sr_IntRef__f_elem = ev$4
    } else {
      var x = nextChild$1.ref__Lorg_scalajs_dom_Node();
      var y = prevChildRef.sr_ObjectRef__f_elem;
      if ((!$j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$m_sr_BoxesRunTime$().equals__O__O__Z(x, y))) {
        if ((!(!(!prevChildren.has(nextChild$1.ref__Lorg_scalajs_dom_Node()))))) {
          $m_Lcom_raquo_laminar_nodes_ParentNode$().insertChildAfter__Lcom_raquo_laminar_nodes_ParentNode__Lcom_raquo_laminar_nodes_ChildNode__Lcom_raquo_laminar_nodes_ChildNode__Z(parentNode, nextChild$1, lastIndexChild.sr_ObjectRef__f_elem);
          var ev$5 = nextChild$1.ref__Lorg_scalajs_dom_Node();
          prevChildRef.sr_ObjectRef__f_elem = ev$5;
          ev$5 = null;
          var ev$6 = ((1 + currentChildrenCount.sr_IntRef__f_elem) | 0);
          currentChildrenCount.sr_IntRef__f_elem = ev$6
        } else {
          while (true) {
            var x$1 = nextChild$1.ref__Lorg_scalajs_dom_Node();
            var y$1 = prevChildRef.sr_ObjectRef__f_elem;
            if (((!$j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$m_sr_BoxesRunTime$().equals__O__O__Z(x$1, y$1)) && (!$p_Lcom_raquo_laminar_modifiers_ChildrenInserter$__containsRef__Lcom_raquo_ew_JsMap__Lorg_scalajs_dom_Node__Z($thiz, nextChildrenMap, prevChildRef.sr_ObjectRef__f_elem)))) {
              var nextPrevChildRef = prevChildRef.sr_ObjectRef__f_elem.nextSibling;
              var prevChild = $p_Lcom_raquo_laminar_modifiers_ChildrenInserter$__prevChildFromRef__Lcom_raquo_ew_JsMap__Lorg_scalajs_dom_Node__Lcom_raquo_laminar_nodes_ChildNode($thiz, prevChildren, prevChildRef.sr_ObjectRef__f_elem);
              $m_Lcom_raquo_laminar_nodes_ParentNode$().removeChild__Lcom_raquo_laminar_nodes_ParentNode__Lcom_raquo_laminar_nodes_ChildNode__Z(parentNode, prevChild);
              var ev$7 = nextPrevChildRef;
              prevChildRef.sr_ObjectRef__f_elem = ev$7;
              ev$7 = null;
              var ev$8 = (((-1) + currentChildrenCount.sr_IntRef__f_elem) | 0);
              currentChildrenCount.sr_IntRef__f_elem = ev$8
            } else {
              break
            }
          };
          var x$2 = nextChild$1.ref__Lorg_scalajs_dom_Node();
          var y$2 = prevChildRef.sr_ObjectRef__f_elem;
          if ((!$j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$m_sr_BoxesRunTime$().equals__O__O__Z(x$2, y$2))) {
            $m_Lcom_raquo_laminar_nodes_ParentNode$().insertChildAfter__Lcom_raquo_laminar_nodes_ParentNode__Lcom_raquo_laminar_nodes_ChildNode__Lcom_raquo_laminar_nodes_ChildNode__Z(parentNode, nextChild$1, lastIndexChild.sr_ObjectRef__f_elem);
            var ev$9 = nextChild$1.ref__Lorg_scalajs_dom_Node();
            prevChildRef.sr_ObjectRef__f_elem = ev$9;
            ev$9 = null
          }
        }
      }
    };
    if ((prevChildRef.sr_ObjectRef__f_elem.nextSibling === null)) {
      var ev$10 = ((1 + index.sr_IntRef__f_elem) | 0);
      currentChildrenCount.sr_IntRef__f_elem = ev$10
    } else {
      var ev$11 = prevChildRef.sr_ObjectRef__f_elem.nextSibling;
      prevChildRef.sr_ObjectRef__f_elem = ev$11;
      ev$11 = null
    };
    var ev$12 = nextChild$1;
    lastIndexChild.sr_ObjectRef__f_elem = ev$12;
    ev$12 = null;
    var ev$13 = ((1 + index.sr_IntRef__f_elem) | 0);
    index.sr_IntRef__f_elem = ev$13
  })));
  while ((index.sr_IntRef__f_elem < currentChildrenCount.sr_IntRef__f_elem)) {
    var nextPrevChildRef$1 = prevChildRef.sr_ObjectRef__f_elem.nextSibling;
    var prevChild$1 = $p_Lcom_raquo_laminar_modifiers_ChildrenInserter$__prevChildFromRef__Lcom_raquo_ew_JsMap__Lorg_scalajs_dom_Node__Lcom_raquo_laminar_nodes_ChildNode($thiz, prevChildren, prevChildRef.sr_ObjectRef__f_elem);
    $m_Lcom_raquo_laminar_nodes_ParentNode$().removeChild__Lcom_raquo_laminar_nodes_ParentNode__Lcom_raquo_laminar_nodes_ChildNode__Z(parentNode, prevChild$1);
    var ev$14 = nextPrevChildRef$1;
    prevChildRef.sr_ObjectRef__f_elem = ev$14;
    ev$14 = null;
    var ev$15 = (((-1) + currentChildrenCount.sr_IntRef__f_elem) | 0);
    currentChildrenCount.sr_IntRef__f_elem = ev$15
  };
  return currentChildrenCount.sr_IntRef__f_elem
}
function $p_Lcom_raquo_laminar_modifiers_ChildrenInserter$__containsRef__Lcom_raquo_ew_JsMap__Lorg_scalajs_dom_Node__Z($thiz, nextChildrenMap, ref) {
  return (!(!nextChildrenMap.has(ref)))
}
function $p_Lcom_raquo_laminar_modifiers_ChildrenInserter$__prevChildFromRef__Lcom_raquo_ew_JsMap__Lorg_scalajs_dom_Node__Lcom_raquo_laminar_nodes_ChildNode($thiz, prevChildren, ref) {
  var x = prevChildren.get(ref);
  if ((x === (void 0))) {
    throw $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$ct_jl_Exception__T__(new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$c_jl_Exception(), ("prevChildFromRef[children]: not found for " + ref))
  };
  return x
}
/** @constructor */
function $c_Lcom_raquo_laminar_modifiers_ChildrenInserter$() {
  /*<skip>*/
}
$c_Lcom_raquo_laminar_modifiers_ChildrenInserter$.prototype = new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$h_O();
$c_Lcom_raquo_laminar_modifiers_ChildrenInserter$.prototype.constructor = $c_Lcom_raquo_laminar_modifiers_ChildrenInserter$;
/** @constructor */
function $h_Lcom_raquo_laminar_modifiers_ChildrenInserter$() {
  /*<skip>*/
}
$h_Lcom_raquo_laminar_modifiers_ChildrenInserter$.prototype = $c_Lcom_raquo_laminar_modifiers_ChildrenInserter$.prototype;
$c_Lcom_raquo_laminar_modifiers_ChildrenInserter$.prototype.apply__Lcom_raquo_airstream_core_Observable__Lcom_raquo_laminar_modifiers_RenderableNode__Lcom_raquo_laminar_modifiers_Inserter = (function(childrenSource, renderableNode) {
  return new $c_Lcom_raquo_laminar_modifiers_Inserter($j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$m_s_None$(), true, new $c_sjsr_AnonFunction2(((ctx, owner) => {
    var ctx$1 = ctx;
    var owner$1 = owner;
    if ((!ctx$1.Lcom_raquo_laminar_lifecycle_InsertContext__f_strictMode)) {
      ctx$1.forceSetStrictMode__V()
    };
    var elem = ctx$1.Lcom_raquo_laminar_lifecycle_InsertContext__f_extraNodes;
    var maybeLastSeenChildren = new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$c_sr_ObjectRef(elem);
    var onNext = new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$c_sjsr_AnonFunction1(((components) => {
      var components$1 = components;
      var newChildren = renderableNode.asNodeSeq__sci_Seq__sci_Seq(components$1);
      var ev$2 = newChildren;
      maybeLastSeenChildren.sr_ObjectRef__f_elem = ev$2;
      ev$2 = null;
      var newChildrenMap = $m_Lcom_raquo_laminar_lifecycle_InsertContext$().nodesToMap__sci_Seq__Lcom_raquo_ew_JsMap(newChildren);
      ctx$1.Lcom_raquo_laminar_lifecycle_InsertContext__f_extraNodeCount = $p_Lcom_raquo_laminar_modifiers_ChildrenInserter$__updateChildren__Lcom_raquo_ew_JsMap__sci_Seq__Lcom_raquo_ew_JsMap__Lcom_raquo_laminar_nodes_ReactiveElement__Lcom_raquo_laminar_nodes_ChildNode__I__I(this, ctx$1.Lcom_raquo_laminar_lifecycle_InsertContext__f_extraNodesMap, newChildren, newChildrenMap, ctx$1.Lcom_raquo_laminar_lifecycle_InsertContext__f_parentNode, ctx$1.Lcom_raquo_laminar_lifecycle_InsertContext__f_sentinelNode, ctx$1.Lcom_raquo_laminar_lifecycle_InsertContext__f_extraNodeCount);
      ctx$1.Lcom_raquo_laminar_lifecycle_InsertContext__f_extraNodes = newChildren;
      ctx$1.Lcom_raquo_laminar_lifecycle_InsertContext__f_extraNodesMap = newChildrenMap
    }));
    return $f_Lcom_raquo_airstream_core_BaseObservable__foreach__F1__Lcom_raquo_airstream_ownership_Owner__Lcom_raquo_airstream_ownership_Subscription(childrenSource, onNext, owner$1)
  })))
});
var $d_Lcom_raquo_laminar_modifiers_ChildrenInserter$ = new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$TypeData().initClass({
  Lcom_raquo_laminar_modifiers_ChildrenInserter$: 0
}, false, "com.raquo.laminar.modifiers.ChildrenInserter$", {
  Lcom_raquo_laminar_modifiers_ChildrenInserter$: 1,
  O: 1
});
$c_Lcom_raquo_laminar_modifiers_ChildrenInserter$.prototype.$classData = $d_Lcom_raquo_laminar_modifiers_ChildrenInserter$;
var $n_Lcom_raquo_laminar_modifiers_ChildrenInserter$;
function $m_Lcom_raquo_laminar_modifiers_ChildrenInserter$() {
  if ((!$n_Lcom_raquo_laminar_modifiers_ChildrenInserter$)) {
    $n_Lcom_raquo_laminar_modifiers_ChildrenInserter$ = new $c_Lcom_raquo_laminar_modifiers_ChildrenInserter$()
  };
  return $n_Lcom_raquo_laminar_modifiers_ChildrenInserter$
}
function $is_Lcom_raquo_laminar_modifiers_Modifier(obj) {
  return (!(!((obj && obj.$classData) && obj.$classData.ancestors.Lcom_raquo_laminar_modifiers_Modifier)))
}
function $isArrayOf_Lcom_raquo_laminar_modifiers_Modifier(obj, depth) {
  return (!(!(((obj && obj.$classData) && (obj.$classData.arrayDepth === depth)) && obj.$classData.arrayBase.ancestors.Lcom_raquo_laminar_modifiers_Modifier)))
}
var $d_Lcom_raquo_laminar_modifiers_Modifier = new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$TypeData().initClass({
  Lcom_raquo_laminar_modifiers_Modifier: 0
}, true, "com.raquo.laminar.modifiers.Modifier", {
  Lcom_raquo_laminar_modifiers_Modifier: 1,
  O: 1
});
/** @constructor */
function $c_Lcom_raquo_laminar_modifiers_Modifier$() {
  this.Lcom_raquo_laminar_modifiers_Modifier$__f_empty = null;
  $n_Lcom_raquo_laminar_modifiers_Modifier$ = this;
  this.Lcom_raquo_laminar_modifiers_Modifier$__f_empty = new $c_Lcom_raquo_laminar_modifiers_Modifier$$anon$1()
}
$c_Lcom_raquo_laminar_modifiers_Modifier$.prototype = new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$h_O();
$c_Lcom_raquo_laminar_modifiers_Modifier$.prototype.constructor = $c_Lcom_raquo_laminar_modifiers_Modifier$;
/** @constructor */
function $h_Lcom_raquo_laminar_modifiers_Modifier$() {
  /*<skip>*/
}
$h_Lcom_raquo_laminar_modifiers_Modifier$.prototype = $c_Lcom_raquo_laminar_modifiers_Modifier$.prototype;
var $d_Lcom_raquo_laminar_modifiers_Modifier$ = new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$TypeData().initClass({
  Lcom_raquo_laminar_modifiers_Modifier$: 0
}, false, "com.raquo.laminar.modifiers.Modifier$", {
  Lcom_raquo_laminar_modifiers_Modifier$: 1,
  O: 1
});
$c_Lcom_raquo_laminar_modifiers_Modifier$.prototype.$classData = $d_Lcom_raquo_laminar_modifiers_Modifier$;
var $n_Lcom_raquo_laminar_modifiers_Modifier$;
function $m_Lcom_raquo_laminar_modifiers_Modifier$() {
  if ((!$n_Lcom_raquo_laminar_modifiers_Modifier$)) {
    $n_Lcom_raquo_laminar_modifiers_Modifier$ = new $c_Lcom_raquo_laminar_modifiers_Modifier$()
  };
  return $n_Lcom_raquo_laminar_modifiers_Modifier$
}
/** @constructor */
function $c_Lcom_raquo_laminar_modifiers_RenderableNode$() {
  this.Lcom_raquo_laminar_modifiers_RenderableNode$__f_nodeRenderable = null;
  $n_Lcom_raquo_laminar_modifiers_RenderableNode$ = this;
  $m_Lcom_raquo_laminar_modifiers_RenderableNode$();
  var renderNode = new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$c_sjsr_AnonFunction1(((x) => {
    var x$1 = x;
    return x$1
  }));
  var renderNodeSeq = new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$c_sjsr_AnonFunction1(((x$2) => {
    var x$3 = x$2;
    return x$3
  }));
  var renderNodeIterable = new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$c_sjsr_AnonFunction1(((x$3$1) => {
    var x$4 = x$3$1;
    return x$4
  }));
  var renderNodeOption = new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$c_sjsr_AnonFunction1(((x$4$1) => {
    var x$5 = x$4$1;
    return x$5
  }));
  this.Lcom_raquo_laminar_modifiers_RenderableNode$__f_nodeRenderable = new $c_Lcom_raquo_laminar_modifiers_RenderableNode$$anon$1(renderNode, renderNodeSeq, renderNodeIterable, renderNodeOption)
}
$c_Lcom_raquo_laminar_modifiers_RenderableNode$.prototype = new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$h_O();
$c_Lcom_raquo_laminar_modifiers_RenderableNode$.prototype.constructor = $c_Lcom_raquo_laminar_modifiers_RenderableNode$;
/** @constructor */
function $h_Lcom_raquo_laminar_modifiers_RenderableNode$() {
  /*<skip>*/
}
$h_Lcom_raquo_laminar_modifiers_RenderableNode$.prototype = $c_Lcom_raquo_laminar_modifiers_RenderableNode$.prototype;
var $d_Lcom_raquo_laminar_modifiers_RenderableNode$ = new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$TypeData().initClass({
  Lcom_raquo_laminar_modifiers_RenderableNode$: 0
}, false, "com.raquo.laminar.modifiers.RenderableNode$", {
  Lcom_raquo_laminar_modifiers_RenderableNode$: 1,
  O: 1
});
$c_Lcom_raquo_laminar_modifiers_RenderableNode$.prototype.$classData = $d_Lcom_raquo_laminar_modifiers_RenderableNode$;
var $n_Lcom_raquo_laminar_modifiers_RenderableNode$;
function $m_Lcom_raquo_laminar_modifiers_RenderableNode$() {
  if ((!$n_Lcom_raquo_laminar_modifiers_RenderableNode$)) {
    $n_Lcom_raquo_laminar_modifiers_RenderableNode$ = new $c_Lcom_raquo_laminar_modifiers_RenderableNode$()
  };
  return $n_Lcom_raquo_laminar_modifiers_RenderableNode$
}
/** @constructor */
function $c_Lcom_raquo_laminar_modifiers_RenderableText$() {
  this.Lcom_raquo_laminar_modifiers_RenderableText$__f_stringRenderable = null;
  $n_Lcom_raquo_laminar_modifiers_RenderableText$ = this;
  $m_Lcom_raquo_laminar_modifiers_RenderableText$();
  var render = new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$c_sjsr_AnonFunction1(((x) => {
    var x$1 = x;
    return x$1
  }));
  this.Lcom_raquo_laminar_modifiers_RenderableText$__f_stringRenderable = new $c_Lcom_raquo_laminar_modifiers_RenderableText$$anon$1(render);
  $m_Lcom_raquo_laminar_modifiers_RenderableText$();
  var render$1 = new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$c_sjsr_AnonFunction1(((_$1) => {
    var _$1$1 = (_$1 | 0);
    return ("" + _$1$1)
  }));
  new $c_Lcom_raquo_laminar_modifiers_RenderableText$$anon$1(render$1);
  $m_Lcom_raquo_laminar_modifiers_RenderableText$();
  var render$2 = new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$c_sjsr_AnonFunction1(((_$2) => {
    var _$2$1 = (+_$2);
    return ("" + _$2$1)
  }));
  new $c_Lcom_raquo_laminar_modifiers_RenderableText$$anon$1(render$2);
  $m_Lcom_raquo_laminar_modifiers_RenderableText$();
  var render$3 = new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$c_sjsr_AnonFunction1(((_$3) => {
    var _$3$1 = (!(!_$3));
    return ("" + _$3$1)
  }));
  new $c_Lcom_raquo_laminar_modifiers_RenderableText$$anon$1(render$3);
  $m_Lcom_raquo_laminar_modifiers_RenderableText$();
  var render$4 = new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$c_sjsr_AnonFunction1(((_$4) => {
    var _$4$1 = _$4;
    return _$4$1.text__T()
  }));
  new $c_Lcom_raquo_laminar_modifiers_RenderableText$$anon$1(render$4)
}
$c_Lcom_raquo_laminar_modifiers_RenderableText$.prototype = new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$h_O();
$c_Lcom_raquo_laminar_modifiers_RenderableText$.prototype.constructor = $c_Lcom_raquo_laminar_modifiers_RenderableText$;
/** @constructor */
function $h_Lcom_raquo_laminar_modifiers_RenderableText$() {
  /*<skip>*/
}
$h_Lcom_raquo_laminar_modifiers_RenderableText$.prototype = $c_Lcom_raquo_laminar_modifiers_RenderableText$.prototype;
var $d_Lcom_raquo_laminar_modifiers_RenderableText$ = new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$TypeData().initClass({
  Lcom_raquo_laminar_modifiers_RenderableText$: 0
}, false, "com.raquo.laminar.modifiers.RenderableText$", {
  Lcom_raquo_laminar_modifiers_RenderableText$: 1,
  O: 1
});
$c_Lcom_raquo_laminar_modifiers_RenderableText$.prototype.$classData = $d_Lcom_raquo_laminar_modifiers_RenderableText$;
var $n_Lcom_raquo_laminar_modifiers_RenderableText$;
function $m_Lcom_raquo_laminar_modifiers_RenderableText$() {
  if ((!$n_Lcom_raquo_laminar_modifiers_RenderableText$)) {
    $n_Lcom_raquo_laminar_modifiers_RenderableText$ = new $c_Lcom_raquo_laminar_modifiers_RenderableText$()
  };
  return $n_Lcom_raquo_laminar_modifiers_RenderableText$
}
/** @constructor */
function $c_Lcom_raquo_laminar_modifiers_Setter$() {
  $n_Lcom_raquo_laminar_modifiers_Setter$ = this;
  new $c_Lcom_raquo_laminar_modifiers_Setter$$anon$1()
}
$c_Lcom_raquo_laminar_modifiers_Setter$.prototype = new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$h_O();
$c_Lcom_raquo_laminar_modifiers_Setter$.prototype.constructor = $c_Lcom_raquo_laminar_modifiers_Setter$;
/** @constructor */
function $h_Lcom_raquo_laminar_modifiers_Setter$() {
  /*<skip>*/
}
$h_Lcom_raquo_laminar_modifiers_Setter$.prototype = $c_Lcom_raquo_laminar_modifiers_Setter$.prototype;
var $d_Lcom_raquo_laminar_modifiers_Setter$ = new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$TypeData().initClass({
  Lcom_raquo_laminar_modifiers_Setter$: 0
}, false, "com.raquo.laminar.modifiers.Setter$", {
  Lcom_raquo_laminar_modifiers_Setter$: 1,
  O: 1
});
$c_Lcom_raquo_laminar_modifiers_Setter$.prototype.$classData = $d_Lcom_raquo_laminar_modifiers_Setter$;
var $n_Lcom_raquo_laminar_modifiers_Setter$;
function $m_Lcom_raquo_laminar_modifiers_Setter$() {
  if ((!$n_Lcom_raquo_laminar_modifiers_Setter$)) {
    $n_Lcom_raquo_laminar_modifiers_Setter$ = new $c_Lcom_raquo_laminar_modifiers_Setter$()
  };
  return $n_Lcom_raquo_laminar_modifiers_Setter$
}
/** @constructor */
function $c_Lcom_raquo_laminar_nodes_ParentNode$() {
  /*<skip>*/
}
$c_Lcom_raquo_laminar_nodes_ParentNode$.prototype = new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$h_O();
$c_Lcom_raquo_laminar_nodes_ParentNode$.prototype.constructor = $c_Lcom_raquo_laminar_nodes_ParentNode$;
/** @constructor */
function $h_Lcom_raquo_laminar_nodes_ParentNode$() {
  /*<skip>*/
}
$h_Lcom_raquo_laminar_nodes_ParentNode$.prototype = $c_Lcom_raquo_laminar_nodes_ParentNode$.prototype;
$c_Lcom_raquo_laminar_nodes_ParentNode$.prototype.appendChild__Lcom_raquo_laminar_nodes_ParentNode__Lcom_raquo_laminar_nodes_ChildNode__Z = (function(parent, child) {
  var nextParent = new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$c_s_Some(parent);
  child.willSetParent__s_Option__V(nextParent);
  var appended = $m_Lcom_raquo_laminar_DomApi$().appendChild__Lorg_scalajs_dom_Node__Lorg_scalajs_dom_Node__Z(parent.ref__Lorg_scalajs_dom_Node(), child.ref__Lorg_scalajs_dom_Node());
  if (appended) {
    child.setParent__s_Option__V(nextParent)
  };
  return appended
});
$c_Lcom_raquo_laminar_nodes_ParentNode$.prototype.removeChild__Lcom_raquo_laminar_nodes_ParentNode__Lcom_raquo_laminar_nodes_ChildNode__Z = (function(parent, child) {
  var removed = false;
  var x = child.ref__Lorg_scalajs_dom_Node().parentNode;
  var y = parent.ref__Lorg_scalajs_dom_Node();
  if ($j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$m_sr_BoxesRunTime$().equals__O__O__Z(x, y)) {
    child.willSetParent__s_Option__V($j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$m_s_None$());
    removed = $m_Lcom_raquo_laminar_DomApi$().removeChild__Lorg_scalajs_dom_Node__Lorg_scalajs_dom_Node__Z(parent.ref__Lorg_scalajs_dom_Node(), child.ref__Lorg_scalajs_dom_Node());
    child.setParent__s_Option__V($j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$m_s_None$())
  };
  return removed
});
$c_Lcom_raquo_laminar_nodes_ParentNode$.prototype.insertChildAfter__Lcom_raquo_laminar_nodes_ParentNode__Lcom_raquo_laminar_nodes_ChildNode__Lcom_raquo_laminar_nodes_ChildNode__Z = (function(parent, newChild, referenceChild) {
  var nextParent = new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$c_s_Some(parent);
  newChild.willSetParent__s_Option__V(nextParent);
  var inserted = $m_Lcom_raquo_laminar_DomApi$().insertAfter__Lorg_scalajs_dom_Node__Lorg_scalajs_dom_Node__Lorg_scalajs_dom_Node__Z(parent.ref__Lorg_scalajs_dom_Node(), newChild.ref__Lorg_scalajs_dom_Node(), referenceChild.ref__Lorg_scalajs_dom_Node());
  newChild.setParent__s_Option__V(nextParent);
  return inserted
});
$c_Lcom_raquo_laminar_nodes_ParentNode$.prototype.replaceChild__Lcom_raquo_laminar_nodes_ParentNode__Lcom_raquo_laminar_nodes_ChildNode__Lcom_raquo_laminar_nodes_ChildNode__Z = (function(parent, oldChild, newChild) {
  var replaced = false;
  if ((oldChild !== newChild)) {
    if (oldChild.com$raquo$laminar$nodes$ChildNode$$_maybeParent__s_Option().contains__O__Z(parent)) {
      var newChildNextParent = new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$c_s_Some(parent);
      oldChild.willSetParent__s_Option__V($j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$m_s_None$());
      newChild.willSetParent__s_Option__V(newChildNextParent);
      replaced = $m_Lcom_raquo_laminar_DomApi$().replaceChild__Lorg_scalajs_dom_Node__Lorg_scalajs_dom_Node__Lorg_scalajs_dom_Node__Z(parent.ref__Lorg_scalajs_dom_Node(), newChild.ref__Lorg_scalajs_dom_Node(), oldChild.ref__Lorg_scalajs_dom_Node());
      if (replaced) {
        oldChild.setParent__s_Option__V($j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$m_s_None$());
        newChild.setParent__s_Option__V(newChildNextParent)
      }
    }
  };
  return replaced
});
var $d_Lcom_raquo_laminar_nodes_ParentNode$ = new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$TypeData().initClass({
  Lcom_raquo_laminar_nodes_ParentNode$: 0
}, false, "com.raquo.laminar.nodes.ParentNode$", {
  Lcom_raquo_laminar_nodes_ParentNode$: 1,
  O: 1
});
$c_Lcom_raquo_laminar_nodes_ParentNode$.prototype.$classData = $d_Lcom_raquo_laminar_nodes_ParentNode$;
var $n_Lcom_raquo_laminar_nodes_ParentNode$;
function $m_Lcom_raquo_laminar_nodes_ParentNode$() {
  if ((!$n_Lcom_raquo_laminar_nodes_ParentNode$)) {
    $n_Lcom_raquo_laminar_nodes_ParentNode$ = new $c_Lcom_raquo_laminar_nodes_ParentNode$()
  };
  return $n_Lcom_raquo_laminar_nodes_ParentNode$
}
/** @constructor */
function $c_Lcom_raquo_laminar_nodes_ReactiveElement$() {
  /*<skip>*/
}
$c_Lcom_raquo_laminar_nodes_ReactiveElement$.prototype = new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$h_O();
$c_Lcom_raquo_laminar_nodes_ReactiveElement$.prototype.constructor = $c_Lcom_raquo_laminar_nodes_ReactiveElement$;
/** @constructor */
function $h_Lcom_raquo_laminar_nodes_ReactiveElement$() {
  /*<skip>*/
}
$h_Lcom_raquo_laminar_nodes_ReactiveElement$.prototype = $c_Lcom_raquo_laminar_nodes_ReactiveElement$.prototype;
$c_Lcom_raquo_laminar_nodes_ReactiveElement$.prototype.unsafeBindPrependSubscription__Lcom_raquo_laminar_nodes_ReactiveElement__F1__Lcom_raquo_airstream_ownership_DynamicSubscription = (function(element, subscribe) {
  return $m_Lcom_raquo_airstream_ownership_DynamicSubscription$().unsafe__Lcom_raquo_airstream_ownership_DynamicOwner__F1__Z__Lcom_raquo_airstream_ownership_DynamicSubscription(element.Lcom_raquo_laminar_nodes_ReactiveHtmlElement__f_dynamicOwner, new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$c_sjsr_AnonFunction1(((owner) => {
    var owner$1 = owner;
    return subscribe.apply__O__O(new $c_Lcom_raquo_laminar_lifecycle_MountContext(element, owner$1))
  })), true)
});
var $d_Lcom_raquo_laminar_nodes_ReactiveElement$ = new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$TypeData().initClass({
  Lcom_raquo_laminar_nodes_ReactiveElement$: 0
}, false, "com.raquo.laminar.nodes.ReactiveElement$", {
  Lcom_raquo_laminar_nodes_ReactiveElement$: 1,
  O: 1
});
$c_Lcom_raquo_laminar_nodes_ReactiveElement$.prototype.$classData = $d_Lcom_raquo_laminar_nodes_ReactiveElement$;
var $n_Lcom_raquo_laminar_nodes_ReactiveElement$;
function $m_Lcom_raquo_laminar_nodes_ReactiveElement$() {
  if ((!$n_Lcom_raquo_laminar_nodes_ReactiveElement$)) {
    $n_Lcom_raquo_laminar_nodes_ReactiveElement$ = new $c_Lcom_raquo_laminar_nodes_ReactiveElement$()
  };
  return $n_Lcom_raquo_laminar_nodes_ReactiveElement$
}
/** @constructor */
function $c_Lcom_raquo_laminar_receivers_ChildReceiver$() {
  this.Lcom_raquo_laminar_receivers_ChildReceiver$__f_text = null;
  $n_Lcom_raquo_laminar_receivers_ChildReceiver$ = this;
  this.Lcom_raquo_laminar_receivers_ChildReceiver$__f_text = $m_Lcom_raquo_laminar_receivers_ChildTextReceiver$()
}
$c_Lcom_raquo_laminar_receivers_ChildReceiver$.prototype = new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$h_O();
$c_Lcom_raquo_laminar_receivers_ChildReceiver$.prototype.constructor = $c_Lcom_raquo_laminar_receivers_ChildReceiver$;
/** @constructor */
function $h_Lcom_raquo_laminar_receivers_ChildReceiver$() {
  /*<skip>*/
}
$h_Lcom_raquo_laminar_receivers_ChildReceiver$.prototype = $c_Lcom_raquo_laminar_receivers_ChildReceiver$.prototype;
var $d_Lcom_raquo_laminar_receivers_ChildReceiver$ = new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$TypeData().initClass({
  Lcom_raquo_laminar_receivers_ChildReceiver$: 0
}, false, "com.raquo.laminar.receivers.ChildReceiver$", {
  Lcom_raquo_laminar_receivers_ChildReceiver$: 1,
  O: 1
});
$c_Lcom_raquo_laminar_receivers_ChildReceiver$.prototype.$classData = $d_Lcom_raquo_laminar_receivers_ChildReceiver$;
var $n_Lcom_raquo_laminar_receivers_ChildReceiver$;
function $m_Lcom_raquo_laminar_receivers_ChildReceiver$() {
  if ((!$n_Lcom_raquo_laminar_receivers_ChildReceiver$)) {
    $n_Lcom_raquo_laminar_receivers_ChildReceiver$ = new $c_Lcom_raquo_laminar_receivers_ChildReceiver$()
  };
  return $n_Lcom_raquo_laminar_receivers_ChildReceiver$
}
/** @constructor */
function $c_Lcom_raquo_laminar_receivers_ChildTextReceiver$() {
  /*<skip>*/
}
$c_Lcom_raquo_laminar_receivers_ChildTextReceiver$.prototype = new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$h_O();
$c_Lcom_raquo_laminar_receivers_ChildTextReceiver$.prototype.constructor = $c_Lcom_raquo_laminar_receivers_ChildTextReceiver$;
/** @constructor */
function $h_Lcom_raquo_laminar_receivers_ChildTextReceiver$() {
  /*<skip>*/
}
$h_Lcom_raquo_laminar_receivers_ChildTextReceiver$.prototype = $c_Lcom_raquo_laminar_receivers_ChildTextReceiver$.prototype;
var $d_Lcom_raquo_laminar_receivers_ChildTextReceiver$ = new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$TypeData().initClass({
  Lcom_raquo_laminar_receivers_ChildTextReceiver$: 0
}, false, "com.raquo.laminar.receivers.ChildTextReceiver$", {
  Lcom_raquo_laminar_receivers_ChildTextReceiver$: 1,
  O: 1
});
$c_Lcom_raquo_laminar_receivers_ChildTextReceiver$.prototype.$classData = $d_Lcom_raquo_laminar_receivers_ChildTextReceiver$;
var $n_Lcom_raquo_laminar_receivers_ChildTextReceiver$;
function $m_Lcom_raquo_laminar_receivers_ChildTextReceiver$() {
  if ((!$n_Lcom_raquo_laminar_receivers_ChildTextReceiver$)) {
    $n_Lcom_raquo_laminar_receivers_ChildTextReceiver$ = new $c_Lcom_raquo_laminar_receivers_ChildTextReceiver$()
  };
  return $n_Lcom_raquo_laminar_receivers_ChildTextReceiver$
}
/** @constructor */
function $c_Lcom_raquo_laminar_receivers_ChildrenReceiver$() {
  /*<skip>*/
}
$c_Lcom_raquo_laminar_receivers_ChildrenReceiver$.prototype = new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$h_O();
$c_Lcom_raquo_laminar_receivers_ChildrenReceiver$.prototype.constructor = $c_Lcom_raquo_laminar_receivers_ChildrenReceiver$;
/** @constructor */
function $h_Lcom_raquo_laminar_receivers_ChildrenReceiver$() {
  /*<skip>*/
}
$h_Lcom_raquo_laminar_receivers_ChildrenReceiver$.prototype = $c_Lcom_raquo_laminar_receivers_ChildrenReceiver$.prototype;
var $d_Lcom_raquo_laminar_receivers_ChildrenReceiver$ = new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$TypeData().initClass({
  Lcom_raquo_laminar_receivers_ChildrenReceiver$: 0
}, false, "com.raquo.laminar.receivers.ChildrenReceiver$", {
  Lcom_raquo_laminar_receivers_ChildrenReceiver$: 1,
  O: 1
});
$c_Lcom_raquo_laminar_receivers_ChildrenReceiver$.prototype.$classData = $d_Lcom_raquo_laminar_receivers_ChildrenReceiver$;
var $n_Lcom_raquo_laminar_receivers_ChildrenReceiver$;
function $m_Lcom_raquo_laminar_receivers_ChildrenReceiver$() {
  if ((!$n_Lcom_raquo_laminar_receivers_ChildrenReceiver$)) {
    $n_Lcom_raquo_laminar_receivers_ChildrenReceiver$ = new $c_Lcom_raquo_laminar_receivers_ChildrenReceiver$()
  };
  return $n_Lcom_raquo_laminar_receivers_ChildrenReceiver$
}
/** @constructor */
function $c_LdescompressZip_UploadZIp$() {
  /*<skip>*/
}
$c_LdescompressZip_UploadZIp$.prototype = new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$h_O();
$c_LdescompressZip_UploadZIp$.prototype.constructor = $c_LdescompressZip_UploadZIp$;
/** @constructor */
function $h_LdescompressZip_UploadZIp$() {
  /*<skip>*/
}
$h_LdescompressZip_UploadZIp$.prototype = $c_LdescompressZip_UploadZIp$.prototype;
$c_LdescompressZip_UploadZIp$.prototype.apply__Lcom_raquo_laminar_nodes_ReactiveHtmlElement = (function() {
  var allStagedFilesVar = $m_Lcom_raquo_laminar_api_package$().Lcom_raquo_laminar_api_package$__f_L.Lcom_raquo_laminar_api_package$$anon$1__f_Var.apply__O__Lcom_raquo_airstream_state_Var($j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$m_s_package$().s_package$__f_Nil);
  var mod = new $c_sjsr_AnonFunction2(((_$1, _$2) => {
    var _$1$1 = _$1;
    var _$2$1 = _$2;
    return _$1$1.appendedAll__sc_IterableOnce__sci_List(_$2$1)
  }));
  var newFilesArrivedObserver = $f_Lcom_raquo_airstream_state_Var__updater__F2__Lcom_raquo_airstream_core_Observer(allStagedFilesVar, mod);
  var this$3 = allStagedFilesVar.Lcom_raquo_airstream_state_SourceVar__f_signal;
  var project = new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$c_sjsr_AnonFunction1(((_$3) => {
    var _$3$1 = _$3;
    return _$3$1.length__I()
  }));
  var stagedFilesCount = new $c_Lcom_raquo_airstream_misc_MapSignal(this$3, project, $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$m_s_None$());
  var uploadAllBus = new $c_Lcom_raquo_airstream_eventbus_EventBus();
  var this$50 = $m_Lbe_doeraene_webcomponents_ui5_UploadCollection$();
  var $$x27 = $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$m_sr_ScalaRunTime$();
  var $$x13 = new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$c_sjsr_AnonFunction1(((_$4) => {
    var $$x26 = $m_Lbe_doeraene_webcomponents_ui5_UploadCollection$slots$().Lbe_doeraene_webcomponents_ui5_UploadCollection$slots$__f_header;
    var $$x25 = $m_Lcom_raquo_laminar_api_package$().Lcom_raquo_laminar_api_package$__f_L.div__Lcom_raquo_laminar_tags_HtmlTag();
    var $$x24 = $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$m_sr_ScalaRunTime$();
    var $$x23 = $m_Lbe_doeraene_webcomponents_ui5_Title$();
    var $$x22 = $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$m_sr_ScalaRunTime$();
    $m_Lcom_raquo_laminar_api_package$();
    var project$1 = new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$c_sjsr_AnonFunction1(((count) => {
      var count$1 = (count | 0);
      return (("Uploaded (" + count$1) + ")")
    }));
    var textSource = new $c_Lcom_raquo_airstream_misc_MapSignal(stagedFilesCount, project$1, $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$m_s_None$());
    var $$x21 = $$x23.h2__sci_Seq__Lcom_raquo_laminar_nodes_ReactiveHtmlElement($$x22.wrapRefArray__AO__sci_ArraySeq(new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$ac_O([$m_Lcom_raquo_laminar_modifiers_ChildTextInserter$().apply__Lcom_raquo_airstream_core_Observable__Lcom_raquo_laminar_modifiers_RenderableText__Lcom_raquo_laminar_modifiers_Inserter(textSource, $m_Lcom_raquo_laminar_modifiers_RenderableText$().Lcom_raquo_laminar_modifiers_RenderableText$__f_stringRenderable)])));
    var this$6 = $m_Lbe_doeraene_webcomponents_ui5_Label$();
    var $$x19 = $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$m_sr_ScalaRunTime$();
    var this$5 = $m_Lcom_raquo_laminar_api_package$().Lcom_raquo_laminar_api_package$__f_L;
    var renderable = $m_Lcom_raquo_laminar_modifiers_RenderableText$().Lcom_raquo_laminar_modifiers_RenderableText$__f_stringRenderable;
    var mods = $$x19.wrapRefArray__AO__sci_ArraySeq(new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$ac_O([$f_Lcom_raquo_laminar_Implicits__textToTextNode__O__Lcom_raquo_laminar_modifiers_RenderableText__Lcom_raquo_laminar_nodes_TextNode(this$5, "Add new files and press to start uploading pending files:", renderable)]));
    var $$x20 = $f_Lbe_doeraene_webcomponents_WebComponent__apply__sci_Seq__Lcom_raquo_laminar_nodes_ReactiveHtmlElement(this$6, mods);
    $m_Lcom_raquo_laminar_api_package$();
    var this$14 = allStagedFilesVar.Lcom_raquo_airstream_state_SourceVar__f_signal;
    var value = new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$c_sjsr_AnonFunction0((() => {
      var this$13 = $m_Lbe_doeraene_webcomponents_ui5_FileUploader$();
      var $$x17 = $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$m_sr_ScalaRunTime$();
      var $$x16 = new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$c_sjsr_AnonFunction1(((_$5) => {
        var _$5$1 = _$5;
        return _$5$1.hideInput__Lcom_raquo_laminar_keys_HtmlAttr().$colon$eq__O__Lcom_raquo_laminar_modifiers_KeySetter(true)
      }));
      var $$x15 = new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$c_sjsr_AnonFunction1(((_$6) => {
        var _$6$1 = _$6;
        return _$6$1.multiple__Lcom_raquo_laminar_keys_HtmlAttr().$colon$eq__O__Lcom_raquo_laminar_modifiers_KeySetter(true)
      }));
      var this$7 = $m_Lbe_doeraene_webcomponents_ui5_Button$();
      var mods$1 = $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$m_sr_ScalaRunTime$().wrapRefArray__AO__sci_ArraySeq(new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$ac_O([new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$c_sjsr_AnonFunction1(((_$7) => {
        var _$7$1 = _$7;
        return _$7$1.icon__Lcom_raquo_laminar_keys_HtmlAttr().$colon$eq__O__Lcom_raquo_laminar_modifiers_KeySetter($m_Lbe_doeraene_webcomponents_ui5_configkeys_IconName$().add__Lbe_doeraene_webcomponents_ui5_configkeys_IconName())
      })), new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$c_sjsr_AnonFunction1(((_$8) => {
        var _$8$1 = _$8;
        return _$8$1.design__Lcom_raquo_laminar_keys_HtmlAttr().$colon$eq__O__Lcom_raquo_laminar_modifiers_KeySetter($m_Lbe_doeraene_webcomponents_ui5_configkeys_ButtonDesign$Transparent$())
      }))]));
      var mods$2 = $$x17.wrapRefArray__AO__sci_ArraySeq(new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$ac_O([$$x16, $$x15, $f_Lbe_doeraene_webcomponents_WebComponent__apply__sci_Seq__Lcom_raquo_laminar_nodes_ReactiveHtmlElement(this$7, mods$1), new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$c_sjsr_AnonFunction1(((_$9) => {
        $m_Lcom_raquo_laminar_api_package$();
        var eventProp = $m_Lbe_doeraene_webcomponents_ui5_FileUploader$events$().Lbe_doeraene_webcomponents_ui5_FileUploader$events$__f_onChange;
        var this$12 = $m_Lcom_raquo_laminar_keys_EventProcessor$().empty__Lcom_raquo_laminar_keys_EventProp__Z__Z__Lcom_raquo_laminar_keys_EventProcessor(eventProp, false, false).map__F1__Lcom_raquo_laminar_keys_EventProcessor(new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$c_sjsr_AnonFunction1(((_$10) => {
          var this$11 = $m_Lbe_doeraene_webcomponents_ui5_FileUploader$RawElement$().files__Lbe_doeraene_webcomponents_ui5_FileUploader$RawElement__sci_List(_$10.target);
          var f = ((_$11) => {
            var y = new Date();
            return new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$c_T2(_$11, y)
          });
          if ((this$11 === $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$m_sci_Nil$())) {
            return $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$m_sci_Nil$()
          } else {
            var arg1 = this$11.head__O();
            var h = new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$c_sci_$colon$colon(f(arg1), $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$m_sci_Nil$());
            var t = h;
            var rest = this$11.tail__O();
            while ((rest !== $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$m_sci_Nil$())) {
              var arg1$1 = rest.head__O();
              var nx = new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$c_sci_$colon$colon(f(arg1$1), $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$m_sci_Nil$());
              t.sci_$colon$colon__f_next = nx;
              t = nx;
              rest = rest.tail__O()
            };
            return h
          }
        })));
        var onNext = new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$c_sjsr_AnonFunction1(((_$1$2) => {
          newFilesArrivedObserver.onNext__O__V(_$1$2)
        }));
        return new $c_Lcom_raquo_laminar_modifiers_EventListener(this$12, onNext)
      }))]));
      return $f_Lbe_doeraene_webcomponents_WebComponent__apply__sci_Seq__Lcom_raquo_laminar_nodes_ReactiveHtmlElement(this$13, mods$2)
    }));
    var childSource = $f_Lcom_raquo_airstream_core_BaseObservable__mapTo__F0__Lcom_raquo_airstream_core_Observable(this$14, value);
    var $$x18 = $m_Lcom_raquo_laminar_modifiers_ChildInserter$().apply__Lcom_raquo_airstream_core_Observable__Lcom_raquo_laminar_modifiers_RenderableNode__Lcom_raquo_laminar_modifiers_Inserter(childSource.toObservable__Lcom_raquo_airstream_core_Observable(), $m_Lcom_raquo_laminar_modifiers_RenderableNode$().Lcom_raquo_laminar_modifiers_RenderableNode$__f_nodeRenderable);
    var this$19 = $m_Lbe_doeraene_webcomponents_ui5_Button$();
    var $$x14 = $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$m_sr_ScalaRunTime$();
    var this$16 = $m_Lcom_raquo_laminar_api_package$().Lcom_raquo_laminar_api_package$__f_L;
    var renderable$1 = $m_Lcom_raquo_laminar_modifiers_RenderableText$().Lcom_raquo_laminar_modifiers_RenderableText$__f_stringRenderable;
    var mods$3 = $$x14.wrapRefArray__AO__sci_ArraySeq(new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$ac_O([$f_Lcom_raquo_laminar_Implicits__textToTextNode__O__Lcom_raquo_laminar_modifiers_RenderableText__Lcom_raquo_laminar_nodes_TextNode(this$16, "Upload all", renderable$1), new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$c_sjsr_AnonFunction1(((_$12) => {
      $m_Lcom_raquo_laminar_api_package$();
      var eventProp$1 = $m_Lbe_doeraene_webcomponents_ui5_Button$events$().Lbe_doeraene_webcomponents_ui5_Button$events$__f_onClick;
      var this$18 = $m_Lcom_raquo_laminar_keys_EventProcessor$().empty__Lcom_raquo_laminar_keys_EventProp__Z__Z__Lcom_raquo_laminar_keys_EventProcessor(eventProp$1, false, false).mapTo__F0__Lcom_raquo_laminar_keys_EventProcessor(new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$c_sjsr_AnonFunction0((() => (void 0))));
      var sink = uploadAllBus.Lcom_raquo_airstream_eventbus_EventBus__f_writer;
      var onNext$1 = new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$c_sjsr_AnonFunction1(((_$1$3) => {
        sink.onNext__O__V(_$1$3)
      }));
      return new $c_Lcom_raquo_laminar_modifiers_EventListener(this$18, onNext$1)
    }))]));
    return $$x26.$colon$eq__Lcom_raquo_laminar_nodes_ReactiveHtmlElement__Lcom_raquo_laminar_modifiers_Inserter($$x25.apply__sci_Seq__Lcom_raquo_laminar_nodes_ReactiveHtmlElement($$x24.wrapRefArray__AO__sci_ArraySeq(new ($d_Lcom_raquo_laminar_modifiers_Modifier.getArrayOf().constr)([$$x21, $$x20, $$x18, $f_Lbe_doeraene_webcomponents_WebComponent__apply__sci_Seq__Lcom_raquo_laminar_nodes_ReactiveHtmlElement(this$19, mods$3)]))))
  }));
  var $$x12 = new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$c_sjsr_AnonFunction1(((_$13) => {
    var _$13$1 = _$13;
    return _$13$1.mode__Lcom_raquo_laminar_keys_HtmlAttr().$colon$eq__O__Lcom_raquo_laminar_modifiers_KeySetter($m_Lbe_doeraene_webcomponents_ui5_configkeys_ListMode$Delete$())
  }));
  var $$x11 = new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$c_sjsr_AnonFunction1(((_$14) => {
    $m_Lcom_raquo_laminar_api_package$();
    var eventProp$2 = $m_Lbe_doeraene_webcomponents_ui5_UploadCollection$events$().Lbe_doeraene_webcomponents_ui5_UploadCollection$events$__f_onItemDelete;
    var this$26 = $m_Lcom_raquo_laminar_keys_EventProcessor$().empty__Lcom_raquo_laminar_keys_EventProp__Z__Z__Lcom_raquo_laminar_keys_EventProcessor(eventProp$2, false, false).map__F1__Lcom_raquo_laminar_keys_EventProcessor(new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$c_sjsr_AnonFunction1(((_$15) => {
      $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$m_sc_StringOps$();
      var dict = _$15.detail.item.dataset;
      if ((!(!(!$m_sjs_js_WrappedDictionary$Cache$().sjs_js_WrappedDictionary$Cache$__f_safeHasOwnProperty.call(dict, "index"))))) {
        throw $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$ct_ju_NoSuchElementException__T__(new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$c_ju_NoSuchElementException(), "key not found: index")
      };
      var x = dict.index;
      var this$25 = $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$m_jl_Integer$();
      return this$25.parseInt__T__I__I(x, 10)
    })));
    var mod$1 = new $c_sjsr_AnonFunction2(((_$16, _$17) => {
      var _$16$1 = _$16;
      var _$17$1 = (_$17 | 0);
      var other = $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$m_s_package$().s_package$__f_Nil;
      return $f_sci_StrictOptimizedSeqOps__patch__I__sc_IterableOnce__I__O(_$16$1, _$17$1, other, 1)
    }));
    var sink$1 = $f_Lcom_raquo_airstream_state_Var__updater__F2__Lcom_raquo_airstream_core_Observer(allStagedFilesVar, mod$1);
    var onNext$2 = new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$c_sjsr_AnonFunction1(((_$1$4) => {
      sink$1.onNext__O__V(_$1$4)
    }));
    return new $c_Lcom_raquo_laminar_modifiers_EventListener(this$26, onNext$2)
  }));
  $m_Lcom_raquo_laminar_api_package$();
  $m_Lcom_raquo_airstream_core_EventStream$();
  var stream = uploadAllBus.Lcom_raquo_airstream_eventbus_EventBus__f_events;
  var source = $m_Lcom_raquo_airstream_combine_generated_CombinableStream$().sample$extension__Lcom_raquo_airstream_core_EventStream__Lcom_raquo_airstream_core_Source$SignalSource__Lcom_raquo_airstream_core_EventStream(stream, allStagedFilesVar.Lcom_raquo_airstream_state_SourceVar__f_signal);
  var $$x10 = $m_Lcom_raquo_laminar_Implicits$RichSource$();
  var this$29 = $m_Lcom_raquo_laminar_api_package$().Lcom_raquo_laminar_api_package$__f_L.Lcom_raquo_laminar_api_package$$anon$1__f_Observer;
  var onNext$3 = new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$c_sjsr_AnonFunction1(((files) => {
    var files$1 = files;
    var these = files$1;
    while ((!these.isEmpty__Z())) {
      var arg1$2 = these.head__O();
      var x$1 = arg1$2;
      var file = x$1._1__O();
      var date = x$1._2__O();
      console.log("file prosecin -----> ");
      $m_LZipExample_ZipExample$().decompressFile__Lorg_scalajs_dom_File__s_concurrent_Future(file);
      console.log(file, date);
      these = these.tail__O()
    }
  }));
  var $$x9 = $$x10.$minus$minus$greater$extension__Lcom_raquo_airstream_core_Source__Lcom_raquo_airstream_core_Sink__Lcom_raquo_laminar_modifiers_Binder(source, this$29.withRecover__F1__s_PartialFunction__Z__Lcom_raquo_airstream_core_Observer(onNext$3, $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$m_s_PartialFunction$().s_PartialFunction$__f_empty_pf, true));
  $m_Lcom_raquo_laminar_api_package$();
  var this$40 = allStagedFilesVar.Lcom_raquo_airstream_state_SourceVar__f_signal;
  var project$2 = new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$c_sjsr_AnonFunction1(((_$18) => {
    var _$18$1 = _$18;
    var this$39 = $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$f_sc_StrictOptimizedIterableOps__zipWithIndex__O(_$18$1);
    var f$1 = ((x$1$1) => {
      var x$1$2 = x$1$1;
      if ((x$1$2 !== null)) {
        var x2 = x$1$2._1__O();
        if ((x2 !== null)) {
          var file$1 = x2._1__O();
          var selectedAt = x2._2__O();
          var index = (x$1$2._2__O() | 0);
          $m_Lbe_doeraene_webcomponents_ui5_UploadCollection$();
          var this$38 = $m_Lbe_doeraene_webcomponents_ui5_UploadCollectionItem$();
          var $$x4 = $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$m_sr_ScalaRunTime$();
          var $$x3 = new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$c_sjsr_AnonFunction1(((_$19) => {
            var _$19$1 = _$19;
            return _$19$1.fileName__Lcom_raquo_laminar_keys_HtmlAttr().$colon$eq__O__Lcom_raquo_laminar_modifiers_KeySetter(file$1.name)
          }));
          var $$x2 = new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$c_sjsr_AnonFunction1(((_$20) => {
            var _$20$1 = _$20;
            return _$20$1.fileNameClickable__Lcom_raquo_laminar_keys_HtmlAttr().$colon$eq__O__Lcom_raquo_laminar_modifiers_KeySetter(true)
          }));
          var this$31 = $m_Lcom_raquo_laminar_api_package$().Lcom_raquo_laminar_api_package$__f_L;
          var value$1 = ("Selected at: " + selectedAt);
          var renderable$2 = $m_Lcom_raquo_laminar_modifiers_RenderableText$().Lcom_raquo_laminar_modifiers_RenderableText$__f_stringRenderable;
          var $$x1 = $f_Lcom_raquo_laminar_Implicits__textToTextNode__O__Lcom_raquo_laminar_modifiers_RenderableText__Lcom_raquo_laminar_nodes_TextNode(this$31, value$1, renderable$2);
          var this$32 = $m_Lcom_raquo_laminar_api_package$().Lcom_raquo_laminar_api_package$__f_L;
          var mods$4 = $$x4.wrapRefArray__AO__sci_ArraySeq(new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$ac_O([$$x3, $$x2, $$x1, $f_Lcom_raquo_laminar_defs_complex_ComplexHtmlKeys__dataAttr__T__Lcom_raquo_laminar_keys_HtmlAttr(this$32, "index").$colon$eq__O__Lcom_raquo_laminar_modifiers_KeySetter(("" + index)), new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$c_sjsr_AnonFunction1(((_$21) => {
            var $$x8 = $m_Lbe_doeraene_webcomponents_ui5_UploadCollectionItem$slots$().Lbe_doeraene_webcomponents_ui5_UploadCollectionItem$slots$__f_thumbnail;
            var $$x7 = $m_Lcom_raquo_laminar_api_package$().Lcom_raquo_laminar_api_package$__f_L.img__Lcom_raquo_laminar_tags_HtmlTag();
            var $$x6 = $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$m_sr_ScalaRunTime$();
            var $$x5 = $m_Lcom_raquo_laminar_api_package$().Lcom_raquo_laminar_api_package$__f_L.src__Lcom_raquo_laminar_keys_HtmlAttr().$colon$eq__O__Lcom_raquo_laminar_modifiers_KeySetter("/home/dgc7/proyectos/scala/exercies/exmapledd/app/img/linux.png");
            var this$37 = $m_Lcom_raquo_laminar_api_package$().Lcom_raquo_laminar_api_package$__f_L;
            var makeModifier = new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$c_sjsr_AnonFunction1(((el) => {
              var el$1 = el;
              $m_Lcom_raquo_laminar_api_package$();
              var eventProp$3 = $m_Lcom_raquo_laminar_api_package$().Lcom_raquo_laminar_api_package$__f_L.onLoad__Lcom_raquo_laminar_keys_EventProp();
              var this$36 = $m_Lcom_raquo_laminar_keys_EventProcessor$().empty__Lcom_raquo_laminar_keys_EventProp__Z__Z__Lcom_raquo_laminar_keys_EventProcessor(eventProp$3, false, false);
              var this$35 = $m_Lcom_raquo_laminar_api_package$().Lcom_raquo_laminar_api_package$__f_L.Lcom_raquo_laminar_api_package$$anon$1__f_Observer;
              var onNext$4 = new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$c_sjsr_AnonFunction1(((_$22) => {
                URL.revokeObjectURL(el$1.Lcom_raquo_laminar_nodes_ReactiveHtmlElement__f_ref.src)
              }));
              var sink$2 = this$35.withRecover__F1__s_PartialFunction__Z__Lcom_raquo_airstream_core_Observer(onNext$4, $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$m_s_PartialFunction$().s_PartialFunction$__f_empty_pf, true);
              var onNext$5 = new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$c_sjsr_AnonFunction1(((_$1$5) => {
                sink$2.onNext__O__V(_$1$5)
              }));
              return new $c_Lcom_raquo_laminar_modifiers_EventListener(this$36, onNext$5)
            }));
            return $$x8.$colon$eq__Lcom_raquo_laminar_nodes_ReactiveHtmlElement__Lcom_raquo_laminar_modifiers_Inserter($$x7.apply__sci_Seq__Lcom_raquo_laminar_nodes_ReactiveHtmlElement($$x6.wrapRefArray__AO__sci_ArraySeq(new ($d_Lcom_raquo_laminar_modifiers_Modifier.getArrayOf().constr)([$$x5, $f_Lcom_raquo_laminar_api_Laminar__inContext__F1__Lcom_raquo_laminar_modifiers_Modifier(this$37, makeModifier)]))))
          }))]));
          return $f_Lbe_doeraene_webcomponents_WebComponent__apply__sci_Seq__Lcom_raquo_laminar_nodes_ReactiveHtmlElement(this$38, mods$4)
        }
      };
      throw new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$c_s_MatchError(x$1$2)
    });
    if ((this$39 === $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$m_sci_Nil$())) {
      return $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$m_sci_Nil$()
    } else {
      var arg1$3 = this$39.head__O();
      var h$1 = new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$c_sci_$colon$colon(f$1(arg1$3), $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$m_sci_Nil$());
      var t$1 = h$1;
      var rest$1 = this$39.tail__O();
      while ((rest$1 !== $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$m_sci_Nil$())) {
        var arg1$4 = rest$1.head__O();
        var nx$1 = new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$c_sci_$colon$colon(f$1(arg1$4), $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$m_sci_Nil$());
        t$1.sci_$colon$colon__f_next = nx$1;
        t$1 = nx$1;
        rest$1 = rest$1.tail__O()
      };
      return h$1
    }
  }));
  var childrenSource = new $c_Lcom_raquo_airstream_misc_MapSignal(this$40, project$2, $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$m_s_None$());
  var mods$5 = $$x27.wrapRefArray__AO__sci_ArraySeq(new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$ac_O([$$x13, $$x12, $$x11, $$x9, $m_Lcom_raquo_laminar_modifiers_ChildrenInserter$().apply__Lcom_raquo_airstream_core_Observable__Lcom_raquo_laminar_modifiers_RenderableNode__Lcom_raquo_laminar_modifiers_Inserter(childrenSource, $m_Lcom_raquo_laminar_modifiers_RenderableNode$().Lcom_raquo_laminar_modifiers_RenderableNode$__f_nodeRenderable), new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$c_sjsr_AnonFunction1(((_$23) => {
    $m_Lcom_raquo_laminar_api_package$();
    var eventProp$4 = $m_Lbe_doeraene_webcomponents_ui5_UploadCollection$events$().Lbe_doeraene_webcomponents_ui5_UploadCollection$events$__f_onDrop;
    var this$49 = $m_Lcom_raquo_laminar_keys_EventProcessor$().empty__Lcom_raquo_laminar_keys_EventProp__Z__Z__Lcom_raquo_laminar_keys_EventProcessor(eventProp$4, false, false).preventDefault__Lcom_raquo_laminar_keys_EventProcessor().map__F1__Lcom_raquo_laminar_keys_EventProcessor(new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$c_sjsr_AnonFunction1(((_$24) => {
      var domList = _$24.dataTransfer.files;
      var this$44 = new $j_org$002escalajs$002edom$002e$002dD$002dO$002dM$002dList$0024$002dD$002dO$002dM$002dList$002dSeq.$c_Lorg_scalajs_dom_DOMList$DOMListSeq(domList);
      $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$m_sci_List$();
      var this$48 = $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$m_sci_Nil$().prependedAll__sc_IterableOnce__sci_List(this$44);
      var f$2 = ((_$25) => {
        var y$1 = new Date();
        return new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$c_T2(_$25, y$1)
      });
      if ((this$48 === $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$m_sci_Nil$())) {
        return $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$m_sci_Nil$()
      } else {
        var arg1$5 = this$48.head__O();
        var h$2 = new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$c_sci_$colon$colon(f$2(arg1$5), $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$m_sci_Nil$());
        var t$2 = h$2;
        var rest$2 = this$48.tail__O();
        while ((rest$2 !== $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$m_sci_Nil$())) {
          var arg1$6 = rest$2.head__O();
          var nx$2 = new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$c_sci_$colon$colon(f$2(arg1$6), $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$m_sci_Nil$());
          t$2.sci_$colon$colon__f_next = nx$2;
          t$2 = nx$2;
          rest$2 = rest$2.tail__O()
        };
        return h$2
      }
    })));
    var onNext$6 = new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$c_sjsr_AnonFunction1(((_$1$6) => {
      newFilesArrivedObserver.onNext__O__V(_$1$6)
    }));
    return new $c_Lcom_raquo_laminar_modifiers_EventListener(this$49, onNext$6)
  }))]));
  var body = $f_Lbe_doeraene_webcomponents_WebComponent__apply__sci_Seq__Lcom_raquo_laminar_nodes_ReactiveHtmlElement(this$50, mods$5);
  var $$x31 = $m_Lcom_raquo_laminar_api_package$().Lcom_raquo_laminar_api_package$__f_L.div__Lcom_raquo_laminar_tags_HtmlTag();
  var $$x30 = $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$m_sr_ScalaRunTime$();
  var $$x29 = $m_Lcom_raquo_laminar_api_package$().Lcom_raquo_laminar_api_package$__f_L.h2__Lcom_raquo_laminar_tags_HtmlTag();
  var $$x28 = $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$m_sr_ScalaRunTime$();
  var this$51 = $m_Lcom_raquo_laminar_api_package$().Lcom_raquo_laminar_api_package$__f_L;
  var renderable$3 = $m_Lcom_raquo_laminar_modifiers_RenderableText$().Lcom_raquo_laminar_modifiers_RenderableText$__f_stringRenderable;
  return $$x31.apply__sci_Seq__Lcom_raquo_laminar_nodes_ReactiveHtmlElement($$x30.wrapRefArray__AO__sci_ArraySeq(new ($d_Lcom_raquo_laminar_modifiers_Modifier.getArrayOf().constr)([$$x29.apply__sci_Seq__Lcom_raquo_laminar_nodes_ReactiveHtmlElement($$x28.wrapRefArray__AO__sci_ArraySeq(new ($d_Lcom_raquo_laminar_modifiers_Modifier.getArrayOf().constr)([$f_Lcom_raquo_laminar_Implicits__textToTextNode__O__Lcom_raquo_laminar_modifiers_RenderableText__Lcom_raquo_laminar_nodes_TextNode(this$51, "uploadZip example", renderable$3)]))), $m_Lcom_raquo_laminar_api_package$().Lcom_raquo_laminar_api_package$__f_L.div__Lcom_raquo_laminar_tags_HtmlTag().apply__sci_Seq__Lcom_raquo_laminar_nodes_ReactiveHtmlElement($j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$m_sr_ScalaRunTime$().wrapRefArray__AO__sci_ArraySeq(new ($d_Lcom_raquo_laminar_modifiers_Modifier.getArrayOf().constr)([$m_Lcom_raquo_laminar_api_package$().Lcom_raquo_laminar_api_package$__f_L.padding__Lcom_raquo_laminar_keys_StyleProp().$colon$eq__O__Lcom_raquo_laminar_modifiers_KeySetter("1em"), $m_Lcom_raquo_laminar_api_package$().Lcom_raquo_laminar_api_package$__f_L.border__Lcom_raquo_laminar_keys_StyleProp().$colon$eq__O__Lcom_raquo_laminar_modifiers_KeySetter("0.0625rem solid #C1C1C1"), $m_Lcom_raquo_laminar_api_package$().Lcom_raquo_laminar_api_package$__f_L.backgroundColor__Lcom_raquo_laminar_keys_StyleProp().$colon$eq__O__Lcom_raquo_laminar_modifiers_KeySetter("#f7f7f7"), body])))])))
});
var $d_LdescompressZip_UploadZIp$ = new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$TypeData().initClass({
  LdescompressZip_UploadZIp$: 0
}, false, "descompressZip.UploadZIp$", {
  LdescompressZip_UploadZIp$: 1,
  O: 1
});
$c_LdescompressZip_UploadZIp$.prototype.$classData = $d_LdescompressZip_UploadZIp$;
var $n_LdescompressZip_UploadZIp$;
function $m_LdescompressZip_UploadZIp$() {
  if ((!$n_LdescompressZip_UploadZIp$)) {
    $n_LdescompressZip_UploadZIp$ = new $c_LdescompressZip_UploadZIp$()
  };
  return $n_LdescompressZip_UploadZIp$
}
/** @constructor */
function $c_Lexample_Main$() {
  /*<skip>*/
}
$c_Lexample_Main$.prototype = new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$h_O();
$c_Lexample_Main$.prototype.constructor = $c_Lexample_Main$;
/** @constructor */
function $h_Lexample_Main$() {
  /*<skip>*/
}
$h_Lexample_Main$.prototype = $c_Lexample_Main$.prototype;
$c_Lexample_Main$.prototype.appElement__Lcom_raquo_laminar_nodes_ReactiveElement = (function() {
  var $$x4 = $m_Lcom_raquo_laminar_api_package$().Lcom_raquo_laminar_api_package$__f_L.div__Lcom_raquo_laminar_tags_HtmlTag();
  var $$x3 = $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$m_sr_ScalaRunTime$();
  var $$x2 = $m_Lcom_raquo_laminar_api_package$().Lcom_raquo_laminar_api_package$__f_L.h1__Lcom_raquo_laminar_tags_HtmlTag();
  var $$x1 = $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$m_sr_ScalaRunTime$();
  var this$1 = $m_Lcom_raquo_laminar_api_package$().Lcom_raquo_laminar_api_package$__f_L;
  var renderable = $m_Lcom_raquo_laminar_modifiers_RenderableText$().Lcom_raquo_laminar_modifiers_RenderableText$__f_stringRenderable;
  return $$x4.apply__sci_Seq__Lcom_raquo_laminar_nodes_ReactiveHtmlElement($$x3.wrapRefArray__AO__sci_ArraySeq(new ($d_Lcom_raquo_laminar_modifiers_Modifier.getArrayOf().constr)([$$x2.apply__sci_Seq__Lcom_raquo_laminar_nodes_ReactiveHtmlElement($$x1.wrapRefArray__AO__sci_ArraySeq(new ($d_Lcom_raquo_laminar_modifiers_Modifier.getArrayOf().constr)([$f_Lcom_raquo_laminar_Implicits__textToTextNode__O__Lcom_raquo_laminar_modifiers_RenderableText__Lcom_raquo_laminar_nodes_TextNode(this$1, "Hello Laminar dgc7  descompress ", renderable)]))), $m_LdescompressZip_UploadZIp$().apply__Lcom_raquo_laminar_nodes_ReactiveHtmlElement()])))
});
var $d_Lexample_Main$ = new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$TypeData().initClass({
  Lexample_Main$: 0
}, false, "example.Main$", {
  Lexample_Main$: 1,
  O: 1
});
$c_Lexample_Main$.prototype.$classData = $d_Lexample_Main$;
var $n_Lexample_Main$;
function $m_Lexample_Main$() {
  if ((!$n_Lexample_Main$)) {
    $n_Lexample_Main$ = new $c_Lexample_Main$()
  };
  return $n_Lexample_Main$
}
/** @constructor */
function $c_Lexample_Main$package$() {
  /*<skip>*/
}
$c_Lexample_Main$package$.prototype = new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$h_O();
$c_Lexample_Main$package$.prototype.constructor = $c_Lexample_Main$package$;
/** @constructor */
function $h_Lexample_Main$package$() {
  /*<skip>*/
}
$h_Lexample_Main$package$.prototype = $c_Lexample_Main$package$.prototype;
$c_Lexample_Main$package$.prototype.descompress__V = (function() {
  var this$3 = $m_Lcom_raquo_laminar_api_package$().Lcom_raquo_laminar_api_package$__f_L;
  var container = new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$c_sjsr_AnonFunction0((() => document.getElementById("app")));
  var rootNode = new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$c_sjsr_AnonFunction0((() => $m_Lexample_Main$().appElement__Lcom_raquo_laminar_nodes_ReactiveElement()));
  var arg1 = this$3.Lcom_raquo_laminar_api_package$$anon$1__f_documentEventProps;
  var eventProp = arg1.onDomContentLoaded__Lcom_raquo_laminar_keys_EventProp();
  var p = $m_Lcom_raquo_laminar_keys_EventProcessor$().empty__Lcom_raquo_laminar_keys_EventProp__Z__Z__Lcom_raquo_laminar_keys_EventProcessor(eventProp, false, false);
  var this$7 = $m_Lcom_raquo_airstream_web_DomEventStream$().apply__Lorg_scalajs_dom_EventTarget__T__Z__Lcom_raquo_airstream_core_EventStream(document, p.Lcom_raquo_laminar_keys_EventProcessor__f_eventProp.Lcom_raquo_laminar_keys_EventProp__f_name, p.Lcom_raquo_laminar_keys_EventProcessor__f_shouldUseCapture);
  var fn = p.Lcom_raquo_laminar_keys_EventProcessor__f_processor;
  var this$8 = new $c_Lcom_raquo_airstream_misc_CollectStream(this$7, fn);
  var onNext = new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$c_sjsr_AnonFunction1(((_$2) => {
    new $c_Lcom_raquo_laminar_nodes_RootNode(container.apply__O(), rootNode.apply__O())
  }));
  var owner = this$3.unsafeWindowOwner__Lcom_raquo_laminar_api_Laminar$unsafeWindowOwner$();
  $f_Lcom_raquo_airstream_core_BaseObservable__foreach__F1__Lcom_raquo_airstream_ownership_Owner__Lcom_raquo_airstream_ownership_Subscription(this$8, onNext, owner)
});
var $d_Lexample_Main$package$ = new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$TypeData().initClass({
  Lexample_Main$package$: 0
}, false, "example.Main$package$", {
  Lexample_Main$package$: 1,
  O: 1
});
$c_Lexample_Main$package$.prototype.$classData = $d_Lexample_Main$package$;
var $n_Lexample_Main$package$;
function $m_Lexample_Main$package$() {
  if ((!$n_Lexample_Main$package$)) {
    $n_Lexample_Main$package$ = new $c_Lexample_Main$package$()
  };
  return $n_Lexample_Main$package$
}
function $s_Lexample_descompress__main__AT__V(args) {
  try {
    $m_Lexample_Main$package$().descompress__V()
  } catch (e) {
    if (false) {
      var error = e;
      $m_s_util_CommandLineParser$().showError__s_util_CommandLineParser$ParseError__V(error)
    } else {
      throw e
    }
  }
}
var $d_jl_Runnable = new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$TypeData().initClass({
  jl_Runnable: 0
}, true, "java.lang.Runnable", {
  jl_Runnable: 1,
  O: 1
});
/** @constructor */
function $c_jl_System$Streams$() {
  this.jl_System$Streams$__f_out = null;
  this.jl_System$Streams$__f_err = null;
  $n_jl_System$Streams$ = this;
  this.jl_System$Streams$__f_out = new $c_jl_JSConsoleBasedPrintStream(false);
  this.jl_System$Streams$__f_err = new $c_jl_JSConsoleBasedPrintStream(true)
}
$c_jl_System$Streams$.prototype = new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$h_O();
$c_jl_System$Streams$.prototype.constructor = $c_jl_System$Streams$;
/** @constructor */
function $h_jl_System$Streams$() {
  /*<skip>*/
}
$h_jl_System$Streams$.prototype = $c_jl_System$Streams$.prototype;
var $d_jl_System$Streams$ = new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$TypeData().initClass({
  jl_System$Streams$: 0
}, false, "java.lang.System$Streams$", {
  jl_System$Streams$: 1,
  O: 1
});
$c_jl_System$Streams$.prototype.$classData = $d_jl_System$Streams$;
var $n_jl_System$Streams$;
function $m_jl_System$Streams$() {
  if ((!$n_jl_System$Streams$)) {
    $n_jl_System$Streams$ = new $c_jl_System$Streams$()
  };
  return $n_jl_System$Streams$
}
/** @constructor */
function $c_jl_Thread$() {
  this.jl_Thread$__f_SingleThread = null;
  $n_jl_Thread$ = this;
  this.jl_Thread$__f_SingleThread = new $c_jl_Thread((void 0))
}
$c_jl_Thread$.prototype = new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$h_O();
$c_jl_Thread$.prototype.constructor = $c_jl_Thread$;
/** @constructor */
function $h_jl_Thread$() {
  /*<skip>*/
}
$h_jl_Thread$.prototype = $c_jl_Thread$.prototype;
var $d_jl_Thread$ = new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$TypeData().initClass({
  jl_Thread$: 0
}, false, "java.lang.Thread$", {
  jl_Thread$: 1,
  O: 1
});
$c_jl_Thread$.prototype.$classData = $d_jl_Thread$;
var $n_jl_Thread$;
function $m_jl_Thread$() {
  if ((!$n_jl_Thread$)) {
    $n_jl_Thread$ = new $c_jl_Thread$()
  };
  return $n_jl_Thread$
}
/** @constructor */
function $c_jl_ThreadLocal() {
  this.jl_ThreadLocal__f_hasValue = false;
  this.jl_ThreadLocal__f_v = null;
  this.jl_ThreadLocal__f_hasValue = false
}
$c_jl_ThreadLocal.prototype = new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$h_O();
$c_jl_ThreadLocal.prototype.constructor = $c_jl_ThreadLocal;
/** @constructor */
function $h_jl_ThreadLocal() {
  /*<skip>*/
}
$h_jl_ThreadLocal.prototype = $c_jl_ThreadLocal.prototype;
$c_jl_ThreadLocal.prototype.get__O = (function() {
  if ((!this.jl_ThreadLocal__f_hasValue)) {
    this.set__O__V(null)
  };
  return this.jl_ThreadLocal__f_v
});
$c_jl_ThreadLocal.prototype.set__O__V = (function(o) {
  this.jl_ThreadLocal__f_v = o;
  this.jl_ThreadLocal__f_hasValue = true
});
var $d_jl_ThreadLocal = new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$TypeData().initClass({
  jl_ThreadLocal: 0
}, false, "java.lang.ThreadLocal", {
  jl_ThreadLocal: 1,
  O: 1
});
$c_jl_ThreadLocal.prototype.$classData = $d_jl_ThreadLocal;
/** @constructor */
function $c_s_Array$EmptyArrays$() {
  this.s_Array$EmptyArrays$__f_emptyIntArray = null;
  this.s_Array$EmptyArrays$__f_emptyObjectArray = null;
  $n_s_Array$EmptyArrays$ = this;
  this.s_Array$EmptyArrays$__f_emptyIntArray = new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$ac_I(0);
  this.s_Array$EmptyArrays$__f_emptyObjectArray = new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$ac_O(0)
}
$c_s_Array$EmptyArrays$.prototype = new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$h_O();
$c_s_Array$EmptyArrays$.prototype.constructor = $c_s_Array$EmptyArrays$;
/** @constructor */
function $h_s_Array$EmptyArrays$() {
  /*<skip>*/
}
$h_s_Array$EmptyArrays$.prototype = $c_s_Array$EmptyArrays$.prototype;
var $d_s_Array$EmptyArrays$ = new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$TypeData().initClass({
  s_Array$EmptyArrays$: 0
}, false, "scala.Array$EmptyArrays$", {
  s_Array$EmptyArrays$: 1,
  O: 1
});
$c_s_Array$EmptyArrays$.prototype.$classData = $d_s_Array$EmptyArrays$;
var $n_s_Array$EmptyArrays$;
function $m_s_Array$EmptyArrays$() {
  if ((!$n_s_Array$EmptyArrays$)) {
    $n_s_Array$EmptyArrays$ = new $c_s_Array$EmptyArrays$()
  };
  return $n_s_Array$EmptyArrays$
}
function $is_F0(obj) {
  return (!(!((obj && obj.$classData) && obj.$classData.ancestors.F0)))
}
function $isArrayOf_F0(obj, depth) {
  return (!(!(((obj && obj.$classData) && (obj.$classData.arrayDepth === depth)) && obj.$classData.arrayBase.ancestors.F0)))
}
var $d_F0 = new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$TypeData().initClass({
  F0: 0
}, true, "scala.Function0", {
  F0: 1,
  O: 1
});
function $is_F1(obj) {
  return (!(!((obj && obj.$classData) && obj.$classData.ancestors.F1)))
}
function $isArrayOf_F1(obj, depth) {
  return (!(!(((obj && obj.$classData) && (obj.$classData.arrayDepth === depth)) && obj.$classData.arrayBase.ancestors.F1)))
}
var $d_F1 = new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$TypeData().initClass({
  F1: 0
}, true, "scala.Function1", {
  F1: 1,
  O: 1
});
/** @constructor */
function $c_s_LowPriorityImplicits2() {
  /*<skip>*/
}
$c_s_LowPriorityImplicits2.prototype = new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$h_O();
$c_s_LowPriorityImplicits2.prototype.constructor = $c_s_LowPriorityImplicits2;
/** @constructor */
function $h_s_LowPriorityImplicits2() {
  /*<skip>*/
}
$h_s_LowPriorityImplicits2.prototype = $c_s_LowPriorityImplicits2.prototype;
/** @constructor */
function $c_sc_Hashing$() {
  /*<skip>*/
}
$c_sc_Hashing$.prototype = new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$h_O();
$c_sc_Hashing$.prototype.constructor = $c_sc_Hashing$;
/** @constructor */
function $h_sc_Hashing$() {
  /*<skip>*/
}
$h_sc_Hashing$.prototype = $c_sc_Hashing$.prototype;
$c_sc_Hashing$.prototype.improve__I__I = (function(hcode) {
  var h = ((hcode + (~(hcode << 9))) | 0);
  h = (h ^ ((h >>> 14) | 0));
  h = ((h + (h << 4)) | 0);
  return (h ^ ((h >>> 10) | 0))
});
var $d_sc_Hashing$ = new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$TypeData().initClass({
  sc_Hashing$: 0
}, false, "scala.collection.Hashing$", {
  sc_Hashing$: 1,
  O: 1
});
$c_sc_Hashing$.prototype.$classData = $d_sc_Hashing$;
var $n_sc_Hashing$;
function $m_sc_Hashing$() {
  if ((!$n_sc_Hashing$)) {
    $n_sc_Hashing$ = new $c_sc_Hashing$()
  };
  return $n_sc_Hashing$
}
function $p_sci_ChampBaseIterator__initNodes__V($thiz) {
  if (($thiz.sci_ChampBaseIterator__f_nodeCursorsAndLengths === null)) {
    $thiz.sci_ChampBaseIterator__f_nodeCursorsAndLengths = new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$ac_I(($m_sci_Node$().sci_Node$__f_MaxDepth << 1));
    $thiz.sci_ChampBaseIterator__f_nodes = new ($d_sci_Node.getArrayOf().constr)($m_sci_Node$().sci_Node$__f_MaxDepth)
  }
}
function $p_sci_ChampBaseIterator__setupPayloadNode__sci_Node__V($thiz, node) {
  $thiz.sci_ChampBaseIterator__f_currentValueNode = node;
  $thiz.sci_ChampBaseIterator__f_currentValueCursor = 0;
  $thiz.sci_ChampBaseIterator__f_currentValueLength = node.payloadArity__I()
}
function $p_sci_ChampBaseIterator__pushNode__sci_Node__V($thiz, node) {
  $p_sci_ChampBaseIterator__initNodes__V($thiz);
  $thiz.sci_ChampBaseIterator__f_currentStackLevel = ((1 + $thiz.sci_ChampBaseIterator__f_currentStackLevel) | 0);
  var cursorIndex = ($thiz.sci_ChampBaseIterator__f_currentStackLevel << 1);
  var lengthIndex = ((1 + ($thiz.sci_ChampBaseIterator__f_currentStackLevel << 1)) | 0);
  $thiz.sci_ChampBaseIterator__f_nodes.u[$thiz.sci_ChampBaseIterator__f_currentStackLevel] = node;
  $thiz.sci_ChampBaseIterator__f_nodeCursorsAndLengths.u[cursorIndex] = 0;
  $thiz.sci_ChampBaseIterator__f_nodeCursorsAndLengths.u[lengthIndex] = node.nodeArity__I()
}
function $p_sci_ChampBaseIterator__popNode__V($thiz) {
  $thiz.sci_ChampBaseIterator__f_currentStackLevel = (((-1) + $thiz.sci_ChampBaseIterator__f_currentStackLevel) | 0)
}
function $p_sci_ChampBaseIterator__searchNextValueNode__Z($thiz) {
  while (($thiz.sci_ChampBaseIterator__f_currentStackLevel >= 0)) {
    var cursorIndex = ($thiz.sci_ChampBaseIterator__f_currentStackLevel << 1);
    var lengthIndex = ((1 + ($thiz.sci_ChampBaseIterator__f_currentStackLevel << 1)) | 0);
    var nodeCursor = $thiz.sci_ChampBaseIterator__f_nodeCursorsAndLengths.u[cursorIndex];
    var nodeLength = $thiz.sci_ChampBaseIterator__f_nodeCursorsAndLengths.u[lengthIndex];
    if ((nodeCursor < nodeLength)) {
      var ev$1 = $thiz.sci_ChampBaseIterator__f_nodeCursorsAndLengths;
      ev$1.u[cursorIndex] = ((1 + ev$1.u[cursorIndex]) | 0);
      var nextNode = $thiz.sci_ChampBaseIterator__f_nodes.u[$thiz.sci_ChampBaseIterator__f_currentStackLevel].getNode__I__sci_Node(nodeCursor);
      if (nextNode.hasNodes__Z()) {
        $p_sci_ChampBaseIterator__pushNode__sci_Node__V($thiz, nextNode)
      };
      if (nextNode.hasPayload__Z()) {
        $p_sci_ChampBaseIterator__setupPayloadNode__sci_Node__V($thiz, nextNode);
        return true
      }
    } else {
      $p_sci_ChampBaseIterator__popNode__V($thiz)
    }
  };
  return false
}
function $ct_sci_ChampBaseIterator__($thiz) {
  $thiz.sci_ChampBaseIterator__f_currentValueCursor = 0;
  $thiz.sci_ChampBaseIterator__f_currentValueLength = 0;
  $thiz.sci_ChampBaseIterator__f_currentStackLevel = (-1);
  return $thiz
}
function $ct_sci_ChampBaseIterator__sci_Node__($thiz, rootNode) {
  $ct_sci_ChampBaseIterator__($thiz);
  if (rootNode.hasNodes__Z()) {
    $p_sci_ChampBaseIterator__pushNode__sci_Node__V($thiz, rootNode)
  };
  if (rootNode.hasPayload__Z()) {
    $p_sci_ChampBaseIterator__setupPayloadNode__sci_Node__V($thiz, rootNode)
  };
  return $thiz
}
/** @constructor */
function $c_sci_ChampBaseIterator() {
  this.sci_ChampBaseIterator__f_currentValueCursor = 0;
  this.sci_ChampBaseIterator__f_currentValueLength = 0;
  this.sci_ChampBaseIterator__f_currentValueNode = null;
  this.sci_ChampBaseIterator__f_currentStackLevel = 0;
  this.sci_ChampBaseIterator__f_nodeCursorsAndLengths = null;
  this.sci_ChampBaseIterator__f_nodes = null
}
$c_sci_ChampBaseIterator.prototype = new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$h_O();
$c_sci_ChampBaseIterator.prototype.constructor = $c_sci_ChampBaseIterator;
/** @constructor */
function $h_sci_ChampBaseIterator() {
  /*<skip>*/
}
$h_sci_ChampBaseIterator.prototype = $c_sci_ChampBaseIterator.prototype;
$c_sci_ChampBaseIterator.prototype.hasNext__Z = (function() {
  return ((this.sci_ChampBaseIterator__f_currentValueCursor < this.sci_ChampBaseIterator__f_currentValueLength) || $p_sci_ChampBaseIterator__searchNextValueNode__Z(this))
});
function $p_sci_ChampBaseReverseIterator__setupPayloadNode__sci_Node__V($thiz, node) {
  $thiz.sci_ChampBaseReverseIterator__f_currentValueNode = node;
  $thiz.sci_ChampBaseReverseIterator__f_currentValueCursor = (((-1) + node.payloadArity__I()) | 0)
}
function $p_sci_ChampBaseReverseIterator__pushNode__sci_Node__V($thiz, node) {
  $thiz.sci_ChampBaseReverseIterator__f_currentStackLevel = ((1 + $thiz.sci_ChampBaseReverseIterator__f_currentStackLevel) | 0);
  $thiz.sci_ChampBaseReverseIterator__f_nodeStack.u[$thiz.sci_ChampBaseReverseIterator__f_currentStackLevel] = node;
  $thiz.sci_ChampBaseReverseIterator__f_nodeIndex.u[$thiz.sci_ChampBaseReverseIterator__f_currentStackLevel] = (((-1) + node.nodeArity__I()) | 0)
}
function $p_sci_ChampBaseReverseIterator__popNode__V($thiz) {
  $thiz.sci_ChampBaseReverseIterator__f_currentStackLevel = (((-1) + $thiz.sci_ChampBaseReverseIterator__f_currentStackLevel) | 0)
}
function $p_sci_ChampBaseReverseIterator__searchNextValueNode__Z($thiz) {
  while (($thiz.sci_ChampBaseReverseIterator__f_currentStackLevel >= 0)) {
    var nodeCursor = $thiz.sci_ChampBaseReverseIterator__f_nodeIndex.u[$thiz.sci_ChampBaseReverseIterator__f_currentStackLevel];
    $thiz.sci_ChampBaseReverseIterator__f_nodeIndex.u[$thiz.sci_ChampBaseReverseIterator__f_currentStackLevel] = (((-1) + nodeCursor) | 0);
    if ((nodeCursor >= 0)) {
      var nextNode = $thiz.sci_ChampBaseReverseIterator__f_nodeStack.u[$thiz.sci_ChampBaseReverseIterator__f_currentStackLevel].getNode__I__sci_Node(nodeCursor);
      $p_sci_ChampBaseReverseIterator__pushNode__sci_Node__V($thiz, nextNode)
    } else {
      var currNode = $thiz.sci_ChampBaseReverseIterator__f_nodeStack.u[$thiz.sci_ChampBaseReverseIterator__f_currentStackLevel];
      $p_sci_ChampBaseReverseIterator__popNode__V($thiz);
      if (currNode.hasPayload__Z()) {
        $p_sci_ChampBaseReverseIterator__setupPayloadNode__sci_Node__V($thiz, currNode);
        return true
      }
    }
  };
  return false
}
function $ct_sci_ChampBaseReverseIterator__($thiz) {
  $thiz.sci_ChampBaseReverseIterator__f_currentValueCursor = (-1);
  $thiz.sci_ChampBaseReverseIterator__f_currentStackLevel = (-1);
  $thiz.sci_ChampBaseReverseIterator__f_nodeIndex = new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$ac_I(((1 + $m_sci_Node$().sci_Node$__f_MaxDepth) | 0));
  $thiz.sci_ChampBaseReverseIterator__f_nodeStack = new ($d_sci_Node.getArrayOf().constr)(((1 + $m_sci_Node$().sci_Node$__f_MaxDepth) | 0));
  return $thiz
}
function $ct_sci_ChampBaseReverseIterator__sci_Node__($thiz, rootNode) {
  $ct_sci_ChampBaseReverseIterator__($thiz);
  $p_sci_ChampBaseReverseIterator__pushNode__sci_Node__V($thiz, rootNode);
  $p_sci_ChampBaseReverseIterator__searchNextValueNode__Z($thiz);
  return $thiz
}
/** @constructor */
function $c_sci_ChampBaseReverseIterator() {
  this.sci_ChampBaseReverseIterator__f_currentValueCursor = 0;
  this.sci_ChampBaseReverseIterator__f_currentValueNode = null;
  this.sci_ChampBaseReverseIterator__f_currentStackLevel = 0;
  this.sci_ChampBaseReverseIterator__f_nodeIndex = null;
  this.sci_ChampBaseReverseIterator__f_nodeStack = null
}
$c_sci_ChampBaseReverseIterator.prototype = new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$h_O();
$c_sci_ChampBaseReverseIterator.prototype.constructor = $c_sci_ChampBaseReverseIterator;
/** @constructor */
function $h_sci_ChampBaseReverseIterator() {
  /*<skip>*/
}
$h_sci_ChampBaseReverseIterator.prototype = $c_sci_ChampBaseReverseIterator.prototype;
$c_sci_ChampBaseReverseIterator.prototype.hasNext__Z = (function() {
  return ((this.sci_ChampBaseReverseIterator__f_currentValueCursor >= 0) || $p_sci_ChampBaseReverseIterator__searchNextValueNode__Z(this))
});
function $p_sci_IndexedSeqDefaults$__liftedTree1$1__I($thiz) {
  try {
    $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$m_sc_StringOps$();
    var x = $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$m_jl_System$SystemProperties$().getProperty__T__T__T("scala.collection.immutable.IndexedSeq.defaultApplyPreferredMaxLength", "64");
    var this$4 = $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$m_jl_Integer$();
    return this$4.parseInt__T__I__I(x, 10)
  } catch (e) {
    if (false) {
      return 64
    } else {
      throw e
    }
  }
}
/** @constructor */
function $c_sci_IndexedSeqDefaults$() {
  this.sci_IndexedSeqDefaults$__f_defaultApplyPreferredMaxLength = 0;
  $n_sci_IndexedSeqDefaults$ = this;
  this.sci_IndexedSeqDefaults$__f_defaultApplyPreferredMaxLength = $p_sci_IndexedSeqDefaults$__liftedTree1$1__I(this)
}
$c_sci_IndexedSeqDefaults$.prototype = new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$h_O();
$c_sci_IndexedSeqDefaults$.prototype.constructor = $c_sci_IndexedSeqDefaults$;
/** @constructor */
function $h_sci_IndexedSeqDefaults$() {
  /*<skip>*/
}
$h_sci_IndexedSeqDefaults$.prototype = $c_sci_IndexedSeqDefaults$.prototype;
var $d_sci_IndexedSeqDefaults$ = new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$TypeData().initClass({
  sci_IndexedSeqDefaults$: 0
}, false, "scala.collection.immutable.IndexedSeqDefaults$", {
  sci_IndexedSeqDefaults$: 1,
  O: 1
});
$c_sci_IndexedSeqDefaults$.prototype.$classData = $d_sci_IndexedSeqDefaults$;
var $n_sci_IndexedSeqDefaults$;
function $m_sci_IndexedSeqDefaults$() {
  if ((!$n_sci_IndexedSeqDefaults$)) {
    $n_sci_IndexedSeqDefaults$ = new $c_sci_IndexedSeqDefaults$()
  };
  return $n_sci_IndexedSeqDefaults$
}
/** @constructor */
function $c_sci_MapNode$() {
  this.sci_MapNode$__f_EmptyMapNode = null;
  $n_sci_MapNode$ = this;
  this.sci_MapNode$__f_EmptyMapNode = new $c_sci_BitmapIndexedMapNode(0, 0, ($j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$m_s_reflect_ManifestFactory$AnyManifest$(), new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$ac_O(0)), ($j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$m_s_reflect_ManifestFactory$IntManifest$(), new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$ac_I(0)), 0, 0)
}
$c_sci_MapNode$.prototype = new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$h_O();
$c_sci_MapNode$.prototype.constructor = $c_sci_MapNode$;
/** @constructor */
function $h_sci_MapNode$() {
  /*<skip>*/
}
$h_sci_MapNode$.prototype = $c_sci_MapNode$.prototype;
var $d_sci_MapNode$ = new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$TypeData().initClass({
  sci_MapNode$: 0
}, false, "scala.collection.immutable.MapNode$", {
  sci_MapNode$: 1,
  O: 1
});
$c_sci_MapNode$.prototype.$classData = $d_sci_MapNode$;
var $n_sci_MapNode$;
function $m_sci_MapNode$() {
  if ((!$n_sci_MapNode$)) {
    $n_sci_MapNode$ = new $c_sci_MapNode$()
  };
  return $n_sci_MapNode$
}
function $p_sci_Node__arrayIndexOutOfBounds__O__I__jl_ArrayIndexOutOfBoundsException($thiz, as, ix) {
  return $ct_jl_ArrayIndexOutOfBoundsException__T__(new $c_jl_ArrayIndexOutOfBoundsException(), ((ix + " is out of bounds (min 0, max ") + (((-1) + $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$m_jl_reflect_Array$().getLength__O__I(as)) | 0)))
}
/** @constructor */
function $c_sci_Node() {
  /*<skip>*/
}
$c_sci_Node.prototype = new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$h_O();
$c_sci_Node.prototype.constructor = $c_sci_Node;
/** @constructor */
function $h_sci_Node() {
  /*<skip>*/
}
$h_sci_Node.prototype = $c_sci_Node.prototype;
$c_sci_Node.prototype.removeElement__AI__I__AI = (function(as, ix) {
  if ((ix < 0)) {
    throw $p_sci_Node__arrayIndexOutOfBounds__O__I__jl_ArrayIndexOutOfBoundsException(this, as, ix)
  };
  if ((ix > (((-1) + as.u.length) | 0))) {
    throw $p_sci_Node__arrayIndexOutOfBounds__O__I__jl_ArrayIndexOutOfBoundsException(this, as, ix)
  };
  var result = new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$ac_I((((-1) + as.u.length) | 0));
  as.copyTo(0, result, 0, ix);
  var srcPos = ((1 + ix) | 0);
  var length = (((-1) + ((as.u.length - ix) | 0)) | 0);
  as.copyTo(srcPos, result, ix, length);
  return result
});
$c_sci_Node.prototype.insertElement__AI__I__I__AI = (function(as, ix, elem) {
  if ((ix < 0)) {
    throw $p_sci_Node__arrayIndexOutOfBounds__O__I__jl_ArrayIndexOutOfBoundsException(this, as, ix)
  };
  if ((ix > as.u.length)) {
    throw $p_sci_Node__arrayIndexOutOfBounds__O__I__jl_ArrayIndexOutOfBoundsException(this, as, ix)
  };
  var result = new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$ac_I(((1 + as.u.length) | 0));
  as.copyTo(0, result, 0, ix);
  result.u[ix] = elem;
  var destPos = ((1 + ix) | 0);
  var length = ((as.u.length - ix) | 0);
  as.copyTo(ix, result, destPos, length);
  return result
});
var $d_sci_Node = new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$TypeData().initClass({
  sci_Node: 0
}, false, "scala.collection.immutable.Node", {
  sci_Node: 1,
  O: 1
});
$c_sci_Node.prototype.$classData = $d_sci_Node;
/** @constructor */
function $c_sci_Node$() {
  this.sci_Node$__f_MaxDepth = 0;
  $n_sci_Node$ = this;
  this.sci_Node$__f_MaxDepth = $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$doubleToInt((+Math.ceil(6.4)))
}
$c_sci_Node$.prototype = new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$h_O();
$c_sci_Node$.prototype.constructor = $c_sci_Node$;
/** @constructor */
function $h_sci_Node$() {
  /*<skip>*/
}
$h_sci_Node$.prototype = $c_sci_Node$.prototype;
$c_sci_Node$.prototype.maskFrom__I__I__I = (function(hash, shift) {
  return (31 & ((hash >>> shift) | 0))
});
$c_sci_Node$.prototype.bitposFrom__I__I = (function(mask) {
  return (1 << mask)
});
$c_sci_Node$.prototype.indexFrom__I__I__I = (function(bitmap, bitpos) {
  var i = (bitmap & (((-1) + bitpos) | 0));
  return $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$m_jl_Integer$().bitCount__I__I(i)
});
$c_sci_Node$.prototype.indexFrom__I__I__I__I = (function(bitmap, mask, bitpos) {
  return ((bitmap === (-1)) ? mask : this.indexFrom__I__I__I(bitmap, bitpos))
});
var $d_sci_Node$ = new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$TypeData().initClass({
  sci_Node$: 0
}, false, "scala.collection.immutable.Node$", {
  sci_Node$: 1,
  O: 1
});
$c_sci_Node$.prototype.$classData = $d_sci_Node$;
var $n_sci_Node$;
function $m_sci_Node$() {
  if ((!$n_sci_Node$)) {
    $n_sci_Node$ = new $c_sci_Node$()
  };
  return $n_sci_Node$
}
function $isArrayOf_scm_HashMap$Node(obj, depth) {
  return (!(!(((obj && obj.$classData) && (obj.$classData.arrayDepth === depth)) && obj.$classData.arrayBase.ancestors.scm_HashMap$Node)))
}
function $isArrayOf_scm_LinkedHashMap$LinkedEntry(obj, depth) {
  return (!(!(((obj && obj.$classData) && (obj.$classData.arrayDepth === depth)) && obj.$classData.arrayBase.ancestors.scm_LinkedHashMap$LinkedEntry)))
}
function $p_s_concurrent_BatchingExecutor$AbstractBatch__ensureCapacity__I__Ajl_Runnable($thiz, curSize) {
  var curOther = $thiz.s_concurrent_BatchingExecutor$AbstractBatch__f_other;
  var curLen = curOther.u.length;
  if ((curSize <= curLen)) {
    return curOther
  } else {
    var newLen = ((curLen === 0) ? 4 : (curLen << 1));
    if ((newLen <= curLen)) {
      throw new $c_jl_StackOverflowError(("Space limit of asynchronous stack reached: " + curLen))
    };
    var newOther = new ($d_jl_Runnable.getArrayOf().constr)(newLen);
    curOther.copyTo(0, newOther, 0, curLen);
    $thiz.s_concurrent_BatchingExecutor$AbstractBatch__f_other = newOther;
    return newOther
  }
}
function $ct_s_concurrent_BatchingExecutor$AbstractBatch__s_concurrent_BatchingExecutor__jl_Runnable__Ajl_Runnable__I__($thiz, outer, first, other, size) {
  $thiz.s_concurrent_BatchingExecutor$AbstractBatch__f_first = first;
  $thiz.s_concurrent_BatchingExecutor$AbstractBatch__f_other = other;
  $thiz.s_concurrent_BatchingExecutor$AbstractBatch__f_size = size;
  if ((outer === null)) {
    throw null
  } else {
    $thiz.s_concurrent_BatchingExecutor$AbstractBatch__f_$outer = outer
  };
  return $thiz
}
/** @constructor */
function $c_s_concurrent_BatchingExecutor$AbstractBatch() {
  this.s_concurrent_BatchingExecutor$AbstractBatch__f_first = null;
  this.s_concurrent_BatchingExecutor$AbstractBatch__f_other = null;
  this.s_concurrent_BatchingExecutor$AbstractBatch__f_size = 0;
  this.s_concurrent_BatchingExecutor$AbstractBatch__f_$outer = null
}
$c_s_concurrent_BatchingExecutor$AbstractBatch.prototype = new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$h_O();
$c_s_concurrent_BatchingExecutor$AbstractBatch.prototype.constructor = $c_s_concurrent_BatchingExecutor$AbstractBatch;
/** @constructor */
function $h_s_concurrent_BatchingExecutor$AbstractBatch() {
  /*<skip>*/
}
$h_s_concurrent_BatchingExecutor$AbstractBatch.prototype = $c_s_concurrent_BatchingExecutor$AbstractBatch.prototype;
$c_s_concurrent_BatchingExecutor$AbstractBatch.prototype.push__jl_Runnable__V = (function(r) {
  var sz = this.s_concurrent_BatchingExecutor$AbstractBatch__f_size;
  if ((sz === 0)) {
    this.s_concurrent_BatchingExecutor$AbstractBatch__f_first = r
  } else {
    $p_s_concurrent_BatchingExecutor$AbstractBatch__ensureCapacity__I__Ajl_Runnable(this, sz).u[(((-1) + sz) | 0)] = r
  };
  this.s_concurrent_BatchingExecutor$AbstractBatch__f_size = ((1 + sz) | 0)
});
$c_s_concurrent_BatchingExecutor$AbstractBatch.prototype.runN__I__V = (function(n) {
  while (true) {
    if ((n > 0)) {
      var x1 = this.s_concurrent_BatchingExecutor$AbstractBatch__f_size;
      switch (x1) {
        case 0: {
          break
        }
        case 1: {
          var next = this.s_concurrent_BatchingExecutor$AbstractBatch__f_first;
          this.s_concurrent_BatchingExecutor$AbstractBatch__f_first = null;
          this.s_concurrent_BatchingExecutor$AbstractBatch__f_size = 0;
          next.run__V();
          n = (((-1) + n) | 0);
          continue;
          break
        }
        default: {
          var o = this.s_concurrent_BatchingExecutor$AbstractBatch__f_other;
          var next$2 = o.u[(((-2) + x1) | 0)];
          o.u[(((-2) + x1) | 0)] = null;
          this.s_concurrent_BatchingExecutor$AbstractBatch__f_size = (((-1) + x1) | 0);
          next$2.run__V();
          n = (((-1) + n) | 0);
          continue
        }
      }
    };
    return (void 0)
  }
});
/** @constructor */
function $c_s_concurrent_BatchingExecutorStatics$() {
  this.s_concurrent_BatchingExecutorStatics$__f_emptyBatchArray = null;
  $n_s_concurrent_BatchingExecutorStatics$ = this;
  this.s_concurrent_BatchingExecutorStatics$__f_emptyBatchArray = new ($d_jl_Runnable.getArrayOf().constr)(0)
}
$c_s_concurrent_BatchingExecutorStatics$.prototype = new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$h_O();
$c_s_concurrent_BatchingExecutorStatics$.prototype.constructor = $c_s_concurrent_BatchingExecutorStatics$;
/** @constructor */
function $h_s_concurrent_BatchingExecutorStatics$() {
  /*<skip>*/
}
$h_s_concurrent_BatchingExecutorStatics$.prototype = $c_s_concurrent_BatchingExecutorStatics$.prototype;
var $d_s_concurrent_BatchingExecutorStatics$ = new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$TypeData().initClass({
  s_concurrent_BatchingExecutorStatics$: 0
}, false, "scala.concurrent.BatchingExecutorStatics$", {
  s_concurrent_BatchingExecutorStatics$: 1,
  O: 1
});
$c_s_concurrent_BatchingExecutorStatics$.prototype.$classData = $d_s_concurrent_BatchingExecutorStatics$;
var $n_s_concurrent_BatchingExecutorStatics$;
function $m_s_concurrent_BatchingExecutorStatics$() {
  if ((!$n_s_concurrent_BatchingExecutorStatics$)) {
    $n_s_concurrent_BatchingExecutorStatics$ = new $c_s_concurrent_BatchingExecutorStatics$()
  };
  return $n_s_concurrent_BatchingExecutorStatics$
}
/** @constructor */
function $c_s_concurrent_ExecutionContext$() {
  this.s_concurrent_ExecutionContext$__f_defaultReporter = null;
  $n_s_concurrent_ExecutionContext$ = this;
  this.s_concurrent_ExecutionContext$__f_defaultReporter = new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$c_sjsr_AnonFunction1(((x$1$2) => {
    var x$1 = x$1$2;
    x$1.printStackTrace__Ljava_io_PrintStream__V($m_jl_System$Streams$().jl_System$Streams$__f_err)
  }))
}
$c_s_concurrent_ExecutionContext$.prototype = new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$h_O();
$c_s_concurrent_ExecutionContext$.prototype.constructor = $c_s_concurrent_ExecutionContext$;
/** @constructor */
function $h_s_concurrent_ExecutionContext$() {
  /*<skip>*/
}
$h_s_concurrent_ExecutionContext$.prototype = $c_s_concurrent_ExecutionContext$.prototype;
var $d_s_concurrent_ExecutionContext$ = new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$TypeData().initClass({
  s_concurrent_ExecutionContext$: 0
}, false, "scala.concurrent.ExecutionContext$", {
  s_concurrent_ExecutionContext$: 1,
  O: 1
});
$c_s_concurrent_ExecutionContext$.prototype.$classData = $d_s_concurrent_ExecutionContext$;
var $n_s_concurrent_ExecutionContext$;
function $m_s_concurrent_ExecutionContext$() {
  if ((!$n_s_concurrent_ExecutionContext$)) {
    $n_s_concurrent_ExecutionContext$ = new $c_s_concurrent_ExecutionContext$()
  };
  return $n_s_concurrent_ExecutionContext$
}
/** @constructor */
function $c_s_concurrent_Future$() {
  this.s_concurrent_Future$__f_collectFailed = null;
  this.s_concurrent_Future$__f_filterFailure = null;
  this.s_concurrent_Future$__f_failedFailure = null;
  this.s_concurrent_Future$__f_recoverWithFailedMarker = null;
  this.s_concurrent_Future$__f_recoverWithFailed = null;
  $n_s_concurrent_Future$ = this;
  var this$22 = $m_s_Predef$().s_Predef$__f_Map;
  var array = [new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$c_T2($j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$d_Z.getClassOf(), $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$d_jl_Boolean.getClassOf()), new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$c_T2($j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$d_B.getClassOf(), $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$d_jl_Byte.getClassOf()), new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$c_T2($j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$d_C.getClassOf(), $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$d_jl_Character.getClassOf()), new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$c_T2($j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$d_S.getClassOf(), $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$d_jl_Short.getClassOf()), new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$c_T2($j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$d_I.getClassOf(), $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$d_jl_Integer.getClassOf()), new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$c_T2($j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$d_J.getClassOf(), $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$d_jl_Long.getClassOf()), new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$c_T2($j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$d_F.getClassOf(), $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$d_jl_Float.getClassOf()), new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$c_T2($j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$d_D.getClassOf(), $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$d_jl_Double.getClassOf()), new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$c_T2($j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$d_V.getClassOf(), $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$d_jl_Void.getClassOf())];
  var elems = new $c_sjsr_WrappedVarArgs(array);
  this$22.from__sc_IterableOnce__sci_Map(elems);
  new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$c_sjsr_AnonFunction1(((x$2) => x$2));
  this.s_concurrent_Future$__f_collectFailed = new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$c_sjsr_AnonFunction1(((t$2) => {
    throw new $c_s_concurrent_Future$$anon$1(t$2)
  }));
  this.s_concurrent_Future$__f_filterFailure = new $c_s_util_Failure(new $c_s_concurrent_Future$$anon$2());
  this.s_concurrent_Future$__f_failedFailure = new $c_s_util_Failure(new $c_s_concurrent_Future$$anon$3());
  $m_s_concurrent_Future$().fromTry__s_util_Try__s_concurrent_Future(this.s_concurrent_Future$__f_failedFailure);
  new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$c_sjsr_AnonFunction1(((v$2) => {
    var v = v$2;
    return ((v instanceof $c_s_util_Failure) ? new $c_s_util_Success(v.s_util_Failure__f_exception) : $m_s_concurrent_Future$().s_concurrent_Future$__f_failedFailure)
  }));
  this.s_concurrent_Future$__f_recoverWithFailedMarker = $m_s_concurrent_Future$().failed__jl_Throwable__s_concurrent_Future(new $c_s_concurrent_Future$$anon$4());
  this.s_concurrent_Future$__f_recoverWithFailed = new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$c_sjsr_AnonFunction1(((t$3$2) => $m_s_concurrent_Future$().s_concurrent_Future$__f_recoverWithFailedMarker));
  new $c_sjsr_AnonFunction2(((_1$2, _2$2) => new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$c_T2(_1$2, _2$2)));
  new $c_sjsr_AnonFunction2(((b$2, e$2) => {
    var b = b$2;
    return b.addOne__O__scm_Growable(e$2)
  }));
  this.fromTry__s_util_Try__s_concurrent_Future(new $c_s_util_Success((void 0)))
}
$c_s_concurrent_Future$.prototype = new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$h_O();
$c_s_concurrent_Future$.prototype.constructor = $c_s_concurrent_Future$;
/** @constructor */
function $h_s_concurrent_Future$() {
  /*<skip>*/
}
$h_s_concurrent_Future$.prototype = $c_s_concurrent_Future$.prototype;
$c_s_concurrent_Future$.prototype.failed__jl_Throwable__s_concurrent_Future = (function(exception) {
  return $m_s_concurrent_Promise$().failed__jl_Throwable__s_concurrent_Promise(exception)
});
$c_s_concurrent_Future$.prototype.fromTry__s_util_Try__s_concurrent_Future = (function(result) {
  return $ct_s_concurrent_impl_Promise$DefaultPromise__s_util_Try__(new $c_s_concurrent_impl_Promise$DefaultPromise(), result)
});
var $d_s_concurrent_Future$ = new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$TypeData().initClass({
  s_concurrent_Future$: 0
}, false, "scala.concurrent.Future$", {
  s_concurrent_Future$: 1,
  O: 1
});
$c_s_concurrent_Future$.prototype.$classData = $d_s_concurrent_Future$;
var $n_s_concurrent_Future$;
function $m_s_concurrent_Future$() {
  if ((!$n_s_concurrent_Future$)) {
    $n_s_concurrent_Future$ = new $c_s_concurrent_Future$()
  };
  return $n_s_concurrent_Future$
}
function $f_s_concurrent_Promise__complete__s_util_Try__s_concurrent_Promise($thiz, result) {
  if ($thiz.tryComplete__s_util_Try__Z(result)) {
    return $thiz
  } else {
    throw new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$c_jl_IllegalStateException("Promise already completed.")
  }
}
function $f_s_concurrent_Promise__success__O__s_concurrent_Promise($thiz, value) {
  var result = new $c_s_util_Success(value);
  return $f_s_concurrent_Promise__complete__s_util_Try__s_concurrent_Promise($thiz, result)
}
function $f_s_concurrent_Promise__failure__jl_Throwable__s_concurrent_Promise($thiz, cause) {
  var result = new $c_s_util_Failure(cause);
  return $f_s_concurrent_Promise__complete__s_util_Try__s_concurrent_Promise($thiz, result)
}
/** @constructor */
function $c_s_concurrent_Promise$() {
  /*<skip>*/
}
$c_s_concurrent_Promise$.prototype = new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$h_O();
$c_s_concurrent_Promise$.prototype.constructor = $c_s_concurrent_Promise$;
/** @constructor */
function $h_s_concurrent_Promise$() {
  /*<skip>*/
}
$h_s_concurrent_Promise$.prototype = $c_s_concurrent_Promise$.prototype;
$c_s_concurrent_Promise$.prototype.failed__jl_Throwable__s_concurrent_Promise = (function(exception) {
  var result = new $c_s_util_Failure(exception);
  return $ct_s_concurrent_impl_Promise$DefaultPromise__s_util_Try__(new $c_s_concurrent_impl_Promise$DefaultPromise(), result)
});
var $d_s_concurrent_Promise$ = new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$TypeData().initClass({
  s_concurrent_Promise$: 0
}, false, "scala.concurrent.Promise$", {
  s_concurrent_Promise$: 1,
  O: 1
});
$c_s_concurrent_Promise$.prototype.$classData = $d_s_concurrent_Promise$;
var $n_s_concurrent_Promise$;
function $m_s_concurrent_Promise$() {
  if ((!$n_s_concurrent_Promise$)) {
    $n_s_concurrent_Promise$ = new $c_s_concurrent_Promise$()
  };
  return $n_s_concurrent_Promise$
}
/** @constructor */
function $c_s_concurrent_impl_Promise$() {
  this.s_concurrent_impl_Promise$__f_scala$concurrent$impl$Promise$$Noop = null;
  $n_s_concurrent_impl_Promise$ = this;
  this.s_concurrent_impl_Promise$__f_scala$concurrent$impl$Promise$$Noop = $ct_s_concurrent_impl_Promise$Transformation__I__F1__s_concurrent_ExecutionContext__(new $c_s_concurrent_impl_Promise$Transformation(), 0, null, $m_s_concurrent_ExecutionContext$parasitic$())
}
$c_s_concurrent_impl_Promise$.prototype = new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$h_O();
$c_s_concurrent_impl_Promise$.prototype.constructor = $c_s_concurrent_impl_Promise$;
/** @constructor */
function $h_s_concurrent_impl_Promise$() {
  /*<skip>*/
}
$h_s_concurrent_impl_Promise$.prototype = $c_s_concurrent_impl_Promise$.prototype;
$c_s_concurrent_impl_Promise$.prototype.scala$concurrent$impl$Promise$$resolve__s_util_Try__s_util_Try = (function(value) {
  if ((value === null)) {
    throw $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$ct_jl_NullPointerException__(new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$c_jl_NullPointerException())
  };
  if ((value instanceof $c_s_util_Success)) {
    return value
  } else {
    var t = value.s_util_Failure__f_exception;
    return (((false || false) || (t instanceof $c_jl_Error)) ? (false ? new $c_s_util_Success(t.value__O()) : new $c_s_util_Failure(new $c_ju_concurrent_ExecutionException("Boxed Exception", t))) : value)
  }
});
var $d_s_concurrent_impl_Promise$ = new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$TypeData().initClass({
  s_concurrent_impl_Promise$: 0
}, false, "scala.concurrent.impl.Promise$", {
  s_concurrent_impl_Promise$: 1,
  O: 1
});
$c_s_concurrent_impl_Promise$.prototype.$classData = $d_s_concurrent_impl_Promise$;
var $n_s_concurrent_impl_Promise$;
function $m_s_concurrent_impl_Promise$() {
  if ((!$n_s_concurrent_impl_Promise$)) {
    $n_s_concurrent_impl_Promise$ = new $c_s_concurrent_impl_Promise$()
  };
  return $n_s_concurrent_impl_Promise$
}
function $is_s_concurrent_impl_Promise$Callbacks(obj) {
  return (!(!((obj && obj.$classData) && obj.$classData.ancestors.s_concurrent_impl_Promise$Callbacks)))
}
function $isArrayOf_s_concurrent_impl_Promise$Callbacks(obj, depth) {
  return (!(!(((obj && obj.$classData) && (obj.$classData.arrayDepth === depth)) && obj.$classData.arrayBase.ancestors.s_concurrent_impl_Promise$Callbacks)))
}
/** @constructor */
function $c_sjs_concurrent_JSExecutionContext$() {
  this.sjs_concurrent_JSExecutionContext$__f_queue = null;
  $n_sjs_concurrent_JSExecutionContext$ = this;
  this.sjs_concurrent_JSExecutionContext$__f_queue = $m_sjs_concurrent_QueueExecutionContext$().apply__s_concurrent_ExecutionContextExecutor()
}
$c_sjs_concurrent_JSExecutionContext$.prototype = new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$h_O();
$c_sjs_concurrent_JSExecutionContext$.prototype.constructor = $c_sjs_concurrent_JSExecutionContext$;
/** @constructor */
function $h_sjs_concurrent_JSExecutionContext$() {
  /*<skip>*/
}
$h_sjs_concurrent_JSExecutionContext$.prototype = $c_sjs_concurrent_JSExecutionContext$.prototype;
var $d_sjs_concurrent_JSExecutionContext$ = new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$TypeData().initClass({
  sjs_concurrent_JSExecutionContext$: 0
}, false, "scala.scalajs.concurrent.JSExecutionContext$", {
  sjs_concurrent_JSExecutionContext$: 1,
  O: 1
});
$c_sjs_concurrent_JSExecutionContext$.prototype.$classData = $d_sjs_concurrent_JSExecutionContext$;
var $n_sjs_concurrent_JSExecutionContext$;
function $m_sjs_concurrent_JSExecutionContext$() {
  if ((!$n_sjs_concurrent_JSExecutionContext$)) {
    $n_sjs_concurrent_JSExecutionContext$ = new $c_sjs_concurrent_JSExecutionContext$()
  };
  return $n_sjs_concurrent_JSExecutionContext$
}
/** @constructor */
function $c_sjs_concurrent_JSExecutionContext$Implicits$() {
  this.sjs_concurrent_JSExecutionContext$Implicits$__f_queue = null;
  $n_sjs_concurrent_JSExecutionContext$Implicits$ = this;
  this.sjs_concurrent_JSExecutionContext$Implicits$__f_queue = $m_sjs_concurrent_JSExecutionContext$().sjs_concurrent_JSExecutionContext$__f_queue
}
$c_sjs_concurrent_JSExecutionContext$Implicits$.prototype = new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$h_O();
$c_sjs_concurrent_JSExecutionContext$Implicits$.prototype.constructor = $c_sjs_concurrent_JSExecutionContext$Implicits$;
/** @constructor */
function $h_sjs_concurrent_JSExecutionContext$Implicits$() {
  /*<skip>*/
}
$h_sjs_concurrent_JSExecutionContext$Implicits$.prototype = $c_sjs_concurrent_JSExecutionContext$Implicits$.prototype;
var $d_sjs_concurrent_JSExecutionContext$Implicits$ = new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$TypeData().initClass({
  sjs_concurrent_JSExecutionContext$Implicits$: 0
}, false, "scala.scalajs.concurrent.JSExecutionContext$Implicits$", {
  sjs_concurrent_JSExecutionContext$Implicits$: 1,
  O: 1
});
$c_sjs_concurrent_JSExecutionContext$Implicits$.prototype.$classData = $d_sjs_concurrent_JSExecutionContext$Implicits$;
var $n_sjs_concurrent_JSExecutionContext$Implicits$;
function $m_sjs_concurrent_JSExecutionContext$Implicits$() {
  if ((!$n_sjs_concurrent_JSExecutionContext$Implicits$)) {
    $n_sjs_concurrent_JSExecutionContext$Implicits$ = new $c_sjs_concurrent_JSExecutionContext$Implicits$()
  };
  return $n_sjs_concurrent_JSExecutionContext$Implicits$
}
/** @constructor */
function $c_sjs_concurrent_QueueExecutionContext$() {
  /*<skip>*/
}
$c_sjs_concurrent_QueueExecutionContext$.prototype = new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$h_O();
$c_sjs_concurrent_QueueExecutionContext$.prototype.constructor = $c_sjs_concurrent_QueueExecutionContext$;
/** @constructor */
function $h_sjs_concurrent_QueueExecutionContext$() {
  /*<skip>*/
}
$h_sjs_concurrent_QueueExecutionContext$.prototype = $c_sjs_concurrent_QueueExecutionContext$.prototype;
$c_sjs_concurrent_QueueExecutionContext$.prototype.apply__s_concurrent_ExecutionContextExecutor = (function() {
  return (((typeof Promise) === "undefined") ? new $c_sjs_concurrent_QueueExecutionContext$TimeoutsExecutionContext() : new $c_sjs_concurrent_QueueExecutionContext$PromisesExecutionContext())
});
var $d_sjs_concurrent_QueueExecutionContext$ = new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$TypeData().initClass({
  sjs_concurrent_QueueExecutionContext$: 0
}, false, "scala.scalajs.concurrent.QueueExecutionContext$", {
  sjs_concurrent_QueueExecutionContext$: 1,
  O: 1
});
$c_sjs_concurrent_QueueExecutionContext$.prototype.$classData = $d_sjs_concurrent_QueueExecutionContext$;
var $n_sjs_concurrent_QueueExecutionContext$;
function $m_sjs_concurrent_QueueExecutionContext$() {
  if ((!$n_sjs_concurrent_QueueExecutionContext$)) {
    $n_sjs_concurrent_QueueExecutionContext$ = new $c_sjs_concurrent_QueueExecutionContext$()
  };
  return $n_sjs_concurrent_QueueExecutionContext$
}
/** @constructor */
function $c_sjs_js_Thenable$ThenableOps$() {
  /*<skip>*/
}
$c_sjs_js_Thenable$ThenableOps$.prototype = new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$h_O();
$c_sjs_js_Thenable$ThenableOps$.prototype.constructor = $c_sjs_js_Thenable$ThenableOps$;
/** @constructor */
function $h_sjs_js_Thenable$ThenableOps$() {
  /*<skip>*/
}
$h_sjs_js_Thenable$ThenableOps$.prototype = $c_sjs_js_Thenable$ThenableOps$.prototype;
$c_sjs_js_Thenable$ThenableOps$.prototype.toFuture$extension__sjs_js_Thenable__s_concurrent_Future = (function(this$) {
  var p2 = $ct_s_concurrent_impl_Promise$DefaultPromise__(new $c_s_concurrent_impl_Promise$DefaultPromise());
  this$.then(((arg1$2) => $m_sjs_js_Thenable$ThenableOps$().scala$scalajs$js$Thenable$ThenableOps$$$anonfun$toFuture$1__O__s_concurrent_Promise__sjs_js_$bar(arg1$2, p2)), $m_sjs_js_defined$().apply__O__sjs_js_$bar(((arg1$2$1) => $m_sjs_js_Thenable$ThenableOps$().scala$scalajs$js$Thenable$ThenableOps$$$anonfun$toFuture$2__O__s_concurrent_Promise__sjs_js_$bar(arg1$2$1, p2))));
  return p2
});
$c_sjs_js_Thenable$ThenableOps$.prototype.scala$scalajs$js$Thenable$ThenableOps$$$anonfun$toFuture$1__O__s_concurrent_Promise__sjs_js_$bar = (function(v, p2$1) {
  $f_s_concurrent_Promise__success__O__s_concurrent_Promise(p2$1, v)
});
$c_sjs_js_Thenable$ThenableOps$.prototype.scala$scalajs$js$Thenable$ThenableOps$$$anonfun$toFuture$2__O__s_concurrent_Promise__sjs_js_$bar = (function(e, p2$1) {
  var cause = ((e instanceof $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$c_jl_Throwable) ? e : new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$c_sjs_js_JavaScriptException(e));
  $f_s_concurrent_Promise__failure__jl_Throwable__s_concurrent_Promise(p2$1, cause)
});
var $d_sjs_js_Thenable$ThenableOps$ = new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$TypeData().initClass({
  sjs_js_Thenable$ThenableOps$: 0
}, false, "scala.scalajs.js.Thenable$ThenableOps$", {
  sjs_js_Thenable$ThenableOps$: 1,
  O: 1
});
$c_sjs_js_Thenable$ThenableOps$.prototype.$classData = $d_sjs_js_Thenable$ThenableOps$;
var $n_sjs_js_Thenable$ThenableOps$;
function $m_sjs_js_Thenable$ThenableOps$() {
  if ((!$n_sjs_js_Thenable$ThenableOps$)) {
    $n_sjs_js_Thenable$ThenableOps$ = new $c_sjs_js_Thenable$ThenableOps$()
  };
  return $n_sjs_js_Thenable$ThenableOps$
}
/** @constructor */
function $c_sjs_js_WrappedDictionary$Cache$() {
  this.sjs_js_WrappedDictionary$Cache$__f_safeHasOwnProperty = null;
  $n_sjs_js_WrappedDictionary$Cache$ = this;
  this.sjs_js_WrappedDictionary$Cache$__f_safeHasOwnProperty = Object.prototype.hasOwnProperty
}
$c_sjs_js_WrappedDictionary$Cache$.prototype = new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$h_O();
$c_sjs_js_WrappedDictionary$Cache$.prototype.constructor = $c_sjs_js_WrappedDictionary$Cache$;
/** @constructor */
function $h_sjs_js_WrappedDictionary$Cache$() {
  /*<skip>*/
}
$h_sjs_js_WrappedDictionary$Cache$.prototype = $c_sjs_js_WrappedDictionary$Cache$.prototype;
var $d_sjs_js_WrappedDictionary$Cache$ = new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$TypeData().initClass({
  sjs_js_WrappedDictionary$Cache$: 0
}, false, "scala.scalajs.js.WrappedDictionary$Cache$", {
  sjs_js_WrappedDictionary$Cache$: 1,
  O: 1
});
$c_sjs_js_WrappedDictionary$Cache$.prototype.$classData = $d_sjs_js_WrappedDictionary$Cache$;
var $n_sjs_js_WrappedDictionary$Cache$;
function $m_sjs_js_WrappedDictionary$Cache$() {
  if ((!$n_sjs_js_WrappedDictionary$Cache$)) {
    $n_sjs_js_WrappedDictionary$Cache$ = new $c_sjs_js_WrappedDictionary$Cache$()
  };
  return $n_sjs_js_WrappedDictionary$Cache$
}
/** @constructor */
function $c_sjs_js_defined$() {
  /*<skip>*/
}
$c_sjs_js_defined$.prototype = new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$h_O();
$c_sjs_js_defined$.prototype.constructor = $c_sjs_js_defined$;
/** @constructor */
function $h_sjs_js_defined$() {
  /*<skip>*/
}
$h_sjs_js_defined$.prototype = $c_sjs_js_defined$.prototype;
$c_sjs_js_defined$.prototype.apply__O__sjs_js_$bar = (function(a) {
  return a
});
var $d_sjs_js_defined$ = new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$TypeData().initClass({
  sjs_js_defined$: 0
}, false, "scala.scalajs.js.defined$", {
  sjs_js_defined$: 1,
  O: 1
});
$c_sjs_js_defined$.prototype.$classData = $d_sjs_js_defined$;
var $n_sjs_js_defined$;
function $m_sjs_js_defined$() {
  if ((!$n_sjs_js_defined$)) {
    $n_sjs_js_defined$ = new $c_sjs_js_defined$()
  };
  return $n_sjs_js_defined$
}
/** @constructor */
function $c_sjs_js_timers_package$() {
  /*<skip>*/
}
$c_sjs_js_timers_package$.prototype = new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$h_O();
$c_sjs_js_timers_package$.prototype.constructor = $c_sjs_js_timers_package$;
/** @constructor */
function $h_sjs_js_timers_package$() {
  /*<skip>*/
}
$h_sjs_js_timers_package$.prototype = $c_sjs_js_timers_package$.prototype;
$c_sjs_js_timers_package$.prototype.setTimeout__D__F0__sjs_js_timers_SetTimeoutHandle = (function(interval, body) {
  return setTimeout((() => {
    body.apply__O()
  }), interval)
});
var $d_sjs_js_timers_package$ = new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$TypeData().initClass({
  sjs_js_timers_package$: 0
}, false, "scala.scalajs.js.timers.package$", {
  sjs_js_timers_package$: 1,
  O: 1
});
$c_sjs_js_timers_package$.prototype.$classData = $d_sjs_js_timers_package$;
var $n_sjs_js_timers_package$;
function $m_sjs_js_timers_package$() {
  if ((!$n_sjs_js_timers_package$)) {
    $n_sjs_js_timers_package$ = new $c_sjs_js_timers_package$()
  };
  return $n_sjs_js_timers_package$
}
/** @constructor */
function $c_sjsr_Compat$() {
  /*<skip>*/
}
$c_sjsr_Compat$.prototype = new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$h_O();
$c_sjsr_Compat$.prototype.constructor = $c_sjsr_Compat$;
/** @constructor */
function $h_sjsr_Compat$() {
  /*<skip>*/
}
$h_sjsr_Compat$.prototype = $c_sjsr_Compat$.prototype;
$c_sjsr_Compat$.prototype.toJSVarArgsImpl__sci_Seq__sjs_js_Array = (function(seq) {
  if ((seq instanceof $c_sjsr_WrappedVarArgs)) {
    var x2 = seq;
    return x2.sjsr_WrappedVarArgs__f_scala$scalajs$runtime$WrappedVarArgs$$array
  } else {
    var result = [];
    seq.foreach__F1__V(new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$c_sjsr_AnonFunction1(((x$2) => (result.push(x$2) | 0))));
    return result
  }
});
var $d_sjsr_Compat$ = new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$TypeData().initClass({
  sjsr_Compat$: 0
}, false, "scala.scalajs.runtime.Compat$", {
  sjsr_Compat$: 1,
  O: 1
});
$c_sjsr_Compat$.prototype.$classData = $d_sjsr_Compat$;
var $n_sjsr_Compat$;
function $m_sjsr_Compat$() {
  if ((!$n_sjsr_Compat$)) {
    $n_sjsr_Compat$ = new $c_sjsr_Compat$()
  };
  return $n_sjsr_Compat$
}
/** @constructor */
function $c_s_util_CommandLineParser$() {
  /*<skip>*/
}
$c_s_util_CommandLineParser$.prototype = new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$h_O();
$c_s_util_CommandLineParser$.prototype.constructor = $c_s_util_CommandLineParser$;
/** @constructor */
function $h_s_util_CommandLineParser$() {
  /*<skip>*/
}
$h_s_util_CommandLineParser$.prototype = $c_s_util_CommandLineParser$.prototype;
$c_s_util_CommandLineParser$.prototype.showError__s_util_CommandLineParser$ParseError__V = (function(err) {
  var where = ((err.idx__I() === 0) ? "" : ((err.idx__I() === 1) ? " after first argument" : ((" after " + err.idx__I()) + " arguments")));
  var x = ((("Illegal command line" + where) + ": ") + err.msg__T());
  var this$2 = $m_s_Console$();
  var this$3 = this$2.out__Ljava_io_PrintStream();
  this$3.java$lang$JSConsoleBasedPrintStream$$printString__T__V((x + "\n"))
});
var $d_s_util_CommandLineParser$ = new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$TypeData().initClass({
  s_util_CommandLineParser$: 0
}, false, "scala.util.CommandLineParser$", {
  s_util_CommandLineParser$: 1,
  O: 1
});
$c_s_util_CommandLineParser$.prototype.$classData = $d_s_util_CommandLineParser$;
var $n_s_util_CommandLineParser$;
function $m_s_util_CommandLineParser$() {
  if ((!$n_s_util_CommandLineParser$)) {
    $n_s_util_CommandLineParser$ = new $c_s_util_CommandLineParser$()
  };
  return $n_s_util_CommandLineParser$
}
/** @constructor */
function $c_s_util_DynamicVariable(init) {
  this.s_util_DynamicVariable__f_v = null;
  this.s_util_DynamicVariable__f_v = init
}
$c_s_util_DynamicVariable.prototype = new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$h_O();
$c_s_util_DynamicVariable.prototype.constructor = $c_s_util_DynamicVariable;
/** @constructor */
function $h_s_util_DynamicVariable() {
  /*<skip>*/
}
$h_s_util_DynamicVariable.prototype = $c_s_util_DynamicVariable.prototype;
$c_s_util_DynamicVariable.prototype.toString__T = (function() {
  return (("DynamicVariable(" + this.s_util_DynamicVariable__f_v) + ")")
});
var $d_s_util_DynamicVariable = new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$TypeData().initClass({
  s_util_DynamicVariable: 0
}, false, "scala.util.DynamicVariable", {
  s_util_DynamicVariable: 1,
  O: 1
});
$c_s_util_DynamicVariable.prototype.$classData = $d_s_util_DynamicVariable;
function $f_s_util_control_NoStackTrace__fillInStackTrace__jl_Throwable($thiz) {
  var this$1 = $m_s_util_control_NoStackTrace$();
  if (this$1.s_util_control_NoStackTrace$__f__noSuppression) {
    return $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$c_jl_Throwable.prototype.fillInStackTrace__jl_Throwable.call($thiz)
  } else {
    return $thiz
  }
}
/** @constructor */
function $c_s_util_control_NonFatal$() {
  /*<skip>*/
}
$c_s_util_control_NonFatal$.prototype = new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$h_O();
$c_s_util_control_NonFatal$.prototype.constructor = $c_s_util_control_NonFatal$;
/** @constructor */
function $h_s_util_control_NonFatal$() {
  /*<skip>*/
}
$h_s_util_control_NonFatal$.prototype = $c_s_util_control_NonFatal$.prototype;
$c_s_util_control_NonFatal$.prototype.apply__jl_Throwable__Z = (function(t) {
  return (!((t instanceof $c_jl_VirtualMachineError) || (false || (false || (false || false)))))
});
$c_s_util_control_NonFatal$.prototype.unapply__jl_Throwable__s_Option = (function(t) {
  return (this.apply__jl_Throwable__Z(t) ? new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$c_s_Some(t) : $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$m_s_None$())
});
var $d_s_util_control_NonFatal$ = new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$TypeData().initClass({
  s_util_control_NonFatal$: 0
}, false, "scala.util.control.NonFatal$", {
  s_util_control_NonFatal$: 1,
  O: 1
});
$c_s_util_control_NonFatal$.prototype.$classData = $d_s_util_control_NonFatal$;
var $n_s_util_control_NonFatal$;
function $m_s_util_control_NonFatal$() {
  if ((!$n_s_util_control_NonFatal$)) {
    $n_s_util_control_NonFatal$ = new $c_s_util_control_NonFatal$()
  };
  return $n_s_util_control_NonFatal$
}
/** @constructor */
function $c_Lbe_doeraene_webcomponents_ui5_Title$() {
  this.Lbe_doeraene_webcomponents_ui5_Title$__f_tag = null;
  this.Lbe_doeraene_webcomponents_ui5_Title$__f_level$lzy1 = null;
  this.Lbe_doeraene_webcomponents_ui5_Title$__f_levelbitmap$1 = false;
  $n_Lbe_doeraene_webcomponents_ui5_Title$ = this;
  $f_Lbe_doeraene_webcomponents_WebComponent__$init$__V(this);
  $i_$0040ui5$002fwebcomponents$002fdist$002fTitle$002ejs.default;
  $m_Lcom_raquo_laminar_api_package$();
  $m_Lcom_raquo_laminar_api_package$();
  var void$1 = false;
  this.Lbe_doeraene_webcomponents_ui5_Title$__f_tag = new $c_Lcom_raquo_laminar_tags_HtmlTag("ui5-title", void$1)
}
$c_Lbe_doeraene_webcomponents_ui5_Title$.prototype = new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$h_O();
$c_Lbe_doeraene_webcomponents_ui5_Title$.prototype.constructor = $c_Lbe_doeraene_webcomponents_ui5_Title$;
/** @constructor */
function $h_Lbe_doeraene_webcomponents_ui5_Title$() {
  /*<skip>*/
}
$h_Lbe_doeraene_webcomponents_ui5_Title$.prototype = $c_Lbe_doeraene_webcomponents_ui5_Title$.prototype;
$c_Lbe_doeraene_webcomponents_ui5_Title$.prototype.be$doeraene$webcomponents$WebComponent$_setter_$id_$eq__Lcom_raquo_laminar_keys_HtmlProp__V = (function(x$0) {
  /*<skip>*/
});
$c_Lbe_doeraene_webcomponents_ui5_Title$.prototype.tag__Lcom_raquo_laminar_tags_HtmlTag = (function() {
  return this.Lbe_doeraene_webcomponents_ui5_Title$__f_tag
});
$c_Lbe_doeraene_webcomponents_ui5_Title$.prototype.level__Lcom_raquo_laminar_keys_HtmlAttr = (function() {
  if ((!this.Lbe_doeraene_webcomponents_ui5_Title$__f_levelbitmap$1)) {
    $m_Lcom_raquo_laminar_api_package$();
    var codec = $m_Lbe_doeraene_webcomponents_ui5_configkeys_TitleLevel$().AsStringCodec__Lbe_doeraene_webcomponents_ui5_configkeys_EnumerationString$AsStringCodec$();
    this.Lbe_doeraene_webcomponents_ui5_Title$__f_level$lzy1 = new $c_Lcom_raquo_laminar_keys_HtmlAttr("level", codec);
    this.Lbe_doeraene_webcomponents_ui5_Title$__f_levelbitmap$1 = true
  };
  return this.Lbe_doeraene_webcomponents_ui5_Title$__f_level$lzy1
});
$c_Lbe_doeraene_webcomponents_ui5_Title$.prototype.h2__sci_Seq__Lcom_raquo_laminar_nodes_ReactiveHtmlElement = (function(mods) {
  var elem = new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$c_sjsr_AnonFunction1(((_$2) => {
    var _$2$1 = _$2;
    return _$2$1.level__Lcom_raquo_laminar_keys_HtmlAttr().$colon$eq__O__Lcom_raquo_laminar_modifiers_KeySetter($m_Lbe_doeraene_webcomponents_ui5_configkeys_TitleLevel$H2$())
  }));
  var mods$1 = mods.appended__O__O(elem);
  return $f_Lbe_doeraene_webcomponents_WebComponent__apply__sci_Seq__Lcom_raquo_laminar_nodes_ReactiveHtmlElement(this, mods$1)
});
function $isArrayOf_Lbe_doeraene_webcomponents_ui5_Title$(obj, depth) {
  return (!(!(((obj && obj.$classData) && (obj.$classData.arrayDepth === depth)) && obj.$classData.arrayBase.ancestors.Lbe_doeraene_webcomponents_ui5_Title$)))
}
var $d_Lbe_doeraene_webcomponents_ui5_Title$ = new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$TypeData().initClass({
  Lbe_doeraene_webcomponents_ui5_Title$: 0
}, false, "be.doeraene.webcomponents.ui5.Title$", {
  Lbe_doeraene_webcomponents_ui5_Title$: 1,
  O: 1,
  Lbe_doeraene_webcomponents_WebComponent: 1
});
$c_Lbe_doeraene_webcomponents_ui5_Title$.prototype.$classData = $d_Lbe_doeraene_webcomponents_ui5_Title$;
var $n_Lbe_doeraene_webcomponents_ui5_Title$;
function $m_Lbe_doeraene_webcomponents_ui5_Title$() {
  if ((!$n_Lbe_doeraene_webcomponents_ui5_Title$)) {
    $n_Lbe_doeraene_webcomponents_ui5_Title$ = new $c_Lbe_doeraene_webcomponents_ui5_Title$()
  };
  return $n_Lbe_doeraene_webcomponents_ui5_Title$
}
/** @constructor */
function $c_Lbe_doeraene_webcomponents_ui5_UploadCollection$() {
  this.Lbe_doeraene_webcomponents_ui5_UploadCollection$__f_tag = null;
  this.Lbe_doeraene_webcomponents_ui5_UploadCollection$__f_mode$lzy1 = null;
  this.Lbe_doeraene_webcomponents_ui5_UploadCollection$__f_modebitmap$1 = false;
  $n_Lbe_doeraene_webcomponents_ui5_UploadCollection$ = this;
  $f_Lbe_doeraene_webcomponents_WebComponent__$init$__V(this);
  $i_$0040ui5$002fwebcomponents$002dfiori$002fdist$002fUploadCollection$002ejs.default;
  $m_Lcom_raquo_laminar_api_package$();
  $m_Lcom_raquo_laminar_api_package$();
  var void$1 = false;
  this.Lbe_doeraene_webcomponents_ui5_UploadCollection$__f_tag = new $c_Lcom_raquo_laminar_tags_HtmlTag("ui5-upload-collection", void$1)
}
$c_Lbe_doeraene_webcomponents_ui5_UploadCollection$.prototype = new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$h_O();
$c_Lbe_doeraene_webcomponents_ui5_UploadCollection$.prototype.constructor = $c_Lbe_doeraene_webcomponents_ui5_UploadCollection$;
/** @constructor */
function $h_Lbe_doeraene_webcomponents_ui5_UploadCollection$() {
  /*<skip>*/
}
$h_Lbe_doeraene_webcomponents_ui5_UploadCollection$.prototype = $c_Lbe_doeraene_webcomponents_ui5_UploadCollection$.prototype;
$c_Lbe_doeraene_webcomponents_ui5_UploadCollection$.prototype.be$doeraene$webcomponents$WebComponent$_setter_$id_$eq__Lcom_raquo_laminar_keys_HtmlProp__V = (function(x$0) {
  /*<skip>*/
});
$c_Lbe_doeraene_webcomponents_ui5_UploadCollection$.prototype.tag__Lcom_raquo_laminar_tags_HtmlTag = (function() {
  return this.Lbe_doeraene_webcomponents_ui5_UploadCollection$__f_tag
});
$c_Lbe_doeraene_webcomponents_ui5_UploadCollection$.prototype.mode__Lcom_raquo_laminar_keys_HtmlAttr = (function() {
  if ((!this.Lbe_doeraene_webcomponents_ui5_UploadCollection$__f_modebitmap$1)) {
    $m_Lcom_raquo_laminar_api_package$();
    var codec = $m_Lbe_doeraene_webcomponents_ui5_configkeys_ListMode$().AsStringCodec__Lbe_doeraene_webcomponents_ui5_configkeys_EnumerationString$AsStringCodec$();
    this.Lbe_doeraene_webcomponents_ui5_UploadCollection$__f_mode$lzy1 = new $c_Lcom_raquo_laminar_keys_HtmlAttr("mode", codec);
    this.Lbe_doeraene_webcomponents_ui5_UploadCollection$__f_modebitmap$1 = true
  };
  return this.Lbe_doeraene_webcomponents_ui5_UploadCollection$__f_mode$lzy1
});
function $isArrayOf_Lbe_doeraene_webcomponents_ui5_UploadCollection$(obj, depth) {
  return (!(!(((obj && obj.$classData) && (obj.$classData.arrayDepth === depth)) && obj.$classData.arrayBase.ancestors.Lbe_doeraene_webcomponents_ui5_UploadCollection$)))
}
var $d_Lbe_doeraene_webcomponents_ui5_UploadCollection$ = new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$TypeData().initClass({
  Lbe_doeraene_webcomponents_ui5_UploadCollection$: 0
}, false, "be.doeraene.webcomponents.ui5.UploadCollection$", {
  Lbe_doeraene_webcomponents_ui5_UploadCollection$: 1,
  O: 1,
  Lbe_doeraene_webcomponents_WebComponent: 1
});
$c_Lbe_doeraene_webcomponents_ui5_UploadCollection$.prototype.$classData = $d_Lbe_doeraene_webcomponents_ui5_UploadCollection$;
var $n_Lbe_doeraene_webcomponents_ui5_UploadCollection$;
function $m_Lbe_doeraene_webcomponents_ui5_UploadCollection$() {
  if ((!$n_Lbe_doeraene_webcomponents_ui5_UploadCollection$)) {
    $n_Lbe_doeraene_webcomponents_ui5_UploadCollection$ = new $c_Lbe_doeraene_webcomponents_ui5_UploadCollection$()
  };
  return $n_Lbe_doeraene_webcomponents_ui5_UploadCollection$
}
/** @constructor */
function $c_Lbe_doeraene_webcomponents_ui5_UploadCollectionItem$() {
  this.Lbe_doeraene_webcomponents_ui5_UploadCollectionItem$__f_tag = null;
  this.Lbe_doeraene_webcomponents_ui5_UploadCollectionItem$__f_fileName$lzy1 = null;
  this.Lbe_doeraene_webcomponents_ui5_UploadCollectionItem$__f_fileNamebitmap$1 = false;
  this.Lbe_doeraene_webcomponents_ui5_UploadCollectionItem$__f_fileNameClickable$lzy1 = null;
  this.Lbe_doeraene_webcomponents_ui5_UploadCollectionItem$__f_fileNameClickablebitmap$1 = false;
  $n_Lbe_doeraene_webcomponents_ui5_UploadCollectionItem$ = this;
  $f_Lbe_doeraene_webcomponents_WebComponent__$init$__V(this);
  $i_$0040ui5$002fwebcomponents$002dfiori$002fdist$002fUploadCollectionItem$002ejs.default;
  $m_Lcom_raquo_laminar_api_package$();
  $m_Lcom_raquo_laminar_api_package$();
  var void$1 = false;
  this.Lbe_doeraene_webcomponents_ui5_UploadCollectionItem$__f_tag = new $c_Lcom_raquo_laminar_tags_HtmlTag("ui5-upload-collection-item", void$1)
}
$c_Lbe_doeraene_webcomponents_ui5_UploadCollectionItem$.prototype = new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$h_O();
$c_Lbe_doeraene_webcomponents_ui5_UploadCollectionItem$.prototype.constructor = $c_Lbe_doeraene_webcomponents_ui5_UploadCollectionItem$;
/** @constructor */
function $h_Lbe_doeraene_webcomponents_ui5_UploadCollectionItem$() {
  /*<skip>*/
}
$h_Lbe_doeraene_webcomponents_ui5_UploadCollectionItem$.prototype = $c_Lbe_doeraene_webcomponents_ui5_UploadCollectionItem$.prototype;
$c_Lbe_doeraene_webcomponents_ui5_UploadCollectionItem$.prototype.be$doeraene$webcomponents$WebComponent$_setter_$id_$eq__Lcom_raquo_laminar_keys_HtmlProp__V = (function(x$0) {
  /*<skip>*/
});
$c_Lbe_doeraene_webcomponents_ui5_UploadCollectionItem$.prototype.tag__Lcom_raquo_laminar_tags_HtmlTag = (function() {
  return this.Lbe_doeraene_webcomponents_ui5_UploadCollectionItem$__f_tag
});
$c_Lbe_doeraene_webcomponents_ui5_UploadCollectionItem$.prototype.fileName__Lcom_raquo_laminar_keys_HtmlAttr = (function() {
  if ((!this.Lbe_doeraene_webcomponents_ui5_UploadCollectionItem$__f_fileNamebitmap$1)) {
    $m_Lcom_raquo_laminar_api_package$();
    var codec = $m_Lcom_raquo_laminar_codecs_package$().Lcom_raquo_laminar_codecs_package$__f_StringAsIsCodec;
    this.Lbe_doeraene_webcomponents_ui5_UploadCollectionItem$__f_fileName$lzy1 = new $c_Lcom_raquo_laminar_keys_HtmlAttr("file-name", codec);
    this.Lbe_doeraene_webcomponents_ui5_UploadCollectionItem$__f_fileNamebitmap$1 = true
  };
  return this.Lbe_doeraene_webcomponents_ui5_UploadCollectionItem$__f_fileName$lzy1
});
$c_Lbe_doeraene_webcomponents_ui5_UploadCollectionItem$.prototype.fileNameClickable__Lcom_raquo_laminar_keys_HtmlAttr = (function() {
  if ((!this.Lbe_doeraene_webcomponents_ui5_UploadCollectionItem$__f_fileNameClickablebitmap$1)) {
    $m_Lcom_raquo_laminar_api_package$();
    var codec = $m_Lcom_raquo_laminar_codecs_package$().Lcom_raquo_laminar_codecs_package$__f_BooleanAsAttrPresenceCodec;
    this.Lbe_doeraene_webcomponents_ui5_UploadCollectionItem$__f_fileNameClickable$lzy1 = new $c_Lcom_raquo_laminar_keys_HtmlAttr("file-name-clickable", codec);
    this.Lbe_doeraene_webcomponents_ui5_UploadCollectionItem$__f_fileNameClickablebitmap$1 = true
  };
  return this.Lbe_doeraene_webcomponents_ui5_UploadCollectionItem$__f_fileNameClickable$lzy1
});
function $isArrayOf_Lbe_doeraene_webcomponents_ui5_UploadCollectionItem$(obj, depth) {
  return (!(!(((obj && obj.$classData) && (obj.$classData.arrayDepth === depth)) && obj.$classData.arrayBase.ancestors.Lbe_doeraene_webcomponents_ui5_UploadCollectionItem$)))
}
var $d_Lbe_doeraene_webcomponents_ui5_UploadCollectionItem$ = new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$TypeData().initClass({
  Lbe_doeraene_webcomponents_ui5_UploadCollectionItem$: 0
}, false, "be.doeraene.webcomponents.ui5.UploadCollectionItem$", {
  Lbe_doeraene_webcomponents_ui5_UploadCollectionItem$: 1,
  O: 1,
  Lbe_doeraene_webcomponents_WebComponent: 1
});
$c_Lbe_doeraene_webcomponents_ui5_UploadCollectionItem$.prototype.$classData = $d_Lbe_doeraene_webcomponents_ui5_UploadCollectionItem$;
var $n_Lbe_doeraene_webcomponents_ui5_UploadCollectionItem$;
function $m_Lbe_doeraene_webcomponents_ui5_UploadCollectionItem$() {
  if ((!$n_Lbe_doeraene_webcomponents_ui5_UploadCollectionItem$)) {
    $n_Lbe_doeraene_webcomponents_ui5_UploadCollectionItem$ = new $c_Lbe_doeraene_webcomponents_ui5_UploadCollectionItem$()
  };
  return $n_Lbe_doeraene_webcomponents_ui5_UploadCollectionItem$
}
/** @constructor */
function $c_Lbe_doeraene_webcomponents_ui5_configkeys_EnumerationString$AsStringCodec$(outer) {
  this.Lbe_doeraene_webcomponents_ui5_configkeys_EnumerationString$AsStringCodec$__f_$outer = null;
  if ((outer === null)) {
    throw $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$ct_jl_NullPointerException__(new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$c_jl_NullPointerException())
  };
  this.Lbe_doeraene_webcomponents_ui5_configkeys_EnumerationString$AsStringCodec$__f_$outer = outer
}
$c_Lbe_doeraene_webcomponents_ui5_configkeys_EnumerationString$AsStringCodec$.prototype = new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$h_O();
$c_Lbe_doeraene_webcomponents_ui5_configkeys_EnumerationString$AsStringCodec$.prototype.constructor = $c_Lbe_doeraene_webcomponents_ui5_configkeys_EnumerationString$AsStringCodec$;
/** @constructor */
function $h_Lbe_doeraene_webcomponents_ui5_configkeys_EnumerationString$AsStringCodec$() {
  /*<skip>*/
}
$h_Lbe_doeraene_webcomponents_ui5_configkeys_EnumerationString$AsStringCodec$.prototype = $c_Lbe_doeraene_webcomponents_ui5_configkeys_EnumerationString$AsStringCodec$.prototype;
$c_Lbe_doeraene_webcomponents_ui5_configkeys_EnumerationString$AsStringCodec$.prototype.encode__O__T = (function(value) {
  return this.Lbe_doeraene_webcomponents_ui5_configkeys_EnumerationString$AsStringCodec$__f_$outer.valueOf__O__T(value)
});
$c_Lbe_doeraene_webcomponents_ui5_configkeys_EnumerationString$AsStringCodec$.prototype.decode__T__O = (function(s) {
  var this$1 = this.Lbe_doeraene_webcomponents_ui5_configkeys_EnumerationString$AsStringCodec$__f_$outer;
  var this$2 = $f_Lbe_doeraene_webcomponents_ui5_configkeys_EnumerationString__fromString__T__s_Option(this$1, s);
  if (this$2.isEmpty__Z()) {
    throw $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$ct_jl_IllegalArgumentException__T__(new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$c_jl_IllegalArgumentException(), ((s + " is not a valid value for ") + this))
  } else {
    return this$2.get__O()
  }
});
$c_Lbe_doeraene_webcomponents_ui5_configkeys_EnumerationString$AsStringCodec$.prototype.encode__O__O = (function(scalaValue) {
  return this.encode__O__T(scalaValue)
});
$c_Lbe_doeraene_webcomponents_ui5_configkeys_EnumerationString$AsStringCodec$.prototype.decode__O__O = (function(domValue) {
  return this.decode__T__O(domValue)
});
var $d_Lbe_doeraene_webcomponents_ui5_configkeys_EnumerationString$AsStringCodec$ = new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$TypeData().initClass({
  Lbe_doeraene_webcomponents_ui5_configkeys_EnumerationString$AsStringCodec$: 0
}, false, "be.doeraene.webcomponents.ui5.configkeys.EnumerationString$AsStringCodec$", {
  Lbe_doeraene_webcomponents_ui5_configkeys_EnumerationString$AsStringCodec$: 1,
  O: 1,
  Lcom_raquo_laminar_codecs_Codec: 1
});
$c_Lbe_doeraene_webcomponents_ui5_configkeys_EnumerationString$AsStringCodec$.prototype.$classData = $d_Lbe_doeraene_webcomponents_ui5_configkeys_EnumerationString$AsStringCodec$;
/** @constructor */
function $c_Lbe_doeraene_webcomponents_ui5_configkeys_IconName$$anon$1() {
  /*<skip>*/
}
$c_Lbe_doeraene_webcomponents_ui5_configkeys_IconName$$anon$1.prototype = new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$h_O();
$c_Lbe_doeraene_webcomponents_ui5_configkeys_IconName$$anon$1.prototype.constructor = $c_Lbe_doeraene_webcomponents_ui5_configkeys_IconName$$anon$1;
/** @constructor */
function $h_Lbe_doeraene_webcomponents_ui5_configkeys_IconName$$anon$1() {
  /*<skip>*/
}
$h_Lbe_doeraene_webcomponents_ui5_configkeys_IconName$$anon$1.prototype = $c_Lbe_doeraene_webcomponents_ui5_configkeys_IconName$$anon$1.prototype;
$c_Lbe_doeraene_webcomponents_ui5_configkeys_IconName$$anon$1.prototype.encode__O__O = (function(scalaValue) {
  return scalaValue
});
$c_Lbe_doeraene_webcomponents_ui5_configkeys_IconName$$anon$1.prototype.decode__O__O = (function(domValue) {
  var domValue$1 = domValue;
  return domValue$1
});
var $d_Lbe_doeraene_webcomponents_ui5_configkeys_IconName$$anon$1 = new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$TypeData().initClass({
  Lbe_doeraene_webcomponents_ui5_configkeys_IconName$$anon$1: 0
}, false, "be.doeraene.webcomponents.ui5.configkeys.IconName$$anon$1", {
  Lbe_doeraene_webcomponents_ui5_configkeys_IconName$$anon$1: 1,
  O: 1,
  Lcom_raquo_laminar_codecs_Codec: 1
});
$c_Lbe_doeraene_webcomponents_ui5_configkeys_IconName$$anon$1.prototype.$classData = $d_Lbe_doeraene_webcomponents_ui5_configkeys_IconName$$anon$1;
/** @constructor */
function $c_Lbe_doeraene_webcomponents_ui5_configkeys_TitleLevel$() {
  this.Lbe_doeraene_webcomponents_ui5_configkeys_TitleLevel$__f_valueFromString$lzy1 = null;
  this.Lbe_doeraene_webcomponents_ui5_configkeys_TitleLevel$__f_valueFromStringbitmap$1 = false;
  this.Lbe_doeraene_webcomponents_ui5_configkeys_TitleLevel$__f_AsStringCodec$lzy1 = null;
  this.Lbe_doeraene_webcomponents_ui5_configkeys_TitleLevel$__f_AsStringCodecbitmap$1 = false;
  this.Lbe_doeraene_webcomponents_ui5_configkeys_TitleLevel$__f_allValues = null;
  $n_Lbe_doeraene_webcomponents_ui5_configkeys_TitleLevel$ = this;
  $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$m_s_package$();
  var elems = $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$m_sr_ScalaRunTime$().wrapRefArray__AO__sci_ArraySeq(new ($d_Lbe_doeraene_webcomponents_ui5_configkeys_TitleLevel.getArrayOf().constr)([$m_Lbe_doeraene_webcomponents_ui5_configkeys_TitleLevel$H1$(), $m_Lbe_doeraene_webcomponents_ui5_configkeys_TitleLevel$H2$(), $m_Lbe_doeraene_webcomponents_ui5_configkeys_TitleLevel$H3$(), $m_Lbe_doeraene_webcomponents_ui5_configkeys_TitleLevel$H4$(), $m_Lbe_doeraene_webcomponents_ui5_configkeys_TitleLevel$H5$(), $m_Lbe_doeraene_webcomponents_ui5_configkeys_TitleLevel$H6$()]));
  this.Lbe_doeraene_webcomponents_ui5_configkeys_TitleLevel$__f_allValues = $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$m_sci_Nil$().prependedAll__sc_IterableOnce__sci_List(elems)
}
$c_Lbe_doeraene_webcomponents_ui5_configkeys_TitleLevel$.prototype = new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$h_O();
$c_Lbe_doeraene_webcomponents_ui5_configkeys_TitleLevel$.prototype.constructor = $c_Lbe_doeraene_webcomponents_ui5_configkeys_TitleLevel$;
/** @constructor */
function $h_Lbe_doeraene_webcomponents_ui5_configkeys_TitleLevel$() {
  /*<skip>*/
}
$h_Lbe_doeraene_webcomponents_ui5_configkeys_TitleLevel$.prototype = $c_Lbe_doeraene_webcomponents_ui5_configkeys_TitleLevel$.prototype;
$c_Lbe_doeraene_webcomponents_ui5_configkeys_TitleLevel$.prototype.valueFromString__s_PartialFunction = (function() {
  if ((!this.Lbe_doeraene_webcomponents_ui5_configkeys_TitleLevel$__f_valueFromStringbitmap$1)) {
    this.Lbe_doeraene_webcomponents_ui5_configkeys_TitleLevel$__f_valueFromString$lzy1 = $f_Lbe_doeraene_webcomponents_ui5_configkeys_EnumerationString__valueFromString__s_PartialFunction(this);
    this.Lbe_doeraene_webcomponents_ui5_configkeys_TitleLevel$__f_valueFromStringbitmap$1 = true
  };
  return this.Lbe_doeraene_webcomponents_ui5_configkeys_TitleLevel$__f_valueFromString$lzy1
});
$c_Lbe_doeraene_webcomponents_ui5_configkeys_TitleLevel$.prototype.AsStringCodec__Lbe_doeraene_webcomponents_ui5_configkeys_EnumerationString$AsStringCodec$ = (function() {
  if ((!this.Lbe_doeraene_webcomponents_ui5_configkeys_TitleLevel$__f_AsStringCodecbitmap$1)) {
    this.Lbe_doeraene_webcomponents_ui5_configkeys_TitleLevel$__f_AsStringCodec$lzy1 = new $c_Lbe_doeraene_webcomponents_ui5_configkeys_EnumerationString$AsStringCodec$(this);
    this.Lbe_doeraene_webcomponents_ui5_configkeys_TitleLevel$__f_AsStringCodecbitmap$1 = true
  };
  return this.Lbe_doeraene_webcomponents_ui5_configkeys_TitleLevel$__f_AsStringCodec$lzy1
});
$c_Lbe_doeraene_webcomponents_ui5_configkeys_TitleLevel$.prototype.allValues__sci_List = (function() {
  return this.Lbe_doeraene_webcomponents_ui5_configkeys_TitleLevel$__f_allValues
});
$c_Lbe_doeraene_webcomponents_ui5_configkeys_TitleLevel$.prototype.valueOf__O__T = (function(value) {
  var value$1 = value;
  return value$1.toString__T()
});
var $d_Lbe_doeraene_webcomponents_ui5_configkeys_TitleLevel$ = new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$TypeData().initClass({
  Lbe_doeraene_webcomponents_ui5_configkeys_TitleLevel$: 0
}, false, "be.doeraene.webcomponents.ui5.configkeys.TitleLevel$", {
  Lbe_doeraene_webcomponents_ui5_configkeys_TitleLevel$: 1,
  O: 1,
  Lbe_doeraene_webcomponents_ui5_configkeys_EnumerationString: 1
});
$c_Lbe_doeraene_webcomponents_ui5_configkeys_TitleLevel$.prototype.$classData = $d_Lbe_doeraene_webcomponents_ui5_configkeys_TitleLevel$;
var $n_Lbe_doeraene_webcomponents_ui5_configkeys_TitleLevel$;
function $m_Lbe_doeraene_webcomponents_ui5_configkeys_TitleLevel$() {
  if ((!$n_Lbe_doeraene_webcomponents_ui5_configkeys_TitleLevel$)) {
    $n_Lbe_doeraene_webcomponents_ui5_configkeys_TitleLevel$ = new $c_Lbe_doeraene_webcomponents_ui5_configkeys_TitleLevel$()
  };
  return $n_Lbe_doeraene_webcomponents_ui5_configkeys_TitleLevel$
}
function $f_Lcom_raquo_airstream_common_InternalNextErrorObserver__onTry__s_util_Try__Lcom_raquo_airstream_core_Transaction__V($thiz, nextValue, transaction) {
  nextValue.fold__F1__F1__O(new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$c_sjsr_AnonFunction1(((_$1) => {
    var _$1$1 = _$1;
    $thiz.onError__jl_Throwable__Lcom_raquo_airstream_core_Transaction__V(_$1$1, transaction)
  })), new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$c_sjsr_AnonFunction1(((_$2) => {
    $thiz.onNext__O__Lcom_raquo_airstream_core_Transaction__V(_$2, transaction)
  })))
}
function $is_Lcom_raquo_airstream_common_InternalParentObserver(obj) {
  return (!(!((obj && obj.$classData) && obj.$classData.ancestors.Lcom_raquo_airstream_common_InternalParentObserver)))
}
function $isArrayOf_Lcom_raquo_airstream_common_InternalParentObserver(obj, depth) {
  return (!(!(((obj && obj.$classData) && (obj.$classData.arrayDepth === depth)) && obj.$classData.arrayBase.ancestors.Lcom_raquo_airstream_common_InternalParentObserver)))
}
var $d_Lcom_raquo_airstream_common_InternalParentObserver = new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$TypeData().initClass({
  Lcom_raquo_airstream_common_InternalParentObserver: 0
}, true, "com.raquo.airstream.common.InternalParentObserver", {
  Lcom_raquo_airstream_common_InternalParentObserver: 1,
  O: 1,
  Lcom_raquo_airstream_core_InternalObserver: 1
});
function $f_Lcom_raquo_airstream_common_InternalTryObserver__onNext__O__Lcom_raquo_airstream_core_Transaction__V($thiz, nextValue, transaction) {
  $thiz.onTry__s_util_Try__Lcom_raquo_airstream_core_Transaction__V(new $c_s_util_Success(nextValue), transaction)
}
function $f_Lcom_raquo_airstream_common_InternalTryObserver__onError__jl_Throwable__Lcom_raquo_airstream_core_Transaction__V($thiz, nextError, transaction) {
  $thiz.onTry__s_util_Try__Lcom_raquo_airstream_core_Transaction__V(new $c_s_util_Failure(nextError), transaction)
}
/** @constructor */
function $c_Lcom_raquo_airstream_ownership_OneTimeOwner(onAccessAfterKilled) {
  this.Lcom_raquo_airstream_ownership_OneTimeOwner__f_subscriptions = null;
  this.Lcom_raquo_airstream_ownership_OneTimeOwner__f_onAccessAfterKilled = null;
  this.Lcom_raquo_airstream_ownership_OneTimeOwner__f__isKilledForever = false;
  this.Lcom_raquo_airstream_ownership_OneTimeOwner__f_onAccessAfterKilled = onAccessAfterKilled;
  $f_Lcom_raquo_airstream_ownership_Owner__$init$__V(this);
  this.Lcom_raquo_airstream_ownership_OneTimeOwner__f__isKilledForever = false
}
$c_Lcom_raquo_airstream_ownership_OneTimeOwner.prototype = new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$h_O();
$c_Lcom_raquo_airstream_ownership_OneTimeOwner.prototype.constructor = $c_Lcom_raquo_airstream_ownership_OneTimeOwner;
/** @constructor */
function $h_Lcom_raquo_airstream_ownership_OneTimeOwner() {
  /*<skip>*/
}
$h_Lcom_raquo_airstream_ownership_OneTimeOwner.prototype = $c_Lcom_raquo_airstream_ownership_OneTimeOwner.prototype;
$c_Lcom_raquo_airstream_ownership_OneTimeOwner.prototype.subscriptions__Lcom_raquo_ew_JsArray = (function() {
  return this.Lcom_raquo_airstream_ownership_OneTimeOwner__f_subscriptions
});
$c_Lcom_raquo_airstream_ownership_OneTimeOwner.prototype.com$raquo$airstream$ownership$Owner$_setter_$subscriptions_$eq__Lcom_raquo_ew_JsArray__V = (function(x$0) {
  this.Lcom_raquo_airstream_ownership_OneTimeOwner__f_subscriptions = x$0
});
$c_Lcom_raquo_airstream_ownership_OneTimeOwner.prototype.own__Lcom_raquo_airstream_ownership_Subscription__V = (function(subscription) {
  if (this.Lcom_raquo_airstream_ownership_OneTimeOwner__f__isKilledForever) {
    $p_Lcom_raquo_airstream_ownership_Subscription__safeCleanup__V(subscription);
    this.Lcom_raquo_airstream_ownership_OneTimeOwner__f_onAccessAfterKilled.apply__O()
  } else {
    $f_Lcom_raquo_airstream_ownership_Owner__own__Lcom_raquo_airstream_ownership_Subscription__V(this, subscription)
  }
});
$c_Lcom_raquo_airstream_ownership_OneTimeOwner.prototype.killSubscriptions__V = (function() {
  $f_Lcom_raquo_airstream_ownership_Owner__killSubscriptions__V(this);
  this.Lcom_raquo_airstream_ownership_OneTimeOwner__f__isKilledForever = true
});
var $d_Lcom_raquo_airstream_ownership_OneTimeOwner = new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$TypeData().initClass({
  Lcom_raquo_airstream_ownership_OneTimeOwner: 0
}, false, "com.raquo.airstream.ownership.OneTimeOwner", {
  Lcom_raquo_airstream_ownership_OneTimeOwner: 1,
  O: 1,
  Lcom_raquo_airstream_ownership_Owner: 1
});
$c_Lcom_raquo_airstream_ownership_OneTimeOwner.prototype.$classData = $d_Lcom_raquo_airstream_ownership_OneTimeOwner;
/** @constructor */
function $c_Lcom_raquo_laminar_api_Laminar$unsafeWindowOwner$(outer) {
  this.Lcom_raquo_laminar_api_Laminar$unsafeWindowOwner$__f_subscriptions = null;
  if ((outer === null)) {
    throw $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$ct_jl_NullPointerException__(new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$c_jl_NullPointerException())
  };
  $f_Lcom_raquo_airstream_ownership_Owner__$init$__V(this)
}
$c_Lcom_raquo_laminar_api_Laminar$unsafeWindowOwner$.prototype = new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$h_O();
$c_Lcom_raquo_laminar_api_Laminar$unsafeWindowOwner$.prototype.constructor = $c_Lcom_raquo_laminar_api_Laminar$unsafeWindowOwner$;
/** @constructor */
function $h_Lcom_raquo_laminar_api_Laminar$unsafeWindowOwner$() {
  /*<skip>*/
}
$h_Lcom_raquo_laminar_api_Laminar$unsafeWindowOwner$.prototype = $c_Lcom_raquo_laminar_api_Laminar$unsafeWindowOwner$.prototype;
$c_Lcom_raquo_laminar_api_Laminar$unsafeWindowOwner$.prototype.subscriptions__Lcom_raquo_ew_JsArray = (function() {
  return this.Lcom_raquo_laminar_api_Laminar$unsafeWindowOwner$__f_subscriptions
});
$c_Lcom_raquo_laminar_api_Laminar$unsafeWindowOwner$.prototype.com$raquo$airstream$ownership$Owner$_setter_$subscriptions_$eq__Lcom_raquo_ew_JsArray__V = (function(x$0) {
  this.Lcom_raquo_laminar_api_Laminar$unsafeWindowOwner$__f_subscriptions = x$0
});
$c_Lcom_raquo_laminar_api_Laminar$unsafeWindowOwner$.prototype.killSubscriptions__V = (function() {
  $f_Lcom_raquo_airstream_ownership_Owner__killSubscriptions__V(this)
});
$c_Lcom_raquo_laminar_api_Laminar$unsafeWindowOwner$.prototype.own__Lcom_raquo_airstream_ownership_Subscription__V = (function(subscription) {
  $f_Lcom_raquo_airstream_ownership_Owner__own__Lcom_raquo_airstream_ownership_Subscription__V(this, subscription)
});
var $d_Lcom_raquo_laminar_api_Laminar$unsafeWindowOwner$ = new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$TypeData().initClass({
  Lcom_raquo_laminar_api_Laminar$unsafeWindowOwner$: 0
}, false, "com.raquo.laminar.api.Laminar$unsafeWindowOwner$", {
  Lcom_raquo_laminar_api_Laminar$unsafeWindowOwner$: 1,
  O: 1,
  Lcom_raquo_airstream_ownership_Owner: 1
});
$c_Lcom_raquo_laminar_api_Laminar$unsafeWindowOwner$.prototype.$classData = $d_Lcom_raquo_laminar_api_Laminar$unsafeWindowOwner$;
/** @constructor */
function $c_Lcom_raquo_laminar_codecs_package$$anon$1() {
  /*<skip>*/
}
$c_Lcom_raquo_laminar_codecs_package$$anon$1.prototype = new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$h_O();
$c_Lcom_raquo_laminar_codecs_package$$anon$1.prototype.constructor = $c_Lcom_raquo_laminar_codecs_package$$anon$1;
/** @constructor */
function $h_Lcom_raquo_laminar_codecs_package$$anon$1() {
  /*<skip>*/
}
$h_Lcom_raquo_laminar_codecs_package$$anon$1.prototype = $c_Lcom_raquo_laminar_codecs_package$$anon$1.prototype;
$c_Lcom_raquo_laminar_codecs_package$$anon$1.prototype.decode__T__Z = (function(domValue) {
  return (domValue !== null)
});
$c_Lcom_raquo_laminar_codecs_package$$anon$1.prototype.encode__Z__T = (function(scalaValue) {
  return (scalaValue ? "" : null)
});
$c_Lcom_raquo_laminar_codecs_package$$anon$1.prototype.decode__O__O = (function(domValue) {
  return this.decode__T__Z(domValue)
});
$c_Lcom_raquo_laminar_codecs_package$$anon$1.prototype.encode__O__O = (function(scalaValue) {
  return this.encode__Z__T((!(!scalaValue)))
});
var $d_Lcom_raquo_laminar_codecs_package$$anon$1 = new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$TypeData().initClass({
  Lcom_raquo_laminar_codecs_package$$anon$1: 0
}, false, "com.raquo.laminar.codecs.package$$anon$1", {
  Lcom_raquo_laminar_codecs_package$$anon$1: 1,
  O: 1,
  Lcom_raquo_laminar_codecs_Codec: 1
});
$c_Lcom_raquo_laminar_codecs_package$$anon$1.prototype.$classData = $d_Lcom_raquo_laminar_codecs_package$$anon$1;
/** @constructor */
function $c_Lcom_raquo_laminar_codecs_package$$anon$2() {
  /*<skip>*/
}
$c_Lcom_raquo_laminar_codecs_package$$anon$2.prototype = new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$h_O();
$c_Lcom_raquo_laminar_codecs_package$$anon$2.prototype.constructor = $c_Lcom_raquo_laminar_codecs_package$$anon$2;
/** @constructor */
function $h_Lcom_raquo_laminar_codecs_package$$anon$2() {
  /*<skip>*/
}
$h_Lcom_raquo_laminar_codecs_package$$anon$2.prototype = $c_Lcom_raquo_laminar_codecs_package$$anon$2.prototype;
$c_Lcom_raquo_laminar_codecs_package$$anon$2.prototype.encode__O__O = (function(scalaValue) {
  return scalaValue
});
$c_Lcom_raquo_laminar_codecs_package$$anon$2.prototype.decode__O__O = (function(domValue) {
  return domValue
});
var $d_Lcom_raquo_laminar_codecs_package$$anon$2 = new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$TypeData().initClass({
  Lcom_raquo_laminar_codecs_package$$anon$2: 0
}, false, "com.raquo.laminar.codecs.package$$anon$2", {
  Lcom_raquo_laminar_codecs_package$$anon$2: 1,
  O: 1,
  Lcom_raquo_laminar_codecs_Codec: 1
});
$c_Lcom_raquo_laminar_codecs_package$$anon$2.prototype.$classData = $d_Lcom_raquo_laminar_codecs_package$$anon$2;
/** @constructor */
function $c_Lcom_raquo_laminar_keys_CompositeKey(name, getRawDomValue, setRawDomValue, separator) {
  new $c_Lcom_raquo_laminar_keys_CompositeKey$CompositeCodec(separator)
}
$c_Lcom_raquo_laminar_keys_CompositeKey.prototype = new $h_Lcom_raquo_laminar_keys_Key();
$c_Lcom_raquo_laminar_keys_CompositeKey.prototype.constructor = $c_Lcom_raquo_laminar_keys_CompositeKey;
/** @constructor */
function $h_Lcom_raquo_laminar_keys_CompositeKey() {
  /*<skip>*/
}
$h_Lcom_raquo_laminar_keys_CompositeKey.prototype = $c_Lcom_raquo_laminar_keys_CompositeKey.prototype;
var $d_Lcom_raquo_laminar_keys_CompositeKey = new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$TypeData().initClass({
  Lcom_raquo_laminar_keys_CompositeKey: 0
}, false, "com.raquo.laminar.keys.CompositeKey", {
  Lcom_raquo_laminar_keys_CompositeKey: 1,
  Lcom_raquo_laminar_keys_Key: 1,
  O: 1
});
$c_Lcom_raquo_laminar_keys_CompositeKey.prototype.$classData = $d_Lcom_raquo_laminar_keys_CompositeKey;
/** @constructor */
function $c_Lcom_raquo_laminar_keys_CompositeKey$CompositeCodec(separator) {
  this.Lcom_raquo_laminar_keys_CompositeKey$CompositeCodec__f_separator = null;
  this.Lcom_raquo_laminar_keys_CompositeKey$CompositeCodec__f_separator = separator
}
$c_Lcom_raquo_laminar_keys_CompositeKey$CompositeCodec.prototype = new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$h_O();
$c_Lcom_raquo_laminar_keys_CompositeKey$CompositeCodec.prototype.constructor = $c_Lcom_raquo_laminar_keys_CompositeKey$CompositeCodec;
/** @constructor */
function $h_Lcom_raquo_laminar_keys_CompositeKey$CompositeCodec() {
  /*<skip>*/
}
$h_Lcom_raquo_laminar_keys_CompositeKey$CompositeCodec.prototype = $c_Lcom_raquo_laminar_keys_CompositeKey$CompositeCodec.prototype;
$c_Lcom_raquo_laminar_keys_CompositeKey$CompositeCodec.prototype.decode__T__sci_List = (function(domValue) {
  return $m_Lcom_raquo_laminar_keys_CompositeKey$().normalize__T__T__sci_List(domValue, this.Lcom_raquo_laminar_keys_CompositeKey$CompositeCodec__f_separator)
});
$c_Lcom_raquo_laminar_keys_CompositeKey$CompositeCodec.prototype.encode__sc_Iterable__T = (function(scalaValue) {
  var sep = this.Lcom_raquo_laminar_keys_CompositeKey$CompositeCodec__f_separator;
  return $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$f_sc_IterableOnceOps__mkString__T__T__T__T(scalaValue, "", sep, "")
});
$c_Lcom_raquo_laminar_keys_CompositeKey$CompositeCodec.prototype.decode__O__O = (function(domValue) {
  return this.decode__T__sci_List(domValue)
});
$c_Lcom_raquo_laminar_keys_CompositeKey$CompositeCodec.prototype.encode__O__O = (function(scalaValue) {
  return this.encode__sc_Iterable__T(scalaValue)
});
var $d_Lcom_raquo_laminar_keys_CompositeKey$CompositeCodec = new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$TypeData().initClass({
  Lcom_raquo_laminar_keys_CompositeKey$CompositeCodec: 0
}, false, "com.raquo.laminar.keys.CompositeKey$CompositeCodec", {
  Lcom_raquo_laminar_keys_CompositeKey$CompositeCodec: 1,
  O: 1,
  Lcom_raquo_laminar_codecs_Codec: 1
});
$c_Lcom_raquo_laminar_keys_CompositeKey$CompositeCodec.prototype.$classData = $d_Lcom_raquo_laminar_keys_CompositeKey$CompositeCodec;
/** @constructor */
function $c_Lcom_raquo_laminar_keys_EventProp(name) {
  this.Lcom_raquo_laminar_keys_EventProp__f_name = null;
  this.Lcom_raquo_laminar_keys_EventProp__f_name = name
}
$c_Lcom_raquo_laminar_keys_EventProp.prototype = new $h_Lcom_raquo_laminar_keys_Key();
$c_Lcom_raquo_laminar_keys_EventProp.prototype.constructor = $c_Lcom_raquo_laminar_keys_EventProp;
/** @constructor */
function $h_Lcom_raquo_laminar_keys_EventProp() {
  /*<skip>*/
}
$h_Lcom_raquo_laminar_keys_EventProp.prototype = $c_Lcom_raquo_laminar_keys_EventProp.prototype;
var $d_Lcom_raquo_laminar_keys_EventProp = new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$TypeData().initClass({
  Lcom_raquo_laminar_keys_EventProp: 0
}, false, "com.raquo.laminar.keys.EventProp", {
  Lcom_raquo_laminar_keys_EventProp: 1,
  Lcom_raquo_laminar_keys_Key: 1,
  O: 1
});
$c_Lcom_raquo_laminar_keys_EventProp.prototype.$classData = $d_Lcom_raquo_laminar_keys_EventProp;
/** @constructor */
function $c_Lcom_raquo_laminar_keys_HtmlAttr(name, codec) {
  this.Lcom_raquo_laminar_keys_HtmlAttr__f_name = null;
  this.Lcom_raquo_laminar_keys_HtmlAttr__f_codec = null;
  this.Lcom_raquo_laminar_keys_HtmlAttr__f_name = name;
  this.Lcom_raquo_laminar_keys_HtmlAttr__f_codec = codec
}
$c_Lcom_raquo_laminar_keys_HtmlAttr.prototype = new $h_Lcom_raquo_laminar_keys_Key();
$c_Lcom_raquo_laminar_keys_HtmlAttr.prototype.constructor = $c_Lcom_raquo_laminar_keys_HtmlAttr;
/** @constructor */
function $h_Lcom_raquo_laminar_keys_HtmlAttr() {
  /*<skip>*/
}
$h_Lcom_raquo_laminar_keys_HtmlAttr.prototype = $c_Lcom_raquo_laminar_keys_HtmlAttr.prototype;
$c_Lcom_raquo_laminar_keys_HtmlAttr.prototype.$colon$eq__O__Lcom_raquo_laminar_modifiers_KeySetter = (function(value) {
  return new $c_Lcom_raquo_laminar_modifiers_KeySetter(this, value, new $c_sjsr_AnonFunction3(((element, attr, value$2) => {
    var element$1 = element;
    var attr$1 = attr;
    $m_Lcom_raquo_laminar_DomApi$().setHtmlAttribute__Lcom_raquo_laminar_nodes_ReactiveHtmlElement__Lcom_raquo_laminar_keys_HtmlAttr__O__V(element$1, attr$1, value$2)
  })))
});
function $isArrayOf_Lcom_raquo_laminar_keys_HtmlAttr(obj, depth) {
  return (!(!(((obj && obj.$classData) && (obj.$classData.arrayDepth === depth)) && obj.$classData.arrayBase.ancestors.Lcom_raquo_laminar_keys_HtmlAttr)))
}
var $d_Lcom_raquo_laminar_keys_HtmlAttr = new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$TypeData().initClass({
  Lcom_raquo_laminar_keys_HtmlAttr: 0
}, false, "com.raquo.laminar.keys.HtmlAttr", {
  Lcom_raquo_laminar_keys_HtmlAttr: 1,
  Lcom_raquo_laminar_keys_Key: 1,
  O: 1
});
$c_Lcom_raquo_laminar_keys_HtmlAttr.prototype.$classData = $d_Lcom_raquo_laminar_keys_HtmlAttr;
/** @constructor */
function $c_Lcom_raquo_laminar_keys_HtmlProp(name, codec) {
  /*<skip>*/
}
$c_Lcom_raquo_laminar_keys_HtmlProp.prototype = new $h_Lcom_raquo_laminar_keys_Key();
$c_Lcom_raquo_laminar_keys_HtmlProp.prototype.constructor = $c_Lcom_raquo_laminar_keys_HtmlProp;
/** @constructor */
function $h_Lcom_raquo_laminar_keys_HtmlProp() {
  /*<skip>*/
}
$h_Lcom_raquo_laminar_keys_HtmlProp.prototype = $c_Lcom_raquo_laminar_keys_HtmlProp.prototype;
var $d_Lcom_raquo_laminar_keys_HtmlProp = new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$TypeData().initClass({
  Lcom_raquo_laminar_keys_HtmlProp: 0
}, false, "com.raquo.laminar.keys.HtmlProp", {
  Lcom_raquo_laminar_keys_HtmlProp: 1,
  Lcom_raquo_laminar_keys_Key: 1,
  O: 1
});
$c_Lcom_raquo_laminar_keys_HtmlProp.prototype.$classData = $d_Lcom_raquo_laminar_keys_HtmlProp;
/** @constructor */
function $c_Lcom_raquo_laminar_keys_SvgAttr(localName, codec, namespacePrefix) {
  this.Lcom_raquo_laminar_keys_SvgAttr__f_localName = null;
  this.Lcom_raquo_laminar_keys_SvgAttr__f_codec = null;
  this.Lcom_raquo_laminar_keys_SvgAttr__f_name = null;
  this.Lcom_raquo_laminar_keys_SvgAttr__f_namespaceUri = null;
  this.Lcom_raquo_laminar_keys_SvgAttr__f_localName = localName;
  this.Lcom_raquo_laminar_keys_SvgAttr__f_codec = codec;
  if (namespacePrefix.isEmpty__Z()) {
    var this$1 = $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$m_s_None$()
  } else {
    var arg1 = namespacePrefix.get__O();
    var _$1 = arg1;
    var this$1 = new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$c_s_Some(((_$1 + ":") + localName))
  };
  this.Lcom_raquo_laminar_keys_SvgAttr__f_name = (this$1.isEmpty__Z() ? localName : this$1.get__O());
  if (namespacePrefix.isEmpty__Z()) {
    var $$x1 = $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$m_s_None$()
  } else {
    var arg1$1 = namespacePrefix.get__O();
    var namespace = arg1$1;
    var $$x1 = new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$c_s_Some($m_Lcom_raquo_laminar_keys_SvgAttr$().namespaceUri__T__T(namespace))
  };
  this.Lcom_raquo_laminar_keys_SvgAttr__f_namespaceUri = $$x1
}
$c_Lcom_raquo_laminar_keys_SvgAttr.prototype = new $h_Lcom_raquo_laminar_keys_Key();
$c_Lcom_raquo_laminar_keys_SvgAttr.prototype.constructor = $c_Lcom_raquo_laminar_keys_SvgAttr;
/** @constructor */
function $h_Lcom_raquo_laminar_keys_SvgAttr() {
  /*<skip>*/
}
$h_Lcom_raquo_laminar_keys_SvgAttr.prototype = $c_Lcom_raquo_laminar_keys_SvgAttr.prototype;
var $d_Lcom_raquo_laminar_keys_SvgAttr = new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$TypeData().initClass({
  Lcom_raquo_laminar_keys_SvgAttr: 0
}, false, "com.raquo.laminar.keys.SvgAttr", {
  Lcom_raquo_laminar_keys_SvgAttr: 1,
  Lcom_raquo_laminar_keys_Key: 1,
  O: 1
});
$c_Lcom_raquo_laminar_keys_SvgAttr.prototype.$classData = $d_Lcom_raquo_laminar_keys_SvgAttr;
/** @constructor */
function $c_Lcom_raquo_laminar_modifiers_Inserter(initialContext, preferStrictMode, insertFn) {
  this.Lcom_raquo_laminar_modifiers_Inserter__f_initialContext = null;
  this.Lcom_raquo_laminar_modifiers_Inserter__f_preferStrictMode = false;
  this.Lcom_raquo_laminar_modifiers_Inserter__f_insertFn = null;
  this.Lcom_raquo_laminar_modifiers_Inserter__f_initialContext = initialContext;
  this.Lcom_raquo_laminar_modifiers_Inserter__f_preferStrictMode = preferStrictMode;
  this.Lcom_raquo_laminar_modifiers_Inserter__f_insertFn = insertFn
}
$c_Lcom_raquo_laminar_modifiers_Inserter.prototype = new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$h_O();
$c_Lcom_raquo_laminar_modifiers_Inserter.prototype.constructor = $c_Lcom_raquo_laminar_modifiers_Inserter;
/** @constructor */
function $h_Lcom_raquo_laminar_modifiers_Inserter() {
  /*<skip>*/
}
$h_Lcom_raquo_laminar_modifiers_Inserter.prototype = $c_Lcom_raquo_laminar_modifiers_Inserter.prototype;
$c_Lcom_raquo_laminar_modifiers_Inserter.prototype.bind__Lcom_raquo_laminar_nodes_ReactiveElement__Lcom_raquo_airstream_ownership_DynamicSubscription = (function(element) {
  var this$1 = this.Lcom_raquo_laminar_modifiers_Inserter__f_initialContext;
  var insertContext = (this$1.isEmpty__Z() ? $m_Lcom_raquo_laminar_lifecycle_InsertContext$().reserveSpotContext__Lcom_raquo_laminar_nodes_ReactiveElement__Z__Lcom_raquo_laminar_lifecycle_InsertContext(element, this.Lcom_raquo_laminar_modifiers_Inserter__f_preferStrictMode) : this$1.get__O());
  var subscribe = new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$c_sjsr_AnonFunction1(((mountContext) => {
    var mountContext$1 = mountContext;
    return this.Lcom_raquo_laminar_modifiers_Inserter__f_insertFn.apply__O__O__O(insertContext, mountContext$1.Lcom_raquo_laminar_lifecycle_MountContext__f_owner)
  }));
  return $m_Lcom_raquo_airstream_ownership_DynamicSubscription$().unsafe__Lcom_raquo_airstream_ownership_DynamicOwner__F1__Z__Lcom_raquo_airstream_ownership_DynamicSubscription(element.Lcom_raquo_laminar_nodes_ReactiveHtmlElement__f_dynamicOwner, new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$c_sjsr_AnonFunction1(((owner) => {
    var owner$1 = owner;
    return subscribe.apply__O__O(new $c_Lcom_raquo_laminar_lifecycle_MountContext(element, owner$1))
  })), false)
});
$c_Lcom_raquo_laminar_modifiers_Inserter.prototype.apply__Lcom_raquo_laminar_nodes_ReactiveElement__V = (function(element) {
  this.bind__Lcom_raquo_laminar_nodes_ReactiveElement__Lcom_raquo_airstream_ownership_DynamicSubscription(element)
});
var $d_Lcom_raquo_laminar_modifiers_Inserter = new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$TypeData().initClass({
  Lcom_raquo_laminar_modifiers_Inserter: 0
}, false, "com.raquo.laminar.modifiers.Inserter", {
  Lcom_raquo_laminar_modifiers_Inserter: 1,
  O: 1,
  Lcom_raquo_laminar_modifiers_Modifier: 1
});
$c_Lcom_raquo_laminar_modifiers_Inserter.prototype.$classData = $d_Lcom_raquo_laminar_modifiers_Inserter;
/** @constructor */
function $c_Lcom_raquo_laminar_modifiers_Modifier$$anon$1() {
  /*<skip>*/
}
$c_Lcom_raquo_laminar_modifiers_Modifier$$anon$1.prototype = new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$h_O();
$c_Lcom_raquo_laminar_modifiers_Modifier$$anon$1.prototype.constructor = $c_Lcom_raquo_laminar_modifiers_Modifier$$anon$1;
/** @constructor */
function $h_Lcom_raquo_laminar_modifiers_Modifier$$anon$1() {
  /*<skip>*/
}
$h_Lcom_raquo_laminar_modifiers_Modifier$$anon$1.prototype = $c_Lcom_raquo_laminar_modifiers_Modifier$$anon$1.prototype;
$c_Lcom_raquo_laminar_modifiers_Modifier$$anon$1.prototype.apply__Lcom_raquo_laminar_nodes_ReactiveElement__V = (function(element) {
  /*<skip>*/
});
var $d_Lcom_raquo_laminar_modifiers_Modifier$$anon$1 = new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$TypeData().initClass({
  Lcom_raquo_laminar_modifiers_Modifier$$anon$1: 0
}, false, "com.raquo.laminar.modifiers.Modifier$$anon$1", {
  Lcom_raquo_laminar_modifiers_Modifier$$anon$1: 1,
  O: 1,
  Lcom_raquo_laminar_modifiers_Modifier: 1
});
$c_Lcom_raquo_laminar_modifiers_Modifier$$anon$1.prototype.$classData = $d_Lcom_raquo_laminar_modifiers_Modifier$$anon$1;
/** @constructor */
function $c_Lcom_raquo_laminar_modifiers_Modifier$$anon$2(f$2) {
  this.Lcom_raquo_laminar_modifiers_Modifier$$anon$2__f_f$1 = null;
  this.Lcom_raquo_laminar_modifiers_Modifier$$anon$2__f_f$1 = f$2
}
$c_Lcom_raquo_laminar_modifiers_Modifier$$anon$2.prototype = new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$h_O();
$c_Lcom_raquo_laminar_modifiers_Modifier$$anon$2.prototype.constructor = $c_Lcom_raquo_laminar_modifiers_Modifier$$anon$2;
/** @constructor */
function $h_Lcom_raquo_laminar_modifiers_Modifier$$anon$2() {
  /*<skip>*/
}
$h_Lcom_raquo_laminar_modifiers_Modifier$$anon$2.prototype = $c_Lcom_raquo_laminar_modifiers_Modifier$$anon$2.prototype;
$c_Lcom_raquo_laminar_modifiers_Modifier$$anon$2.prototype.apply__Lcom_raquo_laminar_nodes_ReactiveElement__V = (function(element) {
  var this$1 = $m_Lcom_raquo_airstream_core_Transaction$onStart$();
  this$1.Lcom_raquo_airstream_core_Transaction$onStart$__f_level = ((1 + this$1.Lcom_raquo_airstream_core_Transaction$onStart$__f_level) | 0);
  try {
    this.Lcom_raquo_laminar_modifiers_Modifier$$anon$2__f_f$1.apply__O__O(element)
  } finally {
    this$1.Lcom_raquo_airstream_core_Transaction$onStart$__f_level = (((-1) + this$1.Lcom_raquo_airstream_core_Transaction$onStart$__f_level) | 0);
    if ((this$1.Lcom_raquo_airstream_core_Transaction$onStart$__f_level === 0)) {
      $p_Lcom_raquo_airstream_core_Transaction$onStart$__resolve__V(this$1)
    }
  }
});
var $d_Lcom_raquo_laminar_modifiers_Modifier$$anon$2 = new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$TypeData().initClass({
  Lcom_raquo_laminar_modifiers_Modifier$$anon$2: 0
}, false, "com.raquo.laminar.modifiers.Modifier$$anon$2", {
  Lcom_raquo_laminar_modifiers_Modifier$$anon$2: 1,
  O: 1,
  Lcom_raquo_laminar_modifiers_Modifier: 1
});
$c_Lcom_raquo_laminar_modifiers_Modifier$$anon$2.prototype.$classData = $d_Lcom_raquo_laminar_modifiers_Modifier$$anon$2;
/** @constructor */
function $c_Lcom_raquo_laminar_modifiers_RenderableNode$$anon$1(renderNode$2, renderNodeSeq$2, renderNodeIterable$2, renderNodeOption$2) {
  this.Lcom_raquo_laminar_modifiers_RenderableNode$$anon$1__f_renderNode$1 = null;
  this.Lcom_raquo_laminar_modifiers_RenderableNode$$anon$1__f_renderNodeSeq$1 = null;
  this.Lcom_raquo_laminar_modifiers_RenderableNode$$anon$1__f_renderNode$1 = renderNode$2;
  this.Lcom_raquo_laminar_modifiers_RenderableNode$$anon$1__f_renderNodeSeq$1 = renderNodeSeq$2
}
$c_Lcom_raquo_laminar_modifiers_RenderableNode$$anon$1.prototype = new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$h_O();
$c_Lcom_raquo_laminar_modifiers_RenderableNode$$anon$1.prototype.constructor = $c_Lcom_raquo_laminar_modifiers_RenderableNode$$anon$1;
/** @constructor */
function $h_Lcom_raquo_laminar_modifiers_RenderableNode$$anon$1() {
  /*<skip>*/
}
$h_Lcom_raquo_laminar_modifiers_RenderableNode$$anon$1.prototype = $c_Lcom_raquo_laminar_modifiers_RenderableNode$$anon$1.prototype;
$c_Lcom_raquo_laminar_modifiers_RenderableNode$$anon$1.prototype.asNode__O__Lcom_raquo_laminar_nodes_ChildNode = (function(value) {
  return this.Lcom_raquo_laminar_modifiers_RenderableNode$$anon$1__f_renderNode$1.apply__O__O(value)
});
$c_Lcom_raquo_laminar_modifiers_RenderableNode$$anon$1.prototype.asNodeSeq__sci_Seq__sci_Seq = (function(values) {
  return this.Lcom_raquo_laminar_modifiers_RenderableNode$$anon$1__f_renderNodeSeq$1.apply__O__O(values)
});
var $d_Lcom_raquo_laminar_modifiers_RenderableNode$$anon$1 = new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$TypeData().initClass({
  Lcom_raquo_laminar_modifiers_RenderableNode$$anon$1: 0
}, false, "com.raquo.laminar.modifiers.RenderableNode$$anon$1", {
  Lcom_raquo_laminar_modifiers_RenderableNode$$anon$1: 1,
  O: 1,
  Lcom_raquo_laminar_modifiers_RenderableNode: 1
});
$c_Lcom_raquo_laminar_modifiers_RenderableNode$$anon$1.prototype.$classData = $d_Lcom_raquo_laminar_modifiers_RenderableNode$$anon$1;
/** @constructor */
function $c_Lcom_raquo_laminar_modifiers_RenderableText$$anon$1(render$2) {
  this.Lcom_raquo_laminar_modifiers_RenderableText$$anon$1__f_render$1 = null;
  this.Lcom_raquo_laminar_modifiers_RenderableText$$anon$1__f_render$1 = render$2
}
$c_Lcom_raquo_laminar_modifiers_RenderableText$$anon$1.prototype = new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$h_O();
$c_Lcom_raquo_laminar_modifiers_RenderableText$$anon$1.prototype.constructor = $c_Lcom_raquo_laminar_modifiers_RenderableText$$anon$1;
/** @constructor */
function $h_Lcom_raquo_laminar_modifiers_RenderableText$$anon$1() {
  /*<skip>*/
}
$h_Lcom_raquo_laminar_modifiers_RenderableText$$anon$1.prototype = $c_Lcom_raquo_laminar_modifiers_RenderableText$$anon$1.prototype;
$c_Lcom_raquo_laminar_modifiers_RenderableText$$anon$1.prototype.asString__O__T = (function(value) {
  return this.Lcom_raquo_laminar_modifiers_RenderableText$$anon$1__f_render$1.apply__O__O(value)
});
var $d_Lcom_raquo_laminar_modifiers_RenderableText$$anon$1 = new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$TypeData().initClass({
  Lcom_raquo_laminar_modifiers_RenderableText$$anon$1: 0
}, false, "com.raquo.laminar.modifiers.RenderableText$$anon$1", {
  Lcom_raquo_laminar_modifiers_RenderableText$$anon$1: 1,
  O: 1,
  Lcom_raquo_laminar_modifiers_RenderableText: 1
});
$c_Lcom_raquo_laminar_modifiers_RenderableText$$anon$1.prototype.$classData = $d_Lcom_raquo_laminar_modifiers_RenderableText$$anon$1;
function $f_Lcom_raquo_laminar_nodes_ParentNode__$init$__V($thiz) {
  $thiz.com$raquo$laminar$nodes$ParentNode$_setter_$dynamicOwner_$eq__Lcom_raquo_airstream_ownership_DynamicOwner__V(new $c_Lcom_raquo_airstream_ownership_DynamicOwner(new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$c_sjsr_AnonFunction0((() => {
    var this$3 = $m_Lcom_raquo_laminar_DomApi$().debugPath__Lorg_scalajs_dom_Node__sci_List__sci_List($thiz.ref__Lorg_scalajs_dom_Node(), ($m_Lcom_raquo_laminar_DomApi$(), $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$m_s_package$().s_package$__f_Nil));
    var path = $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$f_sc_IterableOnceOps__mkString__T__T__T__T(this$3, "", " > ", "");
    throw $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$ct_jl_Exception__T__(new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$c_jl_Exception(), ("Attempting to use owner of unmounted element: " + path))
  }))))
}
function $is_Lcom_raquo_laminar_nodes_ParentNode(obj) {
  return (!(!((obj && obj.$classData) && obj.$classData.ancestors.Lcom_raquo_laminar_nodes_ParentNode)))
}
function $isArrayOf_Lcom_raquo_laminar_nodes_ParentNode(obj, depth) {
  return (!(!(((obj && obj.$classData) && (obj.$classData.arrayDepth === depth)) && obj.$classData.arrayBase.ancestors.Lcom_raquo_laminar_nodes_ParentNode)))
}
/** @constructor */
function $c_Lcom_raquo_laminar_tags_HtmlTag(name, void$1) {
  this.Lcom_raquo_laminar_tags_HtmlTag__f_name = null;
  this.Lcom_raquo_laminar_tags_HtmlTag__f_name = name
}
$c_Lcom_raquo_laminar_tags_HtmlTag.prototype = new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$h_O();
$c_Lcom_raquo_laminar_tags_HtmlTag.prototype.constructor = $c_Lcom_raquo_laminar_tags_HtmlTag;
/** @constructor */
function $h_Lcom_raquo_laminar_tags_HtmlTag() {
  /*<skip>*/
}
$h_Lcom_raquo_laminar_tags_HtmlTag.prototype = $c_Lcom_raquo_laminar_tags_HtmlTag.prototype;
$c_Lcom_raquo_laminar_tags_HtmlTag.prototype.apply__sci_Seq__Lcom_raquo_laminar_nodes_ReactiveHtmlElement = (function(modifiers) {
  var element = this.build__Lcom_raquo_laminar_nodes_ReactiveHtmlElement();
  modifiers.foreach__F1__V(new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$c_sjsr_AnonFunction1(((modifier) => {
    var modifier$1 = modifier;
    modifier$1.apply__Lcom_raquo_laminar_nodes_ReactiveElement__V(element)
  })));
  return element
});
$c_Lcom_raquo_laminar_tags_HtmlTag.prototype.build__Lcom_raquo_laminar_nodes_ReactiveHtmlElement = (function() {
  return new $c_Lcom_raquo_laminar_nodes_ReactiveHtmlElement(this, $m_Lcom_raquo_laminar_DomApi$().createHtmlElement__Lcom_raquo_laminar_tags_HtmlTag__Lorg_scalajs_dom_HTMLElement(this))
});
var $d_Lcom_raquo_laminar_tags_HtmlTag = new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$TypeData().initClass({
  Lcom_raquo_laminar_tags_HtmlTag: 0
}, false, "com.raquo.laminar.tags.HtmlTag", {
  Lcom_raquo_laminar_tags_HtmlTag: 1,
  O: 1,
  Lcom_raquo_laminar_tags_Tag: 1
});
$c_Lcom_raquo_laminar_tags_HtmlTag.prototype.$classData = $d_Lcom_raquo_laminar_tags_HtmlTag;
/** @constructor */
function $c_Lcom_raquo_laminar_tags_SvgTag(name, void$1) {
  this.Lcom_raquo_laminar_tags_SvgTag__f_name = null;
  this.Lcom_raquo_laminar_tags_SvgTag__f_name = name
}
$c_Lcom_raquo_laminar_tags_SvgTag.prototype = new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$h_O();
$c_Lcom_raquo_laminar_tags_SvgTag.prototype.constructor = $c_Lcom_raquo_laminar_tags_SvgTag;
/** @constructor */
function $h_Lcom_raquo_laminar_tags_SvgTag() {
  /*<skip>*/
}
$h_Lcom_raquo_laminar_tags_SvgTag.prototype = $c_Lcom_raquo_laminar_tags_SvgTag.prototype;
var $d_Lcom_raquo_laminar_tags_SvgTag = new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$TypeData().initClass({
  Lcom_raquo_laminar_tags_SvgTag: 0
}, false, "com.raquo.laminar.tags.SvgTag", {
  Lcom_raquo_laminar_tags_SvgTag: 1,
  O: 1,
  Lcom_raquo_laminar_tags_Tag: 1
});
$c_Lcom_raquo_laminar_tags_SvgTag.prototype.$classData = $d_Lcom_raquo_laminar_tags_SvgTag;
/** @constructor */
function $c_jl_Thread(dummy) {
  /*<skip>*/
}
$c_jl_Thread.prototype = new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$h_O();
$c_jl_Thread.prototype.constructor = $c_jl_Thread;
/** @constructor */
function $h_jl_Thread() {
  /*<skip>*/
}
$h_jl_Thread.prototype = $c_jl_Thread.prototype;
$c_jl_Thread.prototype.run__V = (function() {
  /*<skip>*/
});
var $d_jl_Thread = new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$TypeData().initClass({
  jl_Thread: 0
}, false, "java.lang.Thread", {
  jl_Thread: 1,
  O: 1,
  jl_Runnable: 1
});
$c_jl_Thread.prototype.$classData = $d_jl_Thread;
function $ct_ju_concurrent_atomic_AtomicReference__O__($thiz, value) {
  $thiz.ju_concurrent_atomic_AtomicReference__f_value = value;
  return $thiz
}
/** @constructor */
function $c_ju_concurrent_atomic_AtomicReference() {
  this.ju_concurrent_atomic_AtomicReference__f_value = null
}
$c_ju_concurrent_atomic_AtomicReference.prototype = new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$h_O();
$c_ju_concurrent_atomic_AtomicReference.prototype.constructor = $c_ju_concurrent_atomic_AtomicReference;
/** @constructor */
function $h_ju_concurrent_atomic_AtomicReference() {
  /*<skip>*/
}
$h_ju_concurrent_atomic_AtomicReference.prototype = $c_ju_concurrent_atomic_AtomicReference.prototype;
$c_ju_concurrent_atomic_AtomicReference.prototype.compareAndSet__O__O__Z = (function(expect, update) {
  if (Object.is(expect, this.ju_concurrent_atomic_AtomicReference__f_value)) {
    this.ju_concurrent_atomic_AtomicReference__f_value = update;
    return true
  } else {
    return false
  }
});
$c_ju_concurrent_atomic_AtomicReference.prototype.toString__T = (function() {
  var obj = this.ju_concurrent_atomic_AtomicReference__f_value;
  return ("" + obj)
});
/** @constructor */
function $c_s_$less$colon$less$() {
  this.s_$less$colon$less$__f_singleton = null;
  $n_s_$less$colon$less$ = this;
  this.s_$less$colon$less$__f_singleton = new $c_s_$less$colon$less$$anon$1()
}
$c_s_$less$colon$less$.prototype = new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$h_O();
$c_s_$less$colon$less$.prototype.constructor = $c_s_$less$colon$less$;
/** @constructor */
function $h_s_$less$colon$less$() {
  /*<skip>*/
}
$h_s_$less$colon$less$.prototype = $c_s_$less$colon$less$.prototype;
var $d_s_$less$colon$less$ = new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$TypeData().initClass({
  s_$less$colon$less$: 0
}, false, "scala.$less$colon$less$", {
  s_$less$colon$less$: 1,
  O: 1,
  Ljava_io_Serializable: 1
});
$c_s_$less$colon$less$.prototype.$classData = $d_s_$less$colon$less$;
var $n_s_$less$colon$less$;
function $m_s_$less$colon$less$() {
  if ((!$n_s_$less$colon$less$)) {
    $n_s_$less$colon$less$ = new $c_s_$less$colon$less$()
  };
  return $n_s_$less$colon$less$
}
/** @constructor */
function $c_s_Console$() {
  this.s_Console$__f_outVar = null;
  $n_s_Console$ = this;
  this.s_Console$__f_outVar = new $c_s_util_DynamicVariable($m_jl_System$Streams$().jl_System$Streams$__f_out);
  new $c_s_util_DynamicVariable($m_jl_System$Streams$().jl_System$Streams$__f_err);
  new $c_s_util_DynamicVariable(null)
}
$c_s_Console$.prototype = new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$h_O();
$c_s_Console$.prototype.constructor = $c_s_Console$;
/** @constructor */
function $h_s_Console$() {
  /*<skip>*/
}
$h_s_Console$.prototype = $c_s_Console$.prototype;
$c_s_Console$.prototype.out__Ljava_io_PrintStream = (function() {
  return this.s_Console$__f_outVar.s_util_DynamicVariable__f_v
});
var $d_s_Console$ = new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$TypeData().initClass({
  s_Console$: 0
}, false, "scala.Console$", {
  s_Console$: 1,
  O: 1,
  s_io_AnsiColor: 1
});
$c_s_Console$.prototype.$classData = $d_s_Console$;
var $n_s_Console$;
function $m_s_Console$() {
  if ((!$n_s_Console$)) {
    $n_s_Console$ = new $c_s_Console$()
  };
  return $n_s_Console$
}
/** @constructor */
function $c_s_LowPriorityImplicits() {
  /*<skip>*/
}
$c_s_LowPriorityImplicits.prototype = new $h_s_LowPriorityImplicits2();
$c_s_LowPriorityImplicits.prototype.constructor = $c_s_LowPriorityImplicits;
/** @constructor */
function $h_s_LowPriorityImplicits() {
  /*<skip>*/
}
$h_s_LowPriorityImplicits.prototype = $c_s_LowPriorityImplicits.prototype;
$c_s_LowPriorityImplicits.prototype.wrapRefArray__AO__scm_ArraySeq$ofRef = (function(xs) {
  if ((xs === null)) {
    return null
  } else if ((xs.u.length === 0)) {
    var this$3 = $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$m_scm_ArraySeq$();
    $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$m_s_reflect_ManifestFactory$ObjectManifest$();
    return this$3.scm_ArraySeq$__f_EmptyArraySeq
  } else {
    return new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$c_scm_ArraySeq$ofRef(xs)
  }
});
/** @constructor */
function $c_s_Option$() {
  /*<skip>*/
}
$c_s_Option$.prototype = new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$h_O();
$c_s_Option$.prototype.constructor = $c_s_Option$;
/** @constructor */
function $h_s_Option$() {
  /*<skip>*/
}
$h_s_Option$.prototype = $c_s_Option$.prototype;
$c_s_Option$.prototype.apply__O__s_Option = (function(x) {
  return ((x === null) ? $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$m_s_None$() : new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$c_s_Some(x))
});
var $d_s_Option$ = new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$TypeData().initClass({
  s_Option$: 0
}, false, "scala.Option$", {
  s_Option$: 1,
  O: 1,
  Ljava_io_Serializable: 1
});
$c_s_Option$.prototype.$classData = $d_s_Option$;
var $n_s_Option$;
function $m_s_Option$() {
  if ((!$n_s_Option$)) {
    $n_s_Option$ = new $c_s_Option$()
  };
  return $n_s_Option$
}
/** @constructor */
function $c_sci_HashMapBuilder$$anon$1(outer, x2$1) {
  this.sci_ChampBaseIterator__f_currentValueCursor = 0;
  this.sci_ChampBaseIterator__f_currentValueLength = 0;
  this.sci_ChampBaseIterator__f_currentValueNode = null;
  this.sci_ChampBaseIterator__f_currentStackLevel = 0;
  this.sci_ChampBaseIterator__f_nodeCursorsAndLengths = null;
  this.sci_ChampBaseIterator__f_nodes = null;
  $ct_sci_ChampBaseIterator__sci_Node__(this, x2$1.sci_HashMap__f_rootNode);
  while (this.hasNext__Z()) {
    var originalHash = this.sci_ChampBaseIterator__f_currentValueNode.getHash__I__I(this.sci_ChampBaseIterator__f_currentValueCursor);
    outer.update__sci_MapNode__O__O__I__I__I__V(outer.sci_HashMapBuilder__f_scala$collection$immutable$HashMapBuilder$$rootNode, this.sci_ChampBaseIterator__f_currentValueNode.getKey__I__O(this.sci_ChampBaseIterator__f_currentValueCursor), this.sci_ChampBaseIterator__f_currentValueNode.getValue__I__O(this.sci_ChampBaseIterator__f_currentValueCursor), originalHash, $m_sc_Hashing$().improve__I__I(originalHash), 0);
    this.sci_ChampBaseIterator__f_currentValueCursor = ((1 + this.sci_ChampBaseIterator__f_currentValueCursor) | 0)
  }
}
$c_sci_HashMapBuilder$$anon$1.prototype = new $h_sci_ChampBaseIterator();
$c_sci_HashMapBuilder$$anon$1.prototype.constructor = $c_sci_HashMapBuilder$$anon$1;
/** @constructor */
function $h_sci_HashMapBuilder$$anon$1() {
  /*<skip>*/
}
$h_sci_HashMapBuilder$$anon$1.prototype = $c_sci_HashMapBuilder$$anon$1.prototype;
var $d_sci_HashMapBuilder$$anon$1 = new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$TypeData().initClass({
  sci_HashMapBuilder$$anon$1: 0
}, false, "scala.collection.immutable.HashMapBuilder$$anon$1", {
  sci_HashMapBuilder$$anon$1: 1,
  sci_ChampBaseIterator: 1,
  O: 1
});
$c_sci_HashMapBuilder$$anon$1.prototype.$classData = $d_sci_HashMapBuilder$$anon$1;
/** @constructor */
function $c_sci_MapNode() {
  /*<skip>*/
}
$c_sci_MapNode.prototype = new $h_sci_Node();
$c_sci_MapNode.prototype.constructor = $c_sci_MapNode;
/** @constructor */
function $h_sci_MapNode() {
  /*<skip>*/
}
$h_sci_MapNode.prototype = $c_sci_MapNode.prototype;
function $isArrayOf_sci_MapNode(obj, depth) {
  return (!(!(((obj && obj.$classData) && (obj.$classData.arrayDepth === depth)) && obj.$classData.arrayBase.ancestors.sci_MapNode)))
}
function $f_s_concurrent_BatchingExecutor__submitSyncBatched__jl_Runnable__V($thiz, runnable) {
  if ((runnable === null)) {
    throw $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$ct_jl_NullPointerException__T__(new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$c_jl_NullPointerException(), "runnable is null")
  };
  var tl = $thiz.s_concurrent_ExecutionContext$parasitic$__f_scala$concurrent$BatchingExecutor$$_tasksLocal;
  var b = tl.get__O();
  if ((b instanceof $c_s_concurrent_BatchingExecutor$SyncBatch)) {
    b.push__jl_Runnable__V(runnable)
  } else {
    if ((b !== null)) {
      var this$2 = b;
      var i = this$2
    } else {
      var i = 0
    };
    if ((i < 16)) {
      var i$1 = ((1 + i) | 0);
      tl.set__O__V(i$1);
      try {
        runnable.run__V()
      } catch (e) {
        var e$2 = ((e instanceof $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$c_jl_Throwable) ? e : new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$c_sjs_js_JavaScriptException(e));
        if (false) {
          var x2 = e$2;
          $m_s_concurrent_ExecutionContext$().s_concurrent_ExecutionContext$__f_defaultReporter.apply__O__O(x2)
        } else if ($m_s_util_control_NonFatal$().apply__jl_Throwable__Z(e$2)) {
          $m_s_concurrent_ExecutionContext$().s_concurrent_ExecutionContext$__f_defaultReporter.apply__O__O(e$2)
        } else {
          throw ((e$2 instanceof $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$c_sjs_js_JavaScriptException) ? e$2.sjs_js_JavaScriptException__f_exception : e$2)
        }
      } finally {
        tl.set__O__V(b)
      }
    } else {
      var batch = new $c_s_concurrent_BatchingExecutor$SyncBatch($thiz, runnable);
      tl.set__O__V(batch);
      batch.run__V();
      tl.set__O__V(b)
    }
  }
}
function $is_s_concurrent_Future(obj) {
  return (!(!((obj && obj.$classData) && obj.$classData.ancestors.s_concurrent_Future)))
}
function $isArrayOf_s_concurrent_Future(obj, depth) {
  return (!(!(((obj && obj.$classData) && (obj.$classData.arrayDepth === depth)) && obj.$classData.arrayBase.ancestors.s_concurrent_Future)))
}
/** @constructor */
function $c_s_concurrent_impl_Promise$ManyCallbacks(first, rest) {
  this.s_concurrent_impl_Promise$ManyCallbacks__f_first = null;
  this.s_concurrent_impl_Promise$ManyCallbacks__f_rest = null;
  this.s_concurrent_impl_Promise$ManyCallbacks__f_first = first;
  this.s_concurrent_impl_Promise$ManyCallbacks__f_rest = rest
}
$c_s_concurrent_impl_Promise$ManyCallbacks.prototype = new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$h_O();
$c_s_concurrent_impl_Promise$ManyCallbacks.prototype.constructor = $c_s_concurrent_impl_Promise$ManyCallbacks;
/** @constructor */
function $h_s_concurrent_impl_Promise$ManyCallbacks() {
  /*<skip>*/
}
$h_s_concurrent_impl_Promise$ManyCallbacks.prototype = $c_s_concurrent_impl_Promise$ManyCallbacks.prototype;
$c_s_concurrent_impl_Promise$ManyCallbacks.prototype.toString__T = (function() {
  return "ManyCallbacks"
});
function $isArrayOf_s_concurrent_impl_Promise$ManyCallbacks(obj, depth) {
  return (!(!(((obj && obj.$classData) && (obj.$classData.arrayDepth === depth)) && obj.$classData.arrayBase.ancestors.s_concurrent_impl_Promise$ManyCallbacks)))
}
var $d_s_concurrent_impl_Promise$ManyCallbacks = new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$TypeData().initClass({
  s_concurrent_impl_Promise$ManyCallbacks: 0
}, false, "scala.concurrent.impl.Promise$ManyCallbacks", {
  s_concurrent_impl_Promise$ManyCallbacks: 1,
  O: 1,
  s_concurrent_impl_Promise$Callbacks: 1
});
$c_s_concurrent_impl_Promise$ManyCallbacks.prototype.$classData = $d_s_concurrent_impl_Promise$ManyCallbacks;
/** @constructor */
function $c_sr_AbstractFunction2() {
  /*<skip>*/
}
$c_sr_AbstractFunction2.prototype = new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$h_O();
$c_sr_AbstractFunction2.prototype.constructor = $c_sr_AbstractFunction2;
/** @constructor */
function $h_sr_AbstractFunction2() {
  /*<skip>*/
}
$h_sr_AbstractFunction2.prototype = $c_sr_AbstractFunction2.prototype;
$c_sr_AbstractFunction2.prototype.toString__T = (function() {
  return "<function2>"
});
/** @constructor */
function $c_sr_AbstractFunction3() {
  /*<skip>*/
}
$c_sr_AbstractFunction3.prototype = new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$h_O();
$c_sr_AbstractFunction3.prototype.constructor = $c_sr_AbstractFunction3;
/** @constructor */
function $h_sr_AbstractFunction3() {
  /*<skip>*/
}
$h_sr_AbstractFunction3.prototype = $c_sr_AbstractFunction3.prototype;
$c_sr_AbstractFunction3.prototype.toString__T = (function() {
  return "<function3>"
});
/** @constructor */
function $c_sr_AbstractFunction4() {
  /*<skip>*/
}
$c_sr_AbstractFunction4.prototype = new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$h_O();
$c_sr_AbstractFunction4.prototype.constructor = $c_sr_AbstractFunction4;
/** @constructor */
function $h_sr_AbstractFunction4() {
  /*<skip>*/
}
$h_sr_AbstractFunction4.prototype = $c_sr_AbstractFunction4.prototype;
$c_sr_AbstractFunction4.prototype.toString__T = (function() {
  return "<function4>"
});
/** @constructor */
function $c_sr_BooleanRef(elem) {
  this.sr_BooleanRef__f_elem = false;
  this.sr_BooleanRef__f_elem = elem
}
$c_sr_BooleanRef.prototype = new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$h_O();
$c_sr_BooleanRef.prototype.constructor = $c_sr_BooleanRef;
/** @constructor */
function $h_sr_BooleanRef() {
  /*<skip>*/
}
$h_sr_BooleanRef.prototype = $c_sr_BooleanRef.prototype;
$c_sr_BooleanRef.prototype.toString__T = (function() {
  var b = this.sr_BooleanRef__f_elem;
  return ("" + b)
});
var $d_sr_BooleanRef = new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$TypeData().initClass({
  sr_BooleanRef: 0
}, false, "scala.runtime.BooleanRef", {
  sr_BooleanRef: 1,
  O: 1,
  Ljava_io_Serializable: 1
});
$c_sr_BooleanRef.prototype.$classData = $d_sr_BooleanRef;
/** @constructor */
function $c_s_util_control_NoStackTrace$() {
  this.s_util_control_NoStackTrace$__f__noSuppression = false;
  this.s_util_control_NoStackTrace$__f__noSuppression = false
}
$c_s_util_control_NoStackTrace$.prototype = new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$h_O();
$c_s_util_control_NoStackTrace$.prototype.constructor = $c_s_util_control_NoStackTrace$;
/** @constructor */
function $h_s_util_control_NoStackTrace$() {
  /*<skip>*/
}
$h_s_util_control_NoStackTrace$.prototype = $c_s_util_control_NoStackTrace$.prototype;
var $d_s_util_control_NoStackTrace$ = new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$TypeData().initClass({
  s_util_control_NoStackTrace$: 0
}, false, "scala.util.control.NoStackTrace$", {
  s_util_control_NoStackTrace$: 1,
  O: 1,
  Ljava_io_Serializable: 1
});
$c_s_util_control_NoStackTrace$.prototype.$classData = $d_s_util_control_NoStackTrace$;
var $n_s_util_control_NoStackTrace$;
function $m_s_util_control_NoStackTrace$() {
  if ((!$n_s_util_control_NoStackTrace$)) {
    $n_s_util_control_NoStackTrace$ = new $c_s_util_control_NoStackTrace$()
  };
  return $n_s_util_control_NoStackTrace$
}
/** @constructor */
function $c_Lbe_doeraene_webcomponents_ui5_Button$() {
  this.Lbe_doeraene_webcomponents_ui5_Button$__f_icon$lzy1 = null;
  this.Lbe_doeraene_webcomponents_ui5_Button$__f_iconbitmap$1 = false;
  this.Lbe_doeraene_webcomponents_ui5_Button$__f_tag = null;
  this.Lbe_doeraene_webcomponents_ui5_Button$__f_design$lzy1 = null;
  this.Lbe_doeraene_webcomponents_ui5_Button$__f_designbitmap$1 = false;
  $n_Lbe_doeraene_webcomponents_ui5_Button$ = this;
  $f_Lbe_doeraene_webcomponents_WebComponent__$init$__V(this);
  $i_$0040ui5$002fwebcomponents$002fdist$002fButton$002ejs.default;
  $m_Lcom_raquo_laminar_api_package$();
  $m_Lcom_raquo_laminar_api_package$();
  var void$1 = false;
  this.Lbe_doeraene_webcomponents_ui5_Button$__f_tag = new $c_Lcom_raquo_laminar_tags_HtmlTag("ui5-button", void$1)
}
$c_Lbe_doeraene_webcomponents_ui5_Button$.prototype = new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$h_O();
$c_Lbe_doeraene_webcomponents_ui5_Button$.prototype.constructor = $c_Lbe_doeraene_webcomponents_ui5_Button$;
/** @constructor */
function $h_Lbe_doeraene_webcomponents_ui5_Button$() {
  /*<skip>*/
}
$h_Lbe_doeraene_webcomponents_ui5_Button$.prototype = $c_Lbe_doeraene_webcomponents_ui5_Button$.prototype;
$c_Lbe_doeraene_webcomponents_ui5_Button$.prototype.be$doeraene$webcomponents$WebComponent$_setter_$id_$eq__Lcom_raquo_laminar_keys_HtmlProp__V = (function(x$0) {
  /*<skip>*/
});
$c_Lbe_doeraene_webcomponents_ui5_Button$.prototype.icon__Lcom_raquo_laminar_keys_HtmlAttr = (function() {
  if ((!this.Lbe_doeraene_webcomponents_ui5_Button$__f_iconbitmap$1)) {
    $m_Lcom_raquo_laminar_api_package$();
    var codec = new $c_Lbe_doeraene_webcomponents_ui5_configkeys_IconName$$anon$1();
    this.Lbe_doeraene_webcomponents_ui5_Button$__f_icon$lzy1 = new $c_Lcom_raquo_laminar_keys_HtmlAttr("icon", codec);
    this.Lbe_doeraene_webcomponents_ui5_Button$__f_iconbitmap$1 = true
  };
  return this.Lbe_doeraene_webcomponents_ui5_Button$__f_icon$lzy1
});
$c_Lbe_doeraene_webcomponents_ui5_Button$.prototype.tag__Lcom_raquo_laminar_tags_HtmlTag = (function() {
  return this.Lbe_doeraene_webcomponents_ui5_Button$__f_tag
});
$c_Lbe_doeraene_webcomponents_ui5_Button$.prototype.design__Lcom_raquo_laminar_keys_HtmlAttr = (function() {
  if ((!this.Lbe_doeraene_webcomponents_ui5_Button$__f_designbitmap$1)) {
    $m_Lcom_raquo_laminar_api_package$();
    var codec = $m_Lbe_doeraene_webcomponents_ui5_configkeys_ButtonDesign$().AsStringCodec__Lbe_doeraene_webcomponents_ui5_configkeys_EnumerationString$AsStringCodec$();
    this.Lbe_doeraene_webcomponents_ui5_Button$__f_design$lzy1 = new $c_Lcom_raquo_laminar_keys_HtmlAttr("design", codec);
    this.Lbe_doeraene_webcomponents_ui5_Button$__f_designbitmap$1 = true
  };
  return this.Lbe_doeraene_webcomponents_ui5_Button$__f_design$lzy1
});
function $isArrayOf_Lbe_doeraene_webcomponents_ui5_Button$(obj, depth) {
  return (!(!(((obj && obj.$classData) && (obj.$classData.arrayDepth === depth)) && obj.$classData.arrayBase.ancestors.Lbe_doeraene_webcomponents_ui5_Button$)))
}
var $d_Lbe_doeraene_webcomponents_ui5_Button$ = new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$TypeData().initClass({
  Lbe_doeraene_webcomponents_ui5_Button$: 0
}, false, "be.doeraene.webcomponents.ui5.Button$", {
  Lbe_doeraene_webcomponents_ui5_Button$: 1,
  O: 1,
  Lbe_doeraene_webcomponents_WebComponent: 1,
  Lbe_doeraene_webcomponents_ui5_HasIcon: 1
});
$c_Lbe_doeraene_webcomponents_ui5_Button$.prototype.$classData = $d_Lbe_doeraene_webcomponents_ui5_Button$;
var $n_Lbe_doeraene_webcomponents_ui5_Button$;
function $m_Lbe_doeraene_webcomponents_ui5_Button$() {
  if ((!$n_Lbe_doeraene_webcomponents_ui5_Button$)) {
    $n_Lbe_doeraene_webcomponents_ui5_Button$ = new $c_Lbe_doeraene_webcomponents_ui5_Button$()
  };
  return $n_Lbe_doeraene_webcomponents_ui5_Button$
}
/** @constructor */
function $c_Lbe_doeraene_webcomponents_ui5_Label$() {
  this.Lbe_doeraene_webcomponents_ui5_Label$__f_tag = null;
  this.Lbe_doeraene_webcomponents_ui5_Label$__f_required$lzy1 = null;
  this.Lbe_doeraene_webcomponents_ui5_Label$__f_requiredbitmap$1 = false;
  $n_Lbe_doeraene_webcomponents_ui5_Label$ = this;
  $f_Lbe_doeraene_webcomponents_WebComponent__$init$__V(this);
  $i_$0040ui5$002fwebcomponents$002fdist$002fLabel$002ejs.default;
  $m_Lcom_raquo_laminar_api_package$();
  $m_Lcom_raquo_laminar_api_package$();
  var void$1 = false;
  this.Lbe_doeraene_webcomponents_ui5_Label$__f_tag = new $c_Lcom_raquo_laminar_tags_HtmlTag("ui5-label", void$1);
  this.required__Lcom_raquo_laminar_keys_HtmlAttr().$colon$eq__O__Lcom_raquo_laminar_modifiers_KeySetter(true)
}
$c_Lbe_doeraene_webcomponents_ui5_Label$.prototype = new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$h_O();
$c_Lbe_doeraene_webcomponents_ui5_Label$.prototype.constructor = $c_Lbe_doeraene_webcomponents_ui5_Label$;
/** @constructor */
function $h_Lbe_doeraene_webcomponents_ui5_Label$() {
  /*<skip>*/
}
$h_Lbe_doeraene_webcomponents_ui5_Label$.prototype = $c_Lbe_doeraene_webcomponents_ui5_Label$.prototype;
$c_Lbe_doeraene_webcomponents_ui5_Label$.prototype.be$doeraene$webcomponents$WebComponent$_setter_$id_$eq__Lcom_raquo_laminar_keys_HtmlProp__V = (function(x$0) {
  /*<skip>*/
});
$c_Lbe_doeraene_webcomponents_ui5_Label$.prototype.tag__Lcom_raquo_laminar_tags_HtmlTag = (function() {
  return this.Lbe_doeraene_webcomponents_ui5_Label$__f_tag
});
$c_Lbe_doeraene_webcomponents_ui5_Label$.prototype.required__Lcom_raquo_laminar_keys_HtmlAttr = (function() {
  if ((!this.Lbe_doeraene_webcomponents_ui5_Label$__f_requiredbitmap$1)) {
    $m_Lcom_raquo_laminar_api_package$();
    var codec = $m_Lcom_raquo_laminar_codecs_package$().Lcom_raquo_laminar_codecs_package$__f_BooleanAsAttrPresenceCodec;
    this.Lbe_doeraene_webcomponents_ui5_Label$__f_required$lzy1 = new $c_Lcom_raquo_laminar_keys_HtmlAttr("required", codec);
    this.Lbe_doeraene_webcomponents_ui5_Label$__f_requiredbitmap$1 = true
  };
  return this.Lbe_doeraene_webcomponents_ui5_Label$__f_required$lzy1
});
var $d_Lbe_doeraene_webcomponents_ui5_Label$ = new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$TypeData().initClass({
  Lbe_doeraene_webcomponents_ui5_Label$: 0
}, false, "be.doeraene.webcomponents.ui5.Label$", {
  Lbe_doeraene_webcomponents_ui5_Label$: 1,
  O: 1,
  Lbe_doeraene_webcomponents_WebComponent: 1,
  Lbe_doeraene_webcomponents_ui5_HasIcon: 1
});
$c_Lbe_doeraene_webcomponents_ui5_Label$.prototype.$classData = $d_Lbe_doeraene_webcomponents_ui5_Label$;
var $n_Lbe_doeraene_webcomponents_ui5_Label$;
function $m_Lbe_doeraene_webcomponents_ui5_Label$() {
  if ((!$n_Lbe_doeraene_webcomponents_ui5_Label$)) {
    $n_Lbe_doeraene_webcomponents_ui5_Label$ = new $c_Lbe_doeraene_webcomponents_ui5_Label$()
  };
  return $n_Lbe_doeraene_webcomponents_ui5_Label$
}
class $c_Lcom_raquo_airstream_core_AirstreamError extends $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$c_jl_Throwable {
}
/** @constructor */
function $c_Lcom_raquo_airstream_core_AirstreamError$() {
  this.Lcom_raquo_airstream_core_AirstreamError$__f_unhandledErrorCallbacks = null;
  this.Lcom_raquo_airstream_core_AirstreamError$__f_consoleErrorCallback = null;
  this.Lcom_raquo_airstream_core_AirstreamError$__f_unsafeRethrowErrorCallback = null;
  $n_Lcom_raquo_airstream_core_AirstreamError$ = this;
  this.Lcom_raquo_airstream_core_AirstreamError$__f_unhandledErrorCallbacks = $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$m_scm_Buffer$().apply__sci_Seq__sc_SeqOps($j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$m_sr_ScalaRunTime$().wrapRefArray__AO__sci_ArraySeq(new ($d_F1.getArrayOf().constr)([])));
  this.Lcom_raquo_airstream_core_AirstreamError$__f_consoleErrorCallback = new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$c_sjsr_AnonFunction1(((err) => {
    var err$1 = err;
    try {
      var $$x2 = console;
      var $$x1 = err$1.getMessage__T();
      var this$2 = $m_s_Predef$().wrapRefArray__AO__scm_ArraySeq$ofRef(err$1.getStackTrace__Ajl_StackTraceElement());
      $$x2.error((($$x1 + "\n") + $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$f_sc_IterableOnceOps__mkString__T__T__T__T(this$2, "", "\n", "")))
    } catch (e) {
      /*<skip>*/
    }
  }));
  new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$c_sjsr_AnonFunction1(((_$4) => {
    debugger
  }));
  this.Lcom_raquo_airstream_core_AirstreamError$__f_unsafeRethrowErrorCallback = new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$c_sjsr_AnonFunction1(((err$2) => {
    var err$3 = err$2;
    console.warn("Using unsafe rethrow error callback. Note: other registered error callbacks might not run. Use with caution.");
    throw ((err$3 instanceof $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$c_sjs_js_JavaScriptException) ? err$3.sjs_js_JavaScriptException__f_exception : err$3)
  }));
  new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$c_sjsr_AnonFunction1(((err$3$1) => {
    var err$4 = err$3$1;
    $m_sjs_js_timers_package$().setTimeout__D__F0__sjs_js_timers_SetTimeoutHandle(0.0, new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$c_sjsr_AnonFunction0((() => {
      throw ((err$4 instanceof $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$c_sjs_js_JavaScriptException) ? err$4.sjs_js_JavaScriptException__f_exception : err$4)
    })))
  }));
  this.registerUnhandledErrorCallback__F1__V(this.Lcom_raquo_airstream_core_AirstreamError$__f_consoleErrorCallback)
}
$c_Lcom_raquo_airstream_core_AirstreamError$.prototype = new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$h_O();
$c_Lcom_raquo_airstream_core_AirstreamError$.prototype.constructor = $c_Lcom_raquo_airstream_core_AirstreamError$;
/** @constructor */
function $h_Lcom_raquo_airstream_core_AirstreamError$() {
  /*<skip>*/
}
$h_Lcom_raquo_airstream_core_AirstreamError$.prototype = $c_Lcom_raquo_airstream_core_AirstreamError$.prototype;
$c_Lcom_raquo_airstream_core_AirstreamError$.prototype.com$raquo$airstream$core$AirstreamError$$$VarError$superArg$1__T__s_Option__T = (function(message, cause) {
  if (cause.isEmpty__Z()) {
    var $$x1 = $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$m_s_None$()
  } else {
    var arg1 = cause.get__O();
    var _$1 = arg1;
    var $$x1 = new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$c_s_Some(_$1.getMessage__T())
  };
  return ((message + "; cause: ") + $$x1)
});
$c_Lcom_raquo_airstream_core_AirstreamError$.prototype.com$raquo$airstream$core$AirstreamError$$$CombinedError$superArg$1__sci_Seq__T = (function(causes) {
  var this$2 = $m_s_$less$colon$less$();
  var this$4 = causes.flatten__F1__O(this$2.s_$less$colon$less$__f_singleton).map__F1__O(new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$c_sjsr_AnonFunction1(((_$2) => {
    var _$2$1 = _$2;
    return _$2$1.getMessage__T()
  })));
  return ("CombinedError: " + $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$f_sc_IterableOnceOps__mkString__T__T__T__T(this$4, "", "; ", ""))
});
$c_Lcom_raquo_airstream_core_AirstreamError$.prototype.registerUnhandledErrorCallback__F1__V = (function(fn) {
  var this$1 = this.Lcom_raquo_airstream_core_AirstreamError$__f_unhandledErrorCallbacks;
  this$1.addOne__O__scm_Growable(fn)
});
$c_Lcom_raquo_airstream_core_AirstreamError$.prototype.sendUnhandledError__jl_Throwable__V = (function(err) {
  var this$1 = this.Lcom_raquo_airstream_core_AirstreamError$__f_unhandledErrorCallbacks;
  var it = this$1.iterator__sc_Iterator();
  while (it.hasNext__Z()) {
    var arg1 = it.next__O();
    var fn = arg1;
    try {
      fn.apply__O__O(err)
    } catch (e) {
      var e$2 = ((e instanceof $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$c_jl_Throwable) ? e : new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$c_sjs_js_JavaScriptException(e));
      var x$2 = this.Lcom_raquo_airstream_core_AirstreamError$__f_unsafeRethrowErrorCallback;
      if (((fn === null) ? (x$2 === null) : fn.equals__O__Z(x$2))) {
        throw ((e$2 instanceof $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$c_sjs_js_JavaScriptException) ? e$2.sjs_js_JavaScriptException__f_exception : e$2)
      } else {
        console.warn("Error processing an unhandled error callback:");
        $m_sjs_js_timers_package$().setTimeout__D__F0__sjs_js_timers_SetTimeoutHandle(0.0, new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$c_sjsr_AnonFunction0(((e$2) => (() => {
          throw ((e$2 instanceof $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$c_sjs_js_JavaScriptException) ? e$2.sjs_js_JavaScriptException__f_exception : e$2)
        }))(e$2)))
      }
    }
  }
});
var $d_Lcom_raquo_airstream_core_AirstreamError$ = new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$TypeData().initClass({
  Lcom_raquo_airstream_core_AirstreamError$: 0
}, false, "com.raquo.airstream.core.AirstreamError$", {
  Lcom_raquo_airstream_core_AirstreamError$: 1,
  O: 1,
  s_deriving_Mirror: 1,
  s_deriving_Mirror$Sum: 1
});
$c_Lcom_raquo_airstream_core_AirstreamError$.prototype.$classData = $d_Lcom_raquo_airstream_core_AirstreamError$;
var $n_Lcom_raquo_airstream_core_AirstreamError$;
function $m_Lcom_raquo_airstream_core_AirstreamError$() {
  if ((!$n_Lcom_raquo_airstream_core_AirstreamError$)) {
    $n_Lcom_raquo_airstream_core_AirstreamError$ = new $c_Lcom_raquo_airstream_core_AirstreamError$()
  };
  return $n_Lcom_raquo_airstream_core_AirstreamError$
}
function $f_Lcom_raquo_airstream_core_BaseObservable__$init$__V($thiz) {
  $thiz.isSafeToRemoveObserver_$eq__Z__V(true);
  $thiz.maybePendingObserverRemovals_$eq__O__V((void 0))
}
function $f_Lcom_raquo_airstream_core_BaseObservable__mapTo__F0__Lcom_raquo_airstream_core_Observable($thiz, value) {
  return $thiz.map__F1__Lcom_raquo_airstream_core_Observable(new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$c_sjsr_AnonFunction1(((_$2) => value.apply__O())))
}
function $f_Lcom_raquo_airstream_core_BaseObservable__foreach__F1__Lcom_raquo_airstream_ownership_Owner__Lcom_raquo_airstream_ownership_Subscription($thiz, onNext, owner) {
  var this$1 = $m_Lcom_raquo_airstream_core_Observer$();
  var observer = this$1.withRecover__F1__s_PartialFunction__Z__Lcom_raquo_airstream_core_Observer(onNext, $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$m_s_PartialFunction$().s_PartialFunction$__f_empty_pf, true);
  return $f_Lcom_raquo_airstream_core_WritableObservable__addObserver__Lcom_raquo_airstream_core_Observer__Lcom_raquo_airstream_ownership_Owner__Lcom_raquo_airstream_ownership_Subscription($thiz, observer, owner)
}
function $f_Lcom_raquo_airstream_core_BaseObservable__removeExternalObserver__Lcom_raquo_airstream_core_Observer__V($thiz, observer) {
  if ($thiz.isSafeToRemoveObserver__Z()) {
    $f_Lcom_raquo_airstream_core_WritableObservable__removeExternalObserverNow__Lcom_raquo_airstream_core_Observer__V($thiz, observer)
  } else {
    $f_Lcom_raquo_airstream_core_BaseObservable__getOrCreatePendingObserverRemovals__Lcom_raquo_ew_JsArray($thiz).push(new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$c_sjsr_AnonFunction0((() => {
      $f_Lcom_raquo_airstream_core_WritableObservable__removeExternalObserverNow__Lcom_raquo_airstream_core_Observer__V($thiz, observer)
    })))
  }
}
function $f_Lcom_raquo_airstream_core_BaseObservable__removeInternalObserver__Lcom_raquo_airstream_core_InternalObserver__V($thiz, observer) {
  if ($thiz.isSafeToRemoveObserver__Z()) {
    $f_Lcom_raquo_airstream_core_WritableObservable__removeInternalObserverNow__Lcom_raquo_airstream_core_InternalObserver__V($thiz, observer)
  } else {
    $f_Lcom_raquo_airstream_core_BaseObservable__getOrCreatePendingObserverRemovals__Lcom_raquo_ew_JsArray($thiz).push(new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$c_sjsr_AnonFunction0((() => {
      $f_Lcom_raquo_airstream_core_WritableObservable__removeInternalObserverNow__Lcom_raquo_airstream_core_InternalObserver__V($thiz, observer)
    })))
  }
}
function $f_Lcom_raquo_airstream_core_BaseObservable__isStarted__Z($thiz) {
  return ($f_Lcom_raquo_airstream_core_WritableObservable__numAllObservers__I($thiz) > 0)
}
function $f_Lcom_raquo_airstream_core_BaseObservable__getOrCreatePendingObserverRemovals__Lcom_raquo_ew_JsArray($thiz) {
  var x = $thiz.maybePendingObserverRemovals__O();
  if ((x === (void 0))) {
    var newArray = $m_Lcom_raquo_ew_JsArray$().apply__sci_Seq__Lcom_raquo_ew_JsArray($j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$m_sr_ScalaRunTime$().wrapRefArray__AO__sci_ArraySeq(new ($d_F0.getArrayOf().constr)([])));
    $thiz.maybePendingObserverRemovals_$eq__O__V(newArray);
    return newArray
  } else {
    return x
  }
}
function $f_Lcom_raquo_airstream_core_BaseObservable__maybeWillStart__V($thiz) {
  if ((!$f_Lcom_raquo_airstream_core_BaseObservable__isStarted__Z($thiz))) {
    $thiz.onWillStart__V()
  }
}
function $is_Lcom_raquo_airstream_core_Observer(obj) {
  return (!(!((obj && obj.$classData) && obj.$classData.ancestors.Lcom_raquo_airstream_core_Observer)))
}
function $isArrayOf_Lcom_raquo_airstream_core_Observer(obj, depth) {
  return (!(!(((obj && obj.$classData) && (obj.$classData.arrayDepth === depth)) && obj.$classData.arrayBase.ancestors.Lcom_raquo_airstream_core_Observer)))
}
var $d_Lcom_raquo_airstream_core_Observer = new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$TypeData().initClass({
  Lcom_raquo_airstream_core_Observer: 0
}, true, "com.raquo.airstream.core.Observer", {
  Lcom_raquo_airstream_core_Observer: 1,
  O: 1,
  Lcom_raquo_airstream_core_Sink: 1,
  Lcom_raquo_airstream_core_Named: 1
});
function $f_Lcom_raquo_laminar_Implicits__textToTextNode__O__Lcom_raquo_laminar_modifiers_RenderableText__Lcom_raquo_laminar_nodes_TextNode($thiz, value, renderable) {
  return new $c_Lcom_raquo_laminar_nodes_TextNode(renderable.asString__O__T(value))
}
/** @constructor */
function $c_Lcom_raquo_laminar_api_Laminar$$anon$1() {
  this.Lcom_raquo_laminar_api_Laminar$$anon$1__f_onDomContentLoaded$lzy1 = null;
  this.Lcom_raquo_laminar_api_Laminar$$anon$1__f_onDomContentLoadedbitmap$1 = false
}
$c_Lcom_raquo_laminar_api_Laminar$$anon$1.prototype = new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$h_O();
$c_Lcom_raquo_laminar_api_Laminar$$anon$1.prototype.constructor = $c_Lcom_raquo_laminar_api_Laminar$$anon$1;
/** @constructor */
function $h_Lcom_raquo_laminar_api_Laminar$$anon$1() {
  /*<skip>*/
}
$h_Lcom_raquo_laminar_api_Laminar$$anon$1.prototype = $c_Lcom_raquo_laminar_api_Laminar$$anon$1.prototype;
$c_Lcom_raquo_laminar_api_Laminar$$anon$1.prototype.onDomContentLoaded__Lcom_raquo_laminar_keys_EventProp = (function() {
  if ((!this.Lcom_raquo_laminar_api_Laminar$$anon$1__f_onDomContentLoadedbitmap$1)) {
    this.Lcom_raquo_laminar_api_Laminar$$anon$1__f_onDomContentLoaded$lzy1 = new $c_Lcom_raquo_laminar_keys_EventProp("DOMContentLoaded");
    this.Lcom_raquo_laminar_api_Laminar$$anon$1__f_onDomContentLoadedbitmap$1 = true
  };
  return this.Lcom_raquo_laminar_api_Laminar$$anon$1__f_onDomContentLoaded$lzy1
});
var $d_Lcom_raquo_laminar_api_Laminar$$anon$1 = new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$TypeData().initClass({
  Lcom_raquo_laminar_api_Laminar$$anon$1: 0
}, false, "com.raquo.laminar.api.Laminar$$anon$1", {
  Lcom_raquo_laminar_api_Laminar$$anon$1: 1,
  O: 1,
  Lcom_raquo_laminar_defs_eventProps_GlobalEventProps: 1,
  Lcom_raquo_laminar_defs_eventProps_DocumentEventProps: 1
});
$c_Lcom_raquo_laminar_api_Laminar$$anon$1.prototype.$classData = $d_Lcom_raquo_laminar_api_Laminar$$anon$1;
/** @constructor */
function $c_Lcom_raquo_laminar_api_Laminar$$anon$2() {
  /*<skip>*/
}
$c_Lcom_raquo_laminar_api_Laminar$$anon$2.prototype = new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$h_O();
$c_Lcom_raquo_laminar_api_Laminar$$anon$2.prototype.constructor = $c_Lcom_raquo_laminar_api_Laminar$$anon$2;
/** @constructor */
function $h_Lcom_raquo_laminar_api_Laminar$$anon$2() {
  /*<skip>*/
}
$h_Lcom_raquo_laminar_api_Laminar$$anon$2.prototype = $c_Lcom_raquo_laminar_api_Laminar$$anon$2.prototype;
var $d_Lcom_raquo_laminar_api_Laminar$$anon$2 = new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$TypeData().initClass({
  Lcom_raquo_laminar_api_Laminar$$anon$2: 0
}, false, "com.raquo.laminar.api.Laminar$$anon$2", {
  Lcom_raquo_laminar_api_Laminar$$anon$2: 1,
  O: 1,
  Lcom_raquo_laminar_defs_eventProps_GlobalEventProps: 1,
  Lcom_raquo_laminar_defs_eventProps_WindowEventProps: 1
});
$c_Lcom_raquo_laminar_api_Laminar$$anon$2.prototype.$classData = $d_Lcom_raquo_laminar_api_Laminar$$anon$2;
/** @constructor */
function $c_Lcom_raquo_laminar_modifiers_Binder$$anon$1(fn$3) {
  this.Lcom_raquo_laminar_modifiers_Binder$$anon$1__f_fn$1 = null;
  this.Lcom_raquo_laminar_modifiers_Binder$$anon$1__f_fn$1 = fn$3
}
$c_Lcom_raquo_laminar_modifiers_Binder$$anon$1.prototype = new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$h_O();
$c_Lcom_raquo_laminar_modifiers_Binder$$anon$1.prototype.constructor = $c_Lcom_raquo_laminar_modifiers_Binder$$anon$1;
/** @constructor */
function $h_Lcom_raquo_laminar_modifiers_Binder$$anon$1() {
  /*<skip>*/
}
$h_Lcom_raquo_laminar_modifiers_Binder$$anon$1.prototype = $c_Lcom_raquo_laminar_modifiers_Binder$$anon$1.prototype;
$c_Lcom_raquo_laminar_modifiers_Binder$$anon$1.prototype.apply__Lcom_raquo_laminar_nodes_ReactiveElement__V = (function(element) {
  this.bind__Lcom_raquo_laminar_nodes_ReactiveElement__Lcom_raquo_airstream_ownership_DynamicSubscription(element)
});
$c_Lcom_raquo_laminar_modifiers_Binder$$anon$1.prototype.bind__Lcom_raquo_laminar_nodes_ReactiveElement__Lcom_raquo_airstream_ownership_DynamicSubscription = (function(element) {
  return this.Lcom_raquo_laminar_modifiers_Binder$$anon$1__f_fn$1.apply__O__O(element)
});
var $d_Lcom_raquo_laminar_modifiers_Binder$$anon$1 = new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$TypeData().initClass({
  Lcom_raquo_laminar_modifiers_Binder$$anon$1: 0
}, false, "com.raquo.laminar.modifiers.Binder$$anon$1", {
  Lcom_raquo_laminar_modifiers_Binder$$anon$1: 1,
  O: 1,
  Lcom_raquo_laminar_modifiers_Modifier: 1,
  Lcom_raquo_laminar_modifiers_Binder: 1
});
$c_Lcom_raquo_laminar_modifiers_Binder$$anon$1.prototype.$classData = $d_Lcom_raquo_laminar_modifiers_Binder$$anon$1;
/** @constructor */
function $c_Lcom_raquo_laminar_modifiers_EventListener(eventProcessor, callback) {
  this.Lcom_raquo_laminar_modifiers_EventListener__f_eventProcessor = null;
  this.Lcom_raquo_laminar_modifiers_EventListener__f_domCallback = null;
  this.Lcom_raquo_laminar_modifiers_EventListener__f_options = null;
  this.Lcom_raquo_laminar_modifiers_EventListener__f_eventProcessor = eventProcessor;
  this.Lcom_raquo_laminar_modifiers_EventListener__f_domCallback = ((ev) => {
    var processor = eventProcessor.Lcom_raquo_laminar_keys_EventProcessor__f_processor;
    var this$2 = processor.apply__O__O(ev);
    if ((!this$2.isEmpty__Z())) {
      callback.apply__O__O(this$2.get__O())
    }
  });
  this.Lcom_raquo_laminar_modifiers_EventListener__f_options = (() => {
    var outer = null;
    outer = this;
    var this$3 = {};
    if ((outer === null)) {
      throw $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$ct_jl_NullPointerException__(new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$c_jl_NullPointerException())
    };
    var prop = outer.Lcom_raquo_laminar_modifiers_EventListener__f_eventProcessor;
    this$3.capture = prop.Lcom_raquo_laminar_keys_EventProcessor__f_shouldUseCapture;
    var prop$1 = outer.Lcom_raquo_laminar_modifiers_EventListener__f_eventProcessor;
    this$3.passive = prop$1.Lcom_raquo_laminar_keys_EventProcessor__f_shouldBePassive;
    return this$3
  })()
}
$c_Lcom_raquo_laminar_modifiers_EventListener.prototype = new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$h_O();
$c_Lcom_raquo_laminar_modifiers_EventListener.prototype.constructor = $c_Lcom_raquo_laminar_modifiers_EventListener;
/** @constructor */
function $h_Lcom_raquo_laminar_modifiers_EventListener() {
  /*<skip>*/
}
$h_Lcom_raquo_laminar_modifiers_EventListener.prototype = $c_Lcom_raquo_laminar_modifiers_EventListener.prototype;
$c_Lcom_raquo_laminar_modifiers_EventListener.prototype.apply__Lcom_raquo_laminar_nodes_ReactiveElement__V = (function(element) {
  this.bind__Lcom_raquo_laminar_nodes_ReactiveElement__Z__Lcom_raquo_airstream_ownership_DynamicSubscription(element, false)
});
$c_Lcom_raquo_laminar_modifiers_EventListener.prototype.bind__Lcom_raquo_laminar_nodes_ReactiveElement__Z__Lcom_raquo_airstream_ownership_DynamicSubscription = (function(element, unsafePrepend) {
  if (($f_Lcom_raquo_laminar_nodes_ReactiveElement__indexOfEventListener__Lcom_raquo_laminar_modifiers_EventListener__I(element, this) === (-1))) {
    var subscribe = new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$c_sjsr_AnonFunction1(((ctx) => {
      var ctx$1 = ctx;
      $m_Lcom_raquo_laminar_DomApi$().addEventListener__Lorg_scalajs_dom_Element__Lcom_raquo_laminar_modifiers_EventListener__V(element.Lcom_raquo_laminar_nodes_ReactiveHtmlElement__f_ref, this);
      return new $c_Lcom_raquo_airstream_ownership_Subscription(ctx$1.Lcom_raquo_laminar_lifecycle_MountContext__f_owner, new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$c_sjsr_AnonFunction0((() => {
        var listenerIndex = $f_Lcom_raquo_laminar_nodes_ReactiveElement__indexOfEventListener__Lcom_raquo_laminar_modifiers_EventListener__I(element, this);
        if ((listenerIndex !== (-1))) {
          $f_Lcom_raquo_laminar_nodes_ReactiveElement__removeEventListener__I__V(element, listenerIndex);
          $m_Lcom_raquo_laminar_DomApi$().removeEventListener__Lorg_scalajs_dom_Element__Lcom_raquo_laminar_modifiers_EventListener__V(element.Lcom_raquo_laminar_nodes_ReactiveHtmlElement__f_ref, this)
        }
      })))
    }));
    var sub = (unsafePrepend ? $m_Lcom_raquo_laminar_nodes_ReactiveElement$().unsafeBindPrependSubscription__Lcom_raquo_laminar_nodes_ReactiveElement__F1__Lcom_raquo_airstream_ownership_DynamicSubscription(element, subscribe) : $m_Lcom_raquo_airstream_ownership_DynamicSubscription$().unsafe__Lcom_raquo_airstream_ownership_DynamicOwner__F1__Z__Lcom_raquo_airstream_ownership_DynamicSubscription(element.Lcom_raquo_laminar_nodes_ReactiveHtmlElement__f_dynamicOwner, new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$c_sjsr_AnonFunction1(((owner) => {
      var owner$1 = owner;
      return subscribe.apply__O__O(new $c_Lcom_raquo_laminar_lifecycle_MountContext(element, owner$1))
    })), false));
    $f_Lcom_raquo_laminar_nodes_ReactiveElement__addEventListener__Lcom_raquo_laminar_modifiers_EventListener__Z__V(element, this, unsafePrepend);
    return sub
  } else {
    var activate = new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$c_sjsr_AnonFunction1(((_$1) => (void 0)));
    return $m_Lcom_raquo_airstream_ownership_DynamicSubscription$().subscribeCallback__Lcom_raquo_airstream_ownership_DynamicOwner__F1__Z__Lcom_raquo_airstream_ownership_DynamicSubscription(element.Lcom_raquo_laminar_nodes_ReactiveHtmlElement__f_dynamicOwner, new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$c_sjsr_AnonFunction1(((owner$2) => {
      var owner$3 = owner$2;
      activate.apply__O__O(new $c_Lcom_raquo_laminar_lifecycle_MountContext(element, owner$3))
    })), false)
  }
});
$c_Lcom_raquo_laminar_modifiers_EventListener.prototype.toString__T = (function() {
  var prop = this.Lcom_raquo_laminar_modifiers_EventListener__f_eventProcessor;
  return (("EventListener(" + prop.Lcom_raquo_laminar_keys_EventProcessor__f_eventProp.Lcom_raquo_laminar_keys_EventProp__f_name) + ")")
});
var $d_Lcom_raquo_laminar_modifiers_EventListener = new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$TypeData().initClass({
  Lcom_raquo_laminar_modifiers_EventListener: 0
}, false, "com.raquo.laminar.modifiers.EventListener", {
  Lcom_raquo_laminar_modifiers_EventListener: 1,
  O: 1,
  Lcom_raquo_laminar_modifiers_Modifier: 1,
  Lcom_raquo_laminar_modifiers_Binder: 1
});
$c_Lcom_raquo_laminar_modifiers_EventListener.prototype.$classData = $d_Lcom_raquo_laminar_modifiers_EventListener;
/** @constructor */
function $c_Lcom_raquo_laminar_modifiers_KeySetter(key, value, action) {
  this.Lcom_raquo_laminar_modifiers_KeySetter__f_key = null;
  this.Lcom_raquo_laminar_modifiers_KeySetter__f_value = null;
  this.Lcom_raquo_laminar_modifiers_KeySetter__f_action = null;
  this.Lcom_raquo_laminar_modifiers_KeySetter__f_key = key;
  this.Lcom_raquo_laminar_modifiers_KeySetter__f_value = value;
  this.Lcom_raquo_laminar_modifiers_KeySetter__f_action = action
}
$c_Lcom_raquo_laminar_modifiers_KeySetter.prototype = new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$h_O();
$c_Lcom_raquo_laminar_modifiers_KeySetter.prototype.constructor = $c_Lcom_raquo_laminar_modifiers_KeySetter;
/** @constructor */
function $h_Lcom_raquo_laminar_modifiers_KeySetter() {
  /*<skip>*/
}
$h_Lcom_raquo_laminar_modifiers_KeySetter.prototype = $c_Lcom_raquo_laminar_modifiers_KeySetter.prototype;
$c_Lcom_raquo_laminar_modifiers_KeySetter.prototype.apply__Lcom_raquo_laminar_nodes_ReactiveElement__V = (function(element) {
  this.Lcom_raquo_laminar_modifiers_KeySetter__f_action.apply__O__O__O__O(element, this.Lcom_raquo_laminar_modifiers_KeySetter__f_key, this.Lcom_raquo_laminar_modifiers_KeySetter__f_value)
});
var $d_Lcom_raquo_laminar_modifiers_KeySetter = new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$TypeData().initClass({
  Lcom_raquo_laminar_modifiers_KeySetter: 0
}, false, "com.raquo.laminar.modifiers.KeySetter", {
  Lcom_raquo_laminar_modifiers_KeySetter: 1,
  O: 1,
  Lcom_raquo_laminar_modifiers_Modifier: 1,
  Lcom_raquo_laminar_modifiers_Setter: 1
});
$c_Lcom_raquo_laminar_modifiers_KeySetter.prototype.$classData = $d_Lcom_raquo_laminar_modifiers_KeySetter;
/** @constructor */
function $c_Lcom_raquo_laminar_modifiers_Setter$$anon$1() {
  /*<skip>*/
}
$c_Lcom_raquo_laminar_modifiers_Setter$$anon$1.prototype = new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$h_O();
$c_Lcom_raquo_laminar_modifiers_Setter$$anon$1.prototype.constructor = $c_Lcom_raquo_laminar_modifiers_Setter$$anon$1;
/** @constructor */
function $h_Lcom_raquo_laminar_modifiers_Setter$$anon$1() {
  /*<skip>*/
}
$h_Lcom_raquo_laminar_modifiers_Setter$$anon$1.prototype = $c_Lcom_raquo_laminar_modifiers_Setter$$anon$1.prototype;
$c_Lcom_raquo_laminar_modifiers_Setter$$anon$1.prototype.apply__Lcom_raquo_laminar_nodes_ReactiveElement__V = (function(element) {
  /*<skip>*/
});
var $d_Lcom_raquo_laminar_modifiers_Setter$$anon$1 = new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$TypeData().initClass({
  Lcom_raquo_laminar_modifiers_Setter$$anon$1: 0
}, false, "com.raquo.laminar.modifiers.Setter$$anon$1", {
  Lcom_raquo_laminar_modifiers_Setter$$anon$1: 1,
  O: 1,
  Lcom_raquo_laminar_modifiers_Modifier: 1,
  Lcom_raquo_laminar_modifiers_Setter: 1
});
$c_Lcom_raquo_laminar_modifiers_Setter$$anon$1.prototype.$classData = $d_Lcom_raquo_laminar_modifiers_Setter$$anon$1;
function $is_Lcom_raquo_laminar_nodes_ChildNode(obj) {
  return (!(!((obj && obj.$classData) && obj.$classData.ancestors.Lcom_raquo_laminar_nodes_ChildNode)))
}
function $isArrayOf_Lcom_raquo_laminar_nodes_ChildNode(obj, depth) {
  return (!(!(((obj && obj.$classData) && (obj.$classData.arrayDepth === depth)) && obj.$classData.arrayBase.ancestors.Lcom_raquo_laminar_nodes_ChildNode)))
}
/** @constructor */
function $c_Lcom_raquo_laminar_nodes_RootNode(container, child) {
  this.Lcom_raquo_laminar_nodes_RootNode__f_dynamicOwner = null;
  this.Lcom_raquo_laminar_nodes_RootNode__f_child = null;
  this.Lcom_raquo_laminar_nodes_RootNode__f_ref = null;
  this.Lcom_raquo_laminar_nodes_RootNode__f_child = child;
  $f_Lcom_raquo_laminar_nodes_ParentNode__$init$__V(this);
  if ((container === null)) {
    throw $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$ct_jl_Exception__T__(new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$c_jl_Exception(), "Unable to mount Laminar RootNode into a null container. See https://laminar.dev/documentation#waiting-for-the-dom-to-load")
  };
  if ((!$m_Lcom_raquo_laminar_DomApi$().isDescendantOf__Lorg_scalajs_dom_Node__Lorg_scalajs_dom_Node__Z(container, document))) {
    throw $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$ct_jl_Exception__T__(new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$c_jl_Exception(), "Unable to mount Laminar RootNode into an unmounted container. See https://laminar.dev/documentation#rendering")
  };
  this.Lcom_raquo_laminar_nodes_RootNode__f_ref = container;
  this.mount__Z()
}
$c_Lcom_raquo_laminar_nodes_RootNode.prototype = new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$h_O();
$c_Lcom_raquo_laminar_nodes_RootNode.prototype.constructor = $c_Lcom_raquo_laminar_nodes_RootNode;
/** @constructor */
function $h_Lcom_raquo_laminar_nodes_RootNode() {
  /*<skip>*/
}
$h_Lcom_raquo_laminar_nodes_RootNode.prototype = $c_Lcom_raquo_laminar_nodes_RootNode.prototype;
$c_Lcom_raquo_laminar_nodes_RootNode.prototype.dynamicOwner__Lcom_raquo_airstream_ownership_DynamicOwner = (function() {
  return this.Lcom_raquo_laminar_nodes_RootNode__f_dynamicOwner
});
$c_Lcom_raquo_laminar_nodes_RootNode.prototype.com$raquo$laminar$nodes$ParentNode$_setter_$dynamicOwner_$eq__Lcom_raquo_airstream_ownership_DynamicOwner__V = (function(x$0) {
  this.Lcom_raquo_laminar_nodes_RootNode__f_dynamicOwner = x$0
});
$c_Lcom_raquo_laminar_nodes_RootNode.prototype.mount__Z = (function() {
  this.Lcom_raquo_laminar_nodes_RootNode__f_dynamicOwner.activate__V();
  return $m_Lcom_raquo_laminar_nodes_ParentNode$().appendChild__Lcom_raquo_laminar_nodes_ParentNode__Lcom_raquo_laminar_nodes_ChildNode__Z(this, this.Lcom_raquo_laminar_nodes_RootNode__f_child)
});
$c_Lcom_raquo_laminar_nodes_RootNode.prototype.ref__Lorg_scalajs_dom_Node = (function() {
  return this.Lcom_raquo_laminar_nodes_RootNode__f_ref
});
var $d_Lcom_raquo_laminar_nodes_RootNode = new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$TypeData().initClass({
  Lcom_raquo_laminar_nodes_RootNode: 0
}, false, "com.raquo.laminar.nodes.RootNode", {
  Lcom_raquo_laminar_nodes_RootNode: 1,
  O: 1,
  Lcom_raquo_laminar_nodes_ReactiveNode: 1,
  Lcom_raquo_laminar_nodes_ParentNode: 1
});
$c_Lcom_raquo_laminar_nodes_RootNode.prototype.$classData = $d_Lcom_raquo_laminar_nodes_RootNode;
class $c_jl_Error extends $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$c_jl_Throwable {
}
function $isArrayOf_jl_Error(obj, depth) {
  return (!(!(((obj && obj.$classData) && (obj.$classData.arrayDepth === depth)) && obj.$classData.arrayBase.ancestors.jl_Error)))
}
/** @constructor */
function $c_s_$less$colon$less() {
  /*<skip>*/
}
$c_s_$less$colon$less.prototype = new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$h_O();
$c_s_$less$colon$less.prototype.constructor = $c_s_$less$colon$less;
/** @constructor */
function $h_s_$less$colon$less() {
  /*<skip>*/
}
$h_s_$less$colon$less.prototype = $c_s_$less$colon$less.prototype;
/** @constructor */
function $c_s_Predef$() {
  this.s_Predef$__f_Map = null;
  $n_s_Predef$ = this;
  $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$m_s_package$();
  $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$m_sci_List$();
  this.s_Predef$__f_Map = $m_sci_Map$()
}
$c_s_Predef$.prototype = new $h_s_LowPriorityImplicits();
$c_s_Predef$.prototype.constructor = $c_s_Predef$;
/** @constructor */
function $h_s_Predef$() {
  /*<skip>*/
}
$h_s_Predef$.prototype = $c_s_Predef$.prototype;
$c_s_Predef$.prototype.require__Z__V = (function(requirement) {
  if ((!requirement)) {
    throw $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$ct_jl_IllegalArgumentException__T__(new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$c_jl_IllegalArgumentException(), "requirement failed")
  }
});
var $d_s_Predef$ = new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$TypeData().initClass({
  s_Predef$: 0
}, false, "scala.Predef$", {
  s_Predef$: 1,
  s_LowPriorityImplicits: 1,
  s_LowPriorityImplicits2: 1,
  O: 1
});
$c_s_Predef$.prototype.$classData = $d_s_Predef$;
var $n_s_Predef$;
function $m_s_Predef$() {
  if ((!$n_s_Predef$)) {
    $n_s_Predef$ = new $c_s_Predef$()
  };
  return $n_s_Predef$
}
function $ct_sc_MapFactory$Delegate__sc_MapFactory__($thiz, delegate) {
  $thiz.sc_MapFactory$Delegate__f_delegate = delegate;
  return $thiz
}
/** @constructor */
function $c_sc_MapFactory$Delegate() {
  this.sc_MapFactory$Delegate__f_delegate = null
}
$c_sc_MapFactory$Delegate.prototype = new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$h_O();
$c_sc_MapFactory$Delegate.prototype.constructor = $c_sc_MapFactory$Delegate;
/** @constructor */
function $h_sc_MapFactory$Delegate() {
  /*<skip>*/
}
$h_sc_MapFactory$Delegate.prototype = $c_sc_MapFactory$Delegate.prototype;
/** @constructor */
function $c_sci_BitmapIndexedMapNode(dataMap, nodeMap, content, originalHashes, size, cachedJavaKeySetHashCode) {
  this.sci_BitmapIndexedMapNode__f_dataMap = 0;
  this.sci_BitmapIndexedMapNode__f_nodeMap = 0;
  this.sci_BitmapIndexedMapNode__f_content = null;
  this.sci_BitmapIndexedMapNode__f_originalHashes = null;
  this.sci_BitmapIndexedMapNode__f_size = 0;
  this.sci_BitmapIndexedMapNode__f_cachedJavaKeySetHashCode = 0;
  this.sci_BitmapIndexedMapNode__f_dataMap = dataMap;
  this.sci_BitmapIndexedMapNode__f_nodeMap = nodeMap;
  this.sci_BitmapIndexedMapNode__f_content = content;
  this.sci_BitmapIndexedMapNode__f_originalHashes = originalHashes;
  this.sci_BitmapIndexedMapNode__f_size = size;
  this.sci_BitmapIndexedMapNode__f_cachedJavaKeySetHashCode = cachedJavaKeySetHashCode
}
$c_sci_BitmapIndexedMapNode.prototype = new $h_sci_MapNode();
$c_sci_BitmapIndexedMapNode.prototype.constructor = $c_sci_BitmapIndexedMapNode;
/** @constructor */
function $h_sci_BitmapIndexedMapNode() {
  /*<skip>*/
}
$h_sci_BitmapIndexedMapNode.prototype = $c_sci_BitmapIndexedMapNode.prototype;
$c_sci_BitmapIndexedMapNode.prototype.size__I = (function() {
  return this.sci_BitmapIndexedMapNode__f_size
});
$c_sci_BitmapIndexedMapNode.prototype.cachedJavaKeySetHashCode__I = (function() {
  return this.sci_BitmapIndexedMapNode__f_cachedJavaKeySetHashCode
});
$c_sci_BitmapIndexedMapNode.prototype.getKey__I__O = (function(index) {
  return this.sci_BitmapIndexedMapNode__f_content.u[(index << 1)]
});
$c_sci_BitmapIndexedMapNode.prototype.getValue__I__O = (function(index) {
  return this.sci_BitmapIndexedMapNode__f_content.u[((1 + (index << 1)) | 0)]
});
$c_sci_BitmapIndexedMapNode.prototype.getPayload__I__T2 = (function(index) {
  return new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$c_T2(this.sci_BitmapIndexedMapNode__f_content.u[(index << 1)], this.sci_BitmapIndexedMapNode__f_content.u[((1 + (index << 1)) | 0)])
});
$c_sci_BitmapIndexedMapNode.prototype.getHash__I__I = (function(index) {
  return this.sci_BitmapIndexedMapNode__f_originalHashes.u[index]
});
$c_sci_BitmapIndexedMapNode.prototype.getNode__I__sci_MapNode = (function(index) {
  return this.sci_BitmapIndexedMapNode__f_content.u[(((((-1) + this.sci_BitmapIndexedMapNode__f_content.u.length) | 0) - index) | 0)]
});
$c_sci_BitmapIndexedMapNode.prototype.apply__O__I__I__I__O = (function(key, originalHash, keyHash, shift) {
  var mask = $m_sci_Node$().maskFrom__I__I__I(keyHash, shift);
  var bitpos = $m_sci_Node$().bitposFrom__I__I(mask);
  if (((this.sci_BitmapIndexedMapNode__f_dataMap & bitpos) !== 0)) {
    var index = $m_sci_Node$().indexFrom__I__I__I__I(this.sci_BitmapIndexedMapNode__f_dataMap, mask, bitpos);
    if ($j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$m_sr_BoxesRunTime$().equals__O__O__Z(key, this.getKey__I__O(index))) {
      return this.getValue__I__O(index)
    } else {
      throw $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$ct_ju_NoSuchElementException__T__(new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$c_ju_NoSuchElementException(), ("key not found: " + key))
    }
  } else if (((this.sci_BitmapIndexedMapNode__f_nodeMap & bitpos) !== 0)) {
    return this.getNode__I__sci_MapNode($m_sci_Node$().indexFrom__I__I__I__I(this.sci_BitmapIndexedMapNode__f_nodeMap, mask, bitpos)).apply__O__I__I__I__O(key, originalHash, keyHash, ((5 + shift) | 0))
  } else {
    throw $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$ct_ju_NoSuchElementException__T__(new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$c_ju_NoSuchElementException(), ("key not found: " + key))
  }
});
$c_sci_BitmapIndexedMapNode.prototype.getOrElse__O__I__I__I__F0__O = (function(key, originalHash, keyHash, shift, f) {
  var mask = $m_sci_Node$().maskFrom__I__I__I(keyHash, shift);
  var bitpos = $m_sci_Node$().bitposFrom__I__I(mask);
  if (((this.sci_BitmapIndexedMapNode__f_dataMap & bitpos) !== 0)) {
    var index = $m_sci_Node$().indexFrom__I__I__I__I(this.sci_BitmapIndexedMapNode__f_dataMap, mask, bitpos);
    var key0 = this.getKey__I__O(index);
    return ($j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$m_sr_BoxesRunTime$().equals__O__O__Z(key, key0) ? this.getValue__I__O(index) : f.apply__O())
  } else if (((this.sci_BitmapIndexedMapNode__f_nodeMap & bitpos) !== 0)) {
    var index$2 = $m_sci_Node$().indexFrom__I__I__I__I(this.sci_BitmapIndexedMapNode__f_nodeMap, mask, bitpos);
    return this.getNode__I__sci_MapNode(index$2).getOrElse__O__I__I__I__F0__O(key, originalHash, keyHash, ((5 + shift) | 0), f)
  } else {
    return f.apply__O()
  }
});
$c_sci_BitmapIndexedMapNode.prototype.containsKey__O__I__I__I__Z = (function(key, originalHash, keyHash, shift) {
  var mask = $m_sci_Node$().maskFrom__I__I__I(keyHash, shift);
  var bitpos = $m_sci_Node$().bitposFrom__I__I(mask);
  if (((this.sci_BitmapIndexedMapNode__f_dataMap & bitpos) !== 0)) {
    var index = $m_sci_Node$().indexFrom__I__I__I__I(this.sci_BitmapIndexedMapNode__f_dataMap, mask, bitpos);
    return ((this.sci_BitmapIndexedMapNode__f_originalHashes.u[index] === originalHash) && $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$m_sr_BoxesRunTime$().equals__O__O__Z(key, this.getKey__I__O(index)))
  } else {
    return (((this.sci_BitmapIndexedMapNode__f_nodeMap & bitpos) !== 0) && this.getNode__I__sci_MapNode($m_sci_Node$().indexFrom__I__I__I__I(this.sci_BitmapIndexedMapNode__f_nodeMap, mask, bitpos)).containsKey__O__I__I__I__Z(key, originalHash, keyHash, ((5 + shift) | 0)))
  }
});
$c_sci_BitmapIndexedMapNode.prototype.updated__O__O__I__I__I__Z__sci_BitmapIndexedMapNode = (function(key, value, originalHash, keyHash, shift, replaceValue) {
  var mask = $m_sci_Node$().maskFrom__I__I__I(keyHash, shift);
  var bitpos = $m_sci_Node$().bitposFrom__I__I(mask);
  if (((this.sci_BitmapIndexedMapNode__f_dataMap & bitpos) !== 0)) {
    var index = $m_sci_Node$().indexFrom__I__I__I__I(this.sci_BitmapIndexedMapNode__f_dataMap, mask, bitpos);
    var key0 = this.getKey__I__O(index);
    var key0UnimprovedHash = this.getHash__I__I(index);
    if (((key0UnimprovedHash === originalHash) && $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$m_sr_BoxesRunTime$().equals__O__O__Z(key0, key))) {
      if (replaceValue) {
        var value0 = this.getValue__I__O(index);
        return ((Object.is(key0, key) && Object.is(value0, value)) ? this : this.copyAndSetValue__I__O__O__sci_BitmapIndexedMapNode(bitpos, key, value))
      } else {
        return this
      }
    } else {
      var value0$2 = this.getValue__I__O(index);
      var key0Hash = $m_sc_Hashing$().improve__I__I(key0UnimprovedHash);
      var subNodeNew = this.mergeTwoKeyValPairs__O__O__I__I__O__O__I__I__I__sci_MapNode(key0, value0$2, key0UnimprovedHash, key0Hash, key, value, originalHash, keyHash, ((5 + shift) | 0));
      return this.copyAndMigrateFromInlineToNode__I__I__sci_MapNode__sci_BitmapIndexedMapNode(bitpos, key0Hash, subNodeNew)
    }
  } else if (((this.sci_BitmapIndexedMapNode__f_nodeMap & bitpos) !== 0)) {
    var index$2 = $m_sci_Node$().indexFrom__I__I__I__I(this.sci_BitmapIndexedMapNode__f_nodeMap, mask, bitpos);
    var subNode = this.getNode__I__sci_MapNode(index$2);
    var subNodeNew$2 = subNode.updated__O__O__I__I__I__Z__sci_MapNode(key, value, originalHash, keyHash, ((5 + shift) | 0), replaceValue);
    return ((subNodeNew$2 === subNode) ? this : this.copyAndSetNode__I__sci_MapNode__sci_MapNode__sci_BitmapIndexedMapNode(bitpos, subNode, subNodeNew$2))
  } else {
    return this.copyAndInsertValue__I__O__I__I__O__sci_BitmapIndexedMapNode(bitpos, key, originalHash, keyHash, value)
  }
});
$c_sci_BitmapIndexedMapNode.prototype.mergeTwoKeyValPairs__O__O__I__I__O__O__I__I__I__sci_MapNode = (function(key0, value0, originalHash0, keyHash0, key1, value1, originalHash1, keyHash1, shift) {
  if ((shift >= 32)) {
    var this$4 = $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$m_sci_Vector$();
    var array = [new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$c_T2(key0, value0), new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$c_T2(key1, value1)];
    var elems = new $c_sjsr_WrappedVarArgs(array);
    return new $c_sci_HashCollisionMapNode(originalHash0, keyHash0, this$4.from__sc_IterableOnce__sci_Vector(elems))
  } else {
    var mask0 = $m_sci_Node$().maskFrom__I__I__I(keyHash0, shift);
    var mask1 = $m_sci_Node$().maskFrom__I__I__I(keyHash1, shift);
    var newCachedHash = ((keyHash0 + keyHash1) | 0);
    if ((mask0 !== mask1)) {
      var dataMap = ($m_sci_Node$().bitposFrom__I__I(mask0) | $m_sci_Node$().bitposFrom__I__I(mask1));
      return ((mask0 < mask1) ? new $c_sci_BitmapIndexedMapNode(dataMap, 0, new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$ac_O([key0, value0, key1, value1]), new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$ac_I(new Int32Array([originalHash0, originalHash1])), 2, newCachedHash) : new $c_sci_BitmapIndexedMapNode(dataMap, 0, new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$ac_O([key1, value1, key0, value0]), new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$ac_I(new Int32Array([originalHash1, originalHash0])), 2, newCachedHash))
    } else {
      var nodeMap = $m_sci_Node$().bitposFrom__I__I(mask0);
      var node = this.mergeTwoKeyValPairs__O__O__I__I__O__O__I__I__I__sci_MapNode(key0, value0, originalHash0, keyHash0, key1, value1, originalHash1, keyHash1, ((5 + shift) | 0));
      return new $c_sci_BitmapIndexedMapNode(0, nodeMap, new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$ac_O([node]), $m_s_Array$EmptyArrays$().s_Array$EmptyArrays$__f_emptyIntArray, node.size__I(), node.cachedJavaKeySetHashCode__I())
    }
  }
});
$c_sci_BitmapIndexedMapNode.prototype.hasNodes__Z = (function() {
  return (this.sci_BitmapIndexedMapNode__f_nodeMap !== 0)
});
$c_sci_BitmapIndexedMapNode.prototype.nodeArity__I = (function() {
  var i = this.sci_BitmapIndexedMapNode__f_nodeMap;
  return $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$m_jl_Integer$().bitCount__I__I(i)
});
$c_sci_BitmapIndexedMapNode.prototype.hasPayload__Z = (function() {
  return (this.sci_BitmapIndexedMapNode__f_dataMap !== 0)
});
$c_sci_BitmapIndexedMapNode.prototype.payloadArity__I = (function() {
  var i = this.sci_BitmapIndexedMapNode__f_dataMap;
  return $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$m_jl_Integer$().bitCount__I__I(i)
});
$c_sci_BitmapIndexedMapNode.prototype.dataIndex__I__I = (function(bitpos) {
  var i = (this.sci_BitmapIndexedMapNode__f_dataMap & (((-1) + bitpos) | 0));
  return $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$m_jl_Integer$().bitCount__I__I(i)
});
$c_sci_BitmapIndexedMapNode.prototype.nodeIndex__I__I = (function(bitpos) {
  var i = (this.sci_BitmapIndexedMapNode__f_nodeMap & (((-1) + bitpos) | 0));
  return $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$m_jl_Integer$().bitCount__I__I(i)
});
$c_sci_BitmapIndexedMapNode.prototype.copyAndSetValue__I__O__O__sci_BitmapIndexedMapNode = (function(bitpos, newKey, newValue) {
  var dataIx = this.dataIndex__I__I(bitpos);
  var idx = (dataIx << 1);
  var src = this.sci_BitmapIndexedMapNode__f_content;
  var dst = new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$ac_O(src.u.length);
  var length = src.u.length;
  src.copyTo(0, dst, 0, length);
  dst.u[((1 + idx) | 0)] = newValue;
  return new $c_sci_BitmapIndexedMapNode(this.sci_BitmapIndexedMapNode__f_dataMap, this.sci_BitmapIndexedMapNode__f_nodeMap, dst, this.sci_BitmapIndexedMapNode__f_originalHashes, this.sci_BitmapIndexedMapNode__f_size, this.sci_BitmapIndexedMapNode__f_cachedJavaKeySetHashCode)
});
$c_sci_BitmapIndexedMapNode.prototype.copyAndSetNode__I__sci_MapNode__sci_MapNode__sci_BitmapIndexedMapNode = (function(bitpos, oldNode, newNode) {
  var idx = (((((-1) + this.sci_BitmapIndexedMapNode__f_content.u.length) | 0) - this.nodeIndex__I__I(bitpos)) | 0);
  var src = this.sci_BitmapIndexedMapNode__f_content;
  var dst = new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$ac_O(src.u.length);
  var length = src.u.length;
  src.copyTo(0, dst, 0, length);
  dst.u[idx] = newNode;
  return new $c_sci_BitmapIndexedMapNode(this.sci_BitmapIndexedMapNode__f_dataMap, this.sci_BitmapIndexedMapNode__f_nodeMap, dst, this.sci_BitmapIndexedMapNode__f_originalHashes, ((((this.sci_BitmapIndexedMapNode__f_size - oldNode.size__I()) | 0) + newNode.size__I()) | 0), ((((this.sci_BitmapIndexedMapNode__f_cachedJavaKeySetHashCode - oldNode.cachedJavaKeySetHashCode__I()) | 0) + newNode.cachedJavaKeySetHashCode__I()) | 0))
});
$c_sci_BitmapIndexedMapNode.prototype.copyAndInsertValue__I__O__I__I__O__sci_BitmapIndexedMapNode = (function(bitpos, key, originalHash, keyHash, value) {
  var dataIx = this.dataIndex__I__I(bitpos);
  var idx = (dataIx << 1);
  var src = this.sci_BitmapIndexedMapNode__f_content;
  var dst = new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$ac_O(((2 + src.u.length) | 0));
  src.copyTo(0, dst, 0, idx);
  dst.u[idx] = key;
  dst.u[((1 + idx) | 0)] = value;
  var destPos = ((2 + idx) | 0);
  var length = ((src.u.length - idx) | 0);
  src.copyTo(idx, dst, destPos, length);
  var dstHashes = this.insertElement__AI__I__I__AI(this.sci_BitmapIndexedMapNode__f_originalHashes, dataIx, originalHash);
  return new $c_sci_BitmapIndexedMapNode((this.sci_BitmapIndexedMapNode__f_dataMap | bitpos), this.sci_BitmapIndexedMapNode__f_nodeMap, dst, dstHashes, ((1 + this.sci_BitmapIndexedMapNode__f_size) | 0), ((this.sci_BitmapIndexedMapNode__f_cachedJavaKeySetHashCode + keyHash) | 0))
});
$c_sci_BitmapIndexedMapNode.prototype.migrateFromInlineToNodeInPlace__I__I__sci_MapNode__sci_BitmapIndexedMapNode = (function(bitpos, keyHash, node) {
  var dataIx = this.dataIndex__I__I(bitpos);
  var idxOld = (dataIx << 1);
  var idxNew = (((((-2) + this.sci_BitmapIndexedMapNode__f_content.u.length) | 0) - this.nodeIndex__I__I(bitpos)) | 0);
  var src = this.sci_BitmapIndexedMapNode__f_content;
  var dst = new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$ac_O((((-1) + src.u.length) | 0));
  src.copyTo(0, dst, 0, idxOld);
  var srcPos = ((2 + idxOld) | 0);
  var length = ((idxNew - idxOld) | 0);
  src.copyTo(srcPos, dst, idxOld, length);
  dst.u[idxNew] = node;
  var srcPos$1 = ((2 + idxNew) | 0);
  var destPos = ((1 + idxNew) | 0);
  var length$1 = (((-2) + ((src.u.length - idxNew) | 0)) | 0);
  src.copyTo(srcPos$1, dst, destPos, length$1);
  var dstHashes = this.removeElement__AI__I__AI(this.sci_BitmapIndexedMapNode__f_originalHashes, dataIx);
  this.sci_BitmapIndexedMapNode__f_dataMap = (this.sci_BitmapIndexedMapNode__f_dataMap ^ bitpos);
  this.sci_BitmapIndexedMapNode__f_nodeMap = (this.sci_BitmapIndexedMapNode__f_nodeMap | bitpos);
  this.sci_BitmapIndexedMapNode__f_content = dst;
  this.sci_BitmapIndexedMapNode__f_originalHashes = dstHashes;
  this.sci_BitmapIndexedMapNode__f_size = (((((-1) + this.sci_BitmapIndexedMapNode__f_size) | 0) + node.size__I()) | 0);
  this.sci_BitmapIndexedMapNode__f_cachedJavaKeySetHashCode = ((((this.sci_BitmapIndexedMapNode__f_cachedJavaKeySetHashCode - keyHash) | 0) + node.cachedJavaKeySetHashCode__I()) | 0);
  return this
});
$c_sci_BitmapIndexedMapNode.prototype.copyAndMigrateFromInlineToNode__I__I__sci_MapNode__sci_BitmapIndexedMapNode = (function(bitpos, keyHash, node) {
  var dataIx = this.dataIndex__I__I(bitpos);
  var idxOld = (dataIx << 1);
  var idxNew = (((((-2) + this.sci_BitmapIndexedMapNode__f_content.u.length) | 0) - this.nodeIndex__I__I(bitpos)) | 0);
  var src = this.sci_BitmapIndexedMapNode__f_content;
  var dst = new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$ac_O((((-1) + src.u.length) | 0));
  src.copyTo(0, dst, 0, idxOld);
  var srcPos = ((2 + idxOld) | 0);
  var length = ((idxNew - idxOld) | 0);
  src.copyTo(srcPos, dst, idxOld, length);
  dst.u[idxNew] = node;
  var srcPos$1 = ((2 + idxNew) | 0);
  var destPos = ((1 + idxNew) | 0);
  var length$1 = (((-2) + ((src.u.length - idxNew) | 0)) | 0);
  src.copyTo(srcPos$1, dst, destPos, length$1);
  var dstHashes = this.removeElement__AI__I__AI(this.sci_BitmapIndexedMapNode__f_originalHashes, dataIx);
  return new $c_sci_BitmapIndexedMapNode((this.sci_BitmapIndexedMapNode__f_dataMap ^ bitpos), (this.sci_BitmapIndexedMapNode__f_nodeMap | bitpos), dst, dstHashes, (((((-1) + this.sci_BitmapIndexedMapNode__f_size) | 0) + node.size__I()) | 0), ((((this.sci_BitmapIndexedMapNode__f_cachedJavaKeySetHashCode - keyHash) | 0) + node.cachedJavaKeySetHashCode__I()) | 0))
});
$c_sci_BitmapIndexedMapNode.prototype.foreachEntry__F2__V = (function(f) {
  var i = this.sci_BitmapIndexedMapNode__f_dataMap;
  var iN = $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$m_jl_Integer$().bitCount__I__I(i);
  var i$1 = 0;
  while ((i$1 < iN)) {
    f.apply__O__O__O(this.getKey__I__O(i$1), this.getValue__I__O(i$1));
    i$1 = ((1 + i$1) | 0)
  };
  var i$2 = this.sci_BitmapIndexedMapNode__f_nodeMap;
  var jN = $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$m_jl_Integer$().bitCount__I__I(i$2);
  var j = 0;
  while ((j < jN)) {
    this.getNode__I__sci_MapNode(j).foreachEntry__F2__V(f);
    j = ((1 + j) | 0)
  }
});
$c_sci_BitmapIndexedMapNode.prototype.equals__O__Z = (function(that) {
  if ((that instanceof $c_sci_BitmapIndexedMapNode)) {
    var x2 = that;
    if ((this === x2)) {
      return true
    } else {
      if (((((this.sci_BitmapIndexedMapNode__f_cachedJavaKeySetHashCode === x2.sci_BitmapIndexedMapNode__f_cachedJavaKeySetHashCode) && (this.sci_BitmapIndexedMapNode__f_nodeMap === x2.sci_BitmapIndexedMapNode__f_nodeMap)) && (this.sci_BitmapIndexedMapNode__f_dataMap === x2.sci_BitmapIndexedMapNode__f_dataMap)) && (this.sci_BitmapIndexedMapNode__f_size === x2.sci_BitmapIndexedMapNode__f_size))) {
        var a = this.sci_BitmapIndexedMapNode__f_originalHashes;
        var b = x2.sci_BitmapIndexedMapNode__f_originalHashes;
        var $$x1 = $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$m_ju_Arrays$().equals__AI__AI__Z(a, b)
      } else {
        var $$x1 = false
      };
      if ($$x1) {
        var a1 = this.sci_BitmapIndexedMapNode__f_content;
        var a2 = x2.sci_BitmapIndexedMapNode__f_content;
        var length = this.sci_BitmapIndexedMapNode__f_content.u.length;
        if ((a1 === a2)) {
          return true
        } else {
          var isEqual = true;
          var i = 0;
          while ((isEqual && (i < length))) {
            isEqual = $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$m_sr_BoxesRunTime$().equals__O__O__Z(a1.u[i], a2.u[i]);
            i = ((1 + i) | 0)
          };
          return isEqual
        }
      } else {
        return false
      }
    }
  } else {
    return false
  }
});
$c_sci_BitmapIndexedMapNode.prototype.hashCode__I = (function() {
  throw new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$c_jl_UnsupportedOperationException("Trie nodes do not support hashing.")
});
$c_sci_BitmapIndexedMapNode.prototype.copy__sci_BitmapIndexedMapNode = (function() {
  var this$1 = this.sci_BitmapIndexedMapNode__f_content;
  var contentClone = this$1.clone__O();
  var contentLength = contentClone.u.length;
  var i = this.sci_BitmapIndexedMapNode__f_dataMap;
  var i$1 = ($j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$m_jl_Integer$().bitCount__I__I(i) << 1);
  while ((i$1 < contentLength)) {
    contentClone.u[i$1] = contentClone.u[i$1].copy__sci_MapNode();
    i$1 = ((1 + i$1) | 0)
  };
  var $$x2 = this.sci_BitmapIndexedMapNode__f_dataMap;
  var $$x1 = this.sci_BitmapIndexedMapNode__f_nodeMap;
  var this$2 = this.sci_BitmapIndexedMapNode__f_originalHashes;
  return new $c_sci_BitmapIndexedMapNode($$x2, $$x1, contentClone, this$2.clone__O(), this.sci_BitmapIndexedMapNode__f_size, this.sci_BitmapIndexedMapNode__f_cachedJavaKeySetHashCode)
});
$c_sci_BitmapIndexedMapNode.prototype.copy__sci_MapNode = (function() {
  return this.copy__sci_BitmapIndexedMapNode()
});
$c_sci_BitmapIndexedMapNode.prototype.updated__O__O__I__I__I__Z__sci_MapNode = (function(key, value, originalHash, hash, shift, replaceValue) {
  return this.updated__O__O__I__I__I__Z__sci_BitmapIndexedMapNode(key, value, originalHash, hash, shift, replaceValue)
});
$c_sci_BitmapIndexedMapNode.prototype.getNode__I__sci_Node = (function(index) {
  return this.getNode__I__sci_MapNode(index)
});
function $isArrayOf_sci_BitmapIndexedMapNode(obj, depth) {
  return (!(!(((obj && obj.$classData) && (obj.$classData.arrayDepth === depth)) && obj.$classData.arrayBase.ancestors.sci_BitmapIndexedMapNode)))
}
var $d_sci_BitmapIndexedMapNode = new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$TypeData().initClass({
  sci_BitmapIndexedMapNode: 0
}, false, "scala.collection.immutable.BitmapIndexedMapNode", {
  sci_BitmapIndexedMapNode: 1,
  sci_MapNode: 1,
  sci_Node: 1,
  O: 1
});
$c_sci_BitmapIndexedMapNode.prototype.$classData = $d_sci_BitmapIndexedMapNode;
/** @constructor */
function $c_sci_HashCollisionMapNode(originalHash, hash, content) {
  this.sci_HashCollisionMapNode__f_originalHash = 0;
  this.sci_HashCollisionMapNode__f_hash = 0;
  this.sci_HashCollisionMapNode__f_content = null;
  this.sci_HashCollisionMapNode__f_originalHash = originalHash;
  this.sci_HashCollisionMapNode__f_hash = hash;
  this.sci_HashCollisionMapNode__f_content = content;
  $m_s_Predef$().require__Z__V((this.sci_HashCollisionMapNode__f_content.length__I() >= 2))
}
$c_sci_HashCollisionMapNode.prototype = new $h_sci_MapNode();
$c_sci_HashCollisionMapNode.prototype.constructor = $c_sci_HashCollisionMapNode;
/** @constructor */
function $h_sci_HashCollisionMapNode() {
  /*<skip>*/
}
$h_sci_HashCollisionMapNode.prototype = $c_sci_HashCollisionMapNode.prototype;
$c_sci_HashCollisionMapNode.prototype.indexOf__O__I = (function(key) {
  var iter = this.sci_HashCollisionMapNode__f_content.iterator__sc_Iterator();
  var i = 0;
  while (iter.hasNext__Z()) {
    if ($j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$m_sr_BoxesRunTime$().equals__O__O__Z(iter.next__O()._1__O(), key)) {
      return i
    };
    i = ((1 + i) | 0)
  };
  return (-1)
});
$c_sci_HashCollisionMapNode.prototype.size__I = (function() {
  return this.sci_HashCollisionMapNode__f_content.length__I()
});
$c_sci_HashCollisionMapNode.prototype.apply__O__I__I__I__O = (function(key, originalHash, hash, shift) {
  var this$1 = this.get__O__I__I__I__s_Option(key, originalHash, hash, shift);
  if (this$1.isEmpty__Z()) {
    throw $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$ct_ju_NoSuchElementException__(new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$c_ju_NoSuchElementException())
  } else {
    return this$1.get__O()
  }
});
$c_sci_HashCollisionMapNode.prototype.get__O__I__I__I__s_Option = (function(key, originalHash, hash, shift) {
  if ((this.sci_HashCollisionMapNode__f_hash === hash)) {
    var index = this.indexOf__O__I(key);
    return ((index >= 0) ? new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$c_s_Some(this.sci_HashCollisionMapNode__f_content.apply__I__O(index)._2__O()) : $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$m_s_None$())
  } else {
    return $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$m_s_None$()
  }
});
$c_sci_HashCollisionMapNode.prototype.getOrElse__O__I__I__I__F0__O = (function(key, originalHash, hash, shift, f) {
  if ((this.sci_HashCollisionMapNode__f_hash === hash)) {
    var x1 = this.indexOf__O__I(key);
    return ((x1 === (-1)) ? f.apply__O() : this.sci_HashCollisionMapNode__f_content.apply__I__O(x1)._2__O())
  } else {
    return f.apply__O()
  }
});
$c_sci_HashCollisionMapNode.prototype.containsKey__O__I__I__I__Z = (function(key, originalHash, hash, shift) {
  return ((this.sci_HashCollisionMapNode__f_hash === hash) && (this.indexOf__O__I(key) >= 0))
});
$c_sci_HashCollisionMapNode.prototype.updated__O__O__I__I__I__Z__sci_MapNode = (function(key, value, originalHash, hash, shift, replaceValue) {
  var index = this.indexOf__O__I(key);
  return ((index >= 0) ? (replaceValue ? (Object.is(this.sci_HashCollisionMapNode__f_content.apply__I__O(index)._2__O(), value) ? this : new $c_sci_HashCollisionMapNode(originalHash, hash, this.sci_HashCollisionMapNode__f_content.updated__I__O__sci_Vector(index, new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$c_T2(key, value)))) : this) : new $c_sci_HashCollisionMapNode(originalHash, hash, this.sci_HashCollisionMapNode__f_content.appended__O__sci_Vector(new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$c_T2(key, value))))
});
$c_sci_HashCollisionMapNode.prototype.hasNodes__Z = (function() {
  return false
});
$c_sci_HashCollisionMapNode.prototype.nodeArity__I = (function() {
  return 0
});
$c_sci_HashCollisionMapNode.prototype.getNode__I__sci_MapNode = (function(index) {
  throw $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$ct_jl_IndexOutOfBoundsException__T__(new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$c_jl_IndexOutOfBoundsException(), "No sub-nodes present in hash-collision leaf node.")
});
$c_sci_HashCollisionMapNode.prototype.hasPayload__Z = (function() {
  return true
});
$c_sci_HashCollisionMapNode.prototype.payloadArity__I = (function() {
  return this.sci_HashCollisionMapNode__f_content.length__I()
});
$c_sci_HashCollisionMapNode.prototype.getKey__I__O = (function(index) {
  return this.sci_HashCollisionMapNode__f_content.apply__I__O(index)._1__O()
});
$c_sci_HashCollisionMapNode.prototype.getValue__I__O = (function(index) {
  return this.sci_HashCollisionMapNode__f_content.apply__I__O(index)._2__O()
});
$c_sci_HashCollisionMapNode.prototype.getPayload__I__T2 = (function(index) {
  return this.sci_HashCollisionMapNode__f_content.apply__I__O(index)
});
$c_sci_HashCollisionMapNode.prototype.getHash__I__I = (function(index) {
  return this.sci_HashCollisionMapNode__f_originalHash
});
$c_sci_HashCollisionMapNode.prototype.foreachEntry__F2__V = (function(f) {
  this.sci_HashCollisionMapNode__f_content.foreach__F1__V(new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$c_sjsr_AnonFunction1(((x0$1$2) => {
    var x0$1 = x0$1$2;
    if ((x0$1 !== null)) {
      var k = x0$1._1__O();
      var v = x0$1._2__O();
      return f.apply__O__O__O(k, v)
    } else {
      throw new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$c_s_MatchError(x0$1)
    }
  })))
});
$c_sci_HashCollisionMapNode.prototype.equals__O__Z = (function(that) {
  if ((that instanceof $c_sci_HashCollisionMapNode)) {
    var x2 = that;
    if ((this === x2)) {
      return true
    } else if (((this.sci_HashCollisionMapNode__f_hash === x2.sci_HashCollisionMapNode__f_hash) && (this.sci_HashCollisionMapNode__f_content.length__I() === x2.sci_HashCollisionMapNode__f_content.length__I()))) {
      var iter = this.sci_HashCollisionMapNode__f_content.iterator__sc_Iterator();
      while (iter.hasNext__Z()) {
        var x1$2 = iter.next__O();
        if ((x1$2 === null)) {
          throw new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$c_s_MatchError(x1$2)
        };
        var key = x1$2._1__O();
        var value = x1$2._2__O();
        var index = x2.indexOf__O__I(key);
        if (((index < 0) || (!$j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$m_sr_BoxesRunTime$().equals__O__O__Z(value, x2.sci_HashCollisionMapNode__f_content.apply__I__O(index)._2__O())))) {
          return false
        }
      };
      return true
    } else {
      return false
    }
  } else {
    return false
  }
});
$c_sci_HashCollisionMapNode.prototype.hashCode__I = (function() {
  throw new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$c_jl_UnsupportedOperationException("Trie nodes do not support hashing.")
});
$c_sci_HashCollisionMapNode.prototype.cachedJavaKeySetHashCode__I = (function() {
  return Math.imul(this.sci_HashCollisionMapNode__f_content.length__I(), this.sci_HashCollisionMapNode__f_hash)
});
$c_sci_HashCollisionMapNode.prototype.copy__sci_MapNode = (function() {
  return new $c_sci_HashCollisionMapNode(this.sci_HashCollisionMapNode__f_originalHash, this.sci_HashCollisionMapNode__f_hash, this.sci_HashCollisionMapNode__f_content)
});
$c_sci_HashCollisionMapNode.prototype.getNode__I__sci_Node = (function(index) {
  return this.getNode__I__sci_MapNode(index)
});
function $isArrayOf_sci_HashCollisionMapNode(obj, depth) {
  return (!(!(((obj && obj.$classData) && (obj.$classData.arrayDepth === depth)) && obj.$classData.arrayBase.ancestors.sci_HashCollisionMapNode)))
}
var $d_sci_HashCollisionMapNode = new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$TypeData().initClass({
  sci_HashCollisionMapNode: 0
}, false, "scala.collection.immutable.HashCollisionMapNode", {
  sci_HashCollisionMapNode: 1,
  sci_MapNode: 1,
  sci_Node: 1,
  O: 1
});
$c_sci_HashCollisionMapNode.prototype.$classData = $d_sci_HashCollisionMapNode;
/** @constructor */
function $c_sci_HashMap$() {
  this.sci_HashMap$__f_EmptyMap = null;
  $n_sci_HashMap$ = this;
  var this$1 = $m_sci_MapNode$();
  this.sci_HashMap$__f_EmptyMap = new $c_sci_HashMap(this$1.sci_MapNode$__f_EmptyMapNode)
}
$c_sci_HashMap$.prototype = new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$h_O();
$c_sci_HashMap$.prototype.constructor = $c_sci_HashMap$;
/** @constructor */
function $h_sci_HashMap$() {
  /*<skip>*/
}
$h_sci_HashMap$.prototype = $c_sci_HashMap$.prototype;
var $d_sci_HashMap$ = new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$TypeData().initClass({
  sci_HashMap$: 0
}, false, "scala.collection.immutable.HashMap$", {
  sci_HashMap$: 1,
  O: 1,
  sc_MapFactory: 1,
  Ljava_io_Serializable: 1
});
$c_sci_HashMap$.prototype.$classData = $d_sci_HashMap$;
var $n_sci_HashMap$;
function $m_sci_HashMap$() {
  if ((!$n_sci_HashMap$)) {
    $n_sci_HashMap$ = new $c_sci_HashMap$()
  };
  return $n_sci_HashMap$
}
/** @constructor */
function $c_sci_Map$() {
  /*<skip>*/
}
$c_sci_Map$.prototype = new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$h_O();
$c_sci_Map$.prototype.constructor = $c_sci_Map$;
/** @constructor */
function $h_sci_Map$() {
  /*<skip>*/
}
$h_sci_Map$.prototype = $c_sci_Map$.prototype;
$c_sci_Map$.prototype.from__sc_IterableOnce__sci_Map = (function(it) {
  if ($j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$is_sci_Iterable(it)) {
    var x2 = it;
    if (x2.isEmpty__Z()) {
      return $m_sci_Map$EmptyMap$()
    }
  };
  if ($is_sci_Map(it)) {
    var x3 = it;
    return x3
  };
  var this$1 = new $c_sci_MapBuilderImpl();
  var this$2 = this$1.addAll__sc_IterableOnce__sci_MapBuilderImpl(it);
  return this$2.result__sci_Map()
});
var $d_sci_Map$ = new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$TypeData().initClass({
  sci_Map$: 0
}, false, "scala.collection.immutable.Map$", {
  sci_Map$: 1,
  O: 1,
  sc_MapFactory: 1,
  Ljava_io_Serializable: 1
});
$c_sci_Map$.prototype.$classData = $d_sci_Map$;
var $n_sci_Map$;
function $m_sci_Map$() {
  if ((!$n_sci_Map$)) {
    $n_sci_Map$ = new $c_sci_Map$()
  };
  return $n_sci_Map$
}
/** @constructor */
function $c_s_concurrent_BatchingExecutor$SyncBatch(outer, runnable) {
  this.s_concurrent_BatchingExecutor$AbstractBatch__f_first = null;
  this.s_concurrent_BatchingExecutor$AbstractBatch__f_other = null;
  this.s_concurrent_BatchingExecutor$AbstractBatch__f_size = 0;
  this.s_concurrent_BatchingExecutor$AbstractBatch__f_$outer = null;
  $ct_s_concurrent_BatchingExecutor$AbstractBatch__s_concurrent_BatchingExecutor__jl_Runnable__Ajl_Runnable__I__(this, outer, runnable, $m_s_concurrent_BatchingExecutorStatics$().s_concurrent_BatchingExecutorStatics$__f_emptyBatchArray, 1)
}
$c_s_concurrent_BatchingExecutor$SyncBatch.prototype = new $h_s_concurrent_BatchingExecutor$AbstractBatch();
$c_s_concurrent_BatchingExecutor$SyncBatch.prototype.constructor = $c_s_concurrent_BatchingExecutor$SyncBatch;
/** @constructor */
function $h_s_concurrent_BatchingExecutor$SyncBatch() {
  /*<skip>*/
}
$h_s_concurrent_BatchingExecutor$SyncBatch.prototype = $c_s_concurrent_BatchingExecutor$SyncBatch.prototype;
$c_s_concurrent_BatchingExecutor$SyncBatch.prototype.run__V = (function() {
  while (true) {
    try {
      this.runN__I__V(1024)
    } catch (e) {
      var e$2 = ((e instanceof $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$c_jl_Throwable) ? e : new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$c_sjs_js_JavaScriptException(e));
      if (false) {
        var x2 = e$2;
        $m_s_concurrent_ExecutionContext$().s_concurrent_ExecutionContext$__f_defaultReporter.apply__O__O(x2)
      } else if ($m_s_util_control_NonFatal$().apply__jl_Throwable__Z(e$2)) {
        $m_s_concurrent_ExecutionContext$().s_concurrent_ExecutionContext$__f_defaultReporter.apply__O__O(e$2)
      } else {
        throw ((e$2 instanceof $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$c_sjs_js_JavaScriptException) ? e$2.sjs_js_JavaScriptException__f_exception : e$2)
      }
    };
    if ((this.s_concurrent_BatchingExecutor$AbstractBatch__f_size > 0)) {
      continue
    };
    return (void 0)
  }
});
function $isArrayOf_s_concurrent_BatchingExecutor$SyncBatch(obj, depth) {
  return (!(!(((obj && obj.$classData) && (obj.$classData.arrayDepth === depth)) && obj.$classData.arrayBase.ancestors.s_concurrent_BatchingExecutor$SyncBatch)))
}
var $d_s_concurrent_BatchingExecutor$SyncBatch = new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$TypeData().initClass({
  s_concurrent_BatchingExecutor$SyncBatch: 0
}, false, "scala.concurrent.BatchingExecutor$SyncBatch", {
  s_concurrent_BatchingExecutor$SyncBatch: 1,
  s_concurrent_BatchingExecutor$AbstractBatch: 1,
  O: 1,
  jl_Runnable: 1
});
$c_s_concurrent_BatchingExecutor$SyncBatch.prototype.$classData = $d_s_concurrent_BatchingExecutor$SyncBatch;
/** @constructor */
function $c_s_concurrent_impl_Promise$Link(to) {
  this.ju_concurrent_atomic_AtomicReference__f_value = null;
  $ct_ju_concurrent_atomic_AtomicReference__O__(this, to)
}
$c_s_concurrent_impl_Promise$Link.prototype = new $h_ju_concurrent_atomic_AtomicReference();
$c_s_concurrent_impl_Promise$Link.prototype.constructor = $c_s_concurrent_impl_Promise$Link;
/** @constructor */
function $h_s_concurrent_impl_Promise$Link() {
  /*<skip>*/
}
$h_s_concurrent_impl_Promise$Link.prototype = $c_s_concurrent_impl_Promise$Link.prototype;
$c_s_concurrent_impl_Promise$Link.prototype.promise__s_concurrent_impl_Promise$DefaultPromise__s_concurrent_impl_Promise$DefaultPromise = (function(owner) {
  var c = this.ju_concurrent_atomic_AtomicReference__f_value;
  var current = c;
  var target = c;
  while (true) {
    var value = target.ju_concurrent_atomic_AtomicReference__f_value;
    if ($is_s_concurrent_impl_Promise$Callbacks(value)) {
      if (this.compareAndSet__O__O__Z(current, target)) {
        return target
      } else {
        current = this.ju_concurrent_atomic_AtomicReference__f_value
      }
    } else if ((value instanceof $c_s_concurrent_impl_Promise$Link)) {
      target = value.ju_concurrent_atomic_AtomicReference__f_value
    } else {
      owner.unlink__s_util_Try__V(value);
      return owner
    }
  }
});
function $isArrayOf_s_concurrent_impl_Promise$Link(obj, depth) {
  return (!(!(((obj && obj.$classData) && (obj.$classData.arrayDepth === depth)) && obj.$classData.arrayBase.ancestors.s_concurrent_impl_Promise$Link)))
}
var $d_s_concurrent_impl_Promise$Link = new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$TypeData().initClass({
  s_concurrent_impl_Promise$Link: 0
}, false, "scala.concurrent.impl.Promise$Link", {
  s_concurrent_impl_Promise$Link: 1,
  ju_concurrent_atomic_AtomicReference: 1,
  O: 1,
  Ljava_io_Serializable: 1
});
$c_s_concurrent_impl_Promise$Link.prototype.$classData = $d_s_concurrent_impl_Promise$Link;
/** @constructor */
function $c_sr_AbstractPartialFunction() {
  /*<skip>*/
}
$c_sr_AbstractPartialFunction.prototype = new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$h_O();
$c_sr_AbstractPartialFunction.prototype.constructor = $c_sr_AbstractPartialFunction;
/** @constructor */
function $h_sr_AbstractPartialFunction() {
  /*<skip>*/
}
$h_sr_AbstractPartialFunction.prototype = $c_sr_AbstractPartialFunction.prototype;
$c_sr_AbstractPartialFunction.prototype.lift__F1 = (function() {
  return new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$c_s_PartialFunction$Lifted(this)
});
$c_sr_AbstractPartialFunction.prototype.toString__T = (function() {
  return "<function1>"
});
$c_sr_AbstractPartialFunction.prototype.apply__O__O = (function(x) {
  return this.applyOrElse__O__F1__O(x, $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$m_s_PartialFunction$().s_PartialFunction$__f_empty_pf)
});
/** @constructor */
function $c_sjs_js_Any$() {
  /*<skip>*/
}
$c_sjs_js_Any$.prototype = new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$h_O();
$c_sjs_js_Any$.prototype.constructor = $c_sjs_js_Any$;
/** @constructor */
function $h_sjs_js_Any$() {
  /*<skip>*/
}
$h_sjs_js_Any$.prototype = $c_sjs_js_Any$.prototype;
$c_sjs_js_Any$.prototype.fromFunction0__F0__sjs_js_Function0 = (function(f) {
  return (() => f.apply__O())
});
$c_sjs_js_Any$.prototype.fromFunction1__F1__sjs_js_Function1 = (function(f) {
  return ((arg1$2) => f.apply__O__O(arg1$2))
});
var $d_sjs_js_Any$ = new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$TypeData().initClass({
  sjs_js_Any$: 0
}, false, "scala.scalajs.js.Any$", {
  sjs_js_Any$: 1,
  O: 1,
  sjs_js_LowPrioAnyImplicits: 1,
  sjs_js_LowestPrioAnyImplicits: 1
});
$c_sjs_js_Any$.prototype.$classData = $d_sjs_js_Any$;
var $n_sjs_js_Any$;
function $m_sjs_js_Any$() {
  if ((!$n_sjs_js_Any$)) {
    $n_sjs_js_Any$ = new $c_sjs_js_Any$()
  };
  return $n_sjs_js_Any$
}
/** @constructor */
function $c_sjsr_AnonFunction2(f) {
  this.sjsr_AnonFunction2__f_f = null;
  this.sjsr_AnonFunction2__f_f = f
}
$c_sjsr_AnonFunction2.prototype = new $h_sr_AbstractFunction2();
$c_sjsr_AnonFunction2.prototype.constructor = $c_sjsr_AnonFunction2;
/** @constructor */
function $h_sjsr_AnonFunction2() {
  /*<skip>*/
}
$h_sjsr_AnonFunction2.prototype = $c_sjsr_AnonFunction2.prototype;
$c_sjsr_AnonFunction2.prototype.apply__O__O__O = (function(arg1, arg2) {
  return (0, this.sjsr_AnonFunction2__f_f)(arg1, arg2)
});
var $d_sjsr_AnonFunction2 = new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$TypeData().initClass({
  sjsr_AnonFunction2: 0
}, false, "scala.scalajs.runtime.AnonFunction2", {
  sjsr_AnonFunction2: 1,
  sr_AbstractFunction2: 1,
  O: 1,
  F2: 1
});
$c_sjsr_AnonFunction2.prototype.$classData = $d_sjsr_AnonFunction2;
/** @constructor */
function $c_sjsr_AnonFunction3(f) {
  this.sjsr_AnonFunction3__f_f = null;
  this.sjsr_AnonFunction3__f_f = f
}
$c_sjsr_AnonFunction3.prototype = new $h_sr_AbstractFunction3();
$c_sjsr_AnonFunction3.prototype.constructor = $c_sjsr_AnonFunction3;
/** @constructor */
function $h_sjsr_AnonFunction3() {
  /*<skip>*/
}
$h_sjsr_AnonFunction3.prototype = $c_sjsr_AnonFunction3.prototype;
$c_sjsr_AnonFunction3.prototype.apply__O__O__O__O = (function(arg1, arg2, arg3) {
  return (0, this.sjsr_AnonFunction3__f_f)(arg1, arg2, arg3)
});
var $d_sjsr_AnonFunction3 = new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$TypeData().initClass({
  sjsr_AnonFunction3: 0
}, false, "scala.scalajs.runtime.AnonFunction3", {
  sjsr_AnonFunction3: 1,
  sr_AbstractFunction3: 1,
  O: 1,
  F3: 1
});
$c_sjsr_AnonFunction3.prototype.$classData = $d_sjsr_AnonFunction3;
/** @constructor */
function $c_sjsr_AnonFunction4(f) {
  this.sjsr_AnonFunction4__f_f = null;
  this.sjsr_AnonFunction4__f_f = f
}
$c_sjsr_AnonFunction4.prototype = new $h_sr_AbstractFunction4();
$c_sjsr_AnonFunction4.prototype.constructor = $c_sjsr_AnonFunction4;
/** @constructor */
function $h_sjsr_AnonFunction4() {
  /*<skip>*/
}
$h_sjsr_AnonFunction4.prototype = $c_sjsr_AnonFunction4.prototype;
$c_sjsr_AnonFunction4.prototype.apply__O__O__O__O__O = (function(arg1, arg2, arg3, arg4) {
  return (0, this.sjsr_AnonFunction4__f_f)(arg1, arg2, arg3, arg4)
});
var $d_sjsr_AnonFunction4 = new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$TypeData().initClass({
  sjsr_AnonFunction4: 0
}, false, "scala.scalajs.runtime.AnonFunction4", {
  sjsr_AnonFunction4: 1,
  sr_AbstractFunction4: 1,
  O: 1,
  F4: 1
});
$c_sjsr_AnonFunction4.prototype.$classData = $d_sjsr_AnonFunction4;
function $isArrayOf_s_util_control_ControlThrowable(obj, depth) {
  return (!(!(((obj && obj.$classData) && (obj.$classData.arrayDepth === depth)) && obj.$classData.arrayBase.ancestors.s_util_control_ControlThrowable)))
}
/** @constructor */
function $c_Lbe_doeraene_webcomponents_ui5_FileUploader$() {
  this.Lbe_doeraene_webcomponents_ui5_FileUploader$__f_tag = null;
  this.Lbe_doeraene_webcomponents_ui5_FileUploader$__f_hideInput$lzy1 = null;
  this.Lbe_doeraene_webcomponents_ui5_FileUploader$__f_hideInputbitmap$1 = false;
  this.Lbe_doeraene_webcomponents_ui5_FileUploader$__f_multiple$lzy1 = null;
  this.Lbe_doeraene_webcomponents_ui5_FileUploader$__f_multiplebitmap$1 = false;
  $n_Lbe_doeraene_webcomponents_ui5_FileUploader$ = this;
  $f_Lbe_doeraene_webcomponents_WebComponent__$init$__V(this);
  $i_$0040ui5$002fwebcomponents$002fdist$002fFileUploader$002ejs.default;
  $m_Lcom_raquo_laminar_api_package$();
  $m_Lcom_raquo_laminar_api_package$();
  var void$1 = false;
  this.Lbe_doeraene_webcomponents_ui5_FileUploader$__f_tag = new $c_Lcom_raquo_laminar_tags_HtmlTag("ui5-file-uploader", void$1)
}
$c_Lbe_doeraene_webcomponents_ui5_FileUploader$.prototype = new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$h_O();
$c_Lbe_doeraene_webcomponents_ui5_FileUploader$.prototype.constructor = $c_Lbe_doeraene_webcomponents_ui5_FileUploader$;
/** @constructor */
function $h_Lbe_doeraene_webcomponents_ui5_FileUploader$() {
  /*<skip>*/
}
$h_Lbe_doeraene_webcomponents_ui5_FileUploader$.prototype = $c_Lbe_doeraene_webcomponents_ui5_FileUploader$.prototype;
$c_Lbe_doeraene_webcomponents_ui5_FileUploader$.prototype.be$doeraene$webcomponents$WebComponent$_setter_$id_$eq__Lcom_raquo_laminar_keys_HtmlProp__V = (function(x$0) {
  /*<skip>*/
});
$c_Lbe_doeraene_webcomponents_ui5_FileUploader$.prototype.tag__Lcom_raquo_laminar_tags_HtmlTag = (function() {
  return this.Lbe_doeraene_webcomponents_ui5_FileUploader$__f_tag
});
$c_Lbe_doeraene_webcomponents_ui5_FileUploader$.prototype.hideInput__Lcom_raquo_laminar_keys_HtmlAttr = (function() {
  if ((!this.Lbe_doeraene_webcomponents_ui5_FileUploader$__f_hideInputbitmap$1)) {
    $m_Lcom_raquo_laminar_api_package$();
    var codec = $m_Lcom_raquo_laminar_codecs_package$().Lcom_raquo_laminar_codecs_package$__f_BooleanAsAttrPresenceCodec;
    this.Lbe_doeraene_webcomponents_ui5_FileUploader$__f_hideInput$lzy1 = new $c_Lcom_raquo_laminar_keys_HtmlAttr("hide-input", codec);
    this.Lbe_doeraene_webcomponents_ui5_FileUploader$__f_hideInputbitmap$1 = true
  };
  return this.Lbe_doeraene_webcomponents_ui5_FileUploader$__f_hideInput$lzy1
});
$c_Lbe_doeraene_webcomponents_ui5_FileUploader$.prototype.multiple__Lcom_raquo_laminar_keys_HtmlAttr = (function() {
  if ((!this.Lbe_doeraene_webcomponents_ui5_FileUploader$__f_multiplebitmap$1)) {
    $m_Lcom_raquo_laminar_api_package$();
    var codec = $m_Lcom_raquo_laminar_codecs_package$().Lcom_raquo_laminar_codecs_package$__f_BooleanAsAttrPresenceCodec;
    this.Lbe_doeraene_webcomponents_ui5_FileUploader$__f_multiple$lzy1 = new $c_Lcom_raquo_laminar_keys_HtmlAttr("multiple", codec);
    this.Lbe_doeraene_webcomponents_ui5_FileUploader$__f_multiplebitmap$1 = true
  };
  return this.Lbe_doeraene_webcomponents_ui5_FileUploader$__f_multiple$lzy1
});
function $isArrayOf_Lbe_doeraene_webcomponents_ui5_FileUploader$(obj, depth) {
  return (!(!(((obj && obj.$classData) && (obj.$classData.arrayDepth === depth)) && obj.$classData.arrayBase.ancestors.Lbe_doeraene_webcomponents_ui5_FileUploader$)))
}
var $d_Lbe_doeraene_webcomponents_ui5_FileUploader$ = new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$TypeData().initClass({
  Lbe_doeraene_webcomponents_ui5_FileUploader$: 0
}, false, "be.doeraene.webcomponents.ui5.FileUploader$", {
  Lbe_doeraene_webcomponents_ui5_FileUploader$: 1,
  O: 1,
  Lbe_doeraene_webcomponents_WebComponent: 1,
  Lbe_doeraene_webcomponents_ui5_HasName: 1,
  Lbe_doeraene_webcomponents_ui5_HasValue: 1
});
$c_Lbe_doeraene_webcomponents_ui5_FileUploader$.prototype.$classData = $d_Lbe_doeraene_webcomponents_ui5_FileUploader$;
var $n_Lbe_doeraene_webcomponents_ui5_FileUploader$;
function $m_Lbe_doeraene_webcomponents_ui5_FileUploader$() {
  if ((!$n_Lbe_doeraene_webcomponents_ui5_FileUploader$)) {
    $n_Lbe_doeraene_webcomponents_ui5_FileUploader$ = new $c_Lbe_doeraene_webcomponents_ui5_FileUploader$()
  };
  return $n_Lbe_doeraene_webcomponents_ui5_FileUploader$
}
/** @constructor */
function $c_Lbe_doeraene_webcomponents_ui5_configkeys_ButtonDesign$() {
  this.Lbe_doeraene_webcomponents_ui5_configkeys_ButtonDesign$__f_valueFromString$lzy1 = null;
  this.Lbe_doeraene_webcomponents_ui5_configkeys_ButtonDesign$__f_valueFromStringbitmap$1 = false;
  this.Lbe_doeraene_webcomponents_ui5_configkeys_ButtonDesign$__f_AsStringCodec$lzy1 = null;
  this.Lbe_doeraene_webcomponents_ui5_configkeys_ButtonDesign$__f_AsStringCodecbitmap$1 = false;
  this.Lbe_doeraene_webcomponents_ui5_configkeys_ButtonDesign$__f_allValues = null;
  $n_Lbe_doeraene_webcomponents_ui5_configkeys_ButtonDesign$ = this;
  $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$m_s_package$();
  var elems = $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$m_sr_ScalaRunTime$().wrapRefArray__AO__sci_ArraySeq(new ($d_Lbe_doeraene_webcomponents_ui5_configkeys_ButtonDesign.getArrayOf().constr)([$m_Lbe_doeraene_webcomponents_ui5_configkeys_ButtonDesign$Default$(), $m_Lbe_doeraene_webcomponents_ui5_configkeys_ButtonDesign$Emphasized$(), $m_Lbe_doeraene_webcomponents_ui5_configkeys_ButtonDesign$Positive$(), $m_Lbe_doeraene_webcomponents_ui5_configkeys_ButtonDesign$Negative$(), $m_Lbe_doeraene_webcomponents_ui5_configkeys_ButtonDesign$Transparent$(), $m_Lbe_doeraene_webcomponents_ui5_configkeys_ButtonDesign$Attention$()]));
  this.Lbe_doeraene_webcomponents_ui5_configkeys_ButtonDesign$__f_allValues = $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$m_sci_Nil$().prependedAll__sc_IterableOnce__sci_List(elems)
}
$c_Lbe_doeraene_webcomponents_ui5_configkeys_ButtonDesign$.prototype = new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$h_O();
$c_Lbe_doeraene_webcomponents_ui5_configkeys_ButtonDesign$.prototype.constructor = $c_Lbe_doeraene_webcomponents_ui5_configkeys_ButtonDesign$;
/** @constructor */
function $h_Lbe_doeraene_webcomponents_ui5_configkeys_ButtonDesign$() {
  /*<skip>*/
}
$h_Lbe_doeraene_webcomponents_ui5_configkeys_ButtonDesign$.prototype = $c_Lbe_doeraene_webcomponents_ui5_configkeys_ButtonDesign$.prototype;
$c_Lbe_doeraene_webcomponents_ui5_configkeys_ButtonDesign$.prototype.valueFromString__s_PartialFunction = (function() {
  if ((!this.Lbe_doeraene_webcomponents_ui5_configkeys_ButtonDesign$__f_valueFromStringbitmap$1)) {
    this.Lbe_doeraene_webcomponents_ui5_configkeys_ButtonDesign$__f_valueFromString$lzy1 = $f_Lbe_doeraene_webcomponents_ui5_configkeys_EnumerationString__valueFromString__s_PartialFunction(this);
    this.Lbe_doeraene_webcomponents_ui5_configkeys_ButtonDesign$__f_valueFromStringbitmap$1 = true
  };
  return this.Lbe_doeraene_webcomponents_ui5_configkeys_ButtonDesign$__f_valueFromString$lzy1
});
$c_Lbe_doeraene_webcomponents_ui5_configkeys_ButtonDesign$.prototype.AsStringCodec__Lbe_doeraene_webcomponents_ui5_configkeys_EnumerationString$AsStringCodec$ = (function() {
  if ((!this.Lbe_doeraene_webcomponents_ui5_configkeys_ButtonDesign$__f_AsStringCodecbitmap$1)) {
    this.Lbe_doeraene_webcomponents_ui5_configkeys_ButtonDesign$__f_AsStringCodec$lzy1 = new $c_Lbe_doeraene_webcomponents_ui5_configkeys_EnumerationString$AsStringCodec$(this);
    this.Lbe_doeraene_webcomponents_ui5_configkeys_ButtonDesign$__f_AsStringCodecbitmap$1 = true
  };
  return this.Lbe_doeraene_webcomponents_ui5_configkeys_ButtonDesign$__f_AsStringCodec$lzy1
});
$c_Lbe_doeraene_webcomponents_ui5_configkeys_ButtonDesign$.prototype.allValues__sci_List = (function() {
  return this.Lbe_doeraene_webcomponents_ui5_configkeys_ButtonDesign$__f_allValues
});
$c_Lbe_doeraene_webcomponents_ui5_configkeys_ButtonDesign$.prototype.valueOf__O__T = (function(value) {
  var value$1 = value;
  return value$1.toString__T()
});
var $d_Lbe_doeraene_webcomponents_ui5_configkeys_ButtonDesign$ = new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$TypeData().initClass({
  Lbe_doeraene_webcomponents_ui5_configkeys_ButtonDesign$: 0
}, false, "be.doeraene.webcomponents.ui5.configkeys.ButtonDesign$", {
  Lbe_doeraene_webcomponents_ui5_configkeys_ButtonDesign$: 1,
  O: 1,
  Lbe_doeraene_webcomponents_ui5_configkeys_EnumerationString: 1,
  s_deriving_Mirror: 1,
  s_deriving_Mirror$Sum: 1
});
$c_Lbe_doeraene_webcomponents_ui5_configkeys_ButtonDesign$.prototype.$classData = $d_Lbe_doeraene_webcomponents_ui5_configkeys_ButtonDesign$;
var $n_Lbe_doeraene_webcomponents_ui5_configkeys_ButtonDesign$;
function $m_Lbe_doeraene_webcomponents_ui5_configkeys_ButtonDesign$() {
  if ((!$n_Lbe_doeraene_webcomponents_ui5_configkeys_ButtonDesign$)) {
    $n_Lbe_doeraene_webcomponents_ui5_configkeys_ButtonDesign$ = new $c_Lbe_doeraene_webcomponents_ui5_configkeys_ButtonDesign$()
  };
  return $n_Lbe_doeraene_webcomponents_ui5_configkeys_ButtonDesign$
}
/** @constructor */
function $c_Lbe_doeraene_webcomponents_ui5_configkeys_ListMode$() {
  this.Lbe_doeraene_webcomponents_ui5_configkeys_ListMode$__f_valueFromString$lzy1 = null;
  this.Lbe_doeraene_webcomponents_ui5_configkeys_ListMode$__f_valueFromStringbitmap$1 = false;
  this.Lbe_doeraene_webcomponents_ui5_configkeys_ListMode$__f_AsStringCodec$lzy1 = null;
  this.Lbe_doeraene_webcomponents_ui5_configkeys_ListMode$__f_AsStringCodecbitmap$1 = false;
  this.Lbe_doeraene_webcomponents_ui5_configkeys_ListMode$__f_allValues = null;
  $n_Lbe_doeraene_webcomponents_ui5_configkeys_ListMode$ = this;
  $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$m_s_package$();
  var elems = $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$m_sr_ScalaRunTime$().wrapRefArray__AO__sci_ArraySeq(new ($d_Lbe_doeraene_webcomponents_ui5_configkeys_ListMode.getArrayOf().constr)([$m_Lbe_doeraene_webcomponents_ui5_configkeys_ListMode$None$(), $m_Lbe_doeraene_webcomponents_ui5_configkeys_ListMode$SingleSelect$(), $m_Lbe_doeraene_webcomponents_ui5_configkeys_ListMode$SingleSelectBegin$(), $m_Lbe_doeraene_webcomponents_ui5_configkeys_ListMode$SingleSelectEnd$(), $m_Lbe_doeraene_webcomponents_ui5_configkeys_ListMode$MultiSelect$(), $m_Lbe_doeraene_webcomponents_ui5_configkeys_ListMode$Delete$()]));
  this.Lbe_doeraene_webcomponents_ui5_configkeys_ListMode$__f_allValues = $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$m_sci_Nil$().prependedAll__sc_IterableOnce__sci_List(elems)
}
$c_Lbe_doeraene_webcomponents_ui5_configkeys_ListMode$.prototype = new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$h_O();
$c_Lbe_doeraene_webcomponents_ui5_configkeys_ListMode$.prototype.constructor = $c_Lbe_doeraene_webcomponents_ui5_configkeys_ListMode$;
/** @constructor */
function $h_Lbe_doeraene_webcomponents_ui5_configkeys_ListMode$() {
  /*<skip>*/
}
$h_Lbe_doeraene_webcomponents_ui5_configkeys_ListMode$.prototype = $c_Lbe_doeraene_webcomponents_ui5_configkeys_ListMode$.prototype;
$c_Lbe_doeraene_webcomponents_ui5_configkeys_ListMode$.prototype.valueFromString__s_PartialFunction = (function() {
  if ((!this.Lbe_doeraene_webcomponents_ui5_configkeys_ListMode$__f_valueFromStringbitmap$1)) {
    this.Lbe_doeraene_webcomponents_ui5_configkeys_ListMode$__f_valueFromString$lzy1 = $f_Lbe_doeraene_webcomponents_ui5_configkeys_EnumerationString__valueFromString__s_PartialFunction(this);
    this.Lbe_doeraene_webcomponents_ui5_configkeys_ListMode$__f_valueFromStringbitmap$1 = true
  };
  return this.Lbe_doeraene_webcomponents_ui5_configkeys_ListMode$__f_valueFromString$lzy1
});
$c_Lbe_doeraene_webcomponents_ui5_configkeys_ListMode$.prototype.AsStringCodec__Lbe_doeraene_webcomponents_ui5_configkeys_EnumerationString$AsStringCodec$ = (function() {
  if ((!this.Lbe_doeraene_webcomponents_ui5_configkeys_ListMode$__f_AsStringCodecbitmap$1)) {
    this.Lbe_doeraene_webcomponents_ui5_configkeys_ListMode$__f_AsStringCodec$lzy1 = new $c_Lbe_doeraene_webcomponents_ui5_configkeys_EnumerationString$AsStringCodec$(this);
    this.Lbe_doeraene_webcomponents_ui5_configkeys_ListMode$__f_AsStringCodecbitmap$1 = true
  };
  return this.Lbe_doeraene_webcomponents_ui5_configkeys_ListMode$__f_AsStringCodec$lzy1
});
$c_Lbe_doeraene_webcomponents_ui5_configkeys_ListMode$.prototype.allValues__sci_List = (function() {
  return this.Lbe_doeraene_webcomponents_ui5_configkeys_ListMode$__f_allValues
});
$c_Lbe_doeraene_webcomponents_ui5_configkeys_ListMode$.prototype.valueOf__O__T = (function(value) {
  var value$1 = value;
  return value$1.toString__T()
});
var $d_Lbe_doeraene_webcomponents_ui5_configkeys_ListMode$ = new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$TypeData().initClass({
  Lbe_doeraene_webcomponents_ui5_configkeys_ListMode$: 0
}, false, "be.doeraene.webcomponents.ui5.configkeys.ListMode$", {
  Lbe_doeraene_webcomponents_ui5_configkeys_ListMode$: 1,
  O: 1,
  Lbe_doeraene_webcomponents_ui5_configkeys_EnumerationString: 1,
  s_deriving_Mirror: 1,
  s_deriving_Mirror$Sum: 1
});
$c_Lbe_doeraene_webcomponents_ui5_configkeys_ListMode$.prototype.$classData = $d_Lbe_doeraene_webcomponents_ui5_configkeys_ListMode$;
var $n_Lbe_doeraene_webcomponents_ui5_configkeys_ListMode$;
function $m_Lbe_doeraene_webcomponents_ui5_configkeys_ListMode$() {
  if ((!$n_Lbe_doeraene_webcomponents_ui5_configkeys_ListMode$)) {
    $n_Lbe_doeraene_webcomponents_ui5_configkeys_ListMode$ = new $c_Lbe_doeraene_webcomponents_ui5_configkeys_ListMode$()
  };
  return $n_Lbe_doeraene_webcomponents_ui5_configkeys_ListMode$
}
/** @constructor */
function $c_Lcom_raquo_airstream_common_InternalParentObserver$$anon$2(parentParam$2, onTryParam$1) {
  this.Lcom_raquo_airstream_common_InternalParentObserver$$anon$2__f_onTryParam$2 = null;
  this.Lcom_raquo_airstream_common_InternalParentObserver$$anon$2__f_parent = null;
  this.Lcom_raquo_airstream_common_InternalParentObserver$$anon$2__f_onTryParam$2 = onTryParam$1;
  this.Lcom_raquo_airstream_common_InternalParentObserver$$anon$2__f_parent = parentParam$2
}
$c_Lcom_raquo_airstream_common_InternalParentObserver$$anon$2.prototype = new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$h_O();
$c_Lcom_raquo_airstream_common_InternalParentObserver$$anon$2.prototype.constructor = $c_Lcom_raquo_airstream_common_InternalParentObserver$$anon$2;
/** @constructor */
function $h_Lcom_raquo_airstream_common_InternalParentObserver$$anon$2() {
  /*<skip>*/
}
$h_Lcom_raquo_airstream_common_InternalParentObserver$$anon$2.prototype = $c_Lcom_raquo_airstream_common_InternalParentObserver$$anon$2.prototype;
$c_Lcom_raquo_airstream_common_InternalParentObserver$$anon$2.prototype.onNext__O__Lcom_raquo_airstream_core_Transaction__V = (function(nextValue, transaction) {
  $f_Lcom_raquo_airstream_common_InternalTryObserver__onNext__O__Lcom_raquo_airstream_core_Transaction__V(this, nextValue, transaction)
});
$c_Lcom_raquo_airstream_common_InternalParentObserver$$anon$2.prototype.onError__jl_Throwable__Lcom_raquo_airstream_core_Transaction__V = (function(nextError, transaction) {
  $f_Lcom_raquo_airstream_common_InternalTryObserver__onError__jl_Throwable__Lcom_raquo_airstream_core_Transaction__V(this, nextError, transaction)
});
$c_Lcom_raquo_airstream_common_InternalParentObserver$$anon$2.prototype.onTry__s_util_Try__Lcom_raquo_airstream_core_Transaction__V = (function(nextValue, transaction) {
  this.Lcom_raquo_airstream_common_InternalParentObserver$$anon$2__f_onTryParam$2.apply__O__O__O(nextValue, transaction)
});
var $d_Lcom_raquo_airstream_common_InternalParentObserver$$anon$2 = new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$TypeData().initClass({
  Lcom_raquo_airstream_common_InternalParentObserver$$anon$2: 0
}, false, "com.raquo.airstream.common.InternalParentObserver$$anon$2", {
  Lcom_raquo_airstream_common_InternalParentObserver$$anon$2: 1,
  O: 1,
  Lcom_raquo_airstream_core_InternalObserver: 1,
  Lcom_raquo_airstream_common_InternalParentObserver: 1,
  Lcom_raquo_airstream_common_InternalTryObserver: 1
});
$c_Lcom_raquo_airstream_common_InternalParentObserver$$anon$2.prototype.$classData = $d_Lcom_raquo_airstream_common_InternalParentObserver$$anon$2;
function $is_Lcom_raquo_airstream_core_Observable(obj) {
  return (!(!((obj && obj.$classData) && obj.$classData.ancestors.Lcom_raquo_airstream_core_Observable)))
}
function $isArrayOf_Lcom_raquo_airstream_core_Observable(obj, depth) {
  return (!(!(((obj && obj.$classData) && (obj.$classData.arrayDepth === depth)) && obj.$classData.arrayBase.ancestors.Lcom_raquo_airstream_core_Observable)))
}
/** @constructor */
function $c_Lcom_raquo_airstream_core_Observer$$anon$8(handleObserverErrors$3, onNextParam$2, onErrorParam$2) {
  this.Lcom_raquo_airstream_core_Observer$$anon$8__f_handleObserverErrors$1 = false;
  this.Lcom_raquo_airstream_core_Observer$$anon$8__f_onNextParam$1 = null;
  this.Lcom_raquo_airstream_core_Observer$$anon$8__f_onErrorParam$1 = null;
  this.Lcom_raquo_airstream_core_Observer$$anon$8__f_maybeDisplayName = null;
  this.Lcom_raquo_airstream_core_Observer$$anon$8__f_handleObserverErrors$1 = handleObserverErrors$3;
  this.Lcom_raquo_airstream_core_Observer$$anon$8__f_onNextParam$1 = onNextParam$2;
  this.Lcom_raquo_airstream_core_Observer$$anon$8__f_onErrorParam$1 = onErrorParam$2;
  this.Lcom_raquo_airstream_core_Observer$$anon$8__f_maybeDisplayName = (void 0)
}
$c_Lcom_raquo_airstream_core_Observer$$anon$8.prototype = new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$h_O();
$c_Lcom_raquo_airstream_core_Observer$$anon$8.prototype.constructor = $c_Lcom_raquo_airstream_core_Observer$$anon$8;
/** @constructor */
function $h_Lcom_raquo_airstream_core_Observer$$anon$8() {
  /*<skip>*/
}
$h_Lcom_raquo_airstream_core_Observer$$anon$8.prototype = $c_Lcom_raquo_airstream_core_Observer$$anon$8.prototype;
$c_Lcom_raquo_airstream_core_Observer$$anon$8.prototype.maybeDisplayName__O = (function() {
  return this.Lcom_raquo_airstream_core_Observer$$anon$8__f_maybeDisplayName
});
$c_Lcom_raquo_airstream_core_Observer$$anon$8.prototype.toString__T = (function() {
  return $f_Lcom_raquo_airstream_core_Named__displayName__T(this)
});
$c_Lcom_raquo_airstream_core_Observer$$anon$8.prototype.toObserver__Lcom_raquo_airstream_core_Observer = (function() {
  return this
});
$c_Lcom_raquo_airstream_core_Observer$$anon$8.prototype.onNext__O__V = (function(nextValue) {
  try {
    this.Lcom_raquo_airstream_core_Observer$$anon$8__f_onNextParam$1.apply__O__O(nextValue)
  } catch (e) {
    var e$2 = ((e instanceof $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$c_jl_Throwable) ? e : new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$c_sjs_js_JavaScriptException(e));
    if (this.Lcom_raquo_airstream_core_Observer$$anon$8__f_handleObserverErrors$1) {
      this.onError__jl_Throwable__V(new $c_Lcom_raquo_airstream_core_AirstreamError$ObserverError(e$2))
    } else {
      $m_Lcom_raquo_airstream_core_AirstreamError$().sendUnhandledError__jl_Throwable__V(new $c_Lcom_raquo_airstream_core_AirstreamError$ObserverError(e$2))
    }
  }
});
$c_Lcom_raquo_airstream_core_Observer$$anon$8.prototype.onError__jl_Throwable__V = (function(error) {
  try {
    if (this.Lcom_raquo_airstream_core_Observer$$anon$8__f_onErrorParam$1.isDefinedAt__O__Z(error)) {
      this.Lcom_raquo_airstream_core_Observer$$anon$8__f_onErrorParam$1.apply__O__O(error)
    } else {
      $m_Lcom_raquo_airstream_core_AirstreamError$().sendUnhandledError__jl_Throwable__V(error)
    }
  } catch (e) {
    var e$2 = ((e instanceof $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$c_jl_Throwable) ? e : new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$c_sjs_js_JavaScriptException(e));
    $m_Lcom_raquo_airstream_core_AirstreamError$().sendUnhandledError__jl_Throwable__V(new $c_Lcom_raquo_airstream_core_AirstreamError$ObserverErrorHandlingError(e$2, error))
  }
});
$c_Lcom_raquo_airstream_core_Observer$$anon$8.prototype.onTry__s_util_Try__V = (function(nextValue) {
  nextValue.fold__F1__F1__O(new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$c_sjsr_AnonFunction1(((error) => {
    var error$1 = error;
    this.onError__jl_Throwable__V(error$1)
  })), new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$c_sjsr_AnonFunction1(((nextValue$2) => {
    this.onNext__O__V(nextValue$2)
  })))
});
var $d_Lcom_raquo_airstream_core_Observer$$anon$8 = new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$TypeData().initClass({
  Lcom_raquo_airstream_core_Observer$$anon$8: 0
}, false, "com.raquo.airstream.core.Observer$$anon$8", {
  Lcom_raquo_airstream_core_Observer$$anon$8: 1,
  O: 1,
  Lcom_raquo_airstream_core_Sink: 1,
  Lcom_raquo_airstream_core_Named: 1,
  Lcom_raquo_airstream_core_Observer: 1
});
$c_Lcom_raquo_airstream_core_Observer$$anon$8.prototype.$classData = $d_Lcom_raquo_airstream_core_Observer$$anon$8;
/** @constructor */
function $c_Lcom_raquo_airstream_core_Observer$$anon$9(handleObserverErrors$4, onTryParam$2) {
  this.Lcom_raquo_airstream_core_Observer$$anon$9__f_handleObserverErrors$2 = false;
  this.Lcom_raquo_airstream_core_Observer$$anon$9__f_onTryParam$1 = null;
  this.Lcom_raquo_airstream_core_Observer$$anon$9__f_maybeDisplayName = null;
  this.Lcom_raquo_airstream_core_Observer$$anon$9__f_handleObserverErrors$2 = handleObserverErrors$4;
  this.Lcom_raquo_airstream_core_Observer$$anon$9__f_onTryParam$1 = onTryParam$2;
  this.Lcom_raquo_airstream_core_Observer$$anon$9__f_maybeDisplayName = (void 0)
}
$c_Lcom_raquo_airstream_core_Observer$$anon$9.prototype = new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$h_O();
$c_Lcom_raquo_airstream_core_Observer$$anon$9.prototype.constructor = $c_Lcom_raquo_airstream_core_Observer$$anon$9;
/** @constructor */
function $h_Lcom_raquo_airstream_core_Observer$$anon$9() {
  /*<skip>*/
}
$h_Lcom_raquo_airstream_core_Observer$$anon$9.prototype = $c_Lcom_raquo_airstream_core_Observer$$anon$9.prototype;
$c_Lcom_raquo_airstream_core_Observer$$anon$9.prototype.maybeDisplayName__O = (function() {
  return this.Lcom_raquo_airstream_core_Observer$$anon$9__f_maybeDisplayName
});
$c_Lcom_raquo_airstream_core_Observer$$anon$9.prototype.toString__T = (function() {
  return $f_Lcom_raquo_airstream_core_Named__displayName__T(this)
});
$c_Lcom_raquo_airstream_core_Observer$$anon$9.prototype.toObserver__Lcom_raquo_airstream_core_Observer = (function() {
  return this
});
$c_Lcom_raquo_airstream_core_Observer$$anon$9.prototype.onNext__O__V = (function(nextValue) {
  this.onTry__s_util_Try__V(new $c_s_util_Success(nextValue))
});
$c_Lcom_raquo_airstream_core_Observer$$anon$9.prototype.onError__jl_Throwable__V = (function(error) {
  this.onTry__s_util_Try__V(new $c_s_util_Failure(error))
});
$c_Lcom_raquo_airstream_core_Observer$$anon$9.prototype.onTry__s_util_Try__V = (function(nextValue) {
  try {
    if (this.Lcom_raquo_airstream_core_Observer$$anon$9__f_onTryParam$1.isDefinedAt__O__Z(nextValue)) {
      this.Lcom_raquo_airstream_core_Observer$$anon$9__f_onTryParam$1.apply__O__O(nextValue)
    } else {
      nextValue.fold__F1__F1__O(new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$c_sjsr_AnonFunction1(((err) => {
        var err$1 = err;
        $m_Lcom_raquo_airstream_core_AirstreamError$().sendUnhandledError__jl_Throwable__V(err$1)
      })), new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$c_sjsr_AnonFunction1(((_$2) => (void 0))))
    }
  } catch (e) {
    var e$2 = ((e instanceof $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$c_jl_Throwable) ? e : new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$c_sjs_js_JavaScriptException(e));
    if ((this.Lcom_raquo_airstream_core_Observer$$anon$9__f_handleObserverErrors$2 && nextValue.isSuccess__Z())) {
      this.onError__jl_Throwable__V(new $c_Lcom_raquo_airstream_core_AirstreamError$ObserverError(e$2))
    } else {
      nextValue.fold__F1__F1__O(new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$c_sjsr_AnonFunction1(((originalError) => {
        var originalError$1 = originalError;
        $m_Lcom_raquo_airstream_core_AirstreamError$().sendUnhandledError__jl_Throwable__V(new $c_Lcom_raquo_airstream_core_AirstreamError$ObserverErrorHandlingError(e$2, originalError$1))
      })), new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$c_sjsr_AnonFunction1(((_$3) => {
        $m_Lcom_raquo_airstream_core_AirstreamError$().sendUnhandledError__jl_Throwable__V(new $c_Lcom_raquo_airstream_core_AirstreamError$ObserverError(e$2))
      })))
    }
  }
});
var $d_Lcom_raquo_airstream_core_Observer$$anon$9 = new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$TypeData().initClass({
  Lcom_raquo_airstream_core_Observer$$anon$9: 0
}, false, "com.raquo.airstream.core.Observer$$anon$9", {
  Lcom_raquo_airstream_core_Observer$$anon$9: 1,
  O: 1,
  Lcom_raquo_airstream_core_Sink: 1,
  Lcom_raquo_airstream_core_Named: 1,
  Lcom_raquo_airstream_core_Observer: 1
});
$c_Lcom_raquo_airstream_core_Observer$$anon$9.prototype.$classData = $d_Lcom_raquo_airstream_core_Observer$$anon$9;
/** @constructor */
function $c_Lcom_raquo_airstream_eventbus_WriteBus() {
  this.Lcom_raquo_airstream_eventbus_WriteBus__f_maybeDisplayName = null;
  this.Lcom_raquo_airstream_eventbus_WriteBus__f_stream = null;
  this.Lcom_raquo_airstream_eventbus_WriteBus__f_maybeDisplayName = (void 0);
  this.Lcom_raquo_airstream_eventbus_WriteBus__f_stream = new $c_Lcom_raquo_airstream_eventbus_EventBusStream()
}
$c_Lcom_raquo_airstream_eventbus_WriteBus.prototype = new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$h_O();
$c_Lcom_raquo_airstream_eventbus_WriteBus.prototype.constructor = $c_Lcom_raquo_airstream_eventbus_WriteBus;
/** @constructor */
function $h_Lcom_raquo_airstream_eventbus_WriteBus() {
  /*<skip>*/
}
$h_Lcom_raquo_airstream_eventbus_WriteBus.prototype = $c_Lcom_raquo_airstream_eventbus_WriteBus.prototype;
$c_Lcom_raquo_airstream_eventbus_WriteBus.prototype.maybeDisplayName__O = (function() {
  return this.Lcom_raquo_airstream_eventbus_WriteBus__f_maybeDisplayName
});
$c_Lcom_raquo_airstream_eventbus_WriteBus.prototype.toString__T = (function() {
  return $f_Lcom_raquo_airstream_core_Named__displayName__T(this)
});
$c_Lcom_raquo_airstream_eventbus_WriteBus.prototype.toObserver__Lcom_raquo_airstream_core_Observer = (function() {
  return this
});
$c_Lcom_raquo_airstream_eventbus_WriteBus.prototype.onNext__O__V = (function(nextValue) {
  var this$1 = this.Lcom_raquo_airstream_eventbus_WriteBus__f_stream;
  if ($f_Lcom_raquo_airstream_core_BaseObservable__isStarted__Z(this$1)) {
    var observer = this.Lcom_raquo_airstream_eventbus_WriteBus__f_stream;
    observer.onNext__O__Lcom_raquo_airstream_core_Transaction__V(nextValue, null)
  }
});
$c_Lcom_raquo_airstream_eventbus_WriteBus.prototype.onError__jl_Throwable__V = (function(nextError) {
  var this$1 = this.Lcom_raquo_airstream_eventbus_WriteBus__f_stream;
  if ($f_Lcom_raquo_airstream_core_BaseObservable__isStarted__Z(this$1)) {
    var observer = this.Lcom_raquo_airstream_eventbus_WriteBus__f_stream;
    observer.onError__jl_Throwable__Lcom_raquo_airstream_core_Transaction__V(nextError, null)
  }
});
$c_Lcom_raquo_airstream_eventbus_WriteBus.prototype.onTry__s_util_Try__V = (function(nextValue) {
  nextValue.fold__F1__F1__O(new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$c_sjsr_AnonFunction1(((nextError) => {
    var nextError$1 = nextError;
    this.onError__jl_Throwable__V(nextError$1)
  })), new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$c_sjsr_AnonFunction1(((nextValue$2) => {
    this.onNext__O__V(nextValue$2)
  })))
});
var $d_Lcom_raquo_airstream_eventbus_WriteBus = new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$TypeData().initClass({
  Lcom_raquo_airstream_eventbus_WriteBus: 0
}, false, "com.raquo.airstream.eventbus.WriteBus", {
  Lcom_raquo_airstream_eventbus_WriteBus: 1,
  O: 1,
  Lcom_raquo_airstream_core_Sink: 1,
  Lcom_raquo_airstream_core_Named: 1,
  Lcom_raquo_airstream_core_Observer: 1
});
$c_Lcom_raquo_airstream_eventbus_WriteBus.prototype.$classData = $d_Lcom_raquo_airstream_eventbus_WriteBus;
/** @constructor */
function $c_Lcom_raquo_laminar_api_Laminar$svg$(outer) {
  this.Lcom_raquo_laminar_api_Laminar$svg$__f_svg$lzy1 = null;
  this.Lcom_raquo_laminar_api_Laminar$svg$__f_svgbitmap$1 = false;
  this.Lcom_raquo_laminar_api_Laminar$svg$__f_className = null;
  if ((outer === null)) {
    throw $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$ct_jl_NullPointerException__(new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$c_jl_NullPointerException())
  };
  $f_Lcom_raquo_laminar_defs_complex_ComplexSvgKeys__$init$__V(this)
}
$c_Lcom_raquo_laminar_api_Laminar$svg$.prototype = new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$h_O();
$c_Lcom_raquo_laminar_api_Laminar$svg$.prototype.constructor = $c_Lcom_raquo_laminar_api_Laminar$svg$;
/** @constructor */
function $h_Lcom_raquo_laminar_api_Laminar$svg$() {
  /*<skip>*/
}
$h_Lcom_raquo_laminar_api_Laminar$svg$.prototype = $c_Lcom_raquo_laminar_api_Laminar$svg$.prototype;
$c_Lcom_raquo_laminar_api_Laminar$svg$.prototype.svg__Lcom_raquo_laminar_tags_SvgTag = (function() {
  if ((!this.Lcom_raquo_laminar_api_Laminar$svg$__f_svgbitmap$1)) {
    this.Lcom_raquo_laminar_api_Laminar$svg$__f_svg$lzy1 = new $c_Lcom_raquo_laminar_tags_SvgTag("svg", false);
    this.Lcom_raquo_laminar_api_Laminar$svg$__f_svgbitmap$1 = true
  };
  return this.Lcom_raquo_laminar_api_Laminar$svg$__f_svg$lzy1
});
var $d_Lcom_raquo_laminar_api_Laminar$svg$ = new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$TypeData().initClass({
  Lcom_raquo_laminar_api_Laminar$svg$: 0
}, false, "com.raquo.laminar.api.Laminar$svg$", {
  Lcom_raquo_laminar_api_Laminar$svg$: 1,
  O: 1,
  Lcom_raquo_laminar_defs_tags_SvgTags: 1,
  Lcom_raquo_laminar_defs_attrs_SvgAttrs: 1,
  Lcom_raquo_laminar_defs_complex_ComplexSvgKeys: 1
});
$c_Lcom_raquo_laminar_api_Laminar$svg$.prototype.$classData = $d_Lcom_raquo_laminar_api_Laminar$svg$;
/** @constructor */
function $c_Lcom_raquo_laminar_api_package$() {
  this.Lcom_raquo_laminar_api_package$__f_L = null;
  $n_Lcom_raquo_laminar_api_package$ = this;
  this.Lcom_raquo_laminar_api_package$__f_L = new $c_Lcom_raquo_laminar_api_package$$anon$1()
}
$c_Lcom_raquo_laminar_api_package$.prototype = new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$h_O();
$c_Lcom_raquo_laminar_api_package$.prototype.constructor = $c_Lcom_raquo_laminar_api_package$;
/** @constructor */
function $h_Lcom_raquo_laminar_api_package$() {
  /*<skip>*/
}
$h_Lcom_raquo_laminar_api_package$.prototype = $c_Lcom_raquo_laminar_api_package$.prototype;
var $d_Lcom_raquo_laminar_api_package$ = new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$TypeData().initClass({
  Lcom_raquo_laminar_api_package$: 0
}, false, "com.raquo.laminar.api.package$", {
  Lcom_raquo_laminar_api_package$: 1,
  O: 1,
  Lcom_raquo_laminar_Implicits$LowPriorityImplicits: 1,
  Lcom_raquo_laminar_keys_CompositeKey$CompositeValueMappers: 1,
  Lcom_raquo_laminar_Implicits: 1
});
$c_Lcom_raquo_laminar_api_package$.prototype.$classData = $d_Lcom_raquo_laminar_api_package$;
var $n_Lcom_raquo_laminar_api_package$;
function $m_Lcom_raquo_laminar_api_package$() {
  if ((!$n_Lcom_raquo_laminar_api_package$)) {
    $n_Lcom_raquo_laminar_api_package$ = new $c_Lcom_raquo_laminar_api_package$()
  };
  return $n_Lcom_raquo_laminar_api_package$
}
function $ct_Lcom_raquo_laminar_keys_StyleProp__T__sci_Seq__($thiz, name, prefixes) {
  $thiz.Lcom_raquo_laminar_keys_StyleProp__f_name = name;
  $thiz.Lcom_raquo_laminar_keys_StyleProp__f_prefixes = prefixes;
  return $thiz
}
/** @constructor */
function $c_Lcom_raquo_laminar_keys_StyleProp() {
  this.Lcom_raquo_laminar_keys_StyleProp__f_name = null;
  this.Lcom_raquo_laminar_keys_StyleProp__f_prefixes = null
}
$c_Lcom_raquo_laminar_keys_StyleProp.prototype = new $h_Lcom_raquo_laminar_keys_Key();
$c_Lcom_raquo_laminar_keys_StyleProp.prototype.constructor = $c_Lcom_raquo_laminar_keys_StyleProp;
/** @constructor */
function $h_Lcom_raquo_laminar_keys_StyleProp() {
  /*<skip>*/
}
$h_Lcom_raquo_laminar_keys_StyleProp.prototype = $c_Lcom_raquo_laminar_keys_StyleProp.prototype;
$c_Lcom_raquo_laminar_keys_StyleProp.prototype.$colon$eq__O__Lcom_raquo_laminar_modifiers_KeySetter = (function(value) {
  return new $c_Lcom_raquo_laminar_modifiers_KeySetter(this, $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$dp_toString__T(value), new $c_sjsr_AnonFunction3(((element, styleProp, value$2) => {
    var element$1 = element;
    var styleProp$1 = styleProp;
    var value$1 = value$2;
    $m_Lcom_raquo_laminar_DomApi$().setHtmlStringStyle__Lcom_raquo_laminar_nodes_ReactiveHtmlElement__Lcom_raquo_laminar_keys_StyleProp__T__V(element$1, styleProp$1, value$1)
  })))
});
function $isArrayOf_Lcom_raquo_laminar_keys_StyleProp(obj, depth) {
  return (!(!(((obj && obj.$classData) && (obj.$classData.arrayDepth === depth)) && obj.$classData.arrayBase.ancestors.Lcom_raquo_laminar_keys_StyleProp)))
}
var $d_Lcom_raquo_laminar_keys_StyleProp = new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$TypeData().initClass({
  Lcom_raquo_laminar_keys_StyleProp: 0
}, false, "com.raquo.laminar.keys.StyleProp", {
  Lcom_raquo_laminar_keys_StyleProp: 1,
  Lcom_raquo_laminar_keys_Key: 1,
  O: 1,
  Lcom_raquo_laminar_defs_styles_traits_GlobalKeywords: 1,
  Lcom_raquo_laminar_keys_DerivedStyleBuilder: 1
});
$c_Lcom_raquo_laminar_keys_StyleProp.prototype.$classData = $d_Lcom_raquo_laminar_keys_StyleProp;
/** @constructor */
function $c_Lcom_raquo_laminar_nodes_CommentNode(initialText) {
  this.Lcom_raquo_laminar_nodes_CommentNode__f_com$raquo$laminar$nodes$ChildNode$$_maybeParent = null;
  this.Lcom_raquo_laminar_nodes_CommentNode__f_ref = null;
  this.Lcom_raquo_laminar_nodes_CommentNode__f_com$raquo$laminar$nodes$ChildNode$$_maybeParent = $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$m_s_None$();
  this.Lcom_raquo_laminar_nodes_CommentNode__f_ref = $m_Lcom_raquo_laminar_DomApi$().createCommentNode__T__Lorg_scalajs_dom_Comment(initialText)
}
$c_Lcom_raquo_laminar_nodes_CommentNode.prototype = new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$h_O();
$c_Lcom_raquo_laminar_nodes_CommentNode.prototype.constructor = $c_Lcom_raquo_laminar_nodes_CommentNode;
/** @constructor */
function $h_Lcom_raquo_laminar_nodes_CommentNode() {
  /*<skip>*/
}
$h_Lcom_raquo_laminar_nodes_CommentNode.prototype = $c_Lcom_raquo_laminar_nodes_CommentNode.prototype;
$c_Lcom_raquo_laminar_nodes_CommentNode.prototype.com$raquo$laminar$nodes$ChildNode$$_maybeParent__s_Option = (function() {
  return this.Lcom_raquo_laminar_nodes_CommentNode__f_com$raquo$laminar$nodes$ChildNode$$_maybeParent
});
$c_Lcom_raquo_laminar_nodes_CommentNode.prototype.setParent__s_Option__V = (function(maybeNextParent) {
  this.Lcom_raquo_laminar_nodes_CommentNode__f_com$raquo$laminar$nodes$ChildNode$$_maybeParent = maybeNextParent
});
$c_Lcom_raquo_laminar_nodes_CommentNode.prototype.willSetParent__s_Option__V = (function(maybeNextParent) {
  /*<skip>*/
});
$c_Lcom_raquo_laminar_nodes_CommentNode.prototype.apply__Lcom_raquo_laminar_nodes_ReactiveElement__V = (function(parentNode) {
  $m_Lcom_raquo_laminar_nodes_ParentNode$().appendChild__Lcom_raquo_laminar_nodes_ParentNode__Lcom_raquo_laminar_nodes_ChildNode__Z(parentNode, this)
});
$c_Lcom_raquo_laminar_nodes_CommentNode.prototype.ref__Lorg_scalajs_dom_Node = (function() {
  return this.Lcom_raquo_laminar_nodes_CommentNode__f_ref
});
var $d_Lcom_raquo_laminar_nodes_CommentNode = new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$TypeData().initClass({
  Lcom_raquo_laminar_nodes_CommentNode: 0
}, false, "com.raquo.laminar.nodes.CommentNode", {
  Lcom_raquo_laminar_nodes_CommentNode: 1,
  O: 1,
  Lcom_raquo_laminar_nodes_ReactiveNode: 1,
  Lcom_raquo_laminar_modifiers_Modifier: 1,
  Lcom_raquo_laminar_nodes_ChildNode: 1
});
$c_Lcom_raquo_laminar_nodes_CommentNode.prototype.$classData = $d_Lcom_raquo_laminar_nodes_CommentNode;
/** @constructor */
function $c_Lcom_raquo_laminar_nodes_TextNode(initialText) {
  this.Lcom_raquo_laminar_nodes_TextNode__f_com$raquo$laminar$nodes$ChildNode$$_maybeParent = null;
  this.Lcom_raquo_laminar_nodes_TextNode__f_ref = null;
  this.Lcom_raquo_laminar_nodes_TextNode__f_com$raquo$laminar$nodes$ChildNode$$_maybeParent = $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$m_s_None$();
  this.Lcom_raquo_laminar_nodes_TextNode__f_ref = $m_Lcom_raquo_laminar_DomApi$().createTextNode__T__Lorg_scalajs_dom_Text(initialText)
}
$c_Lcom_raquo_laminar_nodes_TextNode.prototype = new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$h_O();
$c_Lcom_raquo_laminar_nodes_TextNode.prototype.constructor = $c_Lcom_raquo_laminar_nodes_TextNode;
/** @constructor */
function $h_Lcom_raquo_laminar_nodes_TextNode() {
  /*<skip>*/
}
$h_Lcom_raquo_laminar_nodes_TextNode.prototype = $c_Lcom_raquo_laminar_nodes_TextNode.prototype;
$c_Lcom_raquo_laminar_nodes_TextNode.prototype.com$raquo$laminar$nodes$ChildNode$$_maybeParent__s_Option = (function() {
  return this.Lcom_raquo_laminar_nodes_TextNode__f_com$raquo$laminar$nodes$ChildNode$$_maybeParent
});
$c_Lcom_raquo_laminar_nodes_TextNode.prototype.setParent__s_Option__V = (function(maybeNextParent) {
  this.Lcom_raquo_laminar_nodes_TextNode__f_com$raquo$laminar$nodes$ChildNode$$_maybeParent = maybeNextParent
});
$c_Lcom_raquo_laminar_nodes_TextNode.prototype.willSetParent__s_Option__V = (function(maybeNextParent) {
  /*<skip>*/
});
$c_Lcom_raquo_laminar_nodes_TextNode.prototype.apply__Lcom_raquo_laminar_nodes_ReactiveElement__V = (function(parentNode) {
  $m_Lcom_raquo_laminar_nodes_ParentNode$().appendChild__Lcom_raquo_laminar_nodes_ParentNode__Lcom_raquo_laminar_nodes_ChildNode__Z(parentNode, this)
});
$c_Lcom_raquo_laminar_nodes_TextNode.prototype.text__T = (function() {
  return this.Lcom_raquo_laminar_nodes_TextNode__f_ref.data
});
$c_Lcom_raquo_laminar_nodes_TextNode.prototype.ref__Lorg_scalajs_dom_Node = (function() {
  return this.Lcom_raquo_laminar_nodes_TextNode__f_ref
});
function $isArrayOf_Lcom_raquo_laminar_nodes_TextNode(obj, depth) {
  return (!(!(((obj && obj.$classData) && (obj.$classData.arrayDepth === depth)) && obj.$classData.arrayBase.ancestors.Lcom_raquo_laminar_nodes_TextNode)))
}
var $d_Lcom_raquo_laminar_nodes_TextNode = new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$TypeData().initClass({
  Lcom_raquo_laminar_nodes_TextNode: 0
}, false, "com.raquo.laminar.nodes.TextNode", {
  Lcom_raquo_laminar_nodes_TextNode: 1,
  O: 1,
  Lcom_raquo_laminar_nodes_ReactiveNode: 1,
  Lcom_raquo_laminar_modifiers_Modifier: 1,
  Lcom_raquo_laminar_nodes_ChildNode: 1
});
$c_Lcom_raquo_laminar_nodes_TextNode.prototype.$classData = $d_Lcom_raquo_laminar_nodes_TextNode;
/** @constructor */
function $c_Ljava_io_OutputStream() {
  /*<skip>*/
}
$c_Ljava_io_OutputStream.prototype = new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$h_O();
$c_Ljava_io_OutputStream.prototype.constructor = $c_Ljava_io_OutputStream;
/** @constructor */
function $h_Ljava_io_OutputStream() {
  /*<skip>*/
}
$h_Ljava_io_OutputStream.prototype = $c_Ljava_io_OutputStream.prototype;
function $isArrayOf_jl_InterruptedException(obj, depth) {
  return (!(!(((obj && obj.$classData) && (obj.$classData.arrayDepth === depth)) && obj.$classData.arrayBase.ancestors.jl_InterruptedException)))
}
function $isArrayOf_jl_LinkageError(obj, depth) {
  return (!(!(((obj && obj.$classData) && (obj.$classData.arrayDepth === depth)) && obj.$classData.arrayBase.ancestors.jl_LinkageError)))
}
function $isArrayOf_jl_ThreadDeath(obj, depth) {
  return (!(!(((obj && obj.$classData) && (obj.$classData.arrayDepth === depth)) && obj.$classData.arrayBase.ancestors.jl_ThreadDeath)))
}
class $c_jl_VirtualMachineError extends $c_jl_Error {
}
function $isArrayOf_jl_VirtualMachineError(obj, depth) {
  return (!(!(((obj && obj.$classData) && (obj.$classData.arrayDepth === depth)) && obj.$classData.arrayBase.ancestors.jl_VirtualMachineError)))
}
class $c_ju_concurrent_ExecutionException extends $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$c_jl_Exception {
  constructor(message, cause) {
    super();
    $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$ct_jl_Throwable__T__jl_Throwable__Z__Z__(this, message, cause, true, true)
  };
}
var $d_ju_concurrent_ExecutionException = new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$TypeData().initClass({
  ju_concurrent_ExecutionException: 0
}, false, "java.util.concurrent.ExecutionException", {
  ju_concurrent_ExecutionException: 1,
  jl_Exception: 1,
  jl_Throwable: 1,
  O: 1,
  Ljava_io_Serializable: 1
});
$c_ju_concurrent_ExecutionException.prototype.$classData = $d_ju_concurrent_ExecutionException;
/** @constructor */
function $c_s_$eq$colon$eq() {
  /*<skip>*/
}
$c_s_$eq$colon$eq.prototype = new $h_s_$less$colon$less();
$c_s_$eq$colon$eq.prototype.constructor = $c_s_$eq$colon$eq;
/** @constructor */
function $h_s_$eq$colon$eq() {
  /*<skip>*/
}
$h_s_$eq$colon$eq.prototype = $c_s_$eq$colon$eq.prototype;
/** @constructor */
function $c_sc_Map$() {
  this.sc_MapFactory$Delegate__f_delegate = null;
  this.sc_Map$__f_DefaultSentinel = null;
  this.sc_Map$__f_scala$collection$Map$$DefaultSentinelFn = null;
  $ct_sc_MapFactory$Delegate__sc_MapFactory__(this, $m_sci_Map$());
  $n_sc_Map$ = this;
  this.sc_Map$__f_DefaultSentinel = $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$ct_O__(new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$c_O());
  this.sc_Map$__f_scala$collection$Map$$DefaultSentinelFn = new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$c_sjsr_AnonFunction0((() => $m_sc_Map$().sc_Map$__f_DefaultSentinel))
}
$c_sc_Map$.prototype = new $h_sc_MapFactory$Delegate();
$c_sc_Map$.prototype.constructor = $c_sc_Map$;
/** @constructor */
function $h_sc_Map$() {
  /*<skip>*/
}
$h_sc_Map$.prototype = $c_sc_Map$.prototype;
var $d_sc_Map$ = new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$TypeData().initClass({
  sc_Map$: 0
}, false, "scala.collection.Map$", {
  sc_Map$: 1,
  sc_MapFactory$Delegate: 1,
  O: 1,
  sc_MapFactory: 1,
  Ljava_io_Serializable: 1
});
$c_sc_Map$.prototype.$classData = $d_sc_Map$;
var $n_sc_Map$;
function $m_sc_Map$() {
  if ((!$n_sc_Map$)) {
    $n_sc_Map$ = new $c_sc_Map$()
  };
  return $n_sc_Map$
}
class $c_s_concurrent_Future$$anon$4 extends $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$c_jl_Throwable {
  constructor() {
    super();
    $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$ct_jl_Throwable__T__jl_Throwable__Z__Z__(this, null, null, true, true)
  };
  fillInStackTrace__jl_Throwable() {
    return $f_s_util_control_NoStackTrace__fillInStackTrace__jl_Throwable(this)
  };
}
var $d_s_concurrent_Future$$anon$4 = new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$TypeData().initClass({
  s_concurrent_Future$$anon$4: 0
}, false, "scala.concurrent.Future$$anon$4", {
  s_concurrent_Future$$anon$4: 1,
  jl_Throwable: 1,
  O: 1,
  Ljava_io_Serializable: 1,
  s_util_control_NoStackTrace: 1
});
$c_s_concurrent_Future$$anon$4.prototype.$classData = $d_s_concurrent_Future$$anon$4;
function $isArrayOf_sr_NonLocalReturnControl(obj, depth) {
  return (!(!(((obj && obj.$classData) && (obj.$classData.arrayDepth === depth)) && obj.$classData.arrayBase.ancestors.sr_NonLocalReturnControl)))
}
/** @constructor */
function $c_sjs_concurrent_QueueExecutionContext$PromisesExecutionContext() {
  this.sjs_concurrent_QueueExecutionContext$PromisesExecutionContext__f_resolvedUnitPromise = null;
  this.sjs_concurrent_QueueExecutionContext$PromisesExecutionContext__f_resolvedUnitPromise = Promise.resolve((void 0))
}
$c_sjs_concurrent_QueueExecutionContext$PromisesExecutionContext.prototype = new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$h_O();
$c_sjs_concurrent_QueueExecutionContext$PromisesExecutionContext.prototype.constructor = $c_sjs_concurrent_QueueExecutionContext$PromisesExecutionContext;
/** @constructor */
function $h_sjs_concurrent_QueueExecutionContext$PromisesExecutionContext() {
  /*<skip>*/
}
$h_sjs_concurrent_QueueExecutionContext$PromisesExecutionContext.prototype = $c_sjs_concurrent_QueueExecutionContext$PromisesExecutionContext.prototype;
$c_sjs_concurrent_QueueExecutionContext$PromisesExecutionContext.prototype.execute__jl_Runnable__V = (function(runnable) {
  this.sjs_concurrent_QueueExecutionContext$PromisesExecutionContext__f_resolvedUnitPromise.then(((arg1$2) => {
    var arg1 = arg1$2;
    return this.scala$scalajs$concurrent$QueueExecutionContext$PromisesExecutionContext$$$anonfun$execute$2__jl_Void__jl_Runnable__sjs_js_$bar(arg1, runnable)
  }))
});
$c_sjs_concurrent_QueueExecutionContext$PromisesExecutionContext.prototype.reportFailure__jl_Throwable__V = (function(t) {
  t.printStackTrace__Ljava_io_PrintStream__V($m_jl_System$Streams$().jl_System$Streams$__f_err)
});
$c_sjs_concurrent_QueueExecutionContext$PromisesExecutionContext.prototype.scala$scalajs$concurrent$QueueExecutionContext$PromisesExecutionContext$$$anonfun$execute$2__jl_Void__jl_Runnable__sjs_js_$bar = (function(x$1, runnable$2) {
  try {
    runnable$2.run__V()
  } catch (e) {
    var e$2 = ((e instanceof $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$c_jl_Throwable) ? e : new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$c_sjs_js_JavaScriptException(e));
    e$2.printStackTrace__Ljava_io_PrintStream__V($m_jl_System$Streams$().jl_System$Streams$__f_err)
  }
});
var $d_sjs_concurrent_QueueExecutionContext$PromisesExecutionContext = new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$TypeData().initClass({
  sjs_concurrent_QueueExecutionContext$PromisesExecutionContext: 0
}, false, "scala.scalajs.concurrent.QueueExecutionContext$PromisesExecutionContext", {
  sjs_concurrent_QueueExecutionContext$PromisesExecutionContext: 1,
  O: 1,
  s_concurrent_ExecutionContextExecutor: 1,
  s_concurrent_ExecutionContext: 1,
  ju_concurrent_Executor: 1
});
$c_sjs_concurrent_QueueExecutionContext$PromisesExecutionContext.prototype.$classData = $d_sjs_concurrent_QueueExecutionContext$PromisesExecutionContext;
/** @constructor */
function $c_sjs_concurrent_QueueExecutionContext$TimeoutsExecutionContext() {
  /*<skip>*/
}
$c_sjs_concurrent_QueueExecutionContext$TimeoutsExecutionContext.prototype = new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$h_O();
$c_sjs_concurrent_QueueExecutionContext$TimeoutsExecutionContext.prototype.constructor = $c_sjs_concurrent_QueueExecutionContext$TimeoutsExecutionContext;
/** @constructor */
function $h_sjs_concurrent_QueueExecutionContext$TimeoutsExecutionContext() {
  /*<skip>*/
}
$h_sjs_concurrent_QueueExecutionContext$TimeoutsExecutionContext.prototype = $c_sjs_concurrent_QueueExecutionContext$TimeoutsExecutionContext.prototype;
$c_sjs_concurrent_QueueExecutionContext$TimeoutsExecutionContext.prototype.execute__jl_Runnable__V = (function(runnable) {
  setTimeout($m_sjs_js_Any$().fromFunction0__F0__sjs_js_Function0(new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$c_sjsr_AnonFunction0((() => {
    try {
      runnable.run__V()
    } catch (e) {
      var e$2 = ((e instanceof $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$c_jl_Throwable) ? e : new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$c_sjs_js_JavaScriptException(e));
      e$2.printStackTrace__Ljava_io_PrintStream__V($m_jl_System$Streams$().jl_System$Streams$__f_err)
    }
  }))), 0)
});
$c_sjs_concurrent_QueueExecutionContext$TimeoutsExecutionContext.prototype.reportFailure__jl_Throwable__V = (function(t) {
  t.printStackTrace__Ljava_io_PrintStream__V($m_jl_System$Streams$().jl_System$Streams$__f_err)
});
var $d_sjs_concurrent_QueueExecutionContext$TimeoutsExecutionContext = new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$TypeData().initClass({
  sjs_concurrent_QueueExecutionContext$TimeoutsExecutionContext: 0
}, false, "scala.scalajs.concurrent.QueueExecutionContext$TimeoutsExecutionContext", {
  sjs_concurrent_QueueExecutionContext$TimeoutsExecutionContext: 1,
  O: 1,
  s_concurrent_ExecutionContextExecutor: 1,
  s_concurrent_ExecutionContext: 1,
  ju_concurrent_Executor: 1
});
$c_sjs_concurrent_QueueExecutionContext$TimeoutsExecutionContext.prototype.$classData = $d_sjs_concurrent_QueueExecutionContext$TimeoutsExecutionContext;
function $isArrayOf_s_util_CommandLineParser$ParseError(obj, depth) {
  return (!(!(((obj && obj.$classData) && (obj.$classData.arrayDepth === depth)) && obj.$classData.arrayBase.ancestors.s_util_CommandLineParser$ParseError)))
}
/** @constructor */
function $c_s_util_Try() {
  /*<skip>*/
}
$c_s_util_Try.prototype = new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$h_O();
$c_s_util_Try.prototype.constructor = $c_s_util_Try;
/** @constructor */
function $h_s_util_Try() {
  /*<skip>*/
}
$h_s_util_Try.prototype = $c_s_util_Try.prototype;
function $isArrayOf_s_util_Try(obj, depth) {
  return (!(!(((obj && obj.$classData) && (obj.$classData.arrayDepth === depth)) && obj.$classData.arrayBase.ancestors.s_util_Try)))
}
function $is_Lcom_raquo_airstream_core_SyncObservable(obj) {
  return (!(!((obj && obj.$classData) && obj.$classData.ancestors.Lcom_raquo_airstream_core_SyncObservable)))
}
function $isArrayOf_Lcom_raquo_airstream_core_SyncObservable(obj, depth) {
  return (!(!(((obj && obj.$classData) && (obj.$classData.arrayDepth === depth)) && obj.$classData.arrayBase.ancestors.Lcom_raquo_airstream_core_SyncObservable)))
}
function $f_Lcom_raquo_airstream_core_WritableObservable__$init$__V($thiz) {
  $thiz.com$raquo$airstream$core$WritableObservable$_setter_$externalObservers_$eq__Lcom_raquo_ew_JsArray__V($m_Lcom_raquo_ew_JsArray$().apply__sci_Seq__Lcom_raquo_ew_JsArray($j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$m_sr_ScalaRunTime$().wrapRefArray__AO__sci_ArraySeq(new ($d_Lcom_raquo_airstream_core_Observer.getArrayOf().constr)([]))));
  $thiz.com$raquo$airstream$core$WritableObservable$_setter_$internalObservers_$eq__Lcom_raquo_ew_JsArray__V($m_Lcom_raquo_ew_JsArray$().apply__sci_Seq__Lcom_raquo_ew_JsArray($j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$m_sr_ScalaRunTime$().wrapRefArray__AO__sci_ArraySeq(new ($d_Lcom_raquo_airstream_core_InternalObserver.getArrayOf().constr)([]))))
}
function $f_Lcom_raquo_airstream_core_WritableObservable__addObserver__Lcom_raquo_airstream_core_Observer__Lcom_raquo_airstream_ownership_Owner__Lcom_raquo_airstream_ownership_Subscription($thiz, observer, owner) {
  var this$1 = $m_Lcom_raquo_airstream_core_Transaction$onStart$();
  this$1.Lcom_raquo_airstream_core_Transaction$onStart$__f_level = ((1 + this$1.Lcom_raquo_airstream_core_Transaction$onStart$__f_level) | 0);
  try {
    $f_Lcom_raquo_airstream_core_BaseObservable__maybeWillStart__V($thiz);
    var subscription = $f_Lcom_raquo_airstream_core_WritableObservable__addExternalObserver__Lcom_raquo_airstream_core_Observer__Lcom_raquo_airstream_ownership_Owner__Lcom_raquo_airstream_ownership_Subscription($thiz, observer, owner);
    $thiz.onAddedExternalObserver__Lcom_raquo_airstream_core_Observer__V(observer);
    $p_Lcom_raquo_airstream_core_WritableObservable__maybeStart__V($thiz);
    var result = subscription
  } finally {
    this$1.Lcom_raquo_airstream_core_Transaction$onStart$__f_level = (((-1) + this$1.Lcom_raquo_airstream_core_Transaction$onStart$__f_level) | 0);
    if ((this$1.Lcom_raquo_airstream_core_Transaction$onStart$__f_level === 0)) {
      $p_Lcom_raquo_airstream_core_Transaction$onStart$__resolve__V(this$1)
    }
  };
  return result
}
function $f_Lcom_raquo_airstream_core_WritableObservable__addExternalObserver__Lcom_raquo_airstream_core_Observer__Lcom_raquo_airstream_ownership_Owner__Lcom_raquo_airstream_ownership_Subscription($thiz, observer, owner) {
  var subscription = new $c_Lcom_raquo_airstream_ownership_Subscription(owner, new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$c_sjsr_AnonFunction0((() => {
    $f_Lcom_raquo_airstream_core_BaseObservable__removeExternalObserver__Lcom_raquo_airstream_core_Observer__V($thiz, observer)
  })));
  var this$ = $thiz.externalObservers__Lcom_raquo_ew_JsArray();
  this$.push(observer);
  return subscription
}
function $f_Lcom_raquo_airstream_core_WritableObservable__addInternalObserver__Lcom_raquo_airstream_core_InternalObserver__Z__V($thiz, observer, shouldCallMaybeWillStart) {
  if (((!$f_Lcom_raquo_airstream_core_BaseObservable__isStarted__Z($thiz)) && shouldCallMaybeWillStart)) {
    $f_Lcom_raquo_airstream_core_BaseObservable__maybeWillStart__V($thiz)
  };
  var this$ = $thiz.internalObservers__Lcom_raquo_ew_JsArray();
  this$.push(observer);
  $p_Lcom_raquo_airstream_core_WritableObservable__maybeStart__V($thiz)
}
function $f_Lcom_raquo_airstream_core_WritableObservable__removeInternalObserverNow__Lcom_raquo_airstream_core_InternalObserver__V($thiz, observer) {
  var removed = $m_Lcom_raquo_airstream_core_ObserverList$().removeObserverNow$extension__Lcom_raquo_ew_JsArray__O__Z($thiz.internalObservers__Lcom_raquo_ew_JsArray(), observer);
  if (removed) {
    $p_Lcom_raquo_airstream_core_WritableObservable__maybeStop__V($thiz)
  }
}
function $f_Lcom_raquo_airstream_core_WritableObservable__removeExternalObserverNow__Lcom_raquo_airstream_core_Observer__V($thiz, observer) {
  var removed = $m_Lcom_raquo_airstream_core_ObserverList$().removeObserverNow$extension__Lcom_raquo_ew_JsArray__O__Z($thiz.externalObservers__Lcom_raquo_ew_JsArray(), observer);
  if (removed) {
    $p_Lcom_raquo_airstream_core_WritableObservable__maybeStop__V($thiz)
  }
}
function $p_Lcom_raquo_airstream_core_WritableObservable__maybeStart__V($thiz) {
  var isStarting = ($f_Lcom_raquo_airstream_core_WritableObservable__numAllObservers__I($thiz) === 1);
  if (isStarting) {
    $thiz.onStart__V()
  }
}
function $p_Lcom_raquo_airstream_core_WritableObservable__maybeStop__V($thiz) {
  if ((!$f_Lcom_raquo_airstream_core_BaseObservable__isStarted__Z($thiz))) {
    $thiz.onStop__V()
  }
}
function $f_Lcom_raquo_airstream_core_WritableObservable__numAllObservers__I($thiz) {
  var this$ = $thiz.externalObservers__Lcom_raquo_ew_JsArray();
  var $$x1 = this$.length;
  var this$$1 = $thiz.internalObservers__Lcom_raquo_ew_JsArray();
  return ((($$x1 | 0) + (this$$1.length | 0)) | 0)
}
function $is_Lcom_raquo_airstream_core_WritableObservable(obj) {
  return (!(!((obj && obj.$classData) && obj.$classData.ancestors.Lcom_raquo_airstream_core_WritableObservable)))
}
function $isArrayOf_Lcom_raquo_airstream_core_WritableObservable(obj, depth) {
  return (!(!(((obj && obj.$classData) && (obj.$classData.arrayDepth === depth)) && obj.$classData.arrayBase.ancestors.Lcom_raquo_airstream_core_WritableObservable)))
}
/** @constructor */
function $c_Lcom_raquo_airstream_custom_CustomSource$$anon$1(outer) {
  this.Lcom_raquo_airstream_custom_CustomSource$$anon$1__f_$outer = null;
  if ((outer === null)) {
    throw $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$ct_jl_NullPointerException__(new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$c_jl_NullPointerException())
  };
  this.Lcom_raquo_airstream_custom_CustomSource$$anon$1__f_$outer = outer
}
$c_Lcom_raquo_airstream_custom_CustomSource$$anon$1.prototype = new $h_sr_AbstractPartialFunction();
$c_Lcom_raquo_airstream_custom_CustomSource$$anon$1.prototype.constructor = $c_Lcom_raquo_airstream_custom_CustomSource$$anon$1;
/** @constructor */
function $h_Lcom_raquo_airstream_custom_CustomSource$$anon$1() {
  /*<skip>*/
}
$h_Lcom_raquo_airstream_custom_CustomSource$$anon$1.prototype = $c_Lcom_raquo_airstream_custom_CustomSource$$anon$1.prototype;
$c_Lcom_raquo_airstream_custom_CustomSource$$anon$1.prototype.isDefinedAt__jl_Throwable__Z = (function(x) {
  return (x !== null)
});
$c_Lcom_raquo_airstream_custom_CustomSource$$anon$1.prototype.applyOrElse__jl_Throwable__F1__O = (function(x, default$1) {
  return ((x !== null) ? (new $c_Lcom_raquo_airstream_core_Transaction(new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$c_sjsr_AnonFunction1(((_$1) => {
    var _$1$1 = _$1;
    var this$2 = this.Lcom_raquo_airstream_custom_CustomSource$$anon$1__f_$outer;
    $f_Lcom_raquo_airstream_core_WritableStream__fireError__jl_Throwable__Lcom_raquo_airstream_core_Transaction__V(this$2, x, _$1$1)
  }))), (void 0)) : default$1.apply__O__O(x))
});
$c_Lcom_raquo_airstream_custom_CustomSource$$anon$1.prototype.isDefinedAt__O__Z = (function(x) {
  return this.isDefinedAt__jl_Throwable__Z(x)
});
$c_Lcom_raquo_airstream_custom_CustomSource$$anon$1.prototype.applyOrElse__O__F1__O = (function(x, default$1) {
  return this.applyOrElse__jl_Throwable__F1__O(x, default$1)
});
var $d_Lcom_raquo_airstream_custom_CustomSource$$anon$1 = new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$TypeData().initClass({
  Lcom_raquo_airstream_custom_CustomSource$$anon$1: 0
}, false, "com.raquo.airstream.custom.CustomSource$$anon$1", {
  Lcom_raquo_airstream_custom_CustomSource$$anon$1: 1,
  sr_AbstractPartialFunction: 1,
  O: 1,
  F1: 1,
  s_PartialFunction: 1,
  Ljava_io_Serializable: 1
});
$c_Lcom_raquo_airstream_custom_CustomSource$$anon$1.prototype.$classData = $d_Lcom_raquo_airstream_custom_CustomSource$$anon$1;
/** @constructor */
function $c_Lcom_raquo_airstream_eventbus_EventBus() {
  this.Lcom_raquo_airstream_eventbus_EventBus__f_maybeDisplayName = null;
  this.Lcom_raquo_airstream_eventbus_EventBus__f_writer = null;
  this.Lcom_raquo_airstream_eventbus_EventBus__f_events = null;
  this.Lcom_raquo_airstream_eventbus_EventBus__f_maybeDisplayName = (void 0);
  this.Lcom_raquo_airstream_eventbus_EventBus__f_writer = new $c_Lcom_raquo_airstream_eventbus_WriteBus();
  this.Lcom_raquo_airstream_eventbus_EventBus__f_events = this.Lcom_raquo_airstream_eventbus_EventBus__f_writer.Lcom_raquo_airstream_eventbus_WriteBus__f_stream
}
$c_Lcom_raquo_airstream_eventbus_EventBus.prototype = new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$h_O();
$c_Lcom_raquo_airstream_eventbus_EventBus.prototype.constructor = $c_Lcom_raquo_airstream_eventbus_EventBus;
/** @constructor */
function $h_Lcom_raquo_airstream_eventbus_EventBus() {
  /*<skip>*/
}
$h_Lcom_raquo_airstream_eventbus_EventBus.prototype = $c_Lcom_raquo_airstream_eventbus_EventBus.prototype;
$c_Lcom_raquo_airstream_eventbus_EventBus.prototype.maybeDisplayName__O = (function() {
  return this.Lcom_raquo_airstream_eventbus_EventBus__f_maybeDisplayName
});
$c_Lcom_raquo_airstream_eventbus_EventBus.prototype.toString__T = (function() {
  return $f_Lcom_raquo_airstream_core_Named__displayName__T(this)
});
$c_Lcom_raquo_airstream_eventbus_EventBus.prototype.toObserver__Lcom_raquo_airstream_core_Observer = (function() {
  return this.Lcom_raquo_airstream_eventbus_EventBus__f_writer
});
$c_Lcom_raquo_airstream_eventbus_EventBus.prototype.toObservable__Lcom_raquo_airstream_core_Observable = (function() {
  return this.Lcom_raquo_airstream_eventbus_EventBus__f_events
});
var $d_Lcom_raquo_airstream_eventbus_EventBus = new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$TypeData().initClass({
  Lcom_raquo_airstream_eventbus_EventBus: 0
}, false, "com.raquo.airstream.eventbus.EventBus", {
  Lcom_raquo_airstream_eventbus_EventBus: 1,
  O: 1,
  Lcom_raquo_airstream_core_Source: 1,
  Lcom_raquo_airstream_core_Source$EventSource: 1,
  Lcom_raquo_airstream_core_Sink: 1,
  Lcom_raquo_airstream_core_Named: 1
});
$c_Lcom_raquo_airstream_eventbus_EventBus.prototype.$classData = $d_Lcom_raquo_airstream_eventbus_EventBus;
function $f_Lcom_raquo_airstream_state_Var__$init$__V($thiz) {
  $thiz.Lcom_raquo_airstream_state_SourceVar__f_writer = $m_Lcom_raquo_airstream_core_Observer$().fromTry__s_PartialFunction__Z__Lcom_raquo_airstream_core_Observer(new $c_Lcom_raquo_airstream_state_Var$$anon$1($thiz), ($m_Lcom_raquo_airstream_core_Observer$(), true))
}
function $f_Lcom_raquo_airstream_state_Var__updater__F2__Lcom_raquo_airstream_core_Observer($thiz, mod) {
  return $m_Lcom_raquo_airstream_core_Observer$().fromTry__s_PartialFunction__Z__Lcom_raquo_airstream_core_Observer(new $c_Lcom_raquo_airstream_state_Var$$anon$2(mod, $thiz), ($m_Lcom_raquo_airstream_core_Observer$(), true))
}
/** @constructor */
function $c_Lcom_raquo_airstream_state_Var$$anon$1(outer) {
  this.Lcom_raquo_airstream_state_Var$$anon$1__f_$outer = null;
  if ((outer === null)) {
    throw $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$ct_jl_NullPointerException__(new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$c_jl_NullPointerException())
  };
  this.Lcom_raquo_airstream_state_Var$$anon$1__f_$outer = outer
}
$c_Lcom_raquo_airstream_state_Var$$anon$1.prototype = new $h_sr_AbstractPartialFunction();
$c_Lcom_raquo_airstream_state_Var$$anon$1.prototype.constructor = $c_Lcom_raquo_airstream_state_Var$$anon$1;
/** @constructor */
function $h_Lcom_raquo_airstream_state_Var$$anon$1() {
  /*<skip>*/
}
$h_Lcom_raquo_airstream_state_Var$$anon$1.prototype = $c_Lcom_raquo_airstream_state_Var$$anon$1.prototype;
$c_Lcom_raquo_airstream_state_Var$$anon$1.prototype.isDefinedAt__s_util_Try__Z = (function(x) {
  return true
});
$c_Lcom_raquo_airstream_state_Var$$anon$1.prototype.applyOrElse__s_util_Try__F1__O = (function(x, default$1) {
  new $c_Lcom_raquo_airstream_core_Transaction(new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$c_sjsr_AnonFunction1(((_$1) => {
    var _$1$1 = _$1;
    this.Lcom_raquo_airstream_state_Var$$anon$1__f_$outer.setCurrentValue__s_util_Try__Lcom_raquo_airstream_core_Transaction__V(x, _$1$1)
  })))
});
$c_Lcom_raquo_airstream_state_Var$$anon$1.prototype.isDefinedAt__O__Z = (function(x) {
  return this.isDefinedAt__s_util_Try__Z(x)
});
$c_Lcom_raquo_airstream_state_Var$$anon$1.prototype.applyOrElse__O__F1__O = (function(x, default$1) {
  return this.applyOrElse__s_util_Try__F1__O(x, default$1)
});
var $d_Lcom_raquo_airstream_state_Var$$anon$1 = new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$TypeData().initClass({
  Lcom_raquo_airstream_state_Var$$anon$1: 0
}, false, "com.raquo.airstream.state.Var$$anon$1", {
  Lcom_raquo_airstream_state_Var$$anon$1: 1,
  sr_AbstractPartialFunction: 1,
  O: 1,
  F1: 1,
  s_PartialFunction: 1,
  Ljava_io_Serializable: 1
});
$c_Lcom_raquo_airstream_state_Var$$anon$1.prototype.$classData = $d_Lcom_raquo_airstream_state_Var$$anon$1;
/** @constructor */
function $c_Lcom_raquo_airstream_state_Var$$anon$2(mod$6, outer) {
  this.Lcom_raquo_airstream_state_Var$$anon$2__f_mod$1 = null;
  this.Lcom_raquo_airstream_state_Var$$anon$2__f_$outer = null;
  this.Lcom_raquo_airstream_state_Var$$anon$2__f_mod$1 = mod$6;
  if ((outer === null)) {
    throw $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$ct_jl_NullPointerException__(new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$c_jl_NullPointerException())
  };
  this.Lcom_raquo_airstream_state_Var$$anon$2__f_$outer = outer
}
$c_Lcom_raquo_airstream_state_Var$$anon$2.prototype = new $h_sr_AbstractPartialFunction();
$c_Lcom_raquo_airstream_state_Var$$anon$2.prototype.constructor = $c_Lcom_raquo_airstream_state_Var$$anon$2;
/** @constructor */
function $h_Lcom_raquo_airstream_state_Var$$anon$2() {
  /*<skip>*/
}
$h_Lcom_raquo_airstream_state_Var$$anon$2.prototype = $c_Lcom_raquo_airstream_state_Var$$anon$2.prototype;
$c_Lcom_raquo_airstream_state_Var$$anon$2.prototype.isDefinedAt__s_util_Try__Z = (function(x) {
  return true
});
$c_Lcom_raquo_airstream_state_Var$$anon$2.prototype.applyOrElse__s_util_Try__F1__O = (function(x, default$1) {
  new $c_Lcom_raquo_airstream_core_Transaction(new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$c_sjsr_AnonFunction1(((trx) => {
    var trx$1 = trx;
    matchResult5: {
      if ((x instanceof $c_s_util_Success)) {
        var nextInput = x.s_util_Success__f_value;
        matchResult4: {
          var this$2 = this.Lcom_raquo_airstream_state_Var$$anon$2__f_$outer;
          var x4 = this$2.Lcom_raquo_airstream_state_SourceVar__f_signal.tryNow__s_util_Try();
          if ((x4 instanceof $c_s_util_Success)) {
            var currentValue = x4.s_util_Success__f_value;
            try {
              var nextValue = new $c_s_util_Success(this.Lcom_raquo_airstream_state_Var$$anon$2__f_mod$1.apply__O__O__O(currentValue, nextInput))
            } catch (e) {
              var e$2 = ((e instanceof $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$c_jl_Throwable) ? e : new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$c_sjs_js_JavaScriptException(e));
              matchEnd8: {
                var nextValue;
                var o11 = $m_s_util_control_NonFatal$().unapply__jl_Throwable__s_Option(e$2);
                if ((!o11.isEmpty__Z())) {
                  var e$3 = o11.get__O();
                  var nextValue = new $c_s_util_Failure(e$3);
                  break matchEnd8
                };
                throw ((e$2 instanceof $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$c_sjs_js_JavaScriptException) ? e$2.sjs_js_JavaScriptException__f_exception : e$2)
              }
            };
            this.Lcom_raquo_airstream_state_Var$$anon$2__f_$outer.setCurrentValue__s_util_Try__Lcom_raquo_airstream_core_Transaction__V(nextValue, trx$1);
            break matchResult4
          };
          if ((x4 instanceof $c_s_util_Failure)) {
            var err = x4.s_util_Failure__f_exception;
            var $$x1 = $m_Lcom_raquo_airstream_core_AirstreamError$();
            var cause = new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$c_s_Some(err);
            $$x1.sendUnhandledError__jl_Throwable__V(new $c_Lcom_raquo_airstream_core_AirstreamError$VarError("Unable to update a failed Var. Consider Var#tryUpdater instead.", cause));
            break matchResult4
          };
          throw new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$c_s_MatchError(x4)
        };
        break matchResult5
      };
      if ((x instanceof $c_s_util_Failure)) {
        var err$2 = x.s_util_Failure__f_exception;
        this.Lcom_raquo_airstream_state_Var$$anon$2__f_$outer.setCurrentValue__s_util_Try__Lcom_raquo_airstream_core_Transaction__V(new $c_s_util_Failure(err$2), trx$1);
        break matchResult5
      };
      throw new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$c_s_MatchError(x)
    }
  })))
});
$c_Lcom_raquo_airstream_state_Var$$anon$2.prototype.isDefinedAt__O__Z = (function(x) {
  return this.isDefinedAt__s_util_Try__Z(x)
});
$c_Lcom_raquo_airstream_state_Var$$anon$2.prototype.applyOrElse__O__F1__O = (function(x, default$1) {
  return this.applyOrElse__s_util_Try__F1__O(x, default$1)
});
var $d_Lcom_raquo_airstream_state_Var$$anon$2 = new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$TypeData().initClass({
  Lcom_raquo_airstream_state_Var$$anon$2: 0
}, false, "com.raquo.airstream.state.Var$$anon$2", {
  Lcom_raquo_airstream_state_Var$$anon$2: 1,
  sr_AbstractPartialFunction: 1,
  O: 1,
  F1: 1,
  s_PartialFunction: 1,
  Ljava_io_Serializable: 1
});
$c_Lcom_raquo_airstream_state_Var$$anon$2.prototype.$classData = $d_Lcom_raquo_airstream_state_Var$$anon$2;
function $f_Lcom_raquo_laminar_nodes_ReactiveElement__$init$__V($thiz) {
  $thiz.Lcom_raquo_laminar_nodes_ReactiveHtmlElement__f_com$raquo$laminar$nodes$ReactiveElement$$pilotSubscription = new $c_Lcom_raquo_airstream_ownership_TransferableSubscription(new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$c_sjsr_AnonFunction0((() => {
    $thiz.Lcom_raquo_laminar_nodes_ReactiveHtmlElement__f_dynamicOwner.activate__V()
  })), new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$c_sjsr_AnonFunction0((() => {
    $thiz.Lcom_raquo_laminar_nodes_ReactiveHtmlElement__f_dynamicOwner.deactivate__V()
  })));
  $thiz.Lcom_raquo_laminar_nodes_ReactiveHtmlElement__f_com$raquo$laminar$nodes$ReactiveElement$$maybeEventListeners = (void 0)
}
function $f_Lcom_raquo_laminar_nodes_ReactiveElement__addEventListener__Lcom_raquo_laminar_modifiers_EventListener__Z__V($thiz, listener, unsafePrepend) {
  var x = $thiz.Lcom_raquo_laminar_nodes_ReactiveHtmlElement__f_com$raquo$laminar$nodes$ReactiveElement$$maybeEventListeners;
  if ((x === (void 0))) {
    $thiz.Lcom_raquo_laminar_nodes_ReactiveHtmlElement__f_com$raquo$laminar$nodes$ReactiveElement$$maybeEventListeners = $m_Lcom_raquo_ew_JsArray$().apply__sci_Seq__Lcom_raquo_ew_JsArray($j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$m_sr_ScalaRunTime$().wrapRefArray__AO__sci_ArraySeq(new ($d_Lcom_raquo_laminar_modifiers_EventListener.getArrayOf().constr)([listener])))
  } else if (unsafePrepend) {
    var x$1 = $thiz.Lcom_raquo_laminar_nodes_ReactiveHtmlElement__f_com$raquo$laminar$nodes$ReactiveElement$$maybeEventListeners;
    if ((x$1 === (void 0))) {
      var $$x1;
      throw $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$ct_ju_NoSuchElementException__T__(new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$c_ju_NoSuchElementException(), "undefined.get")
    } else {
      var $$x1 = x$1
    };
    $$x1.unshift(listener)
  } else {
    var x$2 = $thiz.Lcom_raquo_laminar_nodes_ReactiveHtmlElement__f_com$raquo$laminar$nodes$ReactiveElement$$maybeEventListeners;
    if ((x$2 === (void 0))) {
      var $$x2;
      throw $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$ct_ju_NoSuchElementException__T__(new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$c_ju_NoSuchElementException(), "undefined.get")
    } else {
      var $$x2 = x$2
    };
    $$x2.push(listener)
  }
}
function $f_Lcom_raquo_laminar_nodes_ReactiveElement__removeEventListener__I__V($thiz, index) {
  var x = $thiz.Lcom_raquo_laminar_nodes_ReactiveHtmlElement__f_com$raquo$laminar$nodes$ReactiveElement$$maybeEventListeners;
  if ((x !== (void 0))) {
    x.splice(index, 1)
  }
}
function $f_Lcom_raquo_laminar_nodes_ReactiveElement__indexOfEventListener__Lcom_raquo_laminar_modifiers_EventListener__I($thiz, listener) {
  var x = $thiz.Lcom_raquo_laminar_nodes_ReactiveHtmlElement__f_com$raquo$laminar$nodes$ReactiveElement$$maybeEventListeners;
  if ((x === (void 0))) {
    return (-1)
  } else {
    var found = false;
    var ix = 0;
    while (((!found) && (ix < (x.length | 0)))) {
      var x$1 = x[ix];
      if (((x$1 === null) ? (listener === null) : $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$dp_equals__O__Z(x$1, listener))) {
        found = true
      } else {
        ix = ((1 + ix) | 0)
      }
    };
    return (found ? ix : (-1))
  }
}
function $f_Lcom_raquo_laminar_nodes_ReactiveElement__amend__sci_Seq__Lcom_raquo_laminar_nodes_ReactiveElement($thiz, mods) {
  var this$1 = $m_Lcom_raquo_airstream_core_Transaction$onStart$();
  this$1.Lcom_raquo_airstream_core_Transaction$onStart$__f_level = ((1 + this$1.Lcom_raquo_airstream_core_Transaction$onStart$__f_level) | 0);
  try {
    mods.foreach__F1__V(new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$c_sjsr_AnonFunction1(((mod) => {
      var mod$1 = mod;
      mod$1.apply__Lcom_raquo_laminar_nodes_ReactiveElement__V($thiz)
    })));
    var result = $thiz
  } finally {
    this$1.Lcom_raquo_airstream_core_Transaction$onStart$__f_level = (((-1) + this$1.Lcom_raquo_airstream_core_Transaction$onStart$__f_level) | 0);
    if ((this$1.Lcom_raquo_airstream_core_Transaction$onStart$__f_level === 0)) {
      $p_Lcom_raquo_airstream_core_Transaction$onStart$__resolve__V(this$1)
    }
  };
  return result
}
function $f_Lcom_raquo_laminar_nodes_ReactiveElement__willSetParent__s_Option__V($thiz, maybeNextParent) {
  if ($p_Lcom_raquo_laminar_nodes_ReactiveElement__isUnmounting__s_Option__s_Option__Z($thiz, $thiz.Lcom_raquo_laminar_nodes_ReactiveHtmlElement__f_com$raquo$laminar$nodes$ChildNode$$_maybeParent, maybeNextParent)) {
    $p_Lcom_raquo_laminar_nodes_ReactiveElement__setPilotSubscriptionOwner__s_Option__V($thiz, maybeNextParent)
  }
}
function $f_Lcom_raquo_laminar_nodes_ReactiveElement__setParent__s_Option__V($thiz, maybeNextParent) {
  var maybePrevParent = $thiz.Lcom_raquo_laminar_nodes_ReactiveHtmlElement__f_com$raquo$laminar$nodes$ChildNode$$_maybeParent;
  $thiz.Lcom_raquo_laminar_nodes_ReactiveHtmlElement__f_com$raquo$laminar$nodes$ChildNode$$_maybeParent = maybeNextParent;
  if ((!$p_Lcom_raquo_laminar_nodes_ReactiveElement__isUnmounting__s_Option__s_Option__Z($thiz, maybePrevParent, maybeNextParent))) {
    $p_Lcom_raquo_laminar_nodes_ReactiveElement__setPilotSubscriptionOwner__s_Option__V($thiz, maybeNextParent)
  }
}
function $p_Lcom_raquo_laminar_nodes_ReactiveElement__isUnmounting__s_Option__s_Option__Z($thiz, maybePrevParent, maybeNextParent) {
  if ((!maybePrevParent.isEmpty__Z())) {
    var arg1 = maybePrevParent.get__O();
    var _$4 = arg1;
    var this$1 = _$4.dynamicOwner__Lcom_raquo_airstream_ownership_DynamicOwner();
    var this$2 = this$1.Lcom_raquo_airstream_ownership_DynamicOwner__f__maybeCurrentOwner;
    var isPrevParentActive = (!this$2.isEmpty__Z())
  } else {
    var isPrevParentActive = false
  };
  if ((!maybeNextParent.isEmpty__Z())) {
    var arg1$1 = maybeNextParent.get__O();
    var _$5 = arg1$1;
    var this$3 = _$5.dynamicOwner__Lcom_raquo_airstream_ownership_DynamicOwner();
    var this$4 = this$3.Lcom_raquo_airstream_ownership_DynamicOwner__f__maybeCurrentOwner;
    var isNextParentActive = (!this$4.isEmpty__Z())
  } else {
    var isNextParentActive = false
  };
  return (isPrevParentActive && (!isNextParentActive))
}
function $p_Lcom_raquo_laminar_nodes_ReactiveElement__setPilotSubscriptionOwner__s_Option__V($thiz, maybeNextParent) {
  if (maybeNextParent.isEmpty__Z()) {
    var maybeNextOwner = $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$m_s_None$()
  } else {
    var arg1 = maybeNextParent.get__O();
    var _$6 = arg1;
    var maybeNextOwner = new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$c_s_Some(_$6.dynamicOwner__Lcom_raquo_airstream_ownership_DynamicOwner())
  };
  $f_Lcom_raquo_laminar_nodes_ReactiveElement__unsafeSetPilotSubscriptionOwner__s_Option__V($thiz, maybeNextOwner)
}
function $f_Lcom_raquo_laminar_nodes_ReactiveElement__unsafeSetPilotSubscriptionOwner__s_Option__V($thiz, maybeNextOwner) {
  if (maybeNextOwner.isEmpty__Z()) {
    $thiz.Lcom_raquo_laminar_nodes_ReactiveHtmlElement__f_com$raquo$laminar$nodes$ReactiveElement$$pilotSubscription.clearOwner__V()
  } else {
    var arg1 = maybeNextOwner.get__O();
    var nextOwner = arg1;
    $thiz.Lcom_raquo_laminar_nodes_ReactiveHtmlElement__f_com$raquo$laminar$nodes$ReactiveElement$$pilotSubscription.setOwner__Lcom_raquo_airstream_ownership_DynamicOwner__V(nextOwner)
  }
}
function $is_Lcom_raquo_laminar_nodes_ReactiveElement(obj) {
  return (!(!((obj && obj.$classData) && obj.$classData.ancestors.Lcom_raquo_laminar_nodes_ReactiveElement)))
}
function $isArrayOf_Lcom_raquo_laminar_nodes_ReactiveElement(obj, depth) {
  return (!(!(((obj && obj.$classData) && (obj.$classData.arrayDepth === depth)) && obj.$classData.arrayBase.ancestors.Lcom_raquo_laminar_nodes_ReactiveElement)))
}
function $ct_Ljava_io_FilterOutputStream__Ljava_io_OutputStream__($thiz, out) {
  return $thiz
}
/** @constructor */
function $c_Ljava_io_FilterOutputStream() {
  /*<skip>*/
}
$c_Ljava_io_FilterOutputStream.prototype = new $h_Ljava_io_OutputStream();
$c_Ljava_io_FilterOutputStream.prototype.constructor = $c_Ljava_io_FilterOutputStream;
/** @constructor */
function $h_Ljava_io_FilterOutputStream() {
  /*<skip>*/
}
$h_Ljava_io_FilterOutputStream.prototype = $c_Ljava_io_FilterOutputStream.prototype;
function $isArrayOf_jl_ClassCastException(obj, depth) {
  return (!(!(((obj && obj.$classData) && (obj.$classData.arrayDepth === depth)) && obj.$classData.arrayBase.ancestors.jl_ClassCastException)))
}
/** @constructor */
function $c_jl_JSConsoleBasedPrintStream$DummyOutputStream() {
  /*<skip>*/
}
$c_jl_JSConsoleBasedPrintStream$DummyOutputStream.prototype = new $h_Ljava_io_OutputStream();
$c_jl_JSConsoleBasedPrintStream$DummyOutputStream.prototype.constructor = $c_jl_JSConsoleBasedPrintStream$DummyOutputStream;
/** @constructor */
function $h_jl_JSConsoleBasedPrintStream$DummyOutputStream() {
  /*<skip>*/
}
$h_jl_JSConsoleBasedPrintStream$DummyOutputStream.prototype = $c_jl_JSConsoleBasedPrintStream$DummyOutputStream.prototype;
var $d_jl_JSConsoleBasedPrintStream$DummyOutputStream = new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$TypeData().initClass({
  jl_JSConsoleBasedPrintStream$DummyOutputStream: 0
}, false, "java.lang.JSConsoleBasedPrintStream$DummyOutputStream", {
  jl_JSConsoleBasedPrintStream$DummyOutputStream: 1,
  Ljava_io_OutputStream: 1,
  O: 1,
  Ljava_io_Closeable: 1,
  jl_AutoCloseable: 1,
  Ljava_io_Flushable: 1
});
$c_jl_JSConsoleBasedPrintStream$DummyOutputStream.prototype.$classData = $d_jl_JSConsoleBasedPrintStream$DummyOutputStream;
class $c_jl_StackOverflowError extends $c_jl_VirtualMachineError {
  constructor(s) {
    super();
    $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$ct_jl_Throwable__T__jl_Throwable__Z__Z__(this, s, null, true, true)
  };
}
var $d_jl_StackOverflowError = new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$TypeData().initClass({
  jl_StackOverflowError: 0
}, false, "java.lang.StackOverflowError", {
  jl_StackOverflowError: 1,
  jl_VirtualMachineError: 1,
  jl_Error: 1,
  jl_Throwable: 1,
  O: 1,
  Ljava_io_Serializable: 1
});
$c_jl_StackOverflowError.prototype.$classData = $d_jl_StackOverflowError;
/** @constructor */
function $c_s_$less$colon$less$$anon$1() {
  /*<skip>*/
}
$c_s_$less$colon$less$$anon$1.prototype = new $h_s_$eq$colon$eq();
$c_s_$less$colon$less$$anon$1.prototype.constructor = $c_s_$less$colon$less$$anon$1;
/** @constructor */
function $h_s_$less$colon$less$$anon$1() {
  /*<skip>*/
}
$h_s_$less$colon$less$$anon$1.prototype = $c_s_$less$colon$less$$anon$1.prototype;
$c_s_$less$colon$less$$anon$1.prototype.apply__O__O = (function(x) {
  return x
});
$c_s_$less$colon$less$$anon$1.prototype.toString__T = (function() {
  return "generalized constraint"
});
var $d_s_$less$colon$less$$anon$1 = new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$TypeData().initClass({
  s_$less$colon$less$$anon$1: 0
}, false, "scala.$less$colon$less$$anon$1", {
  s_$less$colon$less$$anon$1: 1,
  s_$eq$colon$eq: 1,
  s_$less$colon$less: 1,
  O: 1,
  F1: 1,
  Ljava_io_Serializable: 1
});
$c_s_$less$colon$less$$anon$1.prototype.$classData = $d_s_$less$colon$less$$anon$1;
/** @constructor */
function $c_s_Product$$anon$1(outer) {
  this.s_Product$$anon$1__f_c = 0;
  this.s_Product$$anon$1__f_cmax = 0;
  this.s_Product$$anon$1__f_$outer = null;
  if ((outer === null)) {
    throw null
  } else {
    this.s_Product$$anon$1__f_$outer = outer
  };
  this.s_Product$$anon$1__f_c = 0;
  this.s_Product$$anon$1__f_cmax = outer.productArity__I()
}
$c_s_Product$$anon$1.prototype = new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$h_sc_AbstractIterator();
$c_s_Product$$anon$1.prototype.constructor = $c_s_Product$$anon$1;
/** @constructor */
function $h_s_Product$$anon$1() {
  /*<skip>*/
}
$h_s_Product$$anon$1.prototype = $c_s_Product$$anon$1.prototype;
$c_s_Product$$anon$1.prototype.hasNext__Z = (function() {
  return (this.s_Product$$anon$1__f_c < this.s_Product$$anon$1__f_cmax)
});
$c_s_Product$$anon$1.prototype.next__O = (function() {
  var result = this.s_Product$$anon$1__f_$outer.productElement__I__O(this.s_Product$$anon$1__f_c);
  this.s_Product$$anon$1__f_c = ((1 + this.s_Product$$anon$1__f_c) | 0);
  return result
});
var $d_s_Product$$anon$1 = new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$TypeData().initClass({
  s_Product$$anon$1: 0
}, false, "scala.Product$$anon$1", {
  s_Product$$anon$1: 1,
  sc_AbstractIterator: 1,
  O: 1,
  sc_Iterator: 1,
  sc_IterableOnce: 1,
  sc_IterableOnceOps: 1
});
$c_s_Product$$anon$1.prototype.$classData = $d_s_Product$$anon$1;
function $p_sci_HashMapBuilder__isAliased__Z($thiz) {
  return ($thiz.sci_HashMapBuilder__f_aliased !== null)
}
function $p_sci_HashMapBuilder__insertElement__AI__I__I__AI($thiz, as, ix, elem) {
  if ((ix < 0)) {
    throw $ct_jl_ArrayIndexOutOfBoundsException__(new $c_jl_ArrayIndexOutOfBoundsException())
  };
  if ((ix > as.u.length)) {
    throw $ct_jl_ArrayIndexOutOfBoundsException__(new $c_jl_ArrayIndexOutOfBoundsException())
  };
  var result = new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$ac_I(((1 + as.u.length) | 0));
  as.copyTo(0, result, 0, ix);
  result.u[ix] = elem;
  var destPos = ((1 + ix) | 0);
  var length = ((as.u.length - ix) | 0);
  as.copyTo(ix, result, destPos, length);
  return result
}
function $p_sci_HashMapBuilder__insertValue__sci_BitmapIndexedMapNode__I__O__I__I__O__V($thiz, bm, bitpos, key, originalHash, keyHash, value) {
  var dataIx = bm.dataIndex__I__I(bitpos);
  var idx = (dataIx << 1);
  var src = bm.sci_BitmapIndexedMapNode__f_content;
  var dst = new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$ac_O(((2 + src.u.length) | 0));
  src.copyTo(0, dst, 0, idx);
  dst.u[idx] = key;
  dst.u[((1 + idx) | 0)] = value;
  var destPos = ((2 + idx) | 0);
  var length = ((src.u.length - idx) | 0);
  src.copyTo(idx, dst, destPos, length);
  var dstHashes = $p_sci_HashMapBuilder__insertElement__AI__I__I__AI($thiz, bm.sci_BitmapIndexedMapNode__f_originalHashes, dataIx, originalHash);
  bm.sci_BitmapIndexedMapNode__f_dataMap = (bm.sci_BitmapIndexedMapNode__f_dataMap | bitpos);
  bm.sci_BitmapIndexedMapNode__f_content = dst;
  bm.sci_BitmapIndexedMapNode__f_originalHashes = dstHashes;
  bm.sci_BitmapIndexedMapNode__f_size = ((1 + bm.sci_BitmapIndexedMapNode__f_size) | 0);
  bm.sci_BitmapIndexedMapNode__f_cachedJavaKeySetHashCode = ((bm.sci_BitmapIndexedMapNode__f_cachedJavaKeySetHashCode + keyHash) | 0)
}
function $p_sci_HashMapBuilder__ensureUnaliased__V($thiz) {
  if ($p_sci_HashMapBuilder__isAliased__Z($thiz)) {
    $p_sci_HashMapBuilder__copyElems__V($thiz)
  };
  $thiz.sci_HashMapBuilder__f_aliased = null
}
function $p_sci_HashMapBuilder__copyElems__V($thiz) {
  $thiz.sci_HashMapBuilder__f_scala$collection$immutable$HashMapBuilder$$rootNode = $thiz.sci_HashMapBuilder__f_scala$collection$immutable$HashMapBuilder$$rootNode.copy__sci_BitmapIndexedMapNode()
}
/** @constructor */
function $c_sci_HashMapBuilder() {
  this.sci_HashMapBuilder__f_aliased = null;
  this.sci_HashMapBuilder__f_scala$collection$immutable$HashMapBuilder$$rootNode = null;
  this.sci_HashMapBuilder__f_scala$collection$immutable$HashMapBuilder$$rootNode = new $c_sci_BitmapIndexedMapNode(0, 0, $m_s_Array$EmptyArrays$().s_Array$EmptyArrays$__f_emptyObjectArray, $m_s_Array$EmptyArrays$().s_Array$EmptyArrays$__f_emptyIntArray, 0, 0)
}
$c_sci_HashMapBuilder.prototype = new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$h_O();
$c_sci_HashMapBuilder.prototype.constructor = $c_sci_HashMapBuilder;
/** @constructor */
function $h_sci_HashMapBuilder() {
  /*<skip>*/
}
$h_sci_HashMapBuilder.prototype = $c_sci_HashMapBuilder.prototype;
$c_sci_HashMapBuilder.prototype.sizeHint__I__V = (function(size) {
  /*<skip>*/
});
$c_sci_HashMapBuilder.prototype.update__sci_MapNode__O__O__I__I__I__V = (function(mapNode, key, value, originalHash, keyHash, shift) {
  if ((mapNode instanceof $c_sci_BitmapIndexedMapNode)) {
    var x2 = mapNode;
    var mask = $m_sci_Node$().maskFrom__I__I__I(keyHash, shift);
    var bitpos = $m_sci_Node$().bitposFrom__I__I(mask);
    if (((x2.sci_BitmapIndexedMapNode__f_dataMap & bitpos) !== 0)) {
      var index = $m_sci_Node$().indexFrom__I__I__I__I(x2.sci_BitmapIndexedMapNode__f_dataMap, mask, bitpos);
      var key0 = x2.getKey__I__O(index);
      var key0UnimprovedHash = x2.getHash__I__I(index);
      if (((key0UnimprovedHash === originalHash) && $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$m_sr_BoxesRunTime$().equals__O__O__Z(key0, key))) {
        x2.sci_BitmapIndexedMapNode__f_content.u[((1 + (index << 1)) | 0)] = value
      } else {
        var value0 = x2.getValue__I__O(index);
        var key0Hash = $m_sc_Hashing$().improve__I__I(key0UnimprovedHash);
        var subNodeNew = x2.mergeTwoKeyValPairs__O__O__I__I__O__O__I__I__I__sci_MapNode(key0, value0, key0UnimprovedHash, key0Hash, key, value, originalHash, keyHash, ((5 + shift) | 0));
        x2.migrateFromInlineToNodeInPlace__I__I__sci_MapNode__sci_BitmapIndexedMapNode(bitpos, key0Hash, subNodeNew)
      }
    } else if (((x2.sci_BitmapIndexedMapNode__f_nodeMap & bitpos) !== 0)) {
      var index$2 = $m_sci_Node$().indexFrom__I__I__I__I(x2.sci_BitmapIndexedMapNode__f_nodeMap, mask, bitpos);
      var subNode = x2.getNode__I__sci_MapNode(index$2);
      var beforeSize = subNode.size__I();
      var beforeHash = subNode.cachedJavaKeySetHashCode__I();
      this.update__sci_MapNode__O__O__I__I__I__V(subNode, key, value, originalHash, keyHash, ((5 + shift) | 0));
      x2.sci_BitmapIndexedMapNode__f_size = ((x2.sci_BitmapIndexedMapNode__f_size + ((subNode.size__I() - beforeSize) | 0)) | 0);
      x2.sci_BitmapIndexedMapNode__f_cachedJavaKeySetHashCode = ((x2.sci_BitmapIndexedMapNode__f_cachedJavaKeySetHashCode + ((subNode.cachedJavaKeySetHashCode__I() - beforeHash) | 0)) | 0)
    } else {
      $p_sci_HashMapBuilder__insertValue__sci_BitmapIndexedMapNode__I__O__I__I__O__V(this, x2, bitpos, key, originalHash, keyHash, value)
    }
  } else if ((mapNode instanceof $c_sci_HashCollisionMapNode)) {
    var x3 = mapNode;
    var index$3 = x3.indexOf__O__I(key);
    if ((index$3 < 0)) {
      x3.sci_HashCollisionMapNode__f_content = x3.sci_HashCollisionMapNode__f_content.appended__O__sci_Vector(new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$c_T2(key, value))
    } else {
      x3.sci_HashCollisionMapNode__f_content = x3.sci_HashCollisionMapNode__f_content.updated__I__O__sci_Vector(index$3, new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$c_T2(key, value))
    }
  } else {
    throw new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$c_s_MatchError(mapNode)
  }
});
$c_sci_HashMapBuilder.prototype.result__sci_HashMap = (function() {
  if ((this.sci_HashMapBuilder__f_scala$collection$immutable$HashMapBuilder$$rootNode.sci_BitmapIndexedMapNode__f_size === 0)) {
    var this$1 = $m_sci_HashMap$();
    return this$1.sci_HashMap$__f_EmptyMap
  } else if ((this.sci_HashMapBuilder__f_aliased !== null)) {
    return this.sci_HashMapBuilder__f_aliased
  } else {
    this.sci_HashMapBuilder__f_aliased = new $c_sci_HashMap(this.sci_HashMapBuilder__f_scala$collection$immutable$HashMapBuilder$$rootNode);
    return this.sci_HashMapBuilder__f_aliased
  }
});
$c_sci_HashMapBuilder.prototype.addOne__T2__sci_HashMapBuilder = (function(elem) {
  $p_sci_HashMapBuilder__ensureUnaliased__V(this);
  var x = elem._1__O();
  var h = $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$m_sr_Statics$().anyHash__O__I(x);
  var im = $m_sc_Hashing$().improve__I__I(h);
  this.update__sci_MapNode__O__O__I__I__I__V(this.sci_HashMapBuilder__f_scala$collection$immutable$HashMapBuilder$$rootNode, elem._1__O(), elem._2__O(), h, im, 0);
  return this
});
$c_sci_HashMapBuilder.prototype.addOne__O__O__sci_HashMapBuilder = (function(key, value) {
  $p_sci_HashMapBuilder__ensureUnaliased__V(this);
  var originalHash = $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$m_sr_Statics$().anyHash__O__I(key);
  this.update__sci_MapNode__O__O__I__I__I__V(this.sci_HashMapBuilder__f_scala$collection$immutable$HashMapBuilder$$rootNode, key, value, originalHash, $m_sc_Hashing$().improve__I__I(originalHash), 0);
  return this
});
$c_sci_HashMapBuilder.prototype.addAll__sc_IterableOnce__sci_HashMapBuilder = (function(xs) {
  $p_sci_HashMapBuilder__ensureUnaliased__V(this);
  if ((xs instanceof $c_sci_HashMap)) {
    var x2 = xs;
    new $c_sci_HashMapBuilder$$anon$1(this, x2)
  } else if (false) {
    var x3 = xs;
    var iter = x3.nodeIterator__sc_Iterator();
    while (iter.hasNext__Z()) {
      var next = iter.next__O();
      var improvedHash = next.scm_HashMap$Node__f__hash;
      var originalHash = (improvedHash ^ ((improvedHash >>> 16) | 0));
      var hash = $m_sc_Hashing$().improve__I__I(originalHash);
      this.update__sci_MapNode__O__O__I__I__I__V(this.sci_HashMapBuilder__f_scala$collection$immutable$HashMapBuilder$$rootNode, next.scm_HashMap$Node__f__key, next.scm_HashMap$Node__f__value, originalHash, hash, 0)
    }
  } else if (false) {
    var x4 = xs;
    var iter$2 = x4.entryIterator__sc_Iterator();
    while (iter$2.hasNext__Z()) {
      var next$2 = iter$2.next__O();
      var originalHash$2 = x4.unimproveHash__I__I(next$2.hash__I());
      var hash$2 = $m_sc_Hashing$().improve__I__I(originalHash$2);
      this.update__sci_MapNode__O__O__I__I__I__V(this.sci_HashMapBuilder__f_scala$collection$immutable$HashMapBuilder$$rootNode, next$2.key__O(), next$2.value__O(), originalHash$2, hash$2, 0)
    }
  } else if ($is_sci_Map(xs)) {
    var x5 = xs;
    x5.foreachEntry__F2__V(new $c_sjsr_AnonFunction2(((key$2, value$2) => this.addOne__O__O__sci_HashMapBuilder(key$2, value$2))))
  } else {
    var it = xs.iterator__sc_Iterator();
    while (it.hasNext__Z()) {
      this.addOne__T2__sci_HashMapBuilder(it.next__O())
    }
  };
  return this
});
$c_sci_HashMapBuilder.prototype.addAll__sc_IterableOnce__scm_Growable = (function(xs) {
  return this.addAll__sc_IterableOnce__sci_HashMapBuilder(xs)
});
$c_sci_HashMapBuilder.prototype.addOne__O__scm_Growable = (function(elem) {
  return this.addOne__T2__sci_HashMapBuilder(elem)
});
$c_sci_HashMapBuilder.prototype.result__O = (function() {
  return this.result__sci_HashMap()
});
var $d_sci_HashMapBuilder = new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$TypeData().initClass({
  sci_HashMapBuilder: 0
}, false, "scala.collection.immutable.HashMapBuilder", {
  sci_HashMapBuilder: 1,
  O: 1,
  scm_ReusableBuilder: 1,
  scm_Builder: 1,
  scm_Growable: 1,
  scm_Clearable: 1
});
$c_sci_HashMapBuilder.prototype.$classData = $d_sci_HashMapBuilder;
function $ct_sci_Map$Map2$Map2Iterator__sci_Map$Map2__($thiz, outer) {
  if ((outer === null)) {
    throw null
  } else {
    $thiz.sci_Map$Map2$Map2Iterator__f_$outer = outer
  };
  $thiz.sci_Map$Map2$Map2Iterator__f_i = 0;
  return $thiz
}
/** @constructor */
function $c_sci_Map$Map2$Map2Iterator() {
  this.sci_Map$Map2$Map2Iterator__f_i = 0;
  this.sci_Map$Map2$Map2Iterator__f_$outer = null
}
$c_sci_Map$Map2$Map2Iterator.prototype = new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$h_sc_AbstractIterator();
$c_sci_Map$Map2$Map2Iterator.prototype.constructor = $c_sci_Map$Map2$Map2Iterator;
/** @constructor */
function $h_sci_Map$Map2$Map2Iterator() {
  /*<skip>*/
}
$h_sci_Map$Map2$Map2Iterator.prototype = $c_sci_Map$Map2$Map2Iterator.prototype;
$c_sci_Map$Map2$Map2Iterator.prototype.hasNext__Z = (function() {
  return (this.sci_Map$Map2$Map2Iterator__f_i < 2)
});
$c_sci_Map$Map2$Map2Iterator.prototype.next__O = (function() {
  var x1 = this.sci_Map$Map2$Map2Iterator__f_i;
  switch (x1) {
    case 0: {
      var k = this.sci_Map$Map2$Map2Iterator__f_$outer.sci_Map$Map2__f_scala$collection$immutable$Map$Map2$$key1;
      var v = this.sci_Map$Map2$Map2Iterator__f_$outer.sci_Map$Map2__f_scala$collection$immutable$Map$Map2$$value1;
      var result = new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$c_T2(k, v);
      break
    }
    case 1: {
      var k$1 = this.sci_Map$Map2$Map2Iterator__f_$outer.sci_Map$Map2__f_scala$collection$immutable$Map$Map2$$key2;
      var v$1 = this.sci_Map$Map2$Map2Iterator__f_$outer.sci_Map$Map2__f_scala$collection$immutable$Map$Map2$$value2;
      var result = new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$c_T2(k$1, v$1);
      break
    }
    default: {
      var result = $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$m_sc_Iterator$().sc_Iterator$__f_scala$collection$Iterator$$_empty.next__O()
    }
  };
  this.sci_Map$Map2$Map2Iterator__f_i = ((1 + this.sci_Map$Map2$Map2Iterator__f_i) | 0);
  return result
});
$c_sci_Map$Map2$Map2Iterator.prototype.drop__I__sc_Iterator = (function(n) {
  this.sci_Map$Map2$Map2Iterator__f_i = ((this.sci_Map$Map2$Map2Iterator__f_i + n) | 0);
  return this
});
function $ct_sci_Map$Map3$Map3Iterator__sci_Map$Map3__($thiz, outer) {
  if ((outer === null)) {
    throw null
  } else {
    $thiz.sci_Map$Map3$Map3Iterator__f_$outer = outer
  };
  $thiz.sci_Map$Map3$Map3Iterator__f_i = 0;
  return $thiz
}
/** @constructor */
function $c_sci_Map$Map3$Map3Iterator() {
  this.sci_Map$Map3$Map3Iterator__f_i = 0;
  this.sci_Map$Map3$Map3Iterator__f_$outer = null
}
$c_sci_Map$Map3$Map3Iterator.prototype = new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$h_sc_AbstractIterator();
$c_sci_Map$Map3$Map3Iterator.prototype.constructor = $c_sci_Map$Map3$Map3Iterator;
/** @constructor */
function $h_sci_Map$Map3$Map3Iterator() {
  /*<skip>*/
}
$h_sci_Map$Map3$Map3Iterator.prototype = $c_sci_Map$Map3$Map3Iterator.prototype;
$c_sci_Map$Map3$Map3Iterator.prototype.hasNext__Z = (function() {
  return (this.sci_Map$Map3$Map3Iterator__f_i < 3)
});
$c_sci_Map$Map3$Map3Iterator.prototype.next__O = (function() {
  var x1 = this.sci_Map$Map3$Map3Iterator__f_i;
  switch (x1) {
    case 0: {
      var k = this.sci_Map$Map3$Map3Iterator__f_$outer.sci_Map$Map3__f_scala$collection$immutable$Map$Map3$$key1;
      var v = this.sci_Map$Map3$Map3Iterator__f_$outer.sci_Map$Map3__f_scala$collection$immutable$Map$Map3$$value1;
      var result = new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$c_T2(k, v);
      break
    }
    case 1: {
      var k$1 = this.sci_Map$Map3$Map3Iterator__f_$outer.sci_Map$Map3__f_scala$collection$immutable$Map$Map3$$key2;
      var v$1 = this.sci_Map$Map3$Map3Iterator__f_$outer.sci_Map$Map3__f_scala$collection$immutable$Map$Map3$$value2;
      var result = new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$c_T2(k$1, v$1);
      break
    }
    case 2: {
      var k$2 = this.sci_Map$Map3$Map3Iterator__f_$outer.sci_Map$Map3__f_scala$collection$immutable$Map$Map3$$key3;
      var v$2 = this.sci_Map$Map3$Map3Iterator__f_$outer.sci_Map$Map3__f_scala$collection$immutable$Map$Map3$$value3;
      var result = new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$c_T2(k$2, v$2);
      break
    }
    default: {
      var result = $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$m_sc_Iterator$().sc_Iterator$__f_scala$collection$Iterator$$_empty.next__O()
    }
  };
  this.sci_Map$Map3$Map3Iterator__f_i = ((1 + this.sci_Map$Map3$Map3Iterator__f_i) | 0);
  return result
});
$c_sci_Map$Map3$Map3Iterator.prototype.drop__I__sc_Iterator = (function(n) {
  this.sci_Map$Map3$Map3Iterator__f_i = ((this.sci_Map$Map3$Map3Iterator__f_i + n) | 0);
  return this
});
function $ct_sci_Map$Map4$Map4Iterator__sci_Map$Map4__($thiz, outer) {
  if ((outer === null)) {
    throw null
  } else {
    $thiz.sci_Map$Map4$Map4Iterator__f_$outer = outer
  };
  $thiz.sci_Map$Map4$Map4Iterator__f_i = 0;
  return $thiz
}
/** @constructor */
function $c_sci_Map$Map4$Map4Iterator() {
  this.sci_Map$Map4$Map4Iterator__f_i = 0;
  this.sci_Map$Map4$Map4Iterator__f_$outer = null
}
$c_sci_Map$Map4$Map4Iterator.prototype = new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$h_sc_AbstractIterator();
$c_sci_Map$Map4$Map4Iterator.prototype.constructor = $c_sci_Map$Map4$Map4Iterator;
/** @constructor */
function $h_sci_Map$Map4$Map4Iterator() {
  /*<skip>*/
}
$h_sci_Map$Map4$Map4Iterator.prototype = $c_sci_Map$Map4$Map4Iterator.prototype;
$c_sci_Map$Map4$Map4Iterator.prototype.hasNext__Z = (function() {
  return (this.sci_Map$Map4$Map4Iterator__f_i < 4)
});
$c_sci_Map$Map4$Map4Iterator.prototype.next__O = (function() {
  var x1 = this.sci_Map$Map4$Map4Iterator__f_i;
  switch (x1) {
    case 0: {
      var k = this.sci_Map$Map4$Map4Iterator__f_$outer.sci_Map$Map4__f_scala$collection$immutable$Map$Map4$$key1;
      var v = this.sci_Map$Map4$Map4Iterator__f_$outer.sci_Map$Map4__f_scala$collection$immutable$Map$Map4$$value1;
      var result = new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$c_T2(k, v);
      break
    }
    case 1: {
      var k$1 = this.sci_Map$Map4$Map4Iterator__f_$outer.sci_Map$Map4__f_scala$collection$immutable$Map$Map4$$key2;
      var v$1 = this.sci_Map$Map4$Map4Iterator__f_$outer.sci_Map$Map4__f_scala$collection$immutable$Map$Map4$$value2;
      var result = new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$c_T2(k$1, v$1);
      break
    }
    case 2: {
      var k$2 = this.sci_Map$Map4$Map4Iterator__f_$outer.sci_Map$Map4__f_scala$collection$immutable$Map$Map4$$key3;
      var v$2 = this.sci_Map$Map4$Map4Iterator__f_$outer.sci_Map$Map4__f_scala$collection$immutable$Map$Map4$$value3;
      var result = new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$c_T2(k$2, v$2);
      break
    }
    case 3: {
      var k$3 = this.sci_Map$Map4$Map4Iterator__f_$outer.sci_Map$Map4__f_scala$collection$immutable$Map$Map4$$key4;
      var v$3 = this.sci_Map$Map4$Map4Iterator__f_$outer.sci_Map$Map4__f_scala$collection$immutable$Map$Map4$$value4;
      var result = new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$c_T2(k$3, v$3);
      break
    }
    default: {
      var result = $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$m_sc_Iterator$().sc_Iterator$__f_scala$collection$Iterator$$_empty.next__O()
    }
  };
  this.sci_Map$Map4$Map4Iterator__f_i = ((1 + this.sci_Map$Map4$Map4Iterator__f_i) | 0);
  return result
});
$c_sci_Map$Map4$Map4Iterator.prototype.drop__I__sc_Iterator = (function(n) {
  this.sci_Map$Map4$Map4Iterator__f_i = ((this.sci_Map$Map4$Map4Iterator__f_i + n) | 0);
  return this
});
/** @constructor */
function $c_sci_MapBuilderImpl() {
  this.sci_MapBuilderImpl__f_elems = null;
  this.sci_MapBuilderImpl__f_switchedToHashMapBuilder = false;
  this.sci_MapBuilderImpl__f_hashMapBuilder = null;
  this.sci_MapBuilderImpl__f_elems = $m_sci_Map$EmptyMap$();
  this.sci_MapBuilderImpl__f_switchedToHashMapBuilder = false
}
$c_sci_MapBuilderImpl.prototype = new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$h_O();
$c_sci_MapBuilderImpl.prototype.constructor = $c_sci_MapBuilderImpl;
/** @constructor */
function $h_sci_MapBuilderImpl() {
  /*<skip>*/
}
$h_sci_MapBuilderImpl.prototype = $c_sci_MapBuilderImpl.prototype;
$c_sci_MapBuilderImpl.prototype.sizeHint__I__V = (function(size) {
  /*<skip>*/
});
$c_sci_MapBuilderImpl.prototype.result__sci_Map = (function() {
  return (this.sci_MapBuilderImpl__f_switchedToHashMapBuilder ? this.sci_MapBuilderImpl__f_hashMapBuilder.result__sci_HashMap() : this.sci_MapBuilderImpl__f_elems)
});
$c_sci_MapBuilderImpl.prototype.addOne__O__O__sci_MapBuilderImpl = (function(key, value) {
  if (this.sci_MapBuilderImpl__f_switchedToHashMapBuilder) {
    this.sci_MapBuilderImpl__f_hashMapBuilder.addOne__O__O__sci_HashMapBuilder(key, value)
  } else if ((this.sci_MapBuilderImpl__f_elems.size__I() < 4)) {
    this.sci_MapBuilderImpl__f_elems = this.sci_MapBuilderImpl__f_elems.updated__O__O__sci_MapOps(key, value)
  } else if (this.sci_MapBuilderImpl__f_elems.contains__O__Z(key)) {
    this.sci_MapBuilderImpl__f_elems = this.sci_MapBuilderImpl__f_elems.updated__O__O__sci_MapOps(key, value)
  } else {
    this.sci_MapBuilderImpl__f_switchedToHashMapBuilder = true;
    if ((this.sci_MapBuilderImpl__f_hashMapBuilder === null)) {
      this.sci_MapBuilderImpl__f_hashMapBuilder = new $c_sci_HashMapBuilder()
    };
    this.sci_MapBuilderImpl__f_elems.buildTo__sci_HashMapBuilder__sci_HashMapBuilder(this.sci_MapBuilderImpl__f_hashMapBuilder);
    this.sci_MapBuilderImpl__f_hashMapBuilder.addOne__O__O__sci_HashMapBuilder(key, value)
  };
  return this
});
$c_sci_MapBuilderImpl.prototype.addAll__sc_IterableOnce__sci_MapBuilderImpl = (function(xs) {
  return (this.sci_MapBuilderImpl__f_switchedToHashMapBuilder ? (this.sci_MapBuilderImpl__f_hashMapBuilder.addAll__sc_IterableOnce__sci_HashMapBuilder(xs), this) : $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$f_scm_Growable__addAll__sc_IterableOnce__scm_Growable(this, xs))
});
$c_sci_MapBuilderImpl.prototype.addAll__sc_IterableOnce__scm_Growable = (function(xs) {
  return this.addAll__sc_IterableOnce__sci_MapBuilderImpl(xs)
});
$c_sci_MapBuilderImpl.prototype.addOne__O__scm_Growable = (function(elem) {
  var elem$1 = elem;
  return this.addOne__O__O__sci_MapBuilderImpl(elem$1._1__O(), elem$1._2__O())
});
$c_sci_MapBuilderImpl.prototype.result__O = (function() {
  return this.result__sci_Map()
});
function $isArrayOf_sci_MapBuilderImpl(obj, depth) {
  return (!(!(((obj && obj.$classData) && (obj.$classData.arrayDepth === depth)) && obj.$classData.arrayBase.ancestors.sci_MapBuilderImpl)))
}
var $d_sci_MapBuilderImpl = new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$TypeData().initClass({
  sci_MapBuilderImpl: 0
}, false, "scala.collection.immutable.MapBuilderImpl", {
  sci_MapBuilderImpl: 1,
  O: 1,
  scm_ReusableBuilder: 1,
  scm_Builder: 1,
  scm_Growable: 1,
  scm_Clearable: 1
});
$c_sci_MapBuilderImpl.prototype.$classData = $d_sci_MapBuilderImpl;
/** @constructor */
function $c_sci_MapKeyValueTupleHashIterator(rootNode) {
  this.sci_ChampBaseReverseIterator__f_currentValueCursor = 0;
  this.sci_ChampBaseReverseIterator__f_currentValueNode = null;
  this.sci_ChampBaseReverseIterator__f_currentStackLevel = 0;
  this.sci_ChampBaseReverseIterator__f_nodeIndex = null;
  this.sci_ChampBaseReverseIterator__f_nodeStack = null;
  this.sci_MapKeyValueTupleHashIterator__f_hash = 0;
  this.sci_MapKeyValueTupleHashIterator__f_value = null;
  $ct_sci_ChampBaseReverseIterator__sci_Node__(this, rootNode);
  this.sci_MapKeyValueTupleHashIterator__f_hash = 0
}
$c_sci_MapKeyValueTupleHashIterator.prototype = new $h_sci_ChampBaseReverseIterator();
$c_sci_MapKeyValueTupleHashIterator.prototype.constructor = $c_sci_MapKeyValueTupleHashIterator;
/** @constructor */
function $h_sci_MapKeyValueTupleHashIterator() {
  /*<skip>*/
}
$h_sci_MapKeyValueTupleHashIterator.prototype = $c_sci_MapKeyValueTupleHashIterator.prototype;
$c_sci_MapKeyValueTupleHashIterator.prototype.iterator__sc_Iterator = (function() {
  return this
});
$c_sci_MapKeyValueTupleHashIterator.prototype.concat__F0__sc_Iterator = (function(xs) {
  return $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$f_sc_Iterator__concat__F0__sc_Iterator(this, xs)
});
$c_sci_MapKeyValueTupleHashIterator.prototype.drop__I__sc_Iterator = (function(n) {
  return $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$f_sc_Iterator__sliceIterator__I__I__sc_Iterator(this, n, (-1))
});
$c_sci_MapKeyValueTupleHashIterator.prototype.toString__T = (function() {
  return "<iterator>"
});
$c_sci_MapKeyValueTupleHashIterator.prototype.copyToArray__O__I__I__I = (function(xs, start, len) {
  return $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$f_sc_IterableOnceOps__copyToArray__O__I__I__I(this, xs, start, len)
});
$c_sci_MapKeyValueTupleHashIterator.prototype.addString__scm_StringBuilder__T__T__T__scm_StringBuilder = (function(b, start, sep, end) {
  return $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$f_sc_IterableOnceOps__addString__scm_StringBuilder__T__T__T__scm_StringBuilder(this, b, start, sep, end)
});
$c_sci_MapKeyValueTupleHashIterator.prototype.toList__sci_List = (function() {
  $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$m_sci_List$();
  return $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$m_sci_Nil$().prependedAll__sc_IterableOnce__sci_List(this)
});
$c_sci_MapKeyValueTupleHashIterator.prototype.knownSize__I = (function() {
  return (-1)
});
$c_sci_MapKeyValueTupleHashIterator.prototype.hashCode__I = (function() {
  var $$x2 = $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$m_s_util_hashing_MurmurHash3$();
  var $$x1 = this.sci_MapKeyValueTupleHashIterator__f_hash;
  var x = this.sci_MapKeyValueTupleHashIterator__f_value;
  return $$x2.tuple2Hash__I__I__I__I($$x1, $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$m_sr_Statics$().anyHash__O__I(x), (-889275714))
});
$c_sci_MapKeyValueTupleHashIterator.prototype.next__sci_MapKeyValueTupleHashIterator = (function() {
  if ((!this.hasNext__Z())) {
    throw $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$ct_ju_NoSuchElementException__(new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$c_ju_NoSuchElementException())
  };
  this.sci_MapKeyValueTupleHashIterator__f_hash = this.sci_ChampBaseReverseIterator__f_currentValueNode.getHash__I__I(this.sci_ChampBaseReverseIterator__f_currentValueCursor);
  this.sci_MapKeyValueTupleHashIterator__f_value = this.sci_ChampBaseReverseIterator__f_currentValueNode.getValue__I__O(this.sci_ChampBaseReverseIterator__f_currentValueCursor);
  this.sci_ChampBaseReverseIterator__f_currentValueCursor = (((-1) + this.sci_ChampBaseReverseIterator__f_currentValueCursor) | 0);
  return this
});
$c_sci_MapKeyValueTupleHashIterator.prototype.next__O = (function() {
  return this.next__sci_MapKeyValueTupleHashIterator()
});
var $d_sci_MapKeyValueTupleHashIterator = new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$TypeData().initClass({
  sci_MapKeyValueTupleHashIterator: 0
}, false, "scala.collection.immutable.MapKeyValueTupleHashIterator", {
  sci_MapKeyValueTupleHashIterator: 1,
  sci_ChampBaseReverseIterator: 1,
  O: 1,
  sc_Iterator: 1,
  sc_IterableOnce: 1,
  sc_IterableOnceOps: 1
});
$c_sci_MapKeyValueTupleHashIterator.prototype.$classData = $d_sci_MapKeyValueTupleHashIterator;
/** @constructor */
function $c_sci_MapKeyValueTupleIterator(rootNode) {
  this.sci_ChampBaseIterator__f_currentValueCursor = 0;
  this.sci_ChampBaseIterator__f_currentValueLength = 0;
  this.sci_ChampBaseIterator__f_currentValueNode = null;
  this.sci_ChampBaseIterator__f_currentStackLevel = 0;
  this.sci_ChampBaseIterator__f_nodeCursorsAndLengths = null;
  this.sci_ChampBaseIterator__f_nodes = null;
  $ct_sci_ChampBaseIterator__sci_Node__(this, rootNode)
}
$c_sci_MapKeyValueTupleIterator.prototype = new $h_sci_ChampBaseIterator();
$c_sci_MapKeyValueTupleIterator.prototype.constructor = $c_sci_MapKeyValueTupleIterator;
/** @constructor */
function $h_sci_MapKeyValueTupleIterator() {
  /*<skip>*/
}
$h_sci_MapKeyValueTupleIterator.prototype = $c_sci_MapKeyValueTupleIterator.prototype;
$c_sci_MapKeyValueTupleIterator.prototype.iterator__sc_Iterator = (function() {
  return this
});
$c_sci_MapKeyValueTupleIterator.prototype.concat__F0__sc_Iterator = (function(xs) {
  return $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$f_sc_Iterator__concat__F0__sc_Iterator(this, xs)
});
$c_sci_MapKeyValueTupleIterator.prototype.drop__I__sc_Iterator = (function(n) {
  return $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$f_sc_Iterator__sliceIterator__I__I__sc_Iterator(this, n, (-1))
});
$c_sci_MapKeyValueTupleIterator.prototype.toString__T = (function() {
  return "<iterator>"
});
$c_sci_MapKeyValueTupleIterator.prototype.copyToArray__O__I__I__I = (function(xs, start, len) {
  return $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$f_sc_IterableOnceOps__copyToArray__O__I__I__I(this, xs, start, len)
});
$c_sci_MapKeyValueTupleIterator.prototype.addString__scm_StringBuilder__T__T__T__scm_StringBuilder = (function(b, start, sep, end) {
  return $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$f_sc_IterableOnceOps__addString__scm_StringBuilder__T__T__T__scm_StringBuilder(this, b, start, sep, end)
});
$c_sci_MapKeyValueTupleIterator.prototype.toList__sci_List = (function() {
  $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$m_sci_List$();
  return $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$m_sci_Nil$().prependedAll__sc_IterableOnce__sci_List(this)
});
$c_sci_MapKeyValueTupleIterator.prototype.knownSize__I = (function() {
  return (-1)
});
$c_sci_MapKeyValueTupleIterator.prototype.next__T2 = (function() {
  if ((!this.hasNext__Z())) {
    throw $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$ct_ju_NoSuchElementException__(new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$c_ju_NoSuchElementException())
  };
  var payload = this.sci_ChampBaseIterator__f_currentValueNode.getPayload__I__T2(this.sci_ChampBaseIterator__f_currentValueCursor);
  this.sci_ChampBaseIterator__f_currentValueCursor = ((1 + this.sci_ChampBaseIterator__f_currentValueCursor) | 0);
  return payload
});
$c_sci_MapKeyValueTupleIterator.prototype.next__O = (function() {
  return this.next__T2()
});
var $d_sci_MapKeyValueTupleIterator = new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$TypeData().initClass({
  sci_MapKeyValueTupleIterator: 0
}, false, "scala.collection.immutable.MapKeyValueTupleIterator", {
  sci_MapKeyValueTupleIterator: 1,
  sci_ChampBaseIterator: 1,
  O: 1,
  sc_Iterator: 1,
  sc_IterableOnce: 1,
  sc_IterableOnceOps: 1
});
$c_sci_MapKeyValueTupleIterator.prototype.$classData = $d_sci_MapKeyValueTupleIterator;
/** @constructor */
function $c_s_concurrent_ExecutionContext$parasitic$() {
  this.s_concurrent_ExecutionContext$parasitic$__f_scala$concurrent$BatchingExecutor$$_tasksLocal = null;
  $n_s_concurrent_ExecutionContext$parasitic$ = this;
  this.s_concurrent_ExecutionContext$parasitic$__f_scala$concurrent$BatchingExecutor$$_tasksLocal = new $c_jl_ThreadLocal()
}
$c_s_concurrent_ExecutionContext$parasitic$.prototype = new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$h_O();
$c_s_concurrent_ExecutionContext$parasitic$.prototype.constructor = $c_s_concurrent_ExecutionContext$parasitic$;
/** @constructor */
function $h_s_concurrent_ExecutionContext$parasitic$() {
  /*<skip>*/
}
$h_s_concurrent_ExecutionContext$parasitic$.prototype = $c_s_concurrent_ExecutionContext$parasitic$.prototype;
$c_s_concurrent_ExecutionContext$parasitic$.prototype.execute__jl_Runnable__V = (function(runnable) {
  $f_s_concurrent_BatchingExecutor__submitSyncBatched__jl_Runnable__V(this, runnable)
});
$c_s_concurrent_ExecutionContext$parasitic$.prototype.reportFailure__jl_Throwable__V = (function(t) {
  $m_s_concurrent_ExecutionContext$().s_concurrent_ExecutionContext$__f_defaultReporter.apply__O__O(t)
});
var $d_s_concurrent_ExecutionContext$parasitic$ = new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$TypeData().initClass({
  s_concurrent_ExecutionContext$parasitic$: 0
}, false, "scala.concurrent.ExecutionContext$parasitic$", {
  s_concurrent_ExecutionContext$parasitic$: 1,
  O: 1,
  s_concurrent_ExecutionContextExecutor: 1,
  s_concurrent_ExecutionContext: 1,
  ju_concurrent_Executor: 1,
  s_concurrent_BatchingExecutor: 1
});
$c_s_concurrent_ExecutionContext$parasitic$.prototype.$classData = $d_s_concurrent_ExecutionContext$parasitic$;
var $n_s_concurrent_ExecutionContext$parasitic$;
function $m_s_concurrent_ExecutionContext$parasitic$() {
  if ((!$n_s_concurrent_ExecutionContext$parasitic$)) {
    $n_s_concurrent_ExecutionContext$parasitic$ = new $c_s_concurrent_ExecutionContext$parasitic$()
  };
  return $n_s_concurrent_ExecutionContext$parasitic$
}
/** @constructor */
function $c_sjsr_WrappedVarArgs$() {
  /*<skip>*/
}
$c_sjsr_WrappedVarArgs$.prototype = new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$h_O();
$c_sjsr_WrappedVarArgs$.prototype.constructor = $c_sjsr_WrappedVarArgs$;
/** @constructor */
function $h_sjsr_WrappedVarArgs$() {
  /*<skip>*/
}
$h_sjsr_WrappedVarArgs$.prototype = $c_sjsr_WrappedVarArgs$.prototype;
$c_sjsr_WrappedVarArgs$.prototype.apply__sci_Seq__O = (function(elems) {
  return this.from__sc_IterableOnce__sjsr_WrappedVarArgs(elems)
});
$c_sjsr_WrappedVarArgs$.prototype.from__sc_IterableOnce__sjsr_WrappedVarArgs = (function(source) {
  var this$1 = this.newBuilder__scm_Builder();
  return this$1.addAll__sc_IterableOnce__scm_Growable(source).result__O()
});
$c_sjsr_WrappedVarArgs$.prototype.newBuilder__scm_Builder = (function() {
  var array = [];
  var this$4 = $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$ct_sjs_js_WrappedArray__sjs_js_Array__(new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$c_sjs_js_WrappedArray(), array);
  var f = new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$c_sjsr_AnonFunction1(((x$1$2) => {
    var x$1 = x$1$2;
    return new $c_sjsr_WrappedVarArgs(x$1.sjs_js_WrappedArray__f_scala$scalajs$js$WrappedArray$$array)
  }));
  return new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$c_scm_Builder$$anon$1(this$4, f)
});
$c_sjsr_WrappedVarArgs$.prototype.from__sc_IterableOnce__O = (function(source) {
  return this.from__sc_IterableOnce__sjsr_WrappedVarArgs(source)
});
var $d_sjsr_WrappedVarArgs$ = new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$TypeData().initClass({
  sjsr_WrappedVarArgs$: 0
}, false, "scala.scalajs.runtime.WrappedVarArgs$", {
  sjsr_WrappedVarArgs$: 1,
  O: 1,
  sc_StrictOptimizedSeqFactory: 1,
  sc_SeqFactory: 1,
  sc_IterableFactory: 1,
  Ljava_io_Serializable: 1
});
$c_sjsr_WrappedVarArgs$.prototype.$classData = $d_sjsr_WrappedVarArgs$;
var $n_sjsr_WrappedVarArgs$;
function $m_sjsr_WrappedVarArgs$() {
  if ((!$n_sjsr_WrappedVarArgs$)) {
    $n_sjsr_WrappedVarArgs$ = new $c_sjsr_WrappedVarArgs$()
  };
  return $n_sjsr_WrappedVarArgs$
}
/** @constructor */
function $c_s_util_Failure(exception) {
  this.s_util_Failure__f_exception = null;
  this.s_util_Failure__f_exception = exception
}
$c_s_util_Failure.prototype = new $h_s_util_Try();
$c_s_util_Failure.prototype.constructor = $c_s_util_Failure;
/** @constructor */
function $h_s_util_Failure() {
  /*<skip>*/
}
$h_s_util_Failure.prototype = $c_s_util_Failure.prototype;
$c_s_util_Failure.prototype.isFailure__Z = (function() {
  return true
});
$c_s_util_Failure.prototype.isSuccess__Z = (function() {
  return false
});
$c_s_util_Failure.prototype.get__O = (function() {
  var $$x1 = this.s_util_Failure__f_exception;
  throw (($$x1 instanceof $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$c_sjs_js_JavaScriptException) ? $$x1.sjs_js_JavaScriptException__f_exception : $$x1)
});
$c_s_util_Failure.prototype.foreach__F1__V = (function(f) {
  /*<skip>*/
});
$c_s_util_Failure.prototype.map__F1__s_util_Try = (function(f) {
  return this
});
$c_s_util_Failure.prototype.recover__s_PartialFunction__s_util_Try = (function(pf) {
  var marker = $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$m_sr_Statics$PFMarker$();
  try {
    var v = pf.applyOrElse__O__F1__O(this.s_util_Failure__f_exception, new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$c_sjsr_AnonFunction1(((x$2) => marker)));
    return ((marker !== v) ? new $c_s_util_Success(v) : this)
  } catch (e) {
    var e$2 = ((e instanceof $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$c_jl_Throwable) ? e : new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$c_sjs_js_JavaScriptException(e));
    var o11 = $m_s_util_control_NonFatal$().unapply__jl_Throwable__s_Option(e$2);
    if ((!o11.isEmpty__Z())) {
      var e$3 = o11.get__O();
      return new $c_s_util_Failure(e$3)
    };
    throw ((e$2 instanceof $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$c_sjs_js_JavaScriptException) ? e$2.sjs_js_JavaScriptException__f_exception : e$2)
  }
});
$c_s_util_Failure.prototype.fold__F1__F1__O = (function(fa, fb) {
  return fa.apply__O__O(this.s_util_Failure__f_exception)
});
$c_s_util_Failure.prototype.productPrefix__T = (function() {
  return "Failure"
});
$c_s_util_Failure.prototype.productArity__I = (function() {
  return 1
});
$c_s_util_Failure.prototype.productElement__I__O = (function(x$1) {
  return ((x$1 === 0) ? this.s_util_Failure__f_exception : $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$m_sr_Statics$().ioobe__I__O(x$1))
});
$c_s_util_Failure.prototype.productIterator__sc_Iterator = (function() {
  return new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$c_sr_ScalaRunTime$$anon$1(this)
});
$c_s_util_Failure.prototype.hashCode__I = (function() {
  var this$2 = $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$m_s_util_hashing_MurmurHash3$();
  return this$2.productHash__s_Product__I__Z__I(this, (-889275714), false)
});
$c_s_util_Failure.prototype.toString__T = (function() {
  return $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$m_sr_ScalaRunTime$()._toString__s_Product__T(this)
});
$c_s_util_Failure.prototype.equals__O__Z = (function(x$1) {
  if ((this === x$1)) {
    return true
  } else if ((x$1 instanceof $c_s_util_Failure)) {
    var Failure$1 = x$1;
    var x = this.s_util_Failure__f_exception;
    var x$2 = Failure$1.s_util_Failure__f_exception;
    return ((x === null) ? (x$2 === null) : x.equals__O__Z(x$2))
  } else {
    return false
  }
});
function $isArrayOf_s_util_Failure(obj, depth) {
  return (!(!(((obj && obj.$classData) && (obj.$classData.arrayDepth === depth)) && obj.$classData.arrayBase.ancestors.s_util_Failure)))
}
var $d_s_util_Failure = new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$TypeData().initClass({
  s_util_Failure: 0
}, false, "scala.util.Failure", {
  s_util_Failure: 1,
  s_util_Try: 1,
  O: 1,
  s_Product: 1,
  s_Equals: 1,
  Ljava_io_Serializable: 1
});
$c_s_util_Failure.prototype.$classData = $d_s_util_Failure;
/** @constructor */
function $c_s_util_Success(value) {
  this.s_util_Success__f_value = null;
  this.s_util_Success__f_value = value
}
$c_s_util_Success.prototype = new $h_s_util_Try();
$c_s_util_Success.prototype.constructor = $c_s_util_Success;
/** @constructor */
function $h_s_util_Success() {
  /*<skip>*/
}
$h_s_util_Success.prototype = $c_s_util_Success.prototype;
$c_s_util_Success.prototype.isFailure__Z = (function() {
  return false
});
$c_s_util_Success.prototype.isSuccess__Z = (function() {
  return true
});
$c_s_util_Success.prototype.get__O = (function() {
  return this.s_util_Success__f_value
});
$c_s_util_Success.prototype.foreach__F1__V = (function(f) {
  f.apply__O__O(this.s_util_Success__f_value)
});
$c_s_util_Success.prototype.map__F1__s_util_Try = (function(f) {
  try {
    return new $c_s_util_Success(f.apply__O__O(this.s_util_Success__f_value))
  } catch (e) {
    var e$2 = ((e instanceof $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$c_jl_Throwable) ? e : new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$c_sjs_js_JavaScriptException(e));
    var o11 = $m_s_util_control_NonFatal$().unapply__jl_Throwable__s_Option(e$2);
    if ((!o11.isEmpty__Z())) {
      var e$3 = o11.get__O();
      return new $c_s_util_Failure(e$3)
    };
    throw ((e$2 instanceof $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$c_sjs_js_JavaScriptException) ? e$2.sjs_js_JavaScriptException__f_exception : e$2)
  }
});
$c_s_util_Success.prototype.recover__s_PartialFunction__s_util_Try = (function(pf) {
  return this
});
$c_s_util_Success.prototype.fold__F1__F1__O = (function(fa, fb) {
  try {
    return fb.apply__O__O(this.s_util_Success__f_value)
  } catch (e) {
    var e$2 = ((e instanceof $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$c_jl_Throwable) ? e : new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$c_sjs_js_JavaScriptException(e));
    var o11 = $m_s_util_control_NonFatal$().unapply__jl_Throwable__s_Option(e$2);
    if ((!o11.isEmpty__Z())) {
      var e$3 = o11.get__O();
      return fa.apply__O__O(e$3)
    };
    throw ((e$2 instanceof $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$c_sjs_js_JavaScriptException) ? e$2.sjs_js_JavaScriptException__f_exception : e$2)
  }
});
$c_s_util_Success.prototype.productPrefix__T = (function() {
  return "Success"
});
$c_s_util_Success.prototype.productArity__I = (function() {
  return 1
});
$c_s_util_Success.prototype.productElement__I__O = (function(x$1) {
  return ((x$1 === 0) ? this.s_util_Success__f_value : $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$m_sr_Statics$().ioobe__I__O(x$1))
});
$c_s_util_Success.prototype.productIterator__sc_Iterator = (function() {
  return new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$c_sr_ScalaRunTime$$anon$1(this)
});
$c_s_util_Success.prototype.hashCode__I = (function() {
  var this$2 = $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$m_s_util_hashing_MurmurHash3$();
  return this$2.productHash__s_Product__I__Z__I(this, (-889275714), false)
});
$c_s_util_Success.prototype.toString__T = (function() {
  return $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$m_sr_ScalaRunTime$()._toString__s_Product__T(this)
});
$c_s_util_Success.prototype.equals__O__Z = (function(x$1) {
  if ((this === x$1)) {
    return true
  } else if ((x$1 instanceof $c_s_util_Success)) {
    var Success$1 = x$1;
    return $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$m_sr_BoxesRunTime$().equals__O__O__Z(this.s_util_Success__f_value, Success$1.s_util_Success__f_value)
  } else {
    return false
  }
});
function $isArrayOf_s_util_Success(obj, depth) {
  return (!(!(((obj && obj.$classData) && (obj.$classData.arrayDepth === depth)) && obj.$classData.arrayBase.ancestors.s_util_Success)))
}
var $d_s_util_Success = new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$TypeData().initClass({
  s_util_Success: 0
}, false, "scala.util.Success", {
  s_util_Success: 1,
  s_util_Try: 1,
  O: 1,
  s_Product: 1,
  s_Equals: 1,
  Ljava_io_Serializable: 1
});
$c_s_util_Success.prototype.$classData = $d_s_util_Success;
function $f_Lcom_raquo_airstream_combine_CombineObservable__$init$__V($thiz) {
  $thiz.Lcom_raquo_airstream_combine_SampleCombineStreamN__f_parentObservers = $m_Lcom_raquo_ew_JsArray$().apply__sci_Seq__Lcom_raquo_ew_JsArray($j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$m_sr_ScalaRunTime$().wrapRefArray__AO__sci_ArraySeq(new ($d_Lcom_raquo_airstream_common_InternalParentObserver.getArrayOf().constr)([])))
}
function $f_Lcom_raquo_airstream_combine_CombineObservable__onInputsReady__Lcom_raquo_airstream_core_Transaction__V($thiz, transaction) {
  if ((!transaction.containsPendingObservable__Lcom_raquo_airstream_core_SyncObservable__Z($thiz))) {
    transaction.enqueuePendingObservable__Lcom_raquo_airstream_core_SyncObservable__V($thiz)
  }
}
function $f_Lcom_raquo_airstream_combine_CombineObservable__syncFire__Lcom_raquo_airstream_core_Transaction__V($thiz, transaction) {
  if ($thiz.inputsReady__Z()) {
    $thiz.fireTry__s_util_Try__Lcom_raquo_airstream_core_Transaction__V($thiz.combinedValue__s_util_Try(), transaction)
  } else {
    console.warn("CombineObservable: inputs not ready when syncFire")
  }
}
function $f_Lcom_raquo_airstream_combine_CombineObservable__onStart__V($thiz) {
  var arr = $thiz.Lcom_raquo_airstream_combine_SampleCombineStreamN__f_parentObservers;
  var i = 0;
  var len = (arr.length | 0);
  while ((i < len)) {
    var _$1 = arr[i];
    var _$1$1 = _$1;
    var this$3 = _$1$1.Lcom_raquo_airstream_common_InternalParentObserver$$anon$2__f_parent;
    $f_Lcom_raquo_airstream_core_WritableObservable__addInternalObserver__Lcom_raquo_airstream_core_InternalObserver__Z__V(this$3, _$1$1, false);
    i = ((1 + i) | 0)
  }
}
function $f_Lcom_raquo_airstream_combine_CombineObservable__onStop__V($thiz) {
  var arr = $thiz.Lcom_raquo_airstream_combine_SampleCombineStreamN__f_parentObservers;
  var i = 0;
  var len = (arr.length | 0);
  while ((i < len)) {
    var _$2 = arr[i];
    var _$2$1 = _$2;
    var this$3 = _$2$1.Lcom_raquo_airstream_common_InternalParentObserver$$anon$2__f_parent;
    $f_Lcom_raquo_airstream_core_BaseObservable__removeInternalObserver__Lcom_raquo_airstream_core_InternalObserver__V(this$3, _$2$1);
    i = ((1 + i) | 0)
  }
}
class $c_Lcom_raquo_airstream_core_AirstreamError$CombinedError extends $c_Lcom_raquo_airstream_core_AirstreamError {
  constructor(causes) {
    super();
    this.Lcom_raquo_airstream_core_AirstreamError$CombinedError__f_causes = null;
    this.Lcom_raquo_airstream_core_AirstreamError$CombinedError__f_causes = causes;
    var message = $m_Lcom_raquo_airstream_core_AirstreamError$().com$raquo$airstream$core$AirstreamError$$$CombinedError$superArg$1__sci_Seq__T(causes);
    $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$ct_jl_Throwable__T__jl_Throwable__Z__Z__(this, message, null, true, true);
    var this$2 = $m_s_$less$colon$less$();
    var this$3 = causes.flatten__F1__O(this$2.s_$less$colon$less$__f_singleton).headOption__s_Option();
    if ((!this$3.isEmpty__Z())) {
      var arg1 = this$3.get__O();
      var x$0 = arg1;
      this.initCause__jl_Throwable__jl_Throwable(x$0)
    }
  };
  productIterator__sc_Iterator() {
    return new $c_s_Product$$anon$1(this)
  };
  hashCode__I() {
    var this$2 = $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$m_s_util_hashing_MurmurHash3$();
    return this$2.productHash__s_Product__I__Z__I(this, (-889275714), false)
  };
  equals__O__Z(x$0) {
    if ((this === x$0)) {
      return true
    } else if ((x$0 instanceof $c_Lcom_raquo_airstream_core_AirstreamError$CombinedError)) {
      var x$0$2 = x$0;
      var x = this.Lcom_raquo_airstream_core_AirstreamError$CombinedError__f_causes;
      var x$2 = x$0$2.Lcom_raquo_airstream_core_AirstreamError$CombinedError__f_causes;
      return ((x === null) ? (x$2 === null) : x.equals__O__Z(x$2))
    } else {
      return false
    }
  };
  productArity__I() {
    return 1
  };
  productPrefix__T() {
    return "CombinedError"
  };
  productElement__I__O(n) {
    if ((n === 0)) {
      return this.Lcom_raquo_airstream_core_AirstreamError$CombinedError__f_causes
    };
    throw $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$ct_jl_IndexOutOfBoundsException__T__(new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$c_jl_IndexOutOfBoundsException(), ("" + n))
  };
  toString__T() {
    var $$x1 = this.Lcom_raquo_airstream_core_AirstreamError$CombinedError__f_causes;
    var this$2 = $m_s_$less$colon$less$();
    var this$3 = $$x1.flatten__F1__O(this$2.s_$less$colon$less$__f_singleton).toList__sci_List();
    return ("CombinedError: " + $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$f_sc_IterableOnceOps__mkString__T__T__T__T(this$3, "", "; ", ""))
  };
}
function $isArrayOf_Lcom_raquo_airstream_core_AirstreamError$CombinedError(obj, depth) {
  return (!(!(((obj && obj.$classData) && (obj.$classData.arrayDepth === depth)) && obj.$classData.arrayBase.ancestors.Lcom_raquo_airstream_core_AirstreamError$CombinedError)))
}
var $d_Lcom_raquo_airstream_core_AirstreamError$CombinedError = new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$TypeData().initClass({
  Lcom_raquo_airstream_core_AirstreamError$CombinedError: 0
}, false, "com.raquo.airstream.core.AirstreamError$CombinedError", {
  Lcom_raquo_airstream_core_AirstreamError$CombinedError: 1,
  Lcom_raquo_airstream_core_AirstreamError: 1,
  jl_Throwable: 1,
  O: 1,
  Ljava_io_Serializable: 1,
  s_Equals: 1,
  s_Product: 1
});
$c_Lcom_raquo_airstream_core_AirstreamError$CombinedError.prototype.$classData = $d_Lcom_raquo_airstream_core_AirstreamError$CombinedError;
class $c_Lcom_raquo_airstream_core_AirstreamError$ErrorHandlingError extends $c_Lcom_raquo_airstream_core_AirstreamError {
  constructor(error, cause) {
    super();
    this.Lcom_raquo_airstream_core_AirstreamError$ErrorHandlingError__f_error = null;
    this.Lcom_raquo_airstream_core_AirstreamError$ErrorHandlingError__f_cause = null;
    this.Lcom_raquo_airstream_core_AirstreamError$ErrorHandlingError__f_error = error;
    this.Lcom_raquo_airstream_core_AirstreamError$ErrorHandlingError__f_cause = cause;
    var message = ((("ErrorHandlingError: " + error.getMessage__T()) + "; cause: ") + cause.getMessage__T());
    $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$ct_jl_Throwable__T__jl_Throwable__Z__Z__(this, message, null, true, true);
    this.initCause__jl_Throwable__jl_Throwable(cause)
  };
  productIterator__sc_Iterator() {
    return new $c_s_Product$$anon$1(this)
  };
  hashCode__I() {
    var this$2 = $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$m_s_util_hashing_MurmurHash3$();
    return this$2.productHash__s_Product__I__Z__I(this, (-889275714), false)
  };
  equals__O__Z(x$0) {
    if ((this === x$0)) {
      return true
    } else if ((x$0 instanceof $c_Lcom_raquo_airstream_core_AirstreamError$ErrorHandlingError)) {
      var x$0$2 = x$0;
      var x = this.Lcom_raquo_airstream_core_AirstreamError$ErrorHandlingError__f_error;
      var x$2 = x$0$2.Lcom_raquo_airstream_core_AirstreamError$ErrorHandlingError__f_error;
      if (((x === null) ? (x$2 === null) : x.equals__O__Z(x$2))) {
        var x$3 = this.Lcom_raquo_airstream_core_AirstreamError$ErrorHandlingError__f_cause;
        var x$4 = x$0$2.Lcom_raquo_airstream_core_AirstreamError$ErrorHandlingError__f_cause;
        return ((x$3 === null) ? (x$4 === null) : x$3.equals__O__Z(x$4))
      } else {
        return false
      }
    } else {
      return false
    }
  };
  productArity__I() {
    return 2
  };
  productPrefix__T() {
    return "ErrorHandlingError"
  };
  productElement__I__O(n) {
    if ((n === 0)) {
      return this.Lcom_raquo_airstream_core_AirstreamError$ErrorHandlingError__f_error
    };
    if ((n === 1)) {
      return this.Lcom_raquo_airstream_core_AirstreamError$ErrorHandlingError__f_cause
    };
    throw $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$ct_jl_IndexOutOfBoundsException__T__(new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$c_jl_IndexOutOfBoundsException(), ("" + n))
  };
  toString__T() {
    return ((("ErrorHandlingError: " + this.Lcom_raquo_airstream_core_AirstreamError$ErrorHandlingError__f_error) + "; cause: ") + this.Lcom_raquo_airstream_core_AirstreamError$ErrorHandlingError__f_cause)
  };
}
function $isArrayOf_Lcom_raquo_airstream_core_AirstreamError$ErrorHandlingError(obj, depth) {
  return (!(!(((obj && obj.$classData) && (obj.$classData.arrayDepth === depth)) && obj.$classData.arrayBase.ancestors.Lcom_raquo_airstream_core_AirstreamError$ErrorHandlingError)))
}
var $d_Lcom_raquo_airstream_core_AirstreamError$ErrorHandlingError = new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$TypeData().initClass({
  Lcom_raquo_airstream_core_AirstreamError$ErrorHandlingError: 0
}, false, "com.raquo.airstream.core.AirstreamError$ErrorHandlingError", {
  Lcom_raquo_airstream_core_AirstreamError$ErrorHandlingError: 1,
  Lcom_raquo_airstream_core_AirstreamError: 1,
  jl_Throwable: 1,
  O: 1,
  Ljava_io_Serializable: 1,
  s_Equals: 1,
  s_Product: 1
});
$c_Lcom_raquo_airstream_core_AirstreamError$ErrorHandlingError.prototype.$classData = $d_Lcom_raquo_airstream_core_AirstreamError$ErrorHandlingError;
class $c_Lcom_raquo_airstream_core_AirstreamError$ObserverError extends $c_Lcom_raquo_airstream_core_AirstreamError {
  constructor(error) {
    super();
    this.Lcom_raquo_airstream_core_AirstreamError$ObserverError__f_error = null;
    this.Lcom_raquo_airstream_core_AirstreamError$ObserverError__f_error = error;
    var message = ("ObserverError: " + error.getMessage__T());
    $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$ct_jl_Throwable__T__jl_Throwable__Z__Z__(this, message, null, true, true)
  };
  productIterator__sc_Iterator() {
    return new $c_s_Product$$anon$1(this)
  };
  hashCode__I() {
    var this$2 = $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$m_s_util_hashing_MurmurHash3$();
    return this$2.productHash__s_Product__I__Z__I(this, (-889275714), false)
  };
  equals__O__Z(x$0) {
    if ((this === x$0)) {
      return true
    } else if ((x$0 instanceof $c_Lcom_raquo_airstream_core_AirstreamError$ObserverError)) {
      var x$0$2 = x$0;
      var x = this.Lcom_raquo_airstream_core_AirstreamError$ObserverError__f_error;
      var x$2 = x$0$2.Lcom_raquo_airstream_core_AirstreamError$ObserverError__f_error;
      return ((x === null) ? (x$2 === null) : x.equals__O__Z(x$2))
    } else {
      return false
    }
  };
  productArity__I() {
    return 1
  };
  productPrefix__T() {
    return "ObserverError"
  };
  productElement__I__O(n) {
    if ((n === 0)) {
      return this.Lcom_raquo_airstream_core_AirstreamError$ObserverError__f_error
    };
    throw $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$ct_jl_IndexOutOfBoundsException__T__(new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$c_jl_IndexOutOfBoundsException(), ("" + n))
  };
  toString__T() {
    return ("ObserverError: " + this.Lcom_raquo_airstream_core_AirstreamError$ObserverError__f_error)
  };
}
function $isArrayOf_Lcom_raquo_airstream_core_AirstreamError$ObserverError(obj, depth) {
  return (!(!(((obj && obj.$classData) && (obj.$classData.arrayDepth === depth)) && obj.$classData.arrayBase.ancestors.Lcom_raquo_airstream_core_AirstreamError$ObserverError)))
}
var $d_Lcom_raquo_airstream_core_AirstreamError$ObserverError = new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$TypeData().initClass({
  Lcom_raquo_airstream_core_AirstreamError$ObserverError: 0
}, false, "com.raquo.airstream.core.AirstreamError$ObserverError", {
  Lcom_raquo_airstream_core_AirstreamError$ObserverError: 1,
  Lcom_raquo_airstream_core_AirstreamError: 1,
  jl_Throwable: 1,
  O: 1,
  Ljava_io_Serializable: 1,
  s_Equals: 1,
  s_Product: 1
});
$c_Lcom_raquo_airstream_core_AirstreamError$ObserverError.prototype.$classData = $d_Lcom_raquo_airstream_core_AirstreamError$ObserverError;
class $c_Lcom_raquo_airstream_core_AirstreamError$ObserverErrorHandlingError extends $c_Lcom_raquo_airstream_core_AirstreamError {
  constructor(error, cause) {
    super();
    this.Lcom_raquo_airstream_core_AirstreamError$ObserverErrorHandlingError__f_error = null;
    this.Lcom_raquo_airstream_core_AirstreamError$ObserverErrorHandlingError__f_cause = null;
    this.Lcom_raquo_airstream_core_AirstreamError$ObserverErrorHandlingError__f_error = error;
    this.Lcom_raquo_airstream_core_AirstreamError$ObserverErrorHandlingError__f_cause = cause;
    var message = ((("ObserverErrorHandlingError: " + error.getMessage__T()) + "; cause: ") + cause.getMessage__T());
    $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$ct_jl_Throwable__T__jl_Throwable__Z__Z__(this, message, null, true, true);
    this.initCause__jl_Throwable__jl_Throwable(cause)
  };
  productIterator__sc_Iterator() {
    return new $c_s_Product$$anon$1(this)
  };
  hashCode__I() {
    var this$2 = $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$m_s_util_hashing_MurmurHash3$();
    return this$2.productHash__s_Product__I__Z__I(this, (-889275714), false)
  };
  equals__O__Z(x$0) {
    if ((this === x$0)) {
      return true
    } else if ((x$0 instanceof $c_Lcom_raquo_airstream_core_AirstreamError$ObserverErrorHandlingError)) {
      var x$0$2 = x$0;
      var x = this.Lcom_raquo_airstream_core_AirstreamError$ObserverErrorHandlingError__f_error;
      var x$2 = x$0$2.Lcom_raquo_airstream_core_AirstreamError$ObserverErrorHandlingError__f_error;
      if (((x === null) ? (x$2 === null) : x.equals__O__Z(x$2))) {
        var x$3 = this.Lcom_raquo_airstream_core_AirstreamError$ObserverErrorHandlingError__f_cause;
        var x$4 = x$0$2.Lcom_raquo_airstream_core_AirstreamError$ObserverErrorHandlingError__f_cause;
        return ((x$3 === null) ? (x$4 === null) : x$3.equals__O__Z(x$4))
      } else {
        return false
      }
    } else {
      return false
    }
  };
  productArity__I() {
    return 2
  };
  productPrefix__T() {
    return "ObserverErrorHandlingError"
  };
  productElement__I__O(n) {
    if ((n === 0)) {
      return this.Lcom_raquo_airstream_core_AirstreamError$ObserverErrorHandlingError__f_error
    };
    if ((n === 1)) {
      return this.Lcom_raquo_airstream_core_AirstreamError$ObserverErrorHandlingError__f_cause
    };
    throw $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$ct_jl_IndexOutOfBoundsException__T__(new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$c_jl_IndexOutOfBoundsException(), ("" + n))
  };
  toString__T() {
    return ((("ObserverErrorHandlingError: " + this.Lcom_raquo_airstream_core_AirstreamError$ObserverErrorHandlingError__f_error) + "; cause: ") + this.Lcom_raquo_airstream_core_AirstreamError$ObserverErrorHandlingError__f_cause)
  };
}
function $isArrayOf_Lcom_raquo_airstream_core_AirstreamError$ObserverErrorHandlingError(obj, depth) {
  return (!(!(((obj && obj.$classData) && (obj.$classData.arrayDepth === depth)) && obj.$classData.arrayBase.ancestors.Lcom_raquo_airstream_core_AirstreamError$ObserverErrorHandlingError)))
}
var $d_Lcom_raquo_airstream_core_AirstreamError$ObserverErrorHandlingError = new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$TypeData().initClass({
  Lcom_raquo_airstream_core_AirstreamError$ObserverErrorHandlingError: 0
}, false, "com.raquo.airstream.core.AirstreamError$ObserverErrorHandlingError", {
  Lcom_raquo_airstream_core_AirstreamError$ObserverErrorHandlingError: 1,
  Lcom_raquo_airstream_core_AirstreamError: 1,
  jl_Throwable: 1,
  O: 1,
  Ljava_io_Serializable: 1,
  s_Equals: 1,
  s_Product: 1
});
$c_Lcom_raquo_airstream_core_AirstreamError$ObserverErrorHandlingError.prototype.$classData = $d_Lcom_raquo_airstream_core_AirstreamError$ObserverErrorHandlingError;
class $c_Lcom_raquo_airstream_core_AirstreamError$VarError extends $c_Lcom_raquo_airstream_core_AirstreamError {
  constructor(message, cause) {
    super();
    this.Lcom_raquo_airstream_core_AirstreamError$VarError__f_message = null;
    this.Lcom_raquo_airstream_core_AirstreamError$VarError__f_cause = null;
    this.Lcom_raquo_airstream_core_AirstreamError$VarError__f_message = message;
    this.Lcom_raquo_airstream_core_AirstreamError$VarError__f_cause = cause;
    var message$1 = $m_Lcom_raquo_airstream_core_AirstreamError$().com$raquo$airstream$core$AirstreamError$$$VarError$superArg$1__T__s_Option__T(message, cause);
    $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$ct_jl_Throwable__T__jl_Throwable__Z__Z__(this, message$1, null, true, true);
    if ((!cause.isEmpty__Z())) {
      var arg1 = cause.get__O();
      var x$0 = arg1;
      this.initCause__jl_Throwable__jl_Throwable(x$0)
    }
  };
  productIterator__sc_Iterator() {
    return new $c_s_Product$$anon$1(this)
  };
  hashCode__I() {
    var this$2 = $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$m_s_util_hashing_MurmurHash3$();
    return this$2.productHash__s_Product__I__Z__I(this, (-889275714), false)
  };
  equals__O__Z(x$0) {
    if ((this === x$0)) {
      return true
    } else if ((x$0 instanceof $c_Lcom_raquo_airstream_core_AirstreamError$VarError)) {
      var x$0$2 = x$0;
      if ((this.Lcom_raquo_airstream_core_AirstreamError$VarError__f_message === x$0$2.Lcom_raquo_airstream_core_AirstreamError$VarError__f_message)) {
        var x = this.Lcom_raquo_airstream_core_AirstreamError$VarError__f_cause;
        var x$2 = x$0$2.Lcom_raquo_airstream_core_AirstreamError$VarError__f_cause;
        return ((x === null) ? (x$2 === null) : x.equals__O__Z(x$2))
      } else {
        return false
      }
    } else {
      return false
    }
  };
  productArity__I() {
    return 2
  };
  productPrefix__T() {
    return "VarError"
  };
  productElement__I__O(n) {
    if ((n === 0)) {
      return this.Lcom_raquo_airstream_core_AirstreamError$VarError__f_message
    };
    if ((n === 1)) {
      return this.Lcom_raquo_airstream_core_AirstreamError$VarError__f_cause
    };
    throw $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$ct_jl_IndexOutOfBoundsException__T__(new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$c_jl_IndexOutOfBoundsException(), ("" + n))
  };
  toString__T() {
    return ((("VarError: " + this.Lcom_raquo_airstream_core_AirstreamError$VarError__f_message) + "; cause: ") + this.Lcom_raquo_airstream_core_AirstreamError$VarError__f_cause)
  };
}
function $isArrayOf_Lcom_raquo_airstream_core_AirstreamError$VarError(obj, depth) {
  return (!(!(((obj && obj.$classData) && (obj.$classData.arrayDepth === depth)) && obj.$classData.arrayBase.ancestors.Lcom_raquo_airstream_core_AirstreamError$VarError)))
}
var $d_Lcom_raquo_airstream_core_AirstreamError$VarError = new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$TypeData().initClass({
  Lcom_raquo_airstream_core_AirstreamError$VarError: 0
}, false, "com.raquo.airstream.core.AirstreamError$VarError", {
  Lcom_raquo_airstream_core_AirstreamError$VarError: 1,
  Lcom_raquo_airstream_core_AirstreamError: 1,
  jl_Throwable: 1,
  O: 1,
  Ljava_io_Serializable: 1,
  s_Equals: 1,
  s_Product: 1
});
$c_Lcom_raquo_airstream_core_AirstreamError$VarError.prototype.$classData = $d_Lcom_raquo_airstream_core_AirstreamError$VarError;
function $is_Lcom_raquo_airstream_core_EventStream(obj) {
  return (!(!((obj && obj.$classData) && obj.$classData.ancestors.Lcom_raquo_airstream_core_EventStream)))
}
function $isArrayOf_Lcom_raquo_airstream_core_EventStream(obj, depth) {
  return (!(!(((obj && obj.$classData) && (obj.$classData.arrayDepth === depth)) && obj.$classData.arrayBase.ancestors.Lcom_raquo_airstream_core_EventStream)))
}
var $d_Lcom_raquo_airstream_core_EventStream = new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$TypeData().initClass({
  Lcom_raquo_airstream_core_EventStream: 0
}, true, "com.raquo.airstream.core.EventStream", {
  Lcom_raquo_airstream_core_EventStream: 1,
  O: 1,
  Lcom_raquo_airstream_core_Source: 1,
  Lcom_raquo_airstream_core_Named: 1,
  Lcom_raquo_airstream_core_BaseObservable: 1,
  Lcom_raquo_airstream_core_Observable: 1,
  Lcom_raquo_airstream_core_Source$EventSource: 1
});
function $f_Lcom_raquo_airstream_core_Signal__onStart__V($thiz) {
  $thiz.tryNow__s_util_Try()
}
function $is_Lcom_raquo_airstream_core_Signal(obj) {
  return (!(!((obj && obj.$classData) && obj.$classData.ancestors.Lcom_raquo_airstream_core_Signal)))
}
function $isArrayOf_Lcom_raquo_airstream_core_Signal(obj, depth) {
  return (!(!(((obj && obj.$classData) && (obj.$classData.arrayDepth === depth)) && obj.$classData.arrayBase.ancestors.Lcom_raquo_airstream_core_Signal)))
}
var $d_Lcom_raquo_airstream_core_Signal = new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$TypeData().initClass({
  Lcom_raquo_airstream_core_Signal: 0
}, true, "com.raquo.airstream.core.Signal", {
  Lcom_raquo_airstream_core_Signal: 1,
  O: 1,
  Lcom_raquo_airstream_core_Source: 1,
  Lcom_raquo_airstream_core_Named: 1,
  Lcom_raquo_airstream_core_BaseObservable: 1,
  Lcom_raquo_airstream_core_Observable: 1,
  Lcom_raquo_airstream_core_Source$SignalSource: 1
});
function $f_Lcom_raquo_airstream_custom_CustomSource__$init$__V($thiz) {
  $thiz.Lcom_raquo_airstream_custom_CustomStreamSource__f_topoRank = 1;
  $thiz.Lcom_raquo_airstream_custom_CustomStreamSource__f_startIndex = 0
}
function $f_Lcom_raquo_airstream_custom_CustomSource__onWillStart__V($thiz) {
  $thiz.Lcom_raquo_airstream_custom_CustomStreamSource__f_startIndex = ((1 + $thiz.Lcom_raquo_airstream_custom_CustomStreamSource__f_startIndex) | 0);
  $thiz.Lcom_raquo_airstream_custom_CustomStreamSource__f_config.Lcom_raquo_airstream_custom_CustomSource$Config__f_onWillStart.apply__O()
}
function $f_Lcom_raquo_airstream_custom_CustomSource__onStart__V($thiz) {
  try {
    var $$x1 = new $c_s_util_Success(($thiz.Lcom_raquo_airstream_custom_CustomStreamSource__f_config.Lcom_raquo_airstream_custom_CustomSource$Config__f_onStart.apply__O(), (void 0)))
  } catch (e) {
    var e$2 = ((e instanceof $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$c_jl_Throwable) ? e : new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$c_sjs_js_JavaScriptException(e));
    matchEnd8: {
      var $$x1;
      var o11 = $m_s_util_control_NonFatal$().unapply__jl_Throwable__s_Option(e$2);
      if ((!o11.isEmpty__Z())) {
        var e$3 = o11.get__O();
        var $$x1 = new $c_s_util_Failure(e$3);
        break matchEnd8
      };
      throw ((e$2 instanceof $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$c_sjs_js_JavaScriptException) ? e$2.sjs_js_JavaScriptException__f_exception : e$2)
    }
  };
  $$x1.recover__s_PartialFunction__s_util_Try(new $c_Lcom_raquo_airstream_custom_CustomSource$$anon$1($thiz))
}
function $f_Lcom_raquo_airstream_custom_CustomSource__onStop__V($thiz) {
  $thiz.Lcom_raquo_airstream_custom_CustomStreamSource__f_config.Lcom_raquo_airstream_custom_CustomSource$Config__f_onStop.apply__O()
}
/** @constructor */
function $c_Lcom_raquo_airstream_state_SourceVar(initial) {
  this.Lcom_raquo_airstream_state_SourceVar__f_maybeDisplayName = null;
  this.Lcom_raquo_airstream_state_SourceVar__f_writer = null;
  this.Lcom_raquo_airstream_state_SourceVar__f_currentValue = null;
  this.Lcom_raquo_airstream_state_SourceVar__f__varSignal = null;
  this.Lcom_raquo_airstream_state_SourceVar__f_signal = null;
  this.Lcom_raquo_airstream_state_SourceVar__f_maybeDisplayName = (void 0);
  $f_Lcom_raquo_airstream_state_Var__$init$__V(this);
  this.Lcom_raquo_airstream_state_SourceVar__f_currentValue = initial;
  this.Lcom_raquo_airstream_state_SourceVar__f__varSignal = new $c_Lcom_raquo_airstream_state_VarSignal(this.Lcom_raquo_airstream_state_SourceVar__f_currentValue);
  this.Lcom_raquo_airstream_state_SourceVar__f_signal = this.Lcom_raquo_airstream_state_SourceVar__f__varSignal
}
$c_Lcom_raquo_airstream_state_SourceVar.prototype = new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$h_O();
$c_Lcom_raquo_airstream_state_SourceVar.prototype.constructor = $c_Lcom_raquo_airstream_state_SourceVar;
/** @constructor */
function $h_Lcom_raquo_airstream_state_SourceVar() {
  /*<skip>*/
}
$h_Lcom_raquo_airstream_state_SourceVar.prototype = $c_Lcom_raquo_airstream_state_SourceVar.prototype;
$c_Lcom_raquo_airstream_state_SourceVar.prototype.maybeDisplayName__O = (function() {
  return this.Lcom_raquo_airstream_state_SourceVar__f_maybeDisplayName
});
$c_Lcom_raquo_airstream_state_SourceVar.prototype.toString__T = (function() {
  return $f_Lcom_raquo_airstream_core_Named__displayName__T(this)
});
$c_Lcom_raquo_airstream_state_SourceVar.prototype.toObservable__Lcom_raquo_airstream_core_Signal = (function() {
  return this.Lcom_raquo_airstream_state_SourceVar__f_signal
});
$c_Lcom_raquo_airstream_state_SourceVar.prototype.toObserver__Lcom_raquo_airstream_core_Observer = (function() {
  return this.Lcom_raquo_airstream_state_SourceVar__f_writer
});
$c_Lcom_raquo_airstream_state_SourceVar.prototype.setCurrentValue__s_util_Try__Lcom_raquo_airstream_core_Transaction__V = (function(value, transaction) {
  this.Lcom_raquo_airstream_state_SourceVar__f_currentValue = value;
  var this$1 = this.Lcom_raquo_airstream_state_SourceVar__f__varSignal;
  $f_Lcom_raquo_airstream_core_WritableSignal__fireTry__s_util_Try__Lcom_raquo_airstream_core_Transaction__V(this$1, value, transaction)
});
$c_Lcom_raquo_airstream_state_SourceVar.prototype.toObservable__Lcom_raquo_airstream_core_Observable = (function() {
  return this.Lcom_raquo_airstream_state_SourceVar__f_signal
});
var $d_Lcom_raquo_airstream_state_SourceVar = new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$TypeData().initClass({
  Lcom_raquo_airstream_state_SourceVar: 0
}, false, "com.raquo.airstream.state.SourceVar", {
  Lcom_raquo_airstream_state_SourceVar: 1,
  O: 1,
  Lcom_raquo_airstream_core_Source: 1,
  Lcom_raquo_airstream_core_Source$SignalSource: 1,
  Lcom_raquo_airstream_core_Sink: 1,
  Lcom_raquo_airstream_core_Named: 1,
  Lcom_raquo_airstream_state_Var: 1
});
$c_Lcom_raquo_airstream_state_SourceVar.prototype.$classData = $d_Lcom_raquo_airstream_state_SourceVar;
/** @constructor */
function $c_Lcom_raquo_laminar_nodes_ReactiveHtmlElement(tag, ref) {
  this.Lcom_raquo_laminar_nodes_ReactiveHtmlElement__f_com$raquo$laminar$nodes$ChildNode$$_maybeParent = null;
  this.Lcom_raquo_laminar_nodes_ReactiveHtmlElement__f_dynamicOwner = null;
  this.Lcom_raquo_laminar_nodes_ReactiveHtmlElement__f_com$raquo$laminar$nodes$ReactiveElement$$pilotSubscription = null;
  this.Lcom_raquo_laminar_nodes_ReactiveHtmlElement__f_com$raquo$laminar$nodes$ReactiveElement$$maybeEventListeners = null;
  this.Lcom_raquo_laminar_nodes_ReactiveHtmlElement__f_tag = null;
  this.Lcom_raquo_laminar_nodes_ReactiveHtmlElement__f_ref = null;
  this.Lcom_raquo_laminar_nodes_ReactiveHtmlElement__f_tag = tag;
  this.Lcom_raquo_laminar_nodes_ReactiveHtmlElement__f_ref = ref;
  this.Lcom_raquo_laminar_nodes_ReactiveHtmlElement__f_com$raquo$laminar$nodes$ChildNode$$_maybeParent = $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$m_s_None$();
  $f_Lcom_raquo_laminar_nodes_ParentNode__$init$__V(this);
  $f_Lcom_raquo_laminar_nodes_ReactiveElement__$init$__V(this)
}
$c_Lcom_raquo_laminar_nodes_ReactiveHtmlElement.prototype = new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$h_O();
$c_Lcom_raquo_laminar_nodes_ReactiveHtmlElement.prototype.constructor = $c_Lcom_raquo_laminar_nodes_ReactiveHtmlElement;
/** @constructor */
function $h_Lcom_raquo_laminar_nodes_ReactiveHtmlElement() {
  /*<skip>*/
}
$h_Lcom_raquo_laminar_nodes_ReactiveHtmlElement.prototype = $c_Lcom_raquo_laminar_nodes_ReactiveHtmlElement.prototype;
$c_Lcom_raquo_laminar_nodes_ReactiveHtmlElement.prototype.com$raquo$laminar$nodes$ChildNode$$_maybeParent__s_Option = (function() {
  return this.Lcom_raquo_laminar_nodes_ReactiveHtmlElement__f_com$raquo$laminar$nodes$ChildNode$$_maybeParent
});
$c_Lcom_raquo_laminar_nodes_ReactiveHtmlElement.prototype.apply__Lcom_raquo_laminar_nodes_ReactiveElement__V = (function(parentNode) {
  $m_Lcom_raquo_laminar_nodes_ParentNode$().appendChild__Lcom_raquo_laminar_nodes_ParentNode__Lcom_raquo_laminar_nodes_ChildNode__Z(parentNode, this)
});
$c_Lcom_raquo_laminar_nodes_ReactiveHtmlElement.prototype.dynamicOwner__Lcom_raquo_airstream_ownership_DynamicOwner = (function() {
  return this.Lcom_raquo_laminar_nodes_ReactiveHtmlElement__f_dynamicOwner
});
$c_Lcom_raquo_laminar_nodes_ReactiveHtmlElement.prototype.com$raquo$laminar$nodes$ParentNode$_setter_$dynamicOwner_$eq__Lcom_raquo_airstream_ownership_DynamicOwner__V = (function(x$0) {
  this.Lcom_raquo_laminar_nodes_ReactiveHtmlElement__f_dynamicOwner = x$0
});
$c_Lcom_raquo_laminar_nodes_ReactiveHtmlElement.prototype.willSetParent__s_Option__V = (function(maybeNextParent) {
  $f_Lcom_raquo_laminar_nodes_ReactiveElement__willSetParent__s_Option__V(this, maybeNextParent)
});
$c_Lcom_raquo_laminar_nodes_ReactiveHtmlElement.prototype.setParent__s_Option__V = (function(maybeNextParent) {
  $f_Lcom_raquo_laminar_nodes_ReactiveElement__setParent__s_Option__V(this, maybeNextParent)
});
$c_Lcom_raquo_laminar_nodes_ReactiveHtmlElement.prototype.toString__T = (function() {
  return (("ReactiveHtmlElement(" + ((this.Lcom_raquo_laminar_nodes_ReactiveHtmlElement__f_ref !== null) ? this.Lcom_raquo_laminar_nodes_ReactiveHtmlElement__f_ref.outerHTML : ("tag=" + this.Lcom_raquo_laminar_nodes_ReactiveHtmlElement__f_tag.Lcom_raquo_laminar_tags_HtmlTag__f_name))) + ")")
});
$c_Lcom_raquo_laminar_nodes_ReactiveHtmlElement.prototype.ref__Lorg_scalajs_dom_Node = (function() {
  return this.Lcom_raquo_laminar_nodes_ReactiveHtmlElement__f_ref
});
function $isArrayOf_Lcom_raquo_laminar_nodes_ReactiveHtmlElement(obj, depth) {
  return (!(!(((obj && obj.$classData) && (obj.$classData.arrayDepth === depth)) && obj.$classData.arrayBase.ancestors.Lcom_raquo_laminar_nodes_ReactiveHtmlElement)))
}
var $d_Lcom_raquo_laminar_nodes_ReactiveHtmlElement = new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$TypeData().initClass({
  Lcom_raquo_laminar_nodes_ReactiveHtmlElement: 0
}, false, "com.raquo.laminar.nodes.ReactiveHtmlElement", {
  Lcom_raquo_laminar_nodes_ReactiveHtmlElement: 1,
  O: 1,
  Lcom_raquo_laminar_nodes_ReactiveNode: 1,
  Lcom_raquo_laminar_modifiers_Modifier: 1,
  Lcom_raquo_laminar_nodes_ChildNode: 1,
  Lcom_raquo_laminar_nodes_ParentNode: 1,
  Lcom_raquo_laminar_nodes_ReactiveElement: 1
});
$c_Lcom_raquo_laminar_nodes_ReactiveHtmlElement.prototype.$classData = $d_Lcom_raquo_laminar_nodes_ReactiveHtmlElement;
function $isArrayOf_Lcom_raquo_laminar_nodes_ReactiveSvgElement(obj, depth) {
  return (!(!(((obj && obj.$classData) && (obj.$classData.arrayDepth === depth)) && obj.$classData.arrayBase.ancestors.Lcom_raquo_laminar_nodes_ReactiveSvgElement)))
}
function $ct_jl_ArrayIndexOutOfBoundsException__T__($thiz, s) {
  $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$ct_jl_Throwable__T__jl_Throwable__Z__Z__($thiz, s, null, true, true);
  return $thiz
}
function $ct_jl_ArrayIndexOutOfBoundsException__($thiz) {
  $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$ct_jl_Throwable__T__jl_Throwable__Z__Z__($thiz, null, null, true, true);
  return $thiz
}
class $c_jl_ArrayIndexOutOfBoundsException extends $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$c_jl_IndexOutOfBoundsException {
}
var $d_jl_ArrayIndexOutOfBoundsException = new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$TypeData().initClass({
  jl_ArrayIndexOutOfBoundsException: 0
}, false, "java.lang.ArrayIndexOutOfBoundsException", {
  jl_ArrayIndexOutOfBoundsException: 1,
  jl_IndexOutOfBoundsException: 1,
  jl_RuntimeException: 1,
  jl_Exception: 1,
  jl_Throwable: 1,
  O: 1,
  Ljava_io_Serializable: 1
});
$c_jl_ArrayIndexOutOfBoundsException.prototype.$classData = $d_jl_ArrayIndexOutOfBoundsException;
function $f_sc_MapOps__applyOrElse__O__F1__O($thiz, x, default$1) {
  return $thiz.getOrElse__O__F0__O(x, new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$c_sjsr_AnonFunction0((() => default$1.apply__O__O(x))))
}
function $f_sc_MapOps__foreachEntry__F2__V($thiz, f) {
  var it = $thiz.iterator__sc_Iterator();
  while (it.hasNext__Z()) {
    var next = it.next__O();
    f.apply__O__O__O(next._1__O(), next._2__O())
  }
}
function $f_sc_MapOps__addString__scm_StringBuilder__T__T__T__scm_StringBuilder($thiz, sb, start, sep, end) {
  var this$2 = $thiz.iterator__sc_Iterator();
  var f = new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$c_sjsr_AnonFunction1(((x0$1$2) => {
    var x0$1 = x0$1$2;
    if ((x0$1 !== null)) {
      var k = x0$1._1__O();
      var v = x0$1._2__O();
      return ((k + " -> ") + v)
    } else {
      throw new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$c_s_MatchError(x0$1)
    }
  }));
  var this$3 = new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$c_sc_Iterator$$anon$9(this$2, f);
  return $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$f_sc_IterableOnceOps__addString__scm_StringBuilder__T__T__T__scm_StringBuilder(this$3, sb, start, sep, end)
}
/** @constructor */
function $c_sci_Map$Map2$$anon$1(outer) {
  this.sci_Map$Map2$Map2Iterator__f_i = 0;
  this.sci_Map$Map2$Map2Iterator__f_$outer = null;
  $ct_sci_Map$Map2$Map2Iterator__sci_Map$Map2__(this, outer)
}
$c_sci_Map$Map2$$anon$1.prototype = new $h_sci_Map$Map2$Map2Iterator();
$c_sci_Map$Map2$$anon$1.prototype.constructor = $c_sci_Map$Map2$$anon$1;
/** @constructor */
function $h_sci_Map$Map2$$anon$1() {
  /*<skip>*/
}
$h_sci_Map$Map2$$anon$1.prototype = $c_sci_Map$Map2$$anon$1.prototype;
var $d_sci_Map$Map2$$anon$1 = new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$TypeData().initClass({
  sci_Map$Map2$$anon$1: 0
}, false, "scala.collection.immutable.Map$Map2$$anon$1", {
  sci_Map$Map2$$anon$1: 1,
  sci_Map$Map2$Map2Iterator: 1,
  sc_AbstractIterator: 1,
  O: 1,
  sc_Iterator: 1,
  sc_IterableOnce: 1,
  sc_IterableOnceOps: 1
});
$c_sci_Map$Map2$$anon$1.prototype.$classData = $d_sci_Map$Map2$$anon$1;
/** @constructor */
function $c_sci_Map$Map3$$anon$4(outer) {
  this.sci_Map$Map3$Map3Iterator__f_i = 0;
  this.sci_Map$Map3$Map3Iterator__f_$outer = null;
  $ct_sci_Map$Map3$Map3Iterator__sci_Map$Map3__(this, outer)
}
$c_sci_Map$Map3$$anon$4.prototype = new $h_sci_Map$Map3$Map3Iterator();
$c_sci_Map$Map3$$anon$4.prototype.constructor = $c_sci_Map$Map3$$anon$4;
/** @constructor */
function $h_sci_Map$Map3$$anon$4() {
  /*<skip>*/
}
$h_sci_Map$Map3$$anon$4.prototype = $c_sci_Map$Map3$$anon$4.prototype;
var $d_sci_Map$Map3$$anon$4 = new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$TypeData().initClass({
  sci_Map$Map3$$anon$4: 0
}, false, "scala.collection.immutable.Map$Map3$$anon$4", {
  sci_Map$Map3$$anon$4: 1,
  sci_Map$Map3$Map3Iterator: 1,
  sc_AbstractIterator: 1,
  O: 1,
  sc_Iterator: 1,
  sc_IterableOnce: 1,
  sc_IterableOnceOps: 1
});
$c_sci_Map$Map3$$anon$4.prototype.$classData = $d_sci_Map$Map3$$anon$4;
/** @constructor */
function $c_sci_Map$Map4$$anon$7(outer) {
  this.sci_Map$Map4$Map4Iterator__f_i = 0;
  this.sci_Map$Map4$Map4Iterator__f_$outer = null;
  $ct_sci_Map$Map4$Map4Iterator__sci_Map$Map4__(this, outer)
}
$c_sci_Map$Map4$$anon$7.prototype = new $h_sci_Map$Map4$Map4Iterator();
$c_sci_Map$Map4$$anon$7.prototype.constructor = $c_sci_Map$Map4$$anon$7;
/** @constructor */
function $h_sci_Map$Map4$$anon$7() {
  /*<skip>*/
}
$h_sci_Map$Map4$$anon$7.prototype = $c_sci_Map$Map4$$anon$7.prototype;
var $d_sci_Map$Map4$$anon$7 = new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$TypeData().initClass({
  sci_Map$Map4$$anon$7: 0
}, false, "scala.collection.immutable.Map$Map4$$anon$7", {
  sci_Map$Map4$$anon$7: 1,
  sci_Map$Map4$Map4Iterator: 1,
  sc_AbstractIterator: 1,
  O: 1,
  sc_Iterator: 1,
  sc_IterableOnce: 1,
  sc_IterableOnceOps: 1
});
$c_sci_Map$Map4$$anon$7.prototype.$classData = $d_sci_Map$Map4$$anon$7;
/** @constructor */
function $c_Lcom_raquo_laminar_defs_styles_StyleProps$$anon$2(key$2) {
  this.Lcom_raquo_laminar_keys_StyleProp__f_name = null;
  this.Lcom_raquo_laminar_keys_StyleProp__f_prefixes = null;
  $ct_Lcom_raquo_laminar_keys_StyleProp__T__sci_Seq__(this, key$2, $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$m_s_package$().s_package$__f_Nil)
}
$c_Lcom_raquo_laminar_defs_styles_StyleProps$$anon$2.prototype = new $h_Lcom_raquo_laminar_keys_StyleProp();
$c_Lcom_raquo_laminar_defs_styles_StyleProps$$anon$2.prototype.constructor = $c_Lcom_raquo_laminar_defs_styles_StyleProps$$anon$2;
/** @constructor */
function $h_Lcom_raquo_laminar_defs_styles_StyleProps$$anon$2() {
  /*<skip>*/
}
$h_Lcom_raquo_laminar_defs_styles_StyleProps$$anon$2.prototype = $c_Lcom_raquo_laminar_defs_styles_StyleProps$$anon$2.prototype;
var $d_Lcom_raquo_laminar_defs_styles_StyleProps$$anon$2 = new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$TypeData().initClass({
  Lcom_raquo_laminar_defs_styles_StyleProps$$anon$2: 0
}, false, "com.raquo.laminar.defs.styles.StyleProps$$anon$2", {
  Lcom_raquo_laminar_defs_styles_StyleProps$$anon$2: 1,
  Lcom_raquo_laminar_keys_StyleProp: 1,
  Lcom_raquo_laminar_keys_Key: 1,
  O: 1,
  Lcom_raquo_laminar_defs_styles_traits_GlobalKeywords: 1,
  Lcom_raquo_laminar_keys_DerivedStyleBuilder: 1,
  Lcom_raquo_laminar_defs_styles_traits_Color: 1,
  Lcom_raquo_laminar_defs_styles_units_Color: 1
});
$c_Lcom_raquo_laminar_defs_styles_StyleProps$$anon$2.prototype.$classData = $d_Lcom_raquo_laminar_defs_styles_StyleProps$$anon$2;
/** @constructor */
function $c_Lcom_raquo_laminar_defs_styles_StyleProps$$anon$5(key$5) {
  this.Lcom_raquo_laminar_keys_StyleProp__f_name = null;
  this.Lcom_raquo_laminar_keys_StyleProp__f_prefixes = null;
  $ct_Lcom_raquo_laminar_keys_StyleProp__T__sci_Seq__(this, key$5, $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$m_s_package$().s_package$__f_Nil)
}
$c_Lcom_raquo_laminar_defs_styles_StyleProps$$anon$5.prototype = new $h_Lcom_raquo_laminar_keys_StyleProp();
$c_Lcom_raquo_laminar_defs_styles_StyleProps$$anon$5.prototype.constructor = $c_Lcom_raquo_laminar_defs_styles_StyleProps$$anon$5;
/** @constructor */
function $h_Lcom_raquo_laminar_defs_styles_StyleProps$$anon$5() {
  /*<skip>*/
}
$h_Lcom_raquo_laminar_defs_styles_StyleProps$$anon$5.prototype = $c_Lcom_raquo_laminar_defs_styles_StyleProps$$anon$5.prototype;
var $d_Lcom_raquo_laminar_defs_styles_StyleProps$$anon$5 = new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$TypeData().initClass({
  Lcom_raquo_laminar_defs_styles_StyleProps$$anon$5: 0
}, false, "com.raquo.laminar.defs.styles.StyleProps$$anon$5", {
  Lcom_raquo_laminar_defs_styles_StyleProps$$anon$5: 1,
  Lcom_raquo_laminar_keys_StyleProp: 1,
  Lcom_raquo_laminar_keys_Key: 1,
  O: 1,
  Lcom_raquo_laminar_defs_styles_traits_GlobalKeywords: 1,
  Lcom_raquo_laminar_keys_DerivedStyleBuilder: 1,
  Lcom_raquo_laminar_defs_styles_units_Calc: 1,
  Lcom_raquo_laminar_defs_styles_units_Length: 1
});
$c_Lcom_raquo_laminar_defs_styles_StyleProps$$anon$5.prototype.$classData = $d_Lcom_raquo_laminar_defs_styles_StyleProps$$anon$5;
function $ct_Ljava_io_PrintStream__Ljava_io_OutputStream__Z__Ljava_nio_charset_Charset__($thiz, _out, autoFlush, charset) {
  $ct_Ljava_io_FilterOutputStream__Ljava_io_OutputStream__($thiz, _out);
  return $thiz
}
/** @constructor */
function $c_Ljava_io_PrintStream() {
  /*<skip>*/
}
$c_Ljava_io_PrintStream.prototype = new $h_Ljava_io_FilterOutputStream();
$c_Ljava_io_PrintStream.prototype.constructor = $c_Ljava_io_PrintStream;
/** @constructor */
function $h_Ljava_io_PrintStream() {
  /*<skip>*/
}
$h_Ljava_io_PrintStream.prototype = $c_Ljava_io_PrintStream.prototype;
$c_Ljava_io_PrintStream.prototype.println__T__V = (function(s) {
  this.print__T__V(s);
  this.java$lang$JSConsoleBasedPrintStream$$printString__T__V("\n")
});
function $isArrayOf_Ljava_io_PrintStream(obj, depth) {
  return (!(!(((obj && obj.$classData) && (obj.$classData.arrayDepth === depth)) && obj.$classData.arrayBase.ancestors.Ljava_io_PrintStream)))
}
class $c_s_concurrent_Future$$anon$1 extends $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$c_ju_NoSuchElementException {
  constructor(t$2) {
    super();
    var s = ("Future.collect partial function is not defined at: " + t$2);
    $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$ct_jl_Throwable__T__jl_Throwable__Z__Z__(this, s, null, true, true)
  };
  fillInStackTrace__jl_Throwable() {
    return $f_s_util_control_NoStackTrace__fillInStackTrace__jl_Throwable(this)
  };
}
var $d_s_concurrent_Future$$anon$1 = new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$TypeData().initClass({
  s_concurrent_Future$$anon$1: 0
}, false, "scala.concurrent.Future$$anon$1", {
  s_concurrent_Future$$anon$1: 1,
  ju_NoSuchElementException: 1,
  jl_RuntimeException: 1,
  jl_Exception: 1,
  jl_Throwable: 1,
  O: 1,
  Ljava_io_Serializable: 1,
  s_util_control_NoStackTrace: 1
});
$c_s_concurrent_Future$$anon$1.prototype.$classData = $d_s_concurrent_Future$$anon$1;
class $c_s_concurrent_Future$$anon$2 extends $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$c_ju_NoSuchElementException {
  constructor() {
    super();
    $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$ct_jl_Throwable__T__jl_Throwable__Z__Z__(this, "Future.filter predicate is not satisfied", null, true, true)
  };
  fillInStackTrace__jl_Throwable() {
    return $f_s_util_control_NoStackTrace__fillInStackTrace__jl_Throwable(this)
  };
}
var $d_s_concurrent_Future$$anon$2 = new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$TypeData().initClass({
  s_concurrent_Future$$anon$2: 0
}, false, "scala.concurrent.Future$$anon$2", {
  s_concurrent_Future$$anon$2: 1,
  ju_NoSuchElementException: 1,
  jl_RuntimeException: 1,
  jl_Exception: 1,
  jl_Throwable: 1,
  O: 1,
  Ljava_io_Serializable: 1,
  s_util_control_NoStackTrace: 1
});
$c_s_concurrent_Future$$anon$2.prototype.$classData = $d_s_concurrent_Future$$anon$2;
class $c_s_concurrent_Future$$anon$3 extends $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$c_ju_NoSuchElementException {
  constructor() {
    super();
    $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$ct_jl_Throwable__T__jl_Throwable__Z__Z__(this, "Future.failed not completed with a throwable.", null, true, true)
  };
  fillInStackTrace__jl_Throwable() {
    return $f_s_util_control_NoStackTrace__fillInStackTrace__jl_Throwable(this)
  };
}
var $d_s_concurrent_Future$$anon$3 = new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$TypeData().initClass({
  s_concurrent_Future$$anon$3: 0
}, false, "scala.concurrent.Future$$anon$3", {
  s_concurrent_Future$$anon$3: 1,
  ju_NoSuchElementException: 1,
  jl_RuntimeException: 1,
  jl_Exception: 1,
  jl_Throwable: 1,
  O: 1,
  Ljava_io_Serializable: 1,
  s_util_control_NoStackTrace: 1
});
$c_s_concurrent_Future$$anon$3.prototype.$classData = $d_s_concurrent_Future$$anon$3;
function $p_s_concurrent_impl_Promise$DefaultPromise__value0__s_util_Try($thiz) {
  var _$this = $thiz;
  while (true) {
    var state = _$this.ju_concurrent_atomic_AtomicReference__f_value;
    if ((state instanceof $c_s_util_Try)) {
      return state
    } else if ((state instanceof $c_s_concurrent_impl_Promise$Link)) {
      _$this = state.promise__s_concurrent_impl_Promise$DefaultPromise__s_concurrent_impl_Promise$DefaultPromise(_$this)
    } else {
      return null
    }
  }
}
function $p_s_concurrent_impl_Promise$DefaultPromise__dispatchOrAddCallbacks__O__s_concurrent_impl_Promise$Callbacks__s_concurrent_impl_Promise$Callbacks($thiz, state, callbacks) {
  var _$this = $thiz;
  while (true) {
    if ((state instanceof $c_s_util_Try)) {
      $p_s_concurrent_impl_Promise$DefaultPromise__submitWithValue__s_concurrent_impl_Promise$Callbacks__s_util_Try__V(_$this, callbacks, state);
      return callbacks
    } else if ($is_s_concurrent_impl_Promise$Callbacks(state)) {
      if (_$this.compareAndSet__O__O__Z(state, ((state !== $m_s_concurrent_impl_Promise$().s_concurrent_impl_Promise$__f_scala$concurrent$impl$Promise$$Noop) ? $p_s_concurrent_impl_Promise$DefaultPromise__concatCallbacks__s_concurrent_impl_Promise$Callbacks__s_concurrent_impl_Promise$Callbacks__s_concurrent_impl_Promise$Callbacks(_$this, callbacks, state) : callbacks))) {
        return callbacks
      } else {
        state = _$this.ju_concurrent_atomic_AtomicReference__f_value
      }
    } else {
      var p = state.promise__s_concurrent_impl_Promise$DefaultPromise__s_concurrent_impl_Promise$DefaultPromise(_$this);
      var temp$state$2 = p.ju_concurrent_atomic_AtomicReference__f_value;
      _$this = p;
      state = temp$state$2
    }
  }
}
function $p_s_concurrent_impl_Promise$DefaultPromise__concatCallbacks__s_concurrent_impl_Promise$Callbacks__s_concurrent_impl_Promise$Callbacks__s_concurrent_impl_Promise$Callbacks($thiz, left, right) {
  while (true) {
    if ((left instanceof $c_s_concurrent_impl_Promise$Transformation)) {
      return new $c_s_concurrent_impl_Promise$ManyCallbacks(left, right)
    } else {
      var m = left;
      var temp$left = m.s_concurrent_impl_Promise$ManyCallbacks__f_rest;
      var temp$right = new $c_s_concurrent_impl_Promise$ManyCallbacks(m.s_concurrent_impl_Promise$ManyCallbacks__f_first, right);
      left = temp$left;
      right = temp$right
    }
  }
}
function $p_s_concurrent_impl_Promise$DefaultPromise__submitWithValue__s_concurrent_impl_Promise$Callbacks__s_util_Try__V($thiz, callbacks, resolved) {
  while ((callbacks instanceof $c_s_concurrent_impl_Promise$ManyCallbacks)) {
    var m = callbacks;
    m.s_concurrent_impl_Promise$ManyCallbacks__f_first.submitWithValue__s_util_Try__s_concurrent_impl_Promise$Transformation(resolved);
    callbacks = m.s_concurrent_impl_Promise$ManyCallbacks__f_rest
  };
  callbacks.submitWithValue__s_util_Try__s_concurrent_impl_Promise$Transformation(resolved)
}
function $ct_s_concurrent_impl_Promise$DefaultPromise__O__($thiz, initial) {
  $ct_ju_concurrent_atomic_AtomicReference__O__($thiz, initial);
  return $thiz
}
function $ct_s_concurrent_impl_Promise$DefaultPromise__s_util_Try__($thiz, result) {
  $ct_s_concurrent_impl_Promise$DefaultPromise__O__($thiz, $m_s_concurrent_impl_Promise$().scala$concurrent$impl$Promise$$resolve__s_util_Try__s_util_Try(result));
  return $thiz
}
function $ct_s_concurrent_impl_Promise$DefaultPromise__($thiz) {
  $ct_s_concurrent_impl_Promise$DefaultPromise__O__($thiz, $m_s_concurrent_impl_Promise$().s_concurrent_impl_Promise$__f_scala$concurrent$impl$Promise$$Noop);
  return $thiz
}
/** @constructor */
function $c_s_concurrent_impl_Promise$DefaultPromise() {
  this.ju_concurrent_atomic_AtomicReference__f_value = null
}
$c_s_concurrent_impl_Promise$DefaultPromise.prototype = new $h_ju_concurrent_atomic_AtomicReference();
$c_s_concurrent_impl_Promise$DefaultPromise.prototype.constructor = $c_s_concurrent_impl_Promise$DefaultPromise;
/** @constructor */
function $h_s_concurrent_impl_Promise$DefaultPromise() {
  /*<skip>*/
}
$h_s_concurrent_impl_Promise$DefaultPromise.prototype = $c_s_concurrent_impl_Promise$DefaultPromise.prototype;
$c_s_concurrent_impl_Promise$DefaultPromise.prototype.flatMap__F1__s_concurrent_ExecutionContext__s_concurrent_Future = (function(f, executor) {
  var state = this.ju_concurrent_atomic_AtomicReference__f_value;
  return ((!(state instanceof $c_s_util_Failure)) ? $p_s_concurrent_impl_Promise$DefaultPromise__dispatchOrAddCallbacks__O__s_concurrent_impl_Promise$Callbacks__s_concurrent_impl_Promise$Callbacks(this, state, $ct_s_concurrent_impl_Promise$Transformation__I__F1__s_concurrent_ExecutionContext__(new $c_s_concurrent_impl_Promise$Transformation(), 2, f, executor)) : this)
});
$c_s_concurrent_impl_Promise$DefaultPromise.prototype.map__F1__s_concurrent_ExecutionContext__s_concurrent_Future = (function(f, executor) {
  var state = this.ju_concurrent_atomic_AtomicReference__f_value;
  return ((!(state instanceof $c_s_util_Failure)) ? $p_s_concurrent_impl_Promise$DefaultPromise__dispatchOrAddCallbacks__O__s_concurrent_impl_Promise$Callbacks__s_concurrent_impl_Promise$Callbacks(this, state, $ct_s_concurrent_impl_Promise$Transformation__I__F1__s_concurrent_ExecutionContext__(new $c_s_concurrent_impl_Promise$Transformation(), 1, f, executor)) : this)
});
$c_s_concurrent_impl_Promise$DefaultPromise.prototype.onComplete__F1__s_concurrent_ExecutionContext__V = (function(func, executor) {
  $p_s_concurrent_impl_Promise$DefaultPromise__dispatchOrAddCallbacks__O__s_concurrent_impl_Promise$Callbacks__s_concurrent_impl_Promise$Callbacks(this, this.ju_concurrent_atomic_AtomicReference__f_value, $ct_s_concurrent_impl_Promise$Transformation__I__F1__s_concurrent_ExecutionContext__(new $c_s_concurrent_impl_Promise$Transformation(), 6, func, executor))
});
$c_s_concurrent_impl_Promise$DefaultPromise.prototype.toString__T = (function() {
  var _$this = this;
  while (true) {
    var state = _$this.ju_concurrent_atomic_AtomicReference__f_value;
    if ((state instanceof $c_s_util_Try)) {
      return (("Future(" + state) + ")")
    } else if ((state instanceof $c_s_concurrent_impl_Promise$Link)) {
      _$this = state.promise__s_concurrent_impl_Promise$DefaultPromise__s_concurrent_impl_Promise$DefaultPromise(_$this)
    } else {
      return "Future(<not completed>)"
    }
  }
});
$c_s_concurrent_impl_Promise$DefaultPromise.prototype.tryComplete__s_util_Try__Z = (function(value) {
  var state = this.ju_concurrent_atomic_AtomicReference__f_value;
  return ((!(state instanceof $c_s_util_Try)) && this.tryComplete0__O__s_util_Try__Z(state, $m_s_concurrent_impl_Promise$().scala$concurrent$impl$Promise$$resolve__s_util_Try__s_util_Try(value)))
});
$c_s_concurrent_impl_Promise$DefaultPromise.prototype.tryComplete0__O__s_util_Try__Z = (function(state, resolved) {
  var _$this = this;
  while (true) {
    if ($is_s_concurrent_impl_Promise$Callbacks(state)) {
      if (_$this.compareAndSet__O__O__Z(state, resolved)) {
        if ((state !== $m_s_concurrent_impl_Promise$().s_concurrent_impl_Promise$__f_scala$concurrent$impl$Promise$$Noop)) {
          $p_s_concurrent_impl_Promise$DefaultPromise__submitWithValue__s_concurrent_impl_Promise$Callbacks__s_util_Try__V(_$this, state, resolved)
        };
        return true
      } else {
        state = _$this.ju_concurrent_atomic_AtomicReference__f_value
      }
    } else if ((state instanceof $c_s_concurrent_impl_Promise$Link)) {
      var p = state.promise__s_concurrent_impl_Promise$DefaultPromise__s_concurrent_impl_Promise$DefaultPromise(_$this);
      if ((p !== _$this)) {
        var temp$state$2 = p.ju_concurrent_atomic_AtomicReference__f_value;
        _$this = p;
        state = temp$state$2
      } else {
        return false
      }
    } else {
      return false
    }
  }
});
$c_s_concurrent_impl_Promise$DefaultPromise.prototype.completeWith__s_concurrent_Future__s_concurrent_impl_Promise$DefaultPromise = (function(other) {
  if ((other !== this)) {
    var state = this.ju_concurrent_atomic_AtomicReference__f_value;
    if ((!(state instanceof $c_s_util_Try))) {
      if ((other instanceof $c_s_concurrent_impl_Promise$DefaultPromise)) {
        var resolved = $p_s_concurrent_impl_Promise$DefaultPromise__value0__s_util_Try(other)
      } else {
        var this$2 = $m_s_Option$().apply__O__s_Option($p_s_concurrent_impl_Promise$DefaultPromise__value0__s_util_Try(other));
        $m_s_$less$colon$less$();
        var resolved = (this$2.isEmpty__Z() ? null : this$2.get__O())
      };
      if ((resolved !== null)) {
        this.tryComplete0__O__s_util_Try__Z(state, resolved)
      } else {
        other.onComplete__F1__s_concurrent_ExecutionContext__V(this, $m_s_concurrent_ExecutionContext$parasitic$())
      }
    }
  };
  return this
});
$c_s_concurrent_impl_Promise$DefaultPromise.prototype.linkRootOf__s_concurrent_impl_Promise$DefaultPromise__s_concurrent_impl_Promise$Link__V = (function(target, link) {
  var _$this = this;
  while (true) {
    if ((_$this !== target)) {
      var state = _$this.ju_concurrent_atomic_AtomicReference__f_value;
      if ((state instanceof $c_s_util_Try)) {
        if ((!target.tryComplete0__O__s_util_Try__Z(target.ju_concurrent_atomic_AtomicReference__f_value, state))) {
          throw new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$c_jl_IllegalStateException("Cannot link completed promises together")
        }
      } else if ($is_s_concurrent_impl_Promise$Callbacks(state)) {
        var l = ((link !== null) ? link : new $c_s_concurrent_impl_Promise$Link(target));
        var p = l.promise__s_concurrent_impl_Promise$DefaultPromise__s_concurrent_impl_Promise$DefaultPromise(_$this);
        if (((_$this !== p) && _$this.compareAndSet__O__O__Z(state, l))) {
          if ((state !== $m_s_concurrent_impl_Promise$().s_concurrent_impl_Promise$__f_scala$concurrent$impl$Promise$$Noop)) {
            $p_s_concurrent_impl_Promise$DefaultPromise__dispatchOrAddCallbacks__O__s_concurrent_impl_Promise$Callbacks__s_concurrent_impl_Promise$Callbacks(p, p.ju_concurrent_atomic_AtomicReference__f_value, state)
          }
        } else {
          target = p;
          link = l;
          continue
        }
      } else {
        _$this = state.promise__s_concurrent_impl_Promise$DefaultPromise__s_concurrent_impl_Promise$DefaultPromise(_$this);
        continue
      }
    };
    break
  }
});
$c_s_concurrent_impl_Promise$DefaultPromise.prototype.unlink__s_util_Try__V = (function(resolved) {
  var _$this = this;
  while (true) {
    var state = _$this.ju_concurrent_atomic_AtomicReference__f_value;
    if ((state instanceof $c_s_concurrent_impl_Promise$Link)) {
      var next = (_$this.compareAndSet__O__O__Z(state, resolved) ? state.ju_concurrent_atomic_AtomicReference__f_value : _$this);
      _$this = next;
      continue
    } else {
      _$this.tryComplete0__O__s_util_Try__Z(state, resolved)
    };
    break
  }
});
$c_s_concurrent_impl_Promise$DefaultPromise.prototype.apply__O__O = (function(v1) {
  var resolved = v1;
  this.tryComplete0__O__s_util_Try__Z(this.ju_concurrent_atomic_AtomicReference__f_value, resolved)
});
function $isArrayOf_s_concurrent_impl_Promise$DefaultPromise(obj, depth) {
  return (!(!(((obj && obj.$classData) && (obj.$classData.arrayDepth === depth)) && obj.$classData.arrayBase.ancestors.s_concurrent_impl_Promise$DefaultPromise)))
}
var $d_s_concurrent_impl_Promise$DefaultPromise = new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$TypeData().initClass({
  s_concurrent_impl_Promise$DefaultPromise: 0
}, false, "scala.concurrent.impl.Promise$DefaultPromise", {
  s_concurrent_impl_Promise$DefaultPromise: 1,
  ju_concurrent_atomic_AtomicReference: 1,
  O: 1,
  Ljava_io_Serializable: 1,
  s_concurrent_Promise: 1,
  s_concurrent_Future: 1,
  s_concurrent_Awaitable: 1,
  F1: 1
});
$c_s_concurrent_impl_Promise$DefaultPromise.prototype.$classData = $d_s_concurrent_impl_Promise$DefaultPromise;
/** @constructor */
function $c_Lbe_doeraene_webcomponents_ui5_configkeys_ButtonDesign$Attention$() {
  /*<skip>*/
}
$c_Lbe_doeraene_webcomponents_ui5_configkeys_ButtonDesign$Attention$.prototype = new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$h_O();
$c_Lbe_doeraene_webcomponents_ui5_configkeys_ButtonDesign$Attention$.prototype.constructor = $c_Lbe_doeraene_webcomponents_ui5_configkeys_ButtonDesign$Attention$;
/** @constructor */
function $h_Lbe_doeraene_webcomponents_ui5_configkeys_ButtonDesign$Attention$() {
  /*<skip>*/
}
$h_Lbe_doeraene_webcomponents_ui5_configkeys_ButtonDesign$Attention$.prototype = $c_Lbe_doeraene_webcomponents_ui5_configkeys_ButtonDesign$Attention$.prototype;
$c_Lbe_doeraene_webcomponents_ui5_configkeys_ButtonDesign$Attention$.prototype.productIterator__sc_Iterator = (function() {
  return new $c_s_Product$$anon$1(this)
});
$c_Lbe_doeraene_webcomponents_ui5_configkeys_ButtonDesign$Attention$.prototype.hashCode__I = (function() {
  return 1650016510
});
$c_Lbe_doeraene_webcomponents_ui5_configkeys_ButtonDesign$Attention$.prototype.toString__T = (function() {
  return "Attention"
});
$c_Lbe_doeraene_webcomponents_ui5_configkeys_ButtonDesign$Attention$.prototype.productArity__I = (function() {
  return 0
});
$c_Lbe_doeraene_webcomponents_ui5_configkeys_ButtonDesign$Attention$.prototype.productPrefix__T = (function() {
  return "Attention"
});
$c_Lbe_doeraene_webcomponents_ui5_configkeys_ButtonDesign$Attention$.prototype.productElement__I__O = (function(n) {
  throw $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$ct_jl_IndexOutOfBoundsException__T__(new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$c_jl_IndexOutOfBoundsException(), ("" + n))
});
var $d_Lbe_doeraene_webcomponents_ui5_configkeys_ButtonDesign$Attention$ = new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$TypeData().initClass({
  Lbe_doeraene_webcomponents_ui5_configkeys_ButtonDesign$Attention$: 0
}, false, "be.doeraene.webcomponents.ui5.configkeys.ButtonDesign$Attention$", {
  Lbe_doeraene_webcomponents_ui5_configkeys_ButtonDesign$Attention$: 1,
  O: 1,
  Lbe_doeraene_webcomponents_ui5_configkeys_ButtonDesign: 1,
  s_Equals: 1,
  s_Product: 1,
  Ljava_io_Serializable: 1,
  s_deriving_Mirror: 1,
  s_deriving_Mirror$Product: 1,
  s_deriving_Mirror$Singleton: 1
});
$c_Lbe_doeraene_webcomponents_ui5_configkeys_ButtonDesign$Attention$.prototype.$classData = $d_Lbe_doeraene_webcomponents_ui5_configkeys_ButtonDesign$Attention$;
var $n_Lbe_doeraene_webcomponents_ui5_configkeys_ButtonDesign$Attention$;
function $m_Lbe_doeraene_webcomponents_ui5_configkeys_ButtonDesign$Attention$() {
  if ((!$n_Lbe_doeraene_webcomponents_ui5_configkeys_ButtonDesign$Attention$)) {
    $n_Lbe_doeraene_webcomponents_ui5_configkeys_ButtonDesign$Attention$ = new $c_Lbe_doeraene_webcomponents_ui5_configkeys_ButtonDesign$Attention$()
  };
  return $n_Lbe_doeraene_webcomponents_ui5_configkeys_ButtonDesign$Attention$
}
/** @constructor */
function $c_Lbe_doeraene_webcomponents_ui5_configkeys_ButtonDesign$Default$() {
  /*<skip>*/
}
$c_Lbe_doeraene_webcomponents_ui5_configkeys_ButtonDesign$Default$.prototype = new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$h_O();
$c_Lbe_doeraene_webcomponents_ui5_configkeys_ButtonDesign$Default$.prototype.constructor = $c_Lbe_doeraene_webcomponents_ui5_configkeys_ButtonDesign$Default$;
/** @constructor */
function $h_Lbe_doeraene_webcomponents_ui5_configkeys_ButtonDesign$Default$() {
  /*<skip>*/
}
$h_Lbe_doeraene_webcomponents_ui5_configkeys_ButtonDesign$Default$.prototype = $c_Lbe_doeraene_webcomponents_ui5_configkeys_ButtonDesign$Default$.prototype;
$c_Lbe_doeraene_webcomponents_ui5_configkeys_ButtonDesign$Default$.prototype.productIterator__sc_Iterator = (function() {
  return new $c_s_Product$$anon$1(this)
});
$c_Lbe_doeraene_webcomponents_ui5_configkeys_ButtonDesign$Default$.prototype.hashCode__I = (function() {
  return (-1085510111)
});
$c_Lbe_doeraene_webcomponents_ui5_configkeys_ButtonDesign$Default$.prototype.toString__T = (function() {
  return "Default"
});
$c_Lbe_doeraene_webcomponents_ui5_configkeys_ButtonDesign$Default$.prototype.productArity__I = (function() {
  return 0
});
$c_Lbe_doeraene_webcomponents_ui5_configkeys_ButtonDesign$Default$.prototype.productPrefix__T = (function() {
  return "Default"
});
$c_Lbe_doeraene_webcomponents_ui5_configkeys_ButtonDesign$Default$.prototype.productElement__I__O = (function(n) {
  throw $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$ct_jl_IndexOutOfBoundsException__T__(new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$c_jl_IndexOutOfBoundsException(), ("" + n))
});
var $d_Lbe_doeraene_webcomponents_ui5_configkeys_ButtonDesign$Default$ = new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$TypeData().initClass({
  Lbe_doeraene_webcomponents_ui5_configkeys_ButtonDesign$Default$: 0
}, false, "be.doeraene.webcomponents.ui5.configkeys.ButtonDesign$Default$", {
  Lbe_doeraene_webcomponents_ui5_configkeys_ButtonDesign$Default$: 1,
  O: 1,
  Lbe_doeraene_webcomponents_ui5_configkeys_ButtonDesign: 1,
  s_Equals: 1,
  s_Product: 1,
  Ljava_io_Serializable: 1,
  s_deriving_Mirror: 1,
  s_deriving_Mirror$Product: 1,
  s_deriving_Mirror$Singleton: 1
});
$c_Lbe_doeraene_webcomponents_ui5_configkeys_ButtonDesign$Default$.prototype.$classData = $d_Lbe_doeraene_webcomponents_ui5_configkeys_ButtonDesign$Default$;
var $n_Lbe_doeraene_webcomponents_ui5_configkeys_ButtonDesign$Default$;
function $m_Lbe_doeraene_webcomponents_ui5_configkeys_ButtonDesign$Default$() {
  if ((!$n_Lbe_doeraene_webcomponents_ui5_configkeys_ButtonDesign$Default$)) {
    $n_Lbe_doeraene_webcomponents_ui5_configkeys_ButtonDesign$Default$ = new $c_Lbe_doeraene_webcomponents_ui5_configkeys_ButtonDesign$Default$()
  };
  return $n_Lbe_doeraene_webcomponents_ui5_configkeys_ButtonDesign$Default$
}
/** @constructor */
function $c_Lbe_doeraene_webcomponents_ui5_configkeys_ButtonDesign$Emphasized$() {
  /*<skip>*/
}
$c_Lbe_doeraene_webcomponents_ui5_configkeys_ButtonDesign$Emphasized$.prototype = new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$h_O();
$c_Lbe_doeraene_webcomponents_ui5_configkeys_ButtonDesign$Emphasized$.prototype.constructor = $c_Lbe_doeraene_webcomponents_ui5_configkeys_ButtonDesign$Emphasized$;
/** @constructor */
function $h_Lbe_doeraene_webcomponents_ui5_configkeys_ButtonDesign$Emphasized$() {
  /*<skip>*/
}
$h_Lbe_doeraene_webcomponents_ui5_configkeys_ButtonDesign$Emphasized$.prototype = $c_Lbe_doeraene_webcomponents_ui5_configkeys_ButtonDesign$Emphasized$.prototype;
$c_Lbe_doeraene_webcomponents_ui5_configkeys_ButtonDesign$Emphasized$.prototype.productIterator__sc_Iterator = (function() {
  return new $c_s_Product$$anon$1(this)
});
$c_Lbe_doeraene_webcomponents_ui5_configkeys_ButtonDesign$Emphasized$.prototype.hashCode__I = (function() {
  return (-1794725502)
});
$c_Lbe_doeraene_webcomponents_ui5_configkeys_ButtonDesign$Emphasized$.prototype.toString__T = (function() {
  return "Emphasized"
});
$c_Lbe_doeraene_webcomponents_ui5_configkeys_ButtonDesign$Emphasized$.prototype.productArity__I = (function() {
  return 0
});
$c_Lbe_doeraene_webcomponents_ui5_configkeys_ButtonDesign$Emphasized$.prototype.productPrefix__T = (function() {
  return "Emphasized"
});
$c_Lbe_doeraene_webcomponents_ui5_configkeys_ButtonDesign$Emphasized$.prototype.productElement__I__O = (function(n) {
  throw $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$ct_jl_IndexOutOfBoundsException__T__(new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$c_jl_IndexOutOfBoundsException(), ("" + n))
});
var $d_Lbe_doeraene_webcomponents_ui5_configkeys_ButtonDesign$Emphasized$ = new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$TypeData().initClass({
  Lbe_doeraene_webcomponents_ui5_configkeys_ButtonDesign$Emphasized$: 0
}, false, "be.doeraene.webcomponents.ui5.configkeys.ButtonDesign$Emphasized$", {
  Lbe_doeraene_webcomponents_ui5_configkeys_ButtonDesign$Emphasized$: 1,
  O: 1,
  Lbe_doeraene_webcomponents_ui5_configkeys_ButtonDesign: 1,
  s_Equals: 1,
  s_Product: 1,
  Ljava_io_Serializable: 1,
  s_deriving_Mirror: 1,
  s_deriving_Mirror$Product: 1,
  s_deriving_Mirror$Singleton: 1
});
$c_Lbe_doeraene_webcomponents_ui5_configkeys_ButtonDesign$Emphasized$.prototype.$classData = $d_Lbe_doeraene_webcomponents_ui5_configkeys_ButtonDesign$Emphasized$;
var $n_Lbe_doeraene_webcomponents_ui5_configkeys_ButtonDesign$Emphasized$;
function $m_Lbe_doeraene_webcomponents_ui5_configkeys_ButtonDesign$Emphasized$() {
  if ((!$n_Lbe_doeraene_webcomponents_ui5_configkeys_ButtonDesign$Emphasized$)) {
    $n_Lbe_doeraene_webcomponents_ui5_configkeys_ButtonDesign$Emphasized$ = new $c_Lbe_doeraene_webcomponents_ui5_configkeys_ButtonDesign$Emphasized$()
  };
  return $n_Lbe_doeraene_webcomponents_ui5_configkeys_ButtonDesign$Emphasized$
}
/** @constructor */
function $c_Lbe_doeraene_webcomponents_ui5_configkeys_ButtonDesign$Negative$() {
  /*<skip>*/
}
$c_Lbe_doeraene_webcomponents_ui5_configkeys_ButtonDesign$Negative$.prototype = new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$h_O();
$c_Lbe_doeraene_webcomponents_ui5_configkeys_ButtonDesign$Negative$.prototype.constructor = $c_Lbe_doeraene_webcomponents_ui5_configkeys_ButtonDesign$Negative$;
/** @constructor */
function $h_Lbe_doeraene_webcomponents_ui5_configkeys_ButtonDesign$Negative$() {
  /*<skip>*/
}
$h_Lbe_doeraene_webcomponents_ui5_configkeys_ButtonDesign$Negative$.prototype = $c_Lbe_doeraene_webcomponents_ui5_configkeys_ButtonDesign$Negative$.prototype;
$c_Lbe_doeraene_webcomponents_ui5_configkeys_ButtonDesign$Negative$.prototype.productIterator__sc_Iterator = (function() {
  return new $c_s_Product$$anon$1(this)
});
$c_Lbe_doeraene_webcomponents_ui5_configkeys_ButtonDesign$Negative$.prototype.hashCode__I = (function() {
  return 985755733
});
$c_Lbe_doeraene_webcomponents_ui5_configkeys_ButtonDesign$Negative$.prototype.toString__T = (function() {
  return "Negative"
});
$c_Lbe_doeraene_webcomponents_ui5_configkeys_ButtonDesign$Negative$.prototype.productArity__I = (function() {
  return 0
});
$c_Lbe_doeraene_webcomponents_ui5_configkeys_ButtonDesign$Negative$.prototype.productPrefix__T = (function() {
  return "Negative"
});
$c_Lbe_doeraene_webcomponents_ui5_configkeys_ButtonDesign$Negative$.prototype.productElement__I__O = (function(n) {
  throw $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$ct_jl_IndexOutOfBoundsException__T__(new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$c_jl_IndexOutOfBoundsException(), ("" + n))
});
var $d_Lbe_doeraene_webcomponents_ui5_configkeys_ButtonDesign$Negative$ = new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$TypeData().initClass({
  Lbe_doeraene_webcomponents_ui5_configkeys_ButtonDesign$Negative$: 0
}, false, "be.doeraene.webcomponents.ui5.configkeys.ButtonDesign$Negative$", {
  Lbe_doeraene_webcomponents_ui5_configkeys_ButtonDesign$Negative$: 1,
  O: 1,
  Lbe_doeraene_webcomponents_ui5_configkeys_ButtonDesign: 1,
  s_Equals: 1,
  s_Product: 1,
  Ljava_io_Serializable: 1,
  s_deriving_Mirror: 1,
  s_deriving_Mirror$Product: 1,
  s_deriving_Mirror$Singleton: 1
});
$c_Lbe_doeraene_webcomponents_ui5_configkeys_ButtonDesign$Negative$.prototype.$classData = $d_Lbe_doeraene_webcomponents_ui5_configkeys_ButtonDesign$Negative$;
var $n_Lbe_doeraene_webcomponents_ui5_configkeys_ButtonDesign$Negative$;
function $m_Lbe_doeraene_webcomponents_ui5_configkeys_ButtonDesign$Negative$() {
  if ((!$n_Lbe_doeraene_webcomponents_ui5_configkeys_ButtonDesign$Negative$)) {
    $n_Lbe_doeraene_webcomponents_ui5_configkeys_ButtonDesign$Negative$ = new $c_Lbe_doeraene_webcomponents_ui5_configkeys_ButtonDesign$Negative$()
  };
  return $n_Lbe_doeraene_webcomponents_ui5_configkeys_ButtonDesign$Negative$
}
/** @constructor */
function $c_Lbe_doeraene_webcomponents_ui5_configkeys_ButtonDesign$Positive$() {
  /*<skip>*/
}
$c_Lbe_doeraene_webcomponents_ui5_configkeys_ButtonDesign$Positive$.prototype = new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$h_O();
$c_Lbe_doeraene_webcomponents_ui5_configkeys_ButtonDesign$Positive$.prototype.constructor = $c_Lbe_doeraene_webcomponents_ui5_configkeys_ButtonDesign$Positive$;
/** @constructor */
function $h_Lbe_doeraene_webcomponents_ui5_configkeys_ButtonDesign$Positive$() {
  /*<skip>*/
}
$h_Lbe_doeraene_webcomponents_ui5_configkeys_ButtonDesign$Positive$.prototype = $c_Lbe_doeraene_webcomponents_ui5_configkeys_ButtonDesign$Positive$.prototype;
$c_Lbe_doeraene_webcomponents_ui5_configkeys_ButtonDesign$Positive$.prototype.productIterator__sc_Iterator = (function() {
  return new $c_s_Product$$anon$1(this)
});
$c_Lbe_doeraene_webcomponents_ui5_configkeys_ButtonDesign$Positive$.prototype.hashCode__I = (function() {
  return 812449305
});
$c_Lbe_doeraene_webcomponents_ui5_configkeys_ButtonDesign$Positive$.prototype.toString__T = (function() {
  return "Positive"
});
$c_Lbe_doeraene_webcomponents_ui5_configkeys_ButtonDesign$Positive$.prototype.productArity__I = (function() {
  return 0
});
$c_Lbe_doeraene_webcomponents_ui5_configkeys_ButtonDesign$Positive$.prototype.productPrefix__T = (function() {
  return "Positive"
});
$c_Lbe_doeraene_webcomponents_ui5_configkeys_ButtonDesign$Positive$.prototype.productElement__I__O = (function(n) {
  throw $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$ct_jl_IndexOutOfBoundsException__T__(new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$c_jl_IndexOutOfBoundsException(), ("" + n))
});
var $d_Lbe_doeraene_webcomponents_ui5_configkeys_ButtonDesign$Positive$ = new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$TypeData().initClass({
  Lbe_doeraene_webcomponents_ui5_configkeys_ButtonDesign$Positive$: 0
}, false, "be.doeraene.webcomponents.ui5.configkeys.ButtonDesign$Positive$", {
  Lbe_doeraene_webcomponents_ui5_configkeys_ButtonDesign$Positive$: 1,
  O: 1,
  Lbe_doeraene_webcomponents_ui5_configkeys_ButtonDesign: 1,
  s_Equals: 1,
  s_Product: 1,
  Ljava_io_Serializable: 1,
  s_deriving_Mirror: 1,
  s_deriving_Mirror$Product: 1,
  s_deriving_Mirror$Singleton: 1
});
$c_Lbe_doeraene_webcomponents_ui5_configkeys_ButtonDesign$Positive$.prototype.$classData = $d_Lbe_doeraene_webcomponents_ui5_configkeys_ButtonDesign$Positive$;
var $n_Lbe_doeraene_webcomponents_ui5_configkeys_ButtonDesign$Positive$;
function $m_Lbe_doeraene_webcomponents_ui5_configkeys_ButtonDesign$Positive$() {
  if ((!$n_Lbe_doeraene_webcomponents_ui5_configkeys_ButtonDesign$Positive$)) {
    $n_Lbe_doeraene_webcomponents_ui5_configkeys_ButtonDesign$Positive$ = new $c_Lbe_doeraene_webcomponents_ui5_configkeys_ButtonDesign$Positive$()
  };
  return $n_Lbe_doeraene_webcomponents_ui5_configkeys_ButtonDesign$Positive$
}
/** @constructor */
function $c_Lbe_doeraene_webcomponents_ui5_configkeys_ButtonDesign$Transparent$() {
  /*<skip>*/
}
$c_Lbe_doeraene_webcomponents_ui5_configkeys_ButtonDesign$Transparent$.prototype = new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$h_O();
$c_Lbe_doeraene_webcomponents_ui5_configkeys_ButtonDesign$Transparent$.prototype.constructor = $c_Lbe_doeraene_webcomponents_ui5_configkeys_ButtonDesign$Transparent$;
/** @constructor */
function $h_Lbe_doeraene_webcomponents_ui5_configkeys_ButtonDesign$Transparent$() {
  /*<skip>*/
}
$h_Lbe_doeraene_webcomponents_ui5_configkeys_ButtonDesign$Transparent$.prototype = $c_Lbe_doeraene_webcomponents_ui5_configkeys_ButtonDesign$Transparent$.prototype;
$c_Lbe_doeraene_webcomponents_ui5_configkeys_ButtonDesign$Transparent$.prototype.productIterator__sc_Iterator = (function() {
  return new $c_s_Product$$anon$1(this)
});
$c_Lbe_doeraene_webcomponents_ui5_configkeys_ButtonDesign$Transparent$.prototype.hashCode__I = (function() {
  return (-58325710)
});
$c_Lbe_doeraene_webcomponents_ui5_configkeys_ButtonDesign$Transparent$.prototype.toString__T = (function() {
  return "Transparent"
});
$c_Lbe_doeraene_webcomponents_ui5_configkeys_ButtonDesign$Transparent$.prototype.productArity__I = (function() {
  return 0
});
$c_Lbe_doeraene_webcomponents_ui5_configkeys_ButtonDesign$Transparent$.prototype.productPrefix__T = (function() {
  return "Transparent"
});
$c_Lbe_doeraene_webcomponents_ui5_configkeys_ButtonDesign$Transparent$.prototype.productElement__I__O = (function(n) {
  throw $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$ct_jl_IndexOutOfBoundsException__T__(new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$c_jl_IndexOutOfBoundsException(), ("" + n))
});
var $d_Lbe_doeraene_webcomponents_ui5_configkeys_ButtonDesign$Transparent$ = new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$TypeData().initClass({
  Lbe_doeraene_webcomponents_ui5_configkeys_ButtonDesign$Transparent$: 0
}, false, "be.doeraene.webcomponents.ui5.configkeys.ButtonDesign$Transparent$", {
  Lbe_doeraene_webcomponents_ui5_configkeys_ButtonDesign$Transparent$: 1,
  O: 1,
  Lbe_doeraene_webcomponents_ui5_configkeys_ButtonDesign: 1,
  s_Equals: 1,
  s_Product: 1,
  Ljava_io_Serializable: 1,
  s_deriving_Mirror: 1,
  s_deriving_Mirror$Product: 1,
  s_deriving_Mirror$Singleton: 1
});
$c_Lbe_doeraene_webcomponents_ui5_configkeys_ButtonDesign$Transparent$.prototype.$classData = $d_Lbe_doeraene_webcomponents_ui5_configkeys_ButtonDesign$Transparent$;
var $n_Lbe_doeraene_webcomponents_ui5_configkeys_ButtonDesign$Transparent$;
function $m_Lbe_doeraene_webcomponents_ui5_configkeys_ButtonDesign$Transparent$() {
  if ((!$n_Lbe_doeraene_webcomponents_ui5_configkeys_ButtonDesign$Transparent$)) {
    $n_Lbe_doeraene_webcomponents_ui5_configkeys_ButtonDesign$Transparent$ = new $c_Lbe_doeraene_webcomponents_ui5_configkeys_ButtonDesign$Transparent$()
  };
  return $n_Lbe_doeraene_webcomponents_ui5_configkeys_ButtonDesign$Transparent$
}
/** @constructor */
function $c_Lbe_doeraene_webcomponents_ui5_configkeys_ListMode$Delete$() {
  /*<skip>*/
}
$c_Lbe_doeraene_webcomponents_ui5_configkeys_ListMode$Delete$.prototype = new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$h_O();
$c_Lbe_doeraene_webcomponents_ui5_configkeys_ListMode$Delete$.prototype.constructor = $c_Lbe_doeraene_webcomponents_ui5_configkeys_ListMode$Delete$;
/** @constructor */
function $h_Lbe_doeraene_webcomponents_ui5_configkeys_ListMode$Delete$() {
  /*<skip>*/
}
$h_Lbe_doeraene_webcomponents_ui5_configkeys_ListMode$Delete$.prototype = $c_Lbe_doeraene_webcomponents_ui5_configkeys_ListMode$Delete$.prototype;
$c_Lbe_doeraene_webcomponents_ui5_configkeys_ListMode$Delete$.prototype.productIterator__sc_Iterator = (function() {
  return new $c_s_Product$$anon$1(this)
});
$c_Lbe_doeraene_webcomponents_ui5_configkeys_ListMode$Delete$.prototype.hashCode__I = (function() {
  return 2043376075
});
$c_Lbe_doeraene_webcomponents_ui5_configkeys_ListMode$Delete$.prototype.toString__T = (function() {
  return "Delete"
});
$c_Lbe_doeraene_webcomponents_ui5_configkeys_ListMode$Delete$.prototype.productArity__I = (function() {
  return 0
});
$c_Lbe_doeraene_webcomponents_ui5_configkeys_ListMode$Delete$.prototype.productPrefix__T = (function() {
  return "Delete"
});
$c_Lbe_doeraene_webcomponents_ui5_configkeys_ListMode$Delete$.prototype.productElement__I__O = (function(n) {
  throw $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$ct_jl_IndexOutOfBoundsException__T__(new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$c_jl_IndexOutOfBoundsException(), ("" + n))
});
var $d_Lbe_doeraene_webcomponents_ui5_configkeys_ListMode$Delete$ = new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$TypeData().initClass({
  Lbe_doeraene_webcomponents_ui5_configkeys_ListMode$Delete$: 0
}, false, "be.doeraene.webcomponents.ui5.configkeys.ListMode$Delete$", {
  Lbe_doeraene_webcomponents_ui5_configkeys_ListMode$Delete$: 1,
  O: 1,
  Lbe_doeraene_webcomponents_ui5_configkeys_ListMode: 1,
  s_Equals: 1,
  s_Product: 1,
  Ljava_io_Serializable: 1,
  s_deriving_Mirror: 1,
  s_deriving_Mirror$Product: 1,
  s_deriving_Mirror$Singleton: 1
});
$c_Lbe_doeraene_webcomponents_ui5_configkeys_ListMode$Delete$.prototype.$classData = $d_Lbe_doeraene_webcomponents_ui5_configkeys_ListMode$Delete$;
var $n_Lbe_doeraene_webcomponents_ui5_configkeys_ListMode$Delete$;
function $m_Lbe_doeraene_webcomponents_ui5_configkeys_ListMode$Delete$() {
  if ((!$n_Lbe_doeraene_webcomponents_ui5_configkeys_ListMode$Delete$)) {
    $n_Lbe_doeraene_webcomponents_ui5_configkeys_ListMode$Delete$ = new $c_Lbe_doeraene_webcomponents_ui5_configkeys_ListMode$Delete$()
  };
  return $n_Lbe_doeraene_webcomponents_ui5_configkeys_ListMode$Delete$
}
/** @constructor */
function $c_Lbe_doeraene_webcomponents_ui5_configkeys_ListMode$MultiSelect$() {
  /*<skip>*/
}
$c_Lbe_doeraene_webcomponents_ui5_configkeys_ListMode$MultiSelect$.prototype = new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$h_O();
$c_Lbe_doeraene_webcomponents_ui5_configkeys_ListMode$MultiSelect$.prototype.constructor = $c_Lbe_doeraene_webcomponents_ui5_configkeys_ListMode$MultiSelect$;
/** @constructor */
function $h_Lbe_doeraene_webcomponents_ui5_configkeys_ListMode$MultiSelect$() {
  /*<skip>*/
}
$h_Lbe_doeraene_webcomponents_ui5_configkeys_ListMode$MultiSelect$.prototype = $c_Lbe_doeraene_webcomponents_ui5_configkeys_ListMode$MultiSelect$.prototype;
$c_Lbe_doeraene_webcomponents_ui5_configkeys_ListMode$MultiSelect$.prototype.productIterator__sc_Iterator = (function() {
  return new $c_s_Product$$anon$1(this)
});
$c_Lbe_doeraene_webcomponents_ui5_configkeys_ListMode$MultiSelect$.prototype.hashCode__I = (function() {
  return 1393823605
});
$c_Lbe_doeraene_webcomponents_ui5_configkeys_ListMode$MultiSelect$.prototype.toString__T = (function() {
  return "MultiSelect"
});
$c_Lbe_doeraene_webcomponents_ui5_configkeys_ListMode$MultiSelect$.prototype.productArity__I = (function() {
  return 0
});
$c_Lbe_doeraene_webcomponents_ui5_configkeys_ListMode$MultiSelect$.prototype.productPrefix__T = (function() {
  return "MultiSelect"
});
$c_Lbe_doeraene_webcomponents_ui5_configkeys_ListMode$MultiSelect$.prototype.productElement__I__O = (function(n) {
  throw $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$ct_jl_IndexOutOfBoundsException__T__(new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$c_jl_IndexOutOfBoundsException(), ("" + n))
});
var $d_Lbe_doeraene_webcomponents_ui5_configkeys_ListMode$MultiSelect$ = new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$TypeData().initClass({
  Lbe_doeraene_webcomponents_ui5_configkeys_ListMode$MultiSelect$: 0
}, false, "be.doeraene.webcomponents.ui5.configkeys.ListMode$MultiSelect$", {
  Lbe_doeraene_webcomponents_ui5_configkeys_ListMode$MultiSelect$: 1,
  O: 1,
  Lbe_doeraene_webcomponents_ui5_configkeys_ListMode: 1,
  s_Equals: 1,
  s_Product: 1,
  Ljava_io_Serializable: 1,
  s_deriving_Mirror: 1,
  s_deriving_Mirror$Product: 1,
  s_deriving_Mirror$Singleton: 1
});
$c_Lbe_doeraene_webcomponents_ui5_configkeys_ListMode$MultiSelect$.prototype.$classData = $d_Lbe_doeraene_webcomponents_ui5_configkeys_ListMode$MultiSelect$;
var $n_Lbe_doeraene_webcomponents_ui5_configkeys_ListMode$MultiSelect$;
function $m_Lbe_doeraene_webcomponents_ui5_configkeys_ListMode$MultiSelect$() {
  if ((!$n_Lbe_doeraene_webcomponents_ui5_configkeys_ListMode$MultiSelect$)) {
    $n_Lbe_doeraene_webcomponents_ui5_configkeys_ListMode$MultiSelect$ = new $c_Lbe_doeraene_webcomponents_ui5_configkeys_ListMode$MultiSelect$()
  };
  return $n_Lbe_doeraene_webcomponents_ui5_configkeys_ListMode$MultiSelect$
}
/** @constructor */
function $c_Lbe_doeraene_webcomponents_ui5_configkeys_ListMode$None$() {
  /*<skip>*/
}
$c_Lbe_doeraene_webcomponents_ui5_configkeys_ListMode$None$.prototype = new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$h_O();
$c_Lbe_doeraene_webcomponents_ui5_configkeys_ListMode$None$.prototype.constructor = $c_Lbe_doeraene_webcomponents_ui5_configkeys_ListMode$None$;
/** @constructor */
function $h_Lbe_doeraene_webcomponents_ui5_configkeys_ListMode$None$() {
  /*<skip>*/
}
$h_Lbe_doeraene_webcomponents_ui5_configkeys_ListMode$None$.prototype = $c_Lbe_doeraene_webcomponents_ui5_configkeys_ListMode$None$.prototype;
$c_Lbe_doeraene_webcomponents_ui5_configkeys_ListMode$None$.prototype.productIterator__sc_Iterator = (function() {
  return new $c_s_Product$$anon$1(this)
});
$c_Lbe_doeraene_webcomponents_ui5_configkeys_ListMode$None$.prototype.hashCode__I = (function() {
  return 2433880
});
$c_Lbe_doeraene_webcomponents_ui5_configkeys_ListMode$None$.prototype.toString__T = (function() {
  return "None"
});
$c_Lbe_doeraene_webcomponents_ui5_configkeys_ListMode$None$.prototype.productArity__I = (function() {
  return 0
});
$c_Lbe_doeraene_webcomponents_ui5_configkeys_ListMode$None$.prototype.productPrefix__T = (function() {
  return "None"
});
$c_Lbe_doeraene_webcomponents_ui5_configkeys_ListMode$None$.prototype.productElement__I__O = (function(n) {
  throw $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$ct_jl_IndexOutOfBoundsException__T__(new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$c_jl_IndexOutOfBoundsException(), ("" + n))
});
var $d_Lbe_doeraene_webcomponents_ui5_configkeys_ListMode$None$ = new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$TypeData().initClass({
  Lbe_doeraene_webcomponents_ui5_configkeys_ListMode$None$: 0
}, false, "be.doeraene.webcomponents.ui5.configkeys.ListMode$None$", {
  Lbe_doeraene_webcomponents_ui5_configkeys_ListMode$None$: 1,
  O: 1,
  Lbe_doeraene_webcomponents_ui5_configkeys_ListMode: 1,
  s_Equals: 1,
  s_Product: 1,
  Ljava_io_Serializable: 1,
  s_deriving_Mirror: 1,
  s_deriving_Mirror$Product: 1,
  s_deriving_Mirror$Singleton: 1
});
$c_Lbe_doeraene_webcomponents_ui5_configkeys_ListMode$None$.prototype.$classData = $d_Lbe_doeraene_webcomponents_ui5_configkeys_ListMode$None$;
var $n_Lbe_doeraene_webcomponents_ui5_configkeys_ListMode$None$;
function $m_Lbe_doeraene_webcomponents_ui5_configkeys_ListMode$None$() {
  if ((!$n_Lbe_doeraene_webcomponents_ui5_configkeys_ListMode$None$)) {
    $n_Lbe_doeraene_webcomponents_ui5_configkeys_ListMode$None$ = new $c_Lbe_doeraene_webcomponents_ui5_configkeys_ListMode$None$()
  };
  return $n_Lbe_doeraene_webcomponents_ui5_configkeys_ListMode$None$
}
/** @constructor */
function $c_Lbe_doeraene_webcomponents_ui5_configkeys_ListMode$SingleSelect$() {
  /*<skip>*/
}
$c_Lbe_doeraene_webcomponents_ui5_configkeys_ListMode$SingleSelect$.prototype = new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$h_O();
$c_Lbe_doeraene_webcomponents_ui5_configkeys_ListMode$SingleSelect$.prototype.constructor = $c_Lbe_doeraene_webcomponents_ui5_configkeys_ListMode$SingleSelect$;
/** @constructor */
function $h_Lbe_doeraene_webcomponents_ui5_configkeys_ListMode$SingleSelect$() {
  /*<skip>*/
}
$h_Lbe_doeraene_webcomponents_ui5_configkeys_ListMode$SingleSelect$.prototype = $c_Lbe_doeraene_webcomponents_ui5_configkeys_ListMode$SingleSelect$.prototype;
$c_Lbe_doeraene_webcomponents_ui5_configkeys_ListMode$SingleSelect$.prototype.productIterator__sc_Iterator = (function() {
  return new $c_s_Product$$anon$1(this)
});
$c_Lbe_doeraene_webcomponents_ui5_configkeys_ListMode$SingleSelect$.prototype.hashCode__I = (function() {
  return 1958060932
});
$c_Lbe_doeraene_webcomponents_ui5_configkeys_ListMode$SingleSelect$.prototype.toString__T = (function() {
  return "SingleSelect"
});
$c_Lbe_doeraene_webcomponents_ui5_configkeys_ListMode$SingleSelect$.prototype.productArity__I = (function() {
  return 0
});
$c_Lbe_doeraene_webcomponents_ui5_configkeys_ListMode$SingleSelect$.prototype.productPrefix__T = (function() {
  return "SingleSelect"
});
$c_Lbe_doeraene_webcomponents_ui5_configkeys_ListMode$SingleSelect$.prototype.productElement__I__O = (function(n) {
  throw $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$ct_jl_IndexOutOfBoundsException__T__(new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$c_jl_IndexOutOfBoundsException(), ("" + n))
});
var $d_Lbe_doeraene_webcomponents_ui5_configkeys_ListMode$SingleSelect$ = new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$TypeData().initClass({
  Lbe_doeraene_webcomponents_ui5_configkeys_ListMode$SingleSelect$: 0
}, false, "be.doeraene.webcomponents.ui5.configkeys.ListMode$SingleSelect$", {
  Lbe_doeraene_webcomponents_ui5_configkeys_ListMode$SingleSelect$: 1,
  O: 1,
  Lbe_doeraene_webcomponents_ui5_configkeys_ListMode: 1,
  s_Equals: 1,
  s_Product: 1,
  Ljava_io_Serializable: 1,
  s_deriving_Mirror: 1,
  s_deriving_Mirror$Product: 1,
  s_deriving_Mirror$Singleton: 1
});
$c_Lbe_doeraene_webcomponents_ui5_configkeys_ListMode$SingleSelect$.prototype.$classData = $d_Lbe_doeraene_webcomponents_ui5_configkeys_ListMode$SingleSelect$;
var $n_Lbe_doeraene_webcomponents_ui5_configkeys_ListMode$SingleSelect$;
function $m_Lbe_doeraene_webcomponents_ui5_configkeys_ListMode$SingleSelect$() {
  if ((!$n_Lbe_doeraene_webcomponents_ui5_configkeys_ListMode$SingleSelect$)) {
    $n_Lbe_doeraene_webcomponents_ui5_configkeys_ListMode$SingleSelect$ = new $c_Lbe_doeraene_webcomponents_ui5_configkeys_ListMode$SingleSelect$()
  };
  return $n_Lbe_doeraene_webcomponents_ui5_configkeys_ListMode$SingleSelect$
}
/** @constructor */
function $c_Lbe_doeraene_webcomponents_ui5_configkeys_ListMode$SingleSelectBegin$() {
  /*<skip>*/
}
$c_Lbe_doeraene_webcomponents_ui5_configkeys_ListMode$SingleSelectBegin$.prototype = new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$h_O();
$c_Lbe_doeraene_webcomponents_ui5_configkeys_ListMode$SingleSelectBegin$.prototype.constructor = $c_Lbe_doeraene_webcomponents_ui5_configkeys_ListMode$SingleSelectBegin$;
/** @constructor */
function $h_Lbe_doeraene_webcomponents_ui5_configkeys_ListMode$SingleSelectBegin$() {
  /*<skip>*/
}
$h_Lbe_doeraene_webcomponents_ui5_configkeys_ListMode$SingleSelectBegin$.prototype = $c_Lbe_doeraene_webcomponents_ui5_configkeys_ListMode$SingleSelectBegin$.prototype;
$c_Lbe_doeraene_webcomponents_ui5_configkeys_ListMode$SingleSelectBegin$.prototype.productIterator__sc_Iterator = (function() {
  return new $c_s_Product$$anon$1(this)
});
$c_Lbe_doeraene_webcomponents_ui5_configkeys_ListMode$SingleSelectBegin$.prototype.hashCode__I = (function() {
  return 1063876485
});
$c_Lbe_doeraene_webcomponents_ui5_configkeys_ListMode$SingleSelectBegin$.prototype.toString__T = (function() {
  return "SingleSelectBegin"
});
$c_Lbe_doeraene_webcomponents_ui5_configkeys_ListMode$SingleSelectBegin$.prototype.productArity__I = (function() {
  return 0
});
$c_Lbe_doeraene_webcomponents_ui5_configkeys_ListMode$SingleSelectBegin$.prototype.productPrefix__T = (function() {
  return "SingleSelectBegin"
});
$c_Lbe_doeraene_webcomponents_ui5_configkeys_ListMode$SingleSelectBegin$.prototype.productElement__I__O = (function(n) {
  throw $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$ct_jl_IndexOutOfBoundsException__T__(new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$c_jl_IndexOutOfBoundsException(), ("" + n))
});
var $d_Lbe_doeraene_webcomponents_ui5_configkeys_ListMode$SingleSelectBegin$ = new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$TypeData().initClass({
  Lbe_doeraene_webcomponents_ui5_configkeys_ListMode$SingleSelectBegin$: 0
}, false, "be.doeraene.webcomponents.ui5.configkeys.ListMode$SingleSelectBegin$", {
  Lbe_doeraene_webcomponents_ui5_configkeys_ListMode$SingleSelectBegin$: 1,
  O: 1,
  Lbe_doeraene_webcomponents_ui5_configkeys_ListMode: 1,
  s_Equals: 1,
  s_Product: 1,
  Ljava_io_Serializable: 1,
  s_deriving_Mirror: 1,
  s_deriving_Mirror$Product: 1,
  s_deriving_Mirror$Singleton: 1
});
$c_Lbe_doeraene_webcomponents_ui5_configkeys_ListMode$SingleSelectBegin$.prototype.$classData = $d_Lbe_doeraene_webcomponents_ui5_configkeys_ListMode$SingleSelectBegin$;
var $n_Lbe_doeraene_webcomponents_ui5_configkeys_ListMode$SingleSelectBegin$;
function $m_Lbe_doeraene_webcomponents_ui5_configkeys_ListMode$SingleSelectBegin$() {
  if ((!$n_Lbe_doeraene_webcomponents_ui5_configkeys_ListMode$SingleSelectBegin$)) {
    $n_Lbe_doeraene_webcomponents_ui5_configkeys_ListMode$SingleSelectBegin$ = new $c_Lbe_doeraene_webcomponents_ui5_configkeys_ListMode$SingleSelectBegin$()
  };
  return $n_Lbe_doeraene_webcomponents_ui5_configkeys_ListMode$SingleSelectBegin$
}
/** @constructor */
function $c_Lbe_doeraene_webcomponents_ui5_configkeys_ListMode$SingleSelectEnd$() {
  /*<skip>*/
}
$c_Lbe_doeraene_webcomponents_ui5_configkeys_ListMode$SingleSelectEnd$.prototype = new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$h_O();
$c_Lbe_doeraene_webcomponents_ui5_configkeys_ListMode$SingleSelectEnd$.prototype.constructor = $c_Lbe_doeraene_webcomponents_ui5_configkeys_ListMode$SingleSelectEnd$;
/** @constructor */
function $h_Lbe_doeraene_webcomponents_ui5_configkeys_ListMode$SingleSelectEnd$() {
  /*<skip>*/
}
$h_Lbe_doeraene_webcomponents_ui5_configkeys_ListMode$SingleSelectEnd$.prototype = $c_Lbe_doeraene_webcomponents_ui5_configkeys_ListMode$SingleSelectEnd$.prototype;
$c_Lbe_doeraene_webcomponents_ui5_configkeys_ListMode$SingleSelectEnd$.prototype.productIterator__sc_Iterator = (function() {
  return new $c_s_Product$$anon$1(this)
});
$c_Lbe_doeraene_webcomponents_ui5_configkeys_ListMode$SingleSelectEnd$.prototype.hashCode__I = (function() {
  return (-1652519241)
});
$c_Lbe_doeraene_webcomponents_ui5_configkeys_ListMode$SingleSelectEnd$.prototype.toString__T = (function() {
  return "SingleSelectEnd"
});
$c_Lbe_doeraene_webcomponents_ui5_configkeys_ListMode$SingleSelectEnd$.prototype.productArity__I = (function() {
  return 0
});
$c_Lbe_doeraene_webcomponents_ui5_configkeys_ListMode$SingleSelectEnd$.prototype.productPrefix__T = (function() {
  return "SingleSelectEnd"
});
$c_Lbe_doeraene_webcomponents_ui5_configkeys_ListMode$SingleSelectEnd$.prototype.productElement__I__O = (function(n) {
  throw $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$ct_jl_IndexOutOfBoundsException__T__(new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$c_jl_IndexOutOfBoundsException(), ("" + n))
});
var $d_Lbe_doeraene_webcomponents_ui5_configkeys_ListMode$SingleSelectEnd$ = new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$TypeData().initClass({
  Lbe_doeraene_webcomponents_ui5_configkeys_ListMode$SingleSelectEnd$: 0
}, false, "be.doeraene.webcomponents.ui5.configkeys.ListMode$SingleSelectEnd$", {
  Lbe_doeraene_webcomponents_ui5_configkeys_ListMode$SingleSelectEnd$: 1,
  O: 1,
  Lbe_doeraene_webcomponents_ui5_configkeys_ListMode: 1,
  s_Equals: 1,
  s_Product: 1,
  Ljava_io_Serializable: 1,
  s_deriving_Mirror: 1,
  s_deriving_Mirror$Product: 1,
  s_deriving_Mirror$Singleton: 1
});
$c_Lbe_doeraene_webcomponents_ui5_configkeys_ListMode$SingleSelectEnd$.prototype.$classData = $d_Lbe_doeraene_webcomponents_ui5_configkeys_ListMode$SingleSelectEnd$;
var $n_Lbe_doeraene_webcomponents_ui5_configkeys_ListMode$SingleSelectEnd$;
function $m_Lbe_doeraene_webcomponents_ui5_configkeys_ListMode$SingleSelectEnd$() {
  if ((!$n_Lbe_doeraene_webcomponents_ui5_configkeys_ListMode$SingleSelectEnd$)) {
    $n_Lbe_doeraene_webcomponents_ui5_configkeys_ListMode$SingleSelectEnd$ = new $c_Lbe_doeraene_webcomponents_ui5_configkeys_ListMode$SingleSelectEnd$()
  };
  return $n_Lbe_doeraene_webcomponents_ui5_configkeys_ListMode$SingleSelectEnd$
}
/** @constructor */
function $c_Lbe_doeraene_webcomponents_ui5_configkeys_TitleLevel$H1$() {
  /*<skip>*/
}
$c_Lbe_doeraene_webcomponents_ui5_configkeys_TitleLevel$H1$.prototype = new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$h_O();
$c_Lbe_doeraene_webcomponents_ui5_configkeys_TitleLevel$H1$.prototype.constructor = $c_Lbe_doeraene_webcomponents_ui5_configkeys_TitleLevel$H1$;
/** @constructor */
function $h_Lbe_doeraene_webcomponents_ui5_configkeys_TitleLevel$H1$() {
  /*<skip>*/
}
$h_Lbe_doeraene_webcomponents_ui5_configkeys_TitleLevel$H1$.prototype = $c_Lbe_doeraene_webcomponents_ui5_configkeys_TitleLevel$H1$.prototype;
$c_Lbe_doeraene_webcomponents_ui5_configkeys_TitleLevel$H1$.prototype.productIterator__sc_Iterator = (function() {
  return new $c_s_Product$$anon$1(this)
});
$c_Lbe_doeraene_webcomponents_ui5_configkeys_TitleLevel$H1$.prototype.hashCode__I = (function() {
  return 2281
});
$c_Lbe_doeraene_webcomponents_ui5_configkeys_TitleLevel$H1$.prototype.toString__T = (function() {
  return "H1"
});
$c_Lbe_doeraene_webcomponents_ui5_configkeys_TitleLevel$H1$.prototype.productArity__I = (function() {
  return 0
});
$c_Lbe_doeraene_webcomponents_ui5_configkeys_TitleLevel$H1$.prototype.productPrefix__T = (function() {
  return "H1"
});
$c_Lbe_doeraene_webcomponents_ui5_configkeys_TitleLevel$H1$.prototype.productElement__I__O = (function(n) {
  throw $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$ct_jl_IndexOutOfBoundsException__T__(new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$c_jl_IndexOutOfBoundsException(), ("" + n))
});
var $d_Lbe_doeraene_webcomponents_ui5_configkeys_TitleLevel$H1$ = new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$TypeData().initClass({
  Lbe_doeraene_webcomponents_ui5_configkeys_TitleLevel$H1$: 0
}, false, "be.doeraene.webcomponents.ui5.configkeys.TitleLevel$H1$", {
  Lbe_doeraene_webcomponents_ui5_configkeys_TitleLevel$H1$: 1,
  O: 1,
  Lbe_doeraene_webcomponents_ui5_configkeys_TitleLevel: 1,
  s_Equals: 1,
  s_Product: 1,
  Ljava_io_Serializable: 1,
  s_deriving_Mirror: 1,
  s_deriving_Mirror$Product: 1,
  s_deriving_Mirror$Singleton: 1
});
$c_Lbe_doeraene_webcomponents_ui5_configkeys_TitleLevel$H1$.prototype.$classData = $d_Lbe_doeraene_webcomponents_ui5_configkeys_TitleLevel$H1$;
var $n_Lbe_doeraene_webcomponents_ui5_configkeys_TitleLevel$H1$;
function $m_Lbe_doeraene_webcomponents_ui5_configkeys_TitleLevel$H1$() {
  if ((!$n_Lbe_doeraene_webcomponents_ui5_configkeys_TitleLevel$H1$)) {
    $n_Lbe_doeraene_webcomponents_ui5_configkeys_TitleLevel$H1$ = new $c_Lbe_doeraene_webcomponents_ui5_configkeys_TitleLevel$H1$()
  };
  return $n_Lbe_doeraene_webcomponents_ui5_configkeys_TitleLevel$H1$
}
/** @constructor */
function $c_Lbe_doeraene_webcomponents_ui5_configkeys_TitleLevel$H2$() {
  /*<skip>*/
}
$c_Lbe_doeraene_webcomponents_ui5_configkeys_TitleLevel$H2$.prototype = new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$h_O();
$c_Lbe_doeraene_webcomponents_ui5_configkeys_TitleLevel$H2$.prototype.constructor = $c_Lbe_doeraene_webcomponents_ui5_configkeys_TitleLevel$H2$;
/** @constructor */
function $h_Lbe_doeraene_webcomponents_ui5_configkeys_TitleLevel$H2$() {
  /*<skip>*/
}
$h_Lbe_doeraene_webcomponents_ui5_configkeys_TitleLevel$H2$.prototype = $c_Lbe_doeraene_webcomponents_ui5_configkeys_TitleLevel$H2$.prototype;
$c_Lbe_doeraene_webcomponents_ui5_configkeys_TitleLevel$H2$.prototype.productIterator__sc_Iterator = (function() {
  return new $c_s_Product$$anon$1(this)
});
$c_Lbe_doeraene_webcomponents_ui5_configkeys_TitleLevel$H2$.prototype.hashCode__I = (function() {
  return 2282
});
$c_Lbe_doeraene_webcomponents_ui5_configkeys_TitleLevel$H2$.prototype.toString__T = (function() {
  return "H2"
});
$c_Lbe_doeraene_webcomponents_ui5_configkeys_TitleLevel$H2$.prototype.productArity__I = (function() {
  return 0
});
$c_Lbe_doeraene_webcomponents_ui5_configkeys_TitleLevel$H2$.prototype.productPrefix__T = (function() {
  return "H2"
});
$c_Lbe_doeraene_webcomponents_ui5_configkeys_TitleLevel$H2$.prototype.productElement__I__O = (function(n) {
  throw $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$ct_jl_IndexOutOfBoundsException__T__(new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$c_jl_IndexOutOfBoundsException(), ("" + n))
});
var $d_Lbe_doeraene_webcomponents_ui5_configkeys_TitleLevel$H2$ = new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$TypeData().initClass({
  Lbe_doeraene_webcomponents_ui5_configkeys_TitleLevel$H2$: 0
}, false, "be.doeraene.webcomponents.ui5.configkeys.TitleLevel$H2$", {
  Lbe_doeraene_webcomponents_ui5_configkeys_TitleLevel$H2$: 1,
  O: 1,
  Lbe_doeraene_webcomponents_ui5_configkeys_TitleLevel: 1,
  s_Equals: 1,
  s_Product: 1,
  Ljava_io_Serializable: 1,
  s_deriving_Mirror: 1,
  s_deriving_Mirror$Product: 1,
  s_deriving_Mirror$Singleton: 1
});
$c_Lbe_doeraene_webcomponents_ui5_configkeys_TitleLevel$H2$.prototype.$classData = $d_Lbe_doeraene_webcomponents_ui5_configkeys_TitleLevel$H2$;
var $n_Lbe_doeraene_webcomponents_ui5_configkeys_TitleLevel$H2$;
function $m_Lbe_doeraene_webcomponents_ui5_configkeys_TitleLevel$H2$() {
  if ((!$n_Lbe_doeraene_webcomponents_ui5_configkeys_TitleLevel$H2$)) {
    $n_Lbe_doeraene_webcomponents_ui5_configkeys_TitleLevel$H2$ = new $c_Lbe_doeraene_webcomponents_ui5_configkeys_TitleLevel$H2$()
  };
  return $n_Lbe_doeraene_webcomponents_ui5_configkeys_TitleLevel$H2$
}
/** @constructor */
function $c_Lbe_doeraene_webcomponents_ui5_configkeys_TitleLevel$H3$() {
  /*<skip>*/
}
$c_Lbe_doeraene_webcomponents_ui5_configkeys_TitleLevel$H3$.prototype = new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$h_O();
$c_Lbe_doeraene_webcomponents_ui5_configkeys_TitleLevel$H3$.prototype.constructor = $c_Lbe_doeraene_webcomponents_ui5_configkeys_TitleLevel$H3$;
/** @constructor */
function $h_Lbe_doeraene_webcomponents_ui5_configkeys_TitleLevel$H3$() {
  /*<skip>*/
}
$h_Lbe_doeraene_webcomponents_ui5_configkeys_TitleLevel$H3$.prototype = $c_Lbe_doeraene_webcomponents_ui5_configkeys_TitleLevel$H3$.prototype;
$c_Lbe_doeraene_webcomponents_ui5_configkeys_TitleLevel$H3$.prototype.productIterator__sc_Iterator = (function() {
  return new $c_s_Product$$anon$1(this)
});
$c_Lbe_doeraene_webcomponents_ui5_configkeys_TitleLevel$H3$.prototype.hashCode__I = (function() {
  return 2283
});
$c_Lbe_doeraene_webcomponents_ui5_configkeys_TitleLevel$H3$.prototype.toString__T = (function() {
  return "H3"
});
$c_Lbe_doeraene_webcomponents_ui5_configkeys_TitleLevel$H3$.prototype.productArity__I = (function() {
  return 0
});
$c_Lbe_doeraene_webcomponents_ui5_configkeys_TitleLevel$H3$.prototype.productPrefix__T = (function() {
  return "H3"
});
$c_Lbe_doeraene_webcomponents_ui5_configkeys_TitleLevel$H3$.prototype.productElement__I__O = (function(n) {
  throw $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$ct_jl_IndexOutOfBoundsException__T__(new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$c_jl_IndexOutOfBoundsException(), ("" + n))
});
var $d_Lbe_doeraene_webcomponents_ui5_configkeys_TitleLevel$H3$ = new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$TypeData().initClass({
  Lbe_doeraene_webcomponents_ui5_configkeys_TitleLevel$H3$: 0
}, false, "be.doeraene.webcomponents.ui5.configkeys.TitleLevel$H3$", {
  Lbe_doeraene_webcomponents_ui5_configkeys_TitleLevel$H3$: 1,
  O: 1,
  Lbe_doeraene_webcomponents_ui5_configkeys_TitleLevel: 1,
  s_Equals: 1,
  s_Product: 1,
  Ljava_io_Serializable: 1,
  s_deriving_Mirror: 1,
  s_deriving_Mirror$Product: 1,
  s_deriving_Mirror$Singleton: 1
});
$c_Lbe_doeraene_webcomponents_ui5_configkeys_TitleLevel$H3$.prototype.$classData = $d_Lbe_doeraene_webcomponents_ui5_configkeys_TitleLevel$H3$;
var $n_Lbe_doeraene_webcomponents_ui5_configkeys_TitleLevel$H3$;
function $m_Lbe_doeraene_webcomponents_ui5_configkeys_TitleLevel$H3$() {
  if ((!$n_Lbe_doeraene_webcomponents_ui5_configkeys_TitleLevel$H3$)) {
    $n_Lbe_doeraene_webcomponents_ui5_configkeys_TitleLevel$H3$ = new $c_Lbe_doeraene_webcomponents_ui5_configkeys_TitleLevel$H3$()
  };
  return $n_Lbe_doeraene_webcomponents_ui5_configkeys_TitleLevel$H3$
}
/** @constructor */
function $c_Lbe_doeraene_webcomponents_ui5_configkeys_TitleLevel$H4$() {
  /*<skip>*/
}
$c_Lbe_doeraene_webcomponents_ui5_configkeys_TitleLevel$H4$.prototype = new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$h_O();
$c_Lbe_doeraene_webcomponents_ui5_configkeys_TitleLevel$H4$.prototype.constructor = $c_Lbe_doeraene_webcomponents_ui5_configkeys_TitleLevel$H4$;
/** @constructor */
function $h_Lbe_doeraene_webcomponents_ui5_configkeys_TitleLevel$H4$() {
  /*<skip>*/
}
$h_Lbe_doeraene_webcomponents_ui5_configkeys_TitleLevel$H4$.prototype = $c_Lbe_doeraene_webcomponents_ui5_configkeys_TitleLevel$H4$.prototype;
$c_Lbe_doeraene_webcomponents_ui5_configkeys_TitleLevel$H4$.prototype.productIterator__sc_Iterator = (function() {
  return new $c_s_Product$$anon$1(this)
});
$c_Lbe_doeraene_webcomponents_ui5_configkeys_TitleLevel$H4$.prototype.hashCode__I = (function() {
  return 2284
});
$c_Lbe_doeraene_webcomponents_ui5_configkeys_TitleLevel$H4$.prototype.toString__T = (function() {
  return "H4"
});
$c_Lbe_doeraene_webcomponents_ui5_configkeys_TitleLevel$H4$.prototype.productArity__I = (function() {
  return 0
});
$c_Lbe_doeraene_webcomponents_ui5_configkeys_TitleLevel$H4$.prototype.productPrefix__T = (function() {
  return "H4"
});
$c_Lbe_doeraene_webcomponents_ui5_configkeys_TitleLevel$H4$.prototype.productElement__I__O = (function(n) {
  throw $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$ct_jl_IndexOutOfBoundsException__T__(new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$c_jl_IndexOutOfBoundsException(), ("" + n))
});
var $d_Lbe_doeraene_webcomponents_ui5_configkeys_TitleLevel$H4$ = new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$TypeData().initClass({
  Lbe_doeraene_webcomponents_ui5_configkeys_TitleLevel$H4$: 0
}, false, "be.doeraene.webcomponents.ui5.configkeys.TitleLevel$H4$", {
  Lbe_doeraene_webcomponents_ui5_configkeys_TitleLevel$H4$: 1,
  O: 1,
  Lbe_doeraene_webcomponents_ui5_configkeys_TitleLevel: 1,
  s_Equals: 1,
  s_Product: 1,
  Ljava_io_Serializable: 1,
  s_deriving_Mirror: 1,
  s_deriving_Mirror$Product: 1,
  s_deriving_Mirror$Singleton: 1
});
$c_Lbe_doeraene_webcomponents_ui5_configkeys_TitleLevel$H4$.prototype.$classData = $d_Lbe_doeraene_webcomponents_ui5_configkeys_TitleLevel$H4$;
var $n_Lbe_doeraene_webcomponents_ui5_configkeys_TitleLevel$H4$;
function $m_Lbe_doeraene_webcomponents_ui5_configkeys_TitleLevel$H4$() {
  if ((!$n_Lbe_doeraene_webcomponents_ui5_configkeys_TitleLevel$H4$)) {
    $n_Lbe_doeraene_webcomponents_ui5_configkeys_TitleLevel$H4$ = new $c_Lbe_doeraene_webcomponents_ui5_configkeys_TitleLevel$H4$()
  };
  return $n_Lbe_doeraene_webcomponents_ui5_configkeys_TitleLevel$H4$
}
/** @constructor */
function $c_Lbe_doeraene_webcomponents_ui5_configkeys_TitleLevel$H5$() {
  /*<skip>*/
}
$c_Lbe_doeraene_webcomponents_ui5_configkeys_TitleLevel$H5$.prototype = new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$h_O();
$c_Lbe_doeraene_webcomponents_ui5_configkeys_TitleLevel$H5$.prototype.constructor = $c_Lbe_doeraene_webcomponents_ui5_configkeys_TitleLevel$H5$;
/** @constructor */
function $h_Lbe_doeraene_webcomponents_ui5_configkeys_TitleLevel$H5$() {
  /*<skip>*/
}
$h_Lbe_doeraene_webcomponents_ui5_configkeys_TitleLevel$H5$.prototype = $c_Lbe_doeraene_webcomponents_ui5_configkeys_TitleLevel$H5$.prototype;
$c_Lbe_doeraene_webcomponents_ui5_configkeys_TitleLevel$H5$.prototype.productIterator__sc_Iterator = (function() {
  return new $c_s_Product$$anon$1(this)
});
$c_Lbe_doeraene_webcomponents_ui5_configkeys_TitleLevel$H5$.prototype.hashCode__I = (function() {
  return 2285
});
$c_Lbe_doeraene_webcomponents_ui5_configkeys_TitleLevel$H5$.prototype.toString__T = (function() {
  return "H5"
});
$c_Lbe_doeraene_webcomponents_ui5_configkeys_TitleLevel$H5$.prototype.productArity__I = (function() {
  return 0
});
$c_Lbe_doeraene_webcomponents_ui5_configkeys_TitleLevel$H5$.prototype.productPrefix__T = (function() {
  return "H5"
});
$c_Lbe_doeraene_webcomponents_ui5_configkeys_TitleLevel$H5$.prototype.productElement__I__O = (function(n) {
  throw $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$ct_jl_IndexOutOfBoundsException__T__(new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$c_jl_IndexOutOfBoundsException(), ("" + n))
});
var $d_Lbe_doeraene_webcomponents_ui5_configkeys_TitleLevel$H5$ = new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$TypeData().initClass({
  Lbe_doeraene_webcomponents_ui5_configkeys_TitleLevel$H5$: 0
}, false, "be.doeraene.webcomponents.ui5.configkeys.TitleLevel$H5$", {
  Lbe_doeraene_webcomponents_ui5_configkeys_TitleLevel$H5$: 1,
  O: 1,
  Lbe_doeraene_webcomponents_ui5_configkeys_TitleLevel: 1,
  s_Equals: 1,
  s_Product: 1,
  Ljava_io_Serializable: 1,
  s_deriving_Mirror: 1,
  s_deriving_Mirror$Product: 1,
  s_deriving_Mirror$Singleton: 1
});
$c_Lbe_doeraene_webcomponents_ui5_configkeys_TitleLevel$H5$.prototype.$classData = $d_Lbe_doeraene_webcomponents_ui5_configkeys_TitleLevel$H5$;
var $n_Lbe_doeraene_webcomponents_ui5_configkeys_TitleLevel$H5$;
function $m_Lbe_doeraene_webcomponents_ui5_configkeys_TitleLevel$H5$() {
  if ((!$n_Lbe_doeraene_webcomponents_ui5_configkeys_TitleLevel$H5$)) {
    $n_Lbe_doeraene_webcomponents_ui5_configkeys_TitleLevel$H5$ = new $c_Lbe_doeraene_webcomponents_ui5_configkeys_TitleLevel$H5$()
  };
  return $n_Lbe_doeraene_webcomponents_ui5_configkeys_TitleLevel$H5$
}
/** @constructor */
function $c_Lbe_doeraene_webcomponents_ui5_configkeys_TitleLevel$H6$() {
  /*<skip>*/
}
$c_Lbe_doeraene_webcomponents_ui5_configkeys_TitleLevel$H6$.prototype = new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$h_O();
$c_Lbe_doeraene_webcomponents_ui5_configkeys_TitleLevel$H6$.prototype.constructor = $c_Lbe_doeraene_webcomponents_ui5_configkeys_TitleLevel$H6$;
/** @constructor */
function $h_Lbe_doeraene_webcomponents_ui5_configkeys_TitleLevel$H6$() {
  /*<skip>*/
}
$h_Lbe_doeraene_webcomponents_ui5_configkeys_TitleLevel$H6$.prototype = $c_Lbe_doeraene_webcomponents_ui5_configkeys_TitleLevel$H6$.prototype;
$c_Lbe_doeraene_webcomponents_ui5_configkeys_TitleLevel$H6$.prototype.productIterator__sc_Iterator = (function() {
  return new $c_s_Product$$anon$1(this)
});
$c_Lbe_doeraene_webcomponents_ui5_configkeys_TitleLevel$H6$.prototype.hashCode__I = (function() {
  return 2286
});
$c_Lbe_doeraene_webcomponents_ui5_configkeys_TitleLevel$H6$.prototype.toString__T = (function() {
  return "H6"
});
$c_Lbe_doeraene_webcomponents_ui5_configkeys_TitleLevel$H6$.prototype.productArity__I = (function() {
  return 0
});
$c_Lbe_doeraene_webcomponents_ui5_configkeys_TitleLevel$H6$.prototype.productPrefix__T = (function() {
  return "H6"
});
$c_Lbe_doeraene_webcomponents_ui5_configkeys_TitleLevel$H6$.prototype.productElement__I__O = (function(n) {
  throw $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$ct_jl_IndexOutOfBoundsException__T__(new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$c_jl_IndexOutOfBoundsException(), ("" + n))
});
var $d_Lbe_doeraene_webcomponents_ui5_configkeys_TitleLevel$H6$ = new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$TypeData().initClass({
  Lbe_doeraene_webcomponents_ui5_configkeys_TitleLevel$H6$: 0
}, false, "be.doeraene.webcomponents.ui5.configkeys.TitleLevel$H6$", {
  Lbe_doeraene_webcomponents_ui5_configkeys_TitleLevel$H6$: 1,
  O: 1,
  Lbe_doeraene_webcomponents_ui5_configkeys_TitleLevel: 1,
  s_Equals: 1,
  s_Product: 1,
  Ljava_io_Serializable: 1,
  s_deriving_Mirror: 1,
  s_deriving_Mirror$Product: 1,
  s_deriving_Mirror$Singleton: 1
});
$c_Lbe_doeraene_webcomponents_ui5_configkeys_TitleLevel$H6$.prototype.$classData = $d_Lbe_doeraene_webcomponents_ui5_configkeys_TitleLevel$H6$;
var $n_Lbe_doeraene_webcomponents_ui5_configkeys_TitleLevel$H6$;
function $m_Lbe_doeraene_webcomponents_ui5_configkeys_TitleLevel$H6$() {
  if ((!$n_Lbe_doeraene_webcomponents_ui5_configkeys_TitleLevel$H6$)) {
    $n_Lbe_doeraene_webcomponents_ui5_configkeys_TitleLevel$H6$ = new $c_Lbe_doeraene_webcomponents_ui5_configkeys_TitleLevel$H6$()
  };
  return $n_Lbe_doeraene_webcomponents_ui5_configkeys_TitleLevel$H6$
}
function $f_Lcom_raquo_airstream_core_WritableSignal__setCurrentValue__s_util_Try__Z__V($thiz, newValue, isInitial) {
  if ((!isInitial)) {
    $thiz._lastUpdateId_$eq__I__V($m_Lcom_raquo_airstream_core_Signal$().nextUpdateId__I())
  };
  $thiz.maybeLastSeenCurrentValue_$eq__O__V(newValue)
}
function $f_Lcom_raquo_airstream_core_WritableSignal__tryNow__s_util_Try($thiz) {
  var x = $thiz.maybeLastSeenCurrentValue__O();
  if ((x === (void 0))) {
    $thiz._lastUpdateId_$eq__I__V($m_Lcom_raquo_airstream_core_Signal$().nextUpdateId__I());
    var nextValue = $thiz.currentValueFromParent__s_util_Try();
    $f_Lcom_raquo_airstream_core_WritableSignal__setCurrentValue__s_util_Try__Z__V($thiz, nextValue, true);
    var $$x1 = nextValue
  } else {
    var $$x1 = x
  };
  return $$x1
}
function $f_Lcom_raquo_airstream_core_WritableSignal__fireValue__O__Lcom_raquo_airstream_core_Transaction__V($thiz, nextValue, transaction) {
  var nextValue$1 = new $c_s_util_Success(nextValue);
  $f_Lcom_raquo_airstream_core_WritableSignal__fireTry__s_util_Try__Lcom_raquo_airstream_core_Transaction__V($thiz, nextValue$1, transaction)
}
function $f_Lcom_raquo_airstream_core_WritableSignal__fireError__jl_Throwable__Lcom_raquo_airstream_core_Transaction__V($thiz, nextError, transaction) {
  var nextValue = new $c_s_util_Failure(nextError);
  $f_Lcom_raquo_airstream_core_WritableSignal__fireTry__s_util_Try__Lcom_raquo_airstream_core_Transaction__V($thiz, nextValue, transaction)
}
function $f_Lcom_raquo_airstream_core_WritableSignal__fireTry__s_util_Try__Lcom_raquo_airstream_core_Transaction__V($thiz, nextValue, transaction) {
  $f_Lcom_raquo_airstream_core_WritableSignal__setCurrentValue__s_util_Try__Z__V($thiz, nextValue, false);
  var isError = nextValue.isFailure__Z();
  var elem = false;
  elem = false;
  $thiz.isSafeToRemoveObserver_$eq__Z__V(false);
  var this$ = $thiz.externalObservers__Lcom_raquo_ew_JsArray();
  var index = 0;
  while ((index < (this$.length | 0))) {
    var observer = this$[index];
    index = ((1 + index) | 0);
    var observer$1 = observer;
    observer$1.onTry__s_util_Try__V(nextValue);
    if ((isError && (!elem))) {
      var ev$4 = true;
      elem = ev$4
    }
  };
  var this$$1 = $thiz.internalObservers__Lcom_raquo_ew_JsArray();
  var index$1 = 0;
  while ((index$1 < (this$$1.length | 0))) {
    var observer$2 = this$$1[index$1];
    index$1 = ((1 + index$1) | 0);
    var observer$3 = observer$2;
    observer$3.onTry__s_util_Try__Lcom_raquo_airstream_core_Transaction__V(nextValue, transaction);
    if ((isError && (!elem))) {
      var ev$5 = true;
      elem = ev$5
    }
  };
  $thiz.isSafeToRemoveObserver_$eq__Z__V(true);
  var x = $thiz.maybePendingObserverRemovals__O();
  if ((x !== (void 0))) {
    var i = 0;
    var len = (x.length | 0);
    while ((i < len)) {
      var remove = x[i];
      var remove$1 = remove;
      remove$1.apply__O();
      i = ((1 + i) | 0)
    };
    x.length = 0
  };
  if ((isError && (!elem))) {
    nextValue.fold__F1__F1__O(new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$c_sjsr_AnonFunction1(((err) => {
      var err$1 = err;
      $m_Lcom_raquo_airstream_core_AirstreamError$().sendUnhandledError__jl_Throwable__V(err$1)
    })), new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$c_sjsr_AnonFunction1(((_$1) => (void 0))))
  }
}
function $f_Lcom_raquo_airstream_core_WritableStream__fireValue__O__Lcom_raquo_airstream_core_Transaction__V($thiz, nextValue, transaction) {
  $thiz.isSafeToRemoveObserver_$eq__Z__V(false);
  var this$ = $thiz.externalObservers__Lcom_raquo_ew_JsArray();
  var index = 0;
  while ((index < (this$.length | 0))) {
    var observer = this$[index];
    index = ((1 + index) | 0);
    var observer$1 = observer;
    try {
      observer$1.onNext__O__V(nextValue)
    } catch (e) {
      var e$2 = ((e instanceof $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$c_jl_Throwable) ? e : new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$c_sjs_js_JavaScriptException(e));
      $m_Lcom_raquo_airstream_core_AirstreamError$().sendUnhandledError__jl_Throwable__V(new $c_Lcom_raquo_airstream_core_AirstreamError$ObserverError(e$2))
    }
  };
  var this$$1 = $thiz.internalObservers__Lcom_raquo_ew_JsArray();
  var index$1 = 0;
  while ((index$1 < (this$$1.length | 0))) {
    var observer$2 = this$$1[index$1];
    index$1 = ((1 + index$1) | 0);
    var observer$3 = observer$2;
    observer$3.onNext__O__Lcom_raquo_airstream_core_Transaction__V(nextValue, transaction)
  };
  $thiz.isSafeToRemoveObserver_$eq__Z__V(true);
  var x = $thiz.maybePendingObserverRemovals__O();
  if ((x !== (void 0))) {
    var i = 0;
    var len = (x.length | 0);
    while ((i < len)) {
      var remove = x[i];
      var remove$1 = remove;
      remove$1.apply__O();
      i = ((1 + i) | 0)
    };
    x.length = 0
  }
}
function $f_Lcom_raquo_airstream_core_WritableStream__fireError__jl_Throwable__Lcom_raquo_airstream_core_Transaction__V($thiz, nextError, transaction) {
  $thiz.isSafeToRemoveObserver_$eq__Z__V(false);
  var this$ = $thiz.externalObservers__Lcom_raquo_ew_JsArray();
  var index = 0;
  while ((index < (this$.length | 0))) {
    var observer = this$[index];
    index = ((1 + index) | 0);
    var observer$1 = observer;
    observer$1.onError__jl_Throwable__V(nextError)
  };
  var this$$1 = $thiz.internalObservers__Lcom_raquo_ew_JsArray();
  var index$1 = 0;
  while ((index$1 < (this$$1.length | 0))) {
    var observer$2 = this$$1[index$1];
    index$1 = ((1 + index$1) | 0);
    var observer$3 = observer$2;
    observer$3.onError__jl_Throwable__Lcom_raquo_airstream_core_Transaction__V(nextError, transaction)
  };
  $thiz.isSafeToRemoveObserver_$eq__Z__V(true);
  var x = $thiz.maybePendingObserverRemovals__O();
  if ((x !== (void 0))) {
    var i = 0;
    var len = (x.length | 0);
    while ((i < len)) {
      var remove = x[i];
      var remove$1 = remove;
      remove$1.apply__O();
      i = ((1 + i) | 0)
    };
    x.length = 0
  }
}
function $f_Lcom_raquo_airstream_core_WritableStream__fireTry__s_util_Try__Lcom_raquo_airstream_core_Transaction__V($thiz, nextValue, transaction) {
  nextValue.fold__F1__F1__O(new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$c_sjsr_AnonFunction1(((_$1) => {
    var _$1$1 = _$1;
    $f_Lcom_raquo_airstream_core_WritableStream__fireError__jl_Throwable__Lcom_raquo_airstream_core_Transaction__V($thiz, _$1$1, transaction)
  })), new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$c_sjsr_AnonFunction1(((_$2) => {
    $f_Lcom_raquo_airstream_core_WritableStream__fireValue__O__Lcom_raquo_airstream_core_Transaction__V($thiz, _$2, transaction)
  })))
}
function $p_jl_JSConsoleBasedPrintStream__doWriteLine__T__V($thiz, line) {
  if (((typeof console) !== "undefined")) {
    if (($thiz.jl_JSConsoleBasedPrintStream__f_isErr && (!(!(!(!console.error)))))) {
      console.error(line)
    } else {
      console.log(line)
    }
  }
}
/** @constructor */
function $c_jl_JSConsoleBasedPrintStream(isErr) {
  this.jl_JSConsoleBasedPrintStream__f_isErr = false;
  this.jl_JSConsoleBasedPrintStream__f_buffer = null;
  this.jl_JSConsoleBasedPrintStream__f_isErr = isErr;
  var out = new $c_jl_JSConsoleBasedPrintStream$DummyOutputStream();
  $ct_Ljava_io_PrintStream__Ljava_io_OutputStream__Z__Ljava_nio_charset_Charset__(this, out, false, null);
  this.jl_JSConsoleBasedPrintStream__f_buffer = ""
}
$c_jl_JSConsoleBasedPrintStream.prototype = new $h_Ljava_io_PrintStream();
$c_jl_JSConsoleBasedPrintStream.prototype.constructor = $c_jl_JSConsoleBasedPrintStream;
/** @constructor */
function $h_jl_JSConsoleBasedPrintStream() {
  /*<skip>*/
}
$h_jl_JSConsoleBasedPrintStream.prototype = $c_jl_JSConsoleBasedPrintStream.prototype;
$c_jl_JSConsoleBasedPrintStream.prototype.print__T__V = (function(s) {
  this.java$lang$JSConsoleBasedPrintStream$$printString__T__V(((s === null) ? "null" : s))
});
$c_jl_JSConsoleBasedPrintStream.prototype.java$lang$JSConsoleBasedPrintStream$$printString__T__V = (function(s) {
  var rest = s;
  while ((rest !== "")) {
    var this$1 = rest;
    var nlPos = (this$1.indexOf("\n") | 0);
    if ((nlPos < 0)) {
      this.jl_JSConsoleBasedPrintStream__f_buffer = (("" + this.jl_JSConsoleBasedPrintStream__f_buffer) + rest);
      rest = ""
    } else {
      var $$x1 = this.jl_JSConsoleBasedPrintStream__f_buffer;
      var this$2 = rest;
      $p_jl_JSConsoleBasedPrintStream__doWriteLine__T__V(this, (("" + $$x1) + this$2.substring(0, nlPos)));
      this.jl_JSConsoleBasedPrintStream__f_buffer = "";
      var this$3 = rest;
      var beginIndex = ((1 + nlPos) | 0);
      rest = this$3.substring(beginIndex)
    }
  }
});
var $d_jl_JSConsoleBasedPrintStream = new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$TypeData().initClass({
  jl_JSConsoleBasedPrintStream: 0
}, false, "java.lang.JSConsoleBasedPrintStream", {
  jl_JSConsoleBasedPrintStream: 1,
  Ljava_io_PrintStream: 1,
  Ljava_io_FilterOutputStream: 1,
  Ljava_io_OutputStream: 1,
  O: 1,
  Ljava_io_Closeable: 1,
  jl_AutoCloseable: 1,
  Ljava_io_Flushable: 1,
  jl_Appendable: 1
});
$c_jl_JSConsoleBasedPrintStream.prototype.$classData = $d_jl_JSConsoleBasedPrintStream;
function $f_sci_StrictOptimizedSeqOps__patch__I__sc_IterableOnce__I__O($thiz, from, other, replaced) {
  var b = $thiz.iterableFactory__sc_SeqFactory().newBuilder__scm_Builder();
  var i = 0;
  var it = $thiz.iterator__sc_Iterator();
  while (((i < from) && it.hasNext__Z())) {
    var elem = it.next__O();
    b.addOne__O__scm_Growable(elem);
    i = ((1 + i) | 0)
  };
  b.addAll__sc_IterableOnce__scm_Growable(other);
  i = replaced;
  while (((i > 0) && it.hasNext__Z())) {
    it.next__O();
    i = (((-1) + i) | 0)
  };
  while (it.hasNext__Z()) {
    var elem$1 = it.next__O();
    b.addOne__O__scm_Growable(elem$1)
  };
  return b.result__O()
}
function $f_Lcom_raquo_airstream_common_MultiParentStream__onWillStart__V($thiz) {
  var arr = $thiz.Lcom_raquo_airstream_combine_SampleCombineStreamN__f_parents;
  var i = 0;
  var len = (arr.length | 0);
  while ((i < len)) {
    var _$1 = arr[i];
    var _$1$1 = _$1;
    $m_Lcom_raquo_airstream_core_Protected$();
    $f_Lcom_raquo_airstream_core_BaseObservable__maybeWillStart__V(_$1$1);
    i = ((1 + i) | 0)
  }
}
function $f_Lcom_raquo_airstream_common_SingleParentStream__onStart__V($thiz) {
  var this$1 = $thiz.parent__Lcom_raquo_airstream_core_Observable();
  $f_Lcom_raquo_airstream_core_WritableObservable__addInternalObserver__Lcom_raquo_airstream_core_InternalObserver__Z__V(this$1, $thiz, false)
}
function $f_Lcom_raquo_airstream_common_SingleParentStream__onStop__V($thiz) {
  var this$1 = $thiz.parent__Lcom_raquo_airstream_core_Observable();
  $f_Lcom_raquo_airstream_core_BaseObservable__removeInternalObserver__Lcom_raquo_airstream_core_InternalObserver__V(this$1, $thiz)
}
/** @constructor */
function $c_Lcom_raquo_airstream_custom_CustomStreamSource(makeConfig) {
  this.Lcom_raquo_airstream_custom_CustomStreamSource__f_maybeDisplayName = null;
  this.Lcom_raquo_airstream_custom_CustomStreamSource__f_isSafeToRemoveObserver = false;
  this.Lcom_raquo_airstream_custom_CustomStreamSource__f_maybePendingObserverRemovals = null;
  this.Lcom_raquo_airstream_custom_CustomStreamSource__f_externalObservers = null;
  this.Lcom_raquo_airstream_custom_CustomStreamSource__f_internalObservers = null;
  this.Lcom_raquo_airstream_custom_CustomStreamSource__f_topoRank = 0;
  this.Lcom_raquo_airstream_custom_CustomStreamSource__f_startIndex = 0;
  this.Lcom_raquo_airstream_custom_CustomStreamSource__f_config = null;
  this.Lcom_raquo_airstream_custom_CustomStreamSource__f_maybeDisplayName = (void 0);
  $f_Lcom_raquo_airstream_core_BaseObservable__$init$__V(this);
  $f_Lcom_raquo_airstream_core_WritableObservable__$init$__V(this);
  $f_Lcom_raquo_airstream_custom_CustomSource__$init$__V(this);
  this.Lcom_raquo_airstream_custom_CustomStreamSource__f_config = makeConfig.apply__O__O__O__O__O(new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$c_sjsr_AnonFunction1(((value) => {
    new $c_Lcom_raquo_airstream_core_Transaction(new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$c_sjsr_AnonFunction1(((_$1) => {
      var _$1$1 = _$1;
      $f_Lcom_raquo_airstream_core_WritableStream__fireValue__O__Lcom_raquo_airstream_core_Transaction__V(this, value, _$1$1)
    })))
  })), new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$c_sjsr_AnonFunction1(((err) => {
    var err$1 = err;
    new $c_Lcom_raquo_airstream_core_Transaction(new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$c_sjsr_AnonFunction1(((_$2) => {
      var _$2$1 = _$2;
      $f_Lcom_raquo_airstream_core_WritableStream__fireError__jl_Throwable__Lcom_raquo_airstream_core_Transaction__V(this, err$1, _$2$1)
    })))
  })), new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$c_sjsr_AnonFunction0((() => this.Lcom_raquo_airstream_custom_CustomStreamSource__f_startIndex)), new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$c_sjsr_AnonFunction0((() => $f_Lcom_raquo_airstream_core_BaseObservable__isStarted__Z(this))))
}
$c_Lcom_raquo_airstream_custom_CustomStreamSource.prototype = new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$h_O();
$c_Lcom_raquo_airstream_custom_CustomStreamSource.prototype.constructor = $c_Lcom_raquo_airstream_custom_CustomStreamSource;
/** @constructor */
function $h_Lcom_raquo_airstream_custom_CustomStreamSource() {
  /*<skip>*/
}
$h_Lcom_raquo_airstream_custom_CustomStreamSource.prototype = $c_Lcom_raquo_airstream_custom_CustomStreamSource.prototype;
$c_Lcom_raquo_airstream_custom_CustomStreamSource.prototype.maybeDisplayName__O = (function() {
  return this.Lcom_raquo_airstream_custom_CustomStreamSource__f_maybeDisplayName
});
$c_Lcom_raquo_airstream_custom_CustomStreamSource.prototype.toString__T = (function() {
  return $f_Lcom_raquo_airstream_core_Named__displayName__T(this)
});
$c_Lcom_raquo_airstream_custom_CustomStreamSource.prototype.isSafeToRemoveObserver__Z = (function() {
  return this.Lcom_raquo_airstream_custom_CustomStreamSource__f_isSafeToRemoveObserver
});
$c_Lcom_raquo_airstream_custom_CustomStreamSource.prototype.maybePendingObserverRemovals__O = (function() {
  return this.Lcom_raquo_airstream_custom_CustomStreamSource__f_maybePendingObserverRemovals
});
$c_Lcom_raquo_airstream_custom_CustomStreamSource.prototype.isSafeToRemoveObserver_$eq__Z__V = (function(x$1) {
  this.Lcom_raquo_airstream_custom_CustomStreamSource__f_isSafeToRemoveObserver = x$1
});
$c_Lcom_raquo_airstream_custom_CustomStreamSource.prototype.maybePendingObserverRemovals_$eq__O__V = (function(x$1) {
  this.Lcom_raquo_airstream_custom_CustomStreamSource__f_maybePendingObserverRemovals = x$1
});
$c_Lcom_raquo_airstream_custom_CustomStreamSource.prototype.equals__O__Z = (function(obj) {
  return (this === obj)
});
$c_Lcom_raquo_airstream_custom_CustomStreamSource.prototype.hashCode__I = (function() {
  return $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$systemIdentityHashCode(this)
});
$c_Lcom_raquo_airstream_custom_CustomStreamSource.prototype.onAddedExternalObserver__Lcom_raquo_airstream_core_Observer__V = (function(observer) {
  /*<skip>*/
});
$c_Lcom_raquo_airstream_custom_CustomStreamSource.prototype.externalObservers__Lcom_raquo_ew_JsArray = (function() {
  return this.Lcom_raquo_airstream_custom_CustomStreamSource__f_externalObservers
});
$c_Lcom_raquo_airstream_custom_CustomStreamSource.prototype.internalObservers__Lcom_raquo_ew_JsArray = (function() {
  return this.Lcom_raquo_airstream_custom_CustomStreamSource__f_internalObservers
});
$c_Lcom_raquo_airstream_custom_CustomStreamSource.prototype.com$raquo$airstream$core$WritableObservable$_setter_$externalObservers_$eq__Lcom_raquo_ew_JsArray__V = (function(x$0) {
  this.Lcom_raquo_airstream_custom_CustomStreamSource__f_externalObservers = x$0
});
$c_Lcom_raquo_airstream_custom_CustomStreamSource.prototype.com$raquo$airstream$core$WritableObservable$_setter_$internalObservers_$eq__Lcom_raquo_ew_JsArray__V = (function(x$0) {
  this.Lcom_raquo_airstream_custom_CustomStreamSource__f_internalObservers = x$0
});
$c_Lcom_raquo_airstream_custom_CustomStreamSource.prototype.fireTry__s_util_Try__Lcom_raquo_airstream_core_Transaction__V = (function(nextValue, transaction) {
  $f_Lcom_raquo_airstream_core_WritableStream__fireTry__s_util_Try__Lcom_raquo_airstream_core_Transaction__V(this, nextValue, transaction)
});
$c_Lcom_raquo_airstream_custom_CustomStreamSource.prototype.topoRank__I = (function() {
  return this.Lcom_raquo_airstream_custom_CustomStreamSource__f_topoRank
});
$c_Lcom_raquo_airstream_custom_CustomStreamSource.prototype.onWillStart__V = (function() {
  $f_Lcom_raquo_airstream_custom_CustomSource__onWillStart__V(this)
});
$c_Lcom_raquo_airstream_custom_CustomStreamSource.prototype.onStart__V = (function() {
  $f_Lcom_raquo_airstream_custom_CustomSource__onStart__V(this)
});
$c_Lcom_raquo_airstream_custom_CustomStreamSource.prototype.onStop__V = (function() {
  $f_Lcom_raquo_airstream_custom_CustomSource__onStop__V(this)
});
$c_Lcom_raquo_airstream_custom_CustomStreamSource.prototype.map__F1__Lcom_raquo_airstream_core_Observable = (function(project) {
  return new $c_Lcom_raquo_airstream_misc_MapStream(this, project, $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$m_s_None$())
});
$c_Lcom_raquo_airstream_custom_CustomStreamSource.prototype.toObservable__Lcom_raquo_airstream_core_Observable = (function() {
  return this
});
var $d_Lcom_raquo_airstream_custom_CustomStreamSource = new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$TypeData().initClass({
  Lcom_raquo_airstream_custom_CustomStreamSource: 0
}, false, "com.raquo.airstream.custom.CustomStreamSource", {
  Lcom_raquo_airstream_custom_CustomStreamSource: 1,
  O: 1,
  Lcom_raquo_airstream_core_Source: 1,
  Lcom_raquo_airstream_core_Named: 1,
  Lcom_raquo_airstream_core_BaseObservable: 1,
  Lcom_raquo_airstream_core_Observable: 1,
  Lcom_raquo_airstream_core_Source$EventSource: 1,
  Lcom_raquo_airstream_core_EventStream: 1,
  Lcom_raquo_airstream_core_WritableObservable: 1,
  Lcom_raquo_airstream_core_WritableStream: 1,
  Lcom_raquo_airstream_custom_CustomSource: 1
});
$c_Lcom_raquo_airstream_custom_CustomStreamSource.prototype.$classData = $d_Lcom_raquo_airstream_custom_CustomStreamSource;
/** @constructor */
function $c_Lcom_raquo_airstream_state_Val(constantValue) {
  this.Lcom_raquo_airstream_state_Val__f_maybeDisplayName = null;
  this.Lcom_raquo_airstream_state_Val__f_isSafeToRemoveObserver = false;
  this.Lcom_raquo_airstream_state_Val__f_maybePendingObserverRemovals = null;
  this.Lcom_raquo_airstream_state_Val__f__lastUpdateId = 0;
  this.Lcom_raquo_airstream_state_Val__f_externalObservers = null;
  this.Lcom_raquo_airstream_state_Val__f_internalObservers = null;
  this.Lcom_raquo_airstream_state_Val__f_maybeLastSeenCurrentValue = null;
  this.Lcom_raquo_airstream_state_Val__f_constantValue = null;
  this.Lcom_raquo_airstream_state_Val__f_topoRank = 0;
  this.Lcom_raquo_airstream_state_Val__f_constantValue = constantValue;
  this.Lcom_raquo_airstream_state_Val__f_maybeDisplayName = (void 0);
  $f_Lcom_raquo_airstream_core_BaseObservable__$init$__V(this);
  this.Lcom_raquo_airstream_state_Val__f__lastUpdateId = 0;
  $f_Lcom_raquo_airstream_core_WritableObservable__$init$__V(this);
  this.Lcom_raquo_airstream_state_Val__f_maybeLastSeenCurrentValue = (void 0);
  this.Lcom_raquo_airstream_state_Val__f_topoRank = 1
}
$c_Lcom_raquo_airstream_state_Val.prototype = new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$h_O();
$c_Lcom_raquo_airstream_state_Val.prototype.constructor = $c_Lcom_raquo_airstream_state_Val;
/** @constructor */
function $h_Lcom_raquo_airstream_state_Val() {
  /*<skip>*/
}
$h_Lcom_raquo_airstream_state_Val.prototype = $c_Lcom_raquo_airstream_state_Val.prototype;
$c_Lcom_raquo_airstream_state_Val.prototype.maybeDisplayName__O = (function() {
  return this.Lcom_raquo_airstream_state_Val__f_maybeDisplayName
});
$c_Lcom_raquo_airstream_state_Val.prototype.toString__T = (function() {
  return $f_Lcom_raquo_airstream_core_Named__displayName__T(this)
});
$c_Lcom_raquo_airstream_state_Val.prototype.isSafeToRemoveObserver__Z = (function() {
  return this.Lcom_raquo_airstream_state_Val__f_isSafeToRemoveObserver
});
$c_Lcom_raquo_airstream_state_Val.prototype.maybePendingObserverRemovals__O = (function() {
  return this.Lcom_raquo_airstream_state_Val__f_maybePendingObserverRemovals
});
$c_Lcom_raquo_airstream_state_Val.prototype.isSafeToRemoveObserver_$eq__Z__V = (function(x$1) {
  this.Lcom_raquo_airstream_state_Val__f_isSafeToRemoveObserver = x$1
});
$c_Lcom_raquo_airstream_state_Val.prototype.maybePendingObserverRemovals_$eq__O__V = (function(x$1) {
  this.Lcom_raquo_airstream_state_Val__f_maybePendingObserverRemovals = x$1
});
$c_Lcom_raquo_airstream_state_Val.prototype.onStop__V = (function() {
  /*<skip>*/
});
$c_Lcom_raquo_airstream_state_Val.prototype.equals__O__Z = (function(obj) {
  return (this === obj)
});
$c_Lcom_raquo_airstream_state_Val.prototype.hashCode__I = (function() {
  return $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$systemIdentityHashCode(this)
});
$c_Lcom_raquo_airstream_state_Val.prototype._lastUpdateId__I = (function() {
  return this.Lcom_raquo_airstream_state_Val__f__lastUpdateId
});
$c_Lcom_raquo_airstream_state_Val.prototype._lastUpdateId_$eq__I__V = (function(x$1) {
  this.Lcom_raquo_airstream_state_Val__f__lastUpdateId = x$1
});
$c_Lcom_raquo_airstream_state_Val.prototype.toObservable__Lcom_raquo_airstream_core_Signal = (function() {
  return this
});
$c_Lcom_raquo_airstream_state_Val.prototype.onStart__V = (function() {
  $f_Lcom_raquo_airstream_core_Signal__onStart__V(this)
});
$c_Lcom_raquo_airstream_state_Val.prototype.onAddedExternalObserver__Lcom_raquo_airstream_core_Observer__V = (function(observer) {
  observer.onTry__s_util_Try__V(this.Lcom_raquo_airstream_state_Val__f_constantValue)
});
$c_Lcom_raquo_airstream_state_Val.prototype.externalObservers__Lcom_raquo_ew_JsArray = (function() {
  return this.Lcom_raquo_airstream_state_Val__f_externalObservers
});
$c_Lcom_raquo_airstream_state_Val.prototype.internalObservers__Lcom_raquo_ew_JsArray = (function() {
  return this.Lcom_raquo_airstream_state_Val__f_internalObservers
});
$c_Lcom_raquo_airstream_state_Val.prototype.com$raquo$airstream$core$WritableObservable$_setter_$externalObservers_$eq__Lcom_raquo_ew_JsArray__V = (function(x$0) {
  this.Lcom_raquo_airstream_state_Val__f_externalObservers = x$0
});
$c_Lcom_raquo_airstream_state_Val.prototype.com$raquo$airstream$core$WritableObservable$_setter_$internalObservers_$eq__Lcom_raquo_ew_JsArray__V = (function(x$0) {
  this.Lcom_raquo_airstream_state_Val__f_internalObservers = x$0
});
$c_Lcom_raquo_airstream_state_Val.prototype.maybeLastSeenCurrentValue__O = (function() {
  return this.Lcom_raquo_airstream_state_Val__f_maybeLastSeenCurrentValue
});
$c_Lcom_raquo_airstream_state_Val.prototype.maybeLastSeenCurrentValue_$eq__O__V = (function(x$1) {
  this.Lcom_raquo_airstream_state_Val__f_maybeLastSeenCurrentValue = x$1
});
$c_Lcom_raquo_airstream_state_Val.prototype.fireTry__s_util_Try__Lcom_raquo_airstream_core_Transaction__V = (function(nextValue, transaction) {
  $f_Lcom_raquo_airstream_core_WritableSignal__fireTry__s_util_Try__Lcom_raquo_airstream_core_Transaction__V(this, nextValue, transaction)
});
$c_Lcom_raquo_airstream_state_Val.prototype.topoRank__I = (function() {
  return this.Lcom_raquo_airstream_state_Val__f_topoRank
});
$c_Lcom_raquo_airstream_state_Val.prototype.tryNow__s_util_Try = (function() {
  return this.Lcom_raquo_airstream_state_Val__f_constantValue
});
$c_Lcom_raquo_airstream_state_Val.prototype.currentValueFromParent__s_util_Try = (function() {
  return this.Lcom_raquo_airstream_state_Val__f_constantValue
});
$c_Lcom_raquo_airstream_state_Val.prototype.onWillStart__V = (function() {
  /*<skip>*/
});
$c_Lcom_raquo_airstream_state_Val.prototype.map__F1__Lcom_raquo_airstream_core_Observable = (function(project) {
  return new $c_Lcom_raquo_airstream_misc_MapSignal(this, project, $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$m_s_None$())
});
$c_Lcom_raquo_airstream_state_Val.prototype.toObservable__Lcom_raquo_airstream_core_Observable = (function() {
  return this
});
var $d_Lcom_raquo_airstream_state_Val = new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$TypeData().initClass({
  Lcom_raquo_airstream_state_Val: 0
}, false, "com.raquo.airstream.state.Val", {
  Lcom_raquo_airstream_state_Val: 1,
  O: 1,
  Lcom_raquo_airstream_core_Source: 1,
  Lcom_raquo_airstream_core_Named: 1,
  Lcom_raquo_airstream_core_BaseObservable: 1,
  Lcom_raquo_airstream_core_Observable: 1,
  Lcom_raquo_airstream_core_Source$SignalSource: 1,
  Lcom_raquo_airstream_core_Signal: 1,
  Lcom_raquo_airstream_core_WritableObservable: 1,
  Lcom_raquo_airstream_core_WritableSignal: 1,
  Lcom_raquo_airstream_state_StrictSignal: 1
});
$c_Lcom_raquo_airstream_state_Val.prototype.$classData = $d_Lcom_raquo_airstream_state_Val;
/** @constructor */
function $c_Lcom_raquo_airstream_state_VarSignal(initial) {
  this.Lcom_raquo_airstream_state_VarSignal__f_maybeDisplayName = null;
  this.Lcom_raquo_airstream_state_VarSignal__f_isSafeToRemoveObserver = false;
  this.Lcom_raquo_airstream_state_VarSignal__f_maybePendingObserverRemovals = null;
  this.Lcom_raquo_airstream_state_VarSignal__f__lastUpdateId = 0;
  this.Lcom_raquo_airstream_state_VarSignal__f_externalObservers = null;
  this.Lcom_raquo_airstream_state_VarSignal__f_internalObservers = null;
  this.Lcom_raquo_airstream_state_VarSignal__f_maybeLastSeenCurrentValue = null;
  this.Lcom_raquo_airstream_state_VarSignal__f_topoRank = 0;
  this.Lcom_raquo_airstream_state_VarSignal__f_maybeDisplayName = (void 0);
  $f_Lcom_raquo_airstream_core_BaseObservable__$init$__V(this);
  this.Lcom_raquo_airstream_state_VarSignal__f__lastUpdateId = 0;
  $f_Lcom_raquo_airstream_core_WritableObservable__$init$__V(this);
  this.Lcom_raquo_airstream_state_VarSignal__f_maybeLastSeenCurrentValue = (void 0);
  this.Lcom_raquo_airstream_state_VarSignal__f_topoRank = 1;
  $f_Lcom_raquo_airstream_core_WritableSignal__setCurrentValue__s_util_Try__Z__V(this, initial, true)
}
$c_Lcom_raquo_airstream_state_VarSignal.prototype = new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$h_O();
$c_Lcom_raquo_airstream_state_VarSignal.prototype.constructor = $c_Lcom_raquo_airstream_state_VarSignal;
/** @constructor */
function $h_Lcom_raquo_airstream_state_VarSignal() {
  /*<skip>*/
}
$h_Lcom_raquo_airstream_state_VarSignal.prototype = $c_Lcom_raquo_airstream_state_VarSignal.prototype;
$c_Lcom_raquo_airstream_state_VarSignal.prototype.maybeDisplayName__O = (function() {
  return this.Lcom_raquo_airstream_state_VarSignal__f_maybeDisplayName
});
$c_Lcom_raquo_airstream_state_VarSignal.prototype.toString__T = (function() {
  return $f_Lcom_raquo_airstream_core_Named__displayName__T(this)
});
$c_Lcom_raquo_airstream_state_VarSignal.prototype.isSafeToRemoveObserver__Z = (function() {
  return this.Lcom_raquo_airstream_state_VarSignal__f_isSafeToRemoveObserver
});
$c_Lcom_raquo_airstream_state_VarSignal.prototype.maybePendingObserverRemovals__O = (function() {
  return this.Lcom_raquo_airstream_state_VarSignal__f_maybePendingObserverRemovals
});
$c_Lcom_raquo_airstream_state_VarSignal.prototype.isSafeToRemoveObserver_$eq__Z__V = (function(x$1) {
  this.Lcom_raquo_airstream_state_VarSignal__f_isSafeToRemoveObserver = x$1
});
$c_Lcom_raquo_airstream_state_VarSignal.prototype.maybePendingObserverRemovals_$eq__O__V = (function(x$1) {
  this.Lcom_raquo_airstream_state_VarSignal__f_maybePendingObserverRemovals = x$1
});
$c_Lcom_raquo_airstream_state_VarSignal.prototype.onStop__V = (function() {
  /*<skip>*/
});
$c_Lcom_raquo_airstream_state_VarSignal.prototype.equals__O__Z = (function(obj) {
  return (this === obj)
});
$c_Lcom_raquo_airstream_state_VarSignal.prototype.hashCode__I = (function() {
  return $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$systemIdentityHashCode(this)
});
$c_Lcom_raquo_airstream_state_VarSignal.prototype._lastUpdateId__I = (function() {
  return this.Lcom_raquo_airstream_state_VarSignal__f__lastUpdateId
});
$c_Lcom_raquo_airstream_state_VarSignal.prototype._lastUpdateId_$eq__I__V = (function(x$1) {
  this.Lcom_raquo_airstream_state_VarSignal__f__lastUpdateId = x$1
});
$c_Lcom_raquo_airstream_state_VarSignal.prototype.toObservable__Lcom_raquo_airstream_core_Signal = (function() {
  return this
});
$c_Lcom_raquo_airstream_state_VarSignal.prototype.onStart__V = (function() {
  $f_Lcom_raquo_airstream_core_Signal__onStart__V(this)
});
$c_Lcom_raquo_airstream_state_VarSignal.prototype.onAddedExternalObserver__Lcom_raquo_airstream_core_Observer__V = (function(observer) {
  observer.onTry__s_util_Try__V($f_Lcom_raquo_airstream_core_WritableSignal__tryNow__s_util_Try(this))
});
$c_Lcom_raquo_airstream_state_VarSignal.prototype.externalObservers__Lcom_raquo_ew_JsArray = (function() {
  return this.Lcom_raquo_airstream_state_VarSignal__f_externalObservers
});
$c_Lcom_raquo_airstream_state_VarSignal.prototype.internalObservers__Lcom_raquo_ew_JsArray = (function() {
  return this.Lcom_raquo_airstream_state_VarSignal__f_internalObservers
});
$c_Lcom_raquo_airstream_state_VarSignal.prototype.com$raquo$airstream$core$WritableObservable$_setter_$externalObservers_$eq__Lcom_raquo_ew_JsArray__V = (function(x$0) {
  this.Lcom_raquo_airstream_state_VarSignal__f_externalObservers = x$0
});
$c_Lcom_raquo_airstream_state_VarSignal.prototype.com$raquo$airstream$core$WritableObservable$_setter_$internalObservers_$eq__Lcom_raquo_ew_JsArray__V = (function(x$0) {
  this.Lcom_raquo_airstream_state_VarSignal__f_internalObservers = x$0
});
$c_Lcom_raquo_airstream_state_VarSignal.prototype.maybeLastSeenCurrentValue__O = (function() {
  return this.Lcom_raquo_airstream_state_VarSignal__f_maybeLastSeenCurrentValue
});
$c_Lcom_raquo_airstream_state_VarSignal.prototype.maybeLastSeenCurrentValue_$eq__O__V = (function(x$1) {
  this.Lcom_raquo_airstream_state_VarSignal__f_maybeLastSeenCurrentValue = x$1
});
$c_Lcom_raquo_airstream_state_VarSignal.prototype.fireTry__s_util_Try__Lcom_raquo_airstream_core_Transaction__V = (function(nextValue, transaction) {
  $f_Lcom_raquo_airstream_core_WritableSignal__fireTry__s_util_Try__Lcom_raquo_airstream_core_Transaction__V(this, nextValue, transaction)
});
$c_Lcom_raquo_airstream_state_VarSignal.prototype.tryNow__s_util_Try = (function() {
  return $f_Lcom_raquo_airstream_core_WritableSignal__tryNow__s_util_Try(this)
});
$c_Lcom_raquo_airstream_state_VarSignal.prototype.topoRank__I = (function() {
  return this.Lcom_raquo_airstream_state_VarSignal__f_topoRank
});
$c_Lcom_raquo_airstream_state_VarSignal.prototype.currentValueFromParent__s_util_Try = (function() {
  return $f_Lcom_raquo_airstream_core_WritableSignal__tryNow__s_util_Try(this)
});
$c_Lcom_raquo_airstream_state_VarSignal.prototype.onWillStart__V = (function() {
  /*<skip>*/
});
$c_Lcom_raquo_airstream_state_VarSignal.prototype.map__F1__Lcom_raquo_airstream_core_Observable = (function(project) {
  return new $c_Lcom_raquo_airstream_misc_MapSignal(this, project, $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$m_s_None$())
});
$c_Lcom_raquo_airstream_state_VarSignal.prototype.toObservable__Lcom_raquo_airstream_core_Observable = (function() {
  return this
});
var $d_Lcom_raquo_airstream_state_VarSignal = new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$TypeData().initClass({
  Lcom_raquo_airstream_state_VarSignal: 0
}, false, "com.raquo.airstream.state.VarSignal", {
  Lcom_raquo_airstream_state_VarSignal: 1,
  O: 1,
  Lcom_raquo_airstream_core_Source: 1,
  Lcom_raquo_airstream_core_Named: 1,
  Lcom_raquo_airstream_core_BaseObservable: 1,
  Lcom_raquo_airstream_core_Observable: 1,
  Lcom_raquo_airstream_core_Source$SignalSource: 1,
  Lcom_raquo_airstream_core_Signal: 1,
  Lcom_raquo_airstream_core_WritableObservable: 1,
  Lcom_raquo_airstream_core_WritableSignal: 1,
  Lcom_raquo_airstream_state_StrictSignal: 1
});
$c_Lcom_raquo_airstream_state_VarSignal.prototype.$classData = $d_Lcom_raquo_airstream_state_VarSignal;
function $f_Lcom_raquo_airstream_common_SingleParentSignal__$init$__V($thiz) {
  $thiz.Lcom_raquo_airstream_misc_MapSignal__f_parentIsSignal = ($thiz.Lcom_raquo_airstream_misc_MapSignal__f_parent !== null);
  $thiz.Lcom_raquo_airstream_misc_MapSignal__f__parentLastUpdateId = 0
}
function $f_Lcom_raquo_airstream_common_SingleParentSignal__onWillStart__V($thiz) {
  $m_Lcom_raquo_airstream_core_Protected$();
  var observable = $thiz.Lcom_raquo_airstream_misc_MapSignal__f_parent;
  $f_Lcom_raquo_airstream_core_BaseObservable__maybeWillStart__V(observable);
  if ($thiz.Lcom_raquo_airstream_misc_MapSignal__f_parentIsSignal) {
    $m_Lcom_raquo_airstream_core_Protected$();
    var signal = $thiz.Lcom_raquo_airstream_misc_MapSignal__f_parent;
    $m_Lcom_raquo_airstream_core_Protected$();
    var newParentLastUpdateId = signal._lastUpdateId__I();
    if ((newParentLastUpdateId !== $thiz.Lcom_raquo_airstream_misc_MapSignal__f__parentLastUpdateId)) {
      $f_Lcom_raquo_airstream_common_SingleParentSignal__updateCurrentValueFromParent__V($thiz)
    };
    $thiz.Lcom_raquo_airstream_misc_MapSignal__f__parentLastUpdateId = newParentLastUpdateId
  }
}
function $f_Lcom_raquo_airstream_common_SingleParentSignal__updateCurrentValueFromParent__V($thiz) {
  var nextValue = $thiz.currentValueFromParent__s_util_Try();
  $f_Lcom_raquo_airstream_core_WritableSignal__setCurrentValue__s_util_Try__Z__V($thiz, nextValue, false)
}
function $f_Lcom_raquo_airstream_common_SingleParentSignal__onTry__s_util_Try__Lcom_raquo_airstream_core_Transaction__V($thiz, nextParentValue, transaction) {
  if ($thiz.Lcom_raquo_airstream_misc_MapSignal__f_parentIsSignal) {
    $m_Lcom_raquo_airstream_core_Protected$();
    var signal = $thiz.Lcom_raquo_airstream_misc_MapSignal__f_parent;
    $m_Lcom_raquo_airstream_core_Protected$();
    $thiz.Lcom_raquo_airstream_misc_MapSignal__f__parentLastUpdateId = signal._lastUpdateId__I()
  }
}
function $f_Lcom_raquo_airstream_common_SingleParentSignal__onStart__V($thiz) {
  var this$1 = $thiz.Lcom_raquo_airstream_misc_MapSignal__f_parent;
  $f_Lcom_raquo_airstream_core_WritableObservable__addInternalObserver__Lcom_raquo_airstream_core_InternalObserver__Z__V(this$1, $thiz, false);
  $f_Lcom_raquo_airstream_core_Signal__onStart__V($thiz)
}
function $f_Lcom_raquo_airstream_common_SingleParentSignal__onStop__V($thiz) {
  var this$1 = $thiz.Lcom_raquo_airstream_misc_MapSignal__f_parent;
  $f_Lcom_raquo_airstream_core_BaseObservable__removeInternalObserver__Lcom_raquo_airstream_core_InternalObserver__V(this$1, $thiz)
}
/** @constructor */
function $c_Lcom_raquo_airstream_eventbus_EventBusStream() {
  this.Lcom_raquo_airstream_eventbus_EventBusStream__f_maybeDisplayName = null;
  this.Lcom_raquo_airstream_eventbus_EventBusStream__f_isSafeToRemoveObserver = false;
  this.Lcom_raquo_airstream_eventbus_EventBusStream__f_maybePendingObserverRemovals = null;
  this.Lcom_raquo_airstream_eventbus_EventBusStream__f_externalObservers = null;
  this.Lcom_raquo_airstream_eventbus_EventBusStream__f_internalObservers = null;
  this.Lcom_raquo_airstream_eventbus_EventBusStream__f_sourceStreams = null;
  this.Lcom_raquo_airstream_eventbus_EventBusStream__f_topoRank = 0;
  this.Lcom_raquo_airstream_eventbus_EventBusStream__f_maybeDisplayName = (void 0);
  $f_Lcom_raquo_airstream_core_BaseObservable__$init$__V(this);
  $f_Lcom_raquo_airstream_core_WritableObservable__$init$__V(this);
  this.Lcom_raquo_airstream_eventbus_EventBusStream__f_sourceStreams = $m_Lcom_raquo_ew_JsArray$().apply__sci_Seq__Lcom_raquo_ew_JsArray($j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$m_sr_ScalaRunTime$().wrapRefArray__AO__sci_ArraySeq(new ($d_Lcom_raquo_airstream_core_EventStream.getArrayOf().constr)([])));
  this.Lcom_raquo_airstream_eventbus_EventBusStream__f_topoRank = 1
}
$c_Lcom_raquo_airstream_eventbus_EventBusStream.prototype = new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$h_O();
$c_Lcom_raquo_airstream_eventbus_EventBusStream.prototype.constructor = $c_Lcom_raquo_airstream_eventbus_EventBusStream;
/** @constructor */
function $h_Lcom_raquo_airstream_eventbus_EventBusStream() {
  /*<skip>*/
}
$h_Lcom_raquo_airstream_eventbus_EventBusStream.prototype = $c_Lcom_raquo_airstream_eventbus_EventBusStream.prototype;
$c_Lcom_raquo_airstream_eventbus_EventBusStream.prototype.maybeDisplayName__O = (function() {
  return this.Lcom_raquo_airstream_eventbus_EventBusStream__f_maybeDisplayName
});
$c_Lcom_raquo_airstream_eventbus_EventBusStream.prototype.toString__T = (function() {
  return $f_Lcom_raquo_airstream_core_Named__displayName__T(this)
});
$c_Lcom_raquo_airstream_eventbus_EventBusStream.prototype.isSafeToRemoveObserver__Z = (function() {
  return this.Lcom_raquo_airstream_eventbus_EventBusStream__f_isSafeToRemoveObserver
});
$c_Lcom_raquo_airstream_eventbus_EventBusStream.prototype.maybePendingObserverRemovals__O = (function() {
  return this.Lcom_raquo_airstream_eventbus_EventBusStream__f_maybePendingObserverRemovals
});
$c_Lcom_raquo_airstream_eventbus_EventBusStream.prototype.isSafeToRemoveObserver_$eq__Z__V = (function(x$1) {
  this.Lcom_raquo_airstream_eventbus_EventBusStream__f_isSafeToRemoveObserver = x$1
});
$c_Lcom_raquo_airstream_eventbus_EventBusStream.prototype.maybePendingObserverRemovals_$eq__O__V = (function(x$1) {
  this.Lcom_raquo_airstream_eventbus_EventBusStream__f_maybePendingObserverRemovals = x$1
});
$c_Lcom_raquo_airstream_eventbus_EventBusStream.prototype.equals__O__Z = (function(obj) {
  return (this === obj)
});
$c_Lcom_raquo_airstream_eventbus_EventBusStream.prototype.hashCode__I = (function() {
  return $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$systemIdentityHashCode(this)
});
$c_Lcom_raquo_airstream_eventbus_EventBusStream.prototype.onAddedExternalObserver__Lcom_raquo_airstream_core_Observer__V = (function(observer) {
  /*<skip>*/
});
$c_Lcom_raquo_airstream_eventbus_EventBusStream.prototype.externalObservers__Lcom_raquo_ew_JsArray = (function() {
  return this.Lcom_raquo_airstream_eventbus_EventBusStream__f_externalObservers
});
$c_Lcom_raquo_airstream_eventbus_EventBusStream.prototype.internalObservers__Lcom_raquo_ew_JsArray = (function() {
  return this.Lcom_raquo_airstream_eventbus_EventBusStream__f_internalObservers
});
$c_Lcom_raquo_airstream_eventbus_EventBusStream.prototype.com$raquo$airstream$core$WritableObservable$_setter_$externalObservers_$eq__Lcom_raquo_ew_JsArray__V = (function(x$0) {
  this.Lcom_raquo_airstream_eventbus_EventBusStream__f_externalObservers = x$0
});
$c_Lcom_raquo_airstream_eventbus_EventBusStream.prototype.com$raquo$airstream$core$WritableObservable$_setter_$internalObservers_$eq__Lcom_raquo_ew_JsArray__V = (function(x$0) {
  this.Lcom_raquo_airstream_eventbus_EventBusStream__f_internalObservers = x$0
});
$c_Lcom_raquo_airstream_eventbus_EventBusStream.prototype.fireTry__s_util_Try__Lcom_raquo_airstream_core_Transaction__V = (function(nextValue, transaction) {
  $f_Lcom_raquo_airstream_core_WritableStream__fireTry__s_util_Try__Lcom_raquo_airstream_core_Transaction__V(this, nextValue, transaction)
});
$c_Lcom_raquo_airstream_eventbus_EventBusStream.prototype.onTry__s_util_Try__Lcom_raquo_airstream_core_Transaction__V = (function(nextValue, transaction) {
  $f_Lcom_raquo_airstream_common_InternalNextErrorObserver__onTry__s_util_Try__Lcom_raquo_airstream_core_Transaction__V(this, nextValue, transaction)
});
$c_Lcom_raquo_airstream_eventbus_EventBusStream.prototype.topoRank__I = (function() {
  return this.Lcom_raquo_airstream_eventbus_EventBusStream__f_topoRank
});
$c_Lcom_raquo_airstream_eventbus_EventBusStream.prototype.onNext__O__Lcom_raquo_airstream_core_Transaction__V = (function(nextValue, ignoredTransaction) {
  new $c_Lcom_raquo_airstream_core_Transaction(new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$c_sjsr_AnonFunction1(((_$1) => {
    var _$1$1 = _$1;
    $f_Lcom_raquo_airstream_core_WritableStream__fireValue__O__Lcom_raquo_airstream_core_Transaction__V(this, nextValue, _$1$1)
  })))
});
$c_Lcom_raquo_airstream_eventbus_EventBusStream.prototype.onError__jl_Throwable__Lcom_raquo_airstream_core_Transaction__V = (function(nextError, transaction) {
  new $c_Lcom_raquo_airstream_core_Transaction(new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$c_sjsr_AnonFunction1(((_$2) => {
    var _$2$1 = _$2;
    $f_Lcom_raquo_airstream_core_WritableStream__fireError__jl_Throwable__Lcom_raquo_airstream_core_Transaction__V(this, nextError, _$2$1)
  })))
});
$c_Lcom_raquo_airstream_eventbus_EventBusStream.prototype.onWillStart__V = (function() {
  var arr = this.Lcom_raquo_airstream_eventbus_EventBusStream__f_sourceStreams;
  var i = 0;
  var len = (arr.length | 0);
  while ((i < len)) {
    var _$3 = arr[i];
    var _$3$1 = _$3;
    $m_Lcom_raquo_airstream_core_Protected$();
    $f_Lcom_raquo_airstream_core_BaseObservable__maybeWillStart__V(_$3$1);
    i = ((1 + i) | 0)
  }
});
$c_Lcom_raquo_airstream_eventbus_EventBusStream.prototype.onStart__V = (function() {
  var arr = this.Lcom_raquo_airstream_eventbus_EventBusStream__f_sourceStreams;
  var i = 0;
  var len = (arr.length | 0);
  while ((i < len)) {
    var _$4 = arr[i];
    var _$4$1 = _$4;
    $f_Lcom_raquo_airstream_core_WritableObservable__addInternalObserver__Lcom_raquo_airstream_core_InternalObserver__Z__V(_$4$1, this, false);
    i = ((1 + i) | 0)
  }
});
$c_Lcom_raquo_airstream_eventbus_EventBusStream.prototype.onStop__V = (function() {
  var arr = this.Lcom_raquo_airstream_eventbus_EventBusStream__f_sourceStreams;
  var i = 0;
  var len = (arr.length | 0);
  while ((i < len)) {
    var _$5 = arr[i];
    var _$5$1 = _$5;
    $f_Lcom_raquo_airstream_core_BaseObservable__removeInternalObserver__Lcom_raquo_airstream_core_InternalObserver__V(_$5$1, this);
    i = ((1 + i) | 0)
  }
});
$c_Lcom_raquo_airstream_eventbus_EventBusStream.prototype.map__F1__Lcom_raquo_airstream_core_Observable = (function(project) {
  return new $c_Lcom_raquo_airstream_misc_MapStream(this, project, $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$m_s_None$())
});
$c_Lcom_raquo_airstream_eventbus_EventBusStream.prototype.toObservable__Lcom_raquo_airstream_core_Observable = (function() {
  return this
});
var $d_Lcom_raquo_airstream_eventbus_EventBusStream = new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$TypeData().initClass({
  Lcom_raquo_airstream_eventbus_EventBusStream: 0
}, false, "com.raquo.airstream.eventbus.EventBusStream", {
  Lcom_raquo_airstream_eventbus_EventBusStream: 1,
  O: 1,
  Lcom_raquo_airstream_core_Source: 1,
  Lcom_raquo_airstream_core_Named: 1,
  Lcom_raquo_airstream_core_BaseObservable: 1,
  Lcom_raquo_airstream_core_Observable: 1,
  Lcom_raquo_airstream_core_Source$EventSource: 1,
  Lcom_raquo_airstream_core_EventStream: 1,
  Lcom_raquo_airstream_core_WritableObservable: 1,
  Lcom_raquo_airstream_core_WritableStream: 1,
  Lcom_raquo_airstream_core_InternalObserver: 1,
  Lcom_raquo_airstream_common_InternalNextErrorObserver: 1
});
$c_Lcom_raquo_airstream_eventbus_EventBusStream.prototype.$classData = $d_Lcom_raquo_airstream_eventbus_EventBusStream;
function $f_Lcom_raquo_laminar_api_Laminar__$init$__V($thiz) {
  $thiz.Lcom_raquo_laminar_api_package$$anon$1__f_documentEventProps = new $c_Lcom_raquo_laminar_api_Laminar$$anon$1();
  new $c_Lcom_raquo_laminar_api_Laminar$$anon$2();
  $thiz.Lcom_raquo_laminar_api_package$$anon$1__f_Modifier = $m_Lcom_raquo_laminar_modifiers_Modifier$();
  $m_Lcom_raquo_laminar_modifiers_Setter$();
  $thiz.Lcom_raquo_laminar_api_package$$anon$1__f_child = $m_Lcom_raquo_laminar_receivers_ChildReceiver$();
  $thiz.Lcom_raquo_laminar_api_package$$anon$1__f_children = $m_Lcom_raquo_laminar_receivers_ChildrenReceiver$();
  var fn = new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$c_sjsr_AnonFunction1(((_$3) => {
    var _$3$1 = _$3;
    _$3$1.Lcom_raquo_laminar_lifecycle_MountContext__f_thisNode.Lcom_raquo_laminar_nodes_ReactiveHtmlElement__f_ref.focus()
  }));
  $f_Lcom_raquo_laminar_api_Laminar__onMountCallback__F1__Lcom_raquo_laminar_modifiers_Modifier($thiz, fn)
}
function $f_Lcom_raquo_laminar_api_Laminar__onMountCallback__F1__Lcom_raquo_laminar_modifiers_Modifier($thiz, fn) {
  var f = new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$c_sjsr_AnonFunction1(((element) => {
    var element$1 = element;
    var this$2 = element$1.Lcom_raquo_laminar_nodes_ReactiveHtmlElement__f_dynamicOwner;
    var this$3 = this$2.Lcom_raquo_airstream_ownership_DynamicOwner__f__maybeCurrentOwner;
    var elem = (!this$3.isEmpty__Z());
    var ignoreNextActivation = new $c_sr_BooleanRef(elem);
    var activate = new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$c_sjsr_AnonFunction1(((c) => {
      var c$1 = c;
      if (ignoreNextActivation.sr_BooleanRef__f_elem) {
        var ev$5 = false;
        ignoreNextActivation.sr_BooleanRef__f_elem = ev$5
      } else {
        fn.apply__O__O(c$1)
      }
    }));
    $m_Lcom_raquo_airstream_ownership_DynamicSubscription$().subscribeCallback__Lcom_raquo_airstream_ownership_DynamicOwner__F1__Z__Lcom_raquo_airstream_ownership_DynamicSubscription(element$1.Lcom_raquo_laminar_nodes_ReactiveHtmlElement__f_dynamicOwner, new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$c_sjsr_AnonFunction1(((owner) => {
      var owner$1 = owner;
      activate.apply__O__O(new $c_Lcom_raquo_laminar_lifecycle_MountContext(element$1, owner$1))
    })), false)
  }));
  return new $c_Lcom_raquo_laminar_modifiers_Modifier$$anon$2(f)
}
function $f_Lcom_raquo_laminar_api_Laminar__inContext__F1__Lcom_raquo_laminar_modifiers_Modifier($thiz, makeModifier) {
  var f = new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$c_sjsr_AnonFunction1(((element) => {
    var element$1 = element;
    makeModifier.apply__O__O(element$1).apply__Lcom_raquo_laminar_nodes_ReactiveElement__V(element$1)
  }));
  return new $c_Lcom_raquo_laminar_modifiers_Modifier$$anon$2(f)
}
function $f_sc_Map__equals__O__Z($thiz, o) {
  if (($thiz === o)) {
    return true
  } else if ($is_sc_Map(o)) {
    var x2 = o;
    if (($thiz.size__I() === x2.size__I())) {
      try {
        return $thiz.forall__F1__Z(new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$c_sjsr_AnonFunction1(((kv$2) => {
          var kv = kv$2;
          return $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$m_sr_BoxesRunTime$().equals__O__O__Z(x2.getOrElse__O__F0__O(kv._1__O(), $m_sc_Map$().sc_Map$__f_scala$collection$Map$$DefaultSentinelFn), kv._2__O())
        })))
      } catch (e) {
        if (false) {
          return false
        } else {
          throw e
        }
      }
    } else {
      return false
    }
  } else {
    return false
  }
}
function $is_sc_Map(obj) {
  return (!(!((obj && obj.$classData) && obj.$classData.ancestors.sc_Map)))
}
function $isArrayOf_sc_Map(obj, depth) {
  return (!(!(((obj && obj.$classData) && (obj.$classData.arrayDepth === depth)) && obj.$classData.arrayBase.ancestors.sc_Map)))
}
function $p_s_concurrent_impl_Promise$Transformation__handleFailure__jl_Throwable__s_concurrent_ExecutionContext__V($thiz, t, e) {
  var wasInterrupted = false;
  if ((wasInterrupted || $m_s_util_control_NonFatal$().apply__jl_Throwable__Z(t))) {
    var completed = $thiz.tryComplete0__O__s_util_Try__Z($thiz.ju_concurrent_atomic_AtomicReference__f_value, $m_s_concurrent_impl_Promise$().scala$concurrent$impl$Promise$$resolve__s_util_Try__s_util_Try(new $c_s_util_Failure(t)));
    if ((completed && wasInterrupted)) {
      $m_jl_Thread$()
    };
    if (((($thiz.s_concurrent_impl_Promise$Transformation__f__xform === 5) || ($thiz.s_concurrent_impl_Promise$Transformation__f__xform === 6)) || (!completed))) {
      e.reportFailure__jl_Throwable__V(t)
    }
  } else {
    throw ((t instanceof $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$c_sjs_js_JavaScriptException) ? t.sjs_js_JavaScriptException__f_exception : t)
  }
}
function $ct_s_concurrent_impl_Promise$Transformation__F1__s_concurrent_ExecutionContext__s_util_Try__I__($thiz, _fun, _ec, _arg, _xform) {
  $thiz.s_concurrent_impl_Promise$Transformation__f__fun = _fun;
  $thiz.s_concurrent_impl_Promise$Transformation__f__ec = _ec;
  $thiz.s_concurrent_impl_Promise$Transformation__f__arg = _arg;
  $thiz.s_concurrent_impl_Promise$Transformation__f__xform = _xform;
  $ct_s_concurrent_impl_Promise$DefaultPromise__($thiz);
  return $thiz
}
function $ct_s_concurrent_impl_Promise$Transformation__I__F1__s_concurrent_ExecutionContext__($thiz, xform, f, ec) {
  $ct_s_concurrent_impl_Promise$Transformation__F1__s_concurrent_ExecutionContext__s_util_Try__I__($thiz, f, ec, null, xform);
  return $thiz
}
/** @constructor */
function $c_s_concurrent_impl_Promise$Transformation() {
  this.ju_concurrent_atomic_AtomicReference__f_value = null;
  this.s_concurrent_impl_Promise$Transformation__f__fun = null;
  this.s_concurrent_impl_Promise$Transformation__f__ec = null;
  this.s_concurrent_impl_Promise$Transformation__f__arg = null;
  this.s_concurrent_impl_Promise$Transformation__f__xform = 0
}
$c_s_concurrent_impl_Promise$Transformation.prototype = new $h_s_concurrent_impl_Promise$DefaultPromise();
$c_s_concurrent_impl_Promise$Transformation.prototype.constructor = $c_s_concurrent_impl_Promise$Transformation;
/** @constructor */
function $h_s_concurrent_impl_Promise$Transformation() {
  /*<skip>*/
}
$h_s_concurrent_impl_Promise$Transformation.prototype = $c_s_concurrent_impl_Promise$Transformation.prototype;
$c_s_concurrent_impl_Promise$Transformation.prototype.submitWithValue__s_util_Try__s_concurrent_impl_Promise$Transformation = (function(resolved) {
  this.s_concurrent_impl_Promise$Transformation__f__arg = resolved;
  var e = this.s_concurrent_impl_Promise$Transformation__f__ec;
  try {
    e.execute__jl_Runnable__V(this)
  } catch (e$2) {
    var e$3 = ((e$2 instanceof $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$c_jl_Throwable) ? e$2 : new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$c_sjs_js_JavaScriptException(e$2));
    this.s_concurrent_impl_Promise$Transformation__f__fun = null;
    this.s_concurrent_impl_Promise$Transformation__f__arg = null;
    this.s_concurrent_impl_Promise$Transformation__f__ec = null;
    $p_s_concurrent_impl_Promise$Transformation__handleFailure__jl_Throwable__s_concurrent_ExecutionContext__V(this, e$3, e)
  };
  return this
});
$c_s_concurrent_impl_Promise$Transformation.prototype.run__V = (function() {
  var v = this.s_concurrent_impl_Promise$Transformation__f__arg;
  var fun = this.s_concurrent_impl_Promise$Transformation__f__fun;
  var ec = this.s_concurrent_impl_Promise$Transformation__f__ec;
  this.s_concurrent_impl_Promise$Transformation__f__fun = null;
  this.s_concurrent_impl_Promise$Transformation__f__arg = null;
  this.s_concurrent_impl_Promise$Transformation__f__ec = null;
  try {
    var x1 = this.s_concurrent_impl_Promise$Transformation__f__xform;
    switch (x1) {
      case 0: {
        var resolvedResult = null;
        break
      }
      case 1: {
        var resolvedResult = ((v instanceof $c_s_util_Success) ? new $c_s_util_Success(fun.apply__O__O(v.get__O())) : v);
        break
      }
      case 2: {
        if ((v instanceof $c_s_util_Success)) {
          var f = fun.apply__O__O(v.get__O());
          if ((f instanceof $c_s_concurrent_impl_Promise$DefaultPromise)) {
            f.linkRootOf__s_concurrent_impl_Promise$DefaultPromise__s_concurrent_impl_Promise$Link__V(this, null)
          } else {
            this.completeWith__s_concurrent_Future__s_concurrent_impl_Promise$DefaultPromise(f)
          };
          var resolvedResult = null
        } else {
          var resolvedResult = v
        };
        break
      }
      case 3: {
        var resolvedResult = $m_s_concurrent_impl_Promise$().scala$concurrent$impl$Promise$$resolve__s_util_Try__s_util_Try(fun.apply__O__O(v));
        break
      }
      case 4: {
        var f$2 = fun.apply__O__O(v);
        if ((f$2 instanceof $c_s_concurrent_impl_Promise$DefaultPromise)) {
          f$2.linkRootOf__s_concurrent_impl_Promise$DefaultPromise__s_concurrent_impl_Promise$Link__V(this, null)
        } else {
          this.completeWith__s_concurrent_Future__s_concurrent_impl_Promise$DefaultPromise(f$2)
        };
        var resolvedResult = null;
        break
      }
      case 5: {
        v.foreach__F1__V(fun);
        var resolvedResult = null;
        break
      }
      case 6: {
        fun.apply__O__O(v);
        var resolvedResult = null;
        break
      }
      case 7: {
        var resolvedResult = ((v instanceof $c_s_util_Failure) ? $m_s_concurrent_impl_Promise$().scala$concurrent$impl$Promise$$resolve__s_util_Try__s_util_Try(v.recover__s_PartialFunction__s_util_Try(fun)) : v);
        break
      }
      case 8: {
        if ((v instanceof $c_s_util_Failure)) {
          var f$3 = fun.applyOrElse__O__F1__O(v.s_util_Failure__f_exception, $m_s_concurrent_Future$().s_concurrent_Future$__f_recoverWithFailed);
          var resolvedResult = ((f$3 !== $m_s_concurrent_Future$().s_concurrent_Future$__f_recoverWithFailedMarker) ? (((f$3 instanceof $c_s_concurrent_impl_Promise$DefaultPromise) ? f$3.linkRootOf__s_concurrent_impl_Promise$DefaultPromise__s_concurrent_impl_Promise$Link__V(this, null) : this.completeWith__s_concurrent_Future__s_concurrent_impl_Promise$DefaultPromise(f$3)), null) : v)
        } else {
          var resolvedResult = v
        };
        break
      }
      case 9: {
        var resolvedResult = (((v instanceof $c_s_util_Failure) || (!(!fun.apply__O__O(v.get__O())))) ? v : $m_s_concurrent_Future$().s_concurrent_Future$__f_filterFailure);
        break
      }
      case 10: {
        var resolvedResult = ((v instanceof $c_s_util_Success) ? new $c_s_util_Success(fun.applyOrElse__O__F1__O(v.get__O(), $m_s_concurrent_Future$().s_concurrent_Future$__f_collectFailed)) : v);
        break
      }
      default: {
        var resolvedResult = new $c_s_util_Failure(new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$c_jl_IllegalStateException(("BUG: encountered transformation promise with illegal type: " + this.s_concurrent_impl_Promise$Transformation__f__xform)))
      }
    };
    if ((resolvedResult !== null)) {
      this.tryComplete0__O__s_util_Try__Z(this.ju_concurrent_atomic_AtomicReference__f_value, resolvedResult)
    }
  } catch (e) {
    var e$2 = ((e instanceof $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$c_jl_Throwable) ? e : new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$c_sjs_js_JavaScriptException(e));
    $p_s_concurrent_impl_Promise$Transformation__handleFailure__jl_Throwable__s_concurrent_ExecutionContext__V(this, e$2, ec)
  }
});
function $isArrayOf_s_concurrent_impl_Promise$Transformation(obj, depth) {
  return (!(!(((obj && obj.$classData) && (obj.$classData.arrayDepth === depth)) && obj.$classData.arrayBase.ancestors.s_concurrent_impl_Promise$Transformation)))
}
var $d_s_concurrent_impl_Promise$Transformation = new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$TypeData().initClass({
  s_concurrent_impl_Promise$Transformation: 0
}, false, "scala.concurrent.impl.Promise$Transformation", {
  s_concurrent_impl_Promise$Transformation: 1,
  s_concurrent_impl_Promise$DefaultPromise: 1,
  ju_concurrent_atomic_AtomicReference: 1,
  O: 1,
  Ljava_io_Serializable: 1,
  s_concurrent_Promise: 1,
  s_concurrent_Future: 1,
  s_concurrent_Awaitable: 1,
  F1: 1,
  s_concurrent_impl_Promise$Callbacks: 1,
  jl_Runnable: 1,
  s_concurrent_Batchable: 1
});
$c_s_concurrent_impl_Promise$Transformation.prototype.$classData = $d_s_concurrent_impl_Promise$Transformation;
function $p_Lcom_raquo_airstream_combine_SampleCombineStreamN__combineWithArray__O__Lcom_raquo_ew_JsArray__Lcom_raquo_ew_JsArray($thiz, sampling, sampled) {
  var values = sampled.concat();
  values.unshift(sampling);
  return values
}
/** @constructor */
function $c_Lcom_raquo_airstream_combine_SampleCombineStreamN(samplingStream, sampledSignals, combinator) {
  this.Lcom_raquo_airstream_combine_SampleCombineStreamN__f_maybeDisplayName = null;
  this.Lcom_raquo_airstream_combine_SampleCombineStreamN__f_isSafeToRemoveObserver = false;
  this.Lcom_raquo_airstream_combine_SampleCombineStreamN__f_maybePendingObserverRemovals = null;
  this.Lcom_raquo_airstream_combine_SampleCombineStreamN__f_externalObservers = null;
  this.Lcom_raquo_airstream_combine_SampleCombineStreamN__f_internalObservers = null;
  this.Lcom_raquo_airstream_combine_SampleCombineStreamN__f_parentObservers = null;
  this.Lcom_raquo_airstream_combine_SampleCombineStreamN__f_sampledSignals = null;
  this.Lcom_raquo_airstream_combine_SampleCombineStreamN__f_combinator = null;
  this.Lcom_raquo_airstream_combine_SampleCombineStreamN__f_topoRank = 0;
  this.Lcom_raquo_airstream_combine_SampleCombineStreamN__f_maybeLastSamplingValue = null;
  this.Lcom_raquo_airstream_combine_SampleCombineStreamN__f_parents = null;
  this.Lcom_raquo_airstream_combine_SampleCombineStreamN__f_sampledSignals = sampledSignals;
  this.Lcom_raquo_airstream_combine_SampleCombineStreamN__f_combinator = combinator;
  this.Lcom_raquo_airstream_combine_SampleCombineStreamN__f_maybeDisplayName = (void 0);
  $f_Lcom_raquo_airstream_core_BaseObservable__$init$__V(this);
  $f_Lcom_raquo_airstream_core_WritableObservable__$init$__V(this);
  $f_Lcom_raquo_airstream_combine_CombineObservable__$init$__V(this);
  this.Lcom_raquo_airstream_combine_SampleCombineStreamN__f_topoRank = ((1 + $m_Lcom_raquo_airstream_core_Protected$().maxTopoRank__Lcom_raquo_airstream_core_Observable__Lcom_raquo_ew_JsArray__I(samplingStream, sampledSignals)) | 0);
  this.Lcom_raquo_airstream_combine_SampleCombineStreamN__f_maybeLastSamplingValue = (void 0);
  this.Lcom_raquo_airstream_combine_SampleCombineStreamN__f_parents = $p_Lcom_raquo_airstream_combine_SampleCombineStreamN__combineWithArray__O__Lcom_raquo_ew_JsArray__Lcom_raquo_ew_JsArray(this, samplingStream, sampledSignals);
  this.Lcom_raquo_airstream_combine_SampleCombineStreamN__f_parentObservers.push($m_Lcom_raquo_airstream_common_InternalParentObserver$().fromTry__Lcom_raquo_airstream_core_Observable__F2__Lcom_raquo_airstream_common_InternalParentObserver(samplingStream, new $c_sjsr_AnonFunction2(((nextSamplingValue, transaction) => {
    var nextSamplingValue$1 = nextSamplingValue;
    var transaction$1 = transaction;
    this.Lcom_raquo_airstream_combine_SampleCombineStreamN__f_maybeLastSamplingValue = nextSamplingValue$1;
    $f_Lcom_raquo_airstream_combine_CombineObservable__onInputsReady__Lcom_raquo_airstream_core_Transaction__V(this, transaction$1)
  }))));
  var i = 0;
  var len = (sampledSignals.length | 0);
  while ((i < len)) {
    var sampledSignal = sampledSignals[i];
    var sampledSignal$1 = sampledSignal;
    (this.Lcom_raquo_airstream_combine_SampleCombineStreamN__f_parentObservers.push($m_Lcom_raquo_airstream_common_InternalParentObserver$().fromTry__Lcom_raquo_airstream_core_Observable__F2__Lcom_raquo_airstream_common_InternalParentObserver(sampledSignal$1, new $c_sjsr_AnonFunction2(((_$2, _$3) => (void 0))))) | 0);
    i = ((1 + i) | 0)
  }
}
$c_Lcom_raquo_airstream_combine_SampleCombineStreamN.prototype = new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$h_O();
$c_Lcom_raquo_airstream_combine_SampleCombineStreamN.prototype.constructor = $c_Lcom_raquo_airstream_combine_SampleCombineStreamN;
/** @constructor */
function $h_Lcom_raquo_airstream_combine_SampleCombineStreamN() {
  /*<skip>*/
}
$h_Lcom_raquo_airstream_combine_SampleCombineStreamN.prototype = $c_Lcom_raquo_airstream_combine_SampleCombineStreamN.prototype;
$c_Lcom_raquo_airstream_combine_SampleCombineStreamN.prototype.maybeDisplayName__O = (function() {
  return this.Lcom_raquo_airstream_combine_SampleCombineStreamN__f_maybeDisplayName
});
$c_Lcom_raquo_airstream_combine_SampleCombineStreamN.prototype.toString__T = (function() {
  return $f_Lcom_raquo_airstream_core_Named__displayName__T(this)
});
$c_Lcom_raquo_airstream_combine_SampleCombineStreamN.prototype.isSafeToRemoveObserver__Z = (function() {
  return this.Lcom_raquo_airstream_combine_SampleCombineStreamN__f_isSafeToRemoveObserver
});
$c_Lcom_raquo_airstream_combine_SampleCombineStreamN.prototype.maybePendingObserverRemovals__O = (function() {
  return this.Lcom_raquo_airstream_combine_SampleCombineStreamN__f_maybePendingObserverRemovals
});
$c_Lcom_raquo_airstream_combine_SampleCombineStreamN.prototype.isSafeToRemoveObserver_$eq__Z__V = (function(x$1) {
  this.Lcom_raquo_airstream_combine_SampleCombineStreamN__f_isSafeToRemoveObserver = x$1
});
$c_Lcom_raquo_airstream_combine_SampleCombineStreamN.prototype.maybePendingObserverRemovals_$eq__O__V = (function(x$1) {
  this.Lcom_raquo_airstream_combine_SampleCombineStreamN__f_maybePendingObserverRemovals = x$1
});
$c_Lcom_raquo_airstream_combine_SampleCombineStreamN.prototype.equals__O__Z = (function(obj) {
  return (this === obj)
});
$c_Lcom_raquo_airstream_combine_SampleCombineStreamN.prototype.hashCode__I = (function() {
  return $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$systemIdentityHashCode(this)
});
$c_Lcom_raquo_airstream_combine_SampleCombineStreamN.prototype.onAddedExternalObserver__Lcom_raquo_airstream_core_Observer__V = (function(observer) {
  /*<skip>*/
});
$c_Lcom_raquo_airstream_combine_SampleCombineStreamN.prototype.externalObservers__Lcom_raquo_ew_JsArray = (function() {
  return this.Lcom_raquo_airstream_combine_SampleCombineStreamN__f_externalObservers
});
$c_Lcom_raquo_airstream_combine_SampleCombineStreamN.prototype.internalObservers__Lcom_raquo_ew_JsArray = (function() {
  return this.Lcom_raquo_airstream_combine_SampleCombineStreamN__f_internalObservers
});
$c_Lcom_raquo_airstream_combine_SampleCombineStreamN.prototype.com$raquo$airstream$core$WritableObservable$_setter_$externalObservers_$eq__Lcom_raquo_ew_JsArray__V = (function(x$0) {
  this.Lcom_raquo_airstream_combine_SampleCombineStreamN__f_externalObservers = x$0
});
$c_Lcom_raquo_airstream_combine_SampleCombineStreamN.prototype.com$raquo$airstream$core$WritableObservable$_setter_$internalObservers_$eq__Lcom_raquo_ew_JsArray__V = (function(x$0) {
  this.Lcom_raquo_airstream_combine_SampleCombineStreamN__f_internalObservers = x$0
});
$c_Lcom_raquo_airstream_combine_SampleCombineStreamN.prototype.fireTry__s_util_Try__Lcom_raquo_airstream_core_Transaction__V = (function(nextValue, transaction) {
  $f_Lcom_raquo_airstream_core_WritableStream__fireTry__s_util_Try__Lcom_raquo_airstream_core_Transaction__V(this, nextValue, transaction)
});
$c_Lcom_raquo_airstream_combine_SampleCombineStreamN.prototype.onWillStart__V = (function() {
  $f_Lcom_raquo_airstream_common_MultiParentStream__onWillStart__V(this)
});
$c_Lcom_raquo_airstream_combine_SampleCombineStreamN.prototype.onStart__V = (function() {
  $f_Lcom_raquo_airstream_combine_CombineObservable__onStart__V(this)
});
$c_Lcom_raquo_airstream_combine_SampleCombineStreamN.prototype.onStop__V = (function() {
  $f_Lcom_raquo_airstream_combine_CombineObservable__onStop__V(this)
});
$c_Lcom_raquo_airstream_combine_SampleCombineStreamN.prototype.topoRank__I = (function() {
  return this.Lcom_raquo_airstream_combine_SampleCombineStreamN__f_topoRank
});
$c_Lcom_raquo_airstream_combine_SampleCombineStreamN.prototype.inputsReady__Z = (function() {
  var x = this.Lcom_raquo_airstream_combine_SampleCombineStreamN__f_maybeLastSamplingValue;
  return (x !== (void 0))
});
$c_Lcom_raquo_airstream_combine_SampleCombineStreamN.prototype.combinedValue__s_util_Try = (function() {
  var x = this.Lcom_raquo_airstream_combine_SampleCombineStreamN__f_maybeLastSamplingValue;
  if ((x === (void 0))) {
    throw $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$ct_ju_NoSuchElementException__T__(new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$c_ju_NoSuchElementException(), "undefined.get")
  };
  var values = $p_Lcom_raquo_airstream_combine_SampleCombineStreamN__combineWithArray__O__Lcom_raquo_ew_JsArray__Lcom_raquo_ew_JsArray(this, x, this.Lcom_raquo_airstream_combine_SampleCombineStreamN__f_sampledSignals.map(((_$1) => {
    var _$1$1 = _$1;
    return _$1$1.tryNow__s_util_Try()
  })));
  return $m_Lcom_raquo_airstream_combine_CombineObservable$().jsArrayCombinator__Lcom_raquo_ew_JsArray__F1__s_util_Try(values, this.Lcom_raquo_airstream_combine_SampleCombineStreamN__f_combinator)
});
$c_Lcom_raquo_airstream_combine_SampleCombineStreamN.prototype.syncFire__Lcom_raquo_airstream_core_Transaction__V = (function(transaction) {
  $f_Lcom_raquo_airstream_combine_CombineObservable__syncFire__Lcom_raquo_airstream_core_Transaction__V(this, transaction);
  this.Lcom_raquo_airstream_combine_SampleCombineStreamN__f_maybeLastSamplingValue = (void 0)
});
$c_Lcom_raquo_airstream_combine_SampleCombineStreamN.prototype.map__F1__Lcom_raquo_airstream_core_Observable = (function(project) {
  return new $c_Lcom_raquo_airstream_misc_MapStream(this, project, $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$m_s_None$())
});
$c_Lcom_raquo_airstream_combine_SampleCombineStreamN.prototype.toObservable__Lcom_raquo_airstream_core_Observable = (function() {
  return this
});
var $d_Lcom_raquo_airstream_combine_SampleCombineStreamN = new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$TypeData().initClass({
  Lcom_raquo_airstream_combine_SampleCombineStreamN: 0
}, false, "com.raquo.airstream.combine.SampleCombineStreamN", {
  Lcom_raquo_airstream_combine_SampleCombineStreamN: 1,
  O: 1,
  Lcom_raquo_airstream_core_Source: 1,
  Lcom_raquo_airstream_core_Named: 1,
  Lcom_raquo_airstream_core_BaseObservable: 1,
  Lcom_raquo_airstream_core_Observable: 1,
  Lcom_raquo_airstream_core_Source$EventSource: 1,
  Lcom_raquo_airstream_core_EventStream: 1,
  Lcom_raquo_airstream_core_WritableObservable: 1,
  Lcom_raquo_airstream_core_WritableStream: 1,
  Lcom_raquo_airstream_common_MultiParentStream: 1,
  Lcom_raquo_airstream_core_SyncObservable: 1,
  Lcom_raquo_airstream_combine_CombineObservable: 1
});
$c_Lcom_raquo_airstream_combine_SampleCombineStreamN.prototype.$classData = $d_Lcom_raquo_airstream_combine_SampleCombineStreamN;
/** @constructor */
function $c_Lcom_raquo_airstream_misc_CollectStream(parent, fn) {
  this.Lcom_raquo_airstream_misc_CollectStream__f_maybeDisplayName = null;
  this.Lcom_raquo_airstream_misc_CollectStream__f_isSafeToRemoveObserver = false;
  this.Lcom_raquo_airstream_misc_CollectStream__f_maybePendingObserverRemovals = null;
  this.Lcom_raquo_airstream_misc_CollectStream__f_externalObservers = null;
  this.Lcom_raquo_airstream_misc_CollectStream__f_internalObservers = null;
  this.Lcom_raquo_airstream_misc_CollectStream__f_parent = null;
  this.Lcom_raquo_airstream_misc_CollectStream__f_fn = null;
  this.Lcom_raquo_airstream_misc_CollectStream__f_topoRank = 0;
  this.Lcom_raquo_airstream_misc_CollectStream__f_parent = parent;
  this.Lcom_raquo_airstream_misc_CollectStream__f_fn = fn;
  this.Lcom_raquo_airstream_misc_CollectStream__f_maybeDisplayName = (void 0);
  $f_Lcom_raquo_airstream_core_BaseObservable__$init$__V(this);
  $f_Lcom_raquo_airstream_core_WritableObservable__$init$__V(this);
  this.Lcom_raquo_airstream_misc_CollectStream__f_topoRank = ((1 + ($m_Lcom_raquo_airstream_core_Protected$(), parent.topoRank__I())) | 0)
}
$c_Lcom_raquo_airstream_misc_CollectStream.prototype = new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$h_O();
$c_Lcom_raquo_airstream_misc_CollectStream.prototype.constructor = $c_Lcom_raquo_airstream_misc_CollectStream;
/** @constructor */
function $h_Lcom_raquo_airstream_misc_CollectStream() {
  /*<skip>*/
}
$h_Lcom_raquo_airstream_misc_CollectStream.prototype = $c_Lcom_raquo_airstream_misc_CollectStream.prototype;
$c_Lcom_raquo_airstream_misc_CollectStream.prototype.maybeDisplayName__O = (function() {
  return this.Lcom_raquo_airstream_misc_CollectStream__f_maybeDisplayName
});
$c_Lcom_raquo_airstream_misc_CollectStream.prototype.toString__T = (function() {
  return $f_Lcom_raquo_airstream_core_Named__displayName__T(this)
});
$c_Lcom_raquo_airstream_misc_CollectStream.prototype.isSafeToRemoveObserver__Z = (function() {
  return this.Lcom_raquo_airstream_misc_CollectStream__f_isSafeToRemoveObserver
});
$c_Lcom_raquo_airstream_misc_CollectStream.prototype.maybePendingObserverRemovals__O = (function() {
  return this.Lcom_raquo_airstream_misc_CollectStream__f_maybePendingObserverRemovals
});
$c_Lcom_raquo_airstream_misc_CollectStream.prototype.isSafeToRemoveObserver_$eq__Z__V = (function(x$1) {
  this.Lcom_raquo_airstream_misc_CollectStream__f_isSafeToRemoveObserver = x$1
});
$c_Lcom_raquo_airstream_misc_CollectStream.prototype.maybePendingObserverRemovals_$eq__O__V = (function(x$1) {
  this.Lcom_raquo_airstream_misc_CollectStream__f_maybePendingObserverRemovals = x$1
});
$c_Lcom_raquo_airstream_misc_CollectStream.prototype.equals__O__Z = (function(obj) {
  return (this === obj)
});
$c_Lcom_raquo_airstream_misc_CollectStream.prototype.hashCode__I = (function() {
  return $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$systemIdentityHashCode(this)
});
$c_Lcom_raquo_airstream_misc_CollectStream.prototype.onAddedExternalObserver__Lcom_raquo_airstream_core_Observer__V = (function(observer) {
  /*<skip>*/
});
$c_Lcom_raquo_airstream_misc_CollectStream.prototype.externalObservers__Lcom_raquo_ew_JsArray = (function() {
  return this.Lcom_raquo_airstream_misc_CollectStream__f_externalObservers
});
$c_Lcom_raquo_airstream_misc_CollectStream.prototype.internalObservers__Lcom_raquo_ew_JsArray = (function() {
  return this.Lcom_raquo_airstream_misc_CollectStream__f_internalObservers
});
$c_Lcom_raquo_airstream_misc_CollectStream.prototype.com$raquo$airstream$core$WritableObservable$_setter_$externalObservers_$eq__Lcom_raquo_ew_JsArray__V = (function(x$0) {
  this.Lcom_raquo_airstream_misc_CollectStream__f_externalObservers = x$0
});
$c_Lcom_raquo_airstream_misc_CollectStream.prototype.com$raquo$airstream$core$WritableObservable$_setter_$internalObservers_$eq__Lcom_raquo_ew_JsArray__V = (function(x$0) {
  this.Lcom_raquo_airstream_misc_CollectStream__f_internalObservers = x$0
});
$c_Lcom_raquo_airstream_misc_CollectStream.prototype.fireTry__s_util_Try__Lcom_raquo_airstream_core_Transaction__V = (function(nextValue, transaction) {
  $f_Lcom_raquo_airstream_core_WritableStream__fireTry__s_util_Try__Lcom_raquo_airstream_core_Transaction__V(this, nextValue, transaction)
});
$c_Lcom_raquo_airstream_misc_CollectStream.prototype.onWillStart__V = (function() {
  $m_Lcom_raquo_airstream_core_Protected$();
  var observable = this.Lcom_raquo_airstream_misc_CollectStream__f_parent;
  $f_Lcom_raquo_airstream_core_BaseObservable__maybeWillStart__V(observable)
});
$c_Lcom_raquo_airstream_misc_CollectStream.prototype.onStart__V = (function() {
  $f_Lcom_raquo_airstream_common_SingleParentStream__onStart__V(this)
});
$c_Lcom_raquo_airstream_misc_CollectStream.prototype.onStop__V = (function() {
  $f_Lcom_raquo_airstream_common_SingleParentStream__onStop__V(this)
});
$c_Lcom_raquo_airstream_misc_CollectStream.prototype.onTry__s_util_Try__Lcom_raquo_airstream_core_Transaction__V = (function(nextValue, transaction) {
  $f_Lcom_raquo_airstream_common_InternalNextErrorObserver__onTry__s_util_Try__Lcom_raquo_airstream_core_Transaction__V(this, nextValue, transaction)
});
$c_Lcom_raquo_airstream_misc_CollectStream.prototype.topoRank__I = (function() {
  return this.Lcom_raquo_airstream_misc_CollectStream__f_topoRank
});
$c_Lcom_raquo_airstream_misc_CollectStream.prototype.onNext__O__Lcom_raquo_airstream_core_Transaction__V = (function(nextParentValue, transaction) {
  try {
    var $$x1 = new $c_s_util_Success(this.Lcom_raquo_airstream_misc_CollectStream__f_fn.apply__O__O(nextParentValue))
  } catch (e) {
    var e$2 = ((e instanceof $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$c_jl_Throwable) ? e : new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$c_sjs_js_JavaScriptException(e));
    matchEnd8: {
      var $$x1;
      var o11 = $m_s_util_control_NonFatal$().unapply__jl_Throwable__s_Option(e$2);
      if ((!o11.isEmpty__Z())) {
        var e$3 = o11.get__O();
        var $$x1 = new $c_s_util_Failure(e$3);
        break matchEnd8
      };
      throw ((e$2 instanceof $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$c_sjs_js_JavaScriptException) ? e$2.sjs_js_JavaScriptException__f_exception : e$2)
    }
  };
  $$x1.fold__F1__F1__O(new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$c_sjsr_AnonFunction1(((_$1) => {
    var _$1$1 = _$1;
    $f_Lcom_raquo_airstream_core_WritableStream__fireError__jl_Throwable__Lcom_raquo_airstream_core_Transaction__V(this, _$1$1, transaction)
  })), new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$c_sjsr_AnonFunction1(((nextValue) => {
    var nextValue$1 = nextValue;
    if ((!nextValue$1.isEmpty__Z())) {
      var arg1 = nextValue$1.get__O();
      $f_Lcom_raquo_airstream_core_WritableStream__fireValue__O__Lcom_raquo_airstream_core_Transaction__V(this, arg1, transaction)
    }
  })))
});
$c_Lcom_raquo_airstream_misc_CollectStream.prototype.onError__jl_Throwable__Lcom_raquo_airstream_core_Transaction__V = (function(nextError, transaction) {
  $f_Lcom_raquo_airstream_core_WritableStream__fireError__jl_Throwable__Lcom_raquo_airstream_core_Transaction__V(this, nextError, transaction)
});
$c_Lcom_raquo_airstream_misc_CollectStream.prototype.parent__Lcom_raquo_airstream_core_Observable = (function() {
  return this.Lcom_raquo_airstream_misc_CollectStream__f_parent
});
$c_Lcom_raquo_airstream_misc_CollectStream.prototype.map__F1__Lcom_raquo_airstream_core_Observable = (function(project) {
  return new $c_Lcom_raquo_airstream_misc_MapStream(this, project, $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$m_s_None$())
});
$c_Lcom_raquo_airstream_misc_CollectStream.prototype.toObservable__Lcom_raquo_airstream_core_Observable = (function() {
  return this
});
var $d_Lcom_raquo_airstream_misc_CollectStream = new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$TypeData().initClass({
  Lcom_raquo_airstream_misc_CollectStream: 0
}, false, "com.raquo.airstream.misc.CollectStream", {
  Lcom_raquo_airstream_misc_CollectStream: 1,
  O: 1,
  Lcom_raquo_airstream_core_Source: 1,
  Lcom_raquo_airstream_core_Named: 1,
  Lcom_raquo_airstream_core_BaseObservable: 1,
  Lcom_raquo_airstream_core_Observable: 1,
  Lcom_raquo_airstream_core_Source$EventSource: 1,
  Lcom_raquo_airstream_core_EventStream: 1,
  Lcom_raquo_airstream_core_WritableObservable: 1,
  Lcom_raquo_airstream_core_WritableStream: 1,
  Lcom_raquo_airstream_core_InternalObserver: 1,
  Lcom_raquo_airstream_common_SingleParentStream: 1,
  Lcom_raquo_airstream_common_InternalNextErrorObserver: 1
});
$c_Lcom_raquo_airstream_misc_CollectStream.prototype.$classData = $d_Lcom_raquo_airstream_misc_CollectStream;
/** @constructor */
function $c_Lcom_raquo_airstream_misc_MapSignal(parent, project, recover) {
  this.Lcom_raquo_airstream_misc_MapSignal__f_maybeDisplayName = null;
  this.Lcom_raquo_airstream_misc_MapSignal__f_isSafeToRemoveObserver = false;
  this.Lcom_raquo_airstream_misc_MapSignal__f_maybePendingObserverRemovals = null;
  this.Lcom_raquo_airstream_misc_MapSignal__f__lastUpdateId = 0;
  this.Lcom_raquo_airstream_misc_MapSignal__f_externalObservers = null;
  this.Lcom_raquo_airstream_misc_MapSignal__f_internalObservers = null;
  this.Lcom_raquo_airstream_misc_MapSignal__f_maybeLastSeenCurrentValue = null;
  this.Lcom_raquo_airstream_misc_MapSignal__f_parentIsSignal = false;
  this.Lcom_raquo_airstream_misc_MapSignal__f__parentLastUpdateId = 0;
  this.Lcom_raquo_airstream_misc_MapSignal__f_parent = null;
  this.Lcom_raquo_airstream_misc_MapSignal__f_project = null;
  this.Lcom_raquo_airstream_misc_MapSignal__f_recover = null;
  this.Lcom_raquo_airstream_misc_MapSignal__f_topoRank = 0;
  this.Lcom_raquo_airstream_misc_MapSignal__f_parent = parent;
  this.Lcom_raquo_airstream_misc_MapSignal__f_project = project;
  this.Lcom_raquo_airstream_misc_MapSignal__f_recover = recover;
  this.Lcom_raquo_airstream_misc_MapSignal__f_maybeDisplayName = (void 0);
  $f_Lcom_raquo_airstream_core_BaseObservable__$init$__V(this);
  this.Lcom_raquo_airstream_misc_MapSignal__f__lastUpdateId = 0;
  $f_Lcom_raquo_airstream_core_WritableObservable__$init$__V(this);
  this.Lcom_raquo_airstream_misc_MapSignal__f_maybeLastSeenCurrentValue = (void 0);
  $f_Lcom_raquo_airstream_common_SingleParentSignal__$init$__V(this);
  this.Lcom_raquo_airstream_misc_MapSignal__f_topoRank = ((1 + ($m_Lcom_raquo_airstream_core_Protected$(), parent.topoRank__I())) | 0)
}
$c_Lcom_raquo_airstream_misc_MapSignal.prototype = new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$h_O();
$c_Lcom_raquo_airstream_misc_MapSignal.prototype.constructor = $c_Lcom_raquo_airstream_misc_MapSignal;
/** @constructor */
function $h_Lcom_raquo_airstream_misc_MapSignal() {
  /*<skip>*/
}
$h_Lcom_raquo_airstream_misc_MapSignal.prototype = $c_Lcom_raquo_airstream_misc_MapSignal.prototype;
$c_Lcom_raquo_airstream_misc_MapSignal.prototype.maybeDisplayName__O = (function() {
  return this.Lcom_raquo_airstream_misc_MapSignal__f_maybeDisplayName
});
$c_Lcom_raquo_airstream_misc_MapSignal.prototype.toString__T = (function() {
  return $f_Lcom_raquo_airstream_core_Named__displayName__T(this)
});
$c_Lcom_raquo_airstream_misc_MapSignal.prototype.isSafeToRemoveObserver__Z = (function() {
  return this.Lcom_raquo_airstream_misc_MapSignal__f_isSafeToRemoveObserver
});
$c_Lcom_raquo_airstream_misc_MapSignal.prototype.maybePendingObserverRemovals__O = (function() {
  return this.Lcom_raquo_airstream_misc_MapSignal__f_maybePendingObserverRemovals
});
$c_Lcom_raquo_airstream_misc_MapSignal.prototype.isSafeToRemoveObserver_$eq__Z__V = (function(x$1) {
  this.Lcom_raquo_airstream_misc_MapSignal__f_isSafeToRemoveObserver = x$1
});
$c_Lcom_raquo_airstream_misc_MapSignal.prototype.maybePendingObserverRemovals_$eq__O__V = (function(x$1) {
  this.Lcom_raquo_airstream_misc_MapSignal__f_maybePendingObserverRemovals = x$1
});
$c_Lcom_raquo_airstream_misc_MapSignal.prototype.equals__O__Z = (function(obj) {
  return (this === obj)
});
$c_Lcom_raquo_airstream_misc_MapSignal.prototype.hashCode__I = (function() {
  return $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$systemIdentityHashCode(this)
});
$c_Lcom_raquo_airstream_misc_MapSignal.prototype._lastUpdateId__I = (function() {
  return this.Lcom_raquo_airstream_misc_MapSignal__f__lastUpdateId
});
$c_Lcom_raquo_airstream_misc_MapSignal.prototype._lastUpdateId_$eq__I__V = (function(x$1) {
  this.Lcom_raquo_airstream_misc_MapSignal__f__lastUpdateId = x$1
});
$c_Lcom_raquo_airstream_misc_MapSignal.prototype.toObservable__Lcom_raquo_airstream_core_Signal = (function() {
  return this
});
$c_Lcom_raquo_airstream_misc_MapSignal.prototype.onAddedExternalObserver__Lcom_raquo_airstream_core_Observer__V = (function(observer) {
  observer.onTry__s_util_Try__V($f_Lcom_raquo_airstream_core_WritableSignal__tryNow__s_util_Try(this))
});
$c_Lcom_raquo_airstream_misc_MapSignal.prototype.externalObservers__Lcom_raquo_ew_JsArray = (function() {
  return this.Lcom_raquo_airstream_misc_MapSignal__f_externalObservers
});
$c_Lcom_raquo_airstream_misc_MapSignal.prototype.internalObservers__Lcom_raquo_ew_JsArray = (function() {
  return this.Lcom_raquo_airstream_misc_MapSignal__f_internalObservers
});
$c_Lcom_raquo_airstream_misc_MapSignal.prototype.com$raquo$airstream$core$WritableObservable$_setter_$externalObservers_$eq__Lcom_raquo_ew_JsArray__V = (function(x$0) {
  this.Lcom_raquo_airstream_misc_MapSignal__f_externalObservers = x$0
});
$c_Lcom_raquo_airstream_misc_MapSignal.prototype.com$raquo$airstream$core$WritableObservable$_setter_$internalObservers_$eq__Lcom_raquo_ew_JsArray__V = (function(x$0) {
  this.Lcom_raquo_airstream_misc_MapSignal__f_internalObservers = x$0
});
$c_Lcom_raquo_airstream_misc_MapSignal.prototype.maybeLastSeenCurrentValue__O = (function() {
  return this.Lcom_raquo_airstream_misc_MapSignal__f_maybeLastSeenCurrentValue
});
$c_Lcom_raquo_airstream_misc_MapSignal.prototype.maybeLastSeenCurrentValue_$eq__O__V = (function(x$1) {
  this.Lcom_raquo_airstream_misc_MapSignal__f_maybeLastSeenCurrentValue = x$1
});
$c_Lcom_raquo_airstream_misc_MapSignal.prototype.tryNow__s_util_Try = (function() {
  return $f_Lcom_raquo_airstream_core_WritableSignal__tryNow__s_util_Try(this)
});
$c_Lcom_raquo_airstream_misc_MapSignal.prototype.fireTry__s_util_Try__Lcom_raquo_airstream_core_Transaction__V = (function(nextValue, transaction) {
  $f_Lcom_raquo_airstream_core_WritableSignal__fireTry__s_util_Try__Lcom_raquo_airstream_core_Transaction__V(this, nextValue, transaction)
});
$c_Lcom_raquo_airstream_misc_MapSignal.prototype.onNext__O__Lcom_raquo_airstream_core_Transaction__V = (function(nextValue, transaction) {
  $f_Lcom_raquo_airstream_common_InternalTryObserver__onNext__O__Lcom_raquo_airstream_core_Transaction__V(this, nextValue, transaction)
});
$c_Lcom_raquo_airstream_misc_MapSignal.prototype.onError__jl_Throwable__Lcom_raquo_airstream_core_Transaction__V = (function(nextError, transaction) {
  $f_Lcom_raquo_airstream_common_InternalTryObserver__onError__jl_Throwable__Lcom_raquo_airstream_core_Transaction__V(this, nextError, transaction)
});
$c_Lcom_raquo_airstream_misc_MapSignal.prototype.onWillStart__V = (function() {
  $f_Lcom_raquo_airstream_common_SingleParentSignal__onWillStart__V(this)
});
$c_Lcom_raquo_airstream_misc_MapSignal.prototype.onStart__V = (function() {
  $f_Lcom_raquo_airstream_common_SingleParentSignal__onStart__V(this)
});
$c_Lcom_raquo_airstream_misc_MapSignal.prototype.onStop__V = (function() {
  $f_Lcom_raquo_airstream_common_SingleParentSignal__onStop__V(this)
});
$c_Lcom_raquo_airstream_misc_MapSignal.prototype.topoRank__I = (function() {
  return this.Lcom_raquo_airstream_misc_MapSignal__f_topoRank
});
$c_Lcom_raquo_airstream_misc_MapSignal.prototype.onTry__s_util_Try__Lcom_raquo_airstream_core_Transaction__V = (function(nextParentValue, transaction) {
  $f_Lcom_raquo_airstream_common_SingleParentSignal__onTry__s_util_Try__Lcom_raquo_airstream_core_Transaction__V(this, nextParentValue, transaction);
  nextParentValue.fold__F1__F1__O(new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$c_sjsr_AnonFunction1(((nextError) => {
    var nextError$1 = nextError;
    var this$2 = this.Lcom_raquo_airstream_misc_MapSignal__f_recover;
    if (this$2.isEmpty__Z()) {
      $f_Lcom_raquo_airstream_core_WritableSignal__fireError__jl_Throwable__Lcom_raquo_airstream_core_Transaction__V(this, nextError$1, transaction)
    } else {
      var arg1 = this$2.get__O();
      var pf = arg1;
      try {
        var $$x1 = new $c_s_util_Success(pf.applyOrElse__O__F1__O(nextError$1, new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$c_sjsr_AnonFunction1(((_$1) => null))))
      } catch (e) {
        var e$2 = ((e instanceof $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$c_jl_Throwable) ? e : new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$c_sjs_js_JavaScriptException(e));
        matchEnd8: {
          var $$x1;
          var o11 = $m_s_util_control_NonFatal$().unapply__jl_Throwable__s_Option(e$2);
          if ((!o11.isEmpty__Z())) {
            var e$3 = o11.get__O();
            var $$x1 = new $c_s_util_Failure(e$3);
            break matchEnd8
          };
          throw ((e$2 instanceof $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$c_sjs_js_JavaScriptException) ? e$2.sjs_js_JavaScriptException__f_exception : e$2)
        }
      };
      $$x1.fold__F1__F1__O(new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$c_sjsr_AnonFunction1(((tryError) => {
        var tryError$1 = tryError;
        var nextError$2 = new $c_Lcom_raquo_airstream_core_AirstreamError$ErrorHandlingError(tryError$1, nextError$1);
        $f_Lcom_raquo_airstream_core_WritableSignal__fireError__jl_Throwable__Lcom_raquo_airstream_core_Transaction__V(this, nextError$2, transaction)
      })), new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$c_sjsr_AnonFunction1(((nextValue) => {
        var nextValue$1 = nextValue;
        if ((nextValue$1 === null)) {
          $f_Lcom_raquo_airstream_core_WritableSignal__fireError__jl_Throwable__Lcom_raquo_airstream_core_Transaction__V(this, nextError$1, transaction)
        } else if ((!nextValue$1.isEmpty__Z())) {
          var arg1$1 = nextValue$1.get__O();
          $f_Lcom_raquo_airstream_core_WritableSignal__fireValue__O__Lcom_raquo_airstream_core_Transaction__V(this, arg1$1, transaction)
        }
      })))
    }
  })), new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$c_sjsr_AnonFunction1(((_$3) => {
    var nextValue$2 = nextParentValue.map__F1__s_util_Try(this.Lcom_raquo_airstream_misc_MapSignal__f_project);
    $f_Lcom_raquo_airstream_core_WritableSignal__fireTry__s_util_Try__Lcom_raquo_airstream_core_Transaction__V(this, nextValue$2, transaction)
  })))
});
$c_Lcom_raquo_airstream_misc_MapSignal.prototype.currentValueFromParent__s_util_Try = (function() {
  var originalValue = this.Lcom_raquo_airstream_misc_MapSignal__f_parent.tryNow__s_util_Try().map__F1__s_util_Try(this.Lcom_raquo_airstream_misc_MapSignal__f_project);
  return originalValue.fold__F1__F1__O(new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$c_sjsr_AnonFunction1(((nextError) => {
    var nextError$1 = nextError;
    var this$2 = this.Lcom_raquo_airstream_misc_MapSignal__f_recover;
    if (this$2.isEmpty__Z()) {
      return originalValue
    } else {
      var arg1 = this$2.get__O();
      var pf = arg1;
      try {
        var $$x1 = new $c_s_util_Success(pf.applyOrElse__O__F1__O(nextError$1, new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$c_sjsr_AnonFunction1(((_$4) => null))))
      } catch (e) {
        var e$2 = ((e instanceof $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$c_jl_Throwable) ? e : new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$c_sjs_js_JavaScriptException(e));
        matchEnd8: {
          var $$x1;
          var o11 = $m_s_util_control_NonFatal$().unapply__jl_Throwable__s_Option(e$2);
          if ((!o11.isEmpty__Z())) {
            var e$3 = o11.get__O();
            var $$x1 = new $c_s_util_Failure(e$3);
            break matchEnd8
          };
          throw ((e$2 instanceof $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$c_sjs_js_JavaScriptException) ? e$2.sjs_js_JavaScriptException__f_exception : e$2)
        }
      };
      return $$x1.fold__F1__F1__O(new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$c_sjsr_AnonFunction1(((tryError) => {
        var tryError$1 = tryError;
        var exception = new $c_Lcom_raquo_airstream_core_AirstreamError$ErrorHandlingError(tryError$1, nextError$1);
        return new $c_s_util_Failure(exception)
      })), new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$c_sjsr_AnonFunction1(((nextValue) => {
        var nextValue$1 = nextValue;
        if ((nextValue$1 === null)) {
          return originalValue
        } else {
          if (nextValue$1.isEmpty__Z()) {
            var this$7 = $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$m_s_None$()
          } else {
            var arg1$1 = nextValue$1.get__O();
            var this$7 = new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$c_s_Some(new $c_s_util_Success(arg1$1))
          };
          return (this$7.isEmpty__Z() ? originalValue : this$7.get__O())
        }
      })))
    }
  })), new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$c_sjsr_AnonFunction1(((_$6) => originalValue)))
});
$c_Lcom_raquo_airstream_misc_MapSignal.prototype.map__F1__Lcom_raquo_airstream_core_Observable = (function(project) {
  return new $c_Lcom_raquo_airstream_misc_MapSignal(this, project, $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$m_s_None$())
});
$c_Lcom_raquo_airstream_misc_MapSignal.prototype.toObservable__Lcom_raquo_airstream_core_Observable = (function() {
  return this
});
var $d_Lcom_raquo_airstream_misc_MapSignal = new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$TypeData().initClass({
  Lcom_raquo_airstream_misc_MapSignal: 0
}, false, "com.raquo.airstream.misc.MapSignal", {
  Lcom_raquo_airstream_misc_MapSignal: 1,
  O: 1,
  Lcom_raquo_airstream_core_Source: 1,
  Lcom_raquo_airstream_core_Named: 1,
  Lcom_raquo_airstream_core_BaseObservable: 1,
  Lcom_raquo_airstream_core_Observable: 1,
  Lcom_raquo_airstream_core_Source$SignalSource: 1,
  Lcom_raquo_airstream_core_Signal: 1,
  Lcom_raquo_airstream_core_WritableObservable: 1,
  Lcom_raquo_airstream_core_WritableSignal: 1,
  Lcom_raquo_airstream_core_InternalObserver: 1,
  Lcom_raquo_airstream_common_InternalTryObserver: 1,
  Lcom_raquo_airstream_common_SingleParentSignal: 1
});
$c_Lcom_raquo_airstream_misc_MapSignal.prototype.$classData = $d_Lcom_raquo_airstream_misc_MapSignal;
/** @constructor */
function $c_Lcom_raquo_airstream_misc_MapStream(parent, project, recover) {
  this.Lcom_raquo_airstream_misc_MapStream__f_maybeDisplayName = null;
  this.Lcom_raquo_airstream_misc_MapStream__f_isSafeToRemoveObserver = false;
  this.Lcom_raquo_airstream_misc_MapStream__f_maybePendingObserverRemovals = null;
  this.Lcom_raquo_airstream_misc_MapStream__f_externalObservers = null;
  this.Lcom_raquo_airstream_misc_MapStream__f_internalObservers = null;
  this.Lcom_raquo_airstream_misc_MapStream__f_parent = null;
  this.Lcom_raquo_airstream_misc_MapStream__f_project = null;
  this.Lcom_raquo_airstream_misc_MapStream__f_recover = null;
  this.Lcom_raquo_airstream_misc_MapStream__f_topoRank = 0;
  this.Lcom_raquo_airstream_misc_MapStream__f_parent = parent;
  this.Lcom_raquo_airstream_misc_MapStream__f_project = project;
  this.Lcom_raquo_airstream_misc_MapStream__f_recover = recover;
  this.Lcom_raquo_airstream_misc_MapStream__f_maybeDisplayName = (void 0);
  $f_Lcom_raquo_airstream_core_BaseObservable__$init$__V(this);
  $f_Lcom_raquo_airstream_core_WritableObservable__$init$__V(this);
  this.Lcom_raquo_airstream_misc_MapStream__f_topoRank = ((1 + ($m_Lcom_raquo_airstream_core_Protected$(), parent.topoRank__I())) | 0)
}
$c_Lcom_raquo_airstream_misc_MapStream.prototype = new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$h_O();
$c_Lcom_raquo_airstream_misc_MapStream.prototype.constructor = $c_Lcom_raquo_airstream_misc_MapStream;
/** @constructor */
function $h_Lcom_raquo_airstream_misc_MapStream() {
  /*<skip>*/
}
$h_Lcom_raquo_airstream_misc_MapStream.prototype = $c_Lcom_raquo_airstream_misc_MapStream.prototype;
$c_Lcom_raquo_airstream_misc_MapStream.prototype.maybeDisplayName__O = (function() {
  return this.Lcom_raquo_airstream_misc_MapStream__f_maybeDisplayName
});
$c_Lcom_raquo_airstream_misc_MapStream.prototype.toString__T = (function() {
  return $f_Lcom_raquo_airstream_core_Named__displayName__T(this)
});
$c_Lcom_raquo_airstream_misc_MapStream.prototype.isSafeToRemoveObserver__Z = (function() {
  return this.Lcom_raquo_airstream_misc_MapStream__f_isSafeToRemoveObserver
});
$c_Lcom_raquo_airstream_misc_MapStream.prototype.maybePendingObserverRemovals__O = (function() {
  return this.Lcom_raquo_airstream_misc_MapStream__f_maybePendingObserverRemovals
});
$c_Lcom_raquo_airstream_misc_MapStream.prototype.isSafeToRemoveObserver_$eq__Z__V = (function(x$1) {
  this.Lcom_raquo_airstream_misc_MapStream__f_isSafeToRemoveObserver = x$1
});
$c_Lcom_raquo_airstream_misc_MapStream.prototype.maybePendingObserverRemovals_$eq__O__V = (function(x$1) {
  this.Lcom_raquo_airstream_misc_MapStream__f_maybePendingObserverRemovals = x$1
});
$c_Lcom_raquo_airstream_misc_MapStream.prototype.equals__O__Z = (function(obj) {
  return (this === obj)
});
$c_Lcom_raquo_airstream_misc_MapStream.prototype.hashCode__I = (function() {
  return $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$systemIdentityHashCode(this)
});
$c_Lcom_raquo_airstream_misc_MapStream.prototype.onAddedExternalObserver__Lcom_raquo_airstream_core_Observer__V = (function(observer) {
  /*<skip>*/
});
$c_Lcom_raquo_airstream_misc_MapStream.prototype.externalObservers__Lcom_raquo_ew_JsArray = (function() {
  return this.Lcom_raquo_airstream_misc_MapStream__f_externalObservers
});
$c_Lcom_raquo_airstream_misc_MapStream.prototype.internalObservers__Lcom_raquo_ew_JsArray = (function() {
  return this.Lcom_raquo_airstream_misc_MapStream__f_internalObservers
});
$c_Lcom_raquo_airstream_misc_MapStream.prototype.com$raquo$airstream$core$WritableObservable$_setter_$externalObservers_$eq__Lcom_raquo_ew_JsArray__V = (function(x$0) {
  this.Lcom_raquo_airstream_misc_MapStream__f_externalObservers = x$0
});
$c_Lcom_raquo_airstream_misc_MapStream.prototype.com$raquo$airstream$core$WritableObservable$_setter_$internalObservers_$eq__Lcom_raquo_ew_JsArray__V = (function(x$0) {
  this.Lcom_raquo_airstream_misc_MapStream__f_internalObservers = x$0
});
$c_Lcom_raquo_airstream_misc_MapStream.prototype.fireTry__s_util_Try__Lcom_raquo_airstream_core_Transaction__V = (function(nextValue, transaction) {
  $f_Lcom_raquo_airstream_core_WritableStream__fireTry__s_util_Try__Lcom_raquo_airstream_core_Transaction__V(this, nextValue, transaction)
});
$c_Lcom_raquo_airstream_misc_MapStream.prototype.onWillStart__V = (function() {
  $m_Lcom_raquo_airstream_core_Protected$();
  var observable = this.Lcom_raquo_airstream_misc_MapStream__f_parent;
  $f_Lcom_raquo_airstream_core_BaseObservable__maybeWillStart__V(observable)
});
$c_Lcom_raquo_airstream_misc_MapStream.prototype.onStart__V = (function() {
  $f_Lcom_raquo_airstream_common_SingleParentStream__onStart__V(this)
});
$c_Lcom_raquo_airstream_misc_MapStream.prototype.onStop__V = (function() {
  $f_Lcom_raquo_airstream_common_SingleParentStream__onStop__V(this)
});
$c_Lcom_raquo_airstream_misc_MapStream.prototype.onTry__s_util_Try__Lcom_raquo_airstream_core_Transaction__V = (function(nextValue, transaction) {
  $f_Lcom_raquo_airstream_common_InternalNextErrorObserver__onTry__s_util_Try__Lcom_raquo_airstream_core_Transaction__V(this, nextValue, transaction)
});
$c_Lcom_raquo_airstream_misc_MapStream.prototype.parent__Lcom_raquo_airstream_core_Observable = (function() {
  return this.Lcom_raquo_airstream_misc_MapStream__f_parent
});
$c_Lcom_raquo_airstream_misc_MapStream.prototype.topoRank__I = (function() {
  return this.Lcom_raquo_airstream_misc_MapStream__f_topoRank
});
$c_Lcom_raquo_airstream_misc_MapStream.prototype.onNext__O__Lcom_raquo_airstream_core_Transaction__V = (function(nextParentValue, transaction) {
  try {
    var $$x1 = new $c_s_util_Success(this.Lcom_raquo_airstream_misc_MapStream__f_project.apply__O__O(nextParentValue))
  } catch (e) {
    var e$2 = ((e instanceof $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$c_jl_Throwable) ? e : new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$c_sjs_js_JavaScriptException(e));
    matchEnd8: {
      var $$x1;
      var o11 = $m_s_util_control_NonFatal$().unapply__jl_Throwable__s_Option(e$2);
      if ((!o11.isEmpty__Z())) {
        var e$3 = o11.get__O();
        var $$x1 = new $c_s_util_Failure(e$3);
        break matchEnd8
      };
      throw ((e$2 instanceof $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$c_sjs_js_JavaScriptException) ? e$2.sjs_js_JavaScriptException__f_exception : e$2)
    }
  };
  $$x1.fold__F1__F1__O(new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$c_sjsr_AnonFunction1(((_$1) => {
    var _$1$1 = _$1;
    this.onError__jl_Throwable__Lcom_raquo_airstream_core_Transaction__V(_$1$1, transaction)
  })), new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$c_sjsr_AnonFunction1(((_$2) => {
    $f_Lcom_raquo_airstream_core_WritableStream__fireValue__O__Lcom_raquo_airstream_core_Transaction__V(this, _$2, transaction)
  })))
});
$c_Lcom_raquo_airstream_misc_MapStream.prototype.onError__jl_Throwable__Lcom_raquo_airstream_core_Transaction__V = (function(nextError, transaction) {
  var this$1 = this.Lcom_raquo_airstream_misc_MapStream__f_recover;
  if (this$1.isEmpty__Z()) {
    $f_Lcom_raquo_airstream_core_WritableStream__fireError__jl_Throwable__Lcom_raquo_airstream_core_Transaction__V(this, nextError, transaction)
  } else {
    var arg1 = this$1.get__O();
    var pf = arg1;
    try {
      var $$x1 = new $c_s_util_Success(pf.applyOrElse__O__F1__O(nextError, new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$c_sjsr_AnonFunction1(((_$3) => null))))
    } catch (e) {
      var e$2 = ((e instanceof $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$c_jl_Throwable) ? e : new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$c_sjs_js_JavaScriptException(e));
      matchEnd8: {
        var $$x1;
        var o11 = $m_s_util_control_NonFatal$().unapply__jl_Throwable__s_Option(e$2);
        if ((!o11.isEmpty__Z())) {
          var e$3 = o11.get__O();
          var $$x1 = new $c_s_util_Failure(e$3);
          break matchEnd8
        };
        throw ((e$2 instanceof $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$c_sjs_js_JavaScriptException) ? e$2.sjs_js_JavaScriptException__f_exception : e$2)
      }
    };
    $$x1.fold__F1__F1__O(new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$c_sjsr_AnonFunction1(((tryError) => {
      var tryError$1 = tryError;
      var nextError$1 = new $c_Lcom_raquo_airstream_core_AirstreamError$ErrorHandlingError(tryError$1, nextError);
      $f_Lcom_raquo_airstream_core_WritableStream__fireError__jl_Throwable__Lcom_raquo_airstream_core_Transaction__V(this, nextError$1, transaction)
    })), new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$c_sjsr_AnonFunction1(((nextValue) => {
      var nextValue$1 = nextValue;
      if ((nextValue$1 === null)) {
        $f_Lcom_raquo_airstream_core_WritableStream__fireError__jl_Throwable__Lcom_raquo_airstream_core_Transaction__V(this, nextError, transaction)
      } else if ((!nextValue$1.isEmpty__Z())) {
        var arg1$1 = nextValue$1.get__O();
        $f_Lcom_raquo_airstream_core_WritableStream__fireValue__O__Lcom_raquo_airstream_core_Transaction__V(this, arg1$1, transaction)
      }
    })))
  }
});
$c_Lcom_raquo_airstream_misc_MapStream.prototype.map__F1__Lcom_raquo_airstream_core_Observable = (function(project) {
  return new $c_Lcom_raquo_airstream_misc_MapStream(this, project, $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$m_s_None$())
});
$c_Lcom_raquo_airstream_misc_MapStream.prototype.toObservable__Lcom_raquo_airstream_core_Observable = (function() {
  return this
});
var $d_Lcom_raquo_airstream_misc_MapStream = new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$TypeData().initClass({
  Lcom_raquo_airstream_misc_MapStream: 0
}, false, "com.raquo.airstream.misc.MapStream", {
  Lcom_raquo_airstream_misc_MapStream: 1,
  O: 1,
  Lcom_raquo_airstream_core_Source: 1,
  Lcom_raquo_airstream_core_Named: 1,
  Lcom_raquo_airstream_core_BaseObservable: 1,
  Lcom_raquo_airstream_core_Observable: 1,
  Lcom_raquo_airstream_core_Source$EventSource: 1,
  Lcom_raquo_airstream_core_EventStream: 1,
  Lcom_raquo_airstream_core_WritableObservable: 1,
  Lcom_raquo_airstream_core_WritableStream: 1,
  Lcom_raquo_airstream_core_InternalObserver: 1,
  Lcom_raquo_airstream_common_SingleParentStream: 1,
  Lcom_raquo_airstream_common_InternalNextErrorObserver: 1
});
$c_Lcom_raquo_airstream_misc_MapStream.prototype.$classData = $d_Lcom_raquo_airstream_misc_MapStream;
/** @constructor */
function $c_Lcom_raquo_laminar_api_package$$anon$1() {
  this.Lcom_raquo_laminar_api_package$$anon$1__f_Observer = null;
  this.Lcom_raquo_laminar_api_package$$anon$1__f_Val = null;
  this.Lcom_raquo_laminar_api_package$$anon$1__f_Var = null;
  this.Lcom_raquo_laminar_api_package$$anon$1__f_img$lzy1 = null;
  this.Lcom_raquo_laminar_api_package$$anon$1__f_imgbitmap$1 = false;
  this.Lcom_raquo_laminar_api_package$$anon$1__f_h1$lzy1 = null;
  this.Lcom_raquo_laminar_api_package$$anon$1__f_h1bitmap$1 = false;
  this.Lcom_raquo_laminar_api_package$$anon$1__f_h2$lzy1 = null;
  this.Lcom_raquo_laminar_api_package$$anon$1__f_h2bitmap$1 = false;
  this.Lcom_raquo_laminar_api_package$$anon$1__f_div$lzy1 = null;
  this.Lcom_raquo_laminar_api_package$$anon$1__f_divbitmap$1 = false;
  this.Lcom_raquo_laminar_api_package$$anon$1__f_src$lzy1 = null;
  this.Lcom_raquo_laminar_api_package$$anon$1__f_srcbitmap$1 = false;
  this.Lcom_raquo_laminar_api_package$$anon$1__f_idAttr$lzy1 = null;
  this.Lcom_raquo_laminar_api_package$$anon$1__f_idAttrbitmap$1 = false;
  this.Lcom_raquo_laminar_api_package$$anon$1__f_onLoad$lzy1 = null;
  this.Lcom_raquo_laminar_api_package$$anon$1__f_onLoadbitmap$1 = false;
  this.Lcom_raquo_laminar_api_package$$anon$1__f_backgroundColor$lzy1 = null;
  this.Lcom_raquo_laminar_api_package$$anon$1__f_backgroundColorbitmap$1 = false;
  this.Lcom_raquo_laminar_api_package$$anon$1__f_border$lzy1 = null;
  this.Lcom_raquo_laminar_api_package$$anon$1__f_borderbitmap$1 = false;
  this.Lcom_raquo_laminar_api_package$$anon$1__f_padding$lzy1 = null;
  this.Lcom_raquo_laminar_api_package$$anon$1__f_paddingbitmap$1 = false;
  this.Lcom_raquo_laminar_api_package$$anon$1__f_className = null;
  this.Lcom_raquo_laminar_api_package$$anon$1__f_svg$lzy1 = null;
  this.Lcom_raquo_laminar_api_package$$anon$1__f_svgbitmap$1 = false;
  this.Lcom_raquo_laminar_api_package$$anon$1__f_documentEventProps = null;
  this.Lcom_raquo_laminar_api_package$$anon$1__f_unsafeWindowOwner$lzy1 = null;
  this.Lcom_raquo_laminar_api_package$$anon$1__f_unsafeWindowOwnerbitmap$1 = false;
  this.Lcom_raquo_laminar_api_package$$anon$1__f_Modifier = null;
  this.Lcom_raquo_laminar_api_package$$anon$1__f_child = null;
  this.Lcom_raquo_laminar_api_package$$anon$1__f_children = null;
  $f_Lcom_raquo_laminar_api_Airstream__$init$__V(this);
  $f_Lcom_raquo_laminar_defs_complex_ComplexHtmlKeys__$init$__V(this);
  $f_Lcom_raquo_laminar_api_Laminar__$init$__V(this)
}
$c_Lcom_raquo_laminar_api_package$$anon$1.prototype = new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$h_O();
$c_Lcom_raquo_laminar_api_package$$anon$1.prototype.constructor = $c_Lcom_raquo_laminar_api_package$$anon$1;
/** @constructor */
function $h_Lcom_raquo_laminar_api_package$$anon$1() {
  /*<skip>*/
}
$h_Lcom_raquo_laminar_api_package$$anon$1.prototype = $c_Lcom_raquo_laminar_api_package$$anon$1.prototype;
$c_Lcom_raquo_laminar_api_package$$anon$1.prototype.img__Lcom_raquo_laminar_tags_HtmlTag = (function() {
  if ((!this.Lcom_raquo_laminar_api_package$$anon$1__f_imgbitmap$1)) {
    this.Lcom_raquo_laminar_api_package$$anon$1__f_img$lzy1 = new $c_Lcom_raquo_laminar_tags_HtmlTag("img", true);
    this.Lcom_raquo_laminar_api_package$$anon$1__f_imgbitmap$1 = true
  };
  return this.Lcom_raquo_laminar_api_package$$anon$1__f_img$lzy1
});
$c_Lcom_raquo_laminar_api_package$$anon$1.prototype.h1__Lcom_raquo_laminar_tags_HtmlTag = (function() {
  if ((!this.Lcom_raquo_laminar_api_package$$anon$1__f_h1bitmap$1)) {
    this.Lcom_raquo_laminar_api_package$$anon$1__f_h1$lzy1 = new $c_Lcom_raquo_laminar_tags_HtmlTag("h1", false);
    this.Lcom_raquo_laminar_api_package$$anon$1__f_h1bitmap$1 = true
  };
  return this.Lcom_raquo_laminar_api_package$$anon$1__f_h1$lzy1
});
$c_Lcom_raquo_laminar_api_package$$anon$1.prototype.h2__Lcom_raquo_laminar_tags_HtmlTag = (function() {
  if ((!this.Lcom_raquo_laminar_api_package$$anon$1__f_h2bitmap$1)) {
    this.Lcom_raquo_laminar_api_package$$anon$1__f_h2$lzy1 = new $c_Lcom_raquo_laminar_tags_HtmlTag("h2", false);
    this.Lcom_raquo_laminar_api_package$$anon$1__f_h2bitmap$1 = true
  };
  return this.Lcom_raquo_laminar_api_package$$anon$1__f_h2$lzy1
});
$c_Lcom_raquo_laminar_api_package$$anon$1.prototype.div__Lcom_raquo_laminar_tags_HtmlTag = (function() {
  if ((!this.Lcom_raquo_laminar_api_package$$anon$1__f_divbitmap$1)) {
    this.Lcom_raquo_laminar_api_package$$anon$1__f_div$lzy1 = new $c_Lcom_raquo_laminar_tags_HtmlTag("div", false);
    this.Lcom_raquo_laminar_api_package$$anon$1__f_divbitmap$1 = true
  };
  return this.Lcom_raquo_laminar_api_package$$anon$1__f_div$lzy1
});
$c_Lcom_raquo_laminar_api_package$$anon$1.prototype.src__Lcom_raquo_laminar_keys_HtmlAttr = (function() {
  if ((!this.Lcom_raquo_laminar_api_package$$anon$1__f_srcbitmap$1)) {
    var codec = $m_Lcom_raquo_laminar_codecs_package$().Lcom_raquo_laminar_codecs_package$__f_StringAsIsCodec;
    this.Lcom_raquo_laminar_api_package$$anon$1__f_src$lzy1 = new $c_Lcom_raquo_laminar_keys_HtmlAttr("src", codec);
    this.Lcom_raquo_laminar_api_package$$anon$1__f_srcbitmap$1 = true
  };
  return this.Lcom_raquo_laminar_api_package$$anon$1__f_src$lzy1
});
$c_Lcom_raquo_laminar_api_package$$anon$1.prototype.idAttr__Lcom_raquo_laminar_keys_HtmlProp = (function() {
  if ((!this.Lcom_raquo_laminar_api_package$$anon$1__f_idAttrbitmap$1)) {
    var codec = $m_Lcom_raquo_laminar_codecs_package$().Lcom_raquo_laminar_codecs_package$__f_StringAsIsCodec;
    this.Lcom_raquo_laminar_api_package$$anon$1__f_idAttr$lzy1 = new $c_Lcom_raquo_laminar_keys_HtmlProp("id", codec);
    this.Lcom_raquo_laminar_api_package$$anon$1__f_idAttrbitmap$1 = true
  };
  return this.Lcom_raquo_laminar_api_package$$anon$1__f_idAttr$lzy1
});
$c_Lcom_raquo_laminar_api_package$$anon$1.prototype.onLoad__Lcom_raquo_laminar_keys_EventProp = (function() {
  if ((!this.Lcom_raquo_laminar_api_package$$anon$1__f_onLoadbitmap$1)) {
    this.Lcom_raquo_laminar_api_package$$anon$1__f_onLoad$lzy1 = new $c_Lcom_raquo_laminar_keys_EventProp("load");
    this.Lcom_raquo_laminar_api_package$$anon$1__f_onLoadbitmap$1 = true
  };
  return this.Lcom_raquo_laminar_api_package$$anon$1__f_onLoad$lzy1
});
$c_Lcom_raquo_laminar_api_package$$anon$1.prototype.backgroundColor__Lcom_raquo_laminar_keys_StyleProp = (function() {
  if ((!this.Lcom_raquo_laminar_api_package$$anon$1__f_backgroundColorbitmap$1)) {
    this.Lcom_raquo_laminar_api_package$$anon$1__f_backgroundColor$lzy1 = new $c_Lcom_raquo_laminar_defs_styles_StyleProps$$anon$2("background-color");
    this.Lcom_raquo_laminar_api_package$$anon$1__f_backgroundColorbitmap$1 = true
  };
  return this.Lcom_raquo_laminar_api_package$$anon$1__f_backgroundColor$lzy1
});
$c_Lcom_raquo_laminar_api_package$$anon$1.prototype.border__Lcom_raquo_laminar_keys_StyleProp = (function() {
  if ((!this.Lcom_raquo_laminar_api_package$$anon$1__f_borderbitmap$1)) {
    this.Lcom_raquo_laminar_api_package$$anon$1__f_border$lzy1 = $ct_Lcom_raquo_laminar_keys_StyleProp__T__sci_Seq__(new $c_Lcom_raquo_laminar_keys_StyleProp(), "border", $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$m_s_package$().s_package$__f_Nil);
    this.Lcom_raquo_laminar_api_package$$anon$1__f_borderbitmap$1 = true
  };
  return this.Lcom_raquo_laminar_api_package$$anon$1__f_border$lzy1
});
$c_Lcom_raquo_laminar_api_package$$anon$1.prototype.padding__Lcom_raquo_laminar_keys_StyleProp = (function() {
  if ((!this.Lcom_raquo_laminar_api_package$$anon$1__f_paddingbitmap$1)) {
    this.Lcom_raquo_laminar_api_package$$anon$1__f_padding$lzy1 = new $c_Lcom_raquo_laminar_defs_styles_StyleProps$$anon$5("padding");
    this.Lcom_raquo_laminar_api_package$$anon$1__f_paddingbitmap$1 = true
  };
  return this.Lcom_raquo_laminar_api_package$$anon$1__f_padding$lzy1
});
$c_Lcom_raquo_laminar_api_package$$anon$1.prototype.svg__Lcom_raquo_laminar_api_Laminar$svg$ = (function() {
  if ((!this.Lcom_raquo_laminar_api_package$$anon$1__f_svgbitmap$1)) {
    this.Lcom_raquo_laminar_api_package$$anon$1__f_svg$lzy1 = new $c_Lcom_raquo_laminar_api_Laminar$svg$(this);
    this.Lcom_raquo_laminar_api_package$$anon$1__f_svgbitmap$1 = true
  };
  return this.Lcom_raquo_laminar_api_package$$anon$1__f_svg$lzy1
});
$c_Lcom_raquo_laminar_api_package$$anon$1.prototype.unsafeWindowOwner__Lcom_raquo_laminar_api_Laminar$unsafeWindowOwner$ = (function() {
  if ((!this.Lcom_raquo_laminar_api_package$$anon$1__f_unsafeWindowOwnerbitmap$1)) {
    this.Lcom_raquo_laminar_api_package$$anon$1__f_unsafeWindowOwner$lzy1 = new $c_Lcom_raquo_laminar_api_Laminar$unsafeWindowOwner$(this);
    this.Lcom_raquo_laminar_api_package$$anon$1__f_unsafeWindowOwnerbitmap$1 = true
  };
  return this.Lcom_raquo_laminar_api_package$$anon$1__f_unsafeWindowOwner$lzy1
});
var $d_Lcom_raquo_laminar_api_package$$anon$1 = new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$TypeData().initClass({
  Lcom_raquo_laminar_api_package$$anon$1: 0
}, false, "com.raquo.laminar.api.package$$anon$1", {
  Lcom_raquo_laminar_api_package$$anon$1: 1,
  O: 1,
  Lcom_raquo_laminar_api_Airstream: 1,
  Lcom_raquo_laminar_defs_tags_HtmlTags: 1,
  Lcom_raquo_laminar_defs_attrs_HtmlAttrs: 1,
  Lcom_raquo_laminar_defs_props_HtmlProps: 1,
  Lcom_raquo_laminar_defs_eventProps_GlobalEventProps: 1,
  Lcom_raquo_laminar_defs_styles_StyleProps: 1,
  Lcom_raquo_laminar_defs_complex_ComplexHtmlKeys: 1,
  Lcom_raquo_laminar_Implicits$LowPriorityImplicits: 1,
  Lcom_raquo_laminar_keys_CompositeKey$CompositeValueMappers: 1,
  Lcom_raquo_laminar_Implicits: 1,
  Lcom_raquo_laminar_api_Laminar: 1
});
$c_Lcom_raquo_laminar_api_package$$anon$1.prototype.$classData = $d_Lcom_raquo_laminar_api_package$$anon$1;
/** @constructor */
function $c_sc_AbstractMap() {
  /*<skip>*/
}
$c_sc_AbstractMap.prototype = new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$h_sc_AbstractIterable();
$c_sc_AbstractMap.prototype.constructor = $c_sc_AbstractMap;
/** @constructor */
function $h_sc_AbstractMap() {
  /*<skip>*/
}
$h_sc_AbstractMap.prototype = $c_sc_AbstractMap.prototype;
$c_sc_AbstractMap.prototype.equals__O__Z = (function(o) {
  return $f_sc_Map__equals__O__Z(this, o)
});
$c_sc_AbstractMap.prototype.hashCode__I = (function() {
  return $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$m_s_util_hashing_MurmurHash3$().mapHash__sc_Map__I(this)
});
$c_sc_AbstractMap.prototype.stringPrefix__T = (function() {
  return "Map"
});
$c_sc_AbstractMap.prototype.toString__T = (function() {
  return $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$f_sc_Iterable__toString__T(this)
});
$c_sc_AbstractMap.prototype.applyOrElse__O__F1__O = (function(x, default$1) {
  return $f_sc_MapOps__applyOrElse__O__F1__O(this, x, default$1)
});
$c_sc_AbstractMap.prototype.foreachEntry__F2__V = (function(f) {
  $f_sc_MapOps__foreachEntry__F2__V(this, f)
});
$c_sc_AbstractMap.prototype.isDefinedAt__O__Z = (function(key) {
  return this.contains__O__Z(key)
});
$c_sc_AbstractMap.prototype.addString__scm_StringBuilder__T__T__T__scm_StringBuilder = (function(sb, start, sep, end) {
  return $f_sc_MapOps__addString__scm_StringBuilder__T__T__T__scm_StringBuilder(this, sb, start, sep, end)
});
$c_sc_AbstractMap.prototype.lift__F1 = (function() {
  return new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$c_s_PartialFunction$Lifted(this)
});
function $is_sci_Map(obj) {
  return (!(!((obj && obj.$classData) && obj.$classData.ancestors.sci_Map)))
}
function $isArrayOf_sci_Map(obj, depth) {
  return (!(!(((obj && obj.$classData) && (obj.$classData.arrayDepth === depth)) && obj.$classData.arrayBase.ancestors.sci_Map)))
}
/** @constructor */
function $c_sci_AbstractMap() {
  /*<skip>*/
}
$c_sci_AbstractMap.prototype = new $h_sc_AbstractMap();
$c_sci_AbstractMap.prototype.constructor = $c_sci_AbstractMap;
/** @constructor */
function $h_sci_AbstractMap() {
  /*<skip>*/
}
$h_sci_AbstractMap.prototype = $c_sci_AbstractMap.prototype;
$c_sci_AbstractMap.prototype.iterableFactory__sc_IterableFactory = (function() {
  return $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$m_sci_Iterable$()
});
/** @constructor */
function $c_sci_Map$EmptyMap$() {
  /*<skip>*/
}
$c_sci_Map$EmptyMap$.prototype = new $h_sci_AbstractMap();
$c_sci_Map$EmptyMap$.prototype.constructor = $c_sci_Map$EmptyMap$;
/** @constructor */
function $h_sci_Map$EmptyMap$() {
  /*<skip>*/
}
$h_sci_Map$EmptyMap$.prototype = $c_sci_Map$EmptyMap$.prototype;
$c_sci_Map$EmptyMap$.prototype.size__I = (function() {
  return 0
});
$c_sci_Map$EmptyMap$.prototype.knownSize__I = (function() {
  return 0
});
$c_sci_Map$EmptyMap$.prototype.isEmpty__Z = (function() {
  return true
});
$c_sci_Map$EmptyMap$.prototype.apply__O__E = (function(key) {
  throw $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$ct_ju_NoSuchElementException__T__(new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$c_ju_NoSuchElementException(), ("key not found: " + key))
});
$c_sci_Map$EmptyMap$.prototype.contains__O__Z = (function(key) {
  return false
});
$c_sci_Map$EmptyMap$.prototype.getOrElse__O__F0__O = (function(key, default$1) {
  return default$1.apply__O()
});
$c_sci_Map$EmptyMap$.prototype.iterator__sc_Iterator = (function() {
  return $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$m_sc_Iterator$().sc_Iterator$__f_scala$collection$Iterator$$_empty
});
$c_sci_Map$EmptyMap$.prototype.updated__O__O__sci_MapOps = (function(key, value) {
  return new $c_sci_Map$Map1(key, value)
});
$c_sci_Map$EmptyMap$.prototype.apply__O__O = (function(key) {
  this.apply__O__E(key)
});
var $d_sci_Map$EmptyMap$ = new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$TypeData().initClass({
  sci_Map$EmptyMap$: 0
}, false, "scala.collection.immutable.Map$EmptyMap$", {
  sci_Map$EmptyMap$: 1,
  sci_AbstractMap: 1,
  sc_AbstractMap: 1,
  sc_AbstractIterable: 1,
  O: 1,
  sc_Iterable: 1,
  sc_IterableOnce: 1,
  sc_IterableOps: 1,
  sc_IterableOnceOps: 1,
  sc_IterableFactoryDefaults: 1,
  sc_Map: 1,
  sc_MapOps: 1,
  s_PartialFunction: 1,
  F1: 1,
  sc_MapFactoryDefaults: 1,
  s_Equals: 1,
  sci_Map: 1,
  sci_Iterable: 1,
  sci_MapOps: 1,
  Ljava_io_Serializable: 1
});
$c_sci_Map$EmptyMap$.prototype.$classData = $d_sci_Map$EmptyMap$;
var $n_sci_Map$EmptyMap$;
function $m_sci_Map$EmptyMap$() {
  if ((!$n_sci_Map$EmptyMap$)) {
    $n_sci_Map$EmptyMap$ = new $c_sci_Map$EmptyMap$()
  };
  return $n_sci_Map$EmptyMap$
}
function $is_scm_Buffer(obj) {
  return (!(!((obj && obj.$classData) && obj.$classData.ancestors.scm_Buffer)))
}
function $isArrayOf_scm_Buffer(obj, depth) {
  return (!(!(((obj && obj.$classData) && (obj.$classData.arrayDepth === depth)) && obj.$classData.arrayBase.ancestors.scm_Buffer)))
}
/** @constructor */
function $c_sci_Map$Map1(key1, value1) {
  this.sci_Map$Map1__f_key1 = null;
  this.sci_Map$Map1__f_value1 = null;
  this.sci_Map$Map1__f_key1 = key1;
  this.sci_Map$Map1__f_value1 = value1
}
$c_sci_Map$Map1.prototype = new $h_sci_AbstractMap();
$c_sci_Map$Map1.prototype.constructor = $c_sci_Map$Map1;
/** @constructor */
function $h_sci_Map$Map1() {
  /*<skip>*/
}
$h_sci_Map$Map1.prototype = $c_sci_Map$Map1.prototype;
$c_sci_Map$Map1.prototype.map__F1__O = (function(f) {
  return $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$f_sc_StrictOptimizedIterableOps__map__F1__O(this, f)
});
$c_sci_Map$Map1.prototype.size__I = (function() {
  return 1
});
$c_sci_Map$Map1.prototype.knownSize__I = (function() {
  return 1
});
$c_sci_Map$Map1.prototype.isEmpty__Z = (function() {
  return false
});
$c_sci_Map$Map1.prototype.apply__O__O = (function(key) {
  if ($j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$m_sr_BoxesRunTime$().equals__O__O__Z(key, this.sci_Map$Map1__f_key1)) {
    return this.sci_Map$Map1__f_value1
  } else {
    throw $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$ct_ju_NoSuchElementException__T__(new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$c_ju_NoSuchElementException(), ("key not found: " + key))
  }
});
$c_sci_Map$Map1.prototype.contains__O__Z = (function(key) {
  return $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$m_sr_BoxesRunTime$().equals__O__O__Z(key, this.sci_Map$Map1__f_key1)
});
$c_sci_Map$Map1.prototype.getOrElse__O__F0__O = (function(key, default$1) {
  return ($j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$m_sr_BoxesRunTime$().equals__O__O__Z(key, this.sci_Map$Map1__f_key1) ? this.sci_Map$Map1__f_value1 : default$1.apply__O())
});
$c_sci_Map$Map1.prototype.iterator__sc_Iterator = (function() {
  $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$m_sc_Iterator$();
  var a = new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$c_T2(this.sci_Map$Map1__f_key1, this.sci_Map$Map1__f_value1);
  return new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$c_sc_Iterator$$anon$20(a)
});
$c_sci_Map$Map1.prototype.updated__O__O__sci_Map = (function(key, value) {
  return ($j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$m_sr_BoxesRunTime$().equals__O__O__Z(key, this.sci_Map$Map1__f_key1) ? new $c_sci_Map$Map1(this.sci_Map$Map1__f_key1, value) : new $c_sci_Map$Map2(this.sci_Map$Map1__f_key1, this.sci_Map$Map1__f_value1, key, value))
});
$c_sci_Map$Map1.prototype.forall__F1__Z = (function(p) {
  return (!(!p.apply__O__O(new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$c_T2(this.sci_Map$Map1__f_key1, this.sci_Map$Map1__f_value1))))
});
$c_sci_Map$Map1.prototype.hashCode__I = (function() {
  var a = 0;
  var b = 0;
  var c = 1;
  var h = $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$m_s_util_hashing_MurmurHash3$().tuple2Hash__O__O__I(this.sci_Map$Map1__f_key1, this.sci_Map$Map1__f_value1);
  a = ((a + h) | 0);
  b = (b ^ h);
  c = Math.imul(c, (1 | h));
  h = $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$m_s_util_hashing_MurmurHash3$().s_util_hashing_MurmurHash3$__f_mapSeed;
  h = $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$m_s_util_hashing_MurmurHash3$().mix__I__I__I(h, a);
  h = $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$m_s_util_hashing_MurmurHash3$().mix__I__I__I(h, b);
  h = $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$m_s_util_hashing_MurmurHash3$().mixLast__I__I__I(h, c);
  return $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$m_s_util_hashing_MurmurHash3$().finalizeHash__I__I__I(h, 1)
});
$c_sci_Map$Map1.prototype.updated__O__O__sci_MapOps = (function(key, value) {
  return this.updated__O__O__sci_Map(key, value)
});
var $d_sci_Map$Map1 = new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$TypeData().initClass({
  sci_Map$Map1: 0
}, false, "scala.collection.immutable.Map$Map1", {
  sci_Map$Map1: 1,
  sci_AbstractMap: 1,
  sc_AbstractMap: 1,
  sc_AbstractIterable: 1,
  O: 1,
  sc_Iterable: 1,
  sc_IterableOnce: 1,
  sc_IterableOps: 1,
  sc_IterableOnceOps: 1,
  sc_IterableFactoryDefaults: 1,
  sc_Map: 1,
  sc_MapOps: 1,
  s_PartialFunction: 1,
  F1: 1,
  sc_MapFactoryDefaults: 1,
  s_Equals: 1,
  sci_Map: 1,
  sci_Iterable: 1,
  sci_MapOps: 1,
  sc_StrictOptimizedIterableOps: 1,
  Ljava_io_Serializable: 1
});
$c_sci_Map$Map1.prototype.$classData = $d_sci_Map$Map1;
/** @constructor */
function $c_sci_Map$Map2(key1, value1, key2, value2) {
  this.sci_Map$Map2__f_scala$collection$immutable$Map$Map2$$key1 = null;
  this.sci_Map$Map2__f_scala$collection$immutable$Map$Map2$$value1 = null;
  this.sci_Map$Map2__f_scala$collection$immutable$Map$Map2$$key2 = null;
  this.sci_Map$Map2__f_scala$collection$immutable$Map$Map2$$value2 = null;
  this.sci_Map$Map2__f_scala$collection$immutable$Map$Map2$$key1 = key1;
  this.sci_Map$Map2__f_scala$collection$immutable$Map$Map2$$value1 = value1;
  this.sci_Map$Map2__f_scala$collection$immutable$Map$Map2$$key2 = key2;
  this.sci_Map$Map2__f_scala$collection$immutable$Map$Map2$$value2 = value2
}
$c_sci_Map$Map2.prototype = new $h_sci_AbstractMap();
$c_sci_Map$Map2.prototype.constructor = $c_sci_Map$Map2;
/** @constructor */
function $h_sci_Map$Map2() {
  /*<skip>*/
}
$h_sci_Map$Map2.prototype = $c_sci_Map$Map2.prototype;
$c_sci_Map$Map2.prototype.map__F1__O = (function(f) {
  return $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$f_sc_StrictOptimizedIterableOps__map__F1__O(this, f)
});
$c_sci_Map$Map2.prototype.size__I = (function() {
  return 2
});
$c_sci_Map$Map2.prototype.knownSize__I = (function() {
  return 2
});
$c_sci_Map$Map2.prototype.isEmpty__Z = (function() {
  return false
});
$c_sci_Map$Map2.prototype.apply__O__O = (function(key) {
  if ($j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$m_sr_BoxesRunTime$().equals__O__O__Z(key, this.sci_Map$Map2__f_scala$collection$immutable$Map$Map2$$key1)) {
    return this.sci_Map$Map2__f_scala$collection$immutable$Map$Map2$$value1
  } else if ($j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$m_sr_BoxesRunTime$().equals__O__O__Z(key, this.sci_Map$Map2__f_scala$collection$immutable$Map$Map2$$key2)) {
    return this.sci_Map$Map2__f_scala$collection$immutable$Map$Map2$$value2
  } else {
    throw $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$ct_ju_NoSuchElementException__T__(new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$c_ju_NoSuchElementException(), ("key not found: " + key))
  }
});
$c_sci_Map$Map2.prototype.contains__O__Z = (function(key) {
  return ($j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$m_sr_BoxesRunTime$().equals__O__O__Z(key, this.sci_Map$Map2__f_scala$collection$immutable$Map$Map2$$key1) || $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$m_sr_BoxesRunTime$().equals__O__O__Z(key, this.sci_Map$Map2__f_scala$collection$immutable$Map$Map2$$key2))
});
$c_sci_Map$Map2.prototype.getOrElse__O__F0__O = (function(key, default$1) {
  return ($j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$m_sr_BoxesRunTime$().equals__O__O__Z(key, this.sci_Map$Map2__f_scala$collection$immutable$Map$Map2$$key1) ? this.sci_Map$Map2__f_scala$collection$immutable$Map$Map2$$value1 : ($j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$m_sr_BoxesRunTime$().equals__O__O__Z(key, this.sci_Map$Map2__f_scala$collection$immutable$Map$Map2$$key2) ? this.sci_Map$Map2__f_scala$collection$immutable$Map$Map2$$value2 : default$1.apply__O()))
});
$c_sci_Map$Map2.prototype.iterator__sc_Iterator = (function() {
  return new $c_sci_Map$Map2$$anon$1(this)
});
$c_sci_Map$Map2.prototype.updated__O__O__sci_Map = (function(key, value) {
  return ($j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$m_sr_BoxesRunTime$().equals__O__O__Z(key, this.sci_Map$Map2__f_scala$collection$immutable$Map$Map2$$key1) ? new $c_sci_Map$Map2(this.sci_Map$Map2__f_scala$collection$immutable$Map$Map2$$key1, value, this.sci_Map$Map2__f_scala$collection$immutable$Map$Map2$$key2, this.sci_Map$Map2__f_scala$collection$immutable$Map$Map2$$value2) : ($j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$m_sr_BoxesRunTime$().equals__O__O__Z(key, this.sci_Map$Map2__f_scala$collection$immutable$Map$Map2$$key2) ? new $c_sci_Map$Map2(this.sci_Map$Map2__f_scala$collection$immutable$Map$Map2$$key1, this.sci_Map$Map2__f_scala$collection$immutable$Map$Map2$$value1, this.sci_Map$Map2__f_scala$collection$immutable$Map$Map2$$key2, value) : new $c_sci_Map$Map3(this.sci_Map$Map2__f_scala$collection$immutable$Map$Map2$$key1, this.sci_Map$Map2__f_scala$collection$immutable$Map$Map2$$value1, this.sci_Map$Map2__f_scala$collection$immutable$Map$Map2$$key2, this.sci_Map$Map2__f_scala$collection$immutable$Map$Map2$$value2, key, value)))
});
$c_sci_Map$Map2.prototype.forall__F1__Z = (function(p) {
  return ((!(!p.apply__O__O(new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$c_T2(this.sci_Map$Map2__f_scala$collection$immutable$Map$Map2$$key1, this.sci_Map$Map2__f_scala$collection$immutable$Map$Map2$$value1)))) && (!(!p.apply__O__O(new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$c_T2(this.sci_Map$Map2__f_scala$collection$immutable$Map$Map2$$key2, this.sci_Map$Map2__f_scala$collection$immutable$Map$Map2$$value2)))))
});
$c_sci_Map$Map2.prototype.hashCode__I = (function() {
  var a = 0;
  var b = 0;
  var c = 1;
  var h = $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$m_s_util_hashing_MurmurHash3$().tuple2Hash__O__O__I(this.sci_Map$Map2__f_scala$collection$immutable$Map$Map2$$key1, this.sci_Map$Map2__f_scala$collection$immutable$Map$Map2$$value1);
  a = ((a + h) | 0);
  b = (b ^ h);
  c = Math.imul(c, (1 | h));
  h = $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$m_s_util_hashing_MurmurHash3$().tuple2Hash__O__O__I(this.sci_Map$Map2__f_scala$collection$immutable$Map$Map2$$key2, this.sci_Map$Map2__f_scala$collection$immutable$Map$Map2$$value2);
  a = ((a + h) | 0);
  b = (b ^ h);
  c = Math.imul(c, (1 | h));
  h = $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$m_s_util_hashing_MurmurHash3$().s_util_hashing_MurmurHash3$__f_mapSeed;
  h = $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$m_s_util_hashing_MurmurHash3$().mix__I__I__I(h, a);
  h = $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$m_s_util_hashing_MurmurHash3$().mix__I__I__I(h, b);
  h = $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$m_s_util_hashing_MurmurHash3$().mixLast__I__I__I(h, c);
  return $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$m_s_util_hashing_MurmurHash3$().finalizeHash__I__I__I(h, 2)
});
$c_sci_Map$Map2.prototype.updated__O__O__sci_MapOps = (function(key, value) {
  return this.updated__O__O__sci_Map(key, value)
});
var $d_sci_Map$Map2 = new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$TypeData().initClass({
  sci_Map$Map2: 0
}, false, "scala.collection.immutable.Map$Map2", {
  sci_Map$Map2: 1,
  sci_AbstractMap: 1,
  sc_AbstractMap: 1,
  sc_AbstractIterable: 1,
  O: 1,
  sc_Iterable: 1,
  sc_IterableOnce: 1,
  sc_IterableOps: 1,
  sc_IterableOnceOps: 1,
  sc_IterableFactoryDefaults: 1,
  sc_Map: 1,
  sc_MapOps: 1,
  s_PartialFunction: 1,
  F1: 1,
  sc_MapFactoryDefaults: 1,
  s_Equals: 1,
  sci_Map: 1,
  sci_Iterable: 1,
  sci_MapOps: 1,
  sc_StrictOptimizedIterableOps: 1,
  Ljava_io_Serializable: 1
});
$c_sci_Map$Map2.prototype.$classData = $d_sci_Map$Map2;
/** @constructor */
function $c_sci_Map$Map3(key1, value1, key2, value2, key3, value3) {
  this.sci_Map$Map3__f_scala$collection$immutable$Map$Map3$$key1 = null;
  this.sci_Map$Map3__f_scala$collection$immutable$Map$Map3$$value1 = null;
  this.sci_Map$Map3__f_scala$collection$immutable$Map$Map3$$key2 = null;
  this.sci_Map$Map3__f_scala$collection$immutable$Map$Map3$$value2 = null;
  this.sci_Map$Map3__f_scala$collection$immutable$Map$Map3$$key3 = null;
  this.sci_Map$Map3__f_scala$collection$immutable$Map$Map3$$value3 = null;
  this.sci_Map$Map3__f_scala$collection$immutable$Map$Map3$$key1 = key1;
  this.sci_Map$Map3__f_scala$collection$immutable$Map$Map3$$value1 = value1;
  this.sci_Map$Map3__f_scala$collection$immutable$Map$Map3$$key2 = key2;
  this.sci_Map$Map3__f_scala$collection$immutable$Map$Map3$$value2 = value2;
  this.sci_Map$Map3__f_scala$collection$immutable$Map$Map3$$key3 = key3;
  this.sci_Map$Map3__f_scala$collection$immutable$Map$Map3$$value3 = value3
}
$c_sci_Map$Map3.prototype = new $h_sci_AbstractMap();
$c_sci_Map$Map3.prototype.constructor = $c_sci_Map$Map3;
/** @constructor */
function $h_sci_Map$Map3() {
  /*<skip>*/
}
$h_sci_Map$Map3.prototype = $c_sci_Map$Map3.prototype;
$c_sci_Map$Map3.prototype.map__F1__O = (function(f) {
  return $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$f_sc_StrictOptimizedIterableOps__map__F1__O(this, f)
});
$c_sci_Map$Map3.prototype.size__I = (function() {
  return 3
});
$c_sci_Map$Map3.prototype.knownSize__I = (function() {
  return 3
});
$c_sci_Map$Map3.prototype.isEmpty__Z = (function() {
  return false
});
$c_sci_Map$Map3.prototype.apply__O__O = (function(key) {
  if ($j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$m_sr_BoxesRunTime$().equals__O__O__Z(key, this.sci_Map$Map3__f_scala$collection$immutable$Map$Map3$$key1)) {
    return this.sci_Map$Map3__f_scala$collection$immutable$Map$Map3$$value1
  } else if ($j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$m_sr_BoxesRunTime$().equals__O__O__Z(key, this.sci_Map$Map3__f_scala$collection$immutable$Map$Map3$$key2)) {
    return this.sci_Map$Map3__f_scala$collection$immutable$Map$Map3$$value2
  } else if ($j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$m_sr_BoxesRunTime$().equals__O__O__Z(key, this.sci_Map$Map3__f_scala$collection$immutable$Map$Map3$$key3)) {
    return this.sci_Map$Map3__f_scala$collection$immutable$Map$Map3$$value3
  } else {
    throw $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$ct_ju_NoSuchElementException__T__(new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$c_ju_NoSuchElementException(), ("key not found: " + key))
  }
});
$c_sci_Map$Map3.prototype.contains__O__Z = (function(key) {
  return (($j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$m_sr_BoxesRunTime$().equals__O__O__Z(key, this.sci_Map$Map3__f_scala$collection$immutable$Map$Map3$$key1) || $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$m_sr_BoxesRunTime$().equals__O__O__Z(key, this.sci_Map$Map3__f_scala$collection$immutable$Map$Map3$$key2)) || $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$m_sr_BoxesRunTime$().equals__O__O__Z(key, this.sci_Map$Map3__f_scala$collection$immutable$Map$Map3$$key3))
});
$c_sci_Map$Map3.prototype.getOrElse__O__F0__O = (function(key, default$1) {
  return ($j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$m_sr_BoxesRunTime$().equals__O__O__Z(key, this.sci_Map$Map3__f_scala$collection$immutable$Map$Map3$$key1) ? this.sci_Map$Map3__f_scala$collection$immutable$Map$Map3$$value1 : ($j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$m_sr_BoxesRunTime$().equals__O__O__Z(key, this.sci_Map$Map3__f_scala$collection$immutable$Map$Map3$$key2) ? this.sci_Map$Map3__f_scala$collection$immutable$Map$Map3$$value2 : ($j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$m_sr_BoxesRunTime$().equals__O__O__Z(key, this.sci_Map$Map3__f_scala$collection$immutable$Map$Map3$$key3) ? this.sci_Map$Map3__f_scala$collection$immutable$Map$Map3$$value3 : default$1.apply__O())))
});
$c_sci_Map$Map3.prototype.iterator__sc_Iterator = (function() {
  return new $c_sci_Map$Map3$$anon$4(this)
});
$c_sci_Map$Map3.prototype.updated__O__O__sci_Map = (function(key, value) {
  return ($j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$m_sr_BoxesRunTime$().equals__O__O__Z(key, this.sci_Map$Map3__f_scala$collection$immutable$Map$Map3$$key1) ? new $c_sci_Map$Map3(this.sci_Map$Map3__f_scala$collection$immutable$Map$Map3$$key1, value, this.sci_Map$Map3__f_scala$collection$immutable$Map$Map3$$key2, this.sci_Map$Map3__f_scala$collection$immutable$Map$Map3$$value2, this.sci_Map$Map3__f_scala$collection$immutable$Map$Map3$$key3, this.sci_Map$Map3__f_scala$collection$immutable$Map$Map3$$value3) : ($j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$m_sr_BoxesRunTime$().equals__O__O__Z(key, this.sci_Map$Map3__f_scala$collection$immutable$Map$Map3$$key2) ? new $c_sci_Map$Map3(this.sci_Map$Map3__f_scala$collection$immutable$Map$Map3$$key1, this.sci_Map$Map3__f_scala$collection$immutable$Map$Map3$$value1, this.sci_Map$Map3__f_scala$collection$immutable$Map$Map3$$key2, value, this.sci_Map$Map3__f_scala$collection$immutable$Map$Map3$$key3, this.sci_Map$Map3__f_scala$collection$immutable$Map$Map3$$value3) : ($j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$m_sr_BoxesRunTime$().equals__O__O__Z(key, this.sci_Map$Map3__f_scala$collection$immutable$Map$Map3$$key3) ? new $c_sci_Map$Map3(this.sci_Map$Map3__f_scala$collection$immutable$Map$Map3$$key1, this.sci_Map$Map3__f_scala$collection$immutable$Map$Map3$$value1, this.sci_Map$Map3__f_scala$collection$immutable$Map$Map3$$key2, this.sci_Map$Map3__f_scala$collection$immutable$Map$Map3$$value2, this.sci_Map$Map3__f_scala$collection$immutable$Map$Map3$$key3, value) : new $c_sci_Map$Map4(this.sci_Map$Map3__f_scala$collection$immutable$Map$Map3$$key1, this.sci_Map$Map3__f_scala$collection$immutable$Map$Map3$$value1, this.sci_Map$Map3__f_scala$collection$immutable$Map$Map3$$key2, this.sci_Map$Map3__f_scala$collection$immutable$Map$Map3$$value2, this.sci_Map$Map3__f_scala$collection$immutable$Map$Map3$$key3, this.sci_Map$Map3__f_scala$collection$immutable$Map$Map3$$value3, key, value))))
});
$c_sci_Map$Map3.prototype.forall__F1__Z = (function(p) {
  return (((!(!p.apply__O__O(new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$c_T2(this.sci_Map$Map3__f_scala$collection$immutable$Map$Map3$$key1, this.sci_Map$Map3__f_scala$collection$immutable$Map$Map3$$value1)))) && (!(!p.apply__O__O(new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$c_T2(this.sci_Map$Map3__f_scala$collection$immutable$Map$Map3$$key2, this.sci_Map$Map3__f_scala$collection$immutable$Map$Map3$$value2))))) && (!(!p.apply__O__O(new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$c_T2(this.sci_Map$Map3__f_scala$collection$immutable$Map$Map3$$key3, this.sci_Map$Map3__f_scala$collection$immutable$Map$Map3$$value3)))))
});
$c_sci_Map$Map3.prototype.hashCode__I = (function() {
  var a = 0;
  var b = 0;
  var c = 1;
  var h = $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$m_s_util_hashing_MurmurHash3$().tuple2Hash__O__O__I(this.sci_Map$Map3__f_scala$collection$immutable$Map$Map3$$key1, this.sci_Map$Map3__f_scala$collection$immutable$Map$Map3$$value1);
  a = ((a + h) | 0);
  b = (b ^ h);
  c = Math.imul(c, (1 | h));
  h = $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$m_s_util_hashing_MurmurHash3$().tuple2Hash__O__O__I(this.sci_Map$Map3__f_scala$collection$immutable$Map$Map3$$key2, this.sci_Map$Map3__f_scala$collection$immutable$Map$Map3$$value2);
  a = ((a + h) | 0);
  b = (b ^ h);
  c = Math.imul(c, (1 | h));
  h = $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$m_s_util_hashing_MurmurHash3$().tuple2Hash__O__O__I(this.sci_Map$Map3__f_scala$collection$immutable$Map$Map3$$key3, this.sci_Map$Map3__f_scala$collection$immutable$Map$Map3$$value3);
  a = ((a + h) | 0);
  b = (b ^ h);
  c = Math.imul(c, (1 | h));
  h = $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$m_s_util_hashing_MurmurHash3$().s_util_hashing_MurmurHash3$__f_mapSeed;
  h = $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$m_s_util_hashing_MurmurHash3$().mix__I__I__I(h, a);
  h = $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$m_s_util_hashing_MurmurHash3$().mix__I__I__I(h, b);
  h = $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$m_s_util_hashing_MurmurHash3$().mixLast__I__I__I(h, c);
  return $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$m_s_util_hashing_MurmurHash3$().finalizeHash__I__I__I(h, 3)
});
$c_sci_Map$Map3.prototype.updated__O__O__sci_MapOps = (function(key, value) {
  return this.updated__O__O__sci_Map(key, value)
});
var $d_sci_Map$Map3 = new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$TypeData().initClass({
  sci_Map$Map3: 0
}, false, "scala.collection.immutable.Map$Map3", {
  sci_Map$Map3: 1,
  sci_AbstractMap: 1,
  sc_AbstractMap: 1,
  sc_AbstractIterable: 1,
  O: 1,
  sc_Iterable: 1,
  sc_IterableOnce: 1,
  sc_IterableOps: 1,
  sc_IterableOnceOps: 1,
  sc_IterableFactoryDefaults: 1,
  sc_Map: 1,
  sc_MapOps: 1,
  s_PartialFunction: 1,
  F1: 1,
  sc_MapFactoryDefaults: 1,
  s_Equals: 1,
  sci_Map: 1,
  sci_Iterable: 1,
  sci_MapOps: 1,
  sc_StrictOptimizedIterableOps: 1,
  Ljava_io_Serializable: 1
});
$c_sci_Map$Map3.prototype.$classData = $d_sci_Map$Map3;
/** @constructor */
function $c_sci_Map$Map4(key1, value1, key2, value2, key3, value3, key4, value4) {
  this.sci_Map$Map4__f_scala$collection$immutable$Map$Map4$$key1 = null;
  this.sci_Map$Map4__f_scala$collection$immutable$Map$Map4$$value1 = null;
  this.sci_Map$Map4__f_scala$collection$immutable$Map$Map4$$key2 = null;
  this.sci_Map$Map4__f_scala$collection$immutable$Map$Map4$$value2 = null;
  this.sci_Map$Map4__f_scala$collection$immutable$Map$Map4$$key3 = null;
  this.sci_Map$Map4__f_scala$collection$immutable$Map$Map4$$value3 = null;
  this.sci_Map$Map4__f_scala$collection$immutable$Map$Map4$$key4 = null;
  this.sci_Map$Map4__f_scala$collection$immutable$Map$Map4$$value4 = null;
  this.sci_Map$Map4__f_scala$collection$immutable$Map$Map4$$key1 = key1;
  this.sci_Map$Map4__f_scala$collection$immutable$Map$Map4$$value1 = value1;
  this.sci_Map$Map4__f_scala$collection$immutable$Map$Map4$$key2 = key2;
  this.sci_Map$Map4__f_scala$collection$immutable$Map$Map4$$value2 = value2;
  this.sci_Map$Map4__f_scala$collection$immutable$Map$Map4$$key3 = key3;
  this.sci_Map$Map4__f_scala$collection$immutable$Map$Map4$$value3 = value3;
  this.sci_Map$Map4__f_scala$collection$immutable$Map$Map4$$key4 = key4;
  this.sci_Map$Map4__f_scala$collection$immutable$Map$Map4$$value4 = value4
}
$c_sci_Map$Map4.prototype = new $h_sci_AbstractMap();
$c_sci_Map$Map4.prototype.constructor = $c_sci_Map$Map4;
/** @constructor */
function $h_sci_Map$Map4() {
  /*<skip>*/
}
$h_sci_Map$Map4.prototype = $c_sci_Map$Map4.prototype;
$c_sci_Map$Map4.prototype.map__F1__O = (function(f) {
  return $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$f_sc_StrictOptimizedIterableOps__map__F1__O(this, f)
});
$c_sci_Map$Map4.prototype.size__I = (function() {
  return 4
});
$c_sci_Map$Map4.prototype.knownSize__I = (function() {
  return 4
});
$c_sci_Map$Map4.prototype.isEmpty__Z = (function() {
  return false
});
$c_sci_Map$Map4.prototype.apply__O__O = (function(key) {
  if ($j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$m_sr_BoxesRunTime$().equals__O__O__Z(key, this.sci_Map$Map4__f_scala$collection$immutable$Map$Map4$$key1)) {
    return this.sci_Map$Map4__f_scala$collection$immutable$Map$Map4$$value1
  } else if ($j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$m_sr_BoxesRunTime$().equals__O__O__Z(key, this.sci_Map$Map4__f_scala$collection$immutable$Map$Map4$$key2)) {
    return this.sci_Map$Map4__f_scala$collection$immutable$Map$Map4$$value2
  } else if ($j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$m_sr_BoxesRunTime$().equals__O__O__Z(key, this.sci_Map$Map4__f_scala$collection$immutable$Map$Map4$$key3)) {
    return this.sci_Map$Map4__f_scala$collection$immutable$Map$Map4$$value3
  } else if ($j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$m_sr_BoxesRunTime$().equals__O__O__Z(key, this.sci_Map$Map4__f_scala$collection$immutable$Map$Map4$$key4)) {
    return this.sci_Map$Map4__f_scala$collection$immutable$Map$Map4$$value4
  } else {
    throw $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$ct_ju_NoSuchElementException__T__(new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$c_ju_NoSuchElementException(), ("key not found: " + key))
  }
});
$c_sci_Map$Map4.prototype.contains__O__Z = (function(key) {
  return ((($j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$m_sr_BoxesRunTime$().equals__O__O__Z(key, this.sci_Map$Map4__f_scala$collection$immutable$Map$Map4$$key1) || $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$m_sr_BoxesRunTime$().equals__O__O__Z(key, this.sci_Map$Map4__f_scala$collection$immutable$Map$Map4$$key2)) || $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$m_sr_BoxesRunTime$().equals__O__O__Z(key, this.sci_Map$Map4__f_scala$collection$immutable$Map$Map4$$key3)) || $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$m_sr_BoxesRunTime$().equals__O__O__Z(key, this.sci_Map$Map4__f_scala$collection$immutable$Map$Map4$$key4))
});
$c_sci_Map$Map4.prototype.getOrElse__O__F0__O = (function(key, default$1) {
  return ($j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$m_sr_BoxesRunTime$().equals__O__O__Z(key, this.sci_Map$Map4__f_scala$collection$immutable$Map$Map4$$key1) ? this.sci_Map$Map4__f_scala$collection$immutable$Map$Map4$$value1 : ($j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$m_sr_BoxesRunTime$().equals__O__O__Z(key, this.sci_Map$Map4__f_scala$collection$immutable$Map$Map4$$key2) ? this.sci_Map$Map4__f_scala$collection$immutable$Map$Map4$$value2 : ($j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$m_sr_BoxesRunTime$().equals__O__O__Z(key, this.sci_Map$Map4__f_scala$collection$immutable$Map$Map4$$key3) ? this.sci_Map$Map4__f_scala$collection$immutable$Map$Map4$$value3 : ($j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$m_sr_BoxesRunTime$().equals__O__O__Z(key, this.sci_Map$Map4__f_scala$collection$immutable$Map$Map4$$key4) ? this.sci_Map$Map4__f_scala$collection$immutable$Map$Map4$$value4 : default$1.apply__O()))))
});
$c_sci_Map$Map4.prototype.iterator__sc_Iterator = (function() {
  return new $c_sci_Map$Map4$$anon$7(this)
});
$c_sci_Map$Map4.prototype.updated__O__O__sci_Map = (function(key, value) {
  if ($j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$m_sr_BoxesRunTime$().equals__O__O__Z(key, this.sci_Map$Map4__f_scala$collection$immutable$Map$Map4$$key1)) {
    return new $c_sci_Map$Map4(this.sci_Map$Map4__f_scala$collection$immutable$Map$Map4$$key1, value, this.sci_Map$Map4__f_scala$collection$immutable$Map$Map4$$key2, this.sci_Map$Map4__f_scala$collection$immutable$Map$Map4$$value2, this.sci_Map$Map4__f_scala$collection$immutable$Map$Map4$$key3, this.sci_Map$Map4__f_scala$collection$immutable$Map$Map4$$value3, this.sci_Map$Map4__f_scala$collection$immutable$Map$Map4$$key4, this.sci_Map$Map4__f_scala$collection$immutable$Map$Map4$$value4)
  } else if ($j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$m_sr_BoxesRunTime$().equals__O__O__Z(key, this.sci_Map$Map4__f_scala$collection$immutable$Map$Map4$$key2)) {
    return new $c_sci_Map$Map4(this.sci_Map$Map4__f_scala$collection$immutable$Map$Map4$$key1, this.sci_Map$Map4__f_scala$collection$immutable$Map$Map4$$value1, this.sci_Map$Map4__f_scala$collection$immutable$Map$Map4$$key2, value, this.sci_Map$Map4__f_scala$collection$immutable$Map$Map4$$key3, this.sci_Map$Map4__f_scala$collection$immutable$Map$Map4$$value3, this.sci_Map$Map4__f_scala$collection$immutable$Map$Map4$$key4, this.sci_Map$Map4__f_scala$collection$immutable$Map$Map4$$value4)
  } else if ($j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$m_sr_BoxesRunTime$().equals__O__O__Z(key, this.sci_Map$Map4__f_scala$collection$immutable$Map$Map4$$key3)) {
    return new $c_sci_Map$Map4(this.sci_Map$Map4__f_scala$collection$immutable$Map$Map4$$key1, this.sci_Map$Map4__f_scala$collection$immutable$Map$Map4$$value1, this.sci_Map$Map4__f_scala$collection$immutable$Map$Map4$$key2, this.sci_Map$Map4__f_scala$collection$immutable$Map$Map4$$value2, this.sci_Map$Map4__f_scala$collection$immutable$Map$Map4$$key3, value, this.sci_Map$Map4__f_scala$collection$immutable$Map$Map4$$key4, this.sci_Map$Map4__f_scala$collection$immutable$Map$Map4$$value4)
  } else if ($j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$m_sr_BoxesRunTime$().equals__O__O__Z(key, this.sci_Map$Map4__f_scala$collection$immutable$Map$Map4$$key4)) {
    return new $c_sci_Map$Map4(this.sci_Map$Map4__f_scala$collection$immutable$Map$Map4$$key1, this.sci_Map$Map4__f_scala$collection$immutable$Map$Map4$$value1, this.sci_Map$Map4__f_scala$collection$immutable$Map$Map4$$key2, this.sci_Map$Map4__f_scala$collection$immutable$Map$Map4$$value2, this.sci_Map$Map4__f_scala$collection$immutable$Map$Map4$$key3, this.sci_Map$Map4__f_scala$collection$immutable$Map$Map4$$value3, this.sci_Map$Map4__f_scala$collection$immutable$Map$Map4$$key4, value)
  } else {
    var this$1 = $m_sci_HashMap$();
    return this$1.sci_HashMap$__f_EmptyMap.updated__O__O__sci_HashMap(this.sci_Map$Map4__f_scala$collection$immutable$Map$Map4$$key1, this.sci_Map$Map4__f_scala$collection$immutable$Map$Map4$$value1).updated__O__O__sci_HashMap(this.sci_Map$Map4__f_scala$collection$immutable$Map$Map4$$key2, this.sci_Map$Map4__f_scala$collection$immutable$Map$Map4$$value2).updated__O__O__sci_HashMap(this.sci_Map$Map4__f_scala$collection$immutable$Map$Map4$$key3, this.sci_Map$Map4__f_scala$collection$immutable$Map$Map4$$value3).updated__O__O__sci_HashMap(this.sci_Map$Map4__f_scala$collection$immutable$Map$Map4$$key4, this.sci_Map$Map4__f_scala$collection$immutable$Map$Map4$$value4).updated__O__O__sci_HashMap(key, value)
  }
});
$c_sci_Map$Map4.prototype.forall__F1__Z = (function(p) {
  return ((((!(!p.apply__O__O(new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$c_T2(this.sci_Map$Map4__f_scala$collection$immutable$Map$Map4$$key1, this.sci_Map$Map4__f_scala$collection$immutable$Map$Map4$$value1)))) && (!(!p.apply__O__O(new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$c_T2(this.sci_Map$Map4__f_scala$collection$immutable$Map$Map4$$key2, this.sci_Map$Map4__f_scala$collection$immutable$Map$Map4$$value2))))) && (!(!p.apply__O__O(new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$c_T2(this.sci_Map$Map4__f_scala$collection$immutable$Map$Map4$$key3, this.sci_Map$Map4__f_scala$collection$immutable$Map$Map4$$value3))))) && (!(!p.apply__O__O(new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$c_T2(this.sci_Map$Map4__f_scala$collection$immutable$Map$Map4$$key4, this.sci_Map$Map4__f_scala$collection$immutable$Map$Map4$$value4)))))
});
$c_sci_Map$Map4.prototype.buildTo__sci_HashMapBuilder__sci_HashMapBuilder = (function(builder) {
  return builder.addOne__O__O__sci_HashMapBuilder(this.sci_Map$Map4__f_scala$collection$immutable$Map$Map4$$key1, this.sci_Map$Map4__f_scala$collection$immutable$Map$Map4$$value1).addOne__O__O__sci_HashMapBuilder(this.sci_Map$Map4__f_scala$collection$immutable$Map$Map4$$key2, this.sci_Map$Map4__f_scala$collection$immutable$Map$Map4$$value2).addOne__O__O__sci_HashMapBuilder(this.sci_Map$Map4__f_scala$collection$immutable$Map$Map4$$key3, this.sci_Map$Map4__f_scala$collection$immutable$Map$Map4$$value3).addOne__O__O__sci_HashMapBuilder(this.sci_Map$Map4__f_scala$collection$immutable$Map$Map4$$key4, this.sci_Map$Map4__f_scala$collection$immutable$Map$Map4$$value4)
});
$c_sci_Map$Map4.prototype.hashCode__I = (function() {
  var a = 0;
  var b = 0;
  var c = 1;
  var h = $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$m_s_util_hashing_MurmurHash3$().tuple2Hash__O__O__I(this.sci_Map$Map4__f_scala$collection$immutable$Map$Map4$$key1, this.sci_Map$Map4__f_scala$collection$immutable$Map$Map4$$value1);
  a = ((a + h) | 0);
  b = (b ^ h);
  c = Math.imul(c, (1 | h));
  h = $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$m_s_util_hashing_MurmurHash3$().tuple2Hash__O__O__I(this.sci_Map$Map4__f_scala$collection$immutable$Map$Map4$$key2, this.sci_Map$Map4__f_scala$collection$immutable$Map$Map4$$value2);
  a = ((a + h) | 0);
  b = (b ^ h);
  c = Math.imul(c, (1 | h));
  h = $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$m_s_util_hashing_MurmurHash3$().tuple2Hash__O__O__I(this.sci_Map$Map4__f_scala$collection$immutable$Map$Map4$$key3, this.sci_Map$Map4__f_scala$collection$immutable$Map$Map4$$value3);
  a = ((a + h) | 0);
  b = (b ^ h);
  c = Math.imul(c, (1 | h));
  h = $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$m_s_util_hashing_MurmurHash3$().tuple2Hash__O__O__I(this.sci_Map$Map4__f_scala$collection$immutable$Map$Map4$$key4, this.sci_Map$Map4__f_scala$collection$immutable$Map$Map4$$value4);
  a = ((a + h) | 0);
  b = (b ^ h);
  c = Math.imul(c, (1 | h));
  h = $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$m_s_util_hashing_MurmurHash3$().s_util_hashing_MurmurHash3$__f_mapSeed;
  h = $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$m_s_util_hashing_MurmurHash3$().mix__I__I__I(h, a);
  h = $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$m_s_util_hashing_MurmurHash3$().mix__I__I__I(h, b);
  h = $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$m_s_util_hashing_MurmurHash3$().mixLast__I__I__I(h, c);
  return $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$m_s_util_hashing_MurmurHash3$().finalizeHash__I__I__I(h, 4)
});
$c_sci_Map$Map4.prototype.updated__O__O__sci_MapOps = (function(key, value) {
  return this.updated__O__O__sci_Map(key, value)
});
function $isArrayOf_sci_Map$Map4(obj, depth) {
  return (!(!(((obj && obj.$classData) && (obj.$classData.arrayDepth === depth)) && obj.$classData.arrayBase.ancestors.sci_Map$Map4)))
}
var $d_sci_Map$Map4 = new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$TypeData().initClass({
  sci_Map$Map4: 0
}, false, "scala.collection.immutable.Map$Map4", {
  sci_Map$Map4: 1,
  sci_AbstractMap: 1,
  sc_AbstractMap: 1,
  sc_AbstractIterable: 1,
  O: 1,
  sc_Iterable: 1,
  sc_IterableOnce: 1,
  sc_IterableOps: 1,
  sc_IterableOnceOps: 1,
  sc_IterableFactoryDefaults: 1,
  sc_Map: 1,
  sc_MapOps: 1,
  s_PartialFunction: 1,
  F1: 1,
  sc_MapFactoryDefaults: 1,
  s_Equals: 1,
  sci_Map: 1,
  sci_Iterable: 1,
  sci_MapOps: 1,
  sc_StrictOptimizedIterableOps: 1,
  Ljava_io_Serializable: 1
});
$c_sci_Map$Map4.prototype.$classData = $d_sci_Map$Map4;
/** @constructor */
function $c_sjsr_WrappedVarArgs(array) {
  this.sjsr_WrappedVarArgs__f_scala$scalajs$runtime$WrappedVarArgs$$array = null;
  this.sjsr_WrappedVarArgs__f_scala$scalajs$runtime$WrappedVarArgs$$array = array
}
$c_sjsr_WrappedVarArgs.prototype = new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$h_O();
$c_sjsr_WrappedVarArgs.prototype.constructor = $c_sjsr_WrappedVarArgs;
/** @constructor */
function $h_sjsr_WrappedVarArgs() {
  /*<skip>*/
}
$h_sjsr_WrappedVarArgs.prototype = $c_sjsr_WrappedVarArgs.prototype;
$c_sjsr_WrappedVarArgs.prototype.appended__O__O = (function(elem) {
  return $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$f_sc_StrictOptimizedSeqOps__appended__O__O(this, elem)
});
$c_sjsr_WrappedVarArgs.prototype.map__F1__O = (function(f) {
  return $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$f_sc_StrictOptimizedIterableOps__map__F1__O(this, f)
});
$c_sjsr_WrappedVarArgs.prototype.flatten__F1__O = (function(toIterableOnce) {
  return $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$f_sc_StrictOptimizedIterableOps__flatten__F1__O(this, toIterableOnce)
});
$c_sjsr_WrappedVarArgs.prototype.canEqual__O__Z = (function(that) {
  return $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$f_sci_IndexedSeq__canEqual__O__Z(this, that)
});
$c_sjsr_WrappedVarArgs.prototype.sameElements__sc_IterableOnce__Z = (function(o) {
  return $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$f_sci_IndexedSeq__sameElements__sc_IterableOnce__Z(this, o)
});
$c_sjsr_WrappedVarArgs.prototype.applyPreferredMaxLength__I = (function() {
  return $m_sci_IndexedSeqDefaults$().sci_IndexedSeqDefaults$__f_defaultApplyPreferredMaxLength
});
$c_sjsr_WrappedVarArgs.prototype.iterator__sc_Iterator = (function() {
  var this$1 = new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$c_sc_IndexedSeqView$Id(this);
  return $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$ct_sc_IndexedSeqView$IndexedSeqViewIterator__sc_IndexedSeqView__(new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$c_sc_IndexedSeqView$IndexedSeqViewIterator(), this$1)
});
$c_sjsr_WrappedVarArgs.prototype.head__O = (function() {
  return this.apply__I__O(0)
});
$c_sjsr_WrappedVarArgs.prototype.headOption__s_Option = (function() {
  return $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$f_sc_IndexedSeqOps__headOption__s_Option(this)
});
$c_sjsr_WrappedVarArgs.prototype.lengthCompare__I__I = (function(len) {
  var x = this.length__I();
  return ((x === len) ? 0 : ((x < len) ? (-1) : 1))
});
$c_sjsr_WrappedVarArgs.prototype.knownSize__I = (function() {
  return this.length__I()
});
$c_sjsr_WrappedVarArgs.prototype.equals__O__Z = (function(o) {
  return $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$f_sc_Seq__equals__O__Z(this, o)
});
$c_sjsr_WrappedVarArgs.prototype.hashCode__I = (function() {
  return $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$m_s_util_hashing_MurmurHash3$().seqHash__sc_Seq__I(this)
});
$c_sjsr_WrappedVarArgs.prototype.toString__T = (function() {
  return $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$f_sc_Iterable__toString__T(this)
});
$c_sjsr_WrappedVarArgs.prototype.isEmpty__Z = (function() {
  return $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$f_sc_SeqOps__isEmpty__Z(this)
});
$c_sjsr_WrappedVarArgs.prototype.lift__F1 = (function() {
  return new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$c_s_PartialFunction$Lifted(this)
});
$c_sjsr_WrappedVarArgs.prototype.applyOrElse__O__F1__O = (function(x, default$1) {
  return $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$f_s_PartialFunction__applyOrElse__O__F1__O(this, x, default$1)
});
$c_sjsr_WrappedVarArgs.prototype.foreach__F1__V = (function(f) {
  $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$f_sc_IterableOnceOps__foreach__F1__V(this, f)
});
$c_sjsr_WrappedVarArgs.prototype.copyToArray__O__I__I__I = (function(xs, start, len) {
  return $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$f_sc_IterableOnceOps__copyToArray__O__I__I__I(this, xs, start, len)
});
$c_sjsr_WrappedVarArgs.prototype.addString__scm_StringBuilder__T__T__T__scm_StringBuilder = (function(b, start, sep, end) {
  return $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$f_sc_IterableOnceOps__addString__scm_StringBuilder__T__T__T__scm_StringBuilder(this, b, start, sep, end)
});
$c_sjsr_WrappedVarArgs.prototype.toList__sci_List = (function() {
  $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$m_sci_List$();
  return $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$m_sci_Nil$().prependedAll__sc_IterableOnce__sci_List(this)
});
$c_sjsr_WrappedVarArgs.prototype.iterableFactory__sc_SeqFactory = (function() {
  return $m_sjsr_WrappedVarArgs$()
});
$c_sjsr_WrappedVarArgs.prototype.length__I = (function() {
  return (this.sjsr_WrappedVarArgs__f_scala$scalajs$runtime$WrappedVarArgs$$array.length | 0)
});
$c_sjsr_WrappedVarArgs.prototype.apply__I__O = (function(idx) {
  return this.sjsr_WrappedVarArgs__f_scala$scalajs$runtime$WrappedVarArgs$$array[idx]
});
$c_sjsr_WrappedVarArgs.prototype.className__T = (function() {
  return "WrappedVarArgs"
});
$c_sjsr_WrappedVarArgs.prototype.isDefinedAt__O__Z = (function(x) {
  var idx = (x | 0);
  return $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$f_sc_SeqOps__isDefinedAt__I__Z(this, idx)
});
$c_sjsr_WrappedVarArgs.prototype.apply__O__O = (function(v1) {
  return this.apply__I__O((v1 | 0))
});
$c_sjsr_WrappedVarArgs.prototype.iterableFactory__sc_IterableFactory = (function() {
  return $m_sjsr_WrappedVarArgs$()
});
function $isArrayOf_sjsr_WrappedVarArgs(obj, depth) {
  return (!(!(((obj && obj.$classData) && (obj.$classData.arrayDepth === depth)) && obj.$classData.arrayBase.ancestors.sjsr_WrappedVarArgs)))
}
var $d_sjsr_WrappedVarArgs = new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$TypeData().initClass({
  sjsr_WrappedVarArgs: 0
}, false, "scala.scalajs.runtime.WrappedVarArgs", {
  sjsr_WrappedVarArgs: 1,
  O: 1,
  sci_IndexedSeq: 1,
  sci_Seq: 1,
  sci_Iterable: 1,
  sc_Iterable: 1,
  sc_IterableOnce: 1,
  sc_IterableOps: 1,
  sc_IterableOnceOps: 1,
  sc_IterableFactoryDefaults: 1,
  sc_Seq: 1,
  s_PartialFunction: 1,
  F1: 1,
  sc_SeqOps: 1,
  s_Equals: 1,
  sci_SeqOps: 1,
  sc_IndexedSeq: 1,
  sc_IndexedSeqOps: 1,
  sci_IndexedSeqOps: 1,
  sci_StrictOptimizedSeqOps: 1,
  sc_StrictOptimizedSeqOps: 1,
  sc_StrictOptimizedIterableOps: 1,
  Ljava_io_Serializable: 1
});
$c_sjsr_WrappedVarArgs.prototype.$classData = $d_sjsr_WrappedVarArgs;
/** @constructor */
function $c_sci_HashMap(rootNode) {
  this.sci_HashMap__f_rootNode = null;
  this.sci_HashMap__f_rootNode = rootNode
}
$c_sci_HashMap.prototype = new $h_sci_AbstractMap();
$c_sci_HashMap.prototype.constructor = $c_sci_HashMap;
/** @constructor */
function $h_sci_HashMap() {
  /*<skip>*/
}
$h_sci_HashMap.prototype = $c_sci_HashMap.prototype;
$c_sci_HashMap.prototype.map__F1__O = (function(f) {
  return $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$f_sc_StrictOptimizedIterableOps__map__F1__O(this, f)
});
$c_sci_HashMap.prototype.knownSize__I = (function() {
  return this.sci_HashMap__f_rootNode.sci_BitmapIndexedMapNode__f_size
});
$c_sci_HashMap.prototype.size__I = (function() {
  return this.sci_HashMap__f_rootNode.sci_BitmapIndexedMapNode__f_size
});
$c_sci_HashMap.prototype.isEmpty__Z = (function() {
  return (this.sci_HashMap__f_rootNode.sci_BitmapIndexedMapNode__f_size === 0)
});
$c_sci_HashMap.prototype.iterator__sc_Iterator = (function() {
  return (this.isEmpty__Z() ? $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$m_sc_Iterator$().sc_Iterator$__f_scala$collection$Iterator$$_empty : new $c_sci_MapKeyValueTupleIterator(this.sci_HashMap__f_rootNode))
});
$c_sci_HashMap.prototype.contains__O__Z = (function(key) {
  var keyUnimprovedHash = $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$m_sr_Statics$().anyHash__O__I(key);
  var keyHash = $m_sc_Hashing$().improve__I__I(keyUnimprovedHash);
  return this.sci_HashMap__f_rootNode.containsKey__O__I__I__I__Z(key, keyUnimprovedHash, keyHash, 0)
});
$c_sci_HashMap.prototype.apply__O__O = (function(key) {
  var keyUnimprovedHash = $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$m_sr_Statics$().anyHash__O__I(key);
  var keyHash = $m_sc_Hashing$().improve__I__I(keyUnimprovedHash);
  return this.sci_HashMap__f_rootNode.apply__O__I__I__I__O(key, keyUnimprovedHash, keyHash, 0)
});
$c_sci_HashMap.prototype.getOrElse__O__F0__O = (function(key, default$1) {
  var keyUnimprovedHash = $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$m_sr_Statics$().anyHash__O__I(key);
  var keyHash = $m_sc_Hashing$().improve__I__I(keyUnimprovedHash);
  return this.sci_HashMap__f_rootNode.getOrElse__O__I__I__I__F0__O(key, keyUnimprovedHash, keyHash, 0, default$1)
});
$c_sci_HashMap.prototype.updated__O__O__sci_HashMap = (function(key, value) {
  var keyUnimprovedHash = $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$m_sr_Statics$().anyHash__O__I(key);
  var newRootNode = this.sci_HashMap__f_rootNode.updated__O__O__I__I__I__Z__sci_BitmapIndexedMapNode(key, value, keyUnimprovedHash, $m_sc_Hashing$().improve__I__I(keyUnimprovedHash), 0, true);
  return ((newRootNode === this.sci_HashMap__f_rootNode) ? this : new $c_sci_HashMap(newRootNode))
});
$c_sci_HashMap.prototype.foreachEntry__F2__V = (function(f) {
  this.sci_HashMap__f_rootNode.foreachEntry__F2__V(f)
});
$c_sci_HashMap.prototype.equals__O__Z = (function(that) {
  if ((that instanceof $c_sci_HashMap)) {
    var x2 = that;
    if ((this === x2)) {
      return true
    } else {
      var x = this.sci_HashMap__f_rootNode;
      var x$2 = x2.sci_HashMap__f_rootNode;
      return ((x === null) ? (x$2 === null) : x.equals__O__Z(x$2))
    }
  } else {
    return $f_sc_Map__equals__O__Z(this, that)
  }
});
$c_sci_HashMap.prototype.hashCode__I = (function() {
  if (this.isEmpty__Z()) {
    return $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$m_s_util_hashing_MurmurHash3$().s_util_hashing_MurmurHash3$__f_emptyMapHash
  } else {
    var hashIterator = new $c_sci_MapKeyValueTupleHashIterator(this.sci_HashMap__f_rootNode);
    var hash = $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$m_s_util_hashing_MurmurHash3$().unorderedHash__sc_IterableOnce__I__I(hashIterator, $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$m_s_util_hashing_MurmurHash3$().s_util_hashing_MurmurHash3$__f_mapSeed);
    return hash
  }
});
$c_sci_HashMap.prototype.className__T = (function() {
  return "HashMap"
});
$c_sci_HashMap.prototype.updated__O__O__sci_MapOps = (function(key, value) {
  return this.updated__O__O__sci_HashMap(key, value)
});
function $isArrayOf_sci_HashMap(obj, depth) {
  return (!(!(((obj && obj.$classData) && (obj.$classData.arrayDepth === depth)) && obj.$classData.arrayBase.ancestors.sci_HashMap)))
}
var $d_sci_HashMap = new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$TypeData().initClass({
  sci_HashMap: 0
}, false, "scala.collection.immutable.HashMap", {
  sci_HashMap: 1,
  sci_AbstractMap: 1,
  sc_AbstractMap: 1,
  sc_AbstractIterable: 1,
  O: 1,
  sc_Iterable: 1,
  sc_IterableOnce: 1,
  sc_IterableOps: 1,
  sc_IterableOnceOps: 1,
  sc_IterableFactoryDefaults: 1,
  sc_Map: 1,
  sc_MapOps: 1,
  s_PartialFunction: 1,
  F1: 1,
  sc_MapFactoryDefaults: 1,
  s_Equals: 1,
  sci_Map: 1,
  sci_Iterable: 1,
  sci_MapOps: 1,
  sci_StrictOptimizedMapOps: 1,
  sc_StrictOptimizedMapOps: 1,
  sc_StrictOptimizedIterableOps: 1,
  scg_DefaultSerializable: 1,
  Ljava_io_Serializable: 1
});
$c_sci_HashMap.prototype.$classData = $d_sci_HashMap;
function $isArrayOf_scm_HashMap(obj, depth) {
  return (!(!(((obj && obj.$classData) && (obj.$classData.arrayDepth === depth)) && obj.$classData.arrayBase.ancestors.scm_HashMap)))
}
function $isArrayOf_scm_LinkedHashMap(obj, depth) {
  return (!(!(((obj && obj.$classData) && (obj.$classData.arrayDepth === depth)) && obj.$classData.arrayBase.ancestors.scm_LinkedHashMap)))
}
let $e_ZipExample = $m_LZipExample_ZipExample$();
export { $e_ZipExample as ZipExample };
$s_Lexample_descompress__main__AT__V(new ($j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$d_T.getArrayOf().constr)([]));
//# sourceMappingURL=main.js.map
