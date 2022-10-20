package collectionsframework;

import java.util.*;

public class ListDemo {

	public static void main(String[] args) {
		
		// Collection is a interface
		// But collection is a class which provide number of static methods
		//generic
		
		//List li=new ArrayList();
		//List li=new LinkedList();
        List<String> li=new Vector<String>();// this is generic
		
		li.add("apple");
		li.add("banana");
		li.add("orange");
		//li.add(1); error becz we used generic as string
		//System.out.println(li);
		
		
		li.add("apple");
		li.add("banana");
		li.add("orange");
		//System.out.println(li);
		
		Collections.sort(li);
		//System.out.println(li);
		//System.out.println(li.get(1));
		
		System.out.println("Total elements in list:"+li.size());
		for(int i=0;i<li.size();i++)
		{
			System.out.println(li.get(i));
		}
		System.out.println("---------------------------------------");
		Iterator itr=li.iterator();
		
		while(itr.hasNext()) //check elements present or not
		{
			System.out.println(itr.next()); // extract the element and print it
		}
		System.out.println("--------------");
		for(Object s:li)
		{
			System.out.println(s);
		}
		System.out.println("-------------java 8------------");
		li.stream().forEach(e->System.out.println(e));
		
	}

}
