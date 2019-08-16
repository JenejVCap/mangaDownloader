package SingleThreadedApp

import scala.io.Source
import org.jsoup.Jsoup
import org.jsoup.nodes.{Document, Element}
import java.net._
import java.io._

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

object MangaDownloader {
  def main(args: Array[String]): Unit = {

    //hardcode a solution first

    (1 to 10) map {
      currentChapter => {
        val firstPage = s"${mangaBaseLink}$currentChapter"
        val lines: String = Source.fromURL(firstPage).getLines.mkString("\n")
        val doc = Jsoup.parse(lines)
        val navbarPages = doc.getElementById("pageMenu")
        val pages = navbarPages.getElementsByTag("option")
        val lastPage = pages.size
        val imageLinks = (1 to lastPage) map {
          imageNo =>
            val page = s"${mangaBaseLink}${currentChapter}/$imageNo"
            val pageLines: String = Source.fromURL(page).getLines.mkString("\n")
            val doc = Jsoup.parse(pageLines)
            val img = doc.getElementById("img").attr("src")
            downloadFile(img, (currentChapter.toString, imageNo))
        }

      }

    }
  }

  def downloadFile(imageLink: String, chapterAndId: (String, Int)) {
    val url = new URL(imageLink)
    val connection = url.openConnection().asInstanceOf[HttpURLConnection]
    connection.setRequestMethod("GET")
    val in: InputStream = connection.getInputStream
    val chapterDirectory = new File(s"$singleThreadedResultDirectory${chapterAndId._1}").mkdirs()
    val fileToDownloadAs: File = new File(
      s"$singleThreadedResultDirectory${chapterAndId._1}/${chapterAndId._2}$imageSuffix"
    )
    val out: OutputStream = new BufferedOutputStream(new FileOutputStream(fileToDownloadAs))
    val byteArray = Stream.continually(in.read).takeWhile(-1 !=).map(_.toByte).toArray
    out.write(byteArray)
  }
}
