// Ricky Schafer [email address:tschafer0109@gmail.com ]
	/**
	* Overview: This program takes a users input for a month and a year and uses the Gregorain calendar to decide how many days are in that month, this takes into account leap years
	* Input: User inputs month and year.
	* Output: Text Display * Variables: numberMonth, year, and leap
	* Plan:
	* 1. User runs the program
	* 2. User inputs the information that is asked for
	* 3. The program decides whether the inputed year is a leap year based on what it is divisible by
	* 4. The program then uses the month to print text specific to the Month and year and how many days are in that month based on whether it is a leap year or not
	* @version: 1.0 March 7, 2023 
	* @author: Ricky / Schafer
	*/

import java.util.Scanner;


public class Calender {
	
	public static void main(String[] args) {
		
	    int numberMonth;
	    int year;
	    
	    //Collects the input for the month and year
		Scanner scan = new Scanner(System.in) ;
		
		//We use print instead of println so the input is right next to the colon
		System.out.print("Please enter a month using its numeric form: ");
		numberMonth = scan.nextInt();
		
		System.out.print("Please enter a year: ");
		year = scan.nextInt();
		
		boolean leap = false; // We initialize this to false because most years aren't leap years
							  // This also saves on logic because if we don't set leap to true,
							  // it stays false, saving us lines of code.
		
		if(year % 4 == 0) { // If the year isn't divisible by 4 it definitely isn't a leap year
			if(year % 100 == 0) { // Years like 1900 aren't leap years because they're not divisible by 400
				if(year % 400 == 0) { // Years like 2000 however are, because they're divisible by 400
					leap = true;
				}
			} else {
				leap = true;
			}
		}
				
		switch(numberMonth) {
		case 1: 
			System.out.println("January in the year " + year + " is 31 days");
			break;
		case 2: 
			if(leap) {
				System.out.println("Feburary in the year " + year + " is 29 days");
			} else {
				System.out.println("Feburary in the year " + year + " is 28 days"); 
			}
			break;
		case 3: 
			System.out.println("March in the year " + year + " is 31 days");
			break;
		case 4: 
			System.out.println("April in the year " + year + " is 30 days");
			break;
		case 5: 
			System.out.println("May in the year " + year + " is 31 days");
			break;
		case 6: 
			System.out.println("June in the year " + year + " is 30 days");
			break;
		case 7: 
			System.out.println("July in the year " + year + " is 31 days");
			break;
		case 8: 
			System.out.println("August in the year " + year + " is 31 days");
			break;
		case 9: 
			System.out.println("September in the year " + year + " is 30 days");
			break;
		case 10: 
			System.out.println("October in the year " + year + " is 31 days");
			break;
		case 11: 
			System.out.println("November in the year " + year + " is 30 days");
			break;
		case 12: 
			System.out.println("December in the year " + year + " is 31 days");
			break;
		}
		
	}

}
