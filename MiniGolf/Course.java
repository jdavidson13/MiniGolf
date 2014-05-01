package MiniGolf;

/**
 * @author Josh Duong
 * @author Jon Davidson
 * @author Shaz Hosein
 * @author John McLain
 */

public class Course {
	
	private int courseID;
	private String courseName;
	private int numberOfHoles;
	private int[] coursePar;
	
	/* Basic constructor method for new Course objects. */
	public Course(int id, String name, int holes, int[] par) {
		courseID = id;
		courseName = name;
		numberOfHoles = holes;
		par = coursePar;
	}
	
	/* Get and return the course's ID. */
	public int getCourseID() {
		return courseID;
	}
	
	/* Get and return the course's name. */
	public String getCourseName() {
		return courseName;
	}
	
	/* Get and return the number of holes in the course. */
	public int getNumberOfHoles() {
		return numberOfHoles;
	}
	
	/* Get and return the par for a given hole number. */
	public int getCoursePar(int hole) {
		return coursePar[hole];
	}
	
}
