/* Chapter No. 3 - Exercise No.  9
File Name:          Program3_9_Jamshasb.java
Programmer:         Ashkan Jamshasb
Date Last Modified: Jun. 28, 2016

Problem Statement: Computes the 10th digit in an ISBN number

Overall Plan:
1. Create data types for user input
2. Prompt user to provide their information and store that information as data types
3. Run calculations to find the tenth digit for the ISBN number
4. If the tenth digit is 10, replace with "X"
5. Print the ISBN for the user

Classes needed and Purpose (Input, Processing, Output)
main class - GoodTime

DATA DICTIONARY
---------------
NAME		TYPE			VALUE RANGE		DESCRIPTION
======== 	=========== 	===========		====================
d1 			int 			any int 		the first digit in the ISBN number
d2			int 			any int 		the second digit in the ISBN number
d3			int 			any int 		the third digit in the ISBN number
d4 			int 			any int 		the fourth digit in the ISBN number
d5 			int 			any int 		the fifth digit in the ISBN number
d6  		int 			any int 		the sixth digit in the ISBN number
d7 			int 			any int 		the seventh digit in the ISBN number
d8 			int 			any int 		the eigth digit in the ISBN number
d9 			int 			any int 		the ninth digit in the ISBN number
d10 		int 			any int 		the tenth digit in the ISBN number
scan		Scanner			user input		allows user input
*/
import java.util.Scanner;

public class Program3_9_Jamshasb {

	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int d1, d2, d3, d4, d5, d6, d7, d8, d9, d10;
		System.out.println("Enter the first 9 digets of an ISBN as intergers separated by spaces: ");
			d1 = scan.nextInt();
			d2 = scan.nextInt();
			d3 = scan.nextInt();
			d4 = scan.nextInt();
			d5 = scan.nextInt();
			d6 = scan.nextInt();
			d7 = scan.nextInt();
			d8 = scan.nextInt();
			d9 = scan.nextInt();
			
		if (d1 < 0 || d2 < 0 || d3 < 0 || d4 < 0 || d5 < 0 || d6 < 0 || d7 < 0 || d8 < 0 || d9 < 0) {
			System.out.println("Error: You cannot input negative digits!");
		} else if (d1 > 9 || d2 > 9 || d3 > 9 || d4 > 9 || d5 > 9 || d6 > 9 || d7 > 9 || d8 > 9 || d9 > 9) {
			System.out.println("Error: You canonly input a single digit!");
		} else {
			d10 = (d1*1 + d2*2 + d3*3 + d4*4 + d5*5 + d6*6 + d7*7 + d8*8 + d9*9) % 11;
			if (d10 == 10) {
				System.out.println("ISBN number is: " + d1 + d2 + d3 + d4 + d5 + d6 + d7 + d8 + d9 + "X");	
			} else {
				System.out.println("ISBN number is: " + d1 + d2 + d3 + d4 + d5 + d6 + d7 + d8 + d9 + d10);
			}
		}
	}
}