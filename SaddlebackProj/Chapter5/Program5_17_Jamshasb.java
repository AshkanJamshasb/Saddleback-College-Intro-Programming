/* Chapter No. 5 - Exercise No. 17
File Name:          Program5_17_Jamshasb.java
Programmer:         Ashkan Jamshasb
Date Last Modified: Jul. 14, 2016

Problem Statement: 

Overall Plan:
1. 
2. 
3. 
4.
5.

Classes needed and Purpose (Input, Processing, Output)
main class - GoodTime

DATA DICTIONARY
---------------
NAME		TYPE			VALUE RANGE		DESCRIPTION
======== 	=========== 	===========		====================
numLines 	int 			0-15 			the number of lines the user wants to loop
scan 		Scanner 		user input 		allows user input

*/
import java.util.Scanner;

public class Program5_17_Jamshasb {

	public static void main(String[] args){

		Scanner scan = new Scanner(System.in);
		
		int numLines;

		System.out.print("Enter the number of lines: ");

		numLines = scan.nextInt();

		// Number of lines is less than or equal to 15 and a positive number
		if (numLines <= 15 && numLines >= 0) {


			for (int i = 1; i <= numLines; i++) {

				// For spaces in the front
				for (int j = numLines; j >= i; j--) {
						System.out.print("   ");
				}

				// For the numbers
				for (int k = 1; k <= i; k++) {

					// Left side decreasing
					if (i >= 2 && k == 1)	{
						for (int j = i; j >= k; j--) {
							if (j > 1) {
								System.out.printf("%3d", j);
							}
						}	
					}
						System.out.printf("%3d", k);
				}
	 			System.out.println();
			}

		} else {
			System.out.println("**Error** Invalid entry, number has to be between 0-15");
		}
	}
}