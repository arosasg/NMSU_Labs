// CS172
// Clock.java
// HW 7
// Written by: Alejandro Rosas
// 10/24/18
// create clock methods
// Input: increment seconds (not input by user)
// Output: print clock time, with changes, and checking if two times are the same

public class Clock {
    
   private int hour;
   private int minute;
   private int second;
   String completeTime = "bbb";
    
   public Clock() {
      hour = 0;
      minute = 0;
      second = 0;
   } //end default method
    
   //accesors 
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
      if (h > 12 || h < 0) {
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
    
   //method to set the right format (example: 12:04:02) 
   public String setFormat ( int ho, int mi, int se) {
        
      String hourFormat, minuteFormat, secondFormat;
      String completeTime;
        
      if (ho == 0) {
         ho = 12;
      } //end condition
      if ( ho < 10) {
         hourFormat = "0" + Integer.toString(ho);
      } //end condition
      else {
         hourFormat = Integer.toString(ho);
      } //end else condition
      if (mi < 10) {
         minuteFormat = "0" + Integer.toString(mi);
      } //end condition
      else {
         minuteFormat = Integer.toString(mi);
      } //end else condition
      if (se < 10) {
         secondFormat = "0" + Integer.toString(se);
      } //end condition
      else {
         secondFormat = Integer.toString(se);
      } //end else condition
        
      hour = ho;
      minute = mi;
      second = se;
        
      completeTime = hourFormat + ":" + minuteFormat + ":" + secondFormat;
        
      return completeTime;
    
   } //end setFormat method
    
   public String tick(int secondsIncrement) {
        
      int minuteIncrement;
      int hourIncrement;
      int newMinute = 0, newSecond = 0, newHour = 0;
      String completeTime = "";
        
      //modify seconds
      newSecond = (secondsIncrement + second) % 60;
        
      //minute increment
      minuteIncrement = (secondsIncrement + second) / 60;
        
      //modufy minutes
      newMinute = (minute + minuteIncrement) % 60;
        
      //hour increment
      hourIncrement = (minuteIncrement + minute) / 60;
      //modify hour
      newHour = (hour + hourIncrement) % 12;
        
      //modify format
      setFormat (newHour, newMinute, newSecond);
        
      System.out.print("New time: ");
        
      return completeTime;
      
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
        
      return (setFormat(hour, minute, second));
        
   } //end toString method

} //end Clock class