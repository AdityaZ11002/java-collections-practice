package TreeSet;

import java.util.Scanner;
import java.util.TreeSet;

public class Implementation_of_TreeSet {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the Size: ");
		int n = scan.nextInt();
		scan.nextLine(); // consume the newline
		
		// Create the TreeSet to Store the tech stack
		TreeSet<String> ts = new TreeSet<>();
		
		// Precess Each Operation 
		for(int i=0;i<=n-1;i++) {
			String input = scan.nextLine();
			String parts[] = input.split(" ");
			
			String command = parts[0];
			
			switch (command) {
            case "ADD":
                ts.add(parts[1]);
                break;

            case "REMOVE":
            	ts.remove(parts[1]);
                break;

            case "CHECK":
                if (ts.contains(parts[1])) {
                    System.out.println("YES");
                } else {
                    System.out.println("NO");
                }
                break;

            case "FIRST":
                if (ts.isEmpty()) {
                    System.out.println("NO LANGUAGES");
                } else {
                    System.out.println(ts.first());
                }
                break;

            case "LAST":
                if (ts.isEmpty()) {
                    System.out.println("NO LANGUAGES");
                } else {
                    System.out.println(ts.last());
                }
                break;

            case "PRINT":
                if (ts.isEmpty()) {
                    System.out.println("NO LANGUAGES");
                } else {
                    for (String lang : ts) {
                        System.out.print(lang + " ");
                    }
                    System.out.println();
                }
                
                
                break;
            }	
		}
	}
}
