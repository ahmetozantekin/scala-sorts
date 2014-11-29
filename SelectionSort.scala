object Sort{

  def selectionSort () : Unit = {
      
      var myArray = Array(4, 7, 8, 3, 1, 9, 2, 5, 0, 6) 
      var buf:Int = 0;
      var min:Int = 0;
      
      for(i <- 0 to (myArray.length-1)) {
          min  = i 
         // j = i + 1;    
            for (j <- (i+1) to (myArray.length)){
                if ( myArray(min) > myArray(j))
                {
                    min = j
                }
            }
            
            if (min != i){
                
                buf          = myArray(i)
                myArray(i)   = myArray(min)
                myArray(min) = buf
                
            }
             
 
                                              }
                 
      
         println("SORTED")
         for ( x <- myArray ) {
         print( x + " ")
                              }
          
         }
    
      }
     