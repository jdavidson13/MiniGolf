package minigolf;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.BeforeClass;
import org.junit.Test;

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
		
		/* Declare Round test/'good' parameters */
		round = new Round(players, course);
		testRound = new Round(testPlayers, testCourse);
		
		testMaxPlayers = 4;
	}

	@Test /* Test to see if the Round's ArrayList of Players or any of its
	 	   * individual Player elements are null. */
	public void testArrayPlayersIsNotNull() {
		
		assertNotNull(round.getPlayers());
		
		for (Player p : round.getPlayers()) {
			assertNotNull(p);
		}
	}
	
	@Test /* Test to see if the Round's ArrayList of Players or any of its 
	 	   * individual Player elements return the wrong object type. */
	public void testArrayPlayersIsCorrectType() {
		
		ArrayList<Player> x = new ArrayList<Player>();
		assertTrue(round.getPlayers().getClass() == x.getClass());
		
		for (Player h : round.getPlayers()) {
			assertTrue(h instanceof Player);
		}
	}
	
	@Test /* Test to see if the Round's ArrayList of Players or any of its 
	       * individual Player elements contain an invalid entry. */
	public void testArrayPlayersIsValid() {
		
	}
	
	@Test /* Test to see if the Round's ArrayList of Players exceeds its
	       * defined boundaries.  */
	public void testArrayPlayersIsWithinBoundaries() {
		assertTrue(round.getPlayers().size() <= testMaxPlayers - 1);
}

	@Test // Test to see if the course object is null
	public void testCourseIsNotNull() {
		
		assertNotNull(round.getCourse());
	}
	
	@Test // Test to see if the course object is correct
	public void testCourseIsValid() {
		assertTrue(round.getCourse() == testRound.getCourse());
	}
	
	@Test
	public void testCurrentScoreIsNotNull() {
		
		//assertNotNull(r.getCurrentScore(p, c));
	}
	
	@Test
	public void testCurrentScoreIsValid() {
		
		//r.getCurrentScore(p, c);
	}
}
