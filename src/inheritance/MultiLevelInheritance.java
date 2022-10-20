package inheritance;

class A 
{
	void showA()
	{
		System.out.println("a class method");
	}
}
class B extends A
{
	void showB()
	{
		System.out.println("b class method");
	}
}
class c extends B
{
	void showc()
	{
		System.out.println("c class method");
	}
}
public class MultiLevelInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     A ob=new A();
     ob.showA();
    // ob.showB(); error 
     // ob.showc(); error
     System.out.println("----------");
     B ob2=new B();
     ob2.showA();
     ob2.showB();
     // ob2.showc(); error
     System.out.println("-------------");
     c ob3=new c();
     ob3.showA();
     ob3.showB();
     ob3.showc();
	}

}
