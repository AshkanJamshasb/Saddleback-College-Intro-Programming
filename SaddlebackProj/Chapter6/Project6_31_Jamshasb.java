
import java.util.Scanner;

public class Project6_31_Jamshasb {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		//4388576018402626
		long numIn = 4388576018402626L;
		sumOfDoubleEvenPlace(numIn);

	}

	//Get the results from Step 2
	/************************************************/
	/* sumOfDoubleEvenPlace(long number)			*/
	/************************************************/
	/* Purpose: to add up all the even numbers		*/
	/* Parameters: 									*/
	/*	int number 								*/	
	/* Return: 	the sum of the even numbers			*/
	/************************************************/
	/* Data dictionary 
	--------------------------------------------------	
	NAME		TYPE			VALUE RANGE		DESCRIPTION
	======== 	=========== 	===========		====================
	sumOfEven 	int  			any int 		the number of a digit
	*/
	public static int sumOfDoubleEvenPlace(long number) {
		int sumOfEven = 0;

		while (number > 0) {
			sumOfEven += (int)(number % 10);
			number = number / 100;
		}
		return sumOfEven;
	}	

	//Return this number if it is a single digit, otherwise, return the sum of the two digits
	/************************************************/
	/* Name:  getDigit(int number)					*/
	/************************************************/
	/* Purpose: to make every number a single digit	*/
	/* Parameters: 									*/
	/*	int number 									*/	
	/* Return: 	a single digit value				*/
	/************************************************/
	/* Data dictionary 
	--------------------------------------------------	
	NAME		TYPE			VALUE RANGE		DESCRIPTION
	======== 	=========== 	===========		====================
	dig1 		int 			0-9				the first digit of a double digit number
	dig2 		int 			0-9 			the second digit of a double digit number
	*/
	public static int getDigit(int number) {

		if (number <= 9) {
			return number;
		} else {
			int dig1 = number % 10;
			int dig2 = (int)(number / 10);
			
			return dig1 + dig2;
		}

	}
}
