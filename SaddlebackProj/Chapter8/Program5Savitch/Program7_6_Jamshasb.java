/* Chapter No. 7 - Exercise No.  6
File Name:          Program7_6_Jamshasb.java
Programmer:         Ashkan Jamshasb
Date Last Modified: Aug. 8, 2016

Problem Statement: To display data about a truck

Overall Plan:
1. Call a class that will get the type of truck there is
2. it will run a series of events that will convert and change the values of values in each class
3. converts the materials into a string
4. prints the string to the user

Classes needed and Purpose (Input, Processing, Output)
Vehicle - store information about a vehicle
Truck - extends off of the Vehicle class, contains more specific information about the truck
Person - contains information about the owner

DATA DICTIONARY
---------------
NAME		TYPE			VALUE RANGE		DESCRIPTION
======== 	=========== 	===========		====================
scan 		Scanner 		user input 		allows user input
*/
public class Program7_6_Jamshasb {

	public static void main(String[] args) {
		Truck ramF150 = new Truck(new Person("Rammer"), "Greg", 10, 20, 2000); 

		System.out.println(ramF150.toString());
	}
}



