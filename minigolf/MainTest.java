package minigolftest;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class MainTest {
	
	String pName = "jjjh";
	String legalCourseName = "Some Course";
	String name = "";
	int legalCourseID = 1;
    int legalNumberOfHoles = 18;
    int[] coursePar = {};
    int holesPlay = 10;
    
    Player playInfo = new Player(holesPlay, pName);
    
    Course legalCourse = new Course( legalCourseID, legalCourseName, 
                                     legalNumberOfHoles, coursePar );
    
    Main mainTest = Main(name, legalCourse, holesPlay);
    
    private Main Main(String name2, Course legalCourse2, int holesPlay2) {
		// TODO Auto-generated method stub
		return null;
	}
    
    @Test
    public void testPlayerName() {
    	String name = playInfo.getPlayerName();
    	assertNotNull(name);
    	equals(playInfo.getPlayerName() != "");
    	assertNull(name);
    }
    
	@Test
	public void testMainObject() {
		equals(Main.round(null, null, null) == mainTest);
		equals(Main.refOBJ != mainTest);
		assertNotNull(Main.refOBJ);
		assertNull(Main.refOBJ);
	}
	
	@Test
	public void testPlayer() {
		int strokes = playInfo.getHolesPlayed();
		int golfCourse = legalCourse.getNumberOfHoles();
		equals(strokes > 0);
		equals(strokes <= golfCourse);
		assertEquals(golfCourse, strokes);
	}

}
