package TreeSet;

import java.util.Scanner;
import java.util.TreeSet;

public class Removing_Duplicate_Elements_from_an_Array_Using_TreeSet {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read the number of elements (n)
        System.out.println("Enter the Size: ");
        int n = sc.nextInt();

        // Create a TreeSet to store unique elements
        TreeSet<Integer> set = new TreeSet<>();

        // Read and add n integers to the TreeSet
        System.out.println("Enter the Elements: ");
        for (int i = 0; i < n; i++) {
            set.add(sc.nextInt());
        }

        // Print the unique elements in ascending order
        if (!set.isEmpty()) {
            for (int num : set) {
                System.out.print(num + " ");
            }
        }
        //If no elements, print "NO ELEMENTS"
        else {
            System.out.print("NO ELEMENTS");
        }

        sc.close();
    }

}
