/* Chapter No. 6 - Exercise No.  17
File Name:          Program6_17_Jamshasb.java
Programmer:         Ashkan Jamshasb
Date Last Modified: Jul. 19, 2016

Problem Statement: Print a random n-by-n matrix, n is a user input

Overall Plan:
1. Prompt the user to enter their choice of variables
2. Once the user inters their value, it calls a mehod that randomly generates a n-by-n matrix using nested for loops
3. The method then prints the matrix

Classes needed and Purpose (Input, Processing, Output)
main class - GoodTime

DATA DICTIONARY
---------------
NAME		TYPE			VALUE RANGE		DESCRIPTION
======== 	=========== 	===========		====================
n 			int 			any int 		the int the user inputs, declares the size of the n-by-n size box
scan 		Scanner 		user input 		allows user input
*/
import java.util.Scanner;

public class Program6_17_Jamshasb {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int n;


 		do {
			System.out.print("Enter n: ");
				n = scan.nextInt();
				if (n > 0) {
					break;
				} else {
					System.out.println("**Error** n has to be positive");
				}
		} while (true);

		printMatrix(n);

	}

	/************************************************/
	/* Name: printMatrix(int n)		 				*/
	/************************************************/
	/* Purpose: To print the matrix and randomly generate 1's and 0's	*/
	/* Parameters: 									*/
	/*	int n 										*/
	/* Return: 	Nothing								*/
	/************************************************/
	/* Data dictionary 
	--------------------------------------------------	
	NAME		TYPE			VALUE RANGE		DESCRIPTION
	======== 	=========== 	===========		====================
	i 			int 			0-n 			the condition for the first for loop, the number of lines	
	j 			int 			0-n 			the condition for the second for loop, the number 0/1 in each line
	n 			int 			any int 		the number the user inputs
	*/
	public static void printMatrix(int n) {
		for (int i = 0; i < n; i++){
			for (int j = 0; j < n; j++){
				System.out.print((int)(Math.random() * 2)+ " ");
			}
			System.out.println();
		}
	}
}

