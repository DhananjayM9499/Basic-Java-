package cdac.in;
import java.util.*;
public class PrintPyramid {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in); 
		int n;
		System.out.println("number of layers");
		n=scan.nextInt();
		for (int i = 1; i <=n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(i+" ");
				
			}
			System.out.println(" ");
			
		}

	}

}
