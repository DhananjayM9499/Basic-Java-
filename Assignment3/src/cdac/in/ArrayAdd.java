package cdac.in;
import java.util.*;
import java.util.Iterator;

public class ArrayAdd {

	public static void main(String[] args) {

		int n,sum = 0;
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the numbers of additions");
		n=scan.nextInt();
		int[] num =new int[n]; 
		for (int i = 0; i < num.length; i++) {
			System.out.println("Enter the numbers");
			num[i]=scan.nextInt();
			
		}
		for (int i = 0; i < num.length; i++) {
			
		  
			System.out.print(num[i] + " + ");

			sum = sum + num[i];
		
		
			
		}
		
		System.out.println("");
		System.out.println(sum);

	}

}
