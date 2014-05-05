package minigolftest;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;

import sun.reflect.generics.tree.Tree;

/**
 * @author Josh Duong
 * @author Jon Davidson
 * @author Shaz Hosein
 * @author John McLain
 */

public class Main {
	public static Round refRound;	
	
	static Round newRound (ArrayList<Player> players, Course course) {
		Round r = new Round(players, course);
		
		refRound = r;
		
		Set<Course> c = null;	
		Set<Player> p = null;
		Iterator<Course> itC = c.iterator();
		while(c.contains(refRound.getPlayers())) {
			while (itC.hasNext()) {
				refRound.getCurrentScore(p, c);
			}
		}
		
		return r;
	}
	
	public static void main( String [] args) {
	}
}
