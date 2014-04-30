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
	// ...
	// ...
	// ...
	
	@Before
	/* Initializes global test variables. */
	public void setUp() {
		
	}

	@Test
	/* Test to see if gameID contains an illegal value which is either
	 * outside the acceptable range of values or contains illegal characters. */
	public void testGameIDContainsIllegalValue() {
		int gameID = 665423;
		assertNotNull(gameID);	
		
		int maxGameID = 99999;
		int minGameID = 1;

		if (gameID > maxGameID) {
			fail(String.format("Value of gameID (%d) exceeds maximum value (%d).",
					gameID, maxGameID));
		}
		
		if (gameID < minGameID) { 
			fail(String.format("Value of gameID (%d) exceeds minimum value (%d).",
					gameID, minGameID));
		}

		else {
			fail(String.format("gameID (%d) contains illegal value", gameID));
		}
	}

}
