package javafirstproject;
import java.util.Scanner;
public class Lab1Ex1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int number,sum = 0, count = 0;
		double avg;
		
		System.out.print("Enter a number:");
		number = sc.nextInt();
		if(number<1 || number>1000) {
			System.out.println("Please enter number from 1 to 1000");
		}
		else {
		for (int k= 1000; k>=number;k--) {
			System.out.print(k+" ");
			sum += k;
			count++;
		}
			avg = (double)sum/count;
			System.out.println();
			System.out.println("Sum is:"+sum);
			System.out.println("Average is:"+avg);
		
		}
	
		sc.close();
	}
	
	

}
