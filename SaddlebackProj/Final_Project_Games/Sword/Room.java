/*

NAME 			TYPE 		VALUE RANGE		DESCRIPTION
=========== 	======= 	=========== 	=========================================
name 			String		any String		name of room
id 				int 		1 - 5 			room ID number
location 		int[] 		int[] object 	location of room
items 			Item[] 		Item[] object 	array of Items in room
enemies 		Enemy[] 	Enemy[] object	array of Enemies in room
searched 		boolean 	true/false 		searched status of room
locked 			boolean 	true/false 		locked status of room
*/

public class Room {
	private String name;
	private int id;
	private int[] location;
	private Item[] items;
	private Enemy[] enemies;
	private boolean searched;
	private boolean locked;

	public Room(String name, int id, int[] location, Item[] items, Enemy[] enemies) {
		this.name = name;
		this.id = id;
		this.location = location;
		this.items = items;
		this.enemies = enemies;
		this.searched = false;
		this.locked = false;
	}

	public void setEnemies(Enemy[] enemies) {
		this.enemies = enemies;
	}

	public void searched() {
		searched = true;
	}

	public void lock() {
		locked = true;
	}

	public void unlock() {
		locked = false;
	}

	public boolean isLocked() {
		return locked;
	}
 
	public void addItem(Item item) {
		Item[] newItems = new Item[this.items.length + 1];

		for (int i = 0; i < newItems.length; i++) {
			if (i == newItems.length - 1) {
				newItems[i] = item;
			}
			else {
				newItems[i] = this.items[i];
			}
		}
		this.items = newItems;
	}

	public void removeItem(Item item) {
		Item[] newItems = new Item[items.length - 1];

		for (int i = 0; i < items.length; i++) {
			if (!items[i].equals(item)) {
				add(newItems, items[i]);
			}
		}
		this.items = newItems;
	}

	public String getName() {
		return name;
	}

	public int getID() {
		return id;
	}

	public int[] getLocation() {
		return location;
	}

	public Item[] getItems() {
		return items;
	}

	public Item getItem(String itemName) {
		for (Item item : items) {
			if (item != null && item.getName().toLowerCase().equals(itemName.toLowerCase())) {
				return item;
			}
		}
		return null;
	}

	public Enemy[] getEnemies() {
		return enemies;
	}

	public Enemy getEnemy(String enemyType) {
		for (Enemy enemy : enemies) {
			if (enemy != null && enemy.getType().toLowerCase().equals(enemyType.toLowerCase())) {
				return enemy;
			}
		}
		return null;
	}

	public void removeEnemy(Enemy selectedEnemy) {
		Enemy[] newEnemies;

		if (enemies.length == 1) {
			enemies[0] = null;
			return;
		}

		newEnemies = new Enemy[enemies.length - 1];
		for (int i = 0; i < enemies.length; i++) {
			if (!enemies[i].equals(selectedEnemy)) {
				add(newEnemies, enemies[i]);
			}
		}
		this.enemies = newEnemies;
	}

	public boolean enemiesLeft() {
		if (this.enemies[0] != null) {
			return true;
		}
		else {
			return false;
		}
	}

	public boolean isSearched() {
		return searched;
	}

	public boolean equals(Room room) {
		if (this.name.equals(room.getName())) {
			return true;
		}
		else {
			return false;
		}
	}

	public void printItems() {
		for (int i = 0; i < items.length; i++) {
			if (i > 0) {
				System.out.print("                           " + items[i].getName());
				items[i].printDamage();
			}
			else {
				System.out.print(items[i].getName());
				items[i].printDamage();
			}
		}
	}

	public void printEnemies() {
		for (int i = 0; i < enemies.length; i++) {
			if (i > 0) {
				System.out.println("                           " + 
								   enemies[i].getType() + "  (Enemy Attack Damage: " + enemies[i].getWeapon().getDamage() + ")");
			}
			else {
				System.out.println(enemies[i].getType() + "  (Enemy Attack Damage: " + enemies[i].getWeapon().getDamage() + ")");
			}
		}
	}

	private void add(Item[] newItems, Item item) {
		for (int i = 0; i < newItems.length; i++) {
			if (newItems[i] == null) {
				newItems[i] = item;
				return;
			}
		}
	}

	private void add(Enemy[] newEnemies, Enemy enemy) {
		for (int i = 0; i < newEnemies.length; i++) {
			if (newEnemies[i] == null) {
				newEnemies[i] = enemy;
				return;
			}
		}
	}
}







