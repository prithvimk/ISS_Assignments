package Collections;

import java.util.HashSet;
import java.util.Set;

public class Sets {

    public static void main(String[] args) {
        Set<Integer> numbers = new HashSet<>();

        // Adding integers to the set
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);

        // Displaying the set of integers
        System.out.println("Set of Integers:");
        for (Integer number : numbers) {
            System.out.println(number);
        }
    }
}

