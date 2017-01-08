/* Chapter No. 7 - Exercise No.  25
File Name:          Program7_25_Jamshasb.java
Programmer:         Ashkan Jamshasb
Date Last Modified: Jul. 27, 2016

Problem Statement: To create solutions to quadratic equation and tells how many solutions

Overall Plan:
1. Create data types for user input
2. Prompt user to provide their information and store that information as data types
3. Uses a mehtod to run calculations to find solutions to the roots
4. Run calculations to see if expression is true or false
5. Print the information for the user about the user's input based on the if else statement

Classes needed and Purpose (Input, Processing, Output)
main class - GoodTime

DATA DICTIONARY
---------------
NAME		TYPE			VALUE RANGE		DESCRIPTION
======== 	=========== 	===========		====================
eqn[] 		double/array	any doubles		the numbrs for a, b, and c in the qudratic equation
i 			int 			1-3 			the roots for the quaratic equation		
roots[]		double/array	any doubles		the roots for the equation
scan 		Scanner 		user input 		allows user input
*/
import java.util.Scanner;

public class Program7_25_Jamshasb {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		double eqn[] = new double[3];
		double roots[] = new double[2];

		for (int i = 0; i < 3; i++) {
			System.out.print("Enter " + (char)(97 + i) + ": ");
			eqn[i] = scan.nextDouble();
		}

		roots[0] = ((-1*eqn[1])+(Math.sqrt((Math.pow(eqn[1], 2)-4*eqn[0]*eqn[2]))))/(2*eqn[0]);
		roots[1] = ((-1*eqn[1])-(Math.sqrt((Math.pow(eqn[1], 2)-4*eqn[0]*eqn[2]))))/(2*eqn[0]);

		System.out.print("The equation has " + solveQuadratic(eqn, roots) + " root");
		if (solveQuadratic(eqn, roots) == 2) {
			System.out.println("s: " + roots[0] + ", " + roots[1]);
		} else if (solveQuadratic(eqn, roots) == 1) {
			System.out.println(": " + roots[0]);
		} else {
			System.out.println(".");
		}
	}

	/************************************************/
	/* Name: solveQuadratic(double[] eqn, double[] roots)*/
	/************************************************/
	/* Purpose: to figure out how many roots there are*/
	/* Parameters: 									*/
	/*	double[] eqn 								*/
	/* 	double[] roots								*/
 	/* Return: 	the number of real roots 			*/
	/************************************************/
	/* Data dictionary 
	--------------------------------------------------	
	NAME		TYPE			VALUE RANGE		DESCRIPTION
	======== 	=========== 	===========		====================
	N/A 		N/A 			N/A 			N/A 		
	*/
	public static int solveQuadratic(double[] eqn, double[] roots) {

		if((Math.pow(eqn[1], 2) - (4 * eqn[0] * eqn[2])) > 0) {	
			return 2;
		} else if (Math.pow(eqn[1], 2) - (4 * eqn[0] * eqn[2]) == 0) {
			return 1;
		} else {
			return 0;
		}

	}
}







