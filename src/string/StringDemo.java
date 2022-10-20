package string;

public class StringDemo {

	public static void main(String[] args)
	{
		
		String s1="java"; // creating string by java string literal
		String s4="java";//doesn't create a new instance string constant pool
		char ch[]= {'s','t','r','i','n','g'};
		String s2=new String(ch); //converting char array to string
		String s3=new String("example");//creating java string by new keyword
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		
		
	}

}
