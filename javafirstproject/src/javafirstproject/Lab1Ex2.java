package javafirstproject;
import java.util.Scanner;
public class Lab1Ex2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int a,b,c;
		System.out.println("================================================");
		System.out.println("          welcome to our program             ");
		System.out.println("'Quadratic Equation Solover ax^2+bx+c=0'");
		System.out.println("================================================");
		System.out.print("Input a: ");
		a = sc.nextInt();
		System.out.print("Input b: ");
		b = sc.nextInt();
		System.out.print("Input c: ");
        c = sc.nextInt();
        double dalta = (b*b) - (4*a*c);
        double x1,x2;
        System.out.println("------------------------------------------------------");
        System.out.println("Roots of this equation: " +a +"x^2+"+b+"x+"+c+"=0 are:");
        if(dalta>0) {
        	x1 = (-b + Math.sqrt(dalta))/(2*a);
        	x2 = (-b - Math.sqrt(dalta))/(2*a);
        	System.out.println(x1);
        	System.out.println(x2);
        }
        else if(dalta==0) {
        	x1 = x2 = (-b)/(2*a);
        	System.out.println("x1 ="+x1);
        	System.out.println("x2 = "+x2);
        }
        else if (dalta<0){
        	System.out.println("No real solution.");
      
        }
        System.out.println("------------------------------------------------------");
        sc.close();
	}
	

}
