package polymorphism;

class Shape
{
	public void area(int side)
	{
		int result=side*side;
		System.out.println("Area of square is:"+result);
	}
	public void area(int length,int breadth)
	{
		int result=length*breadth;
		System.out.println("Area of Rectangle is:"+result);
	}
	public void area(double pi,int r)
	{
		double result=pi*r*r;
		System.out.println("Area of circle is:"+result);
	}
}
public class MethodOverloading extends Shape
{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodOverloading obj=new MethodOverloading();
		obj.area(10);
		obj.area(10,20);
		obj.area(3.14,10);
       
	}

}
