package javafirstproject;
import java.util.Scanner;
public class Lab1Ex6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
	        String[] subjects = {"Math", "English", "Physics", "Programming"};
	        double[] scores = new double[4];
	        
	        System.out.print("Input your scores of 4 subjects (Math, English, Physics, and Programming): ");
	        for (int i = 0; i < 4; i++) {
	            scores[i] = sc.nextDouble();
	        }
	        
	        double max = scores[0];
	        double min = scores[0];
	        double sum = scores[0];
	        
	        for (int i = 1; i < 4; i++) {
	            if (scores[i] > max) {
	                max = scores[i];
	            }
	            if (scores[i] < min) {
	                min = scores[i];
	            }
	            sum += scores[i];
	        }
	        
	        double average = sum / 4;
	        
	        System.out.println("----------------------------------------");
	        System.out.print("Max score is: " + (int)max + " (");
	        boolean firstMax = true;
	        for (int i = 0; i < 4; i++) {
	            if (scores[i] == max) {
	                if (!firstMax) {
	                    System.out.print(" and ");
	                }
	                System.out.print(subjects[i]);
	                firstMax = false;
	            }
	        }
	        System.out.println(" courses).");
	        System.out.print("Min score is: " + (int)min + " (");
	        boolean firstMin = true;
	        for (int i = 0; i < 4; i++) {
	            if (scores[i] == min) {
	                if (!firstMin) {
	                    System.out.print(" and ");
	                }
	                System.out.print(subjects[i]);
	                firstMin = false;
	            }
	        }
	        System.out.println(" course).");
	        System.out.println("Average score of this student is: " + average);
	        
	        sc.close();
	    }
}