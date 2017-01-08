/* Chapter No. 3 - Exercise No.  Extra Credit
File Name:          Program4_21_Jamshasb.java
Programmer:         Ashkan Jamshasb
Date Last Modified: Jul. 7, 2016

Problem Statement: Moves the first word of a sentence to the end

Overall Plan:
1. Prompts user to input their sentence
2. makes the first letter lower case and the first letter of the second word upper case
3. prints the new sentence to the user

Classes needed and Purpose (Input, Processing, Output)
main class - GoodTime

DATA DICTIONARY
---------------
NAME		TYPE			VALUE RANGE		DESCRIPTION
======== 	=========== 	===========		====================
scan		Scanner			user input		allows user input
stingger 	String 			any string 		the complete first sentecne
thebeginning String 		any string 		the first part of the sentence
theEnd 		String 			any string 		the sencond part of the sentence
*/
import java.util.Scanner;

public class Program3_Extra_Credit {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a complete sentene without puncuation any marks marks: ");
		String stingger = scan.nextLine(); //The sentence the user inputed

			String theEnd = stingger.substring(stingger.indexOf(" ") + 1, stingger.length());//The second part of the sentence 
			String theBeginning = stingger.substring(0, stingger.indexOf(" "));//The first part of the sentence
			
			System.out.println(theEnd.substring(0, 1).toUpperCase()+theEnd.substring(1)+" "+theBeginning.substring(0, 1).toLowerCase()+theBeginning.substring(1));
	}
}