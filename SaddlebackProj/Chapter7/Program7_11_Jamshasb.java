/* Chapter No. 7 - Exercise No.  11
File Name:          Program7_11_Jamshasb.java
Programmer:         Ashkan Jamshasb
Date Last Modified: Jul. 25, 2016

Problem Statement: To find the mean and the standard deviation of ten numbers

Overall Plan:
1. Prompt the user to enter their 10 numbers
2. Puts the users input into an array
3. calls a methos that will calculate the mean
4. the method adds the array and divids it by 10
4. calls a method that will calculate the standard deviation
6. the method runs calculations to find the standard deviation
7. prints the results to the user 

Classes needed and Purpose (Input, Processing, Output)
main class - GoodTime

DATA DICTIONARY
---------------
NAME		TYPE			VALUE RANGE		DESCRIPTION
======== 	=========== 	===========		====================
numbers[]	double/array	any double 		the ten numbers that the user inputs
scan 		Scanner 		user input 		allows user input
*/
import java.util.Scanner;

public class Program7_11_Jamshasb {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		double numbers[] = new double[10];

		System.out.print("Enter ten numbers: ");

		for (int i = 0; i < 10; i++){
			numbers[i] = scan.nextDouble();
		}

		System.out.printf("The mean is %4.2f\nThe standard deviation is %7.5f\n", mean(numbers), deviation(numbers));
		
	}

	/************************************************/
	/* Name: mean(double[] numbers) 	 			*/
	/************************************************/
	/* Purpose: to find the mean of 10 numbers 		*/
	/* Parameters: 									*/
	/*	double[] numbers							*/	
	/* Return: 	the mean of the 10 numbers 			*/
	/************************************************/
	/* Data dictionary 
	--------------------------------------------------	
	NAME		TYPE			VALUE RANGE		DESCRIPTION
	======== 	=========== 	===========		====================
	i 			int 			1-10 			the control variable in the condition of the for loop
	sum 		double 			any double 		the sum of the numbers the user inputed
	*/
	public static double mean(double[] numbers) {
		double sum = 0;
		for(int i = 0; i < numbers.length; i++){
			sum += numbers[i];
		}
		return sum/numbers.length;
	}

	/************************************************/
	/* Name: deviation(double[] numbers) 			*/
	/************************************************/
	/* Purpose: to find the standard deviation 		*/
	/* Parameters: 									*/
	/*	double[] numbers							*/	
	/* Return: 	the standard deviation 				*/
	/************************************************/
	/* Data dictionary 
	--------------------------------------------------	
	NAME		TYPE			VALUE RANGE		DESCRIPTION
	======== 	=========== 	===========		====================
	i 			int 			1-10 			the control variable in the condition of the for loop
	top 		double	 		any double 		the top portion of the deviation equation
	*/
	public static double deviation(double[] numbers) {
		double top = 0;

		for (int i = 0; i < 10; i++){
			top += Math.pow((numbers[i] - mean(numbers)), 2);
		}
		return Math.sqrt(top/9);
	}
}