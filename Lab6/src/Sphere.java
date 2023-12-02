// Ricky Schafer [email address:tschafer0109@gmail.com ]
	/**
	* Overview: This program allows a user to input the radius for a specific Sphere and calculate the Volume and Surface Area and print out the information such as Surface area, Volume, Sphere ID, and Radius
	* Input: User inputs Radius.
	* Output: Text Display * Variables: Radius and Id
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


class Sphere {
	//Instance Variables
	private double radius;
	private String ID;
	
	
	//Constructor
	public Sphere(double radiusIn, String IDin) {
		radius = radiusIn;
		ID = IDin;
	}
	
	
	//Getter methods
	public double getRadius() {
		return radius;
	}
	
	public String getID() {
		return ID;
	}
	
	//Setter methods
	public void setRadius(double newRadius) {
		radius = newRadius;
}
	public void setID(String newID) {
		ID = newID;
	}
	
	//Method for Volume
	public double calculateVolume() {
		double radiusCubed = Math.pow(radius, 3.0);
		double volume = radiusCubed * Math.PI;
		double fraction = 4.0 / 3.0;
		volume = fraction * volume;
		return volume;
	}
	
	//Method for Surface Area
	public double calculateSA() {
		double radiusSquared = Math.pow(radius, 2.0);
		double fourPi = Math.PI * 4;
		double surfaceArea = fourPi * radiusSquared;
		return surfaceArea;
		
	}
	
	//toString method to print out given information
	public String toString() {
		return "ID: " + ID
				+ " Radius: " + radius;
	}
	
}



