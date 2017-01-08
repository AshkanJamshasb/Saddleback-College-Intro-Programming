/* Chapter No. 4 - Exercise No.  24
File Name:          Program4_24_dot_Dat_One_Group.java
Programmer:         Alec Castaneda, Ashkan Jamshasb, Charles Prescott, Nathan Nhek
Date Last Modified: Jul. 10, 2016

Problem Statement: The user will input three cities and the program will alphabetize them.

Overall Plan:
1. Import the scanner class.
2. Prompts the user to input his or her choice of three cities.
3. Uses the scanner class to store the inputs as stringsUsing compareToIgnoreCase, compare string 2 with string 1 and 3
4. If string 2 precedes string 1 and 3, set string 2 as string 1 and string 1 as a dummy string
5. Otherwise, compare string 3 to string 1 and 2
6. If string 3 precedes string 2 and 1, set string 1 as a dummy string, and string 3 as string 1
7. Compare string 3 to string 2
8. If string 3 precedes string 2, set string 2 to a dummy string and c3 to string 2
9. Print the list of cities in alphabetical order.

Classes needed and Purpose: Program4_24_dot_Dat_One_Group for placing three city names as user inputs in alphabetical order.


DATA DICTIONARY
---------------
NAME		TYPE			VALUE RANGE		DESCRIPTION
======== 	=========== 	===========		====================
c1			string			any string		User defined first city
c2			string			any string		User defined second city
c3			string			any string		User defined third city
filler		string			any string		Placeholder string as the values of c1 through c3 are being switched around
scan		Scanner			user input		Allows user input   
*/
import java.util.Scanner;

public class Program4_24_dot_Dat_One_Group {

	public static void main (String[] args) {

		Scanner scan = new Scanner(System.in); //The scanner class
		String c1, c2, c3, filler; //String datatypes
		
		//Prompt and first city
		System.out.print("Hello, this program will alphebatize three cities!\nEnter your first city: ");
		c1 = scan.nextLine();
		
		//Second city
		System.out.print("Enter your second city: ");
		c2 = scan.nextLine();
		
		//Third city
		System.out.print("Enter your final city: ");
		c3 = scan.nextLine();
		
		if ((c2.compareToIgnoreCase(c1) < 0) && (c2.compareToIgnoreCase(c3) < 0)){	
			filler = c1;
			c1 = c2;
			c2 = filler;
		
		}
		
		else if ((c3.compareToIgnoreCase(c1) < 0) && (c3.compareToIgnoreCase(c2) < 0)){		
			filler = c1;
			c1 = c3;
			c3 = filler;		
		}
		
		if (c3.compareToIgnoreCase(c2) < 0){		
			filler = c2;
			c2 = c3;
			c3 = filler;
		
		}

		System.out.println("In alphabetical order, they are: " + c1 + ", " + c2 + ", and " + c3);
	}
}