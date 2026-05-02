package ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class Merging_two_List_With_ArrayList {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read the size of the first list
        System.out.print("Enter the size of the first list: ");
        int n1 = sc.nextInt();

        ArrayList<String> firstList = new ArrayList<>();

        // Read elements of the first list
        System.out.println("Enter the strings for the first list:");
        for (int i = 0; i < n1; i++) {
            firstList.add(sc.next());
        }

        // Read the size of the second list
        System.out.print("Enter the size of the second list: ");
        int n2 = sc.nextInt();

        ArrayList<String> secondList = new ArrayList<>();

        // Read elements of the second list
        System.out.println("Enter the strings for the second list:");
        for (int i = 0; i < n2; i++) {
            secondList.add(sc.next());
        }

        // Merge both lists
        ArrayList<String> mergedList = new ArrayList<>();
        mergedList.addAll(firstList);
        mergedList.addAll(secondList);

        // Print all lists
        System.out.print("First list: ");
        for (String item : firstList) {
            System.out.print(item + " ");
        }
        System.out.println();

        System.out.print("Second list: ");
        for (String item : secondList) {
            System.out.print(item + " ");
        }
        System.out.println();

        System.out.print("Merged list: ");
        for (String item : mergedList) {
            System.out.print(item + " ");
        }

        sc.close();
    }

}
