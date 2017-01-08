/* Chapter No. 4 - Exercise No.  7
File Name:          Program4_7_Jamshasb.java
Programmer:         Ashkan Jamshasb
Date Last Modified: Aug. 3, 2016

DATA DICTIONARY
---------------
NAME      TYPE          temp RANGE   DESCRIPTION
========  ===========   ===========   ====================

*/
public class Rooms extends Final_Group_Project {//it extends because it needs to get the room number
	
	public String description = "";
	
	static int[] currnetRoom = new int[4];
	// ROOM -1 IS THE ROOM YOU CANNOT ENTER NOT 0, 0 is the starting room. It was easier because the room array starts with zero...
	//							   n    s   w    e
	static int[][] roomOptions = {{1,  -1, -1,  2}, //room0
							      {-1, -1, -1,  4}, //room1
							      {-1, -1,  0,  3}, //room2
							      {4,  -1, -1, -1}, //room3
							      {5,  -1, -1, -1}, //room4
							      {6,   4, -1, -1}, //room5
							      {11,  5,  7,  9}, //room6
							      {8,  -1, -1,  6}, //room7
							      {-1,  7, -1, 11}, //room8
							      {-1,  -1, 6, 10}, //room9
							      {12,  -1, 9, -1}, //room10
							      {-1,  6,  8, 12}, //room11
							      {-1, 10, 11, -1}  //room12
							     };


	//Sets the current room options
	/*
		Precondition: N/A
		Postcondition: the final score of the grades
	*/	
	public static void declareCurrentRoom() {
		System.arraycopy(roomOptions[roomNum], 0, currnetRoom, 0, 4);
	}
	
	//To change the room number, and keep it the same if the user neters an invalid direction
	/*
		Precondition: N/A
		Postcondition: the final score of the grades
	*/	
	public static int changeRoomNum(boolean good2go, char compass, int currentRoom) {
		if (good2go) {
			return currnetRoom[posFromComp(compass)];//posFromComp returns the position in the array, currentRoom is the array from the current room we are in 
		} else {
			System.out.println("Cannot move there!");
			return currentRoom;
		}
	}

	//To see if the user can go in a directino
	/*
		Precondition: N/A
		Postcondition: the final score of the grades
	*/	
	public static boolean roomsAvaliable(char compass) {
		boolean avaliable = true;
		if (currnetRoom[posFromComp(compass)] == -1) {//Its just easier to use -1 instead of 0, trust me fam
			avaliable = false;
		}
		return avaliable;
	}
	
	//The position in the array that the user is tring to access (PositionFromCompass)
	/*
		Precondition: char compass, the user's choice
		Postcondition: the final score of the grades
	*/	
	public static int posFromComp(char compass) {
		int position = -1; //Default value if (n, s, w, e) wasn't entered. We will add more later
		if (compass == 'n')
			position = 0;
		if (compass == 's')
			position = 1;
		if (compass == 'w')
			position = 2;
		if (compass == 'e')
			position = 3;
		return position;
	}
	
	/*
		Precondition: N/A
		Postcondition: the final score of the grades
	*/	
	public static boolean validEntry(char input) {
		boolean notGood = true;
		
		if(input == 'n' || input == 's' || input == 'w' || input == 'e' ) {
			notGood = false;
		} else {
			System.out.println("**ERROR** Invalid entry...");
		}
		return notGood;			
	}
}