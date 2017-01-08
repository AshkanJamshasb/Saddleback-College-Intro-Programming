/* Chapter No. 8 - Exercise No.  1
File Name:          Program8_1_Jamshasb.java
Programmer:         Ashkan Jamshasb
Date Last Modified: Aug. 1, 2016

Problem Statement: To add up the numbers in a column from a matrix that the user provides

Overall Plan:
1. Prompt the user to input their matrix and store the input as a 2-D array
2. Calls a method that will add up the numbers in a column by adding numbers in the column to the sum
3. Prints the information to the user 

Classes needed and Purpose (Input, Processing, Output)
main class - GoodTime

DATA DICTIONARY
---------------
NAME		TYPE			VALUE RANGE		DESCRIPTION
======== 	=========== 	===========		====================
i 			int 			any int 		the variable for the condition for the for loop
m[][]		double/array 	any doubles 	the array for the 3-by-4 matrix that the user will input
scan 		Scanner 		user input 		allows user input
*/
import java.util.Scanner;

public class Program8_1_Jamshasb {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		double[][] m = new double [3][4];

		System.out.println("Enter a 3-by-4 matric row by row:");
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 4; j++) {
				m[i][j] = scan.nextDouble();
			}
		}

		for (int i = 0; i < 4; i++) {
			System.out.println("Sum of the elements at column " + (i+1) + " is " + sumColumn(m, i));
		}

	}

	/************************************************/
	/* Name: sumColumn(double[][] m, int columnIndex) */
	/************************************************/
	/* Purpose: to add up the numbers in a column 	*/
	/* Parameters: 									*/
	/*	double[][] m								*/
	/* 	int columnIndex								*/
 	/* Return: to return the sum of the numbers in a column	*/
	/************************************************/
	/* Data dictionary 
	--------------------------------------------------	
	NAME		TYPE			VALUE RANGE		DESCRIPTION
	======== 	=========== 	===========		====================
	i 			int 			any int 		the variable condition for the for loop	
	sum 		double 			any double 		the sum of the numbers in a column
	*/
	public static double sumColumn(double[][] m, int columnIndex) {
		double sum = 0;
		for (int i = 0; i < m.length; i++) {
			sum += m[i][columnIndex];
		}
		return sum;
	}
}