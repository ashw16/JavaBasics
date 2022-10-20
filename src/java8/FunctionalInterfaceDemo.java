package java8;

//FunctionalInterface is that interface which contains only one abstract method & any number of default and 
//static methods.

@FunctionalInterface
interface Test1
{
	public void display();
	
	default void area()
	{
		System.out.println("This is area method of Test1");
	}
	default void area1()
	{
		System.out.println("This is second default method of Test1");
	}
	
	static void output()
	{
		System.out.println("This is static method");
	}
	static void output1()
	{
		System.out.println("This is second method of static");
	}
}

interface Test2
{
	public void square1(int a);
	
	default void area2()
	{
		System.out.println("This is the default method of Test2");
	}
	static void output3() {
		System.out.println("This is the static method of Test2");
	}
}
public class FunctionalInterfaceDemo implements Test1,Test2
{

	public static void main(String[] args) {
		
		FunctionalInterfaceDemo obj=new FunctionalInterfaceDemo();
		obj.area();
		obj.area1();
		obj.display();
		
		Test1.output();
		Test1.output1();
		System.out.println("-------------------------------");
		
		FunctionalInterfaceDemo obj1=new FunctionalInterfaceDemo();
		obj1.square1(5);
		obj1.area2();
		Test2.output3();
	}

	

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("this is display method");
	}



	@Override
	public void square1(int a) {
		// TODO Auto-generated method stub
		System.out.println(a*a);
	}

}
