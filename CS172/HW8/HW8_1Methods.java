// CS172
// HW8_1Methods.java
// HW 8 EX 1
// Written by: Alejandro Rosas
// 10/31/18
// create methods
// Input: letter
// Output: string backwards beggining with the input letter until a or A

public class HW8_1Methods {
    
   public static void _printLettersBackwards (char c) {  //method to check is input is valid
        
      int asciiCode = (int)c;   //getting int value of c from the ascii code
        
      if ((asciiCode <= 90 && asciiCode >= 65) || (asciiCode <= 122 && asciiCode >= 97)) {     //if c is a letter, then c  should be between 65 and 90 or 97 and 122
         printLettersBackwards(c);
      } //end if condition
        
   } //end _printLettersBackward method
    
   public static void printLettersBackwards (char c) {  //method with recursion
        
      if (c == 'A' || c == 'a') {  //base case: when c is 'A' or 'a'
         System.out.print(c);
      }
        
      else {                       //recursion condition
         System.out.print(c);
         printLettersBackwards((char) ((int)c -1));
      } //end else condition
        
   } //end printLettersBackwards method
   
} //end class HW8_1Methods