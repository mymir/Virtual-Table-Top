/**
 * 
 */
package virtualtabletop.ui;
import virtualtabletop.io.CharacterDirectoryIO;
import virtualtabletop.character.Character;
import java.awt.*;
import java.io.FileNotFoundException;
import java.util.ArrayList;

import javax.swing.*;

import virtualtabletop.directory.CharacterDirectory;
/**
 * @author rafaelzingle
 *
 */
public class TableTopGUI extends JFrame {
	//GUI set-up
	private static final int WINDOW_WIDTH = 600;
	private static final  int WINDOW_HEIGHT = 300;
	private static JPanel panel;
	//functionality
	private static JButton attack;
	private static JButton rollInitiative;
	private static JComboBox weapon;
	private static JComboBox target;
	private static JTextArea characters; 
	//association
	private CharacterDirectory characterList = new CharacterDirectory();
	private CharacterDirectoryIO characterIo = new CharacterDirectoryIO();

	/**
	 * 
	 */
	public TableTopGUI() {
		Container contentPane = getContentPane(); 
		//create components
		panel = new JPanel();
		panel.setVisible(true);
		
		attack = new JButton();
		attack.setText("Attack");
		attack.setVisible(true);
		
		rollInitiative = new JButton();
		rollInitiative.setText("Roll Initiative");
		rollInitiative.setVisible(true);
		
		weapon = new JComboBox();
		weapon.setVisible(true);
		
		target = new JComboBox();
		try {
			characterIo.readCharacterFile("match-directory/match_yourname.txt");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ArrayList<Character> list = characterList.getCharacterDirectory();
		for (Character c: list) {
			target.addItem(c.getName());
		}
		target.setVisible(true);
		//add components
		panel.add(attack);
		panel.add(target);
		panel.add(rollInitiative);
		contentPane.add(panel);
		
		//set-up window
		setTitle("Virtual Table Top ");
		setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
		setLocation(450, 250);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		TableTopGUI gui = new TableTopGUI();
	}

}
