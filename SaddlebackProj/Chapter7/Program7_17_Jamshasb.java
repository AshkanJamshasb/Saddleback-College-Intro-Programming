/* Chapter No. 7 - Exercise No.  17
File Name:          Program7_17_Jamshasb.java
Programmer:         Ashkan Jamshasb
Date Last Modified: Jul. 26, 2016

Problem Statement: Order students from who has the greatest score

Overall Plan:
1. Prompt the user to input the names and number of students
2. Prompts the user to input the score for each of the studnets
3. Run a couple of for loops to order the names and the scores
4. Prints the names and the scores to the user

Classes needed and Purpose (Input, Processing, Output)
main class - GoodTime

DATA DICTIONARY
---------------
NAME		TYPE			VALUE RANGE		DESCRIPTION
======== 	=========== 	===========		====================
i 			int 			any int 		the variable for the condition in the for loop
names[] 	String/array 	any Strings		the names that the user inputs
numStud 	int 			any int 		the number of students the user inputs
scan 		Scanner 		user input 		allows user input
score[] 	int/array 		any int 		the scores that the user inputs for the scores of the students
*/
import java.util.Scanner;

public class Program7_17_Jamshasb {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int numStud;
		String names[];
		int score[];
		
		System.out.print("Enter the number of students: ");
		numStud = scan.nextInt();

		names = new String[numStud];
		score = new int[numStud];

		scan.nextLine(); //Clear the console
		
		for (int i = 0; i < numStud; i++) {
			System.out.print("Enter the name for student " + (i + 1) + ": ");
			names[i] = scan.nextLine();
		}

		for (int i = 0; i < numStud; i++) {
			System.out.print("Enter the score for " + names[i] + ": ");
			score[i] = scan.nextInt();
		}

		System.out.println("");
		orderer(score, names);
	}

	/************************************************/
	/* Name: orderer(int[] scores, String[] names)	*/
	/************************************************/
	/* Purpose: to order the names and the scores 	*/
	/* Parameters: 									*/
	/*	int[] scores								*/
	/* 	String[] names 								*/
 	/* Return: 	N/A									*/
	/************************************************/
	/* Data dictionary 
	--------------------------------------------------	
	NAME		TYPE			VALUE RANGE		DESCRIPTION
	======== 	=========== 	===========		====================
	i 			int 			any int 		the variable for the condition in the for loop
	min 		int 			any int 		the smallest value
	temp 		int 			any int 		the temporary value for the scores
	tempo 		String 			any String 		the temporary value for the names
	*/
	public static void orderer(int[] scores, String[] names) {
		for (int i = 0; i < scores.length-1; i++) {
			int temp, min = i;
			String tempo = "";
			for (int j = i+1; j < scores.length; j++) {
				if (scores[j] < scores[min]) 
					min = j;
			}
			//For scores
			temp = scores[i];
			scores[i] = scores[min];
			scores[min] = temp;

			//For Names
			tempo = names[i];
			names[i] = names[min];
			names[min] = tempo;
		}
		for (int i = (scores.length - 1); i >= 0; i--) {
			System.out.println(names[i] + ": " + scores[i]);
		}
	}
}







