/**
 * 
 */
package virtualtabletop.manager;

import java.util.ArrayList;
import virtualtabletop.character.Character;
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
	
}
