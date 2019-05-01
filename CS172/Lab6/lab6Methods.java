// CS172
// Lab6Methods.java
// LAB 6
// Written by: Alejandro Rosas
// 10/17/18
// Test differente methods
// Input: none
// Output: return values of methods (oddNuumbers, temperature, hasLower, formatName..)

public class lab6Methods { //class where all the methods are gonna be
    
   public static void printOddNumbers (int max) {  
        
      //print the positive odd numbers less than or equal to max

      int n = 1, count = 0;
        
      while (n <= max) { //loop that enters if we still in the range desired
        
         System.out.printf("%5d", n); //prints the number in field of 5
         n = n + 2; //to get all the odd numbers
         count++; //to know when to print new line
         System.out.print((count % 10 == 0) ? "\n" : "" ); //print new line if 10 numbers are already in a row
            
      } //end while
        
      if (count % 10 != 0) { 
        
         //print new line if we finished the table and we didn't end up with new line in the loop
         System.out.println("");
            
      } //end condition
      
   } //end printOddNumbers method
    
   public static String formatName (String name) {
   
      //return name as "Last Name, First Name"
        
      String firstName, lastName, newFormat;
      int index;  
        
      index = name.indexOf(" "); //find index
      firstName = name.substring(0,index); //firstName
      lastName = name.substring(index+1, name.length()); //lastName
        
      newFormat = lastName + ", " + firstName; //new format
        
      return newFormat;  
      
   } //end formatName method
    
   public static boolean hasLower (String text) {
   
      //return boolean (true or false) depending on if text has some char in lowercase
        
      String upperCase;
      
      //informative printing information for the user   
        
      upperCase = text.toUpperCase(); //copy text but all in Upper Case
       
      //System.out.println(upperCase) --> check text has been copied in Upper Case to check next condition
        
      if (text.equals(upperCase)) { //if text is equal to upperCase, then false
         return false;
      }
      
      else { //if text is different to UpperCase, then true
         return true;
      }
        
   } //end hasLower method    
    
   public static void temperatures (int minTemp, int maxTemp, int increment) {
   
      //print a table with a range of temperatures from minTemp to maxTemp with an increment of increment
      //convert all the range of temperatures to Celsius and Kelvin
        
      double c, k; //celisus and kelvin
      int f;  //fahrenheit
      
      //conversion formulas  
      f = minTemp;
      c =  (f - 32.0) * 5.0 / 9.0;
      k = c + 273.15;        
        
      while (f <= maxTemp) { //loop if we are in the range
         System.out.printf("%10d%12.2f%12.2f\n",f, c, k);  //print Fahrenheit, Celsius and Kelvin (with field 10, 12 and 12 respectevely) and jump to new line
            
         // modify variables for next iteration
         f = f + increment;
         c =  (f - 32.0) * 5.0 / 9.0;
         k = c + 273.15;
         
      } //end loop
        
   } //end temperatures methhod 
} //end class