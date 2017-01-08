/* Chapter No. 3 - Exercise No.  17
File Name:          Program3_17_Jamshasb.java
Programmer:         Ashkan Jamshasb
Date Last Modified: Jun. 29, 2016

Problem Statement: Allows user to play rock, paper, scissors with the console.

Overall Plan:
1. Create data types for user input
2. Prompt user to provide rock, paper, or scissors, and stores that information as data types
3. Checks to make sure number is 0, 1, or 2.
4. Compares the user input with the computer's choice 
5. Prints out the results.

Classes needed and Purpose (Input, Processing, Output)
main class - GoodTime

DATA DICTIONARY
---------------
NAME		TYPE			VALUE RANGE		DESCRIPTION
======== 	=========== 	===========		====================
compChoice	int 			(0-2)			The computer's choice for the value of the variable
scan		Scanner			user input		allows user input
userChoice 	int 			(0-2)			The 
*/
import java.util.Scanner;

public class Program3_17_Jamshasb {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int compChoice = (int)(Math.random()*3);

		System.out.println("Enter in scissors (0), rock (1), or paper (2): (ie. \"1\" = rock)");
		int userChoice = scan.nextInt();
		
		if (userChoice==0||userChoice==1||userChoice==2) {
			switch (compChoice) {
				case 0:
				System.out.print("The computer chose scissors. ");
					if (userChoice==0) {
						System.out.println("You chose scissors. Its a tie!");
					} else if (userChoice==1) {
						System.out.println("You chose rock. You win!");
					} else if (userChoice==2) {
						System.out.println("You chose paper. You lose.");
					}
					break;
				case 1:
				System.out.print("The computer chose rock. ");
					if (userChoice==0) {
						System.out.println("You chose scissors. You lose.");
					} else if (userChoice==1) {
						System.out.println("You chose rock. Its a tie!");
					} else if (userChoice==2) {
						System.out.println("You chose paper. You win!");
					}
					break;
				case 2:
				System.out.print("The computer chose paper. ");
					if (userChoice==0) {
						System.out.println("You chose scissors. You win!");
					} else if (userChoice==1) {
						System.out.println("You chose rock. You lose.");
					} else if (userChoice==2) {
						System.out.println("You chose paper. Its a tie!");
					}
					break;
				default:
					System.out.println("Good game!");
			}
		} else {
			System.out.println("Error: Invalid input.");}

	}
}