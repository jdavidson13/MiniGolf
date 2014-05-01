package MiniGolf;
import java.util.ArrayList;

/**
 * @author Josh Duong
 * @author Jon Davidson
 * @author Shaz Hosein
 * @author John McLain
 */

public class Main {
	public static Main refRound;
	public Main(Player getPlayerName, Course course, Player getPLayerStrokes) {
		// TODO Auto-generated constructor stub
	}

	public Main() {
		// TODO Auto-generated constructor stub
	}

	public Main(Main round) {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		
	}
	
	/* Creates a new round for a given course and list of players. */	
	public Round newRound(ArrayList<Player> players, Course course) {		
		Round r = new Round(players, course);
		return r;
	}
	
	public static Player getPlayerName(Player playerName) {
		Player name = new Player(playerName);
		return name;
	}
	
	public static Course getCourse(Course course) {
		return course;
	}
	
	public static Player getHolesPlayed(Player holesPlayed) {
		return holesPlayed;
	}
	public static Main round() {
		Main round = new Main ();
		round.getPlayerName(null);
		round.getCourse(null);
		round.getHolesPlayed(null);
		refRound = round;
		return refRound;
	}
}
