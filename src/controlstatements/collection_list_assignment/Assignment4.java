package collection_list_assignment;
/*
Create an ArrayList which will be able to store only numbers
like int,float,double,etc, but not any other data type.
*/

import java.util.*;

class MyArrayList<E> extends ArrayList<E> 
{
	public boolean add(E e)
	{
		if(e instanceof Integer || e instanceof Float || e instanceof Double)
		{
			super.add(e);
			return true;
		}else {
			throw new ClassCastException("only Intege, Float, Double are supported");
		}
	}
}

public class Assignment4

{
public static void main(String[] args)
	{
	
	   List<Object> list=new MyArrayList<>();
	  
	   list.add(100);
	   list.add(100.0F);
	   list.add(3.14D);
	  // list.add("asd");
	   System.out.println(list);
	   
	
	
	
//		List<Integer> li=new ArrayList<Integer>();
//		List<Float> li=new ArrayList<Float>();
//		List<Double> li=new ArrayList<Double>();
//		
//		li.add(100);
//		li1.add(100.0f);
//		li2.add(1000d);
//		System.out.println(li+""+li1+""+li2);
		//System.out.println(li1);
		//System.out.println(li2);
		
	}

}