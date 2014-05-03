package minigolftest;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class MainTest {

	static int numOfPlayers = 1;
	static int legalCourseID = 1;
    String legalCourseName = "SomeCourse";
    int legalNumberOfHoles = 3;
    int[] coursePar = {3, 2 , 1};
	int [] strokes = {1, 2 , 3};
	static int scoreCard = 0;
	Player swings = new Player(legalCourseID, legalCourseName, strokes);
    Main newRound = new Main (numOfPlayers);
	Course course = new Course(legalCourseID, 
    							legalCourseName, 
    							legalNumberOfHoles, 
    							coursePar);
    
	@Test
	public void newRoundTest() {
		int players = newRound.getPlayer();
		assertNotNull(players);
		assertNotNull(scoreCard);
		assertNotNull(swings.getPlayerStrokes(0));
		if(players != 0 ) {
			System.out.println("New Test Round");
			scoreCard -= 0;	
		}else if(swings.getPlayerStrokes(0) == course.getCoursePar(0)){
			scoreCard = scoreCard + 1;
		}else if(swings.getPlayerStrokes(0) > course.getCoursePar(0)) {
			scoreCard = scoreCard + (course.getCoursePar(0) - swings.getPlayerStrokes(0));
		}else if (swings.getPlayerStrokes(0) < course.getCoursePar(0)) {
			
		}
	}
	
	@AfterClass
	public static void reset() throws Exception {
		numOfPlayers = 0;
		scoreCard = 0;
		legalCourseID = 1;
		
	}
}


