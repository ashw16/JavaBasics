package string;

import java.util.StringJoiner;

public class StringJoinerDemo {

	public static void main(String[] args) {
		
		StringJoiner str=new StringJoiner(",");//passing comma(,) as delimiter
		
		//Adding values to the StringJoiner
		str.add("ashu");
		str.add("ash");
		str.add("varru");
		str.add("sushu");
		System.out.println(str);

		
		// adding prefix and suffix
StringJoiner str1=new StringJoiner(",","[","]");//passing comma(,) as delimiter and square bracket
		
		//Adding values to the StringJoiner
		str1.add("ashu");
		str1.add("ash");
		str1.add("varru");
		str1.add("sushu");
		System.out.println(str1);
		
		
		//adding colon(:)
StringJoiner str2=new StringJoiner(",","[","]");//passing comma(,) as delimiter and square bracket
    //Adding values to the StringJoiner
		str2.add("ashu");
		str2.add("ash");
		
		//creating StringJoiner with :(colon) delimiter
		StringJoiner str3=new StringJoiner(":","#","#");
		str3.add("varru");
		str3.add("sushu");
		
		// merging two StringJoiner
		StringJoiner merge=str2.merge(str3);
		System.out.println(merge);
	}

}
