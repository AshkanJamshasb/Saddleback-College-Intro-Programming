/* Chapter No. 2 - Exercise No.  13
File Name:          Program2_13_Jamshasb.java
Programmer:         Ashkan Jamshasb
Date Last Modified: Jun. 27, 2016

Problem Statement: Calculates the account balance after six months.

Overall Plan:
1. Establish monthy interest rate
2. Prompt user to provide mothly savings amount and store that value as a data type
3. Run multiple calculations to ultimatly find the account balance after six months
4. Tell user amount that is in their account at that time.

Classes needed and Purpose (Input, Processing, Output)
main class - GoodTime

DATA DICTIONARY
---------------
NAME		TYPE			VALUE RANGE		DESCRIPTION
======== 	=========== 	===========		====================
accBal			double		any double		the account balance
monthIntRate	double		any double		the monthly interest rate
saveAmount		double		any double		the monthy savings amount
*/
import java.util.Scanner;

public class Program2_13_Jamshasb {
	
	public static void main(String[] args){
		
		double accBal, monthIntRate, saveAmount;
		Scanner scan = new Scanner(System.in);
		monthIntRate = 0.05/12;
		
		System.out.println("Enter the monthly savings amount: $" );
		saveAmount = scan.nextDouble();
		
		accBal = saveAmount * (1 + monthIntRate);			//month 1
		accBal = (saveAmount + accBal) * (1 + monthIntRate);//month 2
		accBal = (saveAmount + accBal) * (1 + monthIntRate);//month 3
		accBal = (saveAmount + accBal) * (1 + monthIntRate);//month 4
		accBal = (saveAmount + accBal) * (1 + monthIntRate);//month 5
		accBal = (saveAmount + accBal) * (1 + monthIntRate);//month 6
		accBal = (int)(accBal * 100);
		accBal = ((accBal)/100);
		System.out.println("The account balance after six months is $" + accBal + "!");

	}
}
