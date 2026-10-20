package javafirstproject;
import java.util.Scanner;
public class Lab1Ex3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		double[] number = new double[5];
		System.out.println("Please enter 5 number:");
		System.out.println("Input:");
		for(int k=0;k<5;k++) {
			number[k] = sc.nextDouble();
			
		}
		double min = number[0];
		double max = number[0];
		for(int k= 1;k<5;k++) {
			if(number[k]<min) {
				min = number[k];
			}
			if(number[k]>max) {
				max = number[k];
			}
		}
		System.out.println("Input:");
		System.out.print("Among all the five input number(");
		for(int k = 0;k<5;k++) {
			System.out.print((int)number[k]);
			if(k<4) {
				System.out.print(",");
			}
		}
		System.out.println("),");
		System.out.println("min is" + (int)min + "and mix is" + (int)max + ".");
		sc.close();
	}

}
