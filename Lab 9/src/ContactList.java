// Ricky Schafer [email address:tschafer0109@gmail.com ]
	/**
	* Overview:User enters however many contacts they want and then they get asked to search for a specific contact and the program then prints out whether or not that contact is in the array
	* Input: User inputs first name, last name, and zipcode of the contacts they want
	* Output: Text Display * Variables: arrayIn, newContact, userFirstname, userLastName, userZipcode, userInput, counter, userZipCodeString, contactBook, finLastName, and foundContact
	* Plan:
	* 1. User runs the program
	* 2. User inputs however many contacts they want
	* 3. Program then adds all of the contacts into the array
	* 4. Program then asks the user the last name they want to look up
	* 5. Program then checks to see if that last name is in the array
	* 6. If the name is not in the array the program says "Contact not found"
	* 7. If the name is in the array the program prints out the first and last name and the zipcode
	* 8. The program then prints out this information 
	* @version: 1.0  November 12, 2023 
	* @author: Ricky / Schafer
	*/

import java.util.Scanner;
public class ContactList {

public static Contact[] expandArray(Contact[] arrayIn) {
	Contact[] newContact = new Contact[arrayIn.length+1];
	for(int i = 0; i < arrayIn.length; i++) {
		newContact[i] = arrayIn[i];
	}
	return newContact; 
}
	
	public static void main(String[] args) {
		String userFirstName = "";
		String userLastName = "";
		int userZipCode;
		String userInput = "";
		int counter = 0;
		String userZipCodeString = "";
		
		
		
		Scanner scan = new Scanner(System.in);
		Contact[] contactBook = new Contact[1];
		while(!userInput.equals("n")) {
			System.out.print("Please Enter a first name: ");
			userFirstName = scan.nextLine();
			userFirstName = userFirstName.substring(0,1).toUpperCase()+ userFirstName.substring(1).toLowerCase();
			System.out.print("Please Enter the Last name: ");
			userLastName = scan.nextLine();
			userLastName = userLastName.substring(0,1).toUpperCase()+ userLastName.substring(1).toLowerCase();
			System.out.print("Please Enter the Zip Code: ");
			userZipCodeString = scan.nextLine();
			userZipCode = Integer.parseInt(userZipCodeString);
			Contact newContact = new Contact(userFirstName, userLastName, userZipCode);
			
			if(counter>=contactBook.length) {
				contactBook = expandArray(contactBook);
			}
			
			contactBook[counter] = newContact;
			counter++;
			System.out.print("Would you like to continue? (y/n) ");
			userInput = scan.nextLine();
			userInput = userInput.toLowerCase();
			
		}
		
		System.out.print("Please enter the last name you would like to find: ");
		String findLastName = scan.nextLine();
		findLastName = findLastName.substring(0,1).toUpperCase()+ findLastName.substring(1).toLowerCase();
		boolean foundContact = false;
		
		for (int i = 0; i<contactBook.length; i++) {
			Contact contact = contactBook[i];
			if(findLastName.equals(contact.getLastName())) {
				System.out.println(contact.toString());
				foundContact = true;
			}
			
		}
		if(foundContact == false) {
			System.out.println("Not found.");
			
		}
		scan.close();
		

	}

}
