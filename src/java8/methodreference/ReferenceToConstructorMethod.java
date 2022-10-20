package java8.methodreference;

// constructor method reference   classname::new

interface I
{
	public abstract void m1();
}
class A
{
	A() // constructor
	{
		System.out.println("This is logic is the implementation for m1-I");
	}
}

public class ReferenceToConstructorMethod {

	public static void main(String[] args) {
		
		I obj= A::new;//classname::new
		obj.m1();
	}

}
