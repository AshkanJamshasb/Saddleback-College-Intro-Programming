/* Chapter No. 3 - Exercise No.  29
File Name:          Program3_29_Jamshasb.java
Programmer:         Ashkan Jamshasb
Date Last Modified: Jun. 30, 2016

Problem Statement: To see the relationship between two cirlce's positions.

Overall Plan:
1. Prompt user to provide information about the circle
2. Use that information to determine the distance between the two circle's radius'.
3. Uses the distance to determine position in realtionship to other circle.
4. Print's the position to the user.

Classes needed and Purpose (Input, Processing, Output)
main class - GoodTime

DATA DICTIONARY
---------------
NAME		TYPE			VALUE RANGE		DESCRIPTION
======== 	=========== 	===========		====================
distance 	double 			any double 		the distance between the centers of the two circles
radOne 		double 			any double 		the radius of the first circle
radTwo 		double 			any double 		the radius of the second cirlce
scan		Scanner			user input		allows user input
xCordOne 	double 			any double 		the x-coordinate of the first circle
xCordTwo 	double 			any double 		the x-coordinate of the second circle
yCordOne 	double 			any double 		the y-coordinate of the first circle
yCordTwo 	double 			any double 		the y-coordinate of the second circle
*/
import java.util.Scanner;

public class Program3_29_Jamshasb {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		double xCordOne, yCordOne, radOne, xCordTwo, yCordTwo, radTwo, distance;

		System.out.print("Enter circle 1's center x-, y-coordinates, and radius. Respectively: ");
		xCordOne = scan.nextDouble();
		yCordOne = scan.nextDouble();
		radOne   = scan.nextDouble();
		System.out.print("Enter circle 2's center x-, y-coordinates, and radius. Respectively: ");
		xCordTwo = scan.nextDouble();
		yCordTwo = scan.nextDouble();
		radTwo   = scan.nextDouble();

		distance = Math.sqrt(Math.pow((xCordTwo-xCordOne),2)+Math.pow((yCordTwo-yCordOne),2));

		if (distance<=Math.abs(radOne-radTwo)) {
			System.out.println("Circle 2 is inside circle 1.");
		} else if (distance<=radOne+radTwo) {
			System.out.println("Cirlce 2 overlaps circle 1.");
		} else {
			System.out.println("Circle 2 does not overlap circle 1.");
		}
//		System.out.print("xCordOne: " + xCordOne + ", yCordOne: " + yCordOne + ", radOne: " + radOne +  ", xCordTwo: " + xCordTwo + ", yCordTwo: " + yCordTwo + ", radTwo: " + radTwo);

	}
}