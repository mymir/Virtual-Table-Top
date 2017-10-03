package virtualtabletop.character;

/**An abstract class that that holds character information.
 *
 * @author Rafael Zingle
 * @author Madison Hurd
 */
public abstract class Character {
	
	/** The Character's name. */
	private String name;
	/** The Character's armourClass. */
	private int armorClass;
	/** The Character's hitPoints. */
	private int hitPoints;
	/** The Character's currentHitPoints. */
	private int currentHitPoints;
	/** The Character's strength. */
	private int strength;
	/** The Character's initiative. */
	private int initiative;
	/** The Character's initiativeBonus. */
	private int initiativeBonus;
	/** The Character's weapon. */
	private String weapon;
	
	/**Creates a new Character.
	 * 
	 * @param name, the name of the character
	 * @param armourClass, the character's armor class
	 * @param hitPoints, the character's hit points
	 * @param strength, the character's strength
	 * @param initiativeBonus, the character's initiative bonus
	 */
	public Character(String name, int armorClass,int hitPoints, int strength, int initiativeBonus) {
		this.setName(name);
		this.setArmorClass(armorClass);
		this.setHitPoints(hitPoints);
		this.setStrength(strength);
		this.setinitiativeBonus(initiativeBonus);
		currentHitPoints = hitPoints;
	}

	/**Sets the Character's initiative bonus.
	 * 
	 * @param initiativeBonus, the character's initiative bonus
	 */
	public void setinitiativeBonus(int initiativeBonus) {
		this.initiativeBonus = initiativeBonus;
	}
	
	/**Returns the character's initiative bonus.
	 * 
	 * @return initiativeBonus, the character's initiative bonus
	 */
	public int getinitiativeBonus() {
		return initiativeBonus;
	}

	/**Returns the character's name.
	 * 
	 * @return name, the character's name
	 */
	public String getName() {
		return name;
	}

	/**Sets the character's name.
	 * 
	 * @param name, the character's name
	 */
	public void setName(String name) {
		this.name = name;
	}


	/**Returns the character's armor class.
	 * 
	 * @return armorClass, the character's armor class
	 */
	public int getArmorClass() {
		return armorClass;
	}

	/**Sets the character's armor class.
	 * 
	 * @param armourClass, the character's armor class
	 */
	public void setArmorClass(int armorClass) {
		this.armorClass = armorClass;
	}

	/**Returns the character's hit points.
	 * 
	 * @return hitPoints, the character's hit points
	 */
	public int getHitPoints() {
		return hitPoints;
	}

	/**Sets the character's hit points.
	 * 
	 * @param hitPoints, the character's hit points
	 */
	public void setHitPoints(int hitPoints) {
		this.hitPoints = hitPoints;
	}

	/**Returns the character's current hit points.
	 * 
	 * @return currentHitPoints, the character's current hit points
	 */
	public int getCurrentHitPoints() {
		return currentHitPoints;
	}

	/**Reduces the character's current hit points if they take damage.
	 * 
	 * @param change, the amount of damage the character takes
	 */
	public void reduceCurrentHitPoints(int change) {
		currentHitPoints = currentHitPoints - change;
	}
	
	/**Restores the character's current hit points if they are healed. 
	 * A character cannot have more current hit points than their max
	 * hit points. 
	 * 
	 * @param change, the amount of health the character gains back
	 */
	public void addCurrentHitPoints(int change) {
		if (currentHitPoints + change > hitPoints) {
			currentHitPoints = hitPoints;
		} else {
			currentHitPoints = currentHitPoints + change;
		}
	}

	/**Returns the character's strength.
	 * 
	 * @return strength, the character's strength
	 */
	public int getStrength() {
		return strength;
	}

	/**Sets the character's strength.
	 * 
	 * @param strength, the character's strength
	 */
	public void setStrength(int strength) {
		this.strength = strength;
	}
	
	/**Returns the character's initiative.
	 * 
	 * @return initiative, the character's initiative
	 */
	public int getInitiative() {
		return initiative;
	}

	/**Sets the character's initiative.
	 * 
	 * @param initiative, the character's initiative
	 */
	public void setInitiative(int initiative) {
		this.initiative = initiative + initiativeBonus;
	}

}
