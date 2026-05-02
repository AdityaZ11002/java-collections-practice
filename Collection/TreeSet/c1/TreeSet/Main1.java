package c1.TreeSet;

import java.util.Collection;
import java.util.Collections;
import java.util.TreeSet;

public class Main1 {

	public static void main(String[] args) {
		TreeSet ts = new TreeSet(Collections.reverseOrder());
		
		ts.add(100);
		ts.add(25);
		ts.add(75);
		ts.add(50);
		ts.add(150);
		ts.add(125);
		ts.add(175);
		
		System.out.println(ts);

	}

}
