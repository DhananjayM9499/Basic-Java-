package cdac.in;

public class Highest {

	public static void main(String[] args) {

		int[] array = { 2, 5, 3, 7, 9 };

		int num = array[0];
		for (int i = 1; i < array.length; i++) {
			if (array[i] > num) {
				num = array[i];

			}

		}
		System.out.println("Highest number is " + num);

		System.out.println();
		for (int i = array.length - 2; i >= array.length - 2; i--) {
			System.out.println("Second highest number is " + array[i]);

		}

	}

}
