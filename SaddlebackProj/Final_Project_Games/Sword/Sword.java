/*

NAME 					TYPE 			VALUE RANGE				DESCRIPTION
=========== 			======= 		=========== 			=========================================
healthKit1 				Item 			Item object 			health kit 
healthKit2				Item 			Item object 			health kit 
healthKit3				Item 			Item object 			health kit 
healthKit4				Item 			Item object 			health kit 
healthKit5 				Item 			Item object 			health kit 
healthKit6 				Item 			Item object 			health kit 
key1 					Item 			Item object 			door key
key2					Item 			Item object 			door key
protagDagger			Item 			Item object 			protagonist weapon
hiddenDagger1			Item 			Item object 			hidden dagger
hiddenAxe1				Item 			Item object 			hidden axe
hiddenSword1			Item 			Item object 			hidden sword
assassinDagger1			Item 			Item object 			assassin enemy weapon
assassinDagger2			Item 			Item object 			assassin enemy weapon
warriorAxe1				Item 			Item object 			warrior enemy weapon
warriorAxe2				Item 			Item object 			warrior enemy weapon
immortalSword1			Item 			Item object 			immortal enemy weapon
immortalSword2			Item 			Item object 			immortal enemy weapon
guardMace1				Item 			Item object 			guard enemy weapon
guardMace2				Item  			Item object 			guard enemy weapon
royalSword				Item 			Item object 			King Farhad enemy weapon
swordShaman				Item 			Item object 			Sword of Shaman
chair1					Item 			Item object 			chair
chair2					Item 			Item object 			chair
chair3					Item 			Item object 			chair
chair4					Item 			Item object 			chair
table1					Item 			Item object 			table
table2					Item 			Item object 			table
table3					Item 			Item object 			table
table4					Item 			Item object 			table
desk1					Item 			Item object 			desk
desk2					Item 			Item object 			desk
desk3					Item 			Item object 			desk
safe1					Item 			Item object				safe
safe2					Item 			Item object				safe
closet1					Item 			Item object 			closet
closet2					Item 			Item object 			closet
closet3					Item 			Item object 			closet
pot1					Item 			Item object 			pot
pot2					Item 			Item object 			pot
bucket1					Item 			Item object 			bucket
vault 					Item 			Item object 			vault
throne 					Item 			Item object 			throne
cage 					Item 			Item object 			cage
protag 					Protagonist 	Protagonist object 		game protagonist
immortal1 				Enemy 			Enemy object 			immortal enemy
immortal2 				Enemy 			Enemy object 			immortal enemy
assassin1 				Enemy 			Enemy object 			assassin enemy
assassin2  				Enemy 			Enemy object 			assassin enemy
warrior1 				Enemy 			Enemy object 			warrior enemy
warrior2  				Enemy 			Enemy object 			warrior enemy
guard1  				Enemy 			Enemy object 			guard enemy
guard2 					Enemy 			Enemy object 			guard enemy
kingFarhad 				Enemy 			Enemy object 			guard enemy
entryWay 				Room 			Room object 			room
diningHall 				Room 			Room object 			room
forge 					Room 			Room object 			room
treasury 				Room 			Room object 			room
throneRoom 				Room 			Room object 			room

*/

import java.util.Scanner;
import java.util.Arrays;

public class Sword {
	public static void main(String[] args) {

		// Misc. Items
		Item healthKit1 = new Item("Health Kit", 0, 0);
		Item healthKit2 = new Item("Health Kit", 0, 0);
		Item healthKit3 = new Item("Health Kit", 0, 0);
		Item healthKit4 = new Item("Health Kit", 0, 0);
		Item healthKit5 = new Item("Health Kit", 0, 0);
		Item healthKit6 = new Item("Health Kit", 0, 0);
		Item key1 = new Item("Key", 0, 0);
		Item key2 = new Item("Key", 0, 0);

		// Weapons
		Item protagDagger = new Item("Persian Dagger", 25, 0);
		Item hiddenDagger1 = new Item("Gold Dagger", 35, 0);
		Item hiddenAxe1 = new Item("Gold Axe", 45, 0);
		Item hiddenSword1 = new Item("Gold Sword", 45, 0);
		Item assassinDagger1 = new Item("Iron Dagger", 15, 0);
		Item assassinDagger2 = new Item("Bronze Dagger", 25, 0);
		Item warriorAxe1 = new Item("Iron Axe", 25, 0);
		Item warriorAxe2 = new Item("Bronze Axe", 35, 0);
		Item immortalSword1 = new Item("Iron Sword", 30, 0);
		Item immortalSword2 = new Item("Platinum Sword", 50, 0);
		Item guardMace1 = new Item("Iron Mace", 40, 0);
		Item guardMace2 = new Item("Bronze Mace", 45, 0);
		Item royalSword = new Item("Royal Sword", 40, 0);
		Item swordShaman = new Item("Sword of Shaman", 100, 0);

		// Furniture
		Item chair1 = new Item("Chair", 0, 1);
		Item chair2 = new Item("Chair", 0, 1);
		Item chair3 = new Item("Chair", 0, 1);
		Item chair4 = new Item("Chair", 0, 1);
		Item table1 = new Item("Table", 0, 1);
		Item table2 = new Item("Table", 0, 1);
		Item table3 = new Item("Table", 0, 1);
		Item table4 = new Item("Table", 0, 1);
		Item desk1 = new Item("Desk", new Item[]{healthKit1});
		Item desk2 = new Item("Desk", new Item[1]);
		Item desk3 = new Item("Desk", new Item[1]);
		Item safe1 = new Item("Safe", new Item[]{healthKit2});
		Item safe2 = new Item("Safe", new Item[]{healthKit3});
		Item closet1 = new Item("Closet", new Item[]{hiddenSword1});
		Item closet2 = new Item("Closet", new Item[]{healthKit5});
		Item closet3 = new Item("Closet", new Item[1]);
		Item pot1 = new Item("Pot", new Item[]{hiddenDagger1});
		Item pot2 = new Item("Pot", new Item[]{hiddenAxe1});
		Item bucket1 = new Item("Bucket", new Item[]{healthKit6});
		Item vault = new Item("Vault", new Item[]{swordShaman});
		Item throne = new Item("Throne", 0, 1);
		Item cage = new Item("Cage", new Item[]{healthKit4});

		// Characters
		Protagonist protag = new Protagonist("Dastan", new int[]{2, 0, 0, 0}, new Item[]{protagDagger, null, null});
		Enemy immortal1 = new Enemy("Immortal", immortalSword1);
		Enemy immortal2 = new Enemy("Immortal", immortalSword2);
		Enemy assassin1 = new Enemy("Assassin", assassinDagger1);
		Enemy assassin2 = new Enemy("Assassin", assassinDagger2);
		Enemy warrior1 = new Enemy("Warrior", warriorAxe1, key1);
		Enemy warrior2 = new Enemy("Warrior", warriorAxe2);
		Enemy guard1 = new Enemy("Guard", guardMace1);
		Enemy guard2 = new Enemy("Guard", guardMace2, key2);
		Enemy kingFarhad = new Enemy("King Farhad", royalSword, 400);

		// Rooms
		Room entryWay = new Room("Entryway", 1, new int[]{2, 0, 0, 0}, new Item[]{chair1, table1, safe1}, new Enemy[]{assassin1, immortal1});
		Room diningHall = new Room("Dining Hall", 2, new int[]{0, 3, 5, 1}, new Item[]{pot1, chair2, table2}, new Enemy[]{warrior1});
		Room treasury = new Room("Treasury", 3, new int[]{4, 0, 2, 0}, new Item[]{closet2, safe2, desk2, chair4, pot2}, new Enemy[]{guard1, warrior2});
		Room throneRoom = new Room("Throne Room", 4, new int[]{0, 0, 0, 3}, new Item[]{table4, vault, desk3, throne, closet3}, new Enemy[]{guard2});
		Room forge = new Room("Forge", 5, new int[]{6, 2, 0, 0}, new Item[]{closet1, table3, bucket1, chair3}, new Enemy[]{immortal2});
		Room dungeon = new Room("Dungeon", 6, new int[]{0, 0, 0, 5}, new Item[]{cage}, new Enemy[]{kingFarhad});
		
		forge.lock();
		treasury.lock();
		printIntro();
		playGame(protag, entryWay, diningHall, forge, treasury, throneRoom, dungeon);
	}

	public static void printIntro() {
		System.out.println("\nWelcome to Sword! You play the role of Dustan, a highly trained Persian operative charged ");
		System.out.println("with the task of infiltrating King Farhad's palace to steal back the ancient Sword of Shaman. ");
		System.out.println("You must stealthily search the rooms of the palace for this sword, collecting helpful items and ");
		System.out.println("weapons that you may find in addition to fighting off King Farhad's dangerous guards. You must find "); 
		System.out.println("the sword or die trying!\n");
		System.out.println("You have arrived at King Farhad's palace and snuck in through a window...\n");
	}

	public static void printFarhadDialogue(Protagonist protag) {
		System.out.println("\nKing Farhad: ");
		System.out.println("\nWelcome " + protag.getName() + "! You didn't really believe you could escape my palace alive did you? It is truly unfortunate");
		System.out.println("that you have come so far only to be defeated at the end of your journey! You have no choice but to fight me if ");
		System.out.println("you have any hope to live!");
	}

	public static void printVictoryMessage(Protagonist protag) {
		System.out.println("\nWell done " + protag.getName() + "! You have defeated the feared King Farhad and escaped with the Sword of Shaman! Your country ");
		System.out.println("thanks you dearly for your acts of bravery and courage. Return home to receive glory, but don't get too comfortable ");
		System.out.println("as we will have another mission for you shortly!\n");
	}

	public static void playGame(Protagonist protag, Room... rooms) {
		Room currentRoom = getCurrentRoom(protag, rooms);

		System.out.println("\n\nYou are in the " + currentRoom.getName() + ".");
		System.out.println("Actions: INVENTORY, LOOK, INTERACT, EQUIP, ATTACK, GET, DROP, GO, HEALTH, ACTIONS, QUIT");

		while (protag.isAlive()) {
			promptUser(protag, rooms);
			if (movedRooms(currentRoom, protag, rooms)) {
				playGame(protag, rooms);
			}
		}
	}

	public static void promptUser(Protagonist protag, Room[] rooms) {
		Scanner input = new Scanner(System.in);
		Room currentRoom = getCurrentRoom(protag, rooms);
		String action;

		System.out.print("\n\nWhat would you like to do? > ");
		action = input.nextLine().toLowerCase();

		if (action.equals("drop")) {
			performDrop(protag, currentRoom);
		}
		else if (action.equals("go")) {
			performGo(protag, currentRoom, rooms);
		}
		else if (action.equals("get")) {
			if (currentRoom.isSearched()) {
				performGet(protag, rooms, currentRoom);
			}
			else {
				System.out.println("\n     You must search the room first before you can take anything.");
				promptUser(protag, rooms);
			}
		}
		else if (action.equals("equip")) {
			performEquip(protag);
		}
		else if (action.equals("interact")) {
			if (currentRoom.isSearched()) {
				performInteract(protag, rooms, currentRoom);
			}
			else {
				System.out.println("\n     You must search the room first before you can interact with anything.");
				promptUser(protag, rooms);
			}
		}
		else if (action.equals("attack")) {
			if (!currentRoom.isSearched()) {
				System.out.println("\n     You must search the room for enemies first before you can make an attack.");
				promptUser(protag, rooms);
			}
			else if (protag.getEquip() == null) {
				System.out.println("\n     You must equip a weapon from your inventory before you can make an attack.");
				promptUser(protag, rooms);
			}
			else if (!currentRoom.enemiesLeft()) {
				System.out.println("\n     There are no more enemies in the " + currentRoom.getName() + ".");
				promptUser(protag, rooms);
			}
			else {
				performAttack(protag, rooms, currentRoom);
			}
		}
		else if (action.equals("health")) {
			System.out.println("\n     Your Current Health:  " + protag.getHealth() + "%");
		}
		else if (action.equals("actions")) {
			System.out.println("\nActions: INVENTORY, LOOK, INTERACT, EQUIP, ATTACK, GET, DROP, GO, HEALTH, ACTIONS, QUIT");
		}
		else if (action.equals("inventory")) {
			System.out.print("\n     Current inventory:    ");
			protag.printInventory();
		}
		else if (action.equals("look")) {
			performLook(protag, currentRoom);
		}
		else if (action.equals("quit")) {
			protag.gameOver();
		}
		else {
			System.out.println("\n     Invalid input.");
		}
	}

	public static void performDrop(Protagonist protag, Room currentRoom) {
		Scanner input = new Scanner(System.in);
		String response;
		Item droppedItem;

		System.out.print("\n     Current Inventory:    ");
		protag.printInventory();

		System.out.print("\n     Which item would you like to drop? > ");
		response = input.nextLine();
		droppedItem = protag.getItem(response);

		if (droppedItem != null) {
			System.out.println("\n     You dropped the " + droppedItem.getName() + ".");
			protag.removeItem(droppedItem);
			currentRoom.addItem(droppedItem);
		}
		else {
			System.out.println("\n     Invalid input.");
		}
	}

	public static void performGo(Protagonist protag, Room currentRoom, Room[] rooms) {
		Scanner input = new Scanner(System.in);
		Room[] adjacentRooms = getAdjacentRooms(currentRoom, rooms);
		Room nextRoom;
		String response;

		System.out.print("\n     Adjacent Rooms:       ");
		printAdjacentRooms(adjacentRooms);

		System.out.print("\n     Where would you like to go? > ");
		response = input.nextLine().toLowerCase();
		nextRoom = getNextRoom(response, adjacentRooms);

		if (nextRoom == null) {
			System.out.println("\n     Invalid input.");
		}  
		else if (currentRoom.enemiesLeft()) {
			System.out.println("\n     You must kill all the enemies in the " + currentRoom.getName() + " before you can go elsewhere.");
		}
		else if (nextRoom.isLocked() && protag.getEquip() != null && !protag.getEquip().getName().equals("Key")) {
			System.out.println("\n     This room is locked. You must find and equip a key in order to open the door.");
		}
		else if (nextRoom.isLocked() && protag.getEquip() != null && protag.getEquip().getName().equals("Key")) {
			System.out.println("\n     You unlocked the door to the " + nextRoom.getName() + "!");
			nextRoom.unlock();
			protag.removeItem(protag.getEquip());
			protag.equip(null);
			protag.setLocation(nextRoom.getLocation());
		}
		else {
			if (nextRoom.getName().equals("Dungeon")) {
				nextRoom.searched();
				printFarhadDialogue(protag);
				protag.setLocation(nextRoom.getLocation());
			}
			else {
				protag.setLocation(nextRoom.getLocation());
			}
		}
	}

	public static Room[] getAdjacentRooms(Room currentRoom, Room[] rooms) {
		Room[] adjacentRooms = new Room[4];
		int[] currentLocation = currentRoom.getLocation();

		for (Room room : rooms) {
			for (int i = 0; i < adjacentRooms.length; i++) {
				if (currentLocation[i] == room.getID()) {
					adjacentRooms[i] = room;
				}
			}
		}
		return adjacentRooms;
	}

	public static Room getNextRoom(String response, Room[] adjacentRooms) {
		for (Room room : adjacentRooms) {
			if (room != null && room.getName().toLowerCase().equals(response)) {
				return room;
			}
		} 
		return null;
	}

	public static void printAdjacentRooms(Room[] adjacentRooms) {
		boolean first = false;

		for (int i = 0; i < adjacentRooms.length; i++) {
			if (adjacentRooms[i] != null && !first) {
				System.out.println(adjacentRooms[i].getName());
				first = true;
			}
			else if (adjacentRooms[i] != null) {
				System.out.println("                           " + adjacentRooms[i].getName());
			}
		}
	}

	public static void performGet(Protagonist protag, Room[] rooms, Room currentRoom) {
		Scanner input = new Scanner(System.in);
		String response;
		Item takenItem;

		System.out.print("\n     Room items found:     ");
		currentRoom.printItems();
		System.out.print("\n     Which item would you like to take? > ");
		response = input.nextLine();
		takenItem = currentRoom.getItem(response);

		if (takenItem == null) {
			System.out.println("\n     Invalid input.");
		}
		else if (spaceInInventory(protag) && takenItem.getWeight() == 0) {
			System.out.println("\n     You took the " + takenItem.getName() + ".");
			protag.addItem(takenItem);
			currentRoom.removeItem(takenItem);
		}
		else if (takenItem.getWeight() == 1) {
			System.out.println("\n     This item is too heavy to take.");
		}
		else {
			System.out.println("\n     Your inventory is full. You must drop an item before you can take another.");
			promptUser(protag, rooms);
		}
	}

	public static void performEquip(Protagonist protag) {
		Scanner input = new Scanner(System.in);
		String response;
		Item equippedItem;

		System.out.print("\n     Current inventory:    ");
		protag.printInventory();

		System.out.print("\n     Which item would you like to equip? > ");
		response = input.nextLine();
		equippedItem = protag.getItem(response);

		if (equippedItem == null) {
			System.out.println("\n     Invalid input.");
		}
		else if (equippedItem.getName().equals("Health Kit")) {
			System.out.println("\n     Your health has been replenished!");
			protag.resetHealth();
			protag.removeItem(equippedItem);
			protag.equip(null);
		}
		else {
			protag.equip(equippedItem);
			System.out.println("\n     You equipped the " + equippedItem.getName() + ".");
		}
	}

	public static void performInteract(Protagonist protag, Room[] rooms, Room currentRoom) {
		Scanner input = new Scanner(System.in);
		String response;
		Item selectedItem;
		Item itemContent;

		System.out.print("\n     Room items found:     ");
		currentRoom.printItems();
		System.out.print("\n     With which item would you like to interact? > ");
		response = input.nextLine();
		selectedItem = currentRoom.getItem(response);

		if (selectedItem == null) {
			System.out.println("\n     Invalid input.");
			return;
		}

		itemContent = selectedItem.getContents()[0];
		if (selectedItem.isInteractive() && itemContent != null && spaceInInventory(protag)) {
			System.out.print("\n     You found 1 item in the " + selectedItem.getName() + ":  " + itemContent.getName());
			itemContent.printDamage();
			System.out.print("     Would you like to take it? (y or n) > ");
			response = input.nextLine();

			if (response.equals("y")) {
				protag.addItem(itemContent);
				selectedItem.removeContent();
				System.out.println("\n     You took the " + itemContent.getName() + ".");
			}
			else if (!response.equals("n")) {
				System.out.println("\n     Invalid input.");
			}
			
		}
		else if (selectedItem.isInteractive() && itemContent != null && !spaceInInventory(protag)) {
			System.out.print("\n     You found 1 item in the " + selectedItem.getName() + ":  " + itemContent.getName());
			itemContent.printDamage();
			System.out.println("     Your inventory is full. You must drop an item if you want to take the " + itemContent.getName() + ".");
		}
		else if (selectedItem.isInteractive() && itemContent == null) {
			System.out.println("\n     You did not find anything in the " + selectedItem.getName() + ".");
		}
		else {
			System.out.println("\n     You cannot interact with this item.");
		}

	}

	public static void performAttack(Protagonist protag, Room[] rooms, Room currentRoom) {
		Scanner input = new Scanner(System.in);
		String response;
		Enemy selectedEnemy;

		System.out.print("\n     Nearby enemies:       ");
		currentRoom.printEnemies();

		System.out.print("\n     Which enemy would you like to attack? > ");
		response = input.nextLine();
		selectedEnemy = currentRoom.getEnemy(response);

		if (selectedEnemy == null) {
			System.out.println("\n     Invalid input.");
			return;
		}

		selectedEnemy.doDamage(protag.getEquip().getDamage());
		if (selectedEnemy.getType().equals("King Farhad") && enemyKilled(selectedEnemy)) {
			printVictoryMessage(protag);
			protag.gameOver();
			return;
		}

		else if (enemyKilled(selectedEnemy)) {
			System.out.println("\n     You killed the " + selectedEnemy.getType() + "!");
			if (selectedEnemy.hasKey()) {
				System.out.println("     He dropped his " + selectedEnemy.getWeapon().getName() + " and a Key.");
				currentRoom.addItem(selectedEnemy.getWeapon());
				currentRoom.addItem(selectedEnemy.getKey());
				currentRoom.removeEnemy(selectedEnemy);
				return;
			}
			else {
				System.out.println("     He dropped his " + selectedEnemy.getWeapon().getName() + ".");
				currentRoom.addItem(selectedEnemy.getWeapon());
				currentRoom.removeEnemy(selectedEnemy);
				return;
			}
		}

		protag.doDamage(selectedEnemy.getWeapon().getDamage());
		if (protagKilled(protag)) {
			System.out.println("\n     You were killed! Attempt a different approach next time!\n");
			protag.gameOver();
		}
		else {
			System.out.println("\n     You did " + protag.getEquip().getDamage() + " damage on the " + selectedEnemy.getType() + ".");
			System.out.println("          Enemy health: " + selectedEnemy.getHealth() + "%");
			System.out.println("     The " + selectedEnemy.getType() + " retaliated and did " + selectedEnemy.getWeapon().getDamage() + " damage on you.");
			System.out.println("          Your health: " + protag.getHealth() + "%");
		}
	}

	public static boolean enemyKilled(Enemy selectedEnemy) {
		if (selectedEnemy.getHealth() <= 0) {
			return true;
		}
		else {
			return false;
		}
	}

	public static boolean protagKilled(Protagonist protag) {
		if (protag.getHealth() <= 0) {
			return true;
		}
		else {
			return false;
		}
	}

	public static void performLook(Protagonist protag, Room currentRoom) {
		if (currentRoom.getEnemies()[0] != null) {
			System.out.print("\n     You found " + currentRoom.getEnemies().length + " enemies:  ");
			currentRoom.printEnemies();
			System.out.print("\n     You found " + currentRoom.getItems().length + " items:    ");
			currentRoom.printItems();
			currentRoom.searched();
		}
		else {
			System.out.print("\n     You found " + currentRoom.getItems().length + " items:    ");
			currentRoom.printItems();
			currentRoom.searched();
		}
	}

	public static Room getCurrentRoom(Protagonist protag, Room[] rooms) {
		for (Room room : rooms) {
			if (Arrays.equals(protag.getLocation(), room.getLocation())) {
				return room;
			}
		}
		return null;
	}

	public static boolean movedRooms(Room currentRoom, Protagonist protag, Room[] rooms) {
		if (currentRoom.equals(getCurrentRoom(protag, rooms))) {
			return false;
		}
		else {
			return true;
		}
	}

	public static boolean spaceInInventory(Protagonist protag) {
		for (Item item : protag.getInventory()) {
			if (item == null) {
				return true;
			}
		}
		return false;
	}
}













