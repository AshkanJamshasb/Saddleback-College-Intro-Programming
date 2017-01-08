/* Chapter No. 4 - Exercise No.  6
File Name:          Program4_6_Jamshasb.java
Programmer:         Ashkan Jamshasb
Date Last Modified: Aug. 3, 2016

Problem Statement: To get the final grade given quizes, midterms, and final exams

Overall Plan:
1. Prompt the user to enter the three quizes
2. Prompt the user to enter the midterm
3. Prompt the user to enter the final grade
4. run some calculations to see the final grade
5. go though if statements to give a letter grade

Classes needed and Purpose (Input, Processing, Output)
Student - to store and give the values to the student
DATA DICTIONARY
---------------
NAME		TYPE			VALUE RANGE		DESCRIPTION
======== 	=========== 	===========		====================
scan 		Scanner 		user input 		allows user input
stud 		Student 		an object 		the object for the student
*/
import java.util.Scanner;
public class Program4_6_Jamshasb {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		Student stud = new Student();
		
		for (int i = 1; i <= 3; i++) {
			do {
				System.out.print("Enter score for quiz " + i + " (0-10): ");
				stud.quizes = scan.nextDouble();
				if(stud.quizes >= 0 && stud.quizes <= 10) {
					stud.quiz += stud.quizes;
					break;
				} else {
					System.out.println("**ERROR** Invalid input.");
				}
			} while(true);
		}

		do {
			System.out.print("Enter the midterm grade(0-100): ");
			stud.midterm = scan.nextDouble();
			if(stud.midterm >= 0 && stud.midterm <= 100) {
				break;
			} else {
				System.out.println("**ERROR** Invalid input.");
			}
		} while(true);

		do{
			System.out.print("Enter the final exam grade(0-100): ");
			stud.finalExam = scan.nextDouble();
			if(stud.finalExam >= 0 && stud.finalExam <= 100) {
				break;
			} else {
				System.out.println("**ERROR** Invalid input.");
			}
		} while(true);

		System.out.printf("The letter grade is %c, your percentage is %3.2f%%\n", stud.letterGrade(), stud.setFinalScore());
	}
}

/* Chapter No. 4 - Exercise No.  6
File Name:          Program4_6_Jamshasb.java
Programmer:         Ashkan Jamshasb
Date Last Modified: Aug. 3, 2016

DATA DICTIONARY
---------------
NAME		TYPE			VALUE RANGE		DESCRIPTION
======== 	=========== 	===========		====================
finalExam 	double 			0-100 			the final grade of the exams
letGrade 	char 			A,B,C,D,F 		the letter grade of the exams
midterm 	double 			0-100 			the grade from the midterm
quiz 		double 			0-30 			the grade on all the quizes
quizes 		double 			0-10 			the grade on just one of the quizes		
*/
class Student {
	
	double quiz, quizes, midterm, finalExam;
	char letGrade;

	Student() {
		quiz = quizes = midterm = finalExam = 0;
	}

	/*
		Precondition: N/A
		Postcondition: the final score of the grades
	*/	
	public double setFinalScore() {
		return (((quiz*10)/3)*0.25)+(midterm*0.35)+(finalExam*0.40); 
	}

	/*
		Precondition: N/A
		Postcondition: the character of the grade	
	*/	
	char letterGrade() {
		if (setFinalScore() >= 90){
			letGrade = 'A';
		} else if (setFinalScore() >= 80) {
			letGrade = 'B';
		} else if (setFinalScore() >= 70) {
			letGrade = 'C';
		} else if (setFinalScore() >= 60) {
			letGrade = 'D';
		} else {
			letGrade = 'F';
		}
		return letGrade;
	}

	/*
		Precondition: N/A
		Postcondition: the interger as a string	
	*/	
	public String toString() {
		return Integer.toString(letGrade);
	}

	/*
		Precondition: The variable that is going to be compared to a string
		Postcondition: A boolean value to see if they are equal
	*/	
	boolean equals(Counter num1) {
		return (this.toString().equals(num1.toString()));
	}
}




