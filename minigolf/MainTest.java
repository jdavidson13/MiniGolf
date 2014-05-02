package minigolftest;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class MainTest {
	
	String name = "";
	
	int legalCourseID = 1;
    String legalCourseName = "Some Course";
    int legalNumberOfHoles = 10;
    int[] coursePar = {};
    
    Course legalCourse = new Course( legalCourseID, legalCourseName, 
                                     legalNumberOfHoles, coursePar );
	
    int holesPlay = 10;
    
    Main mainTest = Main(name, legalCourse, holesPlay);
    
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	private Main Main(String name2, Course legalCourse2, int holesPlayed2) {
		// TODO Auto-generated method stub
		return null;
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		equals(Main.round(null, null, null) == mainTest);
		equals(Main.refOBJ != mainTest);
		assertNotNull(Main.refOBJ);
	}

}
