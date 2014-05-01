package minigolf;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.BeforeClass;
import org.junit.Test;

/**
 * @author Josh Duong
 * @author Jon Davidson
 * @author Shaz Hosein
 * @author John McLain
 */

public class RoundTest {
	
	static Course course;
	static Course testCourse;
	static Player player;
	static Player testPlayer;
	static ArrayList<Player> players = new ArrayList<Player>();
	static ArrayList<Player> testPlayers = new ArrayList<Player>();
	static Round round;
	static Round testRound;
	static int testMaxPlayers;
	static int correctScore;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		
		/* Declare Course test/'good' parameters */
		int[] par = {};
		course = new Course(0, null, 0, par);
		int[] testPar = {3, 2, 4, 3, 3, 5, 2, 3, 4};
		testCourse = new Course(1, "Green Hills Resort", 9, testPar);
		
		/* Declare Player test/'good' parameters */
		player = new Player(1, "John Doe");
		players.add(player);
		testPlayer = new Player(1, "Jane Doe");
		testPlayers.add(testPlayer);
		players.add(testPlayer);
		
		/* Declare Round test/'good' parameters */
		round = new Round(players, course);
		testRound = new Round(testPlayers, testCourse);
		
		testMaxPlayers = 4;
		correctScore = 5;
	}

	@Test /* Test to see if the Round's ArrayList of Players or any of its
	 	   * individual Player elements are null. */
	public void testArrayPlayersIsNotNull() {
		
		System.out.println("\ntestArrayPlayersIsNotNull:");
		assertNotNull(round.getPlayers());
		System.out.println("\t " + round.getPlayers() +" = passed");
		
		for (Player p : round.getPlayers()) {
			assertNotNull(p);
		}
	}
	
	@Test /* Test to see if the Round's ArrayList of Players or any of its 
	 	   * individual Player elements return the wrong object type. */
	public void testArrayPlayersIsCorrectType() {
		
		System.out.println("\ntestArrayPlayersIsCorrectType:");
		ArrayList<Player> x = new ArrayList<Player>();
		assertTrue(round.getPlayers().getClass() == x.getClass());
		System.out.println("\t " + round.getClass() + "  = passed");
		
		for (Player h : round.getPlayers()) {
			assertTrue(h instanceof Player);
			System.out.print("\t " + h.getClass() + " = passed");
		}
	}
	
	@Test /* Test to see if the Round's ArrayList of Players or any of its 
	       * individual Player elements contain an invalid entry. */
	public void testArrayPlayersIsValid() {
		
		System.out.println("\ntestArrayPlayersisValid:");
		for (Player h : round.getPlayers()) {
			System.out.print("\t " + h + " ");
			assertTrue(h.getPlayerName().matches("[a-zA-Z ]+"));
			System.out.println(h.getPlayerName() + " = passed");
		}
	}
	
	@Test /* Test to see if the Round's ArrayList of Players exceeds its
	       * defined boundaries.  */
	public void testArrayPlayersIsWithinBoundaries() {
		
		System.out.println("\ntestArrayPlayersIsWithinBoundaries:");
		assertTrue(round.getPlayers().size() <= testMaxPlayers - 1);
		System.out.println("\t " + round.getPlayers() + "  = passed");
	}

	@Test /* Test to see if the Round's Course object is null. */
	public void testCourseIsNotNull() {
		
		System.out.println("\ntestCourseIsNotNull:");
		assertNotNull(round.getCourse());
		System.out.println("\t " + round.getCourse() + "  = passed");
	}
	
	@Test /* Test to see if Round's Course object is valid. */
	public void testCourseIsValid() {
		System.out.println("\ntestCourseIsValid:");
		assertTrue(round.getCourse() == testRound.getCourse());
		System.out.println("\t " + round.getCourse() + "  = passed");
	}
	
	@Test /* Test to see if Round's Current Score values return null. */
	public void testCurrentScoreIsNotNull() {
		
		System.out.println("\ntestCurrentScoreIsNotNull:");
		for (Player h : round.getPlayers()) {
			assertNotNull(round.getCurrentScore(h, course));
			System.out.println("\t " + h + "  = passed");
		}
	}
	
	@Test /* Test to see if Round's Current Score values are valid. */
	public void testCurrentScoreIsValid() {
		
		System.out.println("\ntestCurrentScoreIsValid:");
		for (Player h : round.getPlayers()) {
			assertTrue(round.getCurrentScore(h, course) > 0);
			System.out.println("\t " + h + "  = passed");
		}
	}
}
