package minigolftest;

import java.util.ArrayList;
import static org.junit.Assert.*;
import org.junit.*;

public class MainTest {
	
	ArrayList<Player> players;
	Course sCourse;
	Round player = new Round(players, sCourse);
	
	int playerID = 1;
	String pName = "";
	int [] swings = {1 , 2, 3};
	
	Player pInfo = new Player(playerID, pName, swings);
	
	int legalCourseID = 1;
    String legalCourseName = "";
    int legalNumberOfHoles;
    int[] coursePar = {3, 2, 1};
   
    Course c = new Course(legalCourseID, legalCourseName, legalNumberOfHoles, coursePar);
	
    @Test
	public void testNewRound () {
    	
    	int r = pInfo.getPlayerStrokes(0);
    	System.out.println(r);
		ArrayList<Player> p = player.getPlayers();
		if(p != null) {
			System.out.println("Test New Round");
			equals(p != null);
			assertEqual(c.getCoursePar(0), pInfo.getPlayerStrokes(0));
		}
		
	}

	private void assertEqual(int coursePar2, int playerStrokes) {
		// TODO Auto-generated method stub
		
	}
}
