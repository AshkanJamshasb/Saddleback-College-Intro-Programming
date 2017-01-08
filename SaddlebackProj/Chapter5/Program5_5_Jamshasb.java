/* Chapter No. 5 - Exercise No.  5
File Name:          Program5_5_Jamshasb.java
Programmer:         Ashkan Jamshasb
Date Last Modified: Jul. 11, 2016

Problem Statement: 

Overall Plan:
1. Tell the user what conversions are going to take place
2. Decalre the variables and give startPound a value
3. Run a for loop that will output the values while increaing them

Classes needed and Purpose (Input, Processing, Output)
main class - GoodTime

DATA DICTIONARY
---------------
NAME		TYPE			VALUE RANGE		DESCRIPTION
======== 	=========== 	===========		====================
i 			int 			(i-199)odds 	use this for the for loop to measure the increments, also represents kilo
kilo 		float 			any float 		the kilos per pound
pound 		float 			any float 		the pounds per kilo
startPound 	int 			(20-515)by 5's 	the number of pounds
*/

public class Program5_5_Jamshasb {

	public static void main(String[] args){
		
		float pounds, kilo;
		int startPound = 20;
		
		System.out.printf("%-10s%7s\t%s\t%-7s%10s\n", "Kilograms", "Pounds", "|", "Pounds", "Kilograms");

		for (int i = 1; i <= 199; i += 2) {

			kilo = (float)startPound*0.45359237f;
			pounds = i/0.45359237f;
			System.out.printf("%-10d%7.1f\t%s\t%-7d%10.2f\n", i, pounds, "|", startPound, kilo);
			startPound += 5;
		}


	}
}