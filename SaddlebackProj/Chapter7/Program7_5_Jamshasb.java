/* Chapter No. 7 - Exercise No.  5
File Name:          Program7_5_Jamshasb.java
Programmer:         Ashkan Jamshasb
Date Last Modified: Jul. 25, 2016

Problem Statement: To see how many distinct nubers are in a list of ten and to print them off to a user

Overall Plan:
1. Prompt the user to enter the digits 
2. Stores the digits in an array
3. goes through the array to see if there are any similar numbers
4. copies the distinct numbers to a new array
5. Prints the numbers of distinct numbers
6. Prints the distinct numbers 

Classes needed and Purpose (Input, Processing, Output)
main class - GoodTime

DATA DICTIONARY
---------------
NAME		TYPE			VALUE RANGE		DESCRIPTION
======== 	=========== 	===========		====================
distinct 	int 			0-10 			the number of distinct numbers
i 			int 			0-10 			the variable for the condition in a for loop
j 			int 			0-10 			the variable for the condition in a for loop
k 			int 			0-10 			the variable for the condition in a for loop
l 			int 			0-10 			the variable for the condition in a for loop
m 			int 			0-10 			the variable for the condition in a for loop
scan 		Scanner 		user input 		allows user input

*/
import java.util.Scanner;

public class Program7_5_Jamshasb {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int i, j, k, distinct = 0, l = 0;
		int nums[] = new int[10];
		int dist[] = new int[10];

		System.out.print("Enter then numbers: ");
		for (i = 0; i < 10; i++) {
			nums[i] = scan.nextInt();
		}

		for (j = 0; j < 10; j++) {
			for (k = 0; k < j; k++) {
				if (nums[j] == nums[k]) {
					break;
				} 
			}

			if (j == k) { 
				dist[l] = nums[j];
				distinct++;
				l++;
			} 
		}

		System.out.println("The number of distinct numbers are: " + distinct);
		System.out.print("The distinct numbers are: ");
		for (int m = 0; m < distinct; m++){
			System.out.print(dist[m] + " ");
		}

		System.out.println("");
	}
}