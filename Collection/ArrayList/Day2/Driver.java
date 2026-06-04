package Day2;

import java.util.ArrayList;

public class Driver {

	public static void main(String[] args) {

		ArrayList<String> al = new ArrayList<String>(); // default capacity : 10

		al.add("BLR");
		al.add("CHE");
		al.add("HYD");
		al.add("AHM");
		al.add("DEL");
		al.add("KLR");
		al.add("MHA");

		System.out.println(al.get(4));

		al.add(2, "UP");
		System.out.println(al);

		al.remove(2);
		System.out.println(al);

	}

}
