/* Chapter No. 4 - Exercise No.  11
File Name:          Program4_11_Jamshasb.java
Programmer:         Ashkan Jamshasb
Date Last Modified: Jul. 5, 2016

Problem Statement: Convert decimal value to hex

Overall Plan:
1. Get the user input and store it as a datatype
2. Check if the values are in the parameters
3. Print the hex value

Classes needed and Purpose (Input, Processing, Output)
main class - GoodTime

DATA DICTIONARY
---------------
NAME		TYPE			VALUE RANGE		DESCRIPTION
======== 	=========== 	===========		====================
decimal		int 			any int 		the decimal value that is going to be converted to hex
scan		Scanner			user input		allows user input
*/
import java.util.Scanner;
public class Program4_11_Jamshasb {

	public static void main(String[] args) {
		
		int decimal;
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter a decimal value (0-15): ");
		decimal = scan.nextInt();
		if (decimal < 0 || decimal > 15){
			System.out.println(decimal + " is an invalid input");
		}else if (decimal <= 9) {
			System.out.println("The hex value is " + decimal);
		} else {
			switch (decimal) {
				case 10: 
					System.out.println("The hex value is A");
					break;
				case 11: 
					System.out.println("The hex value is B");
					break;
				case 12: 
					System.out.println("The hex value is C");
					break;
				case 13: 
					System.out.println("The hex value is D");
					break;
				case 14: 
					System.out.println("The hex value is E");
					break;
				case 15: 
					System.out.println("The hex value is F");
					break;
			}
		}
	}
}