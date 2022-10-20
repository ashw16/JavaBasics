package collection_list_assignment;
/*
Create an ArrayList which will be able to store only Strings.
Create a printAll method which will print all the elements
using an Iterator.*/

import java.util.*;
public class Assignment3 {

	public static void main(String[] args)
	{
		ArrayList<String> list=new ArrayList<String>();
		
		list.add("rose");
		list.add("lilly");
		list.add("jasmine");
		
		printAll(list);
	}
	public static void printAll(List<String> list) 
	{
		Iterator<String> itr=list.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}

}

}
