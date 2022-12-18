package cdac.in;

class ParaConstructor{
	int id;
	String name;
	
	ParaConstructor(int id, String name){
		this.id=id;
		this.name=name;
		
	}
	public void display() {
		System.out.println(id);
		System.out.println(name);
	}
}

public class Constpara {

	public static void main(String[] args) {
		ParaConstructor Student1=new ParaConstructor(101,"Danny");
		Student1.display();
		ParaConstructor Student2=new ParaConstructor(10,"Day");
		Student2.display();
	}

}
