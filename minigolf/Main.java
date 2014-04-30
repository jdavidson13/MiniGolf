package minigolf;
import java.util.ArrayList;

/**
 * @author Josh Duong
 * @author Jon Davidson
 * @author Shaz Hoesein
 * @author John McLain
 */

public class Main {

	public static void main(String[] args) {
		
	}
	
	/* Creates a new round for a given course and list of players. */	
	public Round newRound(ArrayList<Player> players, Course course) {		
		Round r = new Round(players, course);
		return r;
	}
}
