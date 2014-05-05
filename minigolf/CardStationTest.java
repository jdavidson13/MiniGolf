package minigolf;
import static org.junit.Assert.*;

import java.io.Console;
import java.util.ArrayList;


/**
 * @author Josh Duong
 * @author Jon Davidson
 * @author Shaz Hosein
 * @author John McLain
 */

import org.junit.BeforeClass;
import org.junit.Test;

public class CardStationTest {

	static CardStation s;

	private static int minStationID;
	private static int maxStationID;
	
	private static int minStationPosition;
	private static int maxStationPosition;
	
	private static int minKeyPress;
	private static int maxKeyPress;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {

		s = new CardStation(0, 0);
		
		minStationID = 0;
		maxStationID = 99;
		
		minStationPosition = 0;
		maxStationPosition = 99;
		
		minKeyPress = 0;
		maxKeyPress = 9;
	}

	@Test /* Test to check for user input at card station. */
		public void testUserInputNotNull() {
			System.out.println("\ntestUserInputIsNotNull:");
			assertNotNull(s.getKeyPress());
			System.out.println("\t" + this + " = passed\n");
	}
	
	@Test /* Test to see if card swipe is valid. */
		public void testSwipeIsValid() {
			System.out.println("\ntestSwipeIsValid:");
			assertTrue(s.getKeyPress() >= minKeyPress);
			assertTrue(s.getKeyPress() <= maxKeyPress);
			System.out.println("\t" + this + " = passed\n");
	}
	
	@Test /* Test to see if Station Position is null. */
		public void teststationPositionIsNotNull() {
			System.out.println("\nteststationPositionIsNotNull:");
			assertNotNull(s.getStationPosition());
			System.out.println("\t" + s.getStationPosition() + " = passed\n");
	}
	
	@Test /* Test to see if Station Position is valid. */
		public void teststationPositionIsNull() {
			System.out.println("\nteststationPositionIsValid:");
			assertTrue(s.getStationPosition() <= maxStationPosition 
					&& s.getStationPosition() >= minStationPosition);
			System.out.println("\t" + s.getStationPosition() + " = failed\n");
	
	}
	
	@Test /* Test to see if Station ID valid. */
		public void testStationIDIsNotNull() {
			System.out.println("\nteststationIDIsNotNull:");
			assertTrue(s.getStationID() <= maxStationID
					&& s.getStationID() >= minStationID);
			System.out.println("\t" + s.getStationID() + " = passed");
		
	 }
}
