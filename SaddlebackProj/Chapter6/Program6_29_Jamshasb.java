/* Chapter No. 6 - Exercise No.  29
File Name:          Program6_29_Jamshasb.java
Programmer:         Ashkan Jamshasb
Date Last Modified: Jul. 19, 2016

Problem Statement: The program will find all the twin primes up to 1000

Overall Plan:
1. Call the method called "twinPrimes()" to print the twin primes
2. the twinPrime method called the isPrime method to check if the numebr is prime
3. checks if a number that is greater than that number by two is prime 
4. if both the numbers are prime, it will print the statement 

Classes needed and Purpose (Input, Processing, Output)
main class - GoodTime

DATA DICTIONARY
---------------
NAME		TYPE			VALUE RANGE		DESCRIPTION
======== 	=========== 	===========		====================
N/A 		N/A 			N/A 			N/A
*/
import java.util.Scanner;

public class Program6_29_Jamshasb {

	public static void main(String[] args) {

		twinPrimes();
	}

	/************************************************/
	/* Name: twinPrimes() 							*/
	/************************************************/
	/* Purpose: Prints the pair of twim prime numbers */
	/* Parameters: 									*/
	/*	none 		 								*/
	/* Return: 	Nothing	 							*/
	/************************************************/
	/* Data dictionary 
	--------------------------------------------------	
	NAME		TYPE			VALUE RANGE		DESCRIPTION
	======== 	=========== 	===========		====================
	firstNum	int 			3-1000 odds 	the first prime number that shows up
	secooncNum 	int 			3-1000 odds 	the second prime number that shows up 
	*/
	public static void twinPrimes() {
		int firstNum, secondNum;
		for (firstNum = 3; firstNum <= 1000; firstNum += 2) {
			secondNum = firstNum + 2;
			if (isPrime(firstNum) && isPrime(secondNum)) {
				System.out.println("(" + firstNum + ", " + secondNum + ")"); 
			}
		}
	}


	/************************************************/
	/* Name: isPrime(int num) 						*/
	/************************************************/
	/* Purpose: To check if a number is a prime number */
	/* Parameters: 									*/
	/*	int num 								*/
	/* Return: 	True/False vaule 					*/
	/************************************************/
	/* Data dictionary 
	--------------------------------------------------	
	NAME		TYPE			VALUE RANGE		DESCRIPTION
	======== 	=========== 	===========		====================
	i 			int 			2 - num 		the condition for the for loop to check if a certain number has anthing devisable by it
	num 		int 			any int 		the number that is run through the loop and method
	*/
	public static boolean isPrime(int num) {
		for(int i = 2; i < num; i++) {
			if(num % i == 0)
				return false;
		}
		return true;
	}
}

