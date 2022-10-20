package staticvariable;

// static mthd can access static data member and can change the value of it.

class Student
{
	int name;
	String rollno;
	static String college="GNITC";
	
public static void change()
{
	college="JNTUH";
}
Student(int n,String r)
{
	name=n;
	rollno=r;
}
void display()
{
	System.out.println(name+" "+rollno+" "+college);
}
}
public class StaticMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Student.change(); // calling change method
        
        Student obj=new Student(101,"ashu");
        Student obj1=new Student(102,"varru");
        
        obj.display();
        obj1.display();
	}

}
