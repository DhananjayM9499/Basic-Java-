package cdac.in;

import java.util.*;

public class Swapping {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num1, num2, num3=0;
		System.out.println("Enter first number ");
		num1 = scan.nextInt();
		System.out.println("Enter second number ");

		num2 = scan.nextInt();
		System.out.println("Before swapping \n A = " + num1 + ", B = " + num2);
		
		num3=num1;
		num1=num2;
		num2=num3;
		System.out.println("After swapping \n A = " + num1 + ", B = " + num2);
		
	}
}