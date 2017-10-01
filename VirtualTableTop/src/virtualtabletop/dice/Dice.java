package virtualtabletop.dice;

public class Dice {
	private int sides;
	
	public Dice(int sides) {
		setSides(sides);
	}
	
	public int getSides(){
		return sides;
	}
	
	public void setSides(int sides) throws IllegalArgumentException {
		if (sides == 4 || sides == 6 || sides == 8 ||
			sides == 10 || sides == 12 || sides == 20) {
			this.sides = sides;
		}
		else {
			throw new IllegalArgumentException("Invalid number of sides");
		}
	}
	
	public int roll(int sides) {
		return (int) (Math.random()*sides) + 1;
	}
}
