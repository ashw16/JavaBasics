package collection_list_assignment;
/*
Create an ArrayList of Employee( id,name,address,sal) objects
and search for particular Employee object based on id number.
*/
import java.util.*;
class Employee
{
	private int id;
	private String name;
	private String address;
	private Double salary;
	
	public Employee(int id,String name, String address, Double salary)
	{
		this.id=id;
		this.name=name;
		this.address=address;
		this.salary=salary;
	}
	public int getId()
	{
		return id; 
	}
	
	public String toString() {
		return "Employee [id=" +id +", name=" +name+", address=" +address+", salary=" +salary+"]";
	}
}

public class Assignment5 {

	public static void main(String[] args) {
		
		List<Employee> list=new ArrayList<>();
		
		list.add(new Employee(101,"ashu","hyd",2000.0));
		list.add(new Employee(102,"varru","hyd",1000.0));
		list.add(new Employee(103,"sushu","hyd",3000.0));
		list.add(new Employee(104,"rajji","hyd",1000.0));
		list.add(new Employee(105,"anu","hyd",4000.0));
		
		Iterator itr=list.iterator();
		int searchId=102;
		while(itr.hasNext())
		{
			Employee emp=(Employee) itr.next();
			if(emp.getId()==searchId)
			{
			System.out.println(emp);
		}
		}
	}

}
