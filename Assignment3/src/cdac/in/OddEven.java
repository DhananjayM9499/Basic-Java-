package cdac.in;
import java.util.*;
public class OddEven {

	public static void main(String[] args) {
		int n;
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number of input");
		n=scan.nextInt();
		int[] array=new int[n];
		System.out.println("Enter the numbers in array");
		for (int i = 0; i < array.length; i++) {
			array[i]=scan.nextInt();
		}
		
		for (int i = 0; i < array.length; i++) {
			if (array[i]%2==0) {
				System.out.println(array[i]+" is even ");
				
			} if(array[i]%2!=0) {
				System.out.println(array[i]+" is odd ");

			}
		}

	}

}
