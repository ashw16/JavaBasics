package collectionsframework;

import java.util.*;
public class MyLinkedList {

	public static void main(String[] args) {
		LinkedList li=new LinkedList();
		li.add(new String("one"));
		li.add(new String("two"));
		li.add(new String("three"));
		
		System.out.println(li.get(0));
		System.out.println(li.get(1));
		System.out.println(li.get(2));
	}

}
