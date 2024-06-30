object nineteen {
  def main(args:Array[String]):Unit= {
    var number = 24
    if(number%4==0 )
      {
        println("divisible by 4")
      }
     if(number%6==0)
     {
       println("divisible by 6")
     }
     if(number%4!=0 &&number%6 !=0)
       {
         println("not divisible by 4 and 6")
      }
  }

}
