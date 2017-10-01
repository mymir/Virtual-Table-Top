package virtualtabletop.manager;

import java.util.ArrayList;
import virtualtabletop.character.Character;
import virtualtabletop.character.Enemy;
import virtualtabletop.dice.Dice;

public class TabletopManager {
	private static ArrayList<Character>  characterDirectory;
	
	public TabletopManager() {
		
	}
	
	public void addNewPlayerCharacter(String name, int armourClass,int hitPoints, int currentHitPoints, int strength){
		Character c = new PlayerCharacter(name, armourClass, hitPoints, currentHitPoints, strength);
		rollInit(c);
		
		addCharacter(c);
	}
	
	public void addNewEnemy(String name, int armourClass,int hitPoints, int currentHitPoints, int strength, int challengeRating) {
		Character c = new Enemy(name, armourClass, hitPoints, currentHitPoints, strength, challengeRating);
		rollInit(c);
		
		addCharacter(c);
	}
	
	public void removeCharacter(Character c){
		
	}
	
	public void addCharacter(Character c) {
		if (characterDirectory.size() != 0) {
			for(Character ch : characterDirectory) {
				for(Character ch2 : characterDirectory) {
					if (ch.getInitiative() >= ch2.getInitiative()) {
						characterDirectory.add(characterDirectory.indexOf(ch2)+1, ch);
					}
					else {
						characterDirectory.add(characterDirectory.indexOf(ch2), ch);
					}
				}
			}
		}
	}
	
	public static ArrayList<Character> getCharacterDirectory(){
		return characterDirectory;
	}
	
	private void rollInit(Character c) {
		Dice d = new Dice(20);

		c.setInitiative(d.roll());
	}
}
