/* Chapter No. 8 - Exercise No.  20
File Name:          Counter.java
Programmer:         Ashkan Jamshasb
Date Last Modified: Aug. 1, 2016

Problem Statement: To add and subtract numers from a count

Overall Plan:
1. Create a constructor that automatically sets the value of the count to zero
2. Create a method that will reset the value to zero
3. Create a method that will increment the count by one
4. Create a method that will decrement the count by one
5. Create a accessor mehtod that will get the count
6. Create a method that will print the count to the user

Classes needed and Purpose (Input, Processing, Output)
main class - GoodTime

DATA DICTIONARY
---------------
NAME		TYPE			VALUE RANGE		DESCRIPTION
======== 	=========== 	===========		====================
count 		int 			0<MAX_INT 		the value for the count  		 		
*/
public class Counter {

	int count;

	/************************************************/
	/* Name: Counter() 								*/
	/************************************************/
	/* Purpose: To set the value of count to zero 	*/
	/* Parameters: 	N/A	 							*/
	/* Return: N/A 					 				*/
	/************************************************/
	/* Data dictionary 
	--------------------------------------------------	
	NAME		TYPE			VALUE RANGE		DESCRIPTION
	======== 	=========== 	===========		====================
	N/A
	*/
	public Counter() {
		count = 0;
	}

	/************************************************/
	/* Name: reset() 								*/
	/************************************************/
	/* Purpose: To reset the vlue of count to zero 	*/
	/* Parameters: N/A 								*/
	/* Return: N/A 					 				*/
	/************************************************/
	/* Data dictionary 
	--------------------------------------------------	
	NAME		TYPE			VALUE RANGE		DESCRIPTION
	======== 	=========== 	===========		====================
	N/A
	*/
	void reset() {
		count=0;
	}

	/************************************************/
	/* Name: incriment() 							*/
	/************************************************/
	/* Purpose: To increment count by one 			*/
	/* Parameters: N/A								*/
	/* Return: N/A 					 				*/
	/************************************************/
	/* Data dictionary 
	--------------------------------------------------	
	NAME		TYPE			VALUE RANGE		DESCRIPTION
	======== 	=========== 	===========		====================
	N/A
	*/
	void incriment() {
		count++;
	}
	/************************************************/
	/* Name: decrement() 							*/
	/************************************************/
	/* Purpose: To decrement count by one 			*/
	/* Parameters: N/A								*/
	/* Return: N/A 					 				*/
	/************************************************/
	/* Data dictionary 
	--------------------------------------------------	
	NAME		TYPE			VALUE RANGE		DESCRIPTION
	======== 	=========== 	===========		====================
	N/A
	*/
	void decrement() {
		if (count > 0)
			count--;
	}

	/************************************************/
	/* Name: getCount() 							*/
	/************************************************/
	/* Purpose: To return the new count 			*/
	/* Parameters: N/A								*/
	/* Return: The new count		 				*/
	/************************************************/
	/* Data dictionary 
	--------------------------------------------------	
	NAME		TYPE			VALUE RANGE		DESCRIPTION
	======== 	=========== 	===========		====================
	N/A
	*/
	int getCount() {
		return count;
	}

	/************************************************/
	/* Name: output() 								*/
	/************************************************/
	/* Purpose: To print the count to the user 		*/
	/* Parameters: N/A								*/
	/* Return: N/A 					 				*/
	/************************************************/
	/* Data dictionary 
	--------------------------------------------------	
	NAME		TYPE			VALUE RANGE		DESCRIPTION
	======== 	=========== 	===========		====================
	N/A
	*/
	void output() {
		System.out.println("The count is: " + count);
	}

	/************************************************/
	/* Name: String toString()						*/
	/************************************************/
	/* Purpose: Convert an in to a string 	 		*/
	/* Parameters: N/A								*/
	/* Return: the interger as a string				*/
	/************************************************/
	/* Data dictionary 
	--------------------------------------------------	
	NAME		TYPE			VALUE RANGE		DESCRIPTION
	======== 	=========== 	===========		====================
	N/A
	*/
	public String toString() {
		return Integer.toString(count);
	}

	/************************************************/
	/* Name: equals(Counter number, Counter count)	*/
	/************************************************/
	/* Purpose: To print the count to the user 		*/
	/* Parameters: 									*/
	/*		Counter number							*/
	/*		Counter count 							*/
	/* Return: A boolean value to see if they are equal */
	/************************************************/
	/* Data dictionary 
	--------------------------------------------------	
	NAME		TYPE			VALUE RANGE		DESCRIPTION
	======== 	=========== 	===========		====================
	N/A
	*/
	boolean equals(Counter num1) {
		return (this.toString().equals(num1.toString()));
	}
}
