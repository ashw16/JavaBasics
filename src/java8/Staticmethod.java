package java8;

interface Engine
{
	public static void display()
	{
		System.out.println("This is java 8 Static Method");
	}
}
public class Staticmethod implements Engine
{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  Engine.display();
	}

}
