// CS172
// Clockapp.java
// HW 7
// Written by: Alejandro Rosas
// 10/24/18
// test clock methods
// Input: increment seconds (not input by user)
// Output: print clock time, with changes, and checking if two times are the same

public class Clockapp {
   
   public static void main(String[] args) {
        
      int incSeconds = 8640;  //seconds increments 
      
      //create Clock objects  
      Clock myClock = new Clock ( );
      Clock myClock2 = new Clock ( );
      System.out.println("My clock contains " + myClock.toString());
      
      //setting up the hour, minute and second
      myClock.setHour(4);
      myClock.setMinute(8);
      myClock.setSecond(5);
      
      //print new time  
      System.out.print("New time: ");
      System.out.println("My clock contains " + myClock.toString());
      
      //print new time in separate lines
      System.out.println("Hour: " + myClock.getHour());
      System.out.println("Minute: " + myClock.getMinute());
      System.out.println("Second: " + myClock.getSecond());
      
      //setting up the hour, minute and second  
      myClock.setHour(11);
      myClock.setMinute(59);
      myClock.setSecond(59);
        
      //testing tick method  
      myClock.tick(incSeconds);
      System.out.println("My clock contains " + myClock.toString());
      
      //setting hour, minute and second for second object  
      myClock2.setHour(12);
      myClock2.setMinute(0);
      myClock2.setSecond(0);
      
      // testing if they are equal   
      if (myClock.equal(myClock2.getHour(), myClock2.getMinute(), myClock2.getSecond())) {
         System.out.println("The times are the same.");
      } //end condition
      else {
         System.out.println("The times are not the same.");
      } //end else condition
      
   } //end main
    
} //end Clockapp class