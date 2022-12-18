package cdac.in;

public class Ascending {
	public static void main(String[] args) {

		int[] array = new int[] { 5, 2, 8, 7, 1 };
		int num = 0;

	
		System.out.println(" Original array: ");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}


		for (int i = 0; i < array.length; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if (array[i]> array[j]) {
					num = array[i];
					array[i] = array[j];
					array[j] = num;
				}
			}
		}

		System.out.println();

		System.out.println(" Array sorted in ascending order: ");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
	}
}