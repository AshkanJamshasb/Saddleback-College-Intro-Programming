/* Chapter No. 5 - Exercise No.  45
File Name:          Program5_45_Jamshasb.java
Programmer:         Ashkan Jamshasb
Date Last Modified: Jul. 13, 2016

Problem Statement: Shows the mean and the standard deviation for 10 numbers

Overall Plan:
1. prompt the user to enter their 10 digits
2. creates the sum for the values and squares each number and finds the sum for tha
3. calculates the mean and the standard deveation
4. prints the values to the user

Classes needed and Purpose (Input, Processing, Output)
main class - GoodTime

DATA DICTIONARY
---------------
NAME		TYPE			VALUE RANGE		DESCRIPTION
======== 	=========== 	===========		====================
dev 		double 			any double 		the standard deviation
i 			int 			0-10 			controls the for loop 
inNum 		double 			any double 		the number the user inputs
mean 		double 			any double 		the mean of the 10 numbers the user inputs
scan 		Scanner 		user input 		allows user input
sigSqare 	double 			any double 		the sum of the sqare of each number 
sum 		double 			any double 		the sum of the doubles the user inputs
*/
import java.util.Scanner;

public class Program5_45_Jamshasb {

	public static void main(String[] args){

		Scanner scan = new Scanner(System.in);
		
		double inNum, mean, dev, sum = 0, sigSqare = 0;

		System.out.print("Enter ten numbers: ");

		for (int i = 0; i < 10; i++){
			inNum = scan.nextDouble();
			sum += inNum;
			sigSqare += Math.pow(inNum, 2);
		}

		mean = sum/10;
		dev = Math.sqrt((sigSqare - (Math.pow(sum, 2)/10))/9);
		dev = (int)(dev * 100000);
		dev /= 100000.0;

		System.out.println("Mean: " + mean + "\nDeviation: " + dev);

	}
}