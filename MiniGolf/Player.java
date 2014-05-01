package MiniGolf;

/**
 * @author Josh Duong
 * @author Jon Davidson
 * @author Shaz Hosein
 * @author John McLain
 */

public class Player {
	
	private int playerID;
	private static String playerName;
	private static int[] playerStrokes;
	private static int holesPlayed;

	/* Basic constructor method for new Player objects. */
	public Player(int id, String name) {
		playerID = id;
		playerName = name;
	}
	
	public Player(Player playerName2) {
		// TODO Auto-generated constructor stub
	}

	/* Get and return the player's ID number. */
	public int getPlayerID() {
		return playerID;
	}
	
	/* Get and return the player's name. */
	public static String getPlayerName() {
		return playerName;
	}
	
	/* Get and return the player's strokes for a given hole. */
	public int[] getPlayerStrokes() {
		return playerStrokes;
	}
	
	/* Get and return the number of holes the player has played. */
	public static int getHolesPlayed() {
		return holesPlayed;
	}
	
	/* Updates the player's stroke array with the input from keypad terminal. */
	public void updateScore(CardStation c) {
		playerStrokes[holesPlayed - 1] = c.getKeyPress();
		holesPlayed++;
	}
	
}