package Day__7;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class Driver1 {

	public static void main(String[] args) {
		
		LinkedHashSet<String> set = new LinkedHashSet<String>();
		
		set.add("BLR"); // add return type is boolean
		set.add("Chennai");
		set.add("Delhi");
		set.add("Ahmedabad");
		set.add("Hyderabad");
		set.add("Amritsar");
		
		System.out.println(set);
		
		// Task- Get the city name Which is Start with 'A'
		
		// How do you read / iterate the collection / set
		
		for(String element : set) {
			if (element.startsWith("A")) {
				System.out.println(element);
			}
		}
		
		// same task but by using iterator
		
		Iterator<String> itr = set.iterator();
		
		while (itr.hasNext()) { // hasNext() -> Checked if next element is there or not 
			String element = itr.next(); // next() -> Returns the next element and moves the cursor forward.
			if(element.startsWith("A")) {
				System.out.println("Cities name start with A are: " + element);
			}
		}
	}

}

