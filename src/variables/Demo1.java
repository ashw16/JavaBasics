package variables;

public class Demo1 {
	int x; // instance var
	public void input(int x,int y) // member function
	{
		//System.out.println(x);
		//x=10;
		
	}
	public void output() 
	{
		System.out.println(x); //10 // 20
	}
	public static void main(String[] args) {
		
		Demo1 obj=new Demo1();
		System.out.println(obj.hashCode());
		obj.input(80,90);
		obj.x=20;
		obj.output();
		
		Demo1 obj2=new Demo1();
		System.out.println(obj2.hashCode());
		obj2.input(30,40);
		obj2.x=50;
		obj2.output();
		 
	//	int a=10; // local var
		//System.out.println(a); //10
	
	
	}
	

	
		
		
	}


