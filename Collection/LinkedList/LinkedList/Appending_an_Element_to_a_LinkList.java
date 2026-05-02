package LinkedList;

import java.util.LinkedList;
import java.util.Scanner;

public class Appending_an_Element_to_a_LinkList {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read the number of elements (n)
        System.out.println("Enter the size of the LinkedList:");
        int n = sc.nextInt();

        // Create a LinkedList to store integers
        LinkedList<Integer> list = new LinkedList<>();

        // Read and add n integers to the LinkedList
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            list.add(sc.nextInt());
        }

        // Read the element to append
        System.out.println("Enter the element to append:");
        int element = sc.nextInt();

        // Append the element to the end of the LinkedList
        list.addLast(element);  

        // TODO: Print the updated LinkedList
        System.out.println("Updated LinkedList:");
        for (int num : list) {
            System.out.print(num + " ");
        }

        sc.close();
    }

}
