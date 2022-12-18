package practice.in;

import java.util.*;

public class MiddleNumber {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter smaller number");
		int num1 = scan.nextInt();
		System.out.println("Enter Bigger number");
		int num2 = scan.nextInt();

		while (num1 != num2) {
			num1++;
			num2--;
		}
		System.out.println(num1);
	}

}
