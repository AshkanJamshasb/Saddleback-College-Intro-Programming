/* Chapter No. 7 - Exercise No.  6
File Name:          Person.java
Programmer:         Ashkan Jamshasb
Date Last Modified: Aug. 8, 2016

DATA DICTIONARY
---------------
NAME		TYPE			VALUE RANGE		DESCRIPTION
======== 	=========== 	===========		====================
name 		String 			any String 		the name of the person
*/
public class Person {
	private String name;
	public Person() {

	}
	/*
		Precondition: the name of the person
		Postcondition: the name of the person
	*/
	public Person(String theName) {
		name = theName;
	}
	/*
		Precondition: the object of the person
		Postcondition: the object of the person
	*/
	public Person(Person theObject) {
		name = theObject.name;
	}
	/*
		Precondition: N/A
		Postcondition: the name of the person
	*/
	public String getName() {
		return name;
	}
	/*
		Precondition: the new name of the person
		Postcondition: the new name of the person
	*/
	public void setName(String theName) {
		name = theName;
	}
	/*
		Precondition: N/A
		Postcondition: convets the name into a string
	*/
	public String toString() {
		return "Name: " + name;
	}
	/*
		Precondition: the object of the comparison 
		Postcondition: a boolean value if they are the same or not
	*/
	public boolean equals(Object other) {
		return this.toString().equals(other.toString());
	}
}