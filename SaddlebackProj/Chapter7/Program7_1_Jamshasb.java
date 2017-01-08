/* Chapter No. 7 - Exercise No.  1
File Name:          Program7_1_Jamshasb.java
Programmer:         Ashkan Jamshasb
Date Last Modified: Jul. 25, 2016

Problem Statement: To give a number of students a letter grade

Overall Plan:
1. Prompts the user to enter the amount of students
2. Creates an array that contains that amount of students
3. Scans each input to see which one is the highest grade
4. Prints out the grades to the user
5. Uses the highest grade as an A and then prints out the grades repectively to that 

Classes needed and Purpose (Input, Processing, Output)
main class - GoodTime

DATA DICTIONARY
---------------
NAME		TYPE			VALUE RANGE		DESCRIPTION
======== 	=========== 	===========		====================
highGrade	double 			any double 		the highest grade that the user inputs
i 			int 			any int 		the variable for the condition in a for loop
scan 		Scanner 		user input 		allows user input
stud 		int 			any int 		the number of students
studGrade 	array/double	any double 		the letter grade of students
*/
import java.util.Scanner;

public class Program7_1_Jamshasb {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int stud;
		double highGrade = 0;
		double[] studGrade;

		System.out.print("Enter the number of students: ");
		stud = scan.nextInt();

		studGrade = new double[stud];

		System.out.print("Enter " + stud + " scores: ");

		for (int i = 0; i < stud; i++) {
			studGrade[i] = scan.nextDouble();
			if (studGrade[i] > highGrade) {
				highGrade = studGrade[i];
			}
		}

		for (int i = 0; i < stud; i++) {
			System.out.print("Student " + i + " score is " + studGrade[i] + " and grade is ");

			if (studGrade[i] >= highGrade - 10) {
				System.out.println('A');
			} else if (studGrade[i] >= highGrade - 20) {
				System.out.println('B');
			} else if (studGrade[i] >= highGrade - 30) {
				System.out.println('C');
			} else if (studGrade[i] >= highGrade - 40) {
				System.out.println('D');
			} else {
				System.out.println('F');
			}
		}
	}
}