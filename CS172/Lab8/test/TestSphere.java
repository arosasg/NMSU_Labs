import java.util.Scanner;

public class TestSphere {

   public static void main ( String args[]x ) {
	
	   // create a Sphere object called earth (tests the constructor)
      Sphere earth = new Sphere();
		
		// print the sphere (tests the toString method 
		// and the default constructor)
		
		System.out.println(earth);
		
		// display the volume of the sphere
		System.out.println("Volume = " + earth.volume() );
		
		// display the surface area of the sphere
		System.out.println("Surface area =  + earth.surfaceArea() );

		
		// display the circumference of the sphere
		System.out.println("Circumference = " + earth.circumference() );

		// now change the radius (tests the mutator)
		// and print the new radius (tests the accessor)
		earth.setRadius(10);
		
		System.out.println("\n\nThe new radius is " + earth.getRadius() );
		
		// display the volume of the sphere
		System.out.println("Volume = " + earth.volume() );
		
		// display the surface area of the sphere
		System.out.println("Surface area = " + earth.surfaceArea() );

		// display the circumference of the sphere
		System.out.println("Circumference = " + earth.circumference() )	
      	
	} // end of main method
} // end of class


