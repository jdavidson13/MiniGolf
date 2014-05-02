package minigolf;
import java.util.ArrayList;

/**
 * @author Josh Duong
 * @author Jon Davidson
 * @author Shaz Hosein
 * @author John McLain
 */

public class Main {

	public static Main refOBJ;
	
	public Player(String name) {
		// TODO Auto-generated constructor stub
	}
	
	public Main(Player playerName, Course course, Player holesPlayed) {
		// TODO Auto-generated constructor stub
	}
	
	public static void main(String[] args) {
		
	}
	
	/* Creates a new round for a given course and list of players. */	
	public Round newRound(ArrayList<Player> players, Course course) {		
		Round r = new Round(players, course);
		return r;
	}
	public static Main round(Player playerName, Course course, Player holesPlayed) {
		Main obj = new Main(playerName, course, holesPlayed);
		refOBJ = obj;
		return refOBJ;
	}
}
