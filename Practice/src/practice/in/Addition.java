package practice.in;

import java.util.*;

public class Addition {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num, sum = 0;
		System.out.println("enter your number");
		num = scan.nextInt();
		while (num >= 0) {
			sum = sum + num;
			System.out.println("enter your number");
			num = scan.nextInt();

		}
		System.out.println(sum);

	}

}
