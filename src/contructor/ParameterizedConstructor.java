package contructor;

class Student
{
	int id;
	String name;
	Student(int id,String name)
	{
		this.id=id;
		this.name=name;
	}
	void display()
	{
		System.out.println(id+" "+name);
	}
}
public class ParameterizedConstructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  Student s1=new Student(101,"ashu");
  s1.display();
  Student s2=new Student(101,"raj");
  s2.display();
	}

}
