// CS172
// HW8_1App.java
// HW 8 EX 1
// Written by: Alejandro Rosas
// 10/31/18
// test methods
// Input: letter
// Output: string backwards beggining with the input letter until a or A

public class HW8_1App {
   
   public static void main(String[] args) { 
        
      char initialChar = 'F'; 
        
      //testing methods
      HW8_1Methods._printLettersBackwards(initialChar); 
      System.out.println("");
        
      HW8_1Methods._printLettersBackwards('!');
        
      HW8_1Methods._printLettersBackwards('v');
      System.out.println("");
        
      HW8_1Methods._printLettersBackwards('z');
      System.out.println("");
        
      HW8_1Methods._printLettersBackwards('Z');
        
   } //end main method
    
} //end HW8_1App class