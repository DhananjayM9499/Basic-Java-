package cdac.in;

public class Concatenate {

	public static void main(String[] args) {
		int[] array1 = { 0, 1, 2, 3, 4 };
		int[] array2 = { 5, 6, 7, 8, 9 };
		int[] arrayC = new int[array1.length + array2.length];
		int c = 0;
		for (int i = 0; i < array1.length; i++) {
			arrayC[i] = array1[i];

		}
		for (int i = 0; i < array2.length; i++) {
			arrayC[array1.length+i] = array2[i];
			
		}
		for (int i = 0; i < arrayC.length; i++) {
			System.out.print(arrayC[i]+" ");
		}
	}

}
