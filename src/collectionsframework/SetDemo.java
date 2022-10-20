package collectionsframework;

import java.util.*;
public class SetDemo {

	public static void main(String[] args) {
		
		Set li=new HashSet();
		
		li.add("apple");
		li.add("banana");
		li.add("orange");
		
		li.add("apple");
		li.add("banana");
		li.add("orange");
		
		
		System.out.println("Total elements in list:"+li.size());
		
		 Iterator itr=li.iterator();
	      
	      while(itr.hasNext())
	      {    		  
	       System.out.println(itr.next());
	      }
		//li.stream().forEach(e->System.out.println(e));
		
	}

}
