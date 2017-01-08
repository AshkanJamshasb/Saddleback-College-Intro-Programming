/* Chapter No. 5 - Exercise No.  2
File Name:          Program5_2_Jamshasb.java
Programmer:         Ashkan Jamshasb
Date Last Modified: Aug. 8, 2016

Problem Statement: To create pets and to check if the pets are the same

Overall Plan:
1. Prompt the user to enter the pets and their information
2. Have certain methods that get the oldest/youngest/lightest/heaviest of the pets
3. print the information to the user
4. checks if any of the pets are the same
5. prints that information to the user

Classes needed and Purpose (Input, Processing, Output)
Pet.java - 	it has certain methods that help create and store values for pets

DATA DICTIONARY
---------------
NAME      	TYPE          	RANGE  	 		DESCRIPTION
========  	===========   	===========   	====================
age 		int 			any int 		the value for the age of the pet
scan 		Scanner 		user Input 		allows user input
i 			int 			any int 		the variable for the condition for the for loop
pet[] 		object/array 	any object 		it is the array for all the pets
weight 		double 			any double 		the value for the weigh of the pet
*/
import java.util.Scanner;

public class Program_5_2_Jamshasb {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		Pet[] pet = new Pet[5];
		for (int i = 0; i < 5; i++)
			pet[i] = new Pet();

		int age;
		double weight;


		System.out.print("Enter five pet names: ");
		for (int i = 0; i < 5; i++) {
			pet[i].setName(scan.nextLine());
		}
		for (int i = 0; i < 5; i++) {
			do {
				System.out.print("What is the age of: " + pet[i].getName() + ": ");
				age = scan.nextInt();
				if (age >= 0) {
					pet[i].setAge(age);
					scan.nextLine();//clear the console
					break;
				} else {
					System.out.println("**ERROR** Age has to be greater than or equal to zero...");
				}
			} while (true);
		}
		for (int i = 0; i < 5; i++) {
			do {
				System.out.print("What is the weight of: " + pet[i].getName() + ": ");
				weight = scan.nextDouble();
				if (weight > 0) {
					pet[i].setWeight(weight);
					scan.nextLine();//clear the console	
					break;
				} else {
					System.out.println("**ERROR** Weight has to be greater than zero...");
				}
			} while (true);
		}

		System.out.println("The smallest pet is " + pet[smallPet(pet)].getName());
		System.out.println("The largest pet is " + pet[largePet(pet)].getName());
		System.out.println("The average age is " + aveAge(pet));
		System.out.println("The oldest pet is " + pet[oldPet(pet)].getName());
		System.out.println("The youngest pet is " + pet[youngPet(pet)].getName());
		System.out.println("The weight age is " + aveWeight(pet));
		checkName(pet);
	}

	/************************************************/
	/* Name: smallPet(Pet[] weight) 			 	*/
	/************************************************/
	/* Purpose: To find the place where the smallest weight occurs */
	/* Parameters: 									*/
	/*	Pet[] weight 								*/
 	/* Return: the place where the smallest weight occurs */
	/************************************************/
	/* Data dictionary 
	--------------------------------------------------	
	NAME		TYPE			VALUE RANGE		DESCRIPTION
	======== 	=========== 	===========		====================
	i 			int 			any int 		the variable for the condition for the for loop
	petWeight 	double 			any double 		the weight of the pet
	place 		int 			any int 		the place at which the smallest weight occures
	*/
	public static int smallPet(Pet[] weight) {
		int place = 0;
		double petWeight = weight[place].getWeight();
		for (int i = 0; i < 5; i++) {
			if (petWeight >= weight[i].getWeight()) {
				petWeight = weight[i].getWeight();
				place = i;
			}
		}
		return place;
	}

	/************************************************/
	/* Name: largePet(Pet[] weight) 			 	*/
	/************************************************/
	/* Purpose: To find the place where the smallest weight occurs */
	/* Parameters: 									*/
	/*	Pet[] weight 								*/
 	/* Return: the place where the largest weight occurs */
	/************************************************/
	/* Data dictionary 
	--------------------------------------------------	
	NAME		TYPE			VALUE RANGE		DESCRIPTION
	======== 	=========== 	===========		====================
	i 			int 			any int 		the variable for the condition for the for loop
	petWeight 	double 			any double 		the weight of the pet
	place 		int 			any int 		the place at which the largest weight occures
	*/
	public static int largePet(Pet[] weight) {
		int place = 0;
		double petWeight = weight[place].getWeight();
		for (int i = 0; i < 5; i++) {
			if (petWeight <= weight[i].getWeight()) {
				petWeight = weight[i].getWeight();
				place = i;
			}
		}
		return place;
	}

	/************************************************/
	/* Name: youngPet(Pet[] weight) 			 	*/
	/************************************************/
	/* Purpose: To find the place where the smallest age occurs */
	/* Parameters: 									*/
	/*	Pet[] age 									*/
 	/* Return: the place where the smalled weight occurs */
	/************************************************/
	/* Data dictionary 
	--------------------------------------------------	
	NAME		TYPE			VALUE RANGE		DESCRIPTION
	======== 	=========== 	===========		====================
	i 			int 			any int 		the variable for the condition for the for loop
	petAge 	 	double 			any double 		the age of the pet
	place 		int 			any int 		the place at which the smallest age occures
	*/
	public static int youngPet(Pet[] age) {
		int place = 0;
		int petAge = age[place].getAge();
		for (int i = 0; i < 5; i++) {
			if (petAge >= age[i].getAge()) {
				petAge = age[i].getAge();
				place = i;
			}
		}
		return place;
	}

	/************************************************/
	/* Name: oldPet(Pet[] age) 			 	*/
	/************************************************/
	/* Purpose: To find the place where the largest age occurs */
	/* Parameters: 									*/
	/*	Pet[] age 								*/
 	/* Return: the place where the largest age occurs */
	/************************************************/
	/* Data dictionary 
	--------------------------------------------------	
	NAME		TYPE			VALUE RANGE		DESCRIPTION
	======== 	=========== 	===========		====================
	i 			int 			any int 		the variable for the condition for the for loop
	petAge 		double 			any double 		the age of the pet
	place 		int 			any int 		the place at which the largest age occures
	*/
	public static int oldPet(Pet[] age) {
		int place = 0;
		int petAge = age[place].getAge();
		for (int i = 0; i < 5; i++) {
			if (petAge <= age[i].getAge()) {
				petAge = age[i].getAge();
				place = i;
			}
		}
		return place;
	}

	/************************************************/
	/* Name: aveWeight(Pet[] age) 			 	*/
	/************************************************/
	/* Purpose: To find the average weight 			*/
	/* Parameters: 									*/
	/*	Pet[] weight								*/
 	/* Return: the average weight 					*/
	/************************************************/
	/* Data dictionary 
	--------------------------------------------------	
	NAME		TYPE			VALUE RANGE		DESCRIPTION
	======== 	=========== 	===========		====================
	i 			int 			any int 		the variable for the condition for the for loop
	aveWeight 	double 			any double 		the average weight of the pets
	*/
	public static double aveWeight(Pet[] weight) {
		double aveWeight = 0;
		for (int i = 0; i < 5; i++) {
			aveWeight += weight[i].getWeight();
		}
		return aveWeight/5;
	}

	/************************************************/
	/* Name: aveAge(Pet[] age) 			 	*/
	/************************************************/
	/* Purpose: To find the average age 			*/
	/* Parameters: 									*/
	/*	Pet[] age								*/
 	/* Return: the average age 					*/
	/************************************************/
	/* Data dictionary 
	--------------------------------------------------	
	NAME		TYPE			VALUE RANGE		DESCRIPTION
	======== 	=========== 	===========		====================
	i 			int 			any int 		the variable for the condition for the for loop
	aveWeight 	double 			any double 		the average age of the pets
	*/
	public static double aveAge(Pet[] age) {
		double aveAge = 0;
		for (int i = 0; i < 5; i++) {
			aveAge += age[i].getAge();
		}
		return aveAge/5;
	}

	/************************************************/
	/* Name: checkName(Pet[] age) 			 	*/
	/************************************************/
	/* Purpose: To check if he pets are the same 	*/
	/* Parameters: 									*/
	/*	Pet[] pet 									*/
 	/* Return: N/A 									*/
	/************************************************/
	/* Data dictionary 
	--------------------------------------------------	
	NAME		TYPE			VALUE RANGE		DESCRIPTION
	======== 	=========== 	===========		====================
	i 			int 			any int 		the variable for the condition for the for loop
	j 			int 			any int 		the variable for the condition for the for loop
	pets[] 		String/array 	any Strings 	the information of the pets stored as a string
	*/
	public static void checkName(Pet[] pet) {
		String[] pets = new String[5];
		for (int i = 0; i < 5; i++) {
			for (int j = i; j < 5; j++) {
				if (i != j) {
					System.out.println("Got here");

					if (pet[i].toString().equals(pet[j].toString())) {
						System.out.println("Pet " + (i + 1) + " is the same as pet " + (j + 1));
					}
				}
			}		
		}
	}
}