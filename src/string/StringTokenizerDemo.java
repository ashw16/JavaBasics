package string;

import java.util.StringTokenizer;

public class StringTokenizerDemo {

	public static void main(String[] args) {
		
		StringTokenizer str=new StringTokenizer("Hello, Welcome to hyderabad");
		while(str.hasMoreTokens())
		{
			System.out.println(str.nextToken());
		}

		System.out.println("using constructor 2-");
		StringTokenizer str1=new StringTokenizer("JAVA:Code:String",":");
		 while(str1.hasMoreTokens())
		 {
			 System.out.println(str1.nextToken());
		 }
		
		 System.out.println("using constructor 3-");
			StringTokenizer str2=new StringTokenizer("JAVA:Code:String",":",true);
			 while(str2.hasMoreTokens())
			 {
				 System.out.println(str2.nextToken());
			 }
			
	}

}
