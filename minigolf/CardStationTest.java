package minigolf;
import java.io.Console;
import java.util.ArrayList;


/**
 * @author Josh Duong
 * @author Jon Davidson
 * @author Shaz Hosein
 * @author John McLain
 */


import org.junit.Test;


public class CardStationTest 

	static CardStationTest;

	private int stationID;
	private int stationPosition;

        @BeforeClass
	public static void setUpBeforeClass() throws Exception {



}

@Test /* Test to check for user input at card station. */
	public void testUserInputNotNull() {


		System.out.println("\ntestUserInputIsNotNull:");
		assertNotNull(user);
		System.out.println("\t" + user + " = passed\n");
	}


@Test /* Test to see if card swipe is valid. */
	public void testSwipeNotNull() {
		System.out.println("\ntestSwipeIsValid:");
		assertTrue(player instanceof Player);
		System.out.println("\t" + swipe + " = passed\n");
	}

@Test /* Test to see if Station ID is null. */
	public void testStationIDIsNotNull() {
		System.out.println("\ntestStationIDIsNotNull:");
		assertNotNull(card.getStationID());
		System.out.println("\t" + card.getStationID() + " = passed\n");
	}

@Test /* Test to see if Station Position is null. */
	public void teststationPositionIsNotNull() {
		System.out.println("\nteststationPositionIsNotNull:");
		assertNotNull(station.getstationPosition());
		System.out.println("\t" + station.getPosition() + " = passed\n");
	

	}

@Test /* Test to see if Station Position is valid. */
	public void teststationPositionIsNull() {
		System.out.println("\nteststationPositionIsNotNull:");
		assertNotNull(station.getstationPosition());
		System.out.println("\t" + station.getPosition() + " = failed\n");

          }

@Test /* Test to see if Station ID valid. */
	public void testStationIDIsNotNull() {
		System.out.println("\nteststationIDIsNotNull:");
		assertNotNull(station.getstationID());
		System.out.println("\t" + station.getPosition() + " = failed\n");
	
	 }
}
	
