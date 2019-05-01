// CS172
// HW8_2Methods.java
// HW 8 EX 2
// Written by: Alejandro Rosas
// 10/31/18
// create methods
// Input: number of lines
// Output: upside down triangle with input number of lines

public class HW8_2Methods {
    
   public static void _upsideDownTriangle (int n) {  //checking input is correct
        
      if (n < 1) {
      } //end if condition
        
      else { //call recursive method
         upsideDownTriangle (n);
      } //end else condition
        
   } //end _upsideDownTriangle method
    
   public static void upsideDownTriangle (int n) {  //recursive method
    
      if (n == 0) { //base case: when n = 0 we stop
      }
    
      else {  //recursive condition
         for (int i = 0; i < n; i++) { //for loop to print all the stars every line
            System.out.print('*');
         } //end for loop
         System.out.println(""); //jump line
         upsideDownTriangle(n-1); //recursive call method
            
      } //end else condition
      
   } //end upsideDownTriangle method
   
} //end class HW8_2Methods