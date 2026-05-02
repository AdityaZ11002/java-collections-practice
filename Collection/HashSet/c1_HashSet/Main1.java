package c1_HashSet;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class Main1 {

	public static void main(String[] args) {
		
		HashSet<Integer> hs = new HashSet();
		
		hs.add(100);
		hs.add(50);
		hs.add(150);
		hs.add(25);
		hs.add(75);
		hs.add(125);
		hs.add(175);
		
		System.out.println(hs); // [50, 100, 150, 25, 75, 125, 175]
		
		
		
		// LinkHashSet Provide uniqueness and maintains the order in which elements are added.
		LinkedHashSet ls = new LinkedHashSet(); // if we mentain the insertion order then we go with LinkedHashSet Order.
		
		ls.add(100);
		ls.add(50);
		ls.add(150);
		ls.add(25);
		ls.add(75);
		ls.add(125);
		ls.add(175);
		System.out.println(ls); // [100, 50, 150, 25, 75, 125, 175]

		System.out.println(ls.add(200)); // true
		
		ls.add(300);
		System.out.println(ls); // [100, 50, 150, 25, 75, 125, 175, 200, 300]
		
		ls.add(300);
		System.out.println(ls); // [100, 50, 150, 25, 75, 125, 175, 200, 300] //duplicate element not allows
		
		
		

	}

}
