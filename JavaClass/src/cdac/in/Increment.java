package cdac.in;

public class Increment {

	public static void main(String[] args) {
		int num1=50;
		int num2=num1;
		System.out.println("num1 is "+num1);//50
		System.out.println("num2 is "+num2);//50
		
		//increment num1
		num2=num1++;//post increment (num1=51)
		
		System.out.println("num1 is "+num1);//51
		System.out.println("num2 is "+num2);//50
		
		//pre-increment
		num2=++num1;
		System.out.println("num1 is "+num1);//52
		System.out.println("num2 is "+num2);//52
		
		//Decrement num1
		num2=num1--; //post decrement
		System.out.println("num1 is "+num1);//51
		System.out.println("num2 is "+num2);//50
		
		num2=--num1; //post decrement
		System.out.println("num1 is "+num1);//50
		System.out.println("num2 is "+num2);//50
	}

}
