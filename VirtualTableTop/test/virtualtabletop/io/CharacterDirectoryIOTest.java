package virtualtabletop.io;

import static org.junit.Assert.*;

import java.io.FileNotFoundException;

import org.junit.Test;

import virtualtabletop.character.Enemy;
import virtualtabletop.directory.CharacterDirectory;

public class CharacterDirectoryIOTest {

	@Test
	public void testCharacterDirectoryIO() {
		CharacterDirectory directory = new CharacterDirectory(); 
//		Enemy c = new Enemy("Bob", 3, 3, 3, 3, 3); 
		directory.addNewEnemy("Bob", 3, 3, 3, 3, 3);
		assertFalse(directory.getCharacterDirectory().isEmpty());

		
		CharacterDirectoryIO io = new CharacterDirectoryIO(); 
		
//		try {
//			CharacterDirectory directory = io.readCharacterFile("match-directory/match_yourname.txt");
//			assertFalse(directory.getCharacterDirectory().isEmpty());
//		} catch (FileNotFoundException e) {
//			fail("File should exist");
//		}
		
	}

}
