package virtualtabletop.character;

public class Enemy extends Character {
	private int challengeRating;

	public Enemy(String name, int armourClass,int hitPoints, int strength, int initiativeBonus, int challengeRating) {
		super(name, armourClass, hitPoints, strength, initiativeBonus, null);
		setChallengeRating(challengeRating);
	}

	/**
	 * @return the challengeRating
	 */
	public int getChallengeRating() {
		return challengeRating;
	}

	/**
	 * @param challengeRating the challengeRating to set
	 */
	public void setChallengeRating(int challengeRating) {
		this.challengeRating = challengeRating;
	}
}
