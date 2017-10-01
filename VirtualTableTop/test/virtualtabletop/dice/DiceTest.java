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
	}

	/**
	 * Test method for {@link virtualtabletop.dice.Dice#setSides(int)}.
	 */
	@Test
	public void testSetSides() {
		Dice d20 = new Dice(20);
		d20.setSides(12);
		assertEquals(12, d20.getSides());
		Dice d12 = new Dice(12);
		d12.setSides(20);
		assertEquals(20, d12.getSides());
		Dice d10 = new Dice(10);
		d10.setSides(8);
		assertEquals(8, d10.getSides());
		Dice d8 = new Dice(8);
		d8.setSides(10);
		assertEquals(10, d8.getSides());
		Dice d6 = new Dice(6);
		d6.setSides(4);
		assertEquals(4, d6.getSides());
		Dice d4 = new Dice(4);
		d4.setSides(6);
		assertEquals(6, d4.getSides());
		
		try {
			d4.setSides(5);
			fail();
		} catch(IllegalArgumentException e) {
			assertEquals(6, d4.getSides());
		}
	}

	/**
	 * Test method for {@link virtualtabletop.dice.Dice#roll(int)}.
	 */
	@Test
	public void testRoll() {
		Dice test = new Dice(20);
		Dice test2 = new Dice(10);
		Dice test3 = new Dice(8);
		Dice test4 = new Dice(6);
		Dice test5 = new Dice(4);
		Dice test6 = new Dice(12);
		
		int roll5 = test5.roll();
		assertTrue(roll5 > 0 && roll5 < 5);
		int roll = test.roll();
		assertTrue(roll > 0 && roll < 21);
		int roll2 = test2.roll();
		assertTrue(roll2 > 0 && roll2 < 11);
		int roll3 = test3.roll();
		assertTrue(roll3 > 0 && roll3 < 9);
		int roll4 = test4.roll();
		assertTrue(roll4 > 0 && roll4 < 7);
		int roll6 = test6.roll();
		assertTrue(roll6 > 0 && roll6 < 13);
	}

}
