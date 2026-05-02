package c1_LinkedList;

import java.util.LinkedList;
import java.util.Scanner;

public class Insert_Element_atThe_Front_Using__add_First {
    public static void main(String[] args) {

        // TODO: Initialize the Scanner and LinkedList
        Scanner sc = new Scanner(System.in);
        LinkedList<String> tasks = new LinkedList<>();

        // TODO: Read the number of tasks (n)
        int n = sc.nextInt();
        sc.nextLine(); // consume newline

        // TODO: Read n tasks and add them to the LinkedList using addFirst()
        for (int i = 0; i < n; i++) {
            String task = sc.nextLine();
            tasks.addFirst(task);
        }

        // TODO: Print the size of the LinkedList
        System.out.println("Number of tasks: " + tasks.size());

        // TODO: Print all tasks in the LinkedList
        System.out.println("Tasks:");
        for (String task : tasks) {
            System.out.println(task);
        }

        sc.close();
    }

}
