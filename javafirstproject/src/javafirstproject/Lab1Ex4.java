package javafirstproject;
import java.util.Scanner;
public class Lab1Ex4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
        System.out.print("Input (yyyy-mm-dd): ");
        String date = sc.nextLine();
        
        String[] parts = date.split("-");
        
        int year = Integer.parseInt(parts[0]);
        int month = Integer.parseInt(parts[1]);
        int day = Integer.parseInt(parts[2]);
        
        boolean isValid = true;
        
        if (month < 1 || month > 12) {
            isValid = false;
        }
        else if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
            if (day < 1 || day > 31) {
                isValid = false;
            }
        }
        else if (month == 4 || month == 6 || month == 9 || month == 11) {
            if (day < 1 || day > 30) {
                isValid = false;
            }
        }
        else if (month == 2) {
            boolean isLeapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
            
            if (isLeapYear) {
                if (day < 1 || day > 29) {
                    isValid = false;
                }
            } else {
                if (day < 1 || day > 28) {
                    isValid = false;
                }
            }
        }
        
        if (isValid) {
            System.out.println("Output: valid");
        } else {
            System.out.println("Output: invalid");
        }
        
        sc.close();
    }
}