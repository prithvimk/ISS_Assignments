package Collections;

import java.util.ArrayList;
import java.util.List;

public class ListOperations {

    public static void main(String[] args) {
        // Creating a list of integers
        List<Integer> numbers = new ArrayList<>();

        // Adding elements to the list
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);

        // Displaying the list
        System.out.println("Original List: " + numbers);

        // Accessing elements by index
        int firstElement = numbers.get(0);
        int lastElement = numbers.get(numbers.size() - 1);
        System.out.println("First Element: " + firstElement);
        System.out.println("Last Element: " + lastElement);

        // Updating an element
        numbers.set(2, 35);
        System.out.println("List after updating: " + numbers);

        // Removing an element
        numbers.remove(3);
        System.out.println("List after removing: " + numbers);

        // Checking if the list contains an element
        System.out.println("List contains 30: " + numbers.contains(30));

        // Getting the size of the list
        System.out.println("Size of the list: " + numbers.size());

        // Clearing the list
        numbers.clear();
        System.out.println("List after clearing: " + numbers);

        // Checking if the list is empty
        System.out.println("List is empty: " + numbers.isEmpty());
    }
}

