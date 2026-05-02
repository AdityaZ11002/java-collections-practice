package ArrayList;
import java.util.ArrayList;
import java.util.Scanner;

public class Implementation_Of_Generics_Using_ArrayList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Size of Element: ");
        int n = sc.nextInt();
        sc.nextLine(); // consume newline

        
        String type = sc.nextLine();
        ArrayList<Object> list = new ArrayList<>();

        if (type.equals("Integer")) {
            for (int i = 0; i < n; i++) {
                list.add(sc.nextInt());
            }
        } else if (type.equals("String")) {
            for (int i = 0; i < n; i++) {
                list.add(sc.next());
            }
        } else if (type.equals("Double")) {
            for (int i = 0; i < n; i++) {
                list.add(sc.nextDouble());
            }
        }


        System.out.println("Size: " + list.size());
        
        System.out.print("Elements: ");
        for (Object element : list) {
            System.out.print(element + " ");
        }

        sc.close();
    }

}
