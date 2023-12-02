// Ricky Schafer [email address:tschafer0109@gmail.com ]
	/**
	* Overview: This program allows a user to input the radius for a specific Sphere and calculate the Volume and Surface Area and print out the information such as Surface area, Volume, Sphere ID, and Radius
	* Input: User inputs Radius.
	* Output: Text Display * Variables: Radius1, Radius2, Radius3, sphere1, sphere2, and sphere3
	* Plan:
	* 1. User runs the program
	* 2. User inputs the information that is asked for
	* 3. Program Prints out the Id and Radius
	* 4. Program then Calculates the Volume and Surface Area of the Sphere
	* 5. Program then prints out the Volume and Surface Area
	* 6. The program then repeats steps 2-5 2 more times for s2 and s3
	* @version: 1.0 March 21, 2023 
	* @author: Ricky / Schafer
	*/

import java.util.Scanner;

public class SphereDemo {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		//Collects information for s0 and prints out the given information
		System.out.print("Please input the radius for Sphere S0: ");
		double radius1 = scan.nextDouble();
		Sphere sphere1 = new Sphere(radius1, "s0");
		System.out.println(sphere1.toString());
		System.out.println("Surface Area of the Sphere: " + sphere1.calculateSA());
		System.out.println("Volume Of the Sphere: " + sphere1.calculateVolume());
		
		//Collects information for s2 and prints out the given information
		System.out.print("Please input the radius for Sphere S2: ");
		double radius2 = scan.nextDouble();
		Sphere sphere2 = new Sphere(radius2, "s2");
		System.out.println(sphere2.toString());
		System.out.println("Surface Area of the Sphere: " + sphere2.calculateSA());
		System.out.println("Volume Of the Sphere: " + sphere2.calculateVolume());
		
		//Collects information for s3 and prints out the given information
		System.out.print("Please input the radius for Sphere S3: ");
		double radius3 = scan.nextDouble();
		Sphere sphere3 = new Sphere(radius3, "s3");
		System.out.println(sphere3.toString());
		System.out.println("Surface Area of the Sphere: " + sphere3.calculateSA());
		System.out.println("Volume Of the Sphere: " + sphere3.calculateVolume());
			
		scan.close();	
	}

}
