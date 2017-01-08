/* Chapter No. 7 - Exercise No.  6
File Name:          Truck.java
Programmer:         Ashkan Jamshasb
Date Last Modified: Aug. 8, 2016

DATA DICTIONARY
---------------
NAME		TYPE			VALUE RANGE		DESCRIPTION
======== 	=========== 	===========		====================
capacityLBS int 			any int 		the capacity in pounds that the truck can haul
capacityTon double 			any double 		the capacity in tons that the truck can haul
*/
public class Truck extends Vehicle {
	private double capacityTon;
	private int capacityLBS;

	Truck (Person owner, String name, int cylinders, double loadCapacity, int towCapacity) {
		super(name, cylinders, owner);
		capacityTon = loadCapacity;
		capacityLBS = towCapacity;
	}

	/*
		Precondition: N/A
		Postcondition: the capctiy in tons
	*/
	public double getLoadCapaciy() {
		return capacityTon;
	}

	/*
		Precondition: the new capctiy in tons
		Postcondition: the capctiy in tons 
	*/
	public void setLoadCapacity(double newLoad) {
		capacityTon = newLoad;
	}

	/*
		Precondition: N/A
		Postcondition: the capctiy in lbs
	*/
	public int getTowCapaciy() {
		return capacityLBS;
	}

	/*
		Precondition: the new capcity in lbs
		Postcondition: the capctiy in lbs
	*/
	public void setTowCapacity(int newTow) {
		capacityLBS = newTow;
	}

	/*
		Precondition: N/A
		Postcondition: the string of everything
	*/
	public String toString() {
		return "Name: "+super.getName()+"|| Load Capacity: "+capacityTon+"|| Tow Capacity: "+capacityLBS;
	}
}