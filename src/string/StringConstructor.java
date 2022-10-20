package string;

public class StringConstructor {

	public static void main(String[] args) {
		// string initialized by an array
		char chars[]= {'h','e','l','l','o'};
		String s=new String(chars);
		System.out.println(s);
		
		// string constructors initialized by a subrange of a character
		char chars1[]= {'h','e','l','l','o','j','a','v','a','!'};
		String s2=new String(chars1,2,5);
		System.out.println(s2);
		
		// string object that contains the same char sequence of another string object
		
		char chars2[]={'h','e','l','l','o','j','a','v','a','!'};
		String s3=new String(chars2);
		System.out.println(s3);
		String s4=new String(s3);
		System.out.println(s4);
		
		//string constructor by byte
		byte ascChars[]= {65,66,67,68,69,70};
		String s5=new String(ascChars);
		System.out.println(s5);
		String s6=new String(ascChars,2,3);
		System.out.println(s6);
		
		
		
	}

}
