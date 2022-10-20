package java8.functionalinterface;

//predicate has 3 default methods and(Predicate p), or(Predicate p), negate()
import java.util.function.Predicate;

public class PredicateEvenNumbers {

	public static void main(String[] args) {
		
		int[] num= {1,2,3,4,5,6,7,8,9,10};
		
		Predicate<Integer> even=x->x%2==0;
		
		Predicate<Integer> grt=y->y>5;
		
		//For euality predicate interface has isEqual(Object o) method which is static.
		Predicate<String> name=Predicate.isEqual("Hyd");
		System.out.println(name.test("Hyd"));
		
		for(int i:num)
		{
			if(grt.or(even).test(i))
			{
				
				System.out.println(i);
			}
		}
 
	}

}
