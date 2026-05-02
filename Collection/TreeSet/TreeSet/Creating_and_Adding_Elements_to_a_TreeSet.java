package TreeSet;

import java.util.Scanner;
import java.util.TreeSet;

public class Creating_and_Adding_Elements_to_a_TreeSet {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read the number of initial products (n)
        System.out.println("Enter the Size: ");
        int n = sc.nextInt();

        // Create a TreeSet to store product names
        TreeSet<String> products = new TreeSet<>();

        // Read and add n product names to the TreeSet
        System.out.println("Enter the String: ");
        for (int i = 0; i < n; i++) {
            products.add(sc.next());
        }

        // Read the new product name to insert
        System.out.println("Enter the new String: ");
        String newProduct = sc.next();

        // Add the new product name to the TreeSet
        products.add(newProduct);

        // Count the number of unique elements in the TreeSet
        int count = products.size();

        // Print the sorted product list and the count of unique products
        System.out.println("Sorted Product List: " + products);
        System.out.println("Number of unique products: " + count);

        sc.close();
    }

}
