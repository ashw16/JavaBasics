package collection_list_assignment;
/*
Write a program that will have a Vector which is capable of
storing emp objects. Use an Iterator and enumeration to list
all the elements of the Vector.
*/
import java.util.*;

class Employ
{
	private int id;
	private String name;
	private String address;
	private Double salary;
	
	public Employ(int id,String name, String address, Double salary)
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
public class Assignment8 {

	public static void main(String[] args) {
		
		List<Employ> li=new Vector<>();
		
		li.add(new Employ(101,"ashu","hyd",2000.0));
		li.add(new Employ(102,"varru","hyd",1000.0));
		li.add(new Employ(103,"sushu","hyd",3000.0));
		li.add(new Employ(104,"rajji","hyd",1000.0));
		li.add(new Employ(105,"anu","hyd",4000.0));
		
		Iterator<Employ> itr=li.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
      		
		

	}

}
