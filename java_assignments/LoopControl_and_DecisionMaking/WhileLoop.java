package LoopControl_and_DecisionMaking;

import java.util.Scanner;

public class WhileLoop {
    public static void main(String[] args) {
        String password = "mypassword";
        Scanner sc = new Scanner(System.in);
        boolean isAuthenticated = false;
        
        while (!isAuthenticated) {
            System.out.print("Enter password: ");
            String input = sc.nextLine();
            
            if (input.equals(password)) {
                System.out.println("Authentication successful!");
                isAuthenticated = true;
            } else {
                System.out.println("Invalid password. Please try again.");
            }
        }
        
        System.out.println("Performing further actions...");
    }
}

