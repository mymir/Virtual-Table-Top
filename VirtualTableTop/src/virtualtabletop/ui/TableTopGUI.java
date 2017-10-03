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
/**A JFrame panel that lets a user interact with the program. 
 * 
 * @author Rafael Zingle
 * @author Madison Hurd
 *
 */
public class TableTopGUI extends JFrame implements ActionListener{
	private static final long serialVersionUID = 1L;
	//GUI set-up
	private static final int WINDOW_WIDTH = 500;
	private static final  int WINDOW_HEIGHT = 300;
	private static JPanel panel;
	//functionality
	private static JButton attack;
	private static JComboBox target;
	private static JTextArea characters; 
	private static JLabel init;
	//association
	private CharacterDirectory characterList;
	private CharacterDirectoryIO characterIo = new CharacterDirectoryIO();
	//state tracker
	private Character currentPlayer;
	private Character currentTarget;
	private boolean targetSelected = false;
	private boolean hasRolledInitiative = false;

	/**Sets up the GUI's components and adds them to the pane.
	 * 
	 */
	public TableTopGUI() {
		Container contentPane = getContentPane(); 
		//create components
		panel = new JPanel();
		panel.setVisible(true);
		
		attack = new JButton();
		attack.setText("Roll Initiative");
		attack.addActionListener(this);
		attack.setVisible(true);
		
		init = new JLabel(); 
		init.setText("Initiavtive: --");
		
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
			setTextString += c.getName() + "\t" + c.getHitPoints() + "/" + c.getCurrentHitPoints() + "\t" + c.getArmorClass() + "\n";
		}
		characters.setText(setTextString);
		
		target.setVisible(true);
		//add components
		panel.add(attack);
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

	/**Overrides the actionPreformed method to give the GUI components
	 * functionality. 
	 * 
	 */
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == attack) {
			if (!hasRolledInitiative) {
				Dice die = new Dice(20); 
				int roll = die.roll();
				init.setText("Initiavtive: " + Integer.toString(roll));
				attack.setText("Attack");
				hasRolledInitiative = true;
			} else {
				if (targetSelected) {
					//attack
				} else {
					//pop up saying "No target selected!"
				}
			}
		}

	}
	
	/**The main method that allows the program to run. 
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		TableTopGUI gui = new TableTopGUI();
	}

}
