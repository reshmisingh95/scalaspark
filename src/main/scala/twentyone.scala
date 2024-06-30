object twentyone {
  def main(args:Array[String]):Unit= {
    var a = 26
    if(a%3==0)
      {
        println("number is divisible by 3")
      }
    if(a%8==0)
      {
        println("number is  divisible by 8")
      }
    if(a%8!=0 && a%3!=0) {
      print("number not divisible by either 3 or 8")
    }
  }

}
