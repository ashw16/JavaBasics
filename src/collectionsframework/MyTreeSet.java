package collectionsframework;

import java.util.*;
public class MyTreeSet {

	public static void main(String[] args) {
		
		TreeSet<String> ts=new TreeSet<String>();
		
		ts.add("one");
		ts.add("two");
		ts.add("three");
		ts.add("four");
		
		Iterator it=ts.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next().toString());
		}
		
		// TreeSet implements the SortedSet
		SortedSet<String> ss=new TreeSet<String>();
		ss.add("a");
		ss.add("b");
		ss.add("e");
		ss.add("d");
		ss.add("c");
		System.out.println("SortedSet Elements are:"+ss);
		

	}

}
