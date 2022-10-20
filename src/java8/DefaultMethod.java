package java8;

interface TestInterface
{
	public void square(int a); //abstract method
	
	default void show() // default method java8 feature
	{
		System.out.println("Default Method Executed");
	}
	
	static void output()
	{
		System.out.println("This is static method");
	}
}

public class DefaultMethod implements TestInterface
{
 //implementation of square abstract method
//	public void square(int a)
//	{
//		System.out.println(a*a);
//	}
	public static void main(String[] args)
	{
		DefaultMethod d=new DefaultMethod();
		d.square(4);
		
		d.show();
		//d.output(); error
		TestInterface.output();

	}
	@Override
	public void square(int a)
	{
		System.out.println(a*a);
	}
}
