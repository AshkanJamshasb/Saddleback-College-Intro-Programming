/* Chapter No. 4 - Exercise No.  3
File Name:          Program4_5_Jamshasb.java
Programmer:         Ashkan Jamshasb
Date Last Modified: Aug. 2, 2016

Problem Statement: 

Overall Plan:
1. 
2. 
3. 
4. 

Classes needed and Purpose (Input, Processing, Output)
Odometer - to see the distance traveled and to check the fuel consumed for a specific trip

DATA DICTIONARY
---------------
NAME		TYPE			VALUE RANGE		DESCRIPTION
======== 	=========== 	===========		====================

scan 		Scanner 		user input 		allows user input

*/
import java.util.Scanner;
public class Program4_5_Jamshasb {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Counter count = new Counter();
		int n;
		boolean go = true;

		do {
			//The menu 
			System.out.print("|--------------------------|\n|           MENU           |\n|--------------------------|\n| ***ENTER AN OPERATION*** |\n|<1> Display Count         |\n|<2> Add                   |\n|<3> Subtract              |\n|<4> Reset                 |\n|<0> Exit                  |\n|--------------------------|\n");
			n = scan.nextInt();
			//The menu values
			switch (n) {
				case 0:
					go = false;
					break;
				case 1: 
					count.output();
					break;
				case 2: 
					count.incriment();
					break;
				case 3: 
					count.decrement();
					break;
				case 4:
					count.reset();
					break;
				default:
					System.out.println("**ERROR** Invalid input");
					break;
			}
			count.equals(count);
		} while (go);
	}
}
