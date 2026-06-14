package Day_4;

import java.util.HashSet;
import java.util.Set;

public class Driver {

	public static void main(String[] args) {

		Set<String> cities = new HashSet<String>();

		cities.add("Bangalore");
		cities.add("Jaipur");
//		cities.add("Mysore");
		cities.add("Hyderabad");
		cities.add("Chennai");
		cities.add("chennai");

		System.out.println("Bangalore".hashCode()); // hashcode gave unquic value of the object
//		System.out.println("Mysore".hashCode());

		// Formula for finding exact position of the object or to identify the bucket
		int hash = "Mysore".hashCode();
		hash = hash ^ (hash >>> 16);
		int bucketIndex = (16 - 1) & hash;
		System.out.println("Mysore Stored at " + bucketIndex);

		System.out.println(cities);

	}

}
