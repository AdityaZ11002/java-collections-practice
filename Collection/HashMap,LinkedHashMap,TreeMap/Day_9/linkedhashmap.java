package Day_9;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class linkedhashmap {

	public static void main(String[] args) {

		Set<String> set = new HashSet<String>();
		set.add("apple");
		set.add("Samsung");

//		System.out.println(set);
//
//		 Iterator<String> itr = set.iterator();
//
//		while (itr.hasNext())
//		{
//		    String element = (String) itr.next();
//		    System.out.println("elements are " + element);
//		}

		Map<String, String> stateAndCity = new LinkedHashMap<String, String>();

		stateAndCity.put("Karnataka", "Bangalore");
		stateAndCity.put("Maharashtra", "Mumbai");
		stateAndCity.put("Tamilnadu", "Chennai");
		stateAndCity.put("Telengana", "Hyderabad"); // 5th bucket --> 0(1) --> "Telengana".hash() & 15 --> 5th index
		stateAndCity.put("Gujrat", "Ahmedabad");
		stateAndCity.put("Gujrat", "Ahmedabad"); // No Duplicate Keys
		stateAndCity.put(null, "Bangalore");

//		System.out.println(stateAndCity.get("Telengana")); // o(1)

		// How does hashmap work internally or how put method works // how does get
		// works

//		System.out.println(stateAndCity);

		// Convert the map to set of entries
		Set<Entry<String, String>> entrySet = stateAndCity.entrySet();

		// convert the entry set to iterator
		Iterator<Entry<String, String>> itr1 = entrySet.iterator();

		// iterate it
		while (itr1.hasNext()) {
			Entry<String, String> entry = itr1.next();
			System.out.println(entry.getKey() + " and " + entry.getValue());
		}

	}

}
