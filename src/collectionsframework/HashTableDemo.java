package collectionsframework;

import java.util.*;

//Map implements Hashtable

public class HashTableDemo {

	public static void main(String[] args) {
		
		Hashtable ht=new Hashtable();
		ht.put("name","jody");
		ht.put("id", new Integer(1001));
		ht.put("address", new String("manila"));
		
		System.out.println("Table of contenets:"+ht);

	}

}
