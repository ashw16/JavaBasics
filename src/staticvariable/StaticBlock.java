package staticvariable;

//It is executed before the main method at the time of class loading

public class StaticBlock 
{
	static
	{
		System.out.println("static block is invoked");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  System.out.println("Hello main method");
	}

}
