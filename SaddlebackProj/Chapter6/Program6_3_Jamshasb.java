/* Chapter No. 6 - Exercise No.  3
File Name:          Program6_3_Jamshasb.java
Programmer:         Ashkan Jamshasb
Date Last Modified: Jul. 17, 2016

Problem Statement: Sees if a number is a palindrome

Overall Plan:
1. Prompt the user to enter their number and store that number as a datatype.
2. calls a mothod to see if the number is a polindrome
3. calls another method to calculate the polidrome
4. prints the solution 

Classes needed and Purpose (Input, Processing, Output)
main class - GoodTime

DATA DICTIONARY
---------------
NAME		TYPE			VALUE RANGE		DESCRIPTION
======== 	=========== 	===========		====================
isPalindrome mthod 			boolean			return a boolean value if the number is a palindrome
num 		int 			any int 		the number the user inputs
reverse 	int 			any int 		the variable to help reverse the int
reverse 	method			int 			the mothod reverses the int
scan 		Scanner 		user input 		allows user input
*/
import java.util.Scanner;

public class Program6_3_Jamshasb {

	public static void main(String[] args){

		Scanner scan = new Scanner(System.in);
		int num;

		System.out.print("Enter a number: ");
		num = scan.nextInt();

		if (isPalindrome(num)) {
			System.out.println(num + " is a palindrome. " + num + " == " + reverse(num));
		} else {
			System.out.println(num + " is not a palindrome. " + num + " != " + reverse(num));
		}
	}

	public static int reverse(int number) {
		int reverse = 0;
		while (number != 0) {
			reverse *= 10;
			reverse += number%10;
			number /= 10;
		}
		return reverse;
	}

	public static boolean isPalindrome(int number) {
		return (number==reverse(number));
	}
}

