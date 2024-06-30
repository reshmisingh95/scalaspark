object tenth {
  def main(args:Array[String]):Unit={
    var a = 160
    if(a>100 && a<=150)
      {
        print("eligible for free shipping and not for discount")
      }
    else if(a>150)
      {
        println ("eligible for discount and free shipping")
      }
    else
      {
        println("neither eligible for free shipping nor for discount")
      }
  }

}
