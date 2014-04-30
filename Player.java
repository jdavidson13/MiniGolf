package minigolf;

/**
 * @author Josh Duong
 * @author Jon Davidson
 * @author Shaz Hoesein
 * @author John McLain
 */

public class Player {
	
	int playerID;
	String playerName;
	int playerScore;
	int playerPar;
	
	/* Basic constructor for new Player objects. */
	public Player(int a, String b, int c, int d) {
		playerID = a;
		playerName = b;
		playerScore = c;
		playerPar = d;
	}
	
	/* Gets the player's current record of play. */
	public void getRecords (Round r) {
		r.currentScore();
	}

}
