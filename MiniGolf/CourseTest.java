package MiniGolf;

import org.junit.*;
import static org.junit.Assert.*;

/**
 * @author Josh Duong
 * @author Jon Davidson
 * @author Shaz Hoesein
 * @author John McLain
 */
public class CourseTest {
    
    int legalCourseID = 1;
    String legalCourseName = "Test Course";
    int legalNumberOfHoles = 9;
    int[] coursePar = { 3,4,3,3,5,4,4,3,5 };
    
    Course legalCourse = new Course( legalCourseID, legalCourseName, 
                                     legalNumberOfHoles, coursePar );
    
    public CourseTest() {
    }
    
    @Test
    public void testGetCourseIDMatch() {
        System.out.println("Testing getCourseID returns a match:");
        int result = legalCourse.getCourseID();
        assertNotNull( result );
        assertEquals( result, legalCourseID );
    }
    
    @Test
    public void testGetCourseIDIsPositive() {
        System.out.println("Testing getCourseID rejects negative numbers:");
        Course negativeCourse = new Course ( -1, legalCourseName,
                                             legalNumberOfHoles, coursePar );
        int result = negativeCourse.getCourseID();
        assert result > 0;
    }
    
    @Test
    public void testGetCourseNameMatch() {
        System.out.println("Testing getCourseName returns a valid name:");
        String result = legalCourse.getCourseName();
        assertNotNull( result );
    }
    
    @Test
    public void testGetCourseNameIsNull() {
        System.out.println("Testing getCourseName when fed a null:");
        Course nullCourse = new Course ( legalCourseID, null,
                                         legalNumberOfHoles, coursePar );
        String result = legalCourse.getCourseName();
        assertNotNull( result );
    }
    
    @Test
    public void testGetNumberOfHolesIsValid() {
        System.out.println("Testing getNumberOfHoles for <= 18:");
        int result = legalCourse.getNumberOfHoles();
        int expResult = 9;
        assertEquals( result, expResult );
        assert result <= 18;
    }
    
    @Test
    public void testGetNumberOfHolesIsLarge() {
        System.out.println("Testing getNumberOfHoles for > 18:");
        Course bigCourse = new Course ( legalCourseID, legalCourseName,
                                        19, coursePar);
        int result = bigCourse.getNumberOfHoles();
        int expResult = 19;
        assertEquals( result, expResult );
        assert result <= 18;
    }
    
    @Test 
    public void testGetCourseParMatchesArray() {
        System.out.println("Testing getCoursePar returns correct array element:");
        int result = legalCourse.getCoursePar(0);
        int expResult = 3;
        assertEquals( result, expResult );
    }
    
    @Test
    public void testGetCourseParCorrectNumberOfElements() {
        System.out.println("Testing if number of coursePar[] elements matches number of holes:");
        int result = coursePar.length;
        int expResult = 9;
        assertEquals( result, expResult );
    }
}
