package minigolf;

/**
 * @author Josh Duong
 * @author Jon Davidson
 * @author Shaz Hoesein
 * @author John McLain
 */

public class Round {
	
	int roundID;
	int playerID;
	String selectedCourse;
	int[] score;
	
	/* Basic constructor for new Round objects. */
	public Round(int roundid, String course, int playerid) {
		roundID = roundid;
		selectedCourse = course;
		playerID = playerid;
	}

	/* Returns the score for the current round. */
	public int currentScore() {
		int i = 0;
		return score[i];
	}
	
	/* Returns the number of holes the player has currently played. */
	public int numberOfHolesPlayed() {
		return 0;
	}
	
	/* Accepts a keyed value from a Card Station and sets the current score. */
	public void enterScore(CardStation c) {
		score[numberOfHolesPlayed()] = c.getKeyPress();
	}
}
