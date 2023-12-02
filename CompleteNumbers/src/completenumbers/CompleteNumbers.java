// Ricky Schafer [email address:tschafer0109@gmail.com ]
	/**
	* Overview: This program tells the user how many and what numbers are complete numbers in the range of 1-30,000
	* Input:N/a
	* Output: Text Display * Variables: total, number, completeNumbers, and i
	* Plan:
	* 1. User runs the program
	* 2. The program then runs through the range 1-30,000
	* 3. The program then decides whether this is a complete number by seeing if the numbers divisors equal the number
	* 4. If that is true it then adds it to the running counter
	* 5. The program then displays all of the complete numbers and how many complete numbers
	* @version: 1.0 March 14, 2023 
	* @author: Ricky / Schafer
	*/
package completenumbers;


public class CompleteNumbers {
	
	public static void main(String[] args) {
		int completeNumbers = 0; //Counts how many numbers are complete numbers
		for(int i=1; i<=30000; i++) { //Looks at every number between 1 and 30,000
			if(isCompleteNumber(i)) {
				completeNumbers++; 
				System.out.println(i + " is a complete number.");//Tells the user which numbers are complete numbers
			}
		}
		System.out.println("There are " +completeNumbers+" complete numbers in the range 1-30000.");//Tells the user how many complete numbers are between the given range
	}
	
	public static boolean isCompleteNumber(int number) {//Creates a boolean to figure out whether a number is a complete number or not
		int total = 0;
		for (int i=1; i<number; i++) {//Goes until the given number
			if(number % i ==0) {// checks whether the number is evenly divisible by i
				total +=i; //if the number is evenly divisible it is added to total
			}	
		}
		return number==total;
	}

}
