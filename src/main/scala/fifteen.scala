object fifteen {
  def main(args:Array[String]):Unit={
    var age = 22
    var free_trial=true
    if(age<25 && free_trial==false)
      {
        print("customer eligible for student discount")
      }
    else if(free_trial==true && age>25)
      {
        print("customer eligible for free trial")
      }
    else if(age<25 && free_trial==true)
      {
        print("customer eligible for both")
      }
    else
     {
       print("customer not eligible for student discount or for free trial")
     }
  }

}
