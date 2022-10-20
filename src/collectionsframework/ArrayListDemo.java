package collectionsframework;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		
		ArrayList li=new ArrayList();
		
		li.add(new String("one"));
		li.add(new String("two"));
		li.add(new String("three"));
		
		System.out.println(li.get(0));
		System.out.println(li.get(1));
		System.out.println(li.get(2));
	}

}
