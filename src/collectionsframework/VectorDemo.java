 package collectionsframework;

import java.util.Vector;

public class VectorDemo {

	public static void main(String[] args) {
		
		Vector<String> vc=new Vector<String>();
		vc.add("Vector object 1");
		vc.add("Vector object 2");
		vc.add("Vector object 3");
		vc.add("Vector object 4");
		vc.add("Vector object 5");
		
		//add vector element at index
		vc.add(3,"Element at fix position");
		
		System.out.println(vc);
		
		vc.size();// inform number of elements in vector
		System.out.println("vector Size:"+vc.size());
		
	}

}
