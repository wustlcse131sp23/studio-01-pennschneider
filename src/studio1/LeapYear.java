package studio1;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter year: ");
		int s0 = scan.nextInt();
		int year1 = s0%4;
		int year2 = s0%100; 
		int year3 = s0%400; 
		boolean valid = year1<1 && year2>0 || year3 == 0;
		System.out.println("It is " + valid + " that is a leap year");
	}

}
