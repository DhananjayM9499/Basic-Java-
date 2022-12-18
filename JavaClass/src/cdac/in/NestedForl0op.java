package cdac.in;
import java.util.*;
public class NestedForl0op {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number ");
		int a=scan.nextInt();
		for (int i = 0; i <= a; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print( j+" ");

			}
			System.out.println(" ");

		}
	}

}
