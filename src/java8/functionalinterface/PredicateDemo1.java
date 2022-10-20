package java8.functionalinterface;

import java.util.function.*;


public class PredicateDemo1 
{
 
	public boolean test(Integer age)
	{
		if(age>18)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	public static void main(String[] args) 
	{
		

		Predicate<Integer> p=age->(age>18);
		System.out.println(p.test(21));//true
		System.out.println(p.test(17));//false
		System.out.println(p.test(23));//true
	}

}
