package Collections;

import java.util.HashSet;
import java.util.Set;

public class SetOperations {

    public static void main(String[] args) {
        // Creating a set of integers
        Set<Integer> numbers = new HashSet<>();

        // Adding elements to the set
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);

        // Displaying the set
        System.out.println("Original Set: " + numbers);

        // Checking if the set contains an element
        System.out.println("Set contains 30: " + numbers.contains(30));

        // Removing an element from the set
        numbers.remove(40);
        System.out.println("Set after removing 40: " + numbers);

        // Getting the size of the set
        System.out.println("Size of the set: " + numbers.size());

        // Clearing the set
        numbers.clear();
        System.out.println("Set after clearing: " + numbers);

        // Checking if the set is empty
        System.out.println("Set is empty: " + numbers.isEmpty());
    }
}

