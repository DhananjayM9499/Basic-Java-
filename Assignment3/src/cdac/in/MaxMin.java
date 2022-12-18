package cdac.in;

import java.util.*;

public class MaxMin {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num;
		System.out.println("Enter the amount of number you want to compare");
		num = scan.nextInt();

		int[] array = new int[num];
		for (int i = 0; i < array.length; i++) {
			System.out.println("Enter " + (i+1) + " number");
			array[i] = scan.nextInt();

		}

		int Max = array[0];
		int Min = array[0];
		for (int i = 1; i < array.length; i++) {

			if (array[i] > Max) {
				Max = array[i];
			}
			if (array[i] < Min) {
				Min = array[i];
			}

		}
		System.out.println(Max);
		System.out.println(Min);
	}

}
