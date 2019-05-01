// CS172
// ManyStrings.java
// LAB 2
// Written by: Alejandro Rosas
// 09/12/18
// Explore the string class and modify strings
// Input: Prompt for and input a string from the User.
// Output: Modify Input from user

import java.util.Scanner;

class Lab2 {

   public static void main(String[] args) {
      String S; //first string input by user
      String S_1; //second string input by user
      Scanner scan = new Scanner(System.in);
   
      System.out.println("Enter a line");
      S = scan.nextLine(); //scan string including spaces
      S = S.trim(); //trims off leading/ending spaces
   
      System.out.println("You entered: " + S); //basic output
   
      System.out.println("The length of the string is: " + S.length()); //output string length
   
      
      System.out.println("The first word is: \"" + S.substring(0,S.indexOf(" ")) + "\""); //output first word of the string
      
      System.out.println("The uppercase version is: " + S.toUpperCase()); //output string in Upper Case
      
      System.out.println("Enter a string without spaces: ");      
      S_1 = scan.next(); //scan string until first space
      
      System.out.println("The first half of the string is: " + S_1.substring(0, S_1.length()/2)); //output fisrt half of the string
      
      System.out.println("The string with the character 'e' replace to 'a' is: " + S_1.replace("e","a")); //replaces all occurrences of 'a' to 'e'  
      
      System.out.println("The last character of the string is: " + S_1.charAt(S_1.length()-1)); //print last character of the String S_1
      
      if (S_1.indexOf('m') != -1) { //enter branch if 'm' is in the string
         System.out.println("The first ocurrence of the letter 'm' in the string is at the index " + S_1.indexOf('m'));
      } //close if
      
      else { //enter branch if 'm' is not in the string
         System.out.println("There was no letter 'm' in the string");
      } //close else
      
      System.out.println("The string without the letter 'o' is: " + S_1.replace("o","")); //delete the letter 'o' on the string
      
      if (S_1.length() % 2 == 0) { //enter branch if length is even
         System.out.println("The length of the string entered is even");
      }//close if
      
      else { //enter branch is else is odd
         System.out.println("The length of the string entered is odd");
      }//close else
      
   } // end of main
   
} //end of class 
   