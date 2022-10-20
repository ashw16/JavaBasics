package contructor;

class Area
{
	public Area(int a)
	{
		System.out.println("Area of rectangle is:"+a);
		System.out.println("Area of length is:"+a*a);
	}
}
class Rectangle
{
	public Rectangle(int l,int b)
	{
		System.out.println("length and breadth of rectangle is:"+l*b);
	}
}
class Circle{
	public Circle(double pi,int r)
	{
		System.out.println("Area of circle is:"+pi*r);
	}
}


public class ConstructorOverLoading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Area obj=new Area(10);
        Rectangle obj1=new Rectangle(10,20);
        Circle obj2=new Circle(3.15,30);
        
	}

}
