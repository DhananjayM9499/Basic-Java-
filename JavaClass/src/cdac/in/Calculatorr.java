package cdac.in;

import java.util.*;

public class Calculatorr {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int i = 1;
		float a, b, res = 0, average = 0;
		;
		char choice;
		do {
			System.out.println("Calculator Menu item->>>" + "\n1.Addition" + "\n2.Substraction\n3.Multiplication"
					+ "\n4.Division\n5.Average\n6.Power\n7.Quit");
			System.out.print("Enter the choice you want(1,2,3,4,5,6,7): ");
			choice = scan.next().charAt(0);
			switch (choice) {
			case '1':
				System.out.print("Enter number" + i + ":");
				a = scan.nextFloat();
				while (a != 0) {
					res = res + a;
					i++;
					System.out.print("Enter number" + i + ":");
					a = scan.nextFloat();
				}
				System.out.println("Your total is : " + res);
				res = 0;
				i = 1;
				break;

			case '2':
				System.out.print("Enter number 1 :");
				a = scan.nextFloat();
				System.out.print("Enter number 2 : ");
				b = scan.nextFloat();
				res = a - b;
				System.out.println("Your calculation is : " + res);

				res = 0;

				break;

			case '3':
				System.out.println("Enter 1 to exit");
				System.out.println("Enter the numer" + i);
				a = scan.nextFloat();
				res = 1;
				while (a != 1) {

					res = res * a;
					i++;
					System.out.println("Enter the numer" + i);
					a = scan.nextFloat();
				}
				System.out.println("Your calculation is : " + res);

				res = 0;
				i = 1;
				break;

			case '4':
				System.out.println("Enter the numer 1");
				a = scan.nextFloat();

				System.out.println("Enter the numer 2");
				b = scan.nextFloat();
				res = a / b;
				System.out.println("Your calculation is : " + res);

				break;

			case '5':
				System.out.print("Enter number" + i + ":");
				a = scan.nextFloat();
				while (a != 0) {
					res = res + a;
					i++;
					System.out.print("Enter number" + i + ":");
					a = scan.nextFloat();
					average = res / (i - 1);
				}

				System.out.println("Your total is : " + average);
				res = 0;
				i = 1;
				break;

			case '6':
				System.out.print("Enter number:");
				a = scan.nextFloat();

				System.out.print("Enter power : ");
				b = scan.nextFloat();
				System.out.println("Power = " + Math.pow(a, b));

				res = 0;
				i = 1;

				break;

			case '7':
				System.exit(0);
				break;
			}
			System.out.println("Do you want to continue (Y/N)");
			choice = scan.next().charAt(0);
		}

		while (choice == 'Y' || choice == 'y');
		{
			System.out.println("Bye have a good day");
		}

	}

}