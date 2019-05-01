// ************************************************************************
// Alejandro Rosas Garcia
// 08/29/2018
// CS 172
// Program3.java
// 
// Print the the amount of sales tax and the total purchase price of 
// a new refrigerator
// ************************************************************************

import java.util.Scanner;
public class Program3 {
   public static void main (String[] args) {
      
      Scanner scnr = new Scanner(System.in);
      
      double price;
      double salesTaxPercent;
      double salesTax;
      double total;
      
      System.out.print("Input the price of the refrigerator: ");
      price = scnr.nextDouble();
      
      System.out.print("Input the sales tax percentage: ");
      salesTaxPercent = scnr.nextDouble();

      salesTax = price * salesTaxPercent/100;
      total = price + salesTax;
      
      System.out.printf("Refrigerator price   $ %6.2f \n", price);
      System.out.printf("Sales Tax (%4.2f%%)\t\t$ %6.2f \n",salesTaxPercent,salesTax);
      System.out.printf("Total \t\t\t\t\t$ %6.2f\n", total);
      
   } //end main
} //end class