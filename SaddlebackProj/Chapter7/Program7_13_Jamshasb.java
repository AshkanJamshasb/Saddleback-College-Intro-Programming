/* Chapter No. 7 - Exercise No.  13
File Name:          Program7_13_Jamshasb.java
Programmer:         Ashkan Jamshasb
Date Last Modified: Jul. 25, 2016

Problem Statement: To generate a random number that is excluded from a number of numbers that the user inputs

Overall Plan:
1. Prompt the user to tell how many numbers they want to enter
2. Prompt the user to give teh numbers that the user wants to exclude
3. Calls a method that will go through to see if the random number is the same as any of the ones the user wants to be excluded
4. If its not, it will print the user the value for the random number

Classes needed and Purpose (Input, Processing, Output)
main class - GoodTime

DATA DICTIONARY
---------------
NAME		TYPE			VALUE RANGE		DESCRIPTION
======== 	=========== 	===========		====================
numbers[] 	array/int 		any ints 		the numbers that the user wants to exculude from his array 
numOfnum 	int 			1-53 			the number of numbers the user wants to input	
scan 		Scanner 		user input 		allows user input

*/
import java.util.Scanner;

public class Program7_13_Jamshasb {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int numOfnum;
		int numbers[];
		do {
		System.out.print("Enter how many numbers you want to exclude (cannot be over 53): ");
			numOfnum = scan.nextInt();
			if (numOfnum < 54 && numOfnum >= 0) {
				break;
			} else {
				System.out.println("**ERROR** Invalid input...");
			}
		} while (true);

		numbers = new int[numOfnum];
		if (numOfnum > 0) {
			System.out.print("Enter " + numOfnum + " numbers: ");

			for(int i = 0; i < numOfnum; i++) {
				numbers[i] = scan.nextInt();
			}
		}

		System.out.println("Your random number is " + getRandom(numbers));
	}

	/************************************************/
	/* Name: getRandom(int... numbers) 	 			*/
	/************************************************/
	/* Purpose: to format the number to a certain width	*/
	/* Parameters: 									*/
	/*	int numbers									*/
	/* Return: 	a random number that isn't a previous number	*/
	/************************************************/
	/* Data dictionary 
	--------------------------------------------------	
	NAME		TYPE			VALUE RANGE		DESCRIPTION
	======== 	=========== 	===========		====================
	i 			int 			1-54  			the variable for the condition for the for loop
	randomNum	int 			1-54 			a random number that is generated that cannot be in the numbers the user inputed	
	*/
	public static int getRandom(int... numbers) {
		int randomNum, i;
		do {
		randomNum = 1 + (int)(Math.random() * 54);
			for (i = 0; i < numbers.length; i++){
				if(randomNum == numbers[i]) {
					break;
				}
			}

			//Make sure it has gone through the whole array
			if (i == (numbers.length)) {
				break;
			}
		} while (true);
		return randomNum;
	}
}







