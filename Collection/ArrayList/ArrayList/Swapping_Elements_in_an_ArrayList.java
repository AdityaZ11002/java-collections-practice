package ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Swapping_Elements_in_an_ArrayList {

	public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Read the number of colors
        System.out.println();
        int n = sc.nextInt();

        // Create an ArrayList to store color names
        ArrayList<String> colors = new ArrayList<>();

        // Read and add n color names to the ArrayList
        for (int i = 0; i < n; i++) {
            colors.add(sc.next());
        }

        // Print the list before swapping
        System.out.println("Array list before Swap:");
        for (String color : colors) {
            System.out.println(color);
        }

        // Swap the first and third elements if possible
        if (colors.size() >= 3) {
            Collections.swap(colors, 0, 2);
        }

        // Print the list after swapping
        System.out.println("Array list after Swap:");
        for (String color : colors) {
            System.out.println(color);
        }

        sc.close();
    }


}
