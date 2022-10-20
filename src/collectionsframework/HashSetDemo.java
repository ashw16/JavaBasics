package collectionsframework;

import java.util.*;

public class HashSetDemo {

	public static void main(String[] args) {
		
		Set hash=new HashSet();
		hash.add("a");
		hash.add("b");
		hash.add("c");
		
		System.out.println(hash.size());
		
		Iterator itr=hash.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		
		
	}

}
