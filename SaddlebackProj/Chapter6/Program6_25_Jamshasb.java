/* Chapter No. 6 - Exercise No.  25
File Name:          Program6_25_Jamshasb.java
Programmer:         Ashkan Jamshasb
Date Last Modified: Jul. 19, 2016

Problem Statement: To convert a given amount of milliseconds to hours, minutes, and seconds

Overall Plan:
1. Prompt user to input a number of milliseconds and store that input as a long
2. Calls the method "converMillis()" in order to convert the milliseconds
3. once the method is called, it will do a series of calculations to convert milliseconds to hours, minutes, and seconds
4. The method will then return a string with the information
5. Then in the main method, it will print the return from the method.

Classes needed and Purpose (Input, Processing, Output)
main class - GoodTime

DATA DICTIONARY
---------------
NAME		TYPE			VALUE RANGE		DESCRIPTION
======== 	=========== 	===========		====================
millis 		long 			any long 		the number of milliseconds the user choses to input
scan 		Scanner 		user input 		allows user input
*/
import java.util.Scanner;

public class Program6_25_Jamshasb {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		long millis;

		System.out.print("Enter number of milliseconds: ");
		millis = scan.nextLong();

		System.out.println(convertMillis(millis));
	}
	
	/************************************************/
	/* Name: convertMillis(long millis)				*/
	/************************************************/
	/* Purpose: To create a string that contains the number of hours, minutes, and seconds in a given amount of milliseconds */
	/* Parameters: 									*/
	/*	long millis 								*/
	/* Return: 	A strings that prints hours:minutes:seconds	*/
	/************************************************/
	/* Data dictionary 
	--------------------------------------------------	
	NAME		TYPE			VALUE RANGE		DESCRIPTION
	======== 	=========== 	===========		====================
	hours 		long 			any long 		the number of hours converted from the milliseconds the user inputed
	minutes 	long 			any long 		the number of minutes converted from the milliseconds the user inputed
	seconds 	long 			any long 		the number of seconds converted from the milliseconds the user inputed
	*/
	public static String convertMillis(long millis) {
		long hours, minutes, seconds;

		hours = millis/3600000;
		millis %= 3600000;
		minutes = millis/60000;
		millis %=  60000;
		seconds = millis/1000;

		return hours + ":" + minutes + ":" + seconds;
	}
}

