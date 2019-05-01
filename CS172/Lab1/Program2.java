// ************************************************************************
// Alejandro Rosas Garcia
// 08/29/2018
// CS 172
// Program2.java
// 
// Print the volume of a cylinder given its heigth and diameter
// ************************************************************************

public class Program2 {
   public static void main (String[] args) {
      
      double heigth = 2.0, diameter = 2.0;
      double volume = Math.PI * Math.pow((diameter/2),2) * heigth;
      System.out.println( "The heigth is " + heigth + " and the diameter is " + diameter + ".");
      System.out.println("The volume is " + volume + ".");
      
   } //end main
} //end class