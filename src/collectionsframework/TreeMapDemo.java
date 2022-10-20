package collectionsframework;

import java.util.*;
public class TreeMapDemo {

	public static void main(String[] args) {
		
		TreeMap tm=new TreeMap();
		tm.put("name","jody");
		tm.put("id", new Integer(1001));
		tm.put("address", new String("manila"));
		
		Collection values=tm.values();
		
		Iterator it=values.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
	}

}
