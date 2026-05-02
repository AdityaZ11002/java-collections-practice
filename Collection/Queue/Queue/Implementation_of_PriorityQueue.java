package Queue;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Implementation_of_PriorityQueue {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read the number of initial tasks (n)
        System.out.println("Enter the queue Size: ");
        int n = sc.nextInt();

        // Create a PriorityQueue to store task priorities . Lower number = higher priority (natural ordering works)
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        // Read and add n task priorities to the PriorityQueue
        System.out.println("Enetr the Elements: ");
        for (int i = 0; i < n; i++) {
            pq.add(sc.nextInt());
        }

        // Read the new task priority to insert
        System.out.println("Enter the new insert element: ");
        int newTask = sc.nextInt();
        pq.add(newTask);

        // Remove the highest-priority task from the queue  . (smallest value is highest priority)
        pq.poll();  // OR pq.remove();

        // Print the updated queue of task priorities
        System.out.println("Updated Queue of Task Priorities:");
        while (!pq.isEmpty()) {
            System.out.print(pq.poll() + " ");
        }

        sc.close();
    }
}
