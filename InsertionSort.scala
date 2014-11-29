object Sort{
  
  def insertionSort () : Unit = {
      
      var myArray = Array(4, 7, 8, 3, 1, 9, 2, 5, 0, 6) 
      var buf:Int = 0;
    
      for(i <- 1 to (myArray.length)) {
            buf = myArray(i)
          var j = i-1
          
         while ( myArray(j) > buf  &&  j >= 0){
        
               myArray(j+1) = myArray(j)  
               j = j - 1 
               myArray(j+1) = buf 
                                              }
                                       }
         
         println("SORTED")
         for ( x <- myArray ) {
         print( x + " ")
                              }
          
         }
    
      }

}