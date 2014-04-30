package minigolf;
import java.util.ArrayList;

/**
 * @author Josh Duong
 * @author Jon Davidson
 * @author Shaz Hoesein
 * @author John McLain
 */

public class Round {
	
	private ArrayList<Player> selectedPlayers;
	private Course selectedCourse;
	
	/* Basic constructor method for new Round objects. */
	public Round(ArrayList<Player> players, Course selectedcourse){
		selectedPlayers = players;
		selectedCourse = selectedcourse;
	}
	
	/* Gets and returns an array list of players playing in the current round. */
	public ArrayList<Player> getPlayers() {
		return selectedPlayers;
	}

	/* Gets and returns the Course object registered to the current round. */
	public Course getCourse() {
		return selectedCourse;
	}
	
	/* Calculates and returns the player's score for the current hole. */
	public int getCurrentScore(Player p, Course c) {
		int strokes = p.getPlayerStrokes()[p.getHolesPlayed()];
		int par = c.getCoursePar(p.getHolesPlayed());
		return (par - strokes);
	}
}
