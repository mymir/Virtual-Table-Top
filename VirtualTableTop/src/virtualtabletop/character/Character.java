package virtualtabletop.character;

public abstract class Character {
	private String name;
	private int armourClass;
	private int hitPoints;
	private int currentHitPoints;
	private int strength;
	private int initiative;
	private int initiativeBonus;
	private String weapon;
	
	
	public Character(String name, int armourClass,int hitPoints, int strength, int initiativeBonus, String weapon) {
		this.setName(name);
		this.setArmourClass(armourClass);
		this.setHitPoints(hitPoints);
		this.setStrength(strength);
		this.setinitiativeBonus(initiativeBonus);
		currentHitPoints = hitPoints;
	}

	public void setinitiativeBonus(int initiativeBonus) {
		this.initiativeBonus = initiativeBonus;
	}
	
	public int getinitiativeBonus() {
		return initiativeBonus;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}


	/**
	 * @return the armourClass
	 */
	public int getArmourClass() {
		return armourClass;
	}

	/**
	 * @param armourClass the armourClass to set
	 */
	public void setArmourClass(int armourClass) {
		this.armourClass = armourClass;
	}

	/**
	 * @return the hitPoints
	 */
	public int getHitPoints() {
		return hitPoints;
	}

	/**
	 * @param hitPoints the hitPoints to set
	 */
	public void setHitPoints(int hitPoints) {
		this.hitPoints = hitPoints;
	}

	/**
	 * @return the currentHitPoints
	 */
	public int getCurrentHitPoints() {
		return currentHitPoints;
	}

	/**
	 * @param currentHitPoints the currentHitPoints to set
	 */
	public void reduceCurrentHitPoints(int change) {
		currentHitPoints = currentHitPoints - change;
	}
	
	/**
	 * @param currentHitPoints the currentHitPoints to set
	 */
	public void addCurrentHitPoints(int change) {
		currentHitPoints = currentHitPoints + change;
	}

	/**
	 * @return the strength
	 */
	public int getStrength() {
		return strength;
	}

	/**
	 * @param strength the strength to set
	 */
	public void setStrength(int strength) {
		this.strength = strength;
	}
	
	/**
	 * @return the strength
	 */
	public int getInitiative() {
		return initiative;
	}

	/**
	 * @param strength the strength to set
	 */
	public void setInitiative(int initiative) {
		this.initiative = initiative + initiativeBonus;
	}
	
	/**
	 * @return the strength
	 */
	public String getWeapon() {
		return weapon;
	}
	
	public int getWeaponDice(String weaponType) {
		if (weaponType.equals("dagger") || weaponType.equals("knife")) {
			
		} else if (weaponType.equals("short sword") || weaponType.equals("short spear") 
				|| weaponType.equals("axe")) {
			
		} else if (weaponType.equals("sword")) {
			
		}
		return 3;
	}

	/**
	 * @param strength the strength to set
	 */
	public void setWeapon(int initiative) {
		initiative = initiative + initiativeBonus;
	}

}
