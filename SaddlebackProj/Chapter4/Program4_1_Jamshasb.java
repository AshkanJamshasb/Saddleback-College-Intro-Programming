/* Chapter No. 4 - Exercise No.  1
File Name:          Program4_1_Jamshasb.java
Programmer:         Ashkan Jamshasb
Date Last Modified: Jun. 30, 2016

Problem Statement: User enters a value for the radius and computer computes and prints the area.

Overall Plan:
1. Prompt user to provide the distance between the center of the pentagon to its vertex
2. Run calculations to find the length of a side and to find the area.
3. Typecasts the area to round to two decimal places
4. Prints the area of the pentafon to the user

Classes needed and Purpose (Input, Processing, Output)
main class - GoodTime

DATA DICTIONARY
---------------
NAME		TYPE			VALUE RANGE		DESCRIPTION
======== 	=========== 	===========		====================
area		double			any double		area of the pentagon
r 			double 			any double 		the radius of the pentagon
s 			double 			any double 		the side of one pentagon
scan		Scanner			user input		allows user input
*/
import java.util.Scanner;

public class Program4_1_Jamshasb {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the length from the center to the vertex: ");
		double r = scan.nextDouble();
		double s = 2*r*Math.sin(Math.PI/5);
		double area = (5 * Math.pow(s,2))/(4 * Math.tan(Math.PI/5));
		area = (int)(area * 100);
		area = area/100;
		System.out.println("The area of the pentagon is " + area);
	}
}