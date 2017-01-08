/* Chapter No. 7 - Exercise No.  6
File Name:          Vehicle.java
Programmer:         Ashkan Jamshasb
Date Last Modified: Aug. 8, 2016

DATA DICTIONARY
---------------
NAME		TYPE			VALUE RANGE		DESCRIPTION
======== 	=========== 	===========		====================
name 		String 			any String 		the name of the owner
numOfCylinders int 			any int 		the number of cylanders
owner 		Person 			object 			the object for the owner of the vehicle
*/
public class Vehicle {

	private Person owner = new Person();
	private String name;
	private int numOfCylinders;

	/*
		Precondition: the name, number of cylanders, and the object of the person
		Postcondition: the new values of the conditions
	*/
	Vehicle(String manName, int cylinders, Person person) {
		owner = person;
		name = manName;
		numOfCylinders = cylinders;
	}

	/*
		Precondition: N/A
		Postcondition: the name of the person
	*/
	public String getName() {
		return name;
	}
}