package staticvariable;

// static var gets memory only once in the class area at the time of class loading.

class Employee
{
	int emp_id;
	String emp_name;
	String emp_dept1;
	static String emp_city="hyd"; //static var
	
	

Employee(int a,String b,String c) // constructor 
{
	emp_id=a;
	emp_name=b;
	emp_dept1=c;
	
}
void display()
{
	System.out.println(emp_id+" "+emp_name+" "+emp_city+" "+emp_dept1);
}
}
public class StaticVariable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		Employee obj=new Employee(101,"ashu","c");
		Employee obj1=new Employee(102,"varru","python");
		
		Employee.emp_city="bangalore"; //changing the  city of all objects by the single line of code
		
		obj.display();
		obj1.display();
	}

}
