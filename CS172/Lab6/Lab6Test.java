// CS172
// Lab6Test.java
// LAB 6
// Written by: Alejandro Rosas
// 10/17/18
// create java application and Test different methods
// Input: none
// Output: return values of methods (oddNuumbers, temperature, hasLower, formatName..)

public class Lab6Test {

   public static void main (String[] args) { //main method
   
      //variables to call methods
      int max1 = 100, max2 = 211;
      String name1 = "Jhon Doe", name2 = "Donald Trump";
      String sentence1 = "SOMETIMES IT'S MATTeR OF TIME";
      String sentence2 = "A ZEBRA EATS GREEK YOGURT AFTER A SHOWER WITH THE CROCODILES";
      int minT1 = 10, maxT1 = 100, increment1 = 10;
      int minT2 = 5, maxT2 = 89, increment2 = 6;
      
      //calling printOddNumbers method
      System.out.println("We are calling printOddNumbers's method.");
      System.out.println("We are sending \"" + max1 + "\" as an integer parameter.");
      System.out.println("The return values of the method are: ");
      lab6Methods.printOddNumbers(max1);  //print the positive odd numbers less than or equal to 100
      System.out.println("");
      
      System.out.println("We are calling printOddNumbers's method.");
      System.out.println("We are sending \"" + max2 + "\" as an integer parameter.");
      System.out.println("The return values of the method are: ");
      lab6Methods.printOddNumbers(max2); //print the positive odd numbers less than or equal to 211
      System.out.println("");
      
      
      //calling formatName method
      System.out.println("We are calling formatName's method."); 
      System.out.println("We are sending \"" + name1 + "\" as a string parameter."); 
      System.out.println("The return values of the method is: "); 
      System.out.println(lab6Methods.formatName(name1)); //return formatted name to "Doe, John"
      System.out.println("");
      
      System.out.println("We are calling formatName's method."); 
      System.out.println("We are sending \"" + name2 + "\" as a string parameter."); 
      System.out.println("The return values of the method is: "); 
      System.out.println(lab6Methods.formatName(name2)); //return formatted name to "Trump, Donald"
      System.out.println("");
      
      
      //calling hasLower method  
      System.out.println("We are calling hasLower's method."); 
      System.out.println("We are sending \"" + sentence1 + "\" as a string parameter.");
      System.out.println("The return value of the method is: ");
      System.out.println(lab6Methods.hasLower(sentence1)); //return true if has some lower case char
      System.out.println("");
      
      System.out.println("We are calling hasLower's method."); 
      System.out.println("We are sending \"" + sentence2 + "\" as a string parameter.");
      System.out.println("The return value of the method is: ");
      System.out.println(lab6Methods.hasLower(sentence2)); //return false if all the char are upper case      
      System.out.println("");
      
      
      //calling temperatures method
      System.out.println("We are calling temperatures's method.");
      System.out.println("We are sending \"" + minT1 + ", " + maxT1 + ", " + increment1 + "\" as integers parameters.");       
      System.out.println("The return values of the method are: ");  
      System.out.println("Fahrenheit     Celsius      Kelvin");  //print first line of the table
      System.out.println("----------     -------      ------");  //print second line of the table
      lab6Methods.temperatures(minT1, maxT1, increment1); //print a table of temperatures from 10 to 100 Fahrenheit and incrementing 10 each time and converting to Celisus and Kelvin
      System.out.println("");
      
      System.out.println("We are calling temperatures's method.");
      System.out.println("We are sending \"" + minT2 + ", " + maxT2 + ", " + increment2 + "\" as integers parameters.");       
      System.out.println("The return values of the method are: ");
      System.out.println("Fahrenheit     Celsius      Kelvin");  //print first line of the table
      System.out.println("----------     -------      ------");  //print second line of the table

      lab6Methods.temperatures(minT2, maxT2, increment2); //print a table of temperatures from 5 to 89 Fahrenheit and incrementing 6 each time and converting to Celisus and Kelvin
      System.out.println("");

   } //end main   
    
}//end class