package cdac.in;
import java.util.*;
public class AddMatrix {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);

		int Sum = 0;
		int array1[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		

		int array2[][] = { { 9, 8, 7 }, { 6, 5, 4, }, { 3, 2, 1 } };
		
		System.out.println("First array");

		for (int i = 0; i < array1.length; i++) {
			for (int j = 0; j < array1.length; j++) {
				System.out.print(array1[i][j]+" ");
			}
			System.out.println(" ");

		}
		System.out.println();
		
		System.out.println("Second array");

		for (int i = 0; i < array2.length; i++) {
			for (int j = 0; j < array2.length; j++) {
				System.out.print(array2[i][j]+" ");
			}
			System.out.println(" ");

		}
		System.out.println();
		
		System.out.println("Final array after addition");

		for (int row = 0; row < array2.length; row++) {
			for (int column = 0; column < array2.length; column++) {
				Sum = array1[row][column] + array2[row][column];
				System.out.print(Sum + " ");
			}
			System.out.println(" ");
		}

	}

}
