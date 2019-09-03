package SingleThreadedApp

import scala.io.Source
import org.jsoup.Jsoup
import org.jsoup.nodes.{Document, Element}
import java.net._
import java.io._
import Crawler._
import IO._

import Config.Config._

/**
  * mangareader.net uses a standard url pattern
  * a) every chapter's first page:
  *   <baseUrl>/<mangaName>/<chapterNumber>
  * b) every page in a chapter other than the first one has:
  *   <baseUrl>/<mangaName>/<chapterNumber>/<pageNumber>
  * c) the chapter's last page varies each time but it can be figured out in two ways:
  *   shitty way: let it fail and handle the exception
  *   2: crawl to
  *     <select id="pageMenu" name="pageMenu">
  *       <option value="/<mangaName>/1" selected="selected">1</option>
  *       <option value="/<mangaName>/1/2">2</option>
  *       ....
  *       <option value="/<mangaName>/1/<lastId>"><lastId></option>
  *     </select>
  *     pick the last id and stop looking for pages at that point.
  *
  *  step 2: crawl to the image link for each page
  *
  *  step 3: download the page and save it in an indexable manner
  *
  *  step 4: move to next chapter
  */

object SIngleThreadedMangaDownloader {
  def main(args: Array[String]): Unit = {

    (1 to chapters) foreach {
      currentChapter => {
        val firstPage = s"$mangaBaseLink$currentChapter"
        val lines: String = Source.fromURL(firstPage).getLines.mkString("\n")
        Crawler.firstChapterPages(lines) match {
          case MangaFirstPageDocument(_, size) => (1 to size) foreach {
            imageNo =>
              val page = s"$mangaBaseLink$currentChapter/$imageNo"
              val pageLines: String = Source.fromURL(page).getLines.mkString("\n")
              val doc = Jsoup.parse(pageLines)
              val img = doc.getElementById("img").attr("src")
              IO.downloadFile(img, (currentChapter.toString, imageNo))
          }
          case _ => Unit
        }
      }
    }
  }
}
