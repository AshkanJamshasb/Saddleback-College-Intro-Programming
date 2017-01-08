/* Chapter No. 4 - Exercise No.  7
File Name:          Program4_7_Jamshasb.java
Programmer:         Ashkan Jamshasb
Date Last Modified: Jun. 30, 2016

Problem Statement: Provide the user with the points of a pentagon that is enclosed in a circle

Overall Plan:
1. Prompt user to enter the radius of the circle
2. Divides the circle into fifths to find the five intersections 
3. Runs calculations to find the x and y coordinates for the points
4. Prints the points for the user

Classes needed and Purpose (Input, Processing, Output)
main class - GoodTime

DATA DICTIONARY
---------------
NAME		TYPE			VALUE RANGE		DESCRIPTION
======== 	=========== 	===========		====================
ang1 		double 			90.0 degrees 	the first angle for the pentagon
ang2 		double 			162.0 degrees 	the second angle for the pentagon
ang3 		double 			234.0 degees 	the third angle for the pentagon
ang4 		double 			306.0 degrees 	the fourth angle for the pentagon
ang5 		double 			378.0 degrees 	the fifth angle for the pentagon
r 			double 			any double 		radius of the circle/pentagon
scan		Scanner			user input		allows user input
xP1 		double 			any double 		the x-coordinate for the first point
xP2			double 			any double 		the x-coordinate for the second point
xP3			double 			any double 		the x-coordinate for the third point
xP4			double 			any double 		the x-coordinate for the fourth point
xP5			double 			any double 		the x-coordinate for the fifth point
yP1			double 			any double 		the y-coordinate for the first point
yP2			double 			any double 		the y-coordinate for the second point
yP3			double 			any double 		the y-coordinate for the third point
yP4			double 			any double 		the y-coordinate for the fourth point
yP5			double 			any double 		the y-coordinate for the fifth point
*/
import java.util.Scanner;

public class Program4_7_Jamshasb {

	public static void main(String[] args){

		Scanner scan = new Scanner(System.in);
		double xP1, yP1, xP2, yP2, xP3, yP3, xP4, yP4, xP5, yP5, ang1, ang2, ang3, ang4, ang5;

		System.out.print("Enter the radius of the bounding circle: ");
		double r = scan.nextDouble();

		ang1 = Math.toRadians((0.0/5)*360+18); //add 18 so that the P2 is at 90 degrees
		ang2 = Math.toRadians((1.0/5)*360+18);
		ang3 = Math.toRadians((2.0/5)*360+18);
		ang4 = Math.toRadians((3.0/5)*360+18);
		ang5 = Math.toRadians((4.0/5)*360+18);

		xP1 = r*Math.cos(ang1);
		yP1 = r*Math.sin(ang1);
		xP2 = r*Math.cos(ang2);
		yP2 = r*Math.sin(ang2);
		xP3 = r*Math.cos(ang3);
		yP3 = r*Math.sin(ang3);
		xP4 = r*Math.cos(ang4);
		yP4 = r*Math.sin(ang4);
		xP5 = r*Math.cos(ang5);
		yP5 = r*Math.sin(ang5);



		System.out.printf("(%4.2f, %4.2f) \n", xP1, yP1);
		System.out.printf("(%4.2f, %4.2f) \n", xP2, yP2);
		System.out.printf("(%4.2f, %4.2f) \n", xP3, yP3);
		System.out.printf("(%4.2f, %4.2f) \n", xP4, yP4);
		System.out.printf("(%4.2f, %4.2f) \n", xP5, yP5);
//		Trouble shooting code
/*
		System.out.println("angle1 in degrees: " + Math.toDegrees(ang1) + " cos: " + Math.cos(ang1));
		System.out.println("angle2 in degrees: " + Math.toDegrees(ang2) + " cos: " + Math.cos(ang2));
		System.out.println("angle3 in degrees: " + Math.toDegrees(ang3) + " cos: " + Math.cos(ang3));
		System.out.println("angle4 in degrees: " + Math.toDegrees(ang4) + " cos: " + Math.cos(ang4));
		System.out.println("angle5 in degrees: " + Math.toDegrees(ang5) + " cos: " + Math.cos(ang5));
*/
	}
}