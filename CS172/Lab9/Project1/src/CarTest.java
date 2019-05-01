// CS172
// CarTest.java
// LAB 9
// Written by: Alejandro Rosas
// 11/07/18
// test java methods
// Input: make, model and year
// Output: return values make, model and year of a car object

public class CarTest {
	
	public static void main (String[] args) {
		
		// create object 
		Car myCar = new Car(null, null, 0 );
		
		// testing mutator and accessor of make
		myCar.setMake("Ford");
		System.out.println(myCar.getMake());
		
		// testing mutator and accessor of model
		myCar.setModel("Mustang");
		System.out.println(myCar.getModel());
		
		// testing mutator and accessor of year
		myCar.setYear(2015);
		System.out.println(myCar.getYear());
		
		// test toString method
		System.out.println(myCar);
		
	} //end main
} //end CarTest
