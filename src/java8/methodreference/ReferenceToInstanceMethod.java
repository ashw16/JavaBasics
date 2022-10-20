package java8.methodreference;

// Instance method reference   obj/reference::methodname

interface B
{
	public void add(int x,int y);
}
class Addition
{
	public void sum(int a,int b)
	{
		System.out.println("The sum is:"+(a+b));
	}
}
public class ReferenceToInstanceMethod {

	public static void main(String[] args) {
		
		Addition addition=new Addition();
		
		// using lambda expression
		B b1=(a,b) -> System.out.println("The sum is :"+(a+b));
		b1.add(10,14);
		
		//using instance method reference
		B b2=addition::sum;
		b2.add(100, 140);
		
		
	}

}
