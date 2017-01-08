/* Chapter No. 5 - Exercise No.  21
File Name:          Program5_21_Jamshasb.java
Programmer:         Ashkan Jamshasb
Date Last Modified: Jul. 12, 2016

Problem Statement: Shows the monthly payment and the total payment with certain interest rates

Overall Plan:
1. prompt the user to input the amount of their loan and the number of years and stores that as datatypes
2. runs a whle loop to display the values for the interest rate and all the other payments
3. does calculations inside the while loop as to update the values
4. prints the result to the user

Classes needed and Purpose (scan, Processing, Output)
main class - GoodTime

DATA DICTIONARY
---------------
NAME		TYPE			VALUE RANGE		DESCRIPTION
======== 	=========== 	===========		====================
intRate 	double 			(5.0-8.0)1/8 	the yearly interest rate
loanAm		double 			any double 		the amount that the user was loaned
monPay 		double 			any double 		the monthly payment
numYear 	int 			any int 		the number of years
scan		Scanner			user input		allows user input
totPay 		double 			any double 		the total payment
*/

import java.util.Scanner;

public class Program5_21_Jamshasb {

	public static void main(String[] args){
		
		Scanner scan = new Scanner(System.in);

		int  numYear;
		double monPay, totPay, loanAm, intRate = 5.000; 

		System.out.print("Loan Amount: ");
		loanAm = scan.nextDouble();
		System.out.print("Number of Years: ");
		numYear = scan.nextInt();

		System.out.printf("%-16s%-18s%-16s\n", "Interest Rate", "Monthly Payment", "Total Payment");

		while (true) {

			intRate /= 1200; 

			monPay = loanAm * intRate / (1 - 1 / Math.pow(1 + intRate, numYear * 12));
			totPay = monPay * numYear * 12;

			intRate *= 1200;

			System.out.printf("%-4.3f%%\t\t%-18.2f%-7.2f\n", intRate, monPay, totPay);

			if (intRate > 8.0)
				break;

			intRate += 0.125;
		}


	}
}