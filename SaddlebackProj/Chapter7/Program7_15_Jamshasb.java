/* Chapter No. 7 - Exercise No.  15
File Name:          Program7_15_Jamshasb.java
Programmer:         Ashkan Jamshasb
Date Last Modified: Jul. 26, 2016

Problem Statement: To print the original numbers to the user

Overall Plan:
1. Prompt the user to enter their ten numbers and store the user's numbers into an array
2. Call a method to examine the array to make sure that there are no duplicates in it
3. The method runs a series of for loops to check which numbers are distinct
4. Calls a method that checks how many distinct numbers there are do that the program will not print any extra numbers at the end

Classes needed and Purpose (Input, Processing, Output)
main class - GoodTime

DATA DICTIONARY
---------------
NAME		TYPE			VALUE RANGE		DESCRIPTION
======== 	=========== 	===========		====================
i 			int 			1-10 			the variable for the condition for the for loop
nums[] 		int/array 		any ints 		the numbers that the user inputs
scan 		Scanner 		user input 		allows user input
*/
import java.util.Scanner;

public class Program7_15_Jamshasb {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int nums[] = new int[11];

		System.out.print("Enter ten numbers: ");

		for (int i = 0; i < 10; i++) {
			nums[i] = scan.nextInt();
		}

		System.out.print("The distinct numbers are: ");

		for (int i = 0; i < eliminateDuplicates(nums)[10] - 1; i++) {
			System.out.print(eliminateDuplicates(nums)[i] + " ");
		}
		System.out.println("");

	}

	/************************************************/
	/* Name: eliminateDuplicates(int[] list) 		*/
	/************************************************/
	/* Purpose: to return an array that has no duplicates from an array that the user inputed*/
	/* Parameters: 									*/
	/*	int[] list									*/
	/* Return: the array with no duplicates*/
	/************************************************/
	/* Data dictionary 
	--------------------------------------------------	
	NAME		TYPE			VALUE RANGE		DESCRIPTION
	======== 	=========== 	===========		====================
	i 			int 			1-10 	 		the variable for the condition for the for loop
	j 			int 			1-10 	 		the variable for the condition for the for loop
	k 			int 			1-10 			the number for the place in the og[] array
	og[] 		int/array 		any ints 		the distinct numbers that the user inputed
	*/
	public static int[] eliminateDuplicates(int[] list) {
		int j, i, k = 0;
		int dist = 0;
		int og[] = new int[11];

		for (i = 0; i < list.length; i++) {
			for (j = 0; j < i; j++) {
				if (list[i]==list[j]) {
					break;
				}
			}
			if (i == j) {
				og[k] = list[i];
				k++;
				dist++;
			}
		} 
		og[10] = dist;
		return og;
	}

	/************************************************/
	/* Name: distNum(int[] list) 		 			*/
	/************************************************/
	/* Purpose: to see how many duplicates there are*/
	/* Parameters: 									*/
	/*	int[] list									*/
	/* Return: 	the number of duplicates there are	*/
	/************************************************/
	/* Data dictionary 
	--------------------------------------------------	
	NAME		TYPE			VALUE RANGE		DESCRIPTION
	======== 	=========== 	===========		====================
	dist 		int 			1-10 			the number of distinct numbers there are
	i 			int 			1-10 	 		the variable for the condition for the for loop
	j 			int 			1-10 	 		the variable for the condition for the for loop
	*/
	// public static int distNum(int[] list) {
	// 	int j, i, dist = 0;

	// 	for (i = 0; i < list.length; i++) {
	// 		for (j = 0; j < i; j++) {
	// 			if (list[i]==list[j]) {
	// 				break;
	// 			}
	// 		}
	// 		if (i == j) {
	// 			dist++;
	// 		}
	// 	} 
	// 	return dist;
	// }
}







