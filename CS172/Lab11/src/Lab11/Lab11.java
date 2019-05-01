// CS172
// Lab11.java
// LAB 11
// Written by: Alejandro Rosas
// 11/14/18
// create and test recursive methods
// Input: none
// Output: return values powerOfTen, printLettersForward, stringBywords

package Lab11;

public class Lab11 {

    public static void printLettersForward (char c) {
        
        int asciiCode = (int) c;
        
        //if c is a letter, then c  should be between 65 and 90 or 97 and 122
        if (asciiCode <= 90 && asciiCode >= 65) {     
            
            if (c == 'A') {  //base case: when c is 'A'
                System.out.print(c);
            } //end if condition
            
            else {                       // recursion method
                printLettersForward((char) ((int)c - 1));
                System.out.print(c);
            } //end else condition
            
        } //end if condition
            
        else if (asciiCode <= 122 && asciiCode >= 97) {
            
            if (c == 'a') {  //base case: when c is 'a'
                System.out.print(c);
            } //end if condition
            
            else {                       // recursion method
                printLettersForward((char) ((int)c - 1));
                System.out.print(c);
            } //end else condition
        } //end else if condition
        
        
    } //end printLetterForward method
    
    public static double powerOfTen(int a) {
        
        double total = 1.0;
        
        if (a == 0) {          // base case: when a = 0
            return total;
        } //end condition
        
        // if a is positive
        if (a > 0) {
            total = 10 * powerOfTen(a - 1);
        } //end condition
        
        // if a is negative
        else {
            total = 1 / (10 * powerOfTen(-a - 1));
        } //end else
        
        return total;
        
    } //end powerOfTen method
    
    public static void stringByWords (String s) {
        
        int index = s.indexOf(" ");
        
        if (s.length() == 0) {
        }
        
        else if (index == -1) {     // base case: when index = -1
            System.out.println(s);
        } //end condition
        
        else {
            System.out.println(s.substring(0,index));
            stringByWords(s.substring(index + 1));
        } //end else
    } //end stringByWords method
        
    public static void main(String[] args) {
        
        System.out.println("Testing powerOfTen method: ");
        System.out.println(Lab11.powerOfTen(1));
        System.out.println(Lab11.powerOfTen(4));
        System.out.println(Lab11.powerOfTen(0));
        System.out.println(Lab11.powerOfTen(-3));
        System.out.println(Lab11.powerOfTen(-5));
        System.out.println(Lab11.powerOfTen(-2));
        System.out.println("");
        
        System.out.println("Testing printLettersForward method: ");
        Lab11.printLettersForward ('K');
        System.out.println("");
        Lab11.printLettersForward ('I');
        System.out.println("");
        Lab11.printLettersForward ('a');
        System.out.println("");
        Lab11.printLettersForward ('p');
        System.out.println("");
        Lab11.printLettersForward ('A');
        System.out.println("");
        Lab11.printLettersForward ('?');
        Lab11.printLettersForward ('/');
        System.out.println("");
        
        System.out.println("Printing \"Walden Hall ocean flipflops\" one word per line: ");
        Lab11.stringByWords("Walden Hall ocean flipflops");
        System.out.println("");
        Lab11.stringByWords("");  // do not print any
        System.out.println("Printing \"abuelo de kenny\" one word per line: ");
        Lab11.stringByWords("abuelo de kenny");
        System.out.println("");
        System.out.println("Printing \"bed hypersonic ocean flipflops\" one word per line: ");
        Lab11.stringByWords("bed hypersonic ocean flipflops as dolphin");
        
        
    } //end main
} //end Lab11 class

