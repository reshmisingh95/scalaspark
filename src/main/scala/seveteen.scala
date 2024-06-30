object seveteen {
  def main(args:Array[String]):Unit={
    var amount = 300
    var loyalty_card = false
    if(amount>200)
      {
        println("customer eligible for discount")
      }
    else if(loyalty_card==true)
      {
        println("customer eligible for membership benefits")
      }
    else
     {
       println("customer not eligible to either discount or membership benefits")
     }
  }

}
