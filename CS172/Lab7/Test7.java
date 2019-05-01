// CS172
// Test7.java
// LAB 7
// Written by: Alejandro Rosas
// 10/24/18
// test array methods
// Input: none
// Output: print and return values corresponding to elements in the array (highest value, equal or not, etc)

public class Test7 {
   public static void main(String[] args) {
        
      Lab7 first = new Lab7();                                        //creating Lab7 object 
        
      //creating 3 different arrays
      int[] array1 = new int[25];
      int[] array2 = new int[50];
      int[] array3 = new int[25];
        
      //adding values to array1 and array3
      for (int i = 0; i < 25; i++) {
         array1[i] = (int)(Math.random() * (100 - 1 + 1) + 1 );
         array3[i] = array1[i];                                      //copying all elements in array1 to array3 (Instruction 11 in lab 7)
      } //end loop
        
      //adding value to array2
      for (int i = 0; i < 50; i++) {
        array2[i] = (int)(Math.random() * (1000 - 1 + 1) + 1 );
      } //end loop
        
      //Instruction 3
      System.out.println("Printing all the elements of array1:");
      first.printIntArray(array1);
      System.out.println("");
        
      //Instruction 4
      System.out.println("Printing all the elements of array 1, 5 per line:");
      first.printIntArray(array1, 5);
      System.out.println("");
        
      //Instruction 7
      System.out.println("Printing all the elements of array2, 10 per line:");
      first.printIntArray(array2, 10);
      System.out.println("");
        
      //Instruction 8
      System.out.println("Printing all the even elements of array1:");
      first.evenElements(array1);
      System.out.println("");
        
      //Instruction 9
      System.out.println("Printing all the even elements of array2: ");
      first.evenElements(array2);
      System.out.println("");
        
      //Instruction 12
      System.out.println("array1 contains the same elements, in the same order, as array2: ");
      System.out.println(first.compareArrays(array1, array3));
      System.out.println("");
        
      //change element 24 of the array3 (Instruction 13)
      array3[24] = 1;    
        
      //Instruction 14
      System.out.println("array1 contains the same elements, in the same order, as array3: ");
      System.out.println(first.compareArrays(array1, array3));
      System.out.println("");
        
      //Instruction 15
      System.out.println("array2 contains the same elements, in the same order, as the modified array2: ");
      System.out.println(first.compareArrays(array2, array3));
      System.out.println("");
        
      //Instruction 16
      System.out.println("Printing the maximum value of the elements in array1: ");
      System.out.println(first.findMax(array1));
      System.out.println("");
        
      //Instruction 17
      System.out.println("Printing the maximum value of the elements in array2: ");
      System.out.println(first.findMax(array2));
      System.out.println("");
        
        
   } //end main method
   
} //end class Test7

