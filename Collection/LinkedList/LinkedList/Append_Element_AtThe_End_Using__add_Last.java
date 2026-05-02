package LinkedList;
import java.util.LinkedList;
import java.util.Scanner;


public class Append_Element_AtThe_End_Using__add_Last {
    public static void main(String[] args) {

        // TODO: Initialize the Scanner and LinkedList
        Scanner sc = new Scanner(System.in);
        LinkedList<String> ll = new LinkedList<>();

        // TODO: Read the number of customers (n)
        System.out.println("Enter the Size of LinkedList: ");
        int n = sc.nextInt();
        sc.nextLine(); // consume newline

        // TODO: Read n customer names and add them to the LinkedList using addLast()
        System.out.println("Enter the Element: ");
        for (int i = 0; i < n; i++) {
            String element = sc.nextLine();
            ll.addLast(element);
        }

        // TODO: Print the size of the LinkedList
        System.out.println("Queue Size: " + ll.size());

        // TODO: Print all customer names in the LinkedList
        System.out.println("Customers:");
        for (String x : ll) {
            System.out.println(x);
        }

        sc.close();
    }

}
