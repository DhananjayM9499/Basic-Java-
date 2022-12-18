package cdac.in;

public class CopyConstructor {
	int id;  
    String name;  
    //constructor to initialize integer and string  
    CopyConstructor(int id,String name)
    {  
       this.id = id;  
       this.name = name;  
    }  
    //constructor to initialize another object  
    CopyConstructor(CopyConstructor s)
    {  
       this.id = s.id;  
       this.name = s.name;  
    }  
    void show()
    {
     System.out.println(id+" "+name);
    }  

	public static void main(String[] args) {
		CopyConstructor s1 = new CopyConstructor(101,"Danny");  
		CopyConstructor s2 = new CopyConstructor(s1);
		CopyConstructor s3= new CopyConstructor(s2);
        s1.show();  
        s2.show();  
        s3.show();  

	}

}
