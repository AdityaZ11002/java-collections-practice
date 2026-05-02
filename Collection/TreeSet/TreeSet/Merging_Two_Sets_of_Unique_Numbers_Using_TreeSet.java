package TreeSet;

import java.util.Scanner;
import java.util.TreeSet;

public class Merging_Two_Sets_of_Unique_Numbers_Using_TreeSet {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read the number of elements in the first set (n1)
        System.out.println("Enter the Size 1st Set: ");
        int n1 = sc.nextInt();

        // Create a TreeSet to store unique elements
        TreeSet<Integer> set = new TreeSet<>();

        // Read and add n1 integers to the TreeSet
        System.out.println("Enter the 1st Set Elements: ");
        for (int i = 0; i < n1; i++) {
            set.add(sc.nextInt());
        }

        // Read the number of elements in the second set (n2)
        System.out.println("Enter the Size 2nd Set: ");
        int n2 = sc.nextInt();

        // Read and add n2 integers to the TreeSet
        System.out.println("Enter the 1st Set Elements: ");
        for (int i = 0; i < n2; i++) {
            set.add(sc.nextInt());
        }

        // Print the unique merged set in ascending order, or "NO ELEMENTS" if both sets are empty
        if (set.isEmpty()) {
            System.out.print("NO ELEMENTS");
        } else {
            for (int num : set) {
                System.out.print(num + " ");
            }
        }
        
        // OR
        
        if (!set.isEmpty()) {
            for (int num : set) {
                System.out.print(num + " ");
            }
        } else {
            System.out.print("NO ELEMENTS");
        }

        
        

        sc.close();
    }

}
