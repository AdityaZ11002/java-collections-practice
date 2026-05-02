package Question2;

import java.util.*;

public class main3 {

	public static void main(String[] args) {
		
		String s1 = new String("Key");
		String s2 = new String("Key");

		HashMap hm = new HashMap();

		hm.put(s1, "Value1");
		hm.put(s2, "Value2");

		System.out.println(hm);

		IdentityHashMap<String,String> ihm = new IdentityHashMap<String, String>(); // Identitiy compare based on there address

		ihm.put(s1, "val1");
		ihm.put(s2, "val2");

		System.out.println(ihm);

	}

}
