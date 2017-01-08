/* Chapter No. 7 - Exercise No.  3
File Name:          AlienPack.java
Programmer:         Ashkan Jamshasb
Date Last Modified: Aug. 8, 2016

DATA DICTIONARY
---------------
NAME		TYPE			VALUE RANGE		DESCRIPTION
======== 	=========== 	===========		====================
aliens 		object/array 	any objects 	the array of different aliens
*/
public class AlienPack {
	private Alien[] aliens;

	/*
		Precondition: the number of aliens there are
		Postcondition: an array with a certain amount of aliens
	*/	
	public AlienPack (int numAliens) {
		aliens = new Alien[numAliens];
	}

	/*
		Precondition: the new type of alien and the place in the array the alien goes
		Postcondition: a nicely sorted array of aliens in a certain place
	*/	
	public void addAlien(Alien newAlien, int index) {
		aliens[index] = newAlien;
	}

	/*
		Precondition: N/A
		Postcondition: gets all the aliens
	*/	
	public Alien[] getAliens() {
		return aliens;
	}

	/*
		Precondition: N/A
		Postcondition: calculates the damage from all the aliens
	*/	
	public int calculateDamage() {
		int damage = 0;

		for (Alien e : aliens)
			damage += e.getDamage();

		return damage;
	}
}