/*

NAME 			TYPE 		VALUE RANGE		DESCRIPTION
=========== 	======= 	=========== 	=========================================
name 			String 		any String 		name of protagonist
inventory 		Item[] 		Item[] object 	array of Items in inventory
equip 			Item 		Item object 	equipped Item
location 		int[] 		int[] object	current location
health 			int 		0 - 100 		protagonist health
alive 			boolean		true/false 		alive or dead
*/

public class Protagonist {
	private String name;
	private Item[] inventory;
	private Item equip;
	private int[] location;
	private int health;
	private boolean alive;

	public Protagonist(String name, int[] location, Item[] inventory) {
		this.name = name;
		this.location = location;
		this.inventory = inventory;
		this.equip = null;
		this.health = 100;
		this.alive = true;
	}

	public void addItem(Item item) {
		for (int i = 0; i < inventory.length; i++) {
			if (inventory[i] == null) {
				inventory[i] = item;
				return;
			}
		}
	}

	public void removeItem(Item item) {
		for (int i = 0; i < inventory.length; i++) {
			if (inventory[i] != null && inventory[i].equals(item)) {
				inventory[i] = null;
				return;
			}
		}
	}

	public void setLocation(int[] location) {
		this.location = location;
	}

	public void doDamage(int damage) {
		health -= damage;
	}

	public void gameOver() {
		alive = false;
	}

	public String getName() {
		return name;
	}

	public Item[] getInventory() {
		return inventory;
	}

	public void equip(Item item) {
		this.equip = item;
	}

	public Item getEquip() {
		return equip;
	}

	public Item getItem(String itemName) {
		for (Item item : inventory) {
			if (item != null && item.getName().toLowerCase().equals(itemName.toLowerCase())) {
				return item;
			}
		}
		return null;
	}

	public int[] getLocation() {
		return location;
	}

	public void resetHealth() {
		this.health = 100;
	}

	public int getHealth() {
		return health;
	}

	public boolean isAlive() {
		return alive;
	}

	public void printInventory() {
		boolean first = false;

		for (int i = 0; i < inventory.length; i++) {
			if (inventory[i] != null && !first) {
				System.out.print(inventory[i].getName());
				inventory[i].printDamage();
				first = true;
			}
			else if (inventory[i] != null) {
				System.out.print("                           " + inventory[i].getName());
				inventory[i].printDamage();
			}
		}
	}
}






