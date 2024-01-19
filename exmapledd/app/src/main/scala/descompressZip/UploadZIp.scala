package descompressZip

import ZipExample.ZipExample
import be.doeraene.webcomponents.ui5.*
import be.doeraene.webcomponents.ui5.configkeys.*
import com.raquo.laminar.api.L.*
import org.scalajs.dom

import scala.scalajs.js





object UploadZIp {
  def apply():HtmlElement=
      val allStagedFilesVar: Var[List[(dom.File, js.Date)]] = Var(Nil)

      val newFilesArrivedObserver = allStagedFilesVar.updater[List[(dom.File, js.Date)]](_ ++ _)

      val stagedFilesCount = allStagedFilesVar.signal.map(_.length)

      val uploadAllBus: EventBus[Unit] = new EventBus

      val body = UploadCollection(
        _.slots.header := div(
          Title.h2(child.text <-- stagedFilesCount.map(count => s"Uploaded ($count)")),
          Label("Add new files and press to start uploading pending files:"),
          child <-- allStagedFilesVar.signal.mapTo(
            // Note that we need to re-create a new file uploader each time, otherwise there is a glitch preventing
            // from adding twice the same group of file in a row. (The glitch actually exists on their official docs)
            FileUploader(
              _.hideInput := true,
              _.multiple := true,
              Button(_.icon := IconName.add, _.design := ButtonDesign.Transparent),
              _.events.onChange.map(_.target.files.map(_ -> new js.Date())) --> newFilesArrivedObserver
            )
          ),
          Button("Upload all", _.events.onClick.mapTo(()) --> uploadAllBus.writer)
        ),
        _.mode := ListMode.Delete,
        _.events.onItemDelete.map(_.detail.item.dataset("index").toInt) --> allStagedFilesVar.updater[Int](
          _.patch(_, Nil, 1)
        ),
        // This is where the logic of actually uploading files should live
        uploadAllBus.events.sample(allStagedFilesVar.signal) --> Observer[List[(dom.File, js.Date)]](files =>
          files.foreach((file, date) =>
            dom.console.log("file prosecin -----> ")
            ZipExample.decompressFileExternal(file)
            dom.console.log(file , date))
        ),
        children <-- allStagedFilesVar.signal.map(_.zipWithIndex.map { case ((file, selectedAt), index) =>
          UploadCollection.item(
            _.fileName := file.name,
            _.fileNameClickable := true,
            s"Selected at: $selectedAt",
            dataAttr("index") := index.toString,
            _.slots.thumbnail := img(
              src := "/home/dgc7/proyectos/scala/exercies/exmapledd/app/img/linux.png",
              inContext(el => onLoad --> Observer[Any](_ => dom.URL.revokeObjectURL(el.ref.src)))
            )
          )
        }),
        _.events.onDrop.preventDefault.map(
          _.dataTransfer.files.toList.map(_ -> new js.Date)
        ) --> newFilesArrivedObserver

      )

      div(
        h2("uploadZip example"),
        div(
          padding := "1em",
          border := "0.0625rem solid #C1C1C1",
          backgroundColor := "#f7f7f7",
          body
        ),
      )

}
