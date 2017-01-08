/* Chapter No. 3 - Exercise No.  15
File Name:          Program3_15_Jamshasb.java
Programmer:         Ashkan Jamshasb
Date Last Modified: Jun. 29, 2016

Problem Statement: Checks if you have the winning lottery number

Overall Plan:
1. Create data types for user input
2. Prompt user to provide their lottery number and stores that information as data types
3. Breaks down the lottery number and user number into individual digits
4. Compares the numbers 
5. Prints out how much the user has won.

Classes needed and Purpose (Input, Processing, Output)
main class - GoodTime

DATA DICTIONARY
---------------
NAME		TYPE			VALUE RANGE		DESCRIPTION
======== 	=========== 	===========		====================
guess		int 			any int 		users input for their lottery number
g1 			int 			(0-9)   		first digit of user input
g2 			int 			(0-9)   		second digit of user input
g3 			int 			(0-9)    		third digit of user input
lottery 	int 			(0-1000) 		the winning lottery number
l1 			int 			(0-9)    		first digit of lottery number
l2			int 			(0-9)    		second digit of lottery number
l3			int 			(0-9)   		third digit of lottery number
scan		Scanner			user input		allows user input
*/
import java.util.Scanner;

public class Program3_15_Jamshasb {

	public static void main(String[] args){	
		
		int lottery, l1, l2, l3, g1, g2, g3, guess;
		
		Scanner scan = new Scanner(System.in);
		lottery = (int)(Math.random() * 1000);
		
//		System.out.println("lottery num: " + lottery);
		System.out.println("What is your lottery number?");
		guess = scan.nextInt();
		
		l1 = lottery / 100;
		l2 = (lottery % 100) / 10;
		l3 = (lottery % 10);
		
		g1 = guess / 100;
		g2 = (guess % 100) / 10;
		g3 = (guess % 10);
		
//		System.out.println("g1 " + g1 + "\ng2 " + g2 + "\ng3 " + g3);
//		System.out.println("l1 " + l1 + "\nl2 " + l2 + "\nl3 " + l3);
	
		if (g1>9) {
			System.out.println("Error: you have entered the wrong amount of digits!");
		} else	if(g1<0) {
			System.out.println("Error: you cannot have negative intergers!");
		} else if (guess == lottery) {
			System.out.println("Congrats! You got an exact match! $10,000!!");
		} else if ((l1 == g1 && l2 == g3 && l3 == g2) || 
				   (l1 == g3 && l2 == g2 && l3 == g1) || 
				   (l1 == g2 && l2 == g1 && l3 == g3) || 
				   (l1 == g2 && l2 == g3 && l3 == g1) || 
				   (l1 == g3 && l2 == g1 && l3 == g2)) {
			System.out.println("You've got the three digits, but not in the right order :c. Here is $3,000");
		} else if ((l1==g1)||(l2==g2)||(l3==g3)||
				   (l1==g2)||(l2==g1)||(l3==g2)||
				   (l1==g3)||(l2==g3)||(l3==g1)) {
			System.out.println("You get $1,000!");
		} else {
			System.out.println("You won nothing!");
		}
	}
}