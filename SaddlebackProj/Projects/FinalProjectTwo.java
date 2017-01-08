import java.util.Scanner;

public class FinalProjectTwo {

  
  public static int roomNum = 0;
  
  static Rooms[] room = new Rooms[14];
  
  public static void main(String[] args) {
	for(int i = 0; i < 14; i++)
	  room[i] = new Rooms();
	
	//Monsters in each "room"
	room[0 ].isMonster = false;
	room[1 ].isMonster = false;
	room[2 ].isMonster = false;
	room[3 ].isMonster = false;
	room[4 ].isMonster = false;
	room[5 ].isMonster = false;
	room[6 ].isMonster = false;
	room[7 ].isMonster = true;
	room[8 ].isMonster = false;
	room[9 ].isMonster = true;
	room[10].isMonster = false;
	room[11].isMonster = false;
	room[12].isMonster = true;

	  

    Scanner input = new Scanner(System.in);


    String[][] items = {{" "},           // room0
                       {"Old Pistol"},   // room1
                       {" "},            // room2
                       {"Bag of Gold"},         // room3
                       {"Bronze Key"},   // room4
                       {"Skull"},        // room5
                       {" "},            // room6
                       {"Silver Key"},   // room7
                       {"Strange Meat", "Cup of ale", "Gold"}, // room8
                       {"Deranged Eye", "Gold Key"},           // room9
                       {"Enchanted Ale", "Portable Cannon"},   //room10
                       {" "},            // room11
                       {"Master Key"},   // room12
                       {"Tresaure"}};    // room13
    String[] inventory = new String[15];
    for(int i = 0; i < inventory.length; ++i) {
      inventory[i] = " ";
    }

    System.out.print("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
    // Make some random ass story about the island
    System.out.print("'Tis a dark and stormy night...");
    space();
    System.out.print("You remember the tale of an old tale a man told you in a tavern...");
    space();
    System.out.print("An island so spooky that no man nor pirate would dare travel there!");
    space();
    System.out.print("But alas you are a pirate! YE HAR!! And a pirate always hunts for da booty\n");
    space();

    // Testing game
    System.out.println("Now entering ...");

    while(true) {
        System.out.println("Room num = " + roomNum);
    	Rooms.declareCurrentRoom();
      switch(roomNum) {
      
        case 0: System.out.println("Dead Men Shores\n");
                actionMenu(items, inventory);
                break;
        case 1: System.out.println("Rusty Shack\n");
                actionMenu(items, inventory);
                break;
        case 2: System.out.println("Rickety Bridge\n");
                actionMenu(items, inventory);
                break;
        case 3: System.out.println("Bay of Bones\n");
                actionMenu(items, inventory);
                break;
        case 4: System.out.println("Wandering Trail\n");
                actionMenu(items, inventory);
                break;
        case 5: System.out.println("Weeping Willows\n");
                actionMenu(items, inventory);
                break;
        case 6: System.out.println("Crossroads\n");
                actionMenu(items, inventory);
                break;
        // case 7: room7();
        //         break;
        // case 8: room8();
        //         break;
        // case 9: room9();
        //         break;
        // case 10: room10();
        //          break;
        // case 11: room11();
        //          break;
        // case 12: room12();
        //          break;
        // case 13: room13();
        //          break;
      }     
    }
  }
	


  public static void actionMenu(String[][] items, String[] inv) {
    Scanner input = new Scanner(System.in);
    int num;

    System.out.println("***************");
    System.out.println("    ACTIONS    ");
    System.out.println("***************");
    System.out.println("<1> GO"         );
    System.out.println("<2> GET"        );
    System.out.println("<3> LOOK"       );
    System.out.println("<4> INVENTORY"  );
    System.out.println("<5> DROP"       );
    System.out.println("<6> QUIT"       );
    System.out.println("<7> HELP"       );
    System.out.println("***************");
	System.out.println("  Chose: n   s   w   e");//Remove this after we finish the code, only for testing purposes
	System.out.print("Options: ");//Remove this after we finish the code, only for testing purposes
	for (int i = 0; i < 4; i++) //Remove this after we finish the code, only for testing purposes
		System.out.print(room[0].currnetRoom[i] + ", ");//Choices that the user can move in //Remove this after we finish the code, only for testing purposes
		System.out.println();

    do {
      System.out.print("Choose an action (1-7): ");
      num = input.nextInt();

      if(num < 1 || num > 7) {
        System.out.println("Invalid action number. Choose 1-7");
      }
    } while(num < 1 || num > 7);

    // Switch the input for appropriate method call
    switch(num) {
      case 1: go();
              break;
      case 2: get(items, inv);
              break;
      case 3: look(items);
              break;
      case 4: displayInventory(inv);
              break;
      case 5: drop(inv);
              break;
      case 6: System.out.println("Thanks for playing!");
              System.exit(0);
              break;
      case 7: //call help method;
              break;

    }
    System.out.print("\n\n\n"); // clear screen

  }

  public static void go() {
	  Scanner input = new Scanner(System.in);
	  char userInput;
	  do {
			System.out.println("Enter a direction you would wish to move(n/s/w/e): ");
			userInput = input.nextLine().toLowerCase().charAt(0);//converts their choice into a lowercase char, so if they enter "North", it will still be 'n', "South" will be 's' and so on...
		} while (Rooms.validEntryForMove(userInput));//this is the actual code that validates their entry to make sure they entered a valid character
		roomNum = room[roomNum].changeRoomNum(room[roomNum].roomAvaliable(userInput), userInput, roomNum);

		System.out.println("Now entering...");
  }

  public static void look(String[][] items) {
	    switch(roomNum) {
	      case 0: System.out.print("You see nothing here. Only a lonely beach and a mysterious island ahead.");
	              space();
	              break;

	      case 1: if(items[1][0] == " ") {
	                System.out.print("You see nothing here. Only a lonely shack, rusted by the saliness of the sea...");
	                space();
	                System.out.print("and the tears of adventurers before you.");
	                space();
	               }
	              else {
	                System.out.print("You see and " + items[1][0] + " on the table.");
	                space();
	              }
	              break;

	      case 2: System.out.print("You see an old bridge in disrepair. It looks rickety and unstable as it sways...");
	              space();
	              System.out.print("in the wind and waves crash against the pillars.");
	              space();
	              System.out.print("On the other side of the bridge, there's a small glimpse of a wrecked ship.");
	              space();
	              System.out.print("Cross to the other side? ");
	              space();
	              break;

	      case 3: if(items[3][0] == " ") {
	                System.out.print("You see nothing useful for you to pick up.");
	                space();
	                System.out.print("On the ground there are piles of bones and wrecked ships all around you.");
	                space();
	                System.out.print("You start to feel like a nervous wreck.");
	                space();
	               }
	               else {
	                System.out.print("A faint glimmer of something catches your eye.");
	                space();
	                System.out.print("You make your way over there through a pile of debris and bones.");
	                space();
	                System.out.print("Mother of pearl! It's a " + items[3][0] + "!");
	                space();
	               }
	              break;

	      case 4: System.out.print("You begin to search around for something useful, and then...");
	              space();
	              System.out.print("A spooky ghost appears!");
	              space();
	              System.out.println("           .-.");
	              System.out.println("         .'   `.");
	              System.out.println("         :O O   :");
	              System.out.println("         : o    `.");
	              System.out.println("        :         ``.");
	              System.out.println("       :             `.");
	              System.out.println("      :  :         .   `.");
	              System.out.println("      :   :          ` . `.");
	              System.out.println("       `.. :            `. ``");
	              System.out.println("          `:;             `:'");
	              System.out.println("             :              `.");
	              System.out.println("              `.              `.     .");
	              System.out.println("                `'`'`'`---..,___`;.-'");
	              System.out.println(" ###, ,##, ,##,");
	              System.out.println(" #  # #  # #  #");
	              System.out.println(" ###  #  # #  #");
	              System.out.println(" #  # #  # #  #");
	              System.out.print  (" ###' '##' '##");
	              space();
	              System.out.print("Shiver me timbers!");
	              space();
	              System.out.print("The ghost is carrying something around...");
	              space();
	              System.out.print("It looks like a Bronze Key.");
	              space();
	              break;

	      case 5: System.out.print("You look around and are engulfed by an endless void of trees.");
	              space();
	              System.out.println("            .--.");
	              System.out.println("          .'(`");
	              System.out.println("       __.>\\ '.  _.---,._,'");
	              System.out.println("      /.--.  : |/' _.--.< ");
	              System.out.println("  _..-'    `\\     /'     `'");
	              System.out.println("   >_.-``-. `Y  /' _.---._____");
	              System.out.println("  '` .-''. \\|:  \\.'   ___, .-'`");
	              System.out.println("   .'--._ `-:  \\/   /'    \\\\");
	              System.out.println("       /.'`\\ :;    /'       `-.");
	              System.out.println("      -`    |     |");
	              System.out.println("            :.; : |");
	              System.out.println("            |:    |");
	              System.out.println("            |     |");
	              System.out.println("            :. :  |");
	              System.out.println("           .      ;");
	              System.out.println("          /:::.    `\\");
	              System.out.print("The place is littered with bones of dead animals and travelers before you.");
	              space();
	              System.out.print("A Skull atop of a rock looks somewhat interesting.");
	              space();
	              System.out.print("The wind brushes through the trees making a wailing sound.");
	              space();
	              System.out.print("An unsettling feeling washes over you...");
	              space();
	              break;
	      case 6: System.out.print("Looking north, east, south and west there are roads leading in each direction");
	              space();
	              System.out.print("To the north is a gate.");
	              space();
	              System.out.print("To the east is a dark cave.");
	              space();
	              System.out.print("To the south is a forest.");
	              space();
	              System.out.print("To the west is a cove");
	              space();
	              break;


	    }

	  }

  public static void get(String[][]items, String[] inv) { 
	    Scanner input = new Scanner(System.in);
	    String s;

	    switch(roomNum) {
	      case 0: System.out.print("There is nothing to get here ...");
	              space();
	              System.out.print("ONLY FOR YOU TO GET LOST!!! ... says an eerie voice");
	              space();
	              System.out.print("You feel a cold breeze go over you.");
	              space();
	              break;

	      case 1: s = getString();

	              if(s.equalsIgnoreCase(items[1][0])) {
	                System.out.print("You pick up an " + items[1][0] + " and place it into your inventory.");
	                space();
	                inv[0] = items[1][0];
	                items[1][0] = " ";
	              }
	              else {
	                System.out.print("Couldn't pick up anything. Just like no one will pick you up from this SPOOKY island!");
	                space();
	                System.out.print("The thought of this affects your psyche.");
	                space();
	                System.out.print("There's no turning back now. I must find Doubloons! YE HAR!");
	                space();
	              }
	              break;

	      case 2: System.out.print("There is nothing to get here ...");
	              space();
	              break;

	      case 3: s = getString();

	              if(s.equalsIgnoreCase(items[3][0])) {
	                System.out.print("You pick up a " + items[3][0] + " and place it into your inventory.");
	                space();
	                System.out.print("*Cha-ching!*");
	                space();
	                inv[1] = items[3][0];
	                items[3][0] = " ";
	              }
	              else {
	                System.out.print("Couldn't pick up anything.");
	                space();
	                System.out.print("Son of a Biscuit Eater!");
	                space();
	              }
	              break;

	      case 4: s = getString();

	              if(s.equalsIgnoreCase(items[4][0])) {
	                System.out.print("Picked up a " + items[4][0] + " and place it into your inventory.");
	                space();
	                System.out.print("A bronze key... I wonder if there are more keys around? Maybe");
	                space();
	                inv[2] = items[4][0];
	                items[4][0] = " ";
	              }
	              else {
	                System.out.print("Couldn't find anything useful to pick up.");
	              }
	              break;

	      case 5: s = getString();

	              if(s.equalsIgnoreCase(items[5][0])) {
	                System.out.print("Picked up a " + items[5][0] + " and place it into your inventory.");
	                space();
	                System.out.print("I don't know why I picked up this skull, it's pretty weird.");
	                space();
	                System.out.print("I guess I'll add it to my knick knack collection.");
	                space();
	                inv[3] = items[5][0];
	                items[5][0] = " ";
	              }
	              else {
	                System.out.print("Couldn't find anything useful to pick up.");
	              }
	              break;

	      case 6: System.out.print("There is nothing useful here to pick up. Only to get moving in a direction");
	              break;

	      case 7: s = getString();

	              if(s.equalsIgnoreCase(items[7][0])) {
	                System.out.print("Picked up a " + items[6][0] + " and place it into your inventory.");
	                space();
	                System.out.print("This looks like an important item. Maybe there are more around");
	              }


	    }
	  }

  // Drop method - Finished? 
  public static void drop(String[] inv) {
	    Scanner input = new Scanner(System.in);
	    String word;
	    boolean isDropped = false;

	    System.out.print("Are you sure you want to drop an item? It will be sent to Davey Jones Locker...\n");
	    System.out.print("and be lost forever! Mother of Coral!");
	    space();
	    System.out.print("Type item to drop: ");
	    word = input.nextLine();

	    for(int i = 0; i < inv.length; ++i) {
	      if(word.equalsIgnoreCase(inv[i].toUpperCase())) {
	        System.out.println(inv[i] + " dropped.");
	        inv[i] = " ";
	        isDropped = true;
	        break;
	      }
	      else {
	        isDropped = false;
	      }
	    }

	    if(!isDropped) System.out.println("Could not drop item");
	  }

  // Displays inventory - Finished
  public static void displayInventory(String[] inv) {
    System.out.print("Inventory contents: ");
    for(int i = 0; i < inv.length; ++i) {
      if(inv[i] != null || inv[i] == " ") {
        System.out.println(inv[i]);
      }
    }
  }


  public static String getString() {
    Scanner input = new Scanner(System.in);
    System.out.print("Type items to get: ");
    String s = input.nextLine();
    return s;
  }
  
  // Starting area Dead Men Shores room 0
  public static void room0(String[][] items, String[] inv) {
    System.out.println("Dead Men Shores\n");
    actionMenu(items, inv);
  }

 
  // Use after a sentence of dialogue, user presses enter to see next line of dialogue
  public static void space() {
    Scanner x = new Scanner(System.in);
    x.nextLine();
  }
  static class Rooms {//it extends because it needs to get the room number
		

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
								      {-1, 13, 11, -1}, //room12
								      {-1, -1, -1, -1}  //room13
								     };
		boolean isMonster;

		//Sets the current room movement options
		public static void declareCurrentRoom() {
			System.arraycopy(roomOptions[roomNum], 0, currnetRoom, 0, 4);
		}
		
		//To change the room number, and keep it the same if the user enters an invalid direction
		public static int changeRoomNum(boolean good2go, char compass, int currentRoom) {
			if (good2go) {
				return currnetRoom[posFromComp(compass)];//posFromComp returns the position in the array, currentRoom is the array from the current room we are in 
			} else {
				System.out.println("Cannot move there!");
				return currentRoom;
			}
		}

		//To see if the user can go in a direction
		public static boolean roomAvaliable(char compass) {
			boolean avaliable = true;
			if (currnetRoom[posFromComp(compass)] == -1) {//Its just easier to use -1 instead of 0, trust me fam
				avaliable = false;
			}
			return avaliable;
		}
		
		//The position in the array that the user is trying to access (PositionFromCompass)
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
		
		public static boolean validEntryForMove(char input) {
			boolean badChoice = true;
			
			if(input == 'n' || input == 's' || input == 'w' || input == 'e' ) {
				badChoice = false;
			}
			return badChoice;	
		}
	}
}