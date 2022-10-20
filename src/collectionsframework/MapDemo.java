package collectionsframework;

import java.util.*;
import java.util.Map.Entry;
import java.util.concurrent.ConcurrentHashMap;
public class MapDemo {

	public static void main(String[] args) {
		
		//Map<String,Integer> map=new HashMap<String,Integer>();
		
		 // Map<String,Integer> map=new LinkedHashMap<String,Integer>();// to set the order
		
		//Map<String,Integer> map=new TreeMap<String,Integer>();
		
	//Map<String,Integer> map=new Hashtable<String,Integer>();
		// Hashtable is synchronized which does not accept null
	
	ConcurrentHashMap<String,Integer> map=new ConcurrentHashMap<String,Integer>();
	
		map.put("hp",101);
		map.put("lenovo",102);
		map.put("dell",103);
		map.put("apple",104);
		//map.put(null,105);
		                               
		System.out.println(map);
		
   System.out.println(map.get(101));
   System.out.println(map.keySet());
   System.out.println(map.values());
   
   System.out.println("----------------------------");
   /*
  // Iterator method first we have to convert map into set and then use Iterator 
 Set set=map.entrySet();
 
 Iterator itr=set.iterator();
 while(itr.hasNext())
 {
	 //System.out.println(itr.next());
	 Map.Entry<String,Integer> me=  (Map.Entry) itr.next();
	 System.out.println(me.getKey()+" =  "+me.getValue());
 } 
 */
   for(Map.Entry<String,Integer> me:map.entrySet())
   {
	   System.out.println(me.getKey()+"  =  "+me.getValue());
	   map.put("apple",104);
   }
	}

}
