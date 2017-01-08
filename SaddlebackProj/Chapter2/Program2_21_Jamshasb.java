/* Chapter No. 2 - Exercise No.  21
File Name:          Program2_21_Jamshasb.java
Programmer:         Ashkan Jamshasb
Date Last Modified: Jun. 28, 2016

Problem Statement: Gets the investment amount, annual interest rate, and how many years from the user and calculate the accumulated value.

Overall Plan:
1. Create data types for user input
2. Prompt user to provide their information and store that information as data types
3. Run calculations to find the future investments.
4. Tell user the future investment.

Classes needed and Purpose (Input, Processing, Output)
main class - GoodTime

DATA DICTIONARY
---------------
NAME		TYPE			VALUE RANGE		DESCRIPTION
======== 	=========== 	===========		====================
annIntRate	double			any double		the annual interest rate as a decimal
futInvVal	double			any double		the future investment value
investVal	double			any double		the initial investment amount
monts		double			any double		the number of months, converted from years
scan		Scanner			user input		allows user input
years		double			any double		the number of years the interest applies
*/
import java.util.Scanner;

public class Program2_21_Jamshasb {

	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		double futInvVal, investVal, annIntRate, years, months;

		System.out.println("Enter investment amount: $");
		investVal = scan.nextDouble();
		System.out.println("Provide annual interest rate as a percent (ie. %4.5 = 4.5); ");
		annIntRate = scan.nextDouble() / 100;
		System.out.println("Enter the number of years you can to invest: ");
		years = scan.nextDouble();
		months = years * 12;
		futInvVal = investVal*Math.pow((1+annIntRate/12), months);
		
		futInvVal = (int)(futInvVal*100);
		futInvVal /= 100;
		
		System.out.println("The accumulated value is $" + futInvVal);
	}
}
