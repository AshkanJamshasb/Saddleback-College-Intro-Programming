/* Chapter No. 2 - Exercise No.  5 
File Name:          Program2_5_Jamshasb.java
Programmer:         Ashkan Jamshasb
Date Last Modified: Jun. 27, 2016

Problem Statement: Find the gratuity and the total with only the gratuity rate and subtotal

Overall Plan:
1. Prompt user to provide subtotal and store user response as "subtotal"
2. Prompt user to provide the gratuity rate and store user response as "gratuityRate"
3. Calculate gratuity by finding the product of "gratuityRate" and "subtotal"
4. Calculate total by finding the sum of "gratuity" and "subtotal"
5. Print the gratuity and the total.

Classes needed and Purpose (Input, Processing, Output)
main class - GoodTime

DATA DICTIONARY
---------------
NAME		 TYPE			VALUE RANGE		DESCRIPTION
========	 =========== 	===========	 	====================
gratuity	 double			any double	 	the gratuity is the product of the gratuity rate and the subtotal
gratuityRate double	 		any double	 	the gratuity rate
subtotal	 double			any double		the subtotal
total		 double			any double		the total of the sum of the gratuity and subtotal
*/
import java.util.Scanner;

public class Program2_5_Jamshasb {

	public static void main(String[] args){
		double gratuityRate, gratuity, subtotal, total;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the subtotal: $");
		subtotal = scan.nextDouble();
		System.out.println("Enter the gratuity rate as a decimal: (ie. 15% = 0.15)");
		gratuityRate = scan.nextDouble();
		gratuity = gratuityRate * subtotal;
		total = gratuity + subtotal;
		System.out.println("The gratuity is $" + gratuity);
		System.out.println("The total is $" + total);
	}
}
