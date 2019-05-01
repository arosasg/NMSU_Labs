// CS172
// Lab7.java
// LAB 7
// Written by: Alejandro Rosas
// 10/24/18
// Create array methods
// Input: none
// Output: print and return values corresponding to elements in the array (highest value, equal or not, etc)

public class Lab7 {
    
   public static void printIntArray(int a[]) {
        
      for (int i = 0; i < a.length; i++) {
         System.out.printf("%5d\n", a[i]);
      } //end loop
   } //end printIntArray method
    
   public static void printIntArray (int a[ ], int n) {
        
      if (n<= 1) {
         for (int i = 0; i < a.length; i++) {
             System.out.printf("%5d", a[i]);
         } //end loop
      } //end condition
        
      else {
            
         for (int i = 0; i < a.length; i++) {
            System.out.printf("%5d", a[i]);
                
            if ((i+1) % n == 0) {
               if (i != 0) {                                       //do not want to jump line after first element
                  System.out.println("");
               } //end condition
            } //end condition
         } //end loop
      } //end else condition
   } //end printIntArray method (with two parameters)
    
   public static boolean compareArrays (int a[ ], int b[ ]) {
        
      if (a.length == b.length) {
         for (int i = 0; i < a.length; i++) {
            if (a[i] == b[i]) {
               continue;
            } //end condition
                
            else {
               return false;
            } //end else condition
         } //end loop
            
         return true;
      } //end condition
        
      else {
        return false;
      } //end else condition
   } //end compareArrays method
    
   
   public static void evenElements (int a[ ]) {
        
      for (int i = 0; i < a.length; i++) {
          if (a[i] % 2 == 0) {
             System.out.printf("%5d\n", a[i]);
          } //end condition
      } //end loop
   } //end evenElements method
    
   public static int findMax (int a[ ]) {
        
      int highestValue = a[0];
        
      for (int i = 1; i < a.length; i++) {
         if (a[i] > highestValue) {
            highestValue = a[i];
         } //end condition
      } //end loop
        
      return highestValue;
   } //end findMax method
   
} //end class Lab7