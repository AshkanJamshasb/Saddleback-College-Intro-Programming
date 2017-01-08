/*

NAME 			TYPE 		VALUE RANGE		DESCRIPTION
=========== 	======= 	=========== 	=========================================
type 			String 		any String 		type of enemy
weapon 			Item 		Item object 	enemy weapon
key 			Item 		Item object 	door key dropped upon death
health 			int 		0 - 100 		enemy health

*/

public class Enemy {
	private String type;
	private Item weapon;
	private Item key;
	private int health;

	public Enemy(String type, Item weapon) {
		this.type = type;
		this.weapon = weapon;
		this.key = null;
		this.health = 100;
	}

	public Enemy(String type, Item weapon, int health) {
		this.type = type;
		this.weapon = weapon;
		this.key = null;
		this.health = health;
	}

	public Enemy(String type, Item weapon, Item key) {
		this.type = type;
		this.weapon = weapon;
		this.key = key;
		this.health = 100;
	}

	public void doDamage(int damage) {
		health -= damage;
	}

	public String getType() {
		return type;
	}

	public Item getWeapon() {
		return weapon;
	}

	public int getHealth() {
		return health;
	}

	public boolean hasKey() {
		if (this.key == null) {
			return false;
		}
		else {
			return true;
		}
	}

	public Item getKey() {
		return key;
	}

	public boolean equals(Enemy enemy) {
		if (this.type.equals(enemy.getType())) {
			return true;
		}
		else {
			return false;
		}
	}
}