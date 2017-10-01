package virtualtabletop.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

import virtualtabletop.character.Character;
import virtualtabletop.character.Enemy;
import virtualtabletop.character.PlayerCharacter;
import virtualtabletop.directory.CharacterDirectory;

public class CharacterDirectoryIO {
	public static CharacterDirectory readCharacterFile(String fileName) throws FileNotFoundException {
		Scanner fileReader = new Scanner(new FileInputStream(fileName));
    		CharacterDirectory characters = new CharacterDirectory();
    		while (fileReader.hasNextLine()) {
    		try {
                Character ch = processCharacter(fileReader.nextLine());
                characters.addCharacter(ch);
            } catch (IllegalArgumentException e) {
                //skip the line
            }
		}
    	fileReader.close();
    	return characters;
	}
	/**
	 * private method to hold the line of text
	 * @param nextLine line of text taken from file above. 
	 * @return s student object so the read method can process it
	 */
	private static Character processCharacter(String nextLine) {
		try{
			Character c = null;
			Scanner l = new Scanner(nextLine);
			l.useDelimiter(",");
			String name = l.next();
			int armourClass = l.nextInt();
			int hitPoints = l.nextInt();
			int currentHitPoints = l.nextInt();
			int strength = l.nextInt();
			
			if (l.hasNextInt()) {
				int challengeRating = l.nextInt();
				c = new Enemy(name, armourClass, hitPoints, currentHitPoints, strength, challengeRating);
			}
			else if(l.hasNext()) {
				String weapon = l.next();
				c = new PlayerCharacter(name, armourClass, hitPoints, currentHitPoints, strength, weapon);
			}
			l.close();

			return c;
		} catch (Exception e) {
			throw new IllegalArgumentException();
		}

	}
}
