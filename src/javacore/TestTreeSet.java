package javacore;

import java.util.Set;
import java.util.TreeSet;

/**
 * 
 * @author vandd
 *
 */
public class TestTreeSet {
	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		Set<Object> s = new TreeSet<Object>();
		s.add("d");
		s.add(new Integer(78));
	}
}
