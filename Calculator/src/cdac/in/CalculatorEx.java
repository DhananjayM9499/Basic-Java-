package cdac.in;
import java.util.*;
public class CalculatorEx {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		char operator;
		double num1,num2,result;
		System.out.println("#####################################");
		System.out.println("      1. + for addition ");
		System.out.println("      2. - for subtraction ");
		System.out.println("      3. * for multiplication ");
		System.out.println("      4. / for division ");
		System.out.println("#####################################");
		
		
		operator=scan.next().charAt(0);
		
		System.out.println("Enter the first number");
		num1=scan.nextDouble();
		
		System.out.println("Enter the second number");
		num2=scan.nextDouble();
		
		switch(operator){
		case '1': 
			result=num1+num2;
		System.out.println(num1+" + "+num2+" = "+result);
		break;
		case '2': 
			result=num1-num2;
		System.out.println(num1+" - "+num2+" = "+result);
		break;
		case '3':
			result=num1*num2;
		System.out.println(num1+" * "+num2+" = "+result);
		break;
		case '4':
			result=num1/num2;
		System.out.println(num1+" / "+num2+" = "+result);
		break;
		default:
			System.out.println("Invalid data ");
		
		}
	}
}
