package Question2;

import java.util.*;

public class main2 {

	public static void main(String[] args) {
		
		HashMap<String, String> hm = new HashMap<>();

		String key1 = new String("Key1");
		String key2 = new String("Key2");

		hm.put(key1, "value1");
		hm.put(key2, "value2");

		System.out.println(hm);

		key1 = null;

		System.gc();

		System.out.println(hm);

	}

}
