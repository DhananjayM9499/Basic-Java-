package cdac.in;
import java.util.*;




public class Equality {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int num1,num2,num3,num4;
		
		System.out.println("Enter first number");
		num1=scan.nextInt();
		
		System.out.println("Enter second number");
		num2=scan.nextInt();
		
		System.out.println("Enter third number");
		num3=scan.nextInt();
		
		System.out.println("Enter fourth number");
		num4=scan.nextInt();
		
		if(num1==num2 && num1==num3 && num1==num4) {
			System.out.println("The numbers are equal");
			
		}
		
		else {
			System.out.println("The numbers are not equal");
		}

	}

}
