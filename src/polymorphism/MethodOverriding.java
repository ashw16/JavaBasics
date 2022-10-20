package polymorphism;

class Animal
{
	public void move()
	{
		System.out.println("Animals can move");
	}
}
class Dog extends Animal
{
	public void move()
	{
		System.out.println("Dog can move ");
	}
}

public class MethodOverriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          Dog obj=new Dog();
          obj.move();// Dog can move
          
          
	}

}
