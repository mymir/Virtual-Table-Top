/**
 * 
 */
package virtualtabletop.dice;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * @author Madison Hurd
 *
 */
public class DiceTest {

	/**
	 * Test method for {@link virtualtabletop.dice.Dice#Dice(int)}.
	 */
	@Test
	public void testDice() {
		//good dice
		Dice d20 = new Dice(20);
		assertEquals(20, d20.getSides());
		Dice d12 = new Dice(12);
		assertEquals(12, d12.getSides());
		Dice d10 = new Dice(10);
		assertEquals(10, d10.getSides());
		Dice d8 = new Dice(8);
		assertEquals(8, d8.getSides());
		Dice d6 = new Dice(6);
		assertEquals(6, d6.getSides());
		Dice d4 = new Dice(4);
		assertEquals(4, d4.getSides());
		
		//bad dice
		try {
			Dice d13 = new Dice(13);
			fail();
		} catch(IllegalArgumentException e) {
			//skip
		}
	}

	/**
	 * Test method for {@link virtualtabletop.dice.Dice#getSides()}.
	 */
	@Test
	public void testGetSides() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link virtualtabletop.dice.Dice#setSides(int)}.
	 */
	@Test
	public void testSetSides() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link virtualtabletop.dice.Dice#roll(int)}.
	 */
	@Test
	public void testRoll() {
		Dice test = new Dice(20);
		Dice test2 = new Dice(10);
	}

}
