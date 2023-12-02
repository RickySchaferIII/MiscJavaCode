// Ricky Schafer [email address:tschafer0109@gmail.com ]
	/**
	* Overview:User enters however many contacts they want and then they get asked to search for a specific contact and the program then prints out whether or not that contact is in the array
	* Input: User inputs first name, last name, and zipcode of the contacts they want
	* Output: Text Display * Variables: firstName, lastName, zipCode, getFirstName, getLastName, getZipCode, setFirstName, setLastName, setZipCode, newFirstName, newLastName, newZipCode, firstNameIn, lastNameIn, and zipCodeIn
	* Plan:
	* 1. User runs the program
	* 2. User inputs however many contacts they want
	* 3. Program then adds all of the contacts into the array
	* 4. Program then asks the user the last name they want to look up
	* 5. Program then checks to see if that last name is in the array
	* 6. If the name is not in the array the program says "Contact not found"
	* 7. If the name is in the array the program prints out the first and last name and the zipcode
	* 8. The program then prints out this information 
	* @version: 1.0 November 12, 2023 
	* @author: Ricky / Schafer
	*/
class Contact {
	//Instance Variables
	private String firstName;
	private String lastName;
	private int zipCode;
	
	
	//Constructor
	public Contact(String firstNameIn, String lastNameIn, int zipCodeIn) {
		firstName = firstNameIn;
		lastName = lastNameIn;
		zipCode = zipCodeIn;
	}
	
	
	//Getter methods
	public String getFirstName() {
		return firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public int getZipCode() {
		return zipCode;
	}
	
	
	//Setter methods
	public void setFirstName(String newFirstName) {
		firstName = newFirstName;
	}
	
	public void setLastName(String newLastName) {
		lastName = newLastName;
	}
	
	public void setZipCode(int newZipCode) {
		zipCode = newZipCode;
	}

	
	public String toString() {
		return ("First Name: " + firstName + " Last Name: " + lastName + " Zip Code: " + zipCode);
	}
}
