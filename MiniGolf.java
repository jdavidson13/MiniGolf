import static org.junit.Assert.*;
import java.util.Scanner;
import org.junit.Before;
import org.junit.Test;

/**
 * @author Josh Duong
 * @author Jon Davidson
 * @author Shaz Hoesein
 * @author John McLain
 */

public class MiniGolfTest {

	// list of global variables
	int gameID;
	int maxGameID;
	int minGameID;
	// ...
	// ...
	
	@Before
	/* Initializes global test variables. */
	public void setUp() {
		gameID = 5648842;
		maxGameID = 999999;
		minGameID = 1;
	}

	@Test
	public void testGameIDExceedsMaximumValue() {	
		assertTrue(gameID < maxGameID);
	}

	@Test
	public void testGameIDExceedsMinimumValue() {
		assertTrue(gameID > minGameID);
	}
	
	@Test
	public void testGameIDIsNotNull() {
		assertNotNull(gameID);
	}
	
	
}
