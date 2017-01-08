/* Chapter No. 5 - Exercise No.  9
File Name:          Program5_9_Jamshasb.java
Programmer:         Ashkan Jamshasb
Date Last Modified: Jul. 11, 2016

Problem Statement: Tells the user the student who has the highest score and the second highest score and prints that score

Overall Plan:
1. Create datatypes and assign values to some that need it
2. Prompt user to ener number of students and store that as a datatype
3. runs a for loop as many times as there are students and stores the value of the highest student and the highest score
4. Prints the student with the higest score and the student with the second highest score and their scores

Classes needed and Purpose (scan, Processing, Output)
main class - GoodTime

DATA DICTIONARY
---------------
NAME		TYPE			VALUE RANGE		DESCRIPTION
======== 	=========== 	===========		====================
i 			int 			any int 	 	use this for the for loop to measure the increments
max 		int 			any int 		the highest value for a student
maxStud 	String 			any String 		the name of the student with the highest value
name 		String 			any String 		the input of the name of the student from the user
scan		Scanner			user input		allows user input
secMax 		int 			any int 		the second highest value for a students score
secMaxStud 	String 			any String 		the name of the student with the second highest score
*/

import java.util.Scanner;

public class Program5_9_Jamshasb {

	public static void main(String[] args){
		
		Scanner scan = new Scanner(System.in);

		String maxStud= "", secMaxStud= "", name;
		int numOfSudents, score, max = 0, secMax = 0;

		System.out.print("Enter the number of students: ");
		numOfSudents = scan.nextInt();

		
		for (int i = 1; i <= numOfSudents; i++) {
			System.out.print("Enter name and score of student (" + (i)+ "): ");
			name = scan.next();
			score = scan.nextInt();
			 
			if (score >= max) {
				secMax = max;
				secMaxStud= maxStud; 
				max = score;
				maxStud= name;

			} else if (score >= secMax) {
				secMax = score;
				secMaxStud= name;
			}
		}
		 
		System.out.println("The student with the highest score is " + maxStud + " with a score of " + max + "!");
		System.out.println("The student with the second highest score is " + secMaxStud + " with a score of " + secMax + ".");
	}
}