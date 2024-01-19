'use strict';
import * as $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong from "./org.scalajs.linker.runtime.-Runtime-Long.js";
/** @constructor */
function $c_Lorg_scalajs_dom_DOMList$DOMListIterator(domList) {
  this.Lorg_scalajs_dom_DOMList$DOMListIterator__f_domList = null;
  this.Lorg_scalajs_dom_DOMList$DOMListIterator__f_index = 0;
  this.Lorg_scalajs_dom_DOMList$DOMListIterator__f_domList = domList;
  this.Lorg_scalajs_dom_DOMList$DOMListIterator__f_index = 0
}
export { $c_Lorg_scalajs_dom_DOMList$DOMListIterator as $c_Lorg_scalajs_dom_DOMList$DOMListIterator };
$c_Lorg_scalajs_dom_DOMList$DOMListIterator.prototype = new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$h_O();
$c_Lorg_scalajs_dom_DOMList$DOMListIterator.prototype.constructor = $c_Lorg_scalajs_dom_DOMList$DOMListIterator;
/** @constructor */
function $h_Lorg_scalajs_dom_DOMList$DOMListIterator() {
  /*<skip>*/
}
export { $h_Lorg_scalajs_dom_DOMList$DOMListIterator as $h_Lorg_scalajs_dom_DOMList$DOMListIterator };
$h_Lorg_scalajs_dom_DOMList$DOMListIterator.prototype = $c_Lorg_scalajs_dom_DOMList$DOMListIterator.prototype;
$c_Lorg_scalajs_dom_DOMList$DOMListIterator.prototype.knownSize__I = (function() {
  return (-1)
});
$c_Lorg_scalajs_dom_DOMList$DOMListIterator.prototype.copyToArray__O__I__I__I = (function(xs, start, len) {
  return $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$f_sc_IterableOnceOps__copyToArray__O__I__I__I(this, xs, start, len)
});
$c_Lorg_scalajs_dom_DOMList$DOMListIterator.prototype.addString__scm_StringBuilder__T__T__T__scm_StringBuilder = (function(b, start, sep, end) {
  return $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$f_sc_IterableOnceOps__addString__scm_StringBuilder__T__T__T__scm_StringBuilder(this, b, start, sep, end)
});
$c_Lorg_scalajs_dom_DOMList$DOMListIterator.prototype.toList__sci_List = (function() {
  $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$m_sci_List$();
  return $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$m_sci_Nil$().prependedAll__sc_IterableOnce__sci_List(this)
});
$c_Lorg_scalajs_dom_DOMList$DOMListIterator.prototype.iterator__sc_Iterator = (function() {
  return this
});
$c_Lorg_scalajs_dom_DOMList$DOMListIterator.prototype.concat__F0__sc_Iterator = (function(xs) {
  return $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$f_sc_Iterator__concat__F0__sc_Iterator(this, xs)
});
$c_Lorg_scalajs_dom_DOMList$DOMListIterator.prototype.drop__I__sc_Iterator = (function(n) {
  return $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$f_sc_Iterator__sliceIterator__I__I__sc_Iterator(this, n, (-1))
});
$c_Lorg_scalajs_dom_DOMList$DOMListIterator.prototype.toString__T = (function() {
  return "<iterator>"
});
$c_Lorg_scalajs_dom_DOMList$DOMListIterator.prototype.hasNext__Z = (function() {
  return (this.Lorg_scalajs_dom_DOMList$DOMListIterator__f_index < $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$uI(this.Lorg_scalajs_dom_DOMList$DOMListIterator__f_domList.length))
});
$c_Lorg_scalajs_dom_DOMList$DOMListIterator.prototype.next__O = (function() {
  var res = this.Lorg_scalajs_dom_DOMList$DOMListIterator__f_domList[this.Lorg_scalajs_dom_DOMList$DOMListIterator__f_index];
  this.Lorg_scalajs_dom_DOMList$DOMListIterator__f_index = ((1 + this.Lorg_scalajs_dom_DOMList$DOMListIterator__f_index) | 0);
  return res
});
var $d_Lorg_scalajs_dom_DOMList$DOMListIterator = new $j_org$002escalajs$002elinker$002eruntime$002e$002dRuntime$002dLong.$TypeData().initClass({
  Lorg_scalajs_dom_DOMList$DOMListIterator: 0
}, false, "org.scalajs.dom.DOMList$DOMListIterator", {
  Lorg_scalajs_dom_DOMList$DOMListIterator: 1,
  O: 1,
  sc_IterableOnce: 1,
  sc_IterableOnceOps: 1,
  sc_Iterator: 1
});
export { $d_Lorg_scalajs_dom_DOMList$DOMListIterator as $d_Lorg_scalajs_dom_DOMList$DOMListIterator };
$c_Lorg_scalajs_dom_DOMList$DOMListIterator.prototype.$classData = $d_Lorg_scalajs_dom_DOMList$DOMListIterator;
//# sourceMappingURL=org.scalajs.dom.-D-O-M-List$-D-O-M-List-Iterator.js.map
