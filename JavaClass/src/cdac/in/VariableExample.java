package cdac.in;

class Person {
	static int age;

}

public class VariableExample {

	public static void main(String[] args) {
		Person p1 = new Person();
		Person p2 = new Person();
		Person p3 = new Person();

		p1.age = 25;
		p2.age = 35;
		p3.age = 50;
		p3.age = 23;
		System.out.println("p1 object value of age " + p1.age);
		System.out.println("p2 object value of age " + p2.age);
		System.out.println("p3 object value of age " + p3.age);

	}

}
