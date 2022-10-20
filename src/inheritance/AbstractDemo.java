package inheritance;

abstract class Bike
{
	int x;
	abstract void speed();
	public void engine()
	{
		System.out.println("The engine of this bike is very good");
	}
}
 public class AbstractDemo extends Bike
 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractDemo obj=new AbstractDemo();
		obj.speed();
		obj.engine();
	}

	@Override
	void speed() {
		// TODO Auto-generated method stub
		System.out.println("speed of bike is very good");
	}

}
