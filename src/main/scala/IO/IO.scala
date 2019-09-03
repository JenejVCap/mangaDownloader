package IO
import java.io._
import java.net.{HttpURLConnection, URL}

import Config.Config.{imageSuffix, singleThreadedResultDirectory}

object IO {

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
