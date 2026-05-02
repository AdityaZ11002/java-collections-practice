package Queue;
import java.util.ArrayDeque;
import java.util.Scanner;

public class Reverse_String_Using_ArrayDeque {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Eneter the size of String: ");
		String s = scan.next();
		
		ArrayDeque<Character> ad = new ArrayDeque<>();
		
		for(char ch:s.toCharArray()) {
			ad.addLast(ch);
		}
		
		StringBuilder reverse = new StringBuilder();
		while(!ad.isEmpty()) {
			reverse.append(ad.removeLast()); // Append = Add at the end (not replace)
		}
		
		System.out.println(reverse.toString());
	}
}
