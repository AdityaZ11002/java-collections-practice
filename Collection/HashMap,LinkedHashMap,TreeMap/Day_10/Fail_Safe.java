package Day_10;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class Fail_Safe {

	public static void main(String[] args) {
		
		
		List<String> products = new CopyOnWriteArrayList<String>();
		
		products.add("Apple");
		products.add("#Samsung");
		products.add("LG");
		products.add("Nokia");
		products.add("blackberry");
		products.add("LYF");
		
		System.out.println(products);
		
		for (String e:products) {
			if(e.startsWith("#")) {
				products.remove(e);
				System.out.println(e);
			}
			
		}

	}

}

