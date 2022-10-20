package java8.methodreference;

// static method reference  classname::methodname

interface Engine
{
	abstract public void speed();
}
class car
{
	public static void average()
	{
		System.out.println("The average of the car is very good");
	}
}
public class ReferenceToStaticMethodDemo {

	public static void main(String[] args) 
	{
	  //using lambda expression
		Engine obj= () -> System.out.println("Speed is good");
        obj.speed();
        
        //lambda replaced with static method reference
        Engine obj1=car:: average;
        obj1.speed();
	}

}
