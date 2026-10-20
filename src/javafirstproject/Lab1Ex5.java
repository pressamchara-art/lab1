package javafirstproject;
import java.util.Scanner;
public class Lab1Ex5 {
	public static void main(String[]  args) {
		Scanner sc = new Scanner (System.in);
		int number;
		System.out.print("Input n: ");
		number = sc.nextInt();
		System.out.println("Input:");
		System.out.print("All prime numbers from 2 to "+ number+":");
		for(int k=2;k<=number;k++) {
			boolean isprime = true;
			for(int i = 2; i<=Math.sqrt(i);i++) {
				if(k%i==0) {
					isprime = false;
					break;
				}
			}
			if(isprime) {
				System.out.print(k +" ");
			}
		}
		sc.close();
	}

}
