// CS172
// Car.java
// LAB 9
// Written by: Alejandro Rosas
// 11/07/18
// create java methods
// Input: none
// Output: return values make, model and year of a car object

public class Car {
	
	// instance variables
	private String make;
	private String model;
	private int year;
	
	public Car(String make, String model, int year) {
		
	} //end constructor
	
	public void setMake(String make) {
		this.make = make;
	} //end setMake method
	
	public void setModel(String model) {
		this.model = model;
	} //end setModel method
	
	public void setYear(int year) {
		this.year = year;
	} //end setYear method
	
	public String getMake() {
		return make;
	} //end getMake method
	
	public String getModel() {
		return model;
	} //end getModel method
	
	public int getYear() {
		return year;
	} //end getYear method
	
	public String toString() {
		String result = year + " " + make + " " + model;
		return result;
	} //end toString method
}
