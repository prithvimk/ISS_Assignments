package Collections;

import java.util.ArrayList;
import java.util.List;

public class Lists {

    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        
        // Adding integers to the list
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);
        
        // Displaying the list of integers
        System.out.println("List of Integers:");
        for (Integer number : numbers) {
            System.out.println(number);
        }
    }
}
