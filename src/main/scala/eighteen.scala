object eighteen {
  def main(args:Array[String]):Unit= {
    var a = 27
    if (a % 2 != 0 && a % 3 == 0) {
      print("number is odd  number and is divisible by 3")
    }
    else if (a % 3 == 0) {
      print("number is divisible by 3")
    }
    else if (a%2!=0)
      {
        print("number is odd number")
      }
    else
      {
        print("number is neither odd nor divisible by 3")
      }
  }
}
