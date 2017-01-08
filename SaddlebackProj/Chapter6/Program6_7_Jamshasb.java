/* Chapter No. 6 - Exercise No.  7
File Name:          Program6_7_Jamshasb.java
Programmer:         Ashkan Jamshasb
Date Last Modified: Jul. 19, 2016

Problem Statement: To calculate the future invesment value after a certain amount of years

Overall Plan:
1. Prompt the user to give the information neccisarry
2. Create a method that converts the inputs into a single double that is the future investment value
3. Call the method in the main method and use a for loop to count the number of years
4. Print the values to the user.

Classes needed and Purpose (Input, Processing, Output)
main class - GoodTime

DATA DICTIONARY
---------------
NAME		TYPE			VALUE RANGE		DESCRIPTION
======== 	=========== 	===========		====================
i 			int 			1-30 			it is the number of years that the investment runs for, also the conditions for the for loop
investAmount double 		any double 		it is the user input for the investment amount
monthyInterestRate double 	any double 		it is the user input for the yearly interest rate
scan 		Scanner 		user input 		allows user input
*/
import java.util.Scanner;

public class Program6_7_Jamshasb {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		double investAmount, monthyInterestRate;

		// Get user input
		System.out.print("Investment Amount (e.g., 1000): ");
		investAmount = scan.nextDouble();
		System.out.print("Annual interest rate (e.g., 9% = 9): ");
		monthyInterestRate = scan.nextDouble();
		
		// Header
		System.out.printf("%-5s\t%12s\n", "Years", "Future Value");

		//Future investment value and years
		for (int i = 1; i <= 30; i++) {
			System.out.printf("%-5d\t%12.2f\n", i, futureInvestmentValue(investAmount, (monthyInterestRate/1200), i));
		}

	}
	
	/************************************************/
	/* Name: futureInvestmentValue(double investAmount, double monthyInterestRate, int years) 				*/
	/************************************************/
	/* Purpose: To calculate and return the future investment value		*/
	/* Parameters: 									*/
	/*	double investAmount							*/	
	/* 	double monthyInterestRate					*/
	/*  int years 									*/
	/* Return: 	the future investment amount		*/
	/************************************************/
	/* Data dictionary 
	--------------------------------------------------	
	NAME		TYPE			VALUE RANGE		DESCRIPTION
	======== 	=========== 	===========		====================
	investAmount double 		any double 		it is the user input for the investment amount
	monthyInterestRate double 	any double 		it is the user input for the yearly interest rate
	years		int 			1-30 			it is the number of years that the investment runs for 	
	*/
	public static double futureInvestmentValue(double investAmount, double monthyInterestRate, int years) {

		return investAmount*Math.pow((1+monthyInterestRate),(years*12));
	}
}

