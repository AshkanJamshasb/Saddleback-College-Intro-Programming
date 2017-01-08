/* Chapter No. N/A - Exercise No. N/A
File Name:          Final_Group_Project_Jamshasb.java
Programmer:         Ashkan Jamshasb
Date Last Modified: Aug. 1, 2016

Problem Statement: 

Overall Plan:
1. 
2. 
3. 
4. 
5. 

Classes needed and Purpose (Input, Processing, Output)
main class - GoodTime

DATA DICTIONARY
---------------
NAME		TYPE			VALUE RANGE		DESCRIPTION
======== 	=========== 	===========		====================

scan 		Scanner 		user input 		allows user input

*/
import java.util.Scanner;

public class Final_Group_Project {

	public static int roomNum = 0;//I made this variable static so it can be accessed in any class
	
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		Rooms[] room = new Rooms[13];

		boolean playGame = true;

		char direction;

		room[0] = new Rooms();
		room[1] = new Rooms();
		room[2] = new Rooms();
		room[3] = new Rooms();
		room[4] = new Rooms();
		room[5] = new Rooms();
		room[6] = new Rooms();
		room[7] = new Rooms();
		room[8] = new Rooms();
		room[9] = new Rooms();
		room[10] = new Rooms();
		room[11] = new Rooms();
		room[12] = new Rooms();
		
		//Descriptions for each "room"
		room[0 ].description = "Room 0: Starting Beach. Has the option to go north or east.";
		room[1 ].description = "Room 1: Broken Shack. There is a pistol in this room";
		room[2 ].description = "Room 2: Sketch Bridge. Prompt the user to see if he wants to cross. If he crosses, he is fine, just the bridge breaks after he goes across is and he cannot go back";
		room[3 ].description = "Room 3: Dead Pirate. Possible gold and weapon pickup";
		room[4 ].description = "Room 4: Ghost Spotting. Drops poop option";
		room[5 ].description = "Room 5: Boney Forest. Looks and sees skeletons and can pick up the skull";
		room[6 ].description = "Room 6: Cross Road. Three different directions in which the user can move";
		room[7 ].description = "Room 7: Skeleton Battle. Spawn of three undead";
		room[8 ].description = "Room 8: Old Tavern. Has the option to pick up rotten food. User has a 50/50 chance of getting posioned (lose some health)??";
		room[9 ].description = "Room 9: Bear Cave. Battle a monster bear";
		room[10].description = "Room10: Witch Hut. Finds ale and has the option to drink it. If the user drinks it he will restore 50% of his lost health";
		room[11].description = "Room11: Spooky Gate. No idea what we want here...";
		room[12].description = "Room12: Caste. Boss fight, Black Beard 'bout to be my bitch";
		
		//The loop for the user
		do {
			Rooms.declareCurrentRoom();
			System.out.println(room[roomNum].description);//Remove this after we finish the code, only for testing purposes
			System.out.println("  Chose: n   s   w   e");//Remove this after we finish the code, only for testing purposes
			System.out.print("Options: ");//Remove this after we finish the code, only for testing purposes
			for (int i = 0; i < 4; i++) //Remove this after we finish the code, only for testing purposes
				System.out.print(room[0].currnetRoom[i] + ", ");//Choices that the user can move in //Remove this after we finish the code, only for testing purposes
				System.out.println();//Spacing //Remove this after we finish the code, only for testing purposes
			
			//Check to make sure there is a valid entry. So far all I have is n/s/w/e. We will add more to the condition later on once we figure out the inventory and such
			do {
				System.out.println("Enter a direction you would wish to move(n/s/w/e): ");
				direction = scan.nextLine().toLowerCase().charAt(0);//converts their choice into a lowercase char, so if they enter "North", it will still be 'n', "South" will be 's' and so on...
			} while (Rooms.validEntry(direction));//this is the actual code that validates their entry to make sure they entered a valid character
			
			//update the room number after the user has changed their room
			roomNum = room[roomNum].changeRoomNum(room[roomNum].roomsAvaliable(direction), direction, roomNum);
			
		} while (playGame);

	}
}