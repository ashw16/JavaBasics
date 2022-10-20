package collectionsframework;

import java.util.*;
public class HashMapDemo {

	public static void main(String[] args) {
		HashMap<String,String> hm=new HashMap<String,String>();
		
		hm.put("ashu","B");
		hm.put("varru","A");
		hm.put("ashu","C");
		hm.put("suhu","D");
		
		System.out.println("Name: "+hm.get("ashu"));
		System.out.println(hm);
		System.out.println("------------------");
		
		//using foreach loop
		
		for(String key:hm.keySet())
		{
			System.out.println(key +":"+hm.get(key));
		}
		

	}

}
