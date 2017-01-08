/* Chapter No. 8 - Exercise No.  5
File Name:          Program8_5_Jamshasb.java
Programmer:         Ashkan Jamshasb
Date Last Modified: Aug. 1, 2016

Problem Statement: To add the two matrixes together and print that as another matrix

Overall Plan:
1. Promp the user to enter their two matrixes
2. Once the user inputs it, call a method to add the two matrixes together
3. Print the values of all the matrixes with a series of for loops

Classes needed and Purpose (Input, Processing, Output)
main class - GoodTime

DATA DICTIONARY
---------------
NAME		TYPE			VALUE RANGE		DESCRIPTION
======== 	=========== 	===========		====================
a[][] 		double/array	any doubles 	the array for the first matrix
b[][] 		double/array 	any doubles 	the array for the second matrix
i 			int 			0-3 			the variable for the condition for the for loop
j 			int 			0-3 			the variable for the condition for the for loop
scan 		Scanner 		user input 		allows user input
*/
import java.util.Scanner;
public class Program8_5_Jamshasb {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		double[][] a = new double[3][3];
		double[][] b = new double[3][3]; 

		//Prompt the user to give their information
		System.out.println("Enter matrix1:");
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				a[i][j] = scan.nextDouble();
			}
		}
		scan.nextLine();
		System.out.println("Enter matrix2:");
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				b[i][j] = scan.nextDouble();
			}
		}

		//Print the information to the user
		System.out.println("The matrices are added as follows");
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.printf("%3.1f ", a[i][j]);
			}
			if (i == 1) {
				System.out.print("  +  ");
			} else {
				System.out.print("     ");
			}
			for (int j = 0; j < 3; j++) {
				System.out.printf("%3.1f ", b[i][j]);
			}
			if (i == 1) {
				System.out.print("  =  ");
			} else {
				System.out.print("     ");
			}
			for (int j = 0; j < 3; j++) {
				System.out.printf("%4.1f ", addMatrix(a, b)[i][j]);
			}
			System.out.println();
		}
	}

	/************************************************/
	/* Name: addMatrix(double[][] a, double[][] b) 	*/
	/************************************************/
	/* Purpose: To add the numbers in the matrixes  */
	/* Parameters: 									*/
	/*	double[][] a 								*/
	/* 	double[][] b 								*/
 	/* Return: */
	/************************************************/
	/* Data dictionary 
	--------------------------------------------------	
	NAME		TYPE			VALUE RANGE		DESCRIPTION
	======== 	=========== 	===========		====================
	addMatrix[][] double/array 	any doubles 	the sum of the first matrix and the second matrix
	*/
	public static double[][] addMatrix(double[][] a, double[][] b) {
		double[][] addMatrix = new double[3][3];

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				addMatrix[i][j] = (a[i][j] + b[i][j]);
			}
		}
		return addMatrix;
	}
}