package Collections;

import java.util.HashMap;
import java.util.Map;

public class Maps {

    public static void main(String[] args) {
        // Creating a map of string keys and integer values
        Map<String, Integer> studentScores = new HashMap<>();

        // Adding key-value pairs to the map
        studentScores.put("Aarav", 95);
        studentScores.put("Isha", 80);
        studentScores.put("Riya", 75);
        studentScores.put("Kiran", 90);
        studentScores.put("Devika", 85);

        // Displaying the map of string keys and integer values
        System.out.println("Map of Student Scores:");
        for (Map.Entry<String, Integer> entry : studentScores.entrySet()) {
            String studentName = entry.getKey();
            int score = entry.getValue();
            System.out.println(studentName + ": " + score);
        }
    }
}

