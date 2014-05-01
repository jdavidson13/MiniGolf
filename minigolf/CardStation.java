package minigolf;
import java.io.Console;
import java.util.ArrayList;

/**
 * @author Josh Duong
 * @author Jon Davidson
 * @author Shaz Hosein
 * @author John McLain
 */

public class CardStation {

	private int stationID;
	private int stationPosition;
	
	/* Basic constructor method for new CardStation objects.*/
	public CardStation (int id, int position) {
		stationID = id;
		stationPosition = position;
	}
	
	/* Gets the user's input from the card swipe station keypad terminal
	 * and returns the input's integer value. For now, we'll emulate this
	 * functionality by just using an input scanner with prompt. */
	int getKeyPress() {
		Console c = System.console();
		String s = c.readLine("Enter input 0-9:");
		
		return Integer.valueOf(s);
	}
	
	/* Gets and returns the station ID number for the card swipe station. */
	public int getStationID() {
		return stationID;
	}
	
	/* Gets and returns the station position for the card swipe station. */
	public int stationPosition() {
		return stationPosition;
	}
	
	/* Prints the scores for the current round for a given playerID value. */
	public void printRound(Player player) {
		for (int Strokes : player.getPlayerStrokes()) {
			//Do thing
		}
	}
	
	/* Prints the final scores for all players in the list. */
	public void printCoupon(ArrayList<Player> players) {
		for (Player p : players) {
			printRound(p);
			// Do thing
		}
			
	}
	
}
