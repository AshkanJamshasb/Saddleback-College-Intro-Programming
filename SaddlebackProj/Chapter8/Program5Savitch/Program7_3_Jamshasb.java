/* Chapter No. 7 - Exercise No.  3
File Name:          Program7_3_Jamshasb.java
Programmer:         Ashkan Jamshasb
Date Last Modified: Aug. 8, 2016

Problem Statement: To calculate the damage from certain types of aliens

Overall Plan:
1. Prompt the user to enter the amount of aliens he wants
2. runs through a for-loop a certain amount of times until the condition is met, storing the values for the aliens along the way
3. calculates the damage from all the aliens
4. prints the values to the user

Classes needed and Purpose (Input, Processing, Output)
Alien - to provide functionality to the aliens
AlienPack - to store the values of all the types of aliens

DATA DICTIONARY
---------------
NAME		TYPE			VALUE RANGE		DESCRIPTION
======== 	=========== 	===========		====================
aliens 		AlienPack		object 			the object for the type of alien
mello 		MarshmallowMan 	object 			the object for a marshmallow alien
numAliens 	int 			any int 		the number of aliens the user wants to input
oge 		OgreAlien 		object 			the object for an ogre alien
scan 		Scanner 		user input 		allows user input
snake 		SnakeAlien 		object 			the object for a snake alien
userChoice 	int 			1-3				the number for the type of alien the user wants
*/
import java.util.Scanner;

public class Program7_3_Jamshasb {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		AlienPack aliens;
		int numAliens, userChoice;

		MarshmallowMan mello;
		SnakeAlien snake;
		OgreAlien oge;


		System.out.print("Set the number of aliens you want to fight: ");
		numAliens = scan.nextInt();
		aliens = new AlienPack(numAliens);
		scan.nextLine();

		for (int i = 0; i < numAliens; i++) {
			do {
				System.out.println("What type of alien is in spot " + (i+1) + "?\n1. Snake\n2. Ogre\n3. Marshmellow\n------------------");
				userChoice = scan.nextInt();
				if (userChoice < 1 || userChoice > 3) {
					System.out.println("**ERROR** Invalid input...");
				} else {
					break;
				}
			} while (true);
			switch (userChoice) {
				case 1:
					snake = new SnakeAlien(10, "Snake");
					aliens.addAlien(snake, i);
					break;
				case 2:
					oge = new OgreAlien(6, "Ogre");
					aliens.addAlien(oge, i);
					break;
				case 3:
					mello = new MarshmallowMan(1, "Mello");
					aliens.addAlien(mello, i);
					break;
				default:
					break;
			}
		}
		System.out.println("The aliens in this pack are");
		Alien[] alienss = aliens.getAliens();

		for(Alien e : alienss) {
			System.out.println(e.getName() + " with health of " + e.getHealth());
		}

		System.out.println("Total damage done by this pack is : " + aliens.calculateDamage());

	}
}

