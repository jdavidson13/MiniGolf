package minigolf;

/**
 * @author Josh Duong
 * @author Jon Davidson
 * @author Shaz Hoesein
 * @author John McLain
 */

public class Course {
	
	int courseID;
	String courseName;
	int courseNumberOfHoles;
	int[] coursePar;
	
	/* Basic constructor for new Course objects. */
	public Course(int a, String b, int c, int[] d) {
		courseID = a;
		courseName = b;
		courseNumberOfHoles = c;
		coursePar = d;
	}
	
	/* Get the name of the course. */
	public String getName() {
		return courseName;
	}
	
	/* Gets the number of holes for the current course. */
	public int getNumberOfHoles() {
		return this.courseNumberOfHoles;
	}
	
	/* Determines the par value for the current hole. */
	public int getParForHole() {
		return 0;
	}
}
