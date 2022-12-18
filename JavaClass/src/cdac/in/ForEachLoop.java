package cdac.in;

import java.util.*;

public class ForEachLoop {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int[] marks = { 10, 20, 30, 40, 50, 60, 70 };
		float[] name = { 15, 25 };

		for (float i : name) {
			for (float f : marks) {
				System.out.println(f);
			}
			System.out.println(i);

		}

	}

}
