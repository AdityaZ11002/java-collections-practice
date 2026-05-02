package c1.TreeSet;

import java.util.ArrayList;
import java.util.Collections;



public class Main2 {
	public static void main(String[] args) {
		
		ArrayList<Integer> al = new ArrayList();
		
		al.add(20);
		al.add(45);
		al.add(99);
		al.add(10);
		al.add(12);
		
		System.out.println(al);
		
		Collections.sort(al);  // this collections.sort method is only work with LIST BASED CLASS
		System.out.println(al);

	}

}
