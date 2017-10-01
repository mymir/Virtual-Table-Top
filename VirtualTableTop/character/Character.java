package virtualtabletop.character;

public abstract class Character {
	private String name;
	private int armourClass;
	private int hitPoints;
	private int currentHitPoints;
	private int strength;
	private int initiative;
	private int initiativeBonus;
	
	
	public Character(String name, int armourClass,int hitPoints, int currentHitPoints, int strength, int initiativeBonus) {
		this.setName(name);
		this.setArmourClass(armourClass);
		this.setHitPoints(hitPoints);
		this.setCurrentHitPoints(currentHitPoints);
		this.setStrength(strength);
		this.setinitiativeBonus(initiativeBonus);
	}

	private void setinitiativeBonus(int initiativeBonus) {
		initiativeBonus = initiativeBonus;
	}
	
	private int getinitiativeBonus(int initiativeBonus) {
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
	public void setCurrentHitPoints(int currentHitPoints) {
		this.currentHitPoints = currentHitPoints;
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
	public int getinitiative() {
		return initiative;
	}

	/**
	 * @param strength the strength to set
	 */
	public void setinitiative(int initiative) {
		initiative = initiative + initiativeBonus;
	}

}
