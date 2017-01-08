/* Chapter No. 5 - Exercise No.  49
File Name:          Program5_49_Jamshasb.java
Programmer:         Ashkan Jamshasb
Date Last Modified: Jul. 14, 2016

Problem Statement: Calculates the number of vowels and constants in a sentence

Overall Plan:
1. Prompts the user to input a sentence
2. Runs a forloop to see how many vowels and letters are in a sentence
3. Prints the values of constants and vowels to the user

Classes needed and Purpose (Input, Processing, Output)
main class - GoodTime

DATA DICTIONARY
---------------
NAME		TYPE			VALUE RANGE		DESCRIPTION
======== 	=========== 	===========		====================
i 			int 			any int 		incrementing the for loop
letters 	int 			any int 		the number of letters in the sentence
scan 		Scanner 		user input 		allows user input
stinger 	string 			any string 		the sentence that the user inputs
vowels  	int 			any int 		the number of vowels in the string
*/
import java.util.Scanner;

public class Program5_49_Jamshasb {

	public static void main(String[] args){

		Scanner scan = new Scanner(System.in);
		
		String stinger;
		int vowels = 0;
		int letters = 0;

		System.out.print("Enter a sentence: ");
		stinger = scan.nextLine();
		stinger = stinger.toUpperCase();

		for (int i = 0; i < stinger.length(); i++) {
			if (stinger.charAt(i) == 'A' || stinger.charAt(i) == 'E' || stinger.charAt(i) == 'I' || stinger.charAt(i) == 'O' || stinger.charAt(i) == 'U')
				++vowels;
			if ((int)(stinger.charAt(i)) >= 65 && (int)(stinger.charAt(i)) <= 90)
				++letters;
		}
		System.out.println("The number of vowels are: " + vowels);
		System.out.println("The number of constants are: " + (letters - vowels));
	}
}