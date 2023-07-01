package LoopControl_and_DecisionMaking;

import java.util.Scanner;

public class IfElseDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter your annual income: ");
        double income = sc.nextDouble();
        
        double taxAmount;
        
        if (income <= 50000) {
            taxAmount = income * 0.05;
        } else if (income <= 100000) {
            taxAmount = 2500 + (income - 50000) * 0.1;
        } else if (income <= 200000) {
            taxAmount = 7500 + (income - 100000) * 0.15;
        } else {
            taxAmount = 22500 + (income - 200000) * 0.2;
        }
        
        System.out.println("Tax amount: $" + taxAmount);
    }
}

