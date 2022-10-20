package string;

//StringBuffer is mutable one can change the value of the object

public class StringBufferDemo {

	public static void main(String[] args) {

		StringBuffer obj=new StringBuffer("object Programming");
		//obtaining string length
		System.out.println("length of the string is:"+obj.length());
		
			
		
		//Accessing character in string
		for(int i=0;i<obj.length();i++)
		{
			
			System.out.println("characters at position:"+i+"is:" +obj.charAt(i));
		}
		
		String str=new String(obj.toString()); // convert into simple string
		
		//inserting a string in the middle
		int pos=obj.indexOf("Programming");
		System.out.println("position of string:"+pos);
		
		obj.insert(pos, "oriented");
		System.out.println(obj);
		
		pos=obj.indexOf("Programming");
		obj.insert(pos, "-");
		System.out.println(obj);
		
		obj.append("-concepts");
		System.out.println(obj);
		
		
	}

	

}
