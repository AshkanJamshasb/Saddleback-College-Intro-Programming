/* Chapter No. 2 - Exercise No.  23
File Name:          Program2_23_Jamshasb.java
Programmer:         Ashkan Jamshasb
Date Last Modified: Jun. 28, 2016

Problem Statement: Calculates the cost of how much it costs to drive a certain distance.

Overall Plan:
1. Create data types for user input
2. Prompt user to provide their information and store that information as data types
3. Run calculations to find the price it costs to go a certain distance.
4. Tell user the price.

Classes needed and Purpose (Input, Processing, Output)
main class - GoodTime

DATA DICTIONARY
---------------
NAME		TYPE			VALUE RANGE		DESCRIPTION
======== 	=========== 	===========		====================
cost 		double 			any double 		the cost of driving
distance 	double 			any double 		the distance the user is driving
mperG 		double 			any double 		the miles per gallon
pperG 		double 			any double 		the price per gallon
scan		Scanner			user input		allows user input
*/
import java.util.Scanner;

public class Program2_23_Jamshasb {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double distance, mperG, pperG, cost;
		System.out.print("Enter the driving distance in miles: ");
		distance = scan.nextDouble();
		System.out.print("Enter miles per gallon: ");
		mperG = scan.nextDouble();
		System.out.print("Enter price per gallon: $");
		pperG = scan.nextDouble();
		
		cost = distance*(pperG/mperG);
		cost = (int)(cost*100);
		cost /= 100;
		System.out.println("The cost of driving is $" + cost);
	}
}
