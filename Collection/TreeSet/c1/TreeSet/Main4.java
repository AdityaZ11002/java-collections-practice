package c1.TreeSet;

import java.util.ArrayDeque;
import java.util.Collection;
import java.util.TreeSet;

public class Main4 {
	public static void main(String[] args) {
		
		ArrayDeque ad = new ArrayDeque();
		ad.add(20);
		ad.add(10);
		ad.add(40);
		ad.add(30);
		ad.add(50);
		System.out.println(ad);
		
		
		// Collections.sort() sorts a list in ascending order in Java.
//		Collection.sort(ad); // Error
		
		TreeSet ts = new TreeSet(ad);
		System.out.println(ts);
		
		
	}

}
