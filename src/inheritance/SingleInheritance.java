package inheritance;

class Sem1
{
	 int math,english,computer;
	void input()
	{
		math=55;
		english=66;
		computer=77;
	}
	public void output()
	{
		System.out.println("-------------");
		System.out.println("math:"+math);
		System.out.println("english:"+english);
		System.out.println("computer:"+computer);
	}
}
class Sem2 extends Sem1
{
	 int c,java,python;
	 public void input2()
	 {
		 c=45;
		 java=98;
		 python=78;
	 }
	 public void output2()
	 {
		 System.out.println("-------------");
			System.out.println("c:"+c);
			System.out.println("java:"+java);
			System.out.println("python:"+python);
	 }
}
public class SingleInheritance
{
	public static void main(String[] args)
	{
		Sem2 obj=new Sem2();
		obj.input();
		obj.input2();
		
		obj.output();
		obj.output2();
	}
}


