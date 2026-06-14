package Day_9;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Driver1 {

	public static void main(String[] args) {

		Map<String, String> map = new HashMap<String, String>();

		map.put("Apple", "iphone 16");
		map.put("Samsung", "S28");
		map.put("Realme", "narzo");
		map.put("Nokia", "e32");

		Set<Entry<String, String>> entrySet = map.entrySet();

		Iterator<Entry<String, String>> iterator = entrySet.iterator();

		while (iterator.hasNext()) {
			Entry<String, String> entry = iterator.next();

			if (entry.getKey().startsWith("S")) {
				System.out.println(entry.getKey() + " " + entry.getValue());
			}
		}
	}
}
