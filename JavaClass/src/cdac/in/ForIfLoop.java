package cdac.in;
import java.util.*;
public class ForIfLoop {
	public static void main(String[] args) {
		double num, sum=0;
		Scanner scan=new Scanner(System.in);
		for (int i = 1; i <= 5; i++) {
			System.out.println("Enter the number"+i+":");
			num=scan.nextDouble();
			if(num<0) {
				continue;
				
			}
			sum=sum+num;
		}
		System.out.println("your addition is "+sum);
		
	}

}
