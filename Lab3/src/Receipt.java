// Ricky Schafer [email address:tschafer0109@gmail.com ]
	/**
	* Overview: This program creates a receipt that calculates oz. to pounds and how much the item costs based off of pounds and price per pound prints the users name and generates a random 2 digit number
	* Input: User inputs name and weight in oz.
	* Output: Text Display * Variables: confirmationCode, userName, weightinOz, weightinLb, and totalPrice
	* Plan:
	* 1. User runs the program
	* 2. User inputs the information that is asked for
	* 3. The program then generates a random number
	* 4. The program then calculates oz. to lbs.
	* 5. The program then calculates how much the item costs based off of lbs and price per pound
	* 6. The program then displays this information to the user 
	*
	* @version: 1.0 September 18, 2023 
	* @author: Ricky / Schafer
	*/
import java.util.Scanner;
import java.util.Random;
import java.text.DecimalFormat;
import java.text.NumberFormat;


public class Receipt {
	
	public static void main (String[] args)
	{   
		
		//All of my variables
		int confirmationCode;
		String userName;
		double weightInOz;
		double pricePerPound;
		double weightInLb;
		double totalPrice;
		
		
		DecimalFormat fmt = new DecimalFormat("0.##");
		NumberFormat fmt1 = NumberFormat.getCurrencyInstance();
		
		Random generator = new Random();
		//Creates a random number which will be used later in the program.
		confirmationCode = generator.nextInt(90) + 10;

		
		
		Scanner scan = new Scanner(System.in) ;
		
		System.out.println("Please enter your first and last name: ");
		//Collects the users name and changes the letter to uppercase and replace the spaces with a dot, this will be used later in the program.
		userName = scan.nextLine();
		userName = userName.replace (' ', '.');
		userName = userName.toUpperCase();
		
		System.out.println("Enter the item's weight in ounces: ");
		//Collects the weight of the item in ounces
		weightInOz = scan.nextDouble();
		System.out.println("Enter the price per pound: ");
		//Collects the price per pound
		pricePerPound = scan.nextDouble();
		scan.close();
		//Calculates how many pounds are in the item
		weightInLb = weightInOz/16.0;
		//Calculates the overall  price
		totalPrice = weightInLb * pricePerPound;
		//Prints out all the information on the receipt 
		System.out.println("\\\\\\ Welcome " + userName + " ///");
		System.out.println("==============================");
		System.out.println(" Unit Price: " + fmt1.format(pricePerPound) + " per pound");
		System.out.println(" Weight:     " + fmt.format(weightInLb) + " pounds");
		System.out.println("==============================");
		System.out.println(" Total:      " + fmt1.format(totalPrice));
		System.out.println("");
		System.out.println(" Confirmation Code: " + confirmationCode);
		
		
		
				
		
		
		
		
		
		
		
		
		 
	}
}
