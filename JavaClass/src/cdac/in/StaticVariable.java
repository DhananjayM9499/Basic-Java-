package cdac.in;

class Student {
	int stdId;
	String stdName;
	static String collegeName = "Cdac Delhi";
	
	public static void collegeChange() {
		 collegeName="CDAC Noida";
	}

	Student(int id, String name) {
		stdId=id;
		stdName=name;

	}
	void Display() {
		System.out.println(stdId+" "+stdName+" "+ collegeName);
	}

	
}

public class StaticVariable {
	public static void main(String[] args) {
		Student.collegeChange();
		Student s1=new Student(101,"Danny");
		Student s2=new Student(102,"Jenni");
		Student s3=new Student(103,"Manny");
		
		s1.Display();
		s2.Display();
		s3.Display();


		

	}

}
