package Arrays;

import java.util.Scanner;

public class AvgTemp {
    public static void main(String[] args) {
        int numDays = 7;
        double[] temperatures = new double[numDays];
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the temperatures for each day of the week:");
        for (int i = 0; i < numDays; i++) {
            System.out.print("Day " + (i + 1) + ": ");
            temperatures[i] = sc.nextDouble();
        }
        
        
        double sum = 0;
        for (double temperature : temperatures) {
            sum += temperature;
        }
        
        double average = sum / numDays;
        
        System.out.println("Average temperature for the week: " + average);
    }
}

