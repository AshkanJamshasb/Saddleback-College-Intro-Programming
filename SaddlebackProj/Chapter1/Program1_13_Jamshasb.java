/* Chapter No. 1 - Exercise No.  13 
File Name:          Program1_13_Jamshasb.java
Programmer:         Ashkan Jamshasb
Date Last Modified: Jun. 27, 2016

Problem Statement: The code solved a linear equation using Cramer's rule without using doubles.

Overall Plan:
1. Print equation that will be solved.
2. Print the solution to for "x"
3. Print the solution to for "y"

Classes needed and Purpose (Input, Processing, Output)
main class - GoodTime

DATA DICTIONARY
---------------
NAME	TYPE		VALUE RANGE	DESCRIPTION
======== =========== =========== ====================
N/A
*/
public class Program1_13_Jamshasb {
	
	public static void main(String[] main){
		System.out.println("Problem: \n	3.4x + 50.2y = 44.5 \n	2.1x + .55y = 5.9\nSolution:");
		System.out.println("x = " + ((44.5 * 0.55)-(50.2*5.9))/((3.4*0.55)-(50.2*2.1)));
		System.out.println("y = " + ((3.4 * 5.9)-(44.5 * 2.1))/((3.4 * 0.55)-(50.2 * 2.1)));
		
	}
}
