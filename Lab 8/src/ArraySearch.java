// Ricky Schafer [email address:tschafer0109@gmail.com ]
	/**
	* Overview:User enters as many numbers as they want and the program then searches the array for how many occurences there are of a single number
	* Input: User inputs #'s and the number they want to track for occurences
	* Output: Text Display * Variables: arrayIn, newArray, counter, arrayCounter, targetNum, userNumber, and userInput
	* Plan:
	* 1. User runs the program
	* 2. User inputs however many numbers they want and then types done
	* 3. Program then adds all of the users numbers to the array
	* 4. Program then prints out the array for the user
	* 5. Program then asks the user what number the user wants to check
	* 6. User inputs the number
	* 7. Program searches the array and returns back to the user how ever many times the number is found in the array
	* 8. The program then prints out this information 
	* @version: 1.0 November 6, 2023 
	* @author: Ricky / Schafer
	*/

import java.util.Scanner;
public class ArraySearch {
	
 public	static int[] expandArray(int[] arrayIn) {
	 int[] newArray = new int[arrayIn.length*2];
	 for(int i = 0; i < arrayIn.length; i++) {
		 newArray[i] = arrayIn[i];
	 }
	 return newArray; 
 }
	
	
	public static void main(String[] args) {
		String userInput = "";
		int counter = 0;
		int targetNum;
		int arrayCounter = 0;
		int userNumber = 0;
	
	
		
		Scanner scan = new Scanner(System.in);
		int[] randomNums = new int[10];
		while(!userInput.equals("done")) {
			System.out.print("Please enter a number or type \"done\": ");
			userInput = scan.nextLine();
				if(userInput.equals("done")) {
					break;
	}
		userNumber = Integer.parseInt(userInput);

		if(counter>=randomNums.length) {
			randomNums = expandArray(randomNums);
	}
		randomNums[counter] = userNumber;
		counter++;	
		
}
		for(int i = 0; i<randomNums.length; i++) {
			System.out.print(randomNums[i] + ", ");
}
		System.out.print("What Number would you like to count the occurences of? ");
		targetNum = scan.nextInt();
		for(int i = 0; i<randomNums.length; i++) {
			if(userNumber == targetNum) {
				arrayCounter++;
				
			}
		
		}
		System.out.println("There are " + arrayCounter + " occurences of " + targetNum + " in the array.");
		scan.close();
	}
}
