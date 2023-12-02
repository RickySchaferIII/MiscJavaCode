// Ricky Schafer [email address:tschafer0109@gmail.com ]
	/**
	* Overview: This program takes the number of cards the user wants to draw and randomly draws that amount of cards
	* Input: User inputs # of cards they want to draw.
	* Output: Text Display * Variables: numberOfCards and card
	* Plan:
	* 1. User runs the program
	* 2. User inputs the information that is asked for
	* 3. Program then randomly picks 2 numbers which are set to suite and facevalue
	* 4. Program then uses the switch statement to decide what suite and facevalue to print out
	* 5. Program then prints out the suite and the facevalue
	* @version: 1.0 October 23, 2023 
	* @author: Ricky / Schafer
	*/
import java.util.Scanner;
public class PlayCards {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Please input the number of cards you would like to draw: ");
		int numberofCards = scan.nextInt();
		
		for(int i = 0; i<numberofCards; i++) {
			Card card = new Card();
			System.out.println(card.toString());
			
		}
		scan.close();
		
	}


}
