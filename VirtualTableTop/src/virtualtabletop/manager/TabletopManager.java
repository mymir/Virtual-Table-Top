package virtualtabletop.manager;

import java.util.ArrayList;
import virtualtabletop.character.Character;

public class TabletopManager {
	private ArrayList<Character>  characterDirectory;
	
	public TabletopManager() {
		
	}
	
	public void addNewPlayerCharacter(String name, int armourClass,int hitPoints, int currentHitPoints, int strength){
		Character c = new PlayerCharacterCharacter(name, armourClass, hitPoints, currentHitPoints, strength);
		characterDirectory.add(c);
	}
	
	public void addNewEnemy(String name, int armourClass,int hitPoints, int currentHitPoints, int strength) {
		Character c = new Enemy(name, armourClass, hitPoints, currentHitPoints, strength);
		characterDirectory.add(c);
	}
	
	public void removeCharacter(Character c){
		
	}
}
