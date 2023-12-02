import java.util.Scanner;
public class AverageAge
{
	// Ricky Schafer [email address:tschafer0109@gmail.com ]
		/**
		* Overview: Asks the user for 3 ages then takes the average age
		* Input: User ages
		* Output: Text Display * Variables: val1, val2, val3 and average
		* Plan:
		* 1. User runs the program
		* 2. The program  requests 3 ages to be input
		* 3. The program then takes the averages of those 3 ages
		* 4. The program displays/outputs the average of the 3 ages
		*
		* @version: 1.0 September 09, 2023 
		* @author: Ricky / Schafer
		*/ 
	public static void main(String[] args)
    {
        int val1, val2, val3;
        double average;
        Scanner scan = new Scanner(System.in) ;

        // get three ages from the user
        System.out.println("Enter three ages and I will compute their average.");
        System.out.print("Enter the first age: ");
        val1 = scan.nextInt();
        System.out.print("Enter the second age: ");
        val2 = scan.nextInt();
        System.out.print("Enter the third age: ");
        val3 = scan.nextInt();

        //compute the average
        average = (val1 + val2 + val3) / 3.0;

        //print the average (note decimals in the display)
        System.out.println("The average is " + average + ".");
        scan.close();
    }
}
