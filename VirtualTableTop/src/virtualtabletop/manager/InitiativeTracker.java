/**
 * 
 */
package virtualtabletop.manager;

import java.util.ArrayList;
import virtualtabletop.character.Character;
import virtualtabletop.character.Enemy;
import virtualtabletop.character.PlayerCharacter;
import virtualtabletop.directory.CharacterDirectory;

/**
 * @author Madison Hurd
 *
 */
public class InitiativeTracker {
	private CharacterDirectory cd = new CharacterDirectory();
	private ArrayList<Character> c = cd.getCharacterDirectory();
	
	public InitiativeTracker() {
		
	}
	
	public void processTurn() {
		while(!isFinished().equalsIgnoreCase("continue")){
			
		}
	}
	public String isFinished() {
		int enemy = 0;
		int playerCharacter = 0;
		String winnerMessage;
		
		for (Character ch : c) {
			if (ch instanceof Enemy) {
				enemy++;
			}
			if (ch instanceof PlayerCharacter) {
				playerCharacter++;
			}
		}
		
		if (enemy == 0 && playerCharacter != 0) {
			winnerMessage = "Player Characters have won!";
		}
		if (playerCharacter == 0 && enemy != 0) {
			winnerMessage = "Enemies have won!";
		}
		if (playerCharacter == 0 && enemy == 0) {
			throw new IllegalArgumentException();
		}
		else {
			winnerMessage = "continue";
		}
		
		return winnerMessage;
	}
	
}
