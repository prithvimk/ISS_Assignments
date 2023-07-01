package LoopControl_and_DecisionMaking;

import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Welcome to the Coffee Shop!");
        System.out.println("Please select an option:");
        System.out.println("1. Espresso");
        System.out.println("2. Cappuccino");
        System.out.println("3. Latte");
        System.out.println("4. Mocha");
        
        int choice = sc.nextInt();
        
        switch (choice) {
            case 1:
                System.out.println("You have selected Espresso. Enjoy your drink!");
                break;
            case 2:
                System.out.println("You have selected Cappuccino. Enjoy your drink!");
                break;
            case 3:
                System.out.println("You have selected Latte. Enjoy your drink!");
                break;
            case 4:
                System.out.println("You have selected Mocha. Enjoy your drink!");
                break;
            default:
                System.out.println("Invalid choice. Please try again.");
        }
    }
}

