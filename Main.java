package minigolf;
import java.util.List;

import minigolf.*;

/**
 * @author Josh Duong
 * @author Jon Davidson
 * @author Shaz Hoesein
 * @author John McLain
 */

public class Main {

	public static void main(String[] args) {
		
	}
		
	/* Creates a new round for a given course and player. */
	public static Round newRound(Player p, Course c) {
		
		Round r = new Round(0,c.getName(),p.playerID);
		return r;
	}

	/* Returns an array of round objects from storage.
	 * Not implemented: will throw a null pointer exception. */
	public static List<Round> getRound(Player p, Course c) {
		List<Round> test = null;
		test.add(null);
		
		return test;
	}
	
}
