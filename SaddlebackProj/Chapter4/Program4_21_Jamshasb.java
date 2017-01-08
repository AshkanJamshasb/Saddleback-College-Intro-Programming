/* Chapter No. 4 - Exercise No.  21
File Name:          Program4_21_Jamshasb.java
Programmer:         Ashkan Jamshasb
Date Last Modified: Jul. 6, 2016

Problem Statement: Checks the validity of a social security number

Overall Plan:
1. Prompts user to input the value of their ssn and stores that as a datatype
2. checks if the ssn is long enough and if the '-' are in the right place
3. tells the user if the ssn is valid or not

Classes needed and Purpose (Input, Processing, Output)
main class - GoodTime

DATA DICTIONARY
---------------
NAME		TYPE			VALUE RANGE		DESCRIPTION
======== 	=========== 	===========		====================
firstBreak	char 			any char 		the position of where the first break should be
scan		Scanner			user input		allows user input
secondBreak char 			any char 		the position of where the second break should be
ssn 		String 			any String 		the social security number
ssnLength 	int 			any int 		the length of the string 
*/
import java.util.Scanner;
public class Program4_21_Jamshasb {

	public static void main(String[] args){
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter a SSN: ");
		String ssn = scan.nextLine();
		
		char firstBreak = ssn.charAt(3);
		char secondBreak = ssn.charAt(6);
		int ssnLength = ssn.length();

		
		if ((int)firstBreak != 45 || (int)secondBreak != 45 || ssnLength != 11 || ssn.indexOf("-", 7) != -1 || ssn.indexOf("-") != 3 || (int)ssn.charAt(7) == 45 || (int)ssn.charAt(8) == 45) {
			System.out.println(ssn + " is an invalid social securtiy number!");
		} else {
			System.out.println(ssn + " is a valid social securtiy number");
		}
		
//		if (ssn.indexOf("-", 4) == -1){
//			System.out.println("There is no more");
//		} else {
//			System.out.println("There is one more at " + ssn.indexOf("-", 4));
//		}
	}
}
