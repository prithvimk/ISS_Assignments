package Arrays;

import java.util.Scanner;

public class ArrayMinMax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the number of test scores: ");
        int numScores = sc.nextInt();
        
        int[] scores = new int[numScores];
        
        System.out.println("Enter the test scores:");
        for (int i = 0; i < numScores; i++) {
            System.out.print("Score " + (i + 1) + ": ");
            scores[i] = sc.nextInt();
        }
        
        int maxScore = findMaxScore(scores);
        int minScore = findMinScore(scores);
        
        System.out.println("Maximum score: " + maxScore);
        System.out.println("Minimum score: " + minScore);
    }
    
    public static int findMaxScore(int[] scores) {
        int maxScore = Integer.MIN_VALUE;
        
        for (int score : scores) {
            if (score > maxScore) {
                maxScore = score;
            }
        }
        
        return maxScore;
    }
    
    public static int findMinScore(int[] scores) {
        int minScore = Integer.MAX_VALUE;
        
        for (int score : scores) {
            if (score < minScore) {
                minScore = score;
            }
        }
        
        return minScore;
    }
}

