package SingleThreadedApp

import scala.io.Source

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
    val filename = "https://www.mangareader.net/bleach/1"
    for (line <- Source.fromURL(filename).getLines) {
      println(line)
    }
  }

}
