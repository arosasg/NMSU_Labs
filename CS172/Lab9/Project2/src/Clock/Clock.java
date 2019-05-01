package Clock;

// CS172
// Clock.java
// Lab9
// Written by: Alejandro Rosas
// 11/07/18
// create clock methods
// Input: increment seconds (not input by user)
// Output: print clock time, with changes, and checking if two times are the same

public class Clock {
    
   // instance variables
   private int hour;
   private int minute;
   private int second;
    
   public Clock() {
      setHour(1);
      setMinute(0);
      setSecond(0);
   } //end default constructor
    
   // accessors 
   public int getHour() {
      return hour;
   } //end getHour method
    
   public int getMinute() {
      return minute;
   } //end getMinute method
    
   public int getSecond() {
      return second;
   } //end getSecond method
    
   //mutators
   public void setHour (int h) {
      if (h > 12 || h < 1) {
         System.out.println("Please enter a valid hour format (integer from 0 to 12)");
      } //end condition
      else {
         hour = h;
      } //end else condition
   } //end setHour method
    
   public void setMinute (int m) {
      if (m > 59 || m < 0) {
         System.out.println("Please enter a valid minute format (integer from 0 to 59)");
      } //end condition
      else {
         minute = m;
      } //end else condition
   } //end setMinute method
    
   public void setSecond (int s) {
      if (s > 59 || s < 0) {
         System.out.println("Please enter a valid second format (integer from 0 to 59)");
      } //end condition
      else {
         second = s;
      } //end else condition
   } //end setSecond method
    
   public void tick() {
        
      int minuteIncrement;
      int hourIncrement;
      int newMinute, newSecond, newHour;
        
      //modify seconds
      newSecond = (1 + second) % 60;
        
      //minute increment
      minuteIncrement = (1 + second) / 60;
        
      //modify minutes
      newMinute = (minute + minuteIncrement) % 60;
        
      //hour increment
      hourIncrement = (minuteIncrement + minute) / 60;
      //modify hour
      newHour = (hour + hourIncrement) % 12;
        
      //modify hour correct format if necessary
      if (newHour == 0) {
    	  newHour = 12;
      } //end condition
      
      second = newSecond;
      minute = newMinute;
      hour = newHour;
      
   } //end tick method
    
   public boolean equal(int hou, int min, int sec) {
        
      if (hou == 0) {
         hou = 12;
      } //end condition
        
      if ((hour == hou) && (minute == min) && (second == sec)) {
         return true;
      } //end condition
      else {
         return false;
      } //end else condition
        
   } //end equal method
    
   public String toString() {
      String S = String.format("%02d:%02d:%02d", hour, minute, second);
      return S;
        
   } //end toString method

} //end Clock class