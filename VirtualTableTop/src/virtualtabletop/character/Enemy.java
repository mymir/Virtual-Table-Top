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
