package virtualtabletop.character;

/**Extends Character to hold information unique to a player in the game.  
*
* @author Rafael Zingle
* @author Madison Hurd
*/
public class PlayerCharacter extends Character{
	
	/** The Player's Weapon. */
	private String weapon;

	/**Creates a new Player.
	 * 
	 * @param name, the name of the player
	 * @param armourClass, the player's armor class
	 * @param hitPoints, the player's hit points
	 * @param strength, the player's strength
	 * @param initiativeBonus, the player's initiative bonus
	 * @param weapon, the player's weapon
	 */
	public PlayerCharacter(String name, int armourClass,int hitPoints, int strength, int initiativeBonus, String weapon) {
		super(name, armourClass, hitPoints, strength, initiativeBonus);
		this.setWeapon(weapon);
	}
	
	/**Returns a player's weapon.
	 * 
	 * @return weapon, the player's weapon
	 */
	public String getWeapon() {
		return weapon;
	}
	
	/**Returns which sided dice is used when the player attacks. The
	 * weapon the player uses determines what dice they get to roll. 
	 * the better the weapon they have, the higher they can roll.
	 * 
	 * @param weaponType
	 * @return dice sides, the number of sides on the dice used
	 */
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

	/**Sets a player's weapon. 
	 * 
	 * @param weapon, the player's weapon
	 */
	public void setWeapon(String weapon) {
		this.weapon = weapon;
	}
}
