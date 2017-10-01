package virtualtabletop.manager;

import java.util.ArrayList;
import virtualtabletop.character.Character;
import virtualtabletop.character.Enemy;
import virtualtabletop.dice.Dice;

public class TabletopManager {
	private ArrayList<Character>  characterDirectory;
	
	public TabletopManager() {
		
	}
	
	public void addNewPlayerCharacter(String name, int armourClass,int hitPoints, int currentHitPoints, int strength){
		Character c = new PlayerCharacter(name, armourClass, hitPoints, currentHitPoints, strength);
		c.setInitiative(rollInit(c));
		characterDirectory.add(c);
	}
	
	public void addNewEnemy(String name, int armourClass,int hitPoints, int currentHitPoints, int strength) {
		Character c = new Enemy(name, armourClass, hitPoints, currentHitPoints, strength, name);
		c.setInitiative(rollInit(c));
		characterDirectory.add(c);
	}
	
	public void removeCharacter(Character c){
		
	}
	
	public static ArrayList<Character> getCharacterDirectory(){
		return characterDirectory;
	}
	
	private int rollInit(Character c) {
		Dice d = new Dice(20);
		int init;
		init = c.getInitiativeBonus() + d.roll();
		
		return init;
	}
}
