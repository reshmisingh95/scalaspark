object twentythree {
  def main(args:Array[String]):Unit= {
    var a = 45
    if(a%5==0)
    {
      println("number is divisible by 5")
    }
    if(a%9==0)
    {
      println("number is  divisible by 9")
    }
    if(a%9!=0 && a%5!=0) {
      print("number not divisible by either 9 or 5")
    }
  }

}
