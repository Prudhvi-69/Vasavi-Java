import java.util.ArrayList;
import java.util.Collections;

public class ArrayListProgram {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();

        // Adding elements
        names.add("Alpha");
        names.add("Beta");
        names.add("Cosmo");
        names.add("Delta");

        System.out.println("Original List: " + names);

        // Adding at a specific index
        names.add(1, "Karin");
        System.out.println("After adding Karin: " + names);

        // Accessing elements
        System.out.println("First Name: " + names.get(0));

        // Updating an element
        names.set(2, "Vegeta");
        System.out.println("After updating Beta to Vegeta: " + names);

        // Removing elements
        names.remove(3);
        names.remove("Karin");
        System.out.println("After removals: " + names);

        // Checking if an element exists
        System.out.println("Is Hagoromo in the list? " + names.contains("Ajay"));

        // Size of ArrayList
        System.out.println("Total names: " + names.size());

        // Iterating using for-each loop
        System.out.print("List Elements: ");
        for (String name : names) {
            System.out.print(name + " ");
        }
        System.out.println();

        // Sorting
        Collections.sort(names);
        System.out.println("Sorted List: " + names);

        // Clearing the list
        names.clear();
        System.out.println("Is the list empty? " + names.isEmpty());
    }
}

