/* Chapter No. 7 - Exercise No.  3
File Name:          Alien.java
Programmer:         Ashkan Jamshasb
Date Last Modified: Aug. 3, 2016

DATA DICTIONARY
---------------
NAME		TYPE			VALUE RANGE		DESCRIPTION
======== 	=========== 	===========		====================
health 		int 			any int 		the health of a certain alien
name 		String 			any String 		the name of the alien 
*/
public class Alien {

	private int health;
	private String name;

	/*
		Precondition: N/A
		Postcondition: the constructor if there are no conditions
	*/	
	public Alien () {
		health = 0;
		name = "nothing";
	}

	/*
		Precondition: the health and the name of an alien
		Postcondition: the constructor if there is a health and name
	*/	
	public Alien (int health, String name) {
		this.health = health;
		this.name = name;
	}

	/*
		Precondition: N/A
		Postcondition: the damage of nothing...
	*/	
	public int getDamage() {
		return 0;
	}

	/*
		Precondition: N/A
		Postcondition: the name of the alien
	*/	
	public String getName() {
		return name;
	}

	/*
		Precondition: N/A
		Postcondition: the health of the alien
	*/	
	public int getHealth() {
		return health;
	}
}

class SnakeAlien extends Alien {
	
	/*
		Precondition: N/A
		Postcondition: the constructor if there are no conditions
	*/	
	SnakeAlien () {
		super();
	}

	/*
		Precondition: the health and the name of an alien
		Postcondition: the constructor if there is a health and name
	*/		
	SnakeAlien (int health, String name) {
		super(health, name);
	}
	
	/*
		Precondition: N/A
		Postcondition: the damage of the snake
	*/	
	public int getDamage() {
		return 10;
	}
}

class OgreAlien extends Alien {
	
	/*
		Precondition: N/A
		Postcondition: the constructor if there are no conditions
	*/	
	OgreAlien () {
		super();
	}
	
	/*
		Precondition: the health and the name of an alien
		Postcondition: the constructor if there is a health and name
	*/	
	OgreAlien (int health, String name) {
		super(health, name);
	}
	
	/*
		Precondition: N/A
		Postcondition: the damage of the snake ogre
	*/	
	public int getDamage() {
		return 6;
	}
}

class MarshmallowMan extends Alien {

	
	/*
		Precondition: N/A
		Postcondition: the constructor if there are no conditions
	*/	
	MarshmallowMan () {
		super();
	}
	
	/*
		Precondition: the health and the name of an alien
		Postcondition: the constructor if there is a health and name
	*/		
	MarshmallowMan (int health, String name) {
		super(health, name);
	}
	
	/*
		Precondition: N/A
		Postcondition: tthe damage of the snake marshmallow
	*/	
	public int getDamage() {
		return 1;
	}
}



