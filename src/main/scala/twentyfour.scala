object twentyfour {
  def main(args: Array[String]): Unit = {
    var a = 28
    if (a < 13) {
      println("age group is child")
    }
    else if (a > 13 && a < 19) {
      println("age group - teenager")
    }
    else if (a >= 20) {
      print("age group - adult")
    }
  }
}
