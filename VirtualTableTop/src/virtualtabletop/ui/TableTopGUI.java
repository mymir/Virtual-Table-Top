/**
 * 
 */
package virtualtabletop.ui;
import virtualtabletop.io.CharacterDirectoryIO;
import virtualtabletop.character.Character;
import virtualtabletop.character.Enemy;
import virtualtabletop.dice.Dice;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.util.ArrayList;

import javax.swing.*;

import virtualtabletop.directory.CharacterDirectory;
/**
 * @author rafaelzingle
 *
 */
public class TableTopGUI extends JFrame implements ActionListener{
	//GUI set-up
	private static final int WINDOW_WIDTH = 600;
	private static final  int WINDOW_HEIGHT = 300;
	private static JPanel panel;
	//functionality
	private static JButton attack;
	private static JButton rollInitiative;
	private static JComboBox target;
	private static JTextArea characters; 
	private static JLabel init;
	//association
	private CharacterDirectory characterList;
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
		rollInitiative.addActionListener(this);
		rollInitiative.setVisible(true);
		
		init = new JLabel(); 
		init.setText("--");
		
		target = new JComboBox();
		try {
			characterList = CharacterDirectoryIO.readCharacterFile("match-directory/match_yourname.txt");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		ArrayList<Character> list = characterList.getCharacterDirectory();
		target.addItem("Select A Target");
		for (Character c: list) {
			if (c instanceof Enemy) {
				target.addItem(c.getName());
			}
		}
		
		characters = new JTextArea(); 
		String setTextString = "Name\tHealth Points\tArmour Class\n";
		for (Character c: list) {
			setTextString += c.getName() + "\t" + c.getHitPoints() + "/" + c.getCurrentHitPoints() + "\t" + c.getArmourClass() + "\n";
		}
		characters.setText(setTextString);
		
		target.setVisible(true);
		//add components
		panel.add(attack);
		panel.add(rollInitiative);
		panel.add(init);
		panel.add(target);
		panel.add(characters);
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

	@Override
	public void actionPerformed(ActionEvent e) {
		Dice die = new Dice(20); 
		int roll = die.roll();
		init.setText(Integer.toString(roll));
	}

}
