package studio1;

import java.util.Scanner;

public class Average {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter value for first number: ");
		double s0 = scan.nextDouble();
		System.out.print("Enter value for second number: ");
		double s1 = scan.nextDouble();
		double ave = (s0 + s1)/2;
		System.out.println("Your average is " + ave);
	}

}
