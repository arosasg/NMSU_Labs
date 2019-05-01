// CS172
// Factors.java
// LAB 3
// Written by: Alejandro Rosas
// 09/19/18
// Debug program and test values
// Input: input some integer from user
// Output: gives factors from integer input by user

import java.util.Scanner; //import scanner
public class Factors {
   public static void main (String args[]) {
   
      int num; //call variable from user
      Scanner scan = new Scanner(System.in);  
      System.out.println("Enter an integer");
      num = scan.nextInt(); //get user integer input
      System.out.println("The factors of " + num + " are:");
                         
      for (int x = 1; x <= num; x++) { //loop that tries all the values from 1 to num (both included) to check if the remainder is 0
         if (num % x == 0){
            System.out.print(x + " "); //if enter the branch, prints x, that it's the factor
            
         } // end branch
         
      } //end loop
      
   } //end main
       
} // end class