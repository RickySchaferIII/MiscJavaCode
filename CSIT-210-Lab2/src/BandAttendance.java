public class BandAttendance {
	// Ricky Schafer [email address:tschafer0109@gmail.com ]
	/**
	* Overview: Tracks attendance numbers for various bands
	* Input: None
	* Output: Text Display * Variables: LA and DC numbers for 5 artists and total numbers
	* Plan:
	* 1. User runs the program
	* 2. The program displays the various totals of attendance in DC and LA as well as the total of LA and Dc for various artists
	*
	* @version: 1.0 September 09, 2023 
	* @author: Ricky / Schafer
	*/

    public static void main(String[] args) {
        int rhiannaDC = 278000;
        int rhiannaLA = 458000;
        int rhiannaTotal = rhiannaDC + rhiannaLA;

        int eminemDC = 217000;
        int eminemLA = 563000;
        int eminemTotal = eminemDC + eminemLA;

        int yungGravyDC = 87000;
        int yungGravyLA = 267000;
        int yungGravyTotal = yungGravyDC + yungGravyLA;

        int travisScottDC = 135000;
        int travisScottLA = 317000;
        int travisScottTotal = travisScottDC + travisScottLA;

        int taylorSwiftDC = 345000;
        int taylorSwiftLA = 746000;
        int taylorSwiftTotal = taylorSwiftDC + taylorSwiftLA;


        System.out.println("///////////////////\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\");
        System.out.println("|=\t\t\tBand Attendance\t\t\t=|");
        System.out.println("\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\///////////////////\n");
        System.out.println("  Name\t\tD.C\t\tL.A\t\tTotal  ");
        System.out.println(" ------\t\t-----\t\t-----\t\t------- ");
        System.out.println(" Rihanna\t" + rhiannaDC + "\t\t" + rhiannaLA + "\t\t" + rhiannaTotal);
        System.out.println(" Eminem\t\t" + eminemDC + "\t\t" + eminemLA + "\t\t" + eminemTotal);
        System.out.println(" Yung Gravy\t" + yungGravyDC + "\t\t" + yungGravyLA + "\t\t" + yungGravyTotal);
        System.out.println(" Travis Scott\t" + travisScottDC + "\t\t" + travisScottLA + "\t\t" + travisScottTotal);
        System.out.println(" Taylor Swift\t" + taylorSwiftDC + "\t\t" + taylorSwiftLA + "\t\t" + taylorSwiftTotal);
    }
}
