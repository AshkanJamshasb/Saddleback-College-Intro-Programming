/* Chapter No. 2 - Exercise No.  1 
File Name:          Program2_1_Jamshasb.java
Programmer:         Ashkan Jamshasb
Date Last Modified: Jun. 27, 2016

Problem Statement: Convert degrees Celsius to degrees Fahrenheit.

Overall Plan:
1. Create a data type for "celsius" and "fahrhenheit".
2. Explain the purpose of the code and prompt the user to enter a value in Celsius.
3. Get the input from the user and store it as "celsius"
4. Run the calculations and store the solution as "fahrenheit".
5. Print the value of "celsius" and the value of "fahrenheit".

Classes needed and Purpose (Input, Processing, Output)
main class - GoodTime

DATA DICTIONARY
---------------
NAME	TYPE		VALUE RANGE	DESCRIPTION
======== =========== =========== ====================
celsius		double	 any double	 Degrees Celsius
fahrenheit	double	 any double	 Degrees Fahrenheit
*/
import java.util.Scanner;

public class Program2_1_Jamshasb {

		public static void main(String[] args){
			Scanner scan = new Scanner(System.in);
			double celsius, fahrenheit;
			System.out.println("The following program will convert degrees Celsius into degrees Fahrenheit!");
			System.out.println("Enter a temperature in Celsius");
			celsius = scan.nextDouble();
			fahrenheit = (9.0/5) * celsius + 32;
			System.out.println(celsius + " degrees Celsius is " + fahrenheit + " degrees Fahrenheit!");
		}
}
