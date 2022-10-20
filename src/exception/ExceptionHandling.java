package exception;

class Demo
{
	void input()
	{
		System.out.println("hello world");
	}
}
class Test extends Demo
{
	void output()
	{
		int a=10;
		int b=0;
		int c=a/b;
		try
		{
			System.out.println("Arithmetic Exception occured"+c);
		}
		catch(ArithmeticException e)
		{
			System.out.println("catch block");
		}
		
	}
}
public class ExceptionHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Test t=new Test();
      t.input();
      t.output();
      System.out.println("Hello World2");
	}

}
