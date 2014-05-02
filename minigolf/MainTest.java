package minigolftest;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class MainTest {

	int numOfPlayers = 1;
	int legalCourseID = 1;
    String legalCourseName = "SomeCourse";
    int legalNumberOfHoles = 5;
    int[] coursePar = {2};
	int [] strokes = {1};
	int scoreCard = 0;
	Player swings = new Player(legalCourseID, legalCourseName, strokes);
    Main newRound = new Main (numOfPlayers);
	Course course = new Course(legalCourseID, 
    							legalCourseName, 
    							legalNumberOfHoles, 
    							coursePar);
    
	@Test
	public void testRound() {
		int num = newRound.getPlayer();
		assertNotNull(num);
		equals(num != 0);
	}
	@Test
	public void newRound() {
		int players = newRound.getPlayer();
		if(players != 0) {
			System.out.println("New Test Round");
			if(swings.getPlayerStrokes(0) < course.getCoursePar(0)) {
				System.out.println("under par");
				scoreCard -= 0;
			}
			}else if(swings.getPlayerStrokes(0) == course.getCoursePar(0)){
				scoreCard = scoreCard + 1;
			}else if(swings.getPlayerStrokes(0) > course.getCoursePar(0)) {
				scoreCard = score card + (course.getCoursePar(0) - swings.getPlayerStrokes());
			}
		}
	@AfterClass
	public void reset() {
		//reset all
		numOfPlayers = 0;
		legalCourseID = 0;
		strokes[1] = 0;
	}
	
}
