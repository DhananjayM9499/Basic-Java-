package cdac.in;
import java.util.*;

public class Calculator {

	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		char operator;
		double num1,num2,result;
		
		System.out.println("Enter First number");
		num1=scan.nextInt();
		
		System.out.println("Enter the arithmetic operation");
		operator=scan.next().charAt(0);
		
		System.out.println("Enter Second number");
		num2=scan.nextInt();
		
		if(operator=='+'){
			result=num1 + num2 ;
			System.out.println(num1+" + "+num2+" = "+result);
			
		}

		if(operator=='-'){
			result=num1 - num2 ;
			System.out.println(num1+" - "+num2+" = "+result);
			
		}

		if(operator=='*'){
			result=num1 * num2 ;
			System.out.println(num1+" * "+num2+" = "+result);
			
		}

		if(operator=='/'){
			result=num1 / num2 ;
			System.out.println(num1+" / "+num2+" = "+result);
			
		}
		
		

	}

}

