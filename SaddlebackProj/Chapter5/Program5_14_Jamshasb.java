/* Chapter No. 5 - Exercise No.  14
File Name:          Program5_14_Jamshasb.java
Programmer:         Ashkan Jamshasb
Date Last Modified: Jul. 12, 2016

Problem Statement: The user inputs two intergers and the program prints the GCD;

Overall Plan:
1. Prompts the user to input their two numbers and stores their inputs as datatypes
2. Finds the bigger and smaller number between the two
3. Runs calculations to find the GCD
4. Prints the GCD to the user

Classes needed and Purpose (scan, Processing, Output)
main class - GoodTime

DATA DICTIONARY
---------------
NAME		TYPE			VALUE RANGE		DESCRIPTION
======== 	=========== 	===========		====================
condi 		boolean 		true 			the condition for the for loop
d 			int 			any int 		the smallest number of the two
dTemp 		int 			any int 		the temporary value for d
m 			int 			any int 		the bigger number between the user input
n1 			int 			any int 		the first interger the user inputs
n2 			int 			any int 		the second interger the user inputs
scan		Scanner			user input		allows user input
smllNum 	int 			any int 		the snaller number of the two inputs
*/

import java.util.Scanner;

public class Program5_14_Jamshasb {

	public static void main(String[] args){
		
		Scanner scan = new Scanner(System.in);

		int d, n1, n2, smllNum, dTemp, m;
		boolean condi = true;

		System.out.print("Enter your two intergers: ");
		n1 = Math.abs(scan.nextInt());
		n2 = Math.abs(scan.nextInt());


		d = Math.min(n1, n2);
		m = Math.max(n1, n2);

		if (d != 0) {

			dTemp = d;

			for (int i = 0; condi; i++) {
				dTemp = d;
				dTemp -= i;
				if (((n1 % dTemp) == 0) && ((n2 % dTemp) == 0))
					break;
			}

			System.out.println("The GCD is: " + dTemp);

		} else{

			System.out.println("The GCD is: " + m);
		}
	}
}