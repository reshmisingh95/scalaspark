object fourteen {
  def main(args:Array[String]):Unit={
    var amount = 110
    if(amount>100 && amount>150)
      {
        print("customer eligible for both free shipping and discount")
      }
    else if(amount>100 && amount<150)
      {
        print("customer eligible for only free shipping")
      }
    else
      {
        print("customer not eligible to free shipping and discount")
      }
  }

}
