package virtualtabletop.character;

/**Extends Character to hold information unique to an enemy in the game.  
 *
 * @author Rafael Zingle
 * @author Madison Hurd
 */
public class Enemy extends Character {
	
	/** The Enemy's  challengeRating. */
	private int challengeRating;

	/**Creates a new Enemy.
	 * 
	 * @param name, the name of the enemy
	 * @param armourClass, the enemy's armor class
	 * @param hitPoints, the enemy's hit points
	 * @param strength, the enemy's strength
	 * @param initiativeBonus, the enemy's initiative bonus
	 * @param challengeRating, the enemy's challenge rating
	 */
	public Enemy(String name, int armourClass,int hitPoints, int strength, int initiativeBonus, int challengeRating) {
		super(name, armourClass, hitPoints, strength, initiativeBonus);
		setChallengeRating(challengeRating);
	}

	/**Returns the enemy's challenge rating.
	 * 
	 * @return challengeRating, the enemy's challenge rating
	 */
	public int getChallengeRating() {
		return challengeRating;
	}

	/**Sets the enemy's challenge rating. The challenge rating
	 * has to be a number between 0 and 3.
	 * 
	 * @param challengeRating, the enemy's challenge rating
	 */
	public void setChallengeRating(int challengeRating) {
		if (challengeRating < 0 || challengeRating > 3) {
			this.challengeRating = 0;
		} else {
			this.challengeRating = challengeRating;	
		}
	}
	
	/**Returns which sided dice is used when the enemy attacks. The 
	 * higher an enemy's challenge rating, the higher they can roll
	 * when they attack.
	 * 
	 * @param challengeRating, the enemy's challenge rating
	 * @return dice sides, the number of sides on the dice used
	 */
	public int getDiceSides(int challengeRating) {
		if (challengeRating == 1) {
			return 4;
		} else if (challengeRating == 2) {
			return 6;
		} else if (challengeRating == 3) {
			return 8;
		} else {
			return 0;
		}
	}
}
