package Collections;

import java.util.HashMap;
import java.util.Map;

public class MapOperations {

    public static void main(String[] args) {
        // Creating a map of cities as keys and temperature as values
        Map<String, Integer> cityTemperatures = new HashMap<>();

        // Adding key-value pairs to the map
        cityTemperatures.put("Delhi", 35);
        cityTemperatures.put("Mumbai", 30);
        cityTemperatures.put("Kolkata", 32);
        cityTemperatures.put("Chennai", 34);
        cityTemperatures.put("Bangalore", 28);

        // Displaying the map
        System.out.println("Original Map: " + cityTemperatures);

        // Accessing a value by key
        System.out.println("Temperature in Delhi: " + cityTemperatures.get("Delhi"));

        // Checking if the map contains a key
        System.out.println("Map contains key 'Kolkata': " + cityTemperatures.containsKey("Kolkata"));

        // Checking if the map contains a value
        System.out.println("Map contains value '30': " + cityTemperatures.containsValue(30));

        // Updating a value for a key
        cityTemperatures.put("Mumbai", 32);
        System.out.println("Map after updating temperature in Mumbai: " + cityTemperatures);

        // Removing a key-value pair
        cityTemperatures.remove("Chennai");
        System.out.println("Map after removing Chennai: " + cityTemperatures);

        // Getting the size of the map
        System.out.println("Size of the map: " + cityTemperatures.size());

        // Clearing the map
        cityTemperatures.clear();
        System.out.println("Map after clearing: " + cityTemperatures);

        // Checking if the map is empty
        System.out.println("Map is empty: " + cityTemperatures.isEmpty());
    }
}

