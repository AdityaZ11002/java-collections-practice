package c1.TreeSet;

import java.util.TreeSet;

public class Main3 {
	public static void main(String[] args) {
	    TreeSet<Integer> ts = new TreeSet<>();

	    ts.add(100);
	    ts.add(50);
	    ts.add(150);
	    ts.add(25);
	    ts.add(75);
	    ts.add(125);
	    ts.add(175);

	    System.out.println(ts); // [25, 50, 75, 100, 125, 150, 175]
	    
	    System.out.println(ts.headSet(75)); // [25, 50]
	    
	    System.out.println(ts.headSet(75, true)); //[25, 50, 75]
	    
	    System.out.println(ts.headSet(75, false)); //[25, 50]

	    System.out.println(ts.tailSet(100)); // [100, 125, 150, 175]
	    
	    System.out.println(ts.tailSet(100, false)); // [125, 150, 175]

	    System.out.println(ts.higher(100)); // 125
	    
	    System.out.println(ts.higher(80)); // 100

	    System.out.println(ts.ceiling(100)); // 100
	    
	    System.out.println(ts.ceiling(80)); // 100
	    
	    System.out.println(ts.lower(100)); // 75
	    
	    System.out.println(ts.lower(80)); // 75
	    
	    System.out.println(ts.floor(100)); // 100
	    
	    System.out.println(ts.floor(80)); // 75
	    
	}

}
