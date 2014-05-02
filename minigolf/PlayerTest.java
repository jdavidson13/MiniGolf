package minigolf;

import static org.junit.Assert.*;

/**
 * @author Josh Duong
 * @author Jon Davidson
 * @author Shaz Hosein
 * @author John McLain
 */

import org.junit.BeforeClass;
import org.junit.Test;

public class PlayerTest {

	static Player player;
	
	static int minValidID;
	static int maxValidID;
	
	static int[] validStrokes;
	static int minValidStrokes;
	static int maxValidStrokes;
	
	static int validHolesPlayed;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		
		player = new Player(102415, "John Doe");
		
		minValidID = 0;
		maxValidID = 999999;
		
		int[] validStrokes = {3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3};
		minValidStrokes = 0;
		maxValidStrokes = 9;
		
		validHolesPlayed = 9;

	}

	@Test /* Test to see if Player object is null. */
	public void testPlayerIsNotNull() {
		
		System.out.println("\ntestPlayerIsNotNull:");
		assertNotNull(player);
		System.out.println("\t" + player + " = passed\n");
	}
	
	@Test /* Test to see if Player ID is the correct type. */
	public void testPlayerIsCorrectType() {
		System.out.println("\ntestPlayerIsCorrectType:");
		assertTrue(player instanceof Player);
		System.out.println("\t" + player + " = passed\n");
	}
	
	@Test /* Test to see if Player ID is null. */
	public void testPlayerIDIsNotNull() {
		System.out.println("\ntestPlayerIDIsNotNull:");
		assertNotNull(player.getPlayerID());
		System.out.println("\t" + player.getPlayerID() + " = passed\n");
	}
	
	@Test /* Test to see if Player ID is valid. */
	public void testPlayerIDIsValid() {
		System.out.println("\ntestPlayerIDIsValid:");
		assertTrue(player.getPlayerID() > minValidID && 
				player.getPlayerID() < maxValidID);
		System.out.println("\t" + player.getPlayerID() + " = passed\n");
	}
	
	@Test /* Test to see if the elements of the Player object's Strokes
	 	   * array are not null. */
	public void testPlayerStrokesAreNotNull() {
		System.out.println("\ntestPlayerStrokesAreNotNull:");
		for (int n : player.getPlayerStrokes()) {
			assertNotNull(n);
			System.out.println("\t" + player.getPlayerStrokes() + " = passed\n");
		}
	}

	@Test /* Test to see if the elements of the Player object's Strokes
	 	   * array are the correct type. */
	public void testPlayerStrokesAreCorrectTypes() {
		System.out.println("\ntestPlayerStrokesAreNotNull:");
		assertTrue(player.getPlayerStrokes()instanceof int[]);
		System.out.println("\t" + player.getPlayerStrokes() + " = passed\n");
		
		for (int n : player.getPlayerStrokes()) {
			assertTrue(n instanceof Integer);
			System.out.println("\t" + player.getPlayerStrokes() + " = passed\n");
		}
	}

	@Test /* Test to see if the elements of the Player object's Strokes
	       * array are in bounds. */
	public void testPlayerStrokesAreInBounds() {
		System.out.println("\ntestPlayerStrokesAreInBounds:");
		assertTrue(player.getPlayerStrokes().length <= validStrokes.length);
		System.out.println("\t" + player.getPlayerStrokes() + " = passed\n");
		
		for (int n : player.getPlayerStrokes()) {
			assertTrue(n < maxValidStrokes && n > minValidStrokes);
			System.out.println("\t" + n + " = passed\n");
		}
	}
	
	@Test /* Test to see if the Player's number of holes played is null. */
	public void testPlayerHolesPlayerIsNotNull() {
		System.out.println("\ntestPlayerHolesPlayerIsNotNull:");
		assertNotNull(player.getHolesPlayed());
		System.out.println("\t" + player.getHolesPlayed() + " = passed\n");
	}

	@Test /* Test to see if the Player's number of holes played is null. */
	public void testPlayerHolesPlayerIsValidl() {
		System.out.println("\ntestPlayerHolesPlayerIsValidl:");
		assertTrue(player.getHolesPlayed() > 0 &&
				player.getHolesPlayed() <= validHolesPlayed);
		System.out.println("\t" + player.getHolesPlayed() + " = passed\n");
	}

}
