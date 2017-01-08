/*****************************************************************************************************
                        FINAL PROJECT 
  File Name     : SpookyPirates
  Programmer    : .datOneGroup -  Alec Castaneda, Ash Jamshasb, Charles Prescott, Nathan Nhek
  Due Date      : Wed. August 10, 2016

  Problem Statement: 
  You are a lone pirate on an adventure hunting for treasure on an island, that is SPOOOOKY

  Overall Plan: 
  1. Create an array of 14 room objects used to navigate throughout the map
  2. Keep track of where the player is in the map
  3. Allow player to navigate north east south or west based on their position
  4. Display a command window for the user to use to do actions
  5. Different rooms will display different dialogue and have different items to pick up
  6. Create a combat system where the player will have to fight at least 1 enemy or 3 enemies max
  7. Defeating the enemies is a key part to winning the game
  8. To win, player must have all keys to open the treasure chest after the boss battle

  Classes needed and Purpose (Input, Processing, Output)
  main class -   Spooky Pirates
  sub class  -   Room - help navigate through the map
  sub class  -   Enemy - enemy information
   
  DATA DICTIONARY (ALPHABETICAL)
  ---------------
  ***********
  *CONSTANTS*
  ***********
  NAME   TYPE      VALUE RANGE  DESCRIPTION
  ====== =======   ===========  ============================================
  NONE
   
  ***********
  *VARIABLES*
  ***********
  NAME         TYPE               VALUE RANGE DESCRIPTION
  ============ ================== =========== =============================
  bear         Enemy              NA          Enemy object
  blackBeard   Enemy              NA          Enemy object
  input        Scanner            NA          used for input
  playerDamage static int         5 - any int amount of damage player can
                                               do
  playerHealth private static int 0 - 100     player health
  room         Rooms[]            NA          room objects for the map,
                                               there are 14 rooms
  roomNum      private static int 0 - 13      player's current position
                                               in the map
  skeleton     Enemy              NA          Enemy object
  totalGold    private static int any int     amount of gold player has 
************************************************************************************************/
import java.util.Scanner;
import java.util.InputMismatchException;

public class SpookyPirates {
  
  public static int roomNum = 0;
  public static int playerHealth = 100;
  public static int totalGold = 0;
  static int playerDamage = 5;
 
  static Rooms[] room = new Rooms[14];
  
  static Enemy bear = new Enemy(50, 10);
  static Enemy skeleton = new Enemy(20, 5);
  static Enemy blackBeard = new Enemy(70, 15);
  
  public static void main(String[] args) {
    for(int i = 0; i < 14; i++)
      room[i] = new Rooms();
    
    //Monsters in each "room"
    room[7 ].isMonster = true;
    room[9 ].isMonster = true;
    room[12].isMonster = true;

    Scanner input = new Scanner(System.in);

    String[][] items = { {"<BLANK>"},             // room0
                         {"OLD PISTOL"},          // room1
                         {"<BLANK>"},             // room2
                         {"BAG OF GOLD"},         // room3
                         {"BRONZE KEY"},          // room4
                         {"SKULL"},               // room5
                         {"<BLANK>"},             // room6
                         {"SILVER KEY"},          // room7
                         {"STRANGE MEAT", "CUP OF ALE", "GOLD"}, // room8
                         {"DERANGED EYE", "GOLD KEY"},           // room9
                         {"ENCHANTED ALE", "PORTABLE CANNON"},   //room10
                         {"<BLANK>"},             // room11
                         {"MASTER KEY"},          // room12
                         {"TREASURE"}};           // room13
    String[] inventory = new String[7];
    for(int i = 0; i < inventory.length; ++i) {
      inventory[i] = "<BLANK>";
    }

    System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
    // Make some random ass story about the island
    System.out.println("                 |._");
    System.out.println("                 |._(");
    System.out.println("        <|.__..-'|.");
    System.out.println("        ,|      .|)\\");
    System.out.println("        /|      .|) \\");
    System.out.println("       /.|)     .|)  \\");
    System.out.println("      / .|)     .|)   \\");
    System.out.println("     /  .|)     .|)    \\");
    System.out.println("    /   .|)     .|)     \\");
    System.out.println("   /  ,--+---_   |       \\ ,");
    System.out.println(" '\\==-,,;,,;,,;,,,,,,,-==;7");
    System.out.println(" _ \\__...____...__    __/ _...._");
    System.out.println("   ~              ~~~~  ~~");

    System.out.print("'Tis a dark and stormy night...");
    space();
    System.out.print("You remember the tale of an old tale a man told you in a tavern...");
    space();
    System.out.print("An island so spooky that no man nor pirate would dare travel there!");
    space();
    System.out.print("But alas you are a pirate! YE HAR!! And a pirate always hunts for da booty\n");
    space();

    // Testing game
    System.out.print("Welcome to ... ");

    // Main game loop
    while(true) {
      Rooms.declareCurrentRoom();

      for(int i = 0; i < inventory.length; ++i) {
        if(inventory[i].equalsIgnoreCase("PORTABLE CANNON"))
          playerDamage = 20;
        else if(inventory[i].equalsIgnoreCase("OLD PISTOL"))
          playerDamage = 15;
      }

      // Swtiches player's position to display map title and calls menu
      switch(roomNum) {
        case 0: System.out.print("Dead Men Shores\n");
                space();
                actionMenu(items, inventory);
                break;
        case 1: System.out.print("The Rusty Shack\n");
                space();
                actionMenu(items, inventory);
                break;
        case 2: System.out.print("Rickety Bridge\n");
                space();
                actionMenu(items, inventory);
                break;
        case 3: System.out.print("Bay of Bones\n");
                space();
                actionMenu(items, inventory);
                break;
        case 4: System.out.print("Wandering Trail\n");
                space();
                actionMenu(items, inventory);
                break;
        case 5: System.out.print("Weeping Willows\n");
                space();
                actionMenu(items, inventory);
                break;
        case 6: System.out.print("Crossroads\n");
                space();
                actionMenu(items, inventory);
                break;
        case 7: System.out.print("Smuggler's Cove\n");
                space();
                if (room[roomNum].isMonster) {
                  System.out.println("          _.--\"\"\"\"\"--._");
                  System.out.println("        .'             '.");
                  System.out.println("       /                 \\");
                  System.out.println("      ;                   ;");
                  System.out.println("      |                   |");
                  System.out.println("      |                   |");
                  System.out.println("      ;                   ;");
                  System.out.println("       \\ (`'--,   ,--'`) /");
                  System.out.println("        ) )(')/ _ \\(')( (");
                  System.out.println("       (_ `\"\"` / \\ `\"\"` _)");
                  System.out.println("        \\`\"-, /   \\ ,-\"`/");
                  System.out.println("         `\\ / `\"`\"` \\ /`");
                  System.out.println("          | _. ; ; ._ |");
                  System.out.println("          |\\ '-'-'-' /|");
                  System.out.println("          | | _ _ _ | |");
                  System.out.println("           \\ '.;_;.' /");
                  System.out.println("            \\       /");
                  System.out.println("             ',___,'");
                  System.out.println("              q___p");
                  System.out.println("              q___p");
                  System.out.println("              q___p");
                  System.out.print("Arg! Tisk a petty little skeleton!!");
                  space();
                  fightScene("Skeleton", skeleton, playerDamage, room, 6, 70, 70);
                }
                actionMenu(items, inventory);
                break;
        case 8: System.out.print("The Dusty Spitoon\n");
                space();
                actionMenu(items, inventory);
                break;
        case 9: System.out.print("Cave of Doom\n");
                space();
                if (room[roomNum].isMonster) {
                  System.out.print("Arg matey! A ghastly giant monster man eating black bear has appeared in the cave!!");
                  space();
                  fightScene("Bear", bear, playerDamage, room, 6, 90, 50);
                }
                actionMenu(items, inventory);
                break;
        case 10: System.out.print("Witch's Hut\n");
                 space();
                 actionMenu(items, inventory);
                 break;
        case 11: System.out.print("Hangman's Gate \n");
                 space();
                 actionMenu(items, inventory);
                 break;
        case 12: System.out.print("Deadbeard's Castle\n");
                 space();
                 if (room[roomNum].isMonster) {
                  System.out.println("        (\\-\"````\"-/)");
                  System.out.println("        //^\\    /^\\\\");
                  System.out.println("       ;/ ~_\\  /_~ \\;");
                  System.out.println("       |  / \\\\// \\  |");
                  System.out.println("      (,  \\0/  \\0/  ,)");
                  System.out.println("       |   /    \\   |");
                  System.out.println("       | (_\\.__./_) |");
                  System.out.println("        \\ \\-v..v-/ /");
                  System.out.println("         \\ `====' /");
                  System.out.println("          `\\\\\\///'");
                  System.out.println("           '\\\\//'");
                  System.out.println("             \\/");
                  System.out.println("Arg! We meet at last Deadbeard!!!");
                  space();
                  fightScene("Black Beard", blackBeard, playerDamage, room, 11, 90, 70);
                 }
                 actionMenu(items, inventory);
                 break;
        case 13: System.out.print("Davey Jones' Locker\n");
                 space();
                 actionMenu(items, inventory);
                 break;      
      }     
    }
  }

/********************************************************************************************
  METHOD : fightScene(String enemyName, Enemy monster, int playerStrength,
                      Rooms[] room, int moveBack, int percentHit, int percentHitBack)
  PURPOSE: Combat system, continues until enemy or player health goes to zero

  PRECONDITION :  
  POSTCONDITION:  NA

  ***********
  *VARIABLES*
  ***********
  NAME           TYPE    VALUE RANGE   DESCRIPTION
  ============== ======= ============= ====================================
  choice         char    Y - N         user input
  enemyName      String  NA            enemy name
  fighter        boolean true or false determines if the event is over
  input          String  NA            input fromuser
  monster        Enemy   NA            object for an enemy
  moveBack       int     any int       Variable to move back a room if No
                                        is selected
  percentHit     int     any int       Percentage chance to hit
  percentHitBack int     any int       percentage to hit back
  playerStrength int     0 - 100       player's health
  room           Rooms[] NA            Room object
  scan           Scanner NA            used for input
 ********************************************************************************************/ 
  public static void fightScene(String enemyName, Enemy monster, int playerStrength,
                                Rooms[] room, int moveBack, int percentHit, int percentHitBack) {
    Scanner scan = new Scanner(System.in);
    boolean fighter = true;
    String input;
    char choice;

    do {
      do{
        System.out.print("Do you want to swing? <y/n>: ");
        input = scan.next();
        choice = input.toLowerCase().charAt(0);
        if (choice == 'y') {
          break;
        } else if (choice == 'n') {
          System.out.print("AAAARRRRGGGGGHHHH you wuss!!");
          space();
          System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\nYou were pushed back into the previous area...");
          space();
          roomNum = moveBack;
          Rooms.declareCurrentRoom();
          fighter = false;
          break;
        }
      } while(fighter);
      
      if (fighter) {
        if (hit(percentHit)) {
          monster.enemyHealth -= playerStrength;
          monster.enemyHealth=(monster.enemyHealth<0)?0:monster.enemyHealth;
          System.out.print("You dealt " + playerStrength + " damage. " + enemyName + " has " + (monster.enemyHealth) + " left. ");
          if (monster.enemyHealth <= 0) {
            System.out.println("You beat the " + enemyName + "!\nYou can now search the room for items.");
            space();
            room[roomNum].isMonster = false;
            break;
          }
        } else {
          System.out.print("Arg, curse my peg leg! \nYour attack missed...");
          space();
        }
        System.out.print("\nArg! The " + enemyName + " struck back!");
        if (hit(percentHitBack)) {
          space();
          playerHealth -= monster.enemyStrength;
          System.out.print("The " + enemyName +" dealt " + monster.enemyStrength + " damage. You have " + playerHealth + " health left. ");
          if (playerHealth <= 0) {
            System.out.println("Poor laddy, you ran out of health. Better luck next time");
            space();
            System.out.println("    .-.                     .-.");
            System.out.println(" .--' /                     \\ '--.");
            System.out.println(" '--. \\       _______       / .--'");
            System.out.println("     \\ \\   .-\"       \"-.   / /");
            System.out.println("      \\ \\ /             \\ / /");
            System.out.println("       \\ /               \\ /");
            System.out.println("        \\|   .--. .--.   |/");
            System.out.println("         | )/   | |   \\( |");
            System.out.println("         |/ \\__/   \\__/ \\|");
            System.out.println("         /      /^\\      \\");
            System.out.println("         \\__    '='    __/");
            System.out.println("           |\\         /|");
            System.out.println("           |\\'\"VUUUV\"'/|");
            System.out.println("           \\ `\"\"\"\"\"\"\"` /");
            System.out.println("            `-._____.-'");
            System.out.println("              / / \\ \\");
            System.out.println("             / /   \\ \\");
            System.out.println("            / /     \\ \\");
            System.out.println("         ,-' (       ) `-,");
            System.out.println("         `-'._)     (_.'-`");

            System.out.print("GAME OVER");
            space();     
            System.exit(1);//if you die
          } 
        } else {
          space();
          System.out.println("...but missed");
        }
      } 
    } while (monster.enemyHealth > 0 && fighter);
  }

/********************************************************************************************
  METHOD : hit (int percent)
  PURPOSE: An action menu

  PRECONDITION : NA
  POSTCONDITION:  Returns true or false to determine the hit chance

  ***********
  *VARIABLES*
  ***********
  NAME      TypeE    VALUE RANGE    DESCRIPTION
  ========= ======= ============== ========================================
  chance    int     any int        Random number
  percent   int     any int        Hit percentage chance
 ********************************************************************************************/  
  public static boolean hit (int percent) {
    int chance = (int)(1 + Math.random()*100);
    if (chance <= percent) {
      return true;
    } 
    return false;
  }

/********************************************************************************************
  METHOD : actionMenu(String[][] items, String[] inv) 
  PURPOSE: An action menu

  PRECONDITION : NA
  POSTCONDITION: 

  ***********
  *VARIABLES*
  ***********
  NAME      TYPE    VALUE RANGE    DESCRIPTION
  ========= ======= ============== ========================================
  input Scanner    NA          used for inpt
  inv   String[]   NA          player's inventory
  items String[][] NA          items in the game
  num   int        0 - 7       menu input
 ********************************************************************************************/
  public static void actionMenu(String[][] items, String[] inv) {
    Scanner input = new Scanner(System.in);
    int num = 0;

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
    System.out.println();

    // Input for menu, throws exception if an integer is not input
    do {
      try {
        System.out.print("Choose an action (1-7): ");
        num = input.nextInt();


        if(num < 1 || num > 7) {
          System.out.println("Are ye' on rum or something? CHOOSE 1-7!");
        }
      }
      catch(InputMismatchException e) {
        System.out.println("Blimey! That's the wrong input - an integer is required you scallywag!");
        input.nextLine();
      }
    } while(num < 1 || num > 7);

    // Switch the input for appropriate method call
    switch(num) { 
      case 1: go();
              break;
      case 2: 
              if (inv[6] == "<BLANK>") {
                get(items, inv);
              } else {
                System.out.println("You cannot have more than 7 items!\nDrop and item to pick up another one...");
                space();
              }
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
      case 7: redisplayMenu();
              break;

    }
    System.out.print("\n\n\n"); // clear screen

  }

/********************************************************************************************
  METHOD : redisplayMenu
  PURPOSE: An action menu

  PRECONDITION : NA
  POSTCONDITION: 

  ***********
  *VARIABLES*
  ***********
  NAME      TYPE    VALUE RANGE    DESCRIPTION
  ========= ======= ============== ========================================
  NA
 ********************************************************************************************/
  public static void redisplayMenu() {
    System.out.println("***************");
    System.out.println("    ACTIONS    ");
    System.out.println("***************");
    System.out.println("<1> GO"         );
    System.out.println("<2> GET"        );
    System.out.println("<3> LOOK"       );
    System.out.println("<4> INVENTORY"  );
    System.out.println("<5> DROP"       );
    System.out.println("<6> QUIT"       );
    System.out.println("<7> DISPLAY"    );
    System.out.println("***************");   
  }

 /********************************************************************************************
  METHOD : go - FINISHED
  PURPOSE: move in a direction

  PRECONDITION : NA
  POSTCONDITION: 

  ***********
  *VARIABLES*
  ***********
  NAME      TYPE    VALUE RANGE    DESCRIPTION
  ========= ======= ============== ========================================
  
 ********************************************************************************************/
  public static void go() {
    Scanner input = new Scanner(System.in);
    char userInput = 0;
    String in;
    do {
      System.out.print("Enter a direction you would wish to move (North/ East/ South/ West): ");
      in = input.next();
      userInput = in.toLowerCase().charAt(0);
    } while (Rooms.validEntryForMove(userInput));
    roomNum = room[roomNum].changeRoomNum(room[roomNum].roomAvaliable(userInput), userInput, roomNum);

  }

 /********************************************************************************************
  METHOD : look
  PURPOSE: look method, differs based on room number

  PRECONDITION : NA
  POSTCONDITION: 

  ***********
  *VARIABLES*
  ***********
  NAME      TYPE       VALUE RANGE    DESCRIPTION
  ========= =======    ============== ========================================
  items     String[][]  NA             array for items in map
 ********************************************************************************************/
  public static void look(String[][] items) {
      switch(roomNum) {
        // Room 0 - Dead Men Shores
        case 0: System.out.print("You see nothing here. Only a lonely beach and a mysterious island ahead.");
                space();
                break;

        // Room 1 - Rusty Shack
        case 1: if(items[1][0] == "<BLANK>") {
                  System.out.print("You see nothing here. Only a lonely shack, rusted by the saliness of the sea...");
                  space();
                  System.out.print("and the tears of adventurers before you.");
                  space();
                  System.out.print("*cries*");
                  space();
                 }
                else {
                  System.out.print("You see an " + items[1][0] + " on the table.");
                  space();
                }
                break;

        // Room 2 - Rickety Bridge
        case 2: System.out.print("You see an old bridge in disrepair. It looks rickety and unstable as it sways...");
                space();
                System.out.print("in the wind and waves crash against the pillars.");
                space();
                System.out.print("On the other side of the bridge, there's a small glimpse of a wrecked ship.");
                space();
                System.out.print("I wonder what's on the other side?");
                space();
                break;

        // Room 3 - Bay of Bones
        case 3: if(items[3][0] == "<BLANK>") {
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

        // Room 4 - Wandering Trail
        case 4: if(items[4][0] == "<BLANK>") {
                  System.out.print("There's nothing left for you to pick up here");
                  space();
                  System.out.print("Only the mess you made when you saw the ghost");
                  space();
                }
                else {
                  System.out.print("You begin to search around for something useful, and then...");
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
                  System.out.print("A spooky ghost appears!");
                  space();
                  System.out.print("\"Shiver me timbers!\"");
                  space();
                  System.out.print("The ghost is carrying something around...");
                  space();
                  System.out.print("It looks like a " + items[4][0] + ".");
                  space();
                }
                break;

        // Room 5 - Wailing Willows
        case 5: if(items[5][0] == "<BLANK>") {
                  System.out.print("Nothing useful to pick up here.");
                  space();
                  System.out.print("That same unsettling feeling lingers.");
                  space();
                }
                else {
                  System.out.print("You look around and are engulfed by an endless void of trees.");
                  space();
                  System.out.println("            .--."         );
                  System.out.println("          .'(`"         );
                  System.out.println("       __.>\\ '.  _.---,._,'"   );
                  System.out.println("      /.--.  : |/' _.--.< "   );
                  System.out.println("  _..-'    `\\     /'     `'"   );
                  System.out.println("   >_.-``-. `Y  /' _.---._____" );
                  System.out.println("  '` .-''. \\|:  \\.'   ___, .-'`");
                  System.out.println("   .'--._ `-:  \\/   /'    \\\\"  );
                  System.out.println("       /.'`\\ :;    /'       `-." );
                  System.out.println("      -`    |     |"        );
                  System.out.println("            :.; : |"        );
                  System.out.println("            |:    |"        );
                  System.out.println("            |     |"        );
                  System.out.println("            :. :  |"        );
                  System.out.println("           .      ;"        );
                  System.out.println("          /:::.    `\\"     );
                  System.out.print("The place is littered with bones of dead animals and travelers before you.");
                  space();
                  System.out.print("A " + items[5][0] + " atop of a rock looks somewhat interesting.");
                  space();
                  System.out.print("The wind brushes through the trees making a wailing sound.");
                  space();
                  System.out.print("An unsettling feeling washes over you...");
                  space();
                }
                break;

        // Room 6 - Crossroads
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
     
        // Room 7 - Smuggler's Cove
        case 7:  System.out.print("Old boxes line the walls, smashed and rotting");
                 space();
                 System.out.print("The whole place smells musty, and it's pretty damp");
                 space();
                 System.out.print("Just like the crew quarters back on the ship...");
                 space();

                 if(items[7][0] == "<BLANK>"){
                   System.out.print("There is nothing more to pick up");
                   space();
                   System.out.print("The skeleton lays in a heap on the cold ground");
                   space();
                   System.out.print("You kick the heap of bones over for good measure");
                   space();
                 }
                 else{
                   System.out.print("You see something shimmering in the skeleton's hand");
                   space();
                   System.out.print("As you squint your one eye, you can make something out");
                   space();
                   System.out.print("Shiver me timbers! It's a " + items[7][0] + "!");
                   space();
                 }
                break;
          
        // Room 8 - The Dusty Spitoon 
        case 8: System.out.print("You are in a dilapidated tavern");
                space();
                System.out.print("The roof is falling in, the tables are all broken");
                space();
                System.out.print("The place still smells better than a regular tavern?");
                space();
                System.out.print("A very decayed, but friendly, pirate is standing behind the bar");
                space();

                if (items[8][0] == "<BLANK>" && items[8][1] == "<BLANK>" && items[8][2] == "<BLANK>"){
                  System.out.print("The deceased pirate shrugs, he has nothing left to give");
                  space();
                }
                else if (items[8][0] == "<BLANK>" && items[8][1] == "<BLANK>"){
                  System.out.print("The undead pirate still presents a " + items[8][2]);
                  space();
                  System.out.print("He looks like he really wants you to take it");
                  space();
                }
                else if (items[8][0] == "<BLANK>" && items[8][2] == "<BLANK>"){
                  System.out.print("The very dead pirate is still offering " + items[8][1]);
                  space();
                  System.out.print("He really doesn't seem to want to keep it");
                  space();
                }
                else if (items[8][1] == "<BLANK>" && items[8][2] == "<BLANK>"){
                  System.out.print("The reanimated pirate still has " + items[8][0]);
                  space();
                  System.out.print("Eww... He seems to really want to get rid of it");
                  space();
                }
                else if (items[8][0] == "<BLANK>"){
                  System.out.print("The pirate is still offering " + items[8][1] + " and " + items[8][2]);
                  space();
                  System.out.print("He wants you to take them off his hands");
                  space();
                }
                else if (items[8][1] == "<BLANK>"){
                  System.out.print("The pirate still has " + items[8][0] + " and " + items[8][2]);
                  space();
                  System.out.print("The meat smells really bad");
                  space();
                }
                else if (items[8][2] == "<BLANK>"){
                  System.out.print("The pirate still has " + items[8][0] + " and " + items[8][1]);
                  space();
                  System.out.print("You swear you saw the meat twitching for a second");
                  space();
                }
                else{
                  System.out.print("The pirate gives a wide grin, revealing a stark lack of teeth");
                  space();
                  System.out.print("The pirate presents 3 items on the bar in front of him");
                  space();
                  System.out.print("Plopped down on the bar are " + items[8][0] + ", " + items[8][1] + ", and " + items[8][2]);
                  space();
                }
                break;
          
        // Room 9 - Cave of Doom
        case 9: if(items[9][0] == "<BLANK>" && items[9][1] == "<BLANK>"){
                  System.out.print("You see nothing, but a the corpse of the bear you so valiantly slew!");
                  space();
                  System.out.print("You feel a little bad, but ... YAR I AM A PIRATE.");
                  space();
                }
                else if (items[9][0] == "<BLANK>"){
                  System.out.print("You spot something shining brightly by the bear's corpse");
                  space();
                  System.out.print("You cautiously up to the corpse, kneel down, and see...");
                  space();
                  System.out.print("A " + items[9][1] + "! It's your lucky day!");
                  space();
                }
                else if (items[9][1] == "<BLANK>"){
                  System.out.print("You notice the bear still has a " + items[9][0] + " left");
                  space();
                  System.out.print("You saunter up to the bear, and seriously contemplate taking the " + items[9][0]);
                  space();
                }
                else{
                  System.out.print("With the bear dead, you notice something shining by its body");
                  space();
                  System.out.print("You walk up and see a " + items[9][1] + " and a " + items[9][0] + "!");
                  space();
                  System.out.print("You contemplate taking them...");
                  space();
                }
                break;
          
        // Room 10 - Witch's Hut
        case 10: if (items[10][0] == "<BLANK>" && items[10][1] == "<BLANK>"){
                   System.out.print("All that remains in this dingy hut are shriveled lizards and disembodied eyes");
                   space();
                   System.out.print("You get a little grossed out by it all");
                   space();
                 }
                 else if (items[10][0] == "<BLANK>"){
                   System.out.print("Sitting on the table, you still see a " + items[10][1]);
                   space();
                   System.out.print("A tear is brought to your eye from the beauty");
                   space();
                 }
                 else if (items[10][1] == "<BLANK>"){
                   System.out.print("On one of the shelves, you spot an " + items[10][0] + " bubbling strongly");
                   space();
                   System.out.print("You realize you are quite parched, this may hit the spot");
                   space();
                 }
                 else{
                   System.out.println("            _____");
                   System.out.println("         .-'  ,  '-.");
                   System.out.println("       .'    _)\\_   '.");
                   System.out.println("      / ^^    //}     \\");
                   System.out.println("     |       (_;\\      |");
                   System.out.println("     |  >>>===> \\`==   |");
                   System.out.println("      \\      /__/     /");
                   System.out.println("       '.     ``    .'");
                   System.out.println("         '-._____.-'");
                   space();
                   System.out.print("Looking around this broken down hut, you see all sorts of potions and weird ingredients");
                   space();
                   System.out.print("In the corner of the room, you spot a broom and a very pointy hat");
                   space();
                   System.out.print("On a table in the middle of the room, you see a " + items[10][1] + " and your heart skips a beat");
                   space();
                   System.out.print("On one of the many shelves, you see an " + items[10][0] + " bubbling");
                   space();
                 }
                  
                 break;
           
        // Room 11 - Hangman's Gate
        case 11: System.out.print("Stepping out into a courtyard, you see a very big gate");
                 space();
                 System.out.print("On closer inspection, this gate has skulls sticking all over it!");
                 space();
                 System.out.print("You sway a bit before steadying yourself");
                 space();
                 System.out.print("... You think you saw one of the skulls laughing at you");
                 space();
                 System.out.print("A dark castle lays ahead");
                 break;
           
        // Room 12 - Deadbeard's Castle
        case 12: if (items[12][0] == "<BLANK>"){
                   System.out.print("All that's left in the room is Deadbeard's lifeless body");
                   space();
                   System.out.print("You give it a poke to make sure he's dead");
                   space();
                   System.out.print("*poke*");
                   space();
                   System.out.print("... You're pretty sure he's dead");
                   space();
                 }
                 else{
                   System.out.print("Resting in Deadbeard's hand, you see a faint glimmer");
                   space();
                   System.out.print("Upon closer inspection, you find a " + items[12][0] + "!");
                   space();
                   System.out.print("You contemplate prying it from Deadbeard's cold, dead hands");
                   space();
                 } 
                 break;
        
        // Room 13 - Davey Jones' Locker
        case 13: System.out.print("Walking into this room, you see a giant, golden safe");
                 space();
                 System.out.print("You notice the safe has 4 key holes");
                 space();
                 System.out.print("Looking through one of the key holes, you can barely see into the safe");
                 space();
                 System.out.print("What you see makes you jump for joy");
                 space();
                 System.out.print("You are nearly blinded by what can only be mountains of gold doubloons,\n Deadbeard's secret TREASURE stash!");
                 space();
                 break;
      }

    }

 /********************************************************************************************
  METHOD : get(String[][]items, String[] inv)
  PURPOSE: Gets an item from a room based on their current position

  PRECONDITION : Passed String arrays for inventory and items
  POSTCONDITION: Inventory array gets updated, item array loses item

  ***********
  *VARIABLES*
  ***********
  NAME      TYPE    VALUE RANGE    DESCRIPTION
  ========= ======= ============== ========================================
  input Scanner    NA          used for inpt
  inv   String[]   NA          player's inventory
  items String[][] NA          items in the game
  s     String     any string  user's input for what item they want to
                                pick up
 ********************************************************************************************/
  public static void get(String[][]items, String[] inv) { 
      Scanner input = new Scanner(System.in);
      String s;

      switch(roomNum) {
        // Room 0 - Dead Men Shore's
        case 0: System.out.print("There is nothing to get here ...");
                space();
                System.out.print("ONLY FOR YOU TO GET LOST!!! ... says an eerie voice");
                space();
                System.out.print("You feel a cold breeze go over you.");
                space();
                break;

        // Room 1 - Rusty Shack
        case 1: s = getString();

                if(s.equalsIgnoreCase(items[1][0])) { //Old Pistol
                  System.out.print("Picked up an " + items[1][0] + " and placed it into your inventory.");
                  space();
                  inv[emptyInvNum(inv)] = items[1][0];
                  items[1][0] = "<BLANK>";
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

        // Room 2 - Rickety Bridge
        case 2: System.out.print("There is nothing to get here ...");
                space();
                break;

        // Room 3 - Bay of Bones
        case 3: s = getString();

                if(s.equalsIgnoreCase(items[3][0])) { //Bag Of Gold
                  System.out.print("Picked up a " + items[3][0] + ".");
                  space();
                  totalGold += 50;
                  System.out.print("*Cha-ching!*");
                  space();
                  System.out.print("You now have " + totalGold + " gold.");
                  space();
                  items[3][0] = "<BLANK>";
                }
                else {
                  System.out.print("Couldn't pick up anything.");
                  space();
                  System.out.print("Son of a Biscuit Eater!");
                  space();
                }
                break;

        // Room 4 - Wandering Trail
        case 4: s = getString();

                if(s.equalsIgnoreCase(items[4][0])) {//Bronze Key
                  System.out.print("Picked up a " + items[4][0] + " and placed it into your inventory.");
                  space();
                  System.out.print("A bronze key... I wonder if thar be any more keys around?");
                  space();
                  inv[emptyInvNum(inv)] = items[4][0];
                  items[4][0] = "<BLANK>";
                }
                else {
                  System.out.print("Couldn't find anything useful to pick up.");
                }
                break;

        // Room 5 - Weeping Willows
        case 5: s = getString();
                if(s.equalsIgnoreCase(items[5][0])) {//Skull
                  System.out.print("Picked up a " + items[5][0] + " and place it into your inventory.");
                  space();
                  System.out.print("I don't know why I picked up this skull, it's pretty weird.");
                  space();
                  System.out.print("I guess I'll add it to my knick knack collection and show it to Bessie!");
                  space();
                  inv[emptyInvNum(inv)] = items[5][0];
                  items[5][0] = "<BLANK>";
                }
                else {
                  System.out.print("Couldn't find anything useful to pick up.");
                }
                break;

        // Room 6 - Crossroads
        case 6: System.out.print("There is nothing to get here ...");
                space();
                System.out.print("Only to get moving in a direction");
                break;

        // Room 7 - Smuggler's Cove
        case 7: s = getString();
                if(s.equalsIgnoreCase(items[7][0])) {//Silver Key
                  System.out.print("Picked up a " + items[7][0] + " and placed it into your inventory.");
                  space();
                  System.out.print("A silver key... It's a matching set!");
                  space();
                  inv[emptyInvNum(inv)] = items[7][0];
                  items[7][0] = "<BLANK>";
                }
                else {
                  System.out.print("Couldn't find anything useful to pick up.");
                }
                break;
        
        // Room 8 - The Dusty Spitoon 
        case 8: s = getString();

                if(s.equalsIgnoreCase(items[8][0])) {//Strange Meat
                  System.out.print("Picked up " + items[8][0] + " and ate it.");
                  space();
                  playerHealth -= 5;
                  System.out.println("Aaaarrrrgggghhhh! That strange meat ain't settling well with me belly.");
                  System.out.println("-5 health. Health remaining: " + playerHealth);
                  space();

                    if (playerHealth <= 0) {
                      System.out.println("You fainted and a zombified hound from black beard feasts on your body\nDead men tell no tales");
                      space();
                      System.exit(1);
                    } 

                  items[8][0] = "<BLANK>";
                  } else if(s.equalsIgnoreCase(items[8][1])) {//Cup of ale
                    System.out.print("Picked up a " + items[8][1] + " and drank it.");
                    space();
                    playerHealth += 5;
                    System.out.print("Mmmmm, that settles well.\n+5 health. Health remaining: " + playerHealth);
                    space();
                    items[8][1] = "<BLANK>";
                  }
                  else if(s.equalsIgnoreCase(items[8][2])) {//Gold
                    System.out.print("Picked up " + items[8][2] + ".");
                    space();
                    totalGold += 8;
                    System.out.print("Ya Har laddy! Found me some booty!\n+8 gold. Gold coin: " + totalGold);
                    space();
                    inv[emptyInvNum(inv)] = items[8][2];
                    items[8][2] = "<BLANK>";
                  } else {
                    System.out.print("Couldn't find anything useful to pick up.");
                  }
                break;
          
        // Room 9 - Cave of Doom
        case 9: s = getString();
  
          if(s.equalsIgnoreCase(items[9][0])) {//Deranged Eye
              System.out.print("Picked up a " + items[9][0] + " and placed it into your inventory.");
              space();
              System.out.print("Aye laddy... why did I pick this up.");
              space();
              inv[emptyInvNum(inv)] = items[9][0];
              items[8][1] = "<BLANK>";
            } else if(s.equalsIgnoreCase(items[9][1])) {//Gold Key
                System.out.print("Picked up a " + items[9][1] + ".");
                space();
                totalGold += 8;
                System.out.print("Ya Har laddy! Found me a GOLDEN KEY! Wonder what this opens up...");
                space();
                inv[emptyInvNum(inv)] = items[9][1];
                items[9][1] = "<BLANK>";
              } else {
              System.out.print("Couldn't find anything useful to pick up.");
            }
          break;
        
        // Room 10 - Witch's Hunt
        case 10: s = getString();
                 if(s.equalsIgnoreCase(items[10][0])) {//Enchanted Ale
                   System.out.print("Picked up " + items[10][0] + " and drank it.");
                   space();
                   System.out.print("The enchanted ale restores half of your lost health.");
                   space();
                   playerHealth += ((100-playerHealth)/2);
                   System.out.print("You gained " + ((100-playerHealth)) + " health. You now have " + playerHealth);
                   space();
                   items[10][0] = "<BLANK>";
                 } 
                 else if(s.equalsIgnoreCase(items[10][1])) {//Portable Cannon
                    System.out.print("Picked up a " + items[10][1] + " and placed it into your inventory.");
                    space();
                    System.out.print("Oh BABY! Tis a heavy weapon. This might come in handy later...");
                    space();
                    inv[emptyInvNum(inv)] = items[10][1];
                    items[10][1] = "<BLANK>";
                }
                else {
                  System.out.print("Couldn't find anything useful to pick up.");
                }
                break;
        
        // Room 11 - Hangman's Gate
        case 11: 
          System.out.print("There is nothing to get here ...");
          space();
          break;
        
        // Room 12 - Deadbeard's Castle
        case 12: s = getString();

          if(s.equalsIgnoreCase(items[12][0])) {//Master Key
              System.out.print("Picked up a " + items[12][0] + " and placed it into your inventory.");
              space();
              System.out.print("\"MOTHER OF PEARL! THE MASTER KEY!\"");
              space();
              inv[emptyInvNum(inv)] = items[12][0];
              items[12][0] = "<BLANK>";
            }
            else {
              System.out.print("Couldn't find anything useful to pick up.");
            }
          break;

        // Room 13 - Davey Jones' Locker
        case 13: s = getString();
        
			if(s.equalsIgnoreCase(items[13][0])) {//Treasure
				System.out.print("Before you can you open the safe. You must have all four keys to the lock.");
				space();
        
				// User must have all keys to open the treasure
				int keys = 0;
				for(int i = 0; i < 7; i++){
					if(inv[i] == "BRONZE KEY" || inv[i] == "SILVER KEY" || inv[i] == "GOLD KEY" || inv[i] == "MASTER KEY"){
						keys++;
						if(keys == 4){
							System.out.print("Well I'll be darned. You have all of the keys to the safe!");
							space();
							System.out.print("Now open that safe and retrieve yer booty!!!");
							space();
							System.out.print("Picked up " + items[13][0] + " and placec it into your inventory.");
							space();
							inv[emptyInvNum(inv)] = items[13][0];
							items[13][0] = "<BLANK>";
							System.out.print("You found yer booty. YOU WON! At the next prompt choose the QUIT option to end the game.");
							space();
							break;
						}
						
					} 
					else if (i == 6 && keys < 4){
						System.out.print("ARRRRRGH!!!>=0 You don't have all of the keys. Double check your inventory, retrace your steps and find the keys to der' booty!");
						break;
					}
				}
			}
			else {
				System.out.print("Couldn't find anything useful to pick up.");
			}
			break;
		}
	}


/********************************************************************************************
  METHOD : pushOver(String[] inventory)
  PURPOSE: Returns a String array for the inventory with no spaces

  PRECONDITION : Passed String array for inventory
  POSTCONDITION: Returns a new array that has no spaces               

  ***********
  *VARIABLES*
  ***********
  NAME        TYPE     VALUE RANGE    DESCRIPTION
  =========   =======  ============== ========================================
  i           int      any int        swaps items index
  items       String[]   NA           player's inventory      
  j           int      any iny        swaps items index
 ********************************************************************************************/  
  public static void pushOver(String[] items) {
    int i;
    int j;
    for (i = 0, j = 0; j < items.length; j++) {
      if (items[j] != "<BLANK>") {
        if (i<j){
          swapS(items, i, j);
        }
        i++;
      }
    }
  }

/********************************************************************************************
  METHOD : swapS(String[] inv, int a, int b)
  PURPOSE: swaps two indices of the array

  PRECONDITION : Passed String array for inventory and indicies
  POSTCONDITION: Swaps the array              

  ***********
  *VARIABLES*
  ***********
  NAME TYPE     VALUE RANGE DESCRIPTION
  ==== ======== =========== ===============================================
  a    int      any int     swap index
  b    int      any int     swap index
  inv  String[] NA          array for inventory
  temp String   NA          string variable to store a value
 ********************************************************************************************/  
  public static void swapS(String[] inv, int a, int b) {
    String temp;
    temp = inv[a]; 
    inv[a] = inv[b];
    inv[b] = temp;
  }  

/********************************************************************************************
  METHOD : emptyInvNum(String[] inv)
  PURPOSE: finds the first empty element in the inventory array and returns that index

  PRECONDITION : Passed String array for inventory
  POSTCONDITION: Returns index of first empty element

  ***********
  *VARIABLES*
  ***********
  NAME      TYPE     VALUE RANGE    DESCRIPTION
  ========= =======  ============== ========================================
  emptyNum  int      any int        array index with the first empty value
  inv       String[] NA             player's inventory
 ********************************************************************************************/
  public static int emptyInvNum(String[] inv) {
    int emptyNum = 0;
    for(int i = 0; i < inv.length; ++i) {
      if(inv[i] == "<BLANK>") {
        emptyNum = i;
        break;
      }
    }
    return emptyNum;
  }

 /********************************************************************************************
  METHOD : drop(String[] inv)
  PURPOSE: Lets user drop an item which is lost forever

  PRECONDITION : Passed a String array for inventory
  POSTCONDITION: String array for inventory is updated

  ***********
  *VARIABLES*
  ***********
  NAME      TYPE     VALUE RANGE    DESCRIPTION
  ========= =======  ============== ========================================
  input     Scanner  NA            used for inpt
  inv       String[] NA            player's inventory
  isDropped boolean  true or false determine if an item has been dropped
  word      String   NA            item to drop
 ********************************************************************************************/
  public static void drop(String[] inv) {
      Scanner input = new Scanner(System.in);
      String word;
      boolean isDropped = false;

      // Input
      System.out.print("Are you sure you want to drop an item? It will be sent to Davey Jones' Locker...\n");
      System.out.print("and be lost forever!\nMother of Coral!");
      space();
      System.out.print("Type item to drop: ");
      word = input.nextLine();

      // Finds the item to drop
      for(int i = 0; i < inv.length; ++i) {
        if(word.equalsIgnoreCase(inv[i].toUpperCase())) {
          System.out.println("\n\n\n" + inv[i] + " dropped.");
          inv[i] = "<BLANK>";
          isDropped = true;
          break;
        }
        else {
          isDropped = false;
        }
      }

      if(!isDropped) System.out.println("Could not drop item");
    }

 /********************************************************************************************
  METHOD : displayInventory(String[] inv) 
  PURPOSE: Display the player's inventory

  PRECONDITION : Passed a String array for player's inventory
  POSTCONDITION: NONE

  ***********
  *VARIABLES*
  ***********
  NAME      TYPE     VALUE RANGE    DESCRIPTION
  ========= =======  ============== ========================================
  inv       String[] NA             player's inventory 
  nothing   int      0-7            checks if player's inventory is empty
 ********************************************************************************************/
  public static void displayInventory(String[] inv) {
    System.out.println("Inventory contents: ");
    int nothing = 0;
    for(int i = 0; i < inv.length; ++i) {
      if(inv[i] == "<BLANK>") {
        nothing++;
      } else {
        System.out.println((i+1) + ". " + inv[i]);
      }
    }
    if (nothing == 7) {
      System.out.print("There is nothing in your inventory! Get hunting matey!");
      space();
    }

  }

 /********************************************************************************************
  METHOD : getString
  PURPOSE: Gets string input

  PRECONDITION : NA
  POSTCONDITION: NA

  ***********
  *VARIABLES*
  ***********
  NAME      TYPE    VALUE RANGE    DESCRIPTION
  ========= ======= ============== ========================================
  input     Scanner  NA            used for inpt
  s         String  NA             stores string for item to ge
 ********************************************************************************************/
  public static String getString() {
    Scanner input = new Scanner(System.in);
    System.out.print("Type item to get: ");
    String s = input.nextLine();
    s = s.trim();
    return s;
  }
 
 /********************************************************************************************
  METHOD : space
  PURPOSE: Used after dialogue for user to press enter

  PRECONDITION : NA
  POSTCONDITION:  NA

  ***********
  *VARIABLES*
  ***********
  NAME      TYPE    VALUE RANGE    DESCRIPTION
  ========= ======= ============== ========================================
  x         Scanner  NA            used for inpt
 ********************************************************************************************/
  public static void space() {
    Scanner x = new Scanner(System.in);
    x.nextLine();
  }


/*****************************************************************************************************
                        FINAL PROJECT 
  File Name     : SpookyPirates
  Programmer    : .datOneGroup -  Alec Castaneda, Ash Jamshasb, Charles Prescott, Nathan Nhek
  Due Date      : Wed. August 10, 2016

  Problem Statement: 
  You are a lone pirate on an adventure hunting for treasure on an island, that is SPOOOOKY

  Overall Plan: 
  1. Create an array of 14 room objects used to navigate throughout the map
  2. Keep track of where the player is in the map
  3. Allow player to navigate north east south or west based on their position
  4. Display a command window for the user to use to do actions
  5. Different rooms will display different dialogue and have different items to pick up
  6. Create a combat system where the player will have to fight at least 1 enemy or 3 enemies max
  7. Defeating the enemies is a key part to winning the game
  8. To win, player must have all keys to open the treasure chest after the boss battle

  Classes needed and Purpose (Input, Processing, Output)
  main class -   Spooky Pirates
  sub class  -   Room - help navigate through the map
   
  DATA DICTIONARY (ALPHABETICAL)
  ---------------
  ***********
  *CONSTANTS*
  ***********
  NAME   TYPE      VALUE RANGE  DESCRIPTION
  ====== =======   ===========  ============================================
  NONE
   
  ***********
  *VARIABLES*
  ***********
  NAME         TYPE               VALUE RANGE DESCRIPTION
  ============ ================== =========== =============================
  currentRoom  static int[]       NA          user's position using an array
  isMonster    boolean            0 - 1       determines if there is a monster in the room
  roomOptions  statinc int[][]    NA          2d array of the map with 14 rooms
************************************************************************************************/
  static class Rooms {//it extends because it needs to get the room number
    
    static int[] currnetRoom = new int[4];
     // ROOM -1 IS THE ROOM YOU CANNOT ENTER NOT 0, 0 is the starting room. It was easier because the room array starts with zero...
    //                             n    s   w    e
    static int[][] roomOptions = {{1,  -1, -1,  2}, //room10
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
                                  {12, -1, -1, -1}  //room13
                                 };
    boolean isMonster;

 /********************************************************************************************
  METHOD : declareCurrentRoom()
  PURPOSE: Copies the array row where the player has moved

  PRECONDITION : NA
  POSTCONDITION:  NA

***********
*VARIABLES*
***********
NAME          TYPE    VALUE RANGE     DESCRIPTION
============= ======= =============== ====================================
currentRoom   int[]   0 - 13          this array holds the indices
                                      representing the room you are in
roomNum       int[]   0 - 13          this array holds the index
                                      representing the room number
roomOptions   int[]   NA              this array holds the number of room
                                      options the user has 
 ********************************************************************************************/
    public static void declareCurrentRoom() {
      System.arraycopy(roomOptions[roomNum], 0, currnetRoom, 0, 4);
    }
    /********************************************************************************************
  METHOD : changeRoomNum(boolean good2go, char compass, int currentRoom)
  PURPOSE: To change the room number, and keep it the same if the user enters an invalid direction

  PRECONDITION : NA
  POSTCONDITION:  NA

***********
*VARIABLES*
***********
NAME          TYPE    VALUE RANGE     DESCRIPTION
============= ======= =============== ====================================
compass       char    'n','s','w','e' this carriesthe character chosen by
                                      the user to select a direction to move
                                      in
currentRoom   int[]   0 - 13          this array holds the indices
                                      representing the room you are in
good2go       boolean true, false     this tells whether or not the player
                                      is ready and able to change rooms
posFromComp   int[]   NA              this tells where the user is in
                                      relation to the compass
 ********************************************************************************************/
    //To change the room number, and keep it the same if the user enters an invalid direction
    public static int changeRoomNum(boolean good2go, char compass, int currentRoom) {
      if (good2go) {
        System.out.print("\n\n\n\n\n\n\n\n\n\n\n\nMoving to ...");
        return currnetRoom[posFromComp(compass)];//posFromComp returns the position in the array, currentRoom is the array from the current room we are in 
      } else {
        System.out.print("\n\n\n\n\n\n\n\n\n\n\n\nCannot move there! Tis' impassible");
        return currentRoom;
      }
    }

	/********************************************************************************************
  METHOD : roomAvaliable(char compass)
  PURPOSE: to see if the user can go in a direction

  PRECONDITION : NA
  POSTCONDITION:  NA

***********
*VARIABLES*
***********
NAME          TYPE    VALUE RANGE     DESCRIPTION
============= ======= =============== ====================================
available     boolean true, false     this tells the user can go in a
                                      direction or not
compass       char    'n','s','w','e' this carriesthe character chosen by
                                      the user to select a direction to move
                                      in
currentRoom   int[]   0 - 13          this array holds the indices
                                      representing the room you are in
posFromComp   int[]   NA              this tells where the user is in
                                      relation to the compass
 ********************************************************************************************/
    public static boolean roomAvaliable(char compass) {
      boolean avaliable = true;
      if (currnetRoom[posFromComp(compass)] == -1) {//Its just easier to use -1 instead of 0, trust me fam
        avaliable = false;
      }
      return avaliable;
    }
    /********************************************************************************************
  METHOD : posFromComp(char compass)
  PURPOSE: this is the position of the array the user is trying to access

  PRECONDITION : NA
  POSTCONDITION:  NA

***********
*VARIABLES*
***********
NAME          TYPE    VALUE RANGE     DESCRIPTION
============= ======= =============== ====================================
compass       char    'n','s','w','e' this carriesthe character chosen by
                                      the user to select a direction to move
                                      in
position      int     NA              defaults the choice to -1 so the user
                                      can choose from 0,1,2 or 3
 ********************************************************************************************/
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
    /********************************************************************************************
  METHOD : validEntryForMove(char input)
  PURPOSE: validate the user choice for the direction they want to go

  PRECONDITION : NA
  POSTCONDITION:  NA

***********
*VARIABLES*
***********
NAME          TYPE    VALUE RANGE     DESCRIPTION
============= ======= =============== ====================================
badChoice     boolean true, false     validates the user character choice
input         char    'n','s','w','e' represents the input argument for the direction to move in

 ********************************************************************************************/
    public static boolean validEntryForMove(char input) {
      boolean badChoice = true;
      
      if(input == 'n' || input == 's' || input == 'w' || input == 'e') {
        badChoice = false;
      }
      return badChoice; 
    }
  }
}

/************************************************************************************
Enemy DATA DICTIONARY
---------------
***********
*CONSTANTS*
***********
NAME          TYPE    VALUE RANGE     DESCRIPTION
============= ======= =============== ====================================
NO CONSTANTS

***********
*VARIABLES*
***********
NAME          TYPE    VALUE RANGE     DESCRIPTION
============= ======= =============== ====================================
enemyHealth   int     NA              this carries the enemy's health
enemyStrength int     NA              this carries the enemy's strength
health        int     NA              this carries the argument for health
strength      int     NA              this carries the argument for
                                      strength
**************************************************************************************/
class Enemy {
  int enemyHealth, enemyStrength;
  Enemy (int health, int strength) {
    enemyHealth = health;
    enemyStrength = strength;
  }
}