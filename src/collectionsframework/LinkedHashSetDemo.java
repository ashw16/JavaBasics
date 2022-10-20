package collectionsframework;

import java.util.*;
public class LinkedHashSetDemo {

	public static void main(String[] args) {
		
		LinkedHashSet<String> lhs=new LinkedHashSet<String>();
		
		lhs.add(new String("apple"));
		lhs.add(new String("banana"));
		lhs.add(new String("orange"));
		lhs.add(new String("grapes"));
		
		Object array[]=lhs.toArray();
		
		for(int x=0;x<4;x++)
		{
			System.out.println(array[x]);
		}
	}

}
