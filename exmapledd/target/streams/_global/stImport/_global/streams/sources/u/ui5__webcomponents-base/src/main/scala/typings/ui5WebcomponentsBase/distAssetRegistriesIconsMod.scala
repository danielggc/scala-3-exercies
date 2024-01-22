package typings.ui5WebcomponentsBase

import typings.std.Record
import typings.ui5WebcomponentsBase.anon.Acc
import typings.ui5WebcomponentsBase.distI18nBundleMod.I18nText
import typings.ui5WebcomponentsBase.distRendererExecuteTemplateMod.TemplateFunction
import typings.ui5WebcomponentsBase.distRendererExecuteTemplateMod.TemplateFunctionResult
import typings.ui5WebcomponentsBase.distUi5elementMod.default
import typings.ui5WebcomponentsBase.ui5WebcomponentsBaseStrings.ICON_NOT_FOUND
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distAssetRegistriesIconsMod {
  
  @JSImport("@ui5/webcomponents-base/dist/asset-registries/Icons", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getIconData(name: String): js.Promise[js.UndefOr[IconData | ICON_NOT_FOUND]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getIconData")(name.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.UndefOr[IconData | ICON_NOT_FOUND]]]
  
  inline def getIconDataSync(name: String): js.UndefOr[IconData] = ^.asInstanceOf[js.Dynamic].applyDynamic("getIconDataSync")(name.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[IconData]]
  
  inline def getRegisteredNames(): js.Promise[js.Array[String]] = ^.asInstanceOf[js.Dynamic].applyDynamic("_getRegisteredNames")().asInstanceOf[js.Promise[js.Array[String]]]
  
  inline def registerIcon(name: String, iconData: IconData): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("registerIcon")(name.asInstanceOf[js.Any], iconData.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def registerIconLoader(collectionName: String, loader: IconLoader): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("registerIconLoader")(collectionName.asInstanceOf[js.Any], loader.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  trait CollectionData extends StObject {
    
    var collection: String
    
    var data: Record[String, Acc]
    
    var packageName: String
    
    var version: js.UndefOr[String] = js.undefined
  }
  object CollectionData {
    
    inline def apply(collection: String, data: Record[String, Acc], packageName: String): CollectionData = {
      val __obj = js.Dynamic.literal(collection = collection.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], packageName = packageName.asInstanceOf[js.Any])
      __obj.asInstanceOf[CollectionData]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CollectionData] (val x: Self) extends AnyVal {
      
      inline def setCollection(value: String): Self = StObject.set(x, "collection", value.asInstanceOf[js.Any])
      
      inline def setData(value: Record[String, Acc]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setPackageName(value: String): Self = StObject.set(x, "packageName", value.asInstanceOf[js.Any])
      
      inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
      
      inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
    }
  }
  
  trait IconData extends StObject {
    
    var accData: I18nText
    
    var collection: js.UndefOr[String] = js.undefined
    
    var customTemplate: js.UndefOr[TemplateFunction] = js.undefined
    
    var ltr: Boolean
    
    var packageName: String
    
    var pathData: String | js.Array[String]
    
    var viewBox: js.UndefOr[String] = js.undefined
  }
  object IconData {
    
    inline def apply(accData: I18nText, ltr: Boolean, packageName: String, pathData: String | js.Array[String]): IconData = {
      val __obj = js.Dynamic.literal(accData = accData.asInstanceOf[js.Any], ltr = ltr.asInstanceOf[js.Any], packageName = packageName.asInstanceOf[js.Any], pathData = pathData.asInstanceOf[js.Any])
      __obj.asInstanceOf[IconData]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IconData] (val x: Self) extends AnyVal {
      
      inline def setAccData(value: I18nText): Self = StObject.set(x, "accData", value.asInstanceOf[js.Any])
      
      inline def setCollection(value: String): Self = StObject.set(x, "collection", value.asInstanceOf[js.Any])
      
      inline def setCollectionUndefined: Self = StObject.set(x, "collection", js.undefined)
      
      inline def setCustomTemplate(
        value: (/* component */ default, /* tagsToScope */ js.Array[String], /* scope */ js.UndefOr[String]) => TemplateFunctionResult
      ): Self = StObject.set(x, "customTemplate", js.Any.fromFunction3(value))
      
      inline def setCustomTemplateUndefined: Self = StObject.set(x, "customTemplate", js.undefined)
      
      inline def setLtr(value: Boolean): Self = StObject.set(x, "ltr", value.asInstanceOf[js.Any])
      
      inline def setPackageName(value: String): Self = StObject.set(x, "packageName", value.asInstanceOf[js.Any])
      
      inline def setPathData(value: String | js.Array[String]): Self = StObject.set(x, "pathData", value.asInstanceOf[js.Any])
      
      inline def setPathDataVarargs(value: String*): Self = StObject.set(x, "pathData", js.Array(value*))
      
      inline def setViewBox(value: String): Self = StObject.set(x, "viewBox", value.asInstanceOf[js.Any])
      
      inline def setViewBoxUndefined: Self = StObject.set(x, "viewBox", js.undefined)
    }
  }
  
  type IconLoader = js.Function1[/* collectionName */ String, js.Promise[CollectionData]]
}
