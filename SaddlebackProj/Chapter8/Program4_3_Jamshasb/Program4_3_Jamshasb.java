/* Chapter No. 4 - Exercise No.  3
File Name:          Program4_3_Jamshasb.java
Programmer:         Ashkan Jamshasb
Date Last Modified: Aug. 2, 2016

Problem Statement: To test fuel efficiencies with different trips

Overall Plan:
1. Create a class that contains a method that can calculate the fuel consumed from miles driven and the fuel efficiency fo the car
2. Call the method in the main to create an object in which we can use to set values
3. Go through a for loop to check certain values and runs through a series of checks to see if there are any negative numbers
4. Prints the results to the user

Classes needed and Purpose (Input, Processing, Output)
Odometer - to see the distance traveled and to check the fuel consumed for a specific trip

DATA DICTIONARY
---------------
NAME		TYPE			VALUE RANGE		DESCRIPTION
======== 	=========== 	===========		====================
car 		Odometer 	 	an object 		the pointer for a class
driven 		double 			any double 		the miles that the car has driven
fuelEff 	double 			any double 		the fuel efficiency of the car
i 			int 			0-3				the variable for the condition for the for loop
scan 		Scanner 		user input 		allows user input
*/
import java.util.Scanner;
public class Program4_3_Jamshasb {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		double driven, fuelEff;

		Odometer car = new Odometer();

		for (int i = 0; i < 3; i++) {
			do {
				System.out.print("Enter fuel efficiency (miles/gallon): ");
				fuelEff = scan.nextInt();
				car.fuelEfficiency = fuelEff;
				if (fuelEff <= 0) {
					System.out.println("**ERROR** Enter a positive number");
				} else {
					break;
				}
			} while (true);
			do {
				System.out.print("Enter trip length in miles: ");
				driven = scan.nextInt();
				car.odometerTotal(driven);
				if (driven < 0) {
					System.out.print("**ERROR** Enter a positive number");
				} else {
					break;
				}
			} while (true);
			System.out.println("The fuel consumed from the drive is " + car.fuelConsumed(fuelEff, driven));
			car.resetMiles();
		}
		System.out.println("The total miles driven is " + car.odometerTotal(0) + " miles.");
	}
}

/* Chapter No. 4 - Exercise No.  3
File Name:          Program4_3_Jamshasb.java
Programmer:         Ashkan Jamshasb
Date Last Modified: Aug. 2, 2016

Problem Statement: To test fuel efficiencies with different trips

Overall Plan:
1. Create a class that contains a method that can calculate the fuel consumed from miles driven and the fuel efficiency fo the car
2. Call the method in the main to create an object in which we can use to set values
3. Go through a for loop to check certain values and runs through a series of checks to see if there are any negative numbers
4. Prints the results to the user

Classes needed and Purpose (Input, Processing, Output)
Odometer - to see the distance traveled and to check the fuel consumed for a specific trip

DATA DICTIONARY
---------------
NAME		TYPE			VALUE RANGE		DESCRIPTION
======== 	=========== 	===========		====================
fuelEfficiency	 doube 		any double 		the fuel efficiency of the car
milesDriven 	double 		any + double 	the fuel efficiency of the car
totalMiles 	double 			any + double 	the total miles the car has driven
*/
class Odometer {
	private double milesDriven = 0, totalMiles = 0;
	public double fuelEfficiency;

	/*
		Precondition: N/A
		Postcondition: milesDriven equals 0
	*/
	void resetMiles() {
		milesDriven = 0;
	}

	/*
		Precondition: that moreMiles is valid double
		Postcondition: the total miles that were driven
	*/
	double odometerTotal(double moreMiles) {
		return totalMiles += moreMiles;
	}

	/*
		Precondition: fuelEff and driven are both positive intergers
		Postcondition: the value of driven/fuelEff
	*/
	double fuelConsumed(double fuelEff, double driven) {
		return driven/fuelEff;
	}
}






	