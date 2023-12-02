// Ricky Schafer [email address:tschafer0109@gmail.com ]
	/**
	* Overview: This program prompts the user to enter a 4-digit number and an operator. It then separates the number into two 2-digit numbers and performs the specified operation. If the input is invalid (not a 4-digit number or an invalid operator), it displays an error message.
	* Input: User inputs Numbers/integer and operators.
	* Output: Text Display * Variables: input number, number 1, number 2 and the result of the operation
	* Plan:
	* 1. User runs the program
	* 2. User inputs the information that is asked for
	* 3. Program decides whether the entered number is a valid 4 digit number
	* 4. If the number is valid the program then asks the user to input an operator
	* 5. The program then runs the operator which gives the result
	* 6. The program then checks to make sure that if the operator is division it is not dividing by 0
	* 7. The program then prints the input number the 2 seperate numbers and the result of the equation
	* @version: 1.0 October 2, 2023 
	* @author: Ricky / Schafer
	*/

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a 4-digit number: ");
        int inputNumber = scan.nextInt();

        // Check if the input is a 4-digit number
        if (inputNumber < 1000 || inputNumber > 9999) {
            System.out.println("Error: Please enter a valid 4-digit number.");
            return;
        }

        // Separate the input into two 2-digit numbers
        int num1 = inputNumber / 100;
        int num2 = inputNumber % 100;

        // Get the operator
        System.out.print("Enter the operator (+ for addition, - for subtraction, * for multiplication, / for division): ");
        char operator = scan.next().charAt(0);

        // Perform the calculation based on the operator
        double result;
        if (operator == '+') {
            result = num1 + num2;
        } else if (operator == '-') {
            result = num1 - num2;
        } else if (operator == '*') {
            result = num1 * num2;
        } else if (operator == '/') {
            // Check if num2 is zero to prevent division by zero
            if (num2 == 0) {
                System.out.println("Error: Division by zero is not allowed.");
                return;
            }
            result = num1 / num2;
        } else {
            System.out.println("Error: Invalid operator.");
            return;
        }

        // Print the equation and result
        System.out.println("Equation: " + num1 + " " + operator + " " + num2 + " = " + result);
      
    }
}