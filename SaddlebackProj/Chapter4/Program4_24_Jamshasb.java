/* Chapter No. 4 - Exercise No.  24
File Name:          Program4_24_dot_Dat_One_Group.java
Programmer:         Alec Castaneda, Ashkan Jamshasb, Charles Prescott, Nathan Nhek
Date Last Modified: Jul. 10, 2016

Problem Statement: The user will input three cities and the program will alphabetize them.

Overall Plan:
1. Import the scanner class.
2. Prompts the user to input his or her choice of three cities.
3. 
4. 

Classes needed and Purpose: Program4_24_dot_Dat_One_Group for placing three city names as user inputs in alphabetical order.


DATA DICTIONARY
---------------
NAME		TYPE			VALUE RANGE		DESCRIPTION
======== 	=========== 	===========		====================

scan		Scanner			user input		allows user input

*/
import java.util.Scanner;

public class Program4_24_dot_Dat_One_Group {

	public static void main (String[] args) {

		Scanner scan = new Scanner(System.in); //The scanner class
		String city1, city2, city3, fill; //String datatypes
		
		//Prompt and first city
		System.out.print("Hello, this program will alphebatize three cities!\nEnter your first city: ");
		city1 = scan.nextLine();
		
		//Second city
		System.out.print("Enter your second city: ");
		city2 = scan.nextLine();
		
		//Third city
		System.out.print("Enter your final city: ");
		city3 = scan.nextLine();
		
		// If city three comes befor city two
		if (city3.compareToIgnoreCase(city2) < 0) {

			//If city two comes second
			if (city2.compareToIgnoreCase(city1) < 0) {

				fill = city3;
				city3 = city1;
				city1 = fill;

			//If city one comes first
			} else if (city1.compareToIgnoreCase(city3) < 0) {

				fill = city3;
				city3 = city2;
				city2 = fill;

			//If city two comes first and city three comes second
			} else {

				fill = city3;
				city3 = city2;
				city2 = city1;
				city1 = fill;
			}

		//if city two comes before city one
		} else if (city2.compareToIgnoreCase(city3) < 0) {

			//If they are already in order
			if (city1.compareToIgnoreCase(city2) < 0) {

				// do nothing

			//If city one comes before city three
			} else if (city1.compareToIgnoreCase(city3) < 0) {
				fill = city2;
				city2 = city1;
				city1 = fill;

			//If city two comes first and city three comes second
			} else {
				fill = city2;
				city2 = city3;
				city3 = city1;
				city1 = fill;
			}
		}
			
		
		System.out.println("In alphabetical order, they are: " + city1 + ", " + city2 + ", and " + city3);
	}
}