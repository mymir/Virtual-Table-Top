package virtualtabletop.directory;

import java.util.ArrayList;

import virtualtabletop.character.Character;
import virtualtabletop.character.Enemy;
import virtualtabletop.character.PlayerCharacter;
import virtualtabletop.dice.Dice;

public class CharacterDirectory {
	ArrayList<Character> cd = new ArrayList<Character>();
	
	public CharacterDirectory(){
		setCharacterDirectory(cd);
	}
	
	public void addNewPlayerCharacter(String name, int armourClass,int hitPoints, int currentHitPoints, int strength, String weapon){
		Character c = new PlayerCharacter(name, armourClass, hitPoints, currentHitPoints, strength, weapon);
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
//		if (cd.size() != 0) {
//			for(Character ch : cd) {
//				for(Character ch2 : cd) {
//					if (ch.getInitiative() >= ch2.getInitiative()) {
//						cd.add(cd.indexOf(ch2)+1, ch);
//					}
//					else {
//						cd.add(cd.indexOf(ch2), ch);
//					}
//				}
//			}
//			
//		}
		cd.add(c);
	}
	
	public ArrayList<Character> getCharacterDirectory(){
		return cd;
	}
	
	public void setCharacterDirectory(ArrayList<Character> cd){
		this.cd = cd;
	}
	
	private void rollInit(Character c) {
		Dice d = new Dice(20);

		c.setInitiative(d.roll());
	}
	
	public String getCharacterInfo(){
		String message = "Initiative\tName\tHit Points\tArmor Class\n";
		for(Character ch : cd) {
			message += ch.getInitiative() + "\t" + ch.getName() + "\t" + ch.getCurrentHitPoints() + "/" + ch.getHitPoints() + "\t"
					+ ch.getArmorClass() + "\n";
		}
		return message;
	}
}
