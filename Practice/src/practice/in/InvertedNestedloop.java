package practice.in;
import java.util.*;
public class InvertedNestedloop {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number of rows");
		int a=scan.nextInt();
		for (int i = a; i > 0; i--) {
			for (int j = i; j> 0; j--) {
				System.out.print(j+" ");
				
			}
			System.out.println(" ");
		}
	}

}
