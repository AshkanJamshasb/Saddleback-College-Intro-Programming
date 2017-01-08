/* Chapter No. 5 - Exercise No.  1
File Name:          Program5_1_Jamshasb.java
Programmer:         Ashkan Jamshasb
Date Last Modified: Jul. 11, 2016

Problem Statement: Takes an unput of numbers and shows how many psoitive and negative numbers there are and show the total and average.

Overall Plan:
1. Gets user input and stores it as datatypes
2. Has a do-while loop until there is a 0
3. Does calculations for certain conditions
4. Prints the calculations to the users.

Classes needed and Purpose (Input, Processing, Output)
main class - GoodTime

DATA DICTIONARY
---------------
NAME		TYPE			VALUE RANGE		DESCRIPTION
======== 	=========== 	===========		====================
ave 		double 			any double 		the average of the numbers
neg 		int 			any int < 0		the number of negative intergers
num 		int 			any int 		the number the user inputed
numCount 	int 			any int 		the number of numbers 
pos 		int 			any int > 0 	the number of positive intergers
scan		Scanner			user input		allows user input
sum 		int 			any int 		the sum of the intergers

*/
import java.util.Scanner;

public class Program5_1_Jamshasb {

	public static void main(String[] args){
		
		Scanner scan = new Scanner(System.in);

		int num = 0, sum = 0, pos = 0, neg = 0, numCount = 0;
		double ave;

		System.out.print("Enter an integer, the input ends if it is 0: ");
		do {
			num = scan.nextInt();
			sum += num;
			++numCount;

			if (num > 0){
				++pos;

			}

			if (num < 0) {
				++neg;
			}

		} while (num != 0);

			--numCount;
		if(numCount == 0) {
			System.out.println("No numbers entered except 0");

		} else {
			ave = (double)sum/numCount;
			System.out.println("Positive: " + pos);
			System.out.println("Negative: " + neg);
			System.out.println("Total: " + sum);
			System.out.println("Average: " + ave);
		}
	}
}
