package virtualtabletop.character;

public class PlayerCharacter extends Character{
	private String weapon;

	public PlayerCharacter(String name, int armourClass,int hitPoints, int strength, int initiativeBonus, String weapon) {
		super(name, armourClass, hitPoints, strength, initiativeBonus);
		this.setWeapon(weapon);
	}
	
	/**
	 * @return the strength
	 */
	public String getWeapon() {
		return weapon;
	}
	
	public int getWeaponDice(String weaponType) {
		if (weaponType.equals("dagger") || weaponType.equals("knife")) {
			return 4;
		} else if (weaponType.equals("short sword") || weaponType.equals("short spear") 
				|| weaponType.equals("axe")) {
			return 6;
		} else if (weaponType.equals("long sword") || weaponType.equals("long spear") || weaponType.equals("battle axe")) {
			return 8;
		}
		else {
			return 0;
		}
	}

	/**
	 * @param strength the strength to set
	 */
	public void setWeapon(String weapon) {
		this.weapon = weapon;
	}
}
