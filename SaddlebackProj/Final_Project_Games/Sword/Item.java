/*
NAME 			TYPE 		VALUE RANGE		DESCRIPTION
=========== 	======= 	=========== 	=========================================
contents 		Item[] 		n/a 			contents of an item
damage 			int 		any int 		the damage of the item
interactive 	boolean 	true/false 		used for interaction
name 			String 		any String 		the name of the item
weight 			int 		any int 		weight of the item

*/

public class Item {
	private String name;
	private int damage;
	private int weight;
	private Item[] contents;
	private boolean interactive;

	public Item(String name, Item[] contents) {
		this.name = name;
		this.weight = 1;
		this.contents = contents;
		this.damage = 0;
		this.interactive = true;
	}

	public Item(String name, int damage, int weight) {
		this.name = name;
		this.weight = weight;
		this.damage = damage;
		this.interactive = false;
		this.contents = new Item[1];
	}

	public void makeInteractive() {
		interactive = true;
	}

	public void removeContent() {
		this.contents[0] = null;
	}

	public String getName() {
		return name;
	}

	public int getWeight() {
		return weight;
	}

	public int getDamage() {
		return damage;
	}

	public Item[] getContents() {
		return contents;
	}

	public boolean isInteractive() {
		return interactive;
	}

	public boolean equals(Item item) {
		if (this.name.equals(item.getName())) {
			return true;
		}
		else {
			return false;
		}
	}

	public void printItem() {
		System.out.println(contents[0].getName());
	}

	public void printDamage() {
		if (this.damage == 0) {
			System.out.println();
		}
		else {
			System.out.println("  (Weapon Attack Damage: " + this.damage + ")");
		}
	}
}





