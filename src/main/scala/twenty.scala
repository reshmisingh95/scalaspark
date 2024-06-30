object twenty {
  def main(args:Array[String]):Unit= {
    var data = 49
    if(data%5==0 && data%7==0)
      {
        print("Data is divisible by both 5 and 7")
      }
    else if(data%5==0 && data%7 !=0)
    {
      print("data is divisible by only 5 ")
    }
    else if(data%7==0 && data%5 !=0)
    {
      println("data only divisible by 7")
    }
    else
      {
        println("data not divisible by both 5 and 7")
      }

  }

}
