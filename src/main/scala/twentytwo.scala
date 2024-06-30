object twentytwo {
  def main(args:Array[String]):Unit= {
    var a = 25
    if(a%2==0)
    {
      println("number is divisible by 2")
    }
    if(a%5==0)
    {
      println("number is  divisible by 5")
    }
    if(a%2!=0 && a%5!=0) {
      print("number not divisible by either 2 or 5")
    }
  }

}
