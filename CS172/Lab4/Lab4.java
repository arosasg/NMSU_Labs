// CS172
// Lab4.java
// LAB 4
// Written by: Alejandro Rosas
// 09/26/18
// Make 7 problems to practice loops
// Input: some problems require some input
// Output: gives odd numbers, triangle of asterisks, reverse strings, table with factors and powers...

import java.util.Scanner; //import scanner
public class Lab4 { 
   public static void main (String args[]) {
      
      int i; //call int for loops (will be main loop)
      int b; //call int for loops (will be second main loop)
      
      //Problem #1 - print odd numbers from 1 to 99 (inclusive)
      
      System.out.println("This is Problem #1: ");
      
      for (i = 1; i<100; i= i + 2) { //loop that begins with 1 and add 2 for each iteration 
         System.out.println(i);
      } //exit loop
      
      System.out.println("");
      
      //Problem #2 - print triangle of asterisks
      
      System.out.println("This is problem #2: ");
      
      String asterisk = "*"; //call string
      
      Scanner scan = new Scanner (System.in);
      System.out.println("Enter number of lines desired: ");
      int numberOfLines = scan.nextInt(); //scan integer input by user
      
      if (numberOfLines >= 1 && numberOfLines <= 50) { //condition to enter loops
      
         for (i = 1; i < (numberOfLines + 1) ; i++) { //loop total of lines
            
            for (b = 0; b < i; b++) { //second loop and b<i for output exact number of asterisk at each line
               System.out.print(asterisk);
               
            } //exit second loop
            
            System.out.println(" ");  //print new line after exit second loop
         } //exit first loop
      }
      
      else {  //if last condition is not true, then enters this branch
         System.out.println("Invalid input");
      }
      
      System.out.println("");
      
      scan.nextLine();
      
      //Problem #3 - print characters of the String input by user, at reverse
      
      System.out.println("This is problem #3: ");
      System.out.println("Input a string: ");
      
    
      String reverse = scan.nextLine(); //input string from user
      
      int length = reverse.length();  //length of string
      
      for (i = (length -1); i>=0; i--) { //goes through every character of the string calling is index
         System.out.print(reverse.charAt(i));
      } //exit loop
      
      System.out.println("");
      System.out.println("");
      
      //Problem #4 - input 10 integer values and print the highest value
      
      int value; //call new integer
      
      System.out.println("This is Problem #4: ");
      System.out.println("Enter value: ");
 
      int highestValue = scan.nextInt(); //integer input by user and we put it before the loop to compare it with this
      
      for (i = 0; i < 9; i++) { //loop iterates 9 times since we have already 1 input from user before the loop
         System.out.println("Enter value: ");
     
         value = scan.nextInt(); //input integer from user
         
         if (value > highestValue) { //enter branch is the input is the highest
            highestValue = value;
         }
         
      } //exit loop
      
      System.out.println("The highest value input is: " + highestValue);
      
      System.out.println("");
      
      scan.nextLine();
      
      //Problem #5 - input a string from the user and output the number of each vowels
      
      System.out.println("This is Problem #5: ");
      System.out.println("Enter string: ");
 
      String vowels = scan.nextLine(); //input string from user
      vowels = vowels.toLowerCase(); //All the string to Lower case
      
      int countA = 0; //call integer variables to count number of times of each vowel
      int countE = 0;
      int countI = 0;
      int countO = 0;
      int countU = 0;
      
      for (i = 0; i < vowels.length(); i++) { //loop that goes throught all the characters
      
         if (vowels.charAt(i) == 'a') { //enters branch if character is 'a'
            countA = countA + 1;
         }
         
         if (vowels.charAt(i) == 'e') { //enters branch if character is 'e'
            countE = countE + 1;
         }
         
         if (vowels.charAt(i) == 'i') { //enters branch if character is 'i'
            countI = countI + 1;
         }
         
         if (vowels.charAt(i) == 'o') { //enters branch if character is 'o'
            countO = countO + 1;
         }
         
         if (vowels.charAt(i) == 'u') { //enters branch if character is 'u'
            countU = countU + 1;
         }
      } //exit loop
      
      System.out.println("The string contained: ");
      System.out.printf("%3d A's\n", countA); //print number of A vowels..
      System.out.printf("%3d E's\n", countE); //print number of E vowels..
      System.out.printf("%3d I's\n", countI); //print number of I vowels..
      System.out.printf("%3d O's\n", countO); //print number of O vowels..
      System.out.printf("%3d U's\n", countU); //print number of U vowels..
      
      System.out.println("");
      
      
      //Problem #6 - display a table of numbers and their squares from 1 to 80
      
      System.out.println("This is Problem #6: ");
      
      System.out.println("Num Square Num Square Num Square Num Square"); //print first line
      
      for (i = 1; i <= 20; i++) { //loop through all the lines of the table
      
         for (b = i; b <= 80; b = b + 20) { //loop 4 times everytime adding 20 to b
         
            System.out.printf("%3d %6d ", b, b*b); //print b and his power
         } //exit second loop
         
         System.out.println(""); //new line each time after second loop
      } //exit first loop
      
      System.out.println("");
      
      
      //Problem #7 - display list of all factors of the numbers 1 to 50
      
      System.out.println("This is Problem #7: ");
      
      System.out.println("Number     Factors"); //print first line
      System.out.println("------     -------"); //print second line
      
      for (i = 1; i <= 50; i++) { //loop that goes through all the lines
         
         System.out.printf("  %2d      ", i); //print the number
         for (b = 1; b <= 50; b++) { //loop for all the numbers that we want to evaluate
             
            if (i % b == 0) { //if it's a factor enters this branch
               System.out.printf(" %2d", b); //print factor
            } //exit branch
            
         } //exit second loop
         
         System.out.println(""); //new line each time goes after second loop
         
      } //exit first loop
           
   } //exit main
   
}// exit class
   