package ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class Adding_an_Element_at_the_Beginning_of_an_ArrayList {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Read the number of elements (n)
        System.out.println("Enter the size of the ArrayList:");
        int n = sc.nextInt();

        // Create an ArrayList to store integers
        ArrayList<Integer> list = new ArrayList<>();

        // Read and add n integers to the ArrayList
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            list.add(sc.nextInt());
        }

        // Read the element to insert
        System.out.println("Enter the element to insert at the beginning:");
        int element = sc.nextInt();

        // Insert the element at the first position
        list.add(0, element);

        // Print the updated ArrayList
        System.out.println("Updated ArrayList:");
        for (int num : list) {
            System.out.print(num + " ");
        }

        sc.close();
    }
}
