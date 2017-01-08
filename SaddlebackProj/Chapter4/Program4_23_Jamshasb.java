/* Chapter No. 4 - Exercise No.  23
File Name:          Program4_23_Jamshasb.java
Programmer:         Ashkan Jamshasb
Date Last Modified: Jul. 6, 2016

Problem Statement: The program creates a payroll statement

Overall Plan:
1. Prompts the user to input information and then the program stores that information as a datatype
2. Does some calculations to create specifics for a payroll
3. Prints the payroll to the user.

Classes needed and Purpose (Input, Processing, Output)
main class - GoodTime

DATA DICTIONARY
---------------
NAME		TYPE			VALUE RANGE		DESCRIPTION
======== 	=========== 	===========		====================
feTax 		double 			any double 		the federal tax
hoursWorked double 			any double 		the number of hours
name 		String 			any String 		the name of the employee
payPerHour 	double 			any double 		the amount payed per hour
scan		Scanner			user input		allows user input
stateTax 	double 			any double 		the state tax
*/
import java.util.Scanner;

public class Program4_23_Jamshasb {

	public static void main(String[] args){
		
		Scanner scan = new Scanner(System.in);
		System.out.printf("Enter employee's (e.g., Smith) ");
		String name = scan.nextLine();
		System.out.printf("Enter number of hours worked in a week (e.g., 10) ");
		double hoursWorked = scan.nextDouble();
		System.out.printf("Enter hourly pay rate (e.g., 9.75) $");
		double payPerHour = scan.nextDouble();
		System.out.printf("Enter federal tax withholding rate (e.g., 20%% is 0.20): ");
		double fedTax = scan.nextDouble();
		System.out.printf("Enter state tax withholding rate (e.g., 9%% is 0.09): ");
		double stateTax = scan.nextDouble();

		System.out.printf("\nEmployee Name: %s\n", name);
		System.out.printf("Hours worked: %4.1f hours\n", hoursWorked);
		System.out.printf("Pay rate: $%4.2f\n", payPerHour);
		System.out.printf("Gross pay: $%4.2f\n", (payPerHour * hoursWorked));
		System.out.printf("Deductions:\n");
		System.out.printf("\tFederal withholding (%4.1f%%): $%4.2f\n", (fedTax * 100), (payPerHour * hoursWorked * fedTax));
		System.out.printf("\tState withholding (%4.1f%%): $%4.2f\n", (stateTax * 100), (payPerHour * hoursWorked * stateTax));
		System.out.printf("\tTotal diduction: $%4.2f\n", (payPerHour * hoursWorked * fedTax) + (payPerHour * hoursWorked * stateTax));
		System.out.printf("Net Pay: $%4.2f\n", (payPerHour * hoursWorked) - ((payPerHour * hoursWorked * fedTax) + (payPerHour * hoursWorked * stateTax)));

	}
}
