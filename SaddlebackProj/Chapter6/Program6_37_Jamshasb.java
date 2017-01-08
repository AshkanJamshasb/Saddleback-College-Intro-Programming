/* Chapter No. 6 - Exercise No.  37
File Name:          Program6_37_Jamshasb.java
Programmer:         Ashkan Jamshasb
Date Last Modified: Jul. 21, 2016

Problem Statement: To format the number a user inputs to a certain width that the user inputs

Overall Plan:
1. Prompt the user to give the number they want to format
2. Prompt the user to give the number for their width
3. Use a do-while loop to check if the number is positive or zero
4. Calls the method format() and prints it
5. Format will convert the number the user inputed into a string
6. Then it will add a number of zeros before it depending on what the width is using a for loop
7. Then it will return the completed string

Classes needed and Purpose (Input, Processing, Output)
main class - GoodTime

DATA DICTIONARY
---------------
NAME		TYPE			VALUE RANGE		DESCRIPTION
======== 	=========== 	===========		====================
number 		int 			any +int & 0 	the number the user inputs
scan 		Scanner 		user input 		allows user input
width 		int 			any +int & 0	the width that the user wants their string to be
*/
import java.util.Scanner;

public class Program6_37_Jamshasb {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int number, width;

		//To make sure the number is positive or zero
		do {
			System.out.print("Enter the number you want to format (i.e. \"34\"): " );
			number = scan.nextInt();
			if (number < 0) {
				System.out.println("**ERROR** Number has to be greater than or equal to zero");
			} else {
				break;
			}
		} while (true);

		//To make sure the width is positive 
		do {
			System.out.print("Enter the wanted width (i.e. \"4\"): ");
			width = scan.nextInt();
			if (width < 0) {
				System.out.println("**ERROR** Width has to be greater than or equal to zero");
			} else {
				break;
			}
		} while (true);

		//Printing the final statement 
		System.out.println(format(number, width));
	}

	/************************************************/
	/* Name: format(int number, int width) 			*/
	/************************************************/
	/* Purpose: to format the number to a certain width	*/
	/* Parameters: 									*/
	/*	int number 									*/
	/*	int width									*/	
	/* Return: 	certain amount of zeros and the number	*/
	/************************************************/
	/* Data dictionary 
	--------------------------------------------------	
	NAME		TYPE			VALUE RANGE		DESCRIPTION
	======== 	=========== 	===========		====================
	leftOvers 	int 			any int 		the number of zeros that go before the number
	num 		String 			any String 		the number the user inputed as a string
	preZeros 	String 			any String 		the number of zeros that go before the number
	*/
	public static String format(int number, int width) {
			String num, preZeros = "";
			int leftOvers;
			num = "" + number;
			leftOvers = width - num.length();
			for (int i = 0; i < leftOvers; i++) {
				preZeros += "0";
			}
			return preZeros + num;
		}


}

