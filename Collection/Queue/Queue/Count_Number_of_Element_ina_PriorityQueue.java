package Queue;

import java.util.PriorityQueue;
import java.util.Scanner;

public class Count_Number_of_Element_ina_PriorityQueue {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read the number of initial tasks (n)
        System.out.println("Enter the queue Size: ");
        int n = sc.nextInt();

        // Create a PriorityQueue to store task priorities
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        // Read and add n task priorities to the PriorityQueue
        System.out.println("Enetr the Elements: ");
        for (int i = 0; i < n; i++) {
            pq.add(sc.nextInt());
        }

        // Read the new task priority to insert
        System.out.println("Enter the new insert element: ");
        int newTask = sc.nextInt();

        // Add the new task priority to the PriorityQueue
        pq.add(newTask);

        // Count the number of elements in the PriorityQueue
        int count = pq.size();

        // Print the count of elements
        System.out.println("Number of elements in the Priority Queue: " + count);

        sc.close();
    }

}
