package inheritance;

class A1
{
	void showA1()
	{
		System.out.println("a class method");
	}
}
class B1 extends A1
{
	void showB1()
	{
		System.out.println("b class method");
	}
}
class c1 extends A1
{
	void showc1()
	{
		System.out.println("c class method");
	}
}

public class HierarchicalInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     A1 obj=new A1();
     obj.showA1();
     System.out.println("----------------");
     
     B1 obj1=new B1();
     obj1.showA1();
     obj1.showB1();
     System.out.println("-------------");
     
     c1 obj2=new c1();
     obj2.showA1();
     obj2.showc1();
     
     
     
	}

}
