/* Chapter No. 6 - Exercise No.  5
File Name:          Program6_5_Jamshasb.java
Programmer:         Ashkan Jamshasb
Date Last Modified: Jul. 18, 2016

Problem Statement: user will input three numbers and the program will order the numbers in decreasing order

Overall Plan:
1. Prompt the user to enter their three numbers
2. calls the method to order the numebrs
3. the method will order the three numbers in decreasing order
4. the method will then print the order to the user.

Classes needed and Purpose (Input, Processing, Output)
main class - GoodTime

DATA DICTIONARY
---------------
NAME		TYPE			VALUE RANGE		DESCRIPTION
======== 	=========== 	===========		====================
displaySortedNumbers method	void 			method will order the numbers in decreasing order
num1 		double 			any double 		the first number the user inputs
num2 		double 			any double 		the second number the user inputs
num3 		double 		 	any double 		the third number the user inputs
scan 		Scanner 		user input 		allows user input

*/
import java.util.Scanner;

public class Program6_5_Jamshasb {

	public static void main(String[] args){

		Scanner scan = new Scanner(System.in);

		double num1, num2, num3;

		System.out.print("Enter your three numbers: ");
		num1 = scan.nextDouble();
		num2 = scan.nextDouble();
		num3 = scan.nextDouble();
		
		displaySortedNumbers(num1, num2, num3);

	}


	// Places the numbers in decreasing order
	public static void displaySortedNumbers(double num1, double num2, double num3) {

		double placeHolder;

		if ((num2 < num1) && (num2 < num3)){	
			placeHolder = num1;
			num1 = num2;
			num2 = placeHolder;	
		}		
		else if ((num3 < num1) && (num3 < num2)){		
			placeHolder = num1;
			num1 = num3;
			num3 = placeHolder;		
		}		
		if (num3 < num2){		
			placeHolder = num2;
			num2 = num3;
			num3 = placeHolder;		
		}

		System.out.println(num3 + ", " + num2 + ", " + num1);
	}
}

