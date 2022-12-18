package cdac.in;

import java.util.*;

public class ReverseArray {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n;
		System.out.println("Enter the count of numbers");
		n = scan.nextInt();
		int[] array = new int[n];

		for (int i = 0; i < n; i++) {
			System.out.println("Enter number " + (i + 1));
			array[i] = scan.nextInt();
		}
		System.out.println("original array");
		System.out.print("{ ");

		for (int i = 0; i < n; i++) {

			System.out.print(+array[i] + " ");
		}
		System.out.println(" }");
		
		System.out.println("Reversed array");
		System.out.print("{ ");

		for (int i = (n-1); i >= 0; i--) {
			System.out.print(array[i]+" ");

		}
		System.out.print("} ");

	}

}
