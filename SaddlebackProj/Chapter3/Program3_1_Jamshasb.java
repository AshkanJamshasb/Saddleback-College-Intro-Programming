/* Chapter No. 3 - Exercise No.  1
File Name:          Program3_1_Jamshasb.java
Programmer:         Ashkan Jamshasb
Date Last Modified: Jun. 28, 2016

Problem Statement: Creates solution to quadratic equation and tells how many solutions

Overall Plan:
1. Create data types for user input
2. Prompt user to provide their information and store that information as data types
3. Run calculations to find solutions to the roots
4. Run calculations to see if expression is true or false
5. Print the information for the user about the user's input based on the if else statement

Classes needed and Purpose (Input, Processing, Output)
main class - GoodTime

DATA DICTIONARY
---------------
NAME		TYPE			VALUE RANGE		DESCRIPTION
======== 	=========== 	===========		====================
a 			double 			any double 		user input for their first number
b 			double 			any double 		user input for their second number
c 			double 			any double 		user input for their third number
r1 			double			any double 		the first solution to the quadratic equation
r2 			double 			any double 		the second solution to the quadratic equation
scan		Scanner			user input		allows user input
*/
import java.util.Scanner;

public class Program3_1_Jamshasb {
	
	public static void main(String[] args){
		double a, b, c, r1, r2;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a, b, c: (ie. 1.0 3 1)");
		a = scan.nextDouble();
		b = scan.nextDouble();
		c = scan.nextDouble();
		
		r1 = ((-1*b)+(Math.sqrt((Math.pow(b, 2)-4*a*c))))/(2*a);
		r2 = ((-1*b)-(Math.sqrt((Math.pow(b, 2)-4*a*c))))/(2*a);
		
		if((Math.pow(b, 2) - (4 * a * c)) > 0) {	
			System.out.println("The equation has two roots: " + r1 + " and " + r2);
		} else if (Math.pow(b, 2) - (4 * a * c) == 0) {
			System.out.println("The equation has one root: " + r1);
		} else {
			System.out.println("The equation has no real roots");
		}
	}
}
