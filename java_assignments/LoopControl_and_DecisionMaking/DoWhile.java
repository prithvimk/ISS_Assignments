package LoopControl_and_DecisionMaking;

import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number;
        
        do {
            System.out.print("Enter a positive number: ");
            number = sc.nextInt();
            
            if (number <= 0) {
                System.out.println("Invalid input. Please try again.");
            }
        } while (number <= 0);
        
        System.out.println("You entered: " + number);
    }
}

