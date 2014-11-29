object Sort{
  
  def bubbleSort () : Unit = {
      
      var myArray = Array(4, 7, 8, 3, 1, 9, 2, 5, 0, 6) 
      var buf:Int = 0;
    
      for(i <- 0 to (myArray.length-1)) {
         for (j <- 1 to (myArray.length)){
            
             if (myArray(j) < myArray(j-1)){
                 
                buf          = myArray(j)    
                myArray(j)   = myArray(j-1)
                myArray(j-1) = buf
                
                                            }
             
         }
      }
    
       println("SORTED")
       for ( x <- myArray ) {
         print( x + " ")
                           }
  }
 

}