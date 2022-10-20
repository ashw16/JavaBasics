package inheritance;

interface Engine
{
	int engineNo=6;
	void mileage();
	void insurance();
	
}
class Car
{
	String model;
	public void speed()
	{
		System.out.println("speed of the car is very good");
	}
}

public class MultipleInheritance extends Car implements Engine
{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MultipleInheritance obj=new MultipleInheritance();
		obj.mileage();
		obj.speed();
		obj.insurance();
	}

	@Override
	public void mileage() {
		// TODO Auto-generated method stub
		System.out.println("The mileage of the engine is good");
	}

	@Override
	public void insurance() {
		// TODO Auto-generated method stub
		System.out.println("Insurance is also covered");
	}

}
