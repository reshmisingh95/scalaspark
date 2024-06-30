object twelfth {
  def main(args:Array[String]):Unit={
var a = 70
    if(a >60 && a <25)
      {
        print("age eligible for both student and senior discounts")
      }
    else if(a>60) {
      println("eligible for senior discount")
    }
    else if (a<25)
      {
        println("eligible for student discount")
      }
    else
    {
      print("not eligible for both the discounts")
    }


  }

}
