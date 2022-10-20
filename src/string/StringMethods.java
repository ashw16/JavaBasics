package string;

public class StringMethods {

	public static void main(String[] args) {
		
		// charAt index()
		String x="ashwini";
		System.out.println(x.charAt(5)); //n
		
		// String concat()
		String x1="hello";
		System.out.println(x1.concat("world")); //helloworld
		
		//boolean equals(==)
		String s1="hello";
		String s2="hello";
		String s3="ashu";
		System.out.println(s1.equals(s2));//true
		System.out.println(s2.equals(s3));//false
		
		// boolean equalsIgnoreCase()
		String x2="Exit";
		System.out.println(x2.equalsIgnoreCase("EXIT"));//true
		System.out.println(x2.equalsIgnoreCase("tixe"));//false
		
		//int length()
		String x3="012345678";
		System.out.println(x3.length());//9
		
		//replace(char old,char new)
		String x4="ococococ";
		System.out.println(x4.replace('c','x'));//oxoxoxox
		
		//toLowerCase()
		String x5="ASHWINI";
		System.out.println(x5.toLowerCase());//ashwini
		
		//toUpperCase()
		String x6="india";
		System.out.println(x6.toUpperCase());//INDIA
		
		//trim()
		String x7="hi";
		System.out.println(x7.trim()+"hello");//hihello
		
		//boolean endsWith(String suffix)
		String x8="Foobar";
		System.out.println(x8.endsWith("bar"));//true
		
		//boolean startsWith(String prefix)
		String x9="Foobar";
		System.out.println(x9.startsWith("Foo"));//true
		
		//substring(int begin,int end)
		String x10="0123456789";
		System.out.println(x10.substring(5));//56789
		System.out.println(x10.substring(5,9));//5678
		
		//indexOf(int ch)
		String x11="sun is shining brightly";
		System.out.println(x11.indexOf('h')); //8
		
		//lastIndexOf(int ch)
		String x12="sun is shining brightly";
		System.out.println(x12.lastIndexOf('t'));//20
		
	}

}
