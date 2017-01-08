/* Chapter No. 5 - Exercise No.  41
File Name:          Program5_41_Jamshasb.java
Programmer:         Ashkan Jamshasb
Date Last Modified: Jul. 13, 2016

Problem Statement: Takes the user input and finds the largest vlue that the user inputed

Overall Plan:
1. prompt the user to enter the numbers and does not stop until the user inputs a "0"
2. if the number is greater than the previous number, then that number becomes the newest greatest number
3. records the nuber of instances the greatest number occurs
4. Prints the greatest number and the times it occured 

Classes needed and Purpose (Input, Processing, Output)
main class - GoodTime

DATA DICTIONARY
---------------
NAME		TYPE			VALUE RANGE		DESCRIPTION
======== 	=========== 	===========		====================
count		int 			int <= 1 		the amount of times the max shows
inNum 		int 			any int 		the number the user inputs 
max 		int 			any int -0 		the max number that the user input
scan 		Scanner 		user input 		allows user input
*/
import java.util.Scanner;

public class Program5_41_Jamshasb {

	public static void main(String[] args){
		
		Scanner scan = new Scanner(System.in);
		int max, inNum = 1, count = 1;

		System.out.print("Enter numbers, enter \"0\" to end: ");

		inNum = scan.nextInt();
		max = inNum;

		while (inNum != 0) {
			inNum = scan.nextInt();
			if (max == 0 ){
				max = inNum;
			}
			if (inNum > max && inNum != 0) {
				max = inNum;
				count = 1;
			} else if (inNum == max){
				count++;
			}
		}
		
		System.out.println("The largest number is " + max + "\nThe occurrence count of the largest number is " + count);
		

	}
}