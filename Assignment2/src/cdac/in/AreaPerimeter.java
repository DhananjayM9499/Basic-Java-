package cdac.in;

import java.util.*;

class Rectangle {

	public void Area() {
		Scanner scan = new Scanner(System.in);
		int length, width, Area;

		System.out.println("Enter the length of the rectangle");
		length = scan.nextInt();

		System.out.println("Enter the width of the rectangle");
		width = scan.nextInt();

		Area = length * width;

		System.out.println("The area of the rectangle is = " + Area + "Square units");
	}

	public void peri() {

		Scanner scan = new Scanner(System.in);
		int length, width, Perimeter;
		System.out.println("Enter the length of the rectangle");
		length = scan.nextInt();

		System.out.println("Enter the width of the rectangle");
		width = scan.nextInt();

		Perimeter = 2 * (length + width);

		System.out.println("The perimeter of the rectangle is = " + Perimeter + " units");
	}
}

public class AreaPerimeter {

	public static void main(String[] args) {

		Rectangle rectangle = new Rectangle();
		rectangle.Area();
		rectangle.peri();

	}

}
