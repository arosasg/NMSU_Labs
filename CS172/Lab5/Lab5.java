// CS172
// Lab5.java
// LAB5
// Written by: Alejandro Rosas
// 10/03/18
// Import data from file and get useful data
// Input: input name of the file to open
// Output: get average and highest game of every player and at the end get the highest game and average among all the players

import java.util.Scanner; // import scanner
import java.io.*;  // import read file

public class Lab5 { //open class

    public static void main (String args[])throws IOException { //main method
   
        Scanner scan = new Scanner(System.in); 
        System.out.println("Enter name of the file that you want to open: ");
        String s = scan.nextLine();   //input file name
        Scanner fileScan = new Scanner(new File(s));  //open file
        
        // declare variables to get desired output
        String inputLine;
        double highestAverage = 0;  
        double playerAverage = 0;
        String highestAverageName = " ";
        int highestGame = 0;
        int playerHighestGame = 0;
        String highestGameName = " ";
        int v1, v2, v3;
        int index;
        String playerName;
      
        while (fileScan.hasNext()) {  // open while loop that will close only when file arrives to end
         
            inputLine = fileScan.nextLine();   //get all data from the line
             
            index = inputLine.lastIndexOf(' ');  // get index of last space
            v3 = Integer.parseInt(inputLine.substring(index+1));  // get game 3 value
            inputLine = inputLine.substring(0, index);  // truncate the string
             
            index = inputLine.lastIndexOf(' ');  // get index of last space
            v2 = Integer.parseInt(inputLine.substring(index+1));  // get game 2 value
            inputLine = inputLine.substring(0, index);  // truncate the string
             
            index = inputLine.lastIndexOf(' ');  // get index of last space
            v1 = Integer.parseInt(inputLine.substring(index+1));  // get game 1 value
            inputLine = inputLine.substring(0, index);  // truncate the string
         
            playerName = inputLine; // playerName is equal to the remaining inputLine           
             
            playerAverage = (v1 + v2 + v3)/3.0;  // calculate average of the 3 games
             
            if (v1 >= v2 && v1 >= v3) {  // condition for v1 to be the player highest game
                playerHighestGame = v1;
            }
            else if (v2 >= v1 && v2 >= v3) {  // condition for v2 to be the player highest game
                playerHighestGame = v2;
            }
            else {
                playerHighestGame = v3;  // condition for v3 to be the player highest game
            }
         
            if (playerHighestGame > highestGame) {  // enter condition if player highest game is the current highest game of all the previous players checked
                highestGame = playerHighestGame;
                highestGameName = playerName;   // get name of the player with highest game 
            }
         
            if (playerAverage > highestAverage) {   // enter condition if player average is the current highest average of all the previous players checked
                highestAverage = playerAverage;
                highestAverageName = playerName;   // get name of the player with highest average
            }
             
            System.out.format("%-25s Average:  %3.0f    Highest game:  %3d \n" , playerName, playerAverage, playerHighestGame);  // print player name, average and his best game
                
        } // close while loop
            
    System.out.format("Player with the highest average:   %-25s Average:   %3.0f \n", highestAverageName, highestAverage);  // print name of the highest player average and the value
    System.out.format("Player with the highest game:      %-25s Game:      %3d \n", highestGameName, highestGame);  // print name of the highest player game and the value
            
        
        
    } //close main class
    
}  // close lab5           