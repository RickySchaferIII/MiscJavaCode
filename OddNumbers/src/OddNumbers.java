// Ricky Schafer [email address:tschafer0109@gmail.com ]
	/**
	* Overview: This program allows a user to input odd numbers and add them all together
	* Input: User inputs Numbers/integers.
	* Output: Text Display * Variables: total and number
	* Plan:
	* 1. User runs the program
	* 2. User inputs the information that is asked for
	* 3. Program decieds whether the entered number is odd or even
	* 4. If the number is odd then the program allows the user to keep inputting numbers and keeps calculating the total
	* 5. If the number is Even the program terminates and prints out the total number of the odd integers 
	* @version: 1.0 March 14, 2023 
	* @author: Ricky / Schafer
	*/
import java.util.Scanner;

public class OddNumbers {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int total = 0;
		// Takes the users input of odd number
		System.out.print("Enter odd number: ");
		int number = scan.nextInt();
		//Loop that allows the user to keep putting odd numbers in
		while (number % 2 == 1) {
			//adds the entered odd number to the total
			total += number;
			System.out.print("Enter odd number: ");
			number = scan.nextInt();
			
		}
		scan.close();
		System.out.println("Sum of odd number: " + total);
				
		
				
				
	}

}
