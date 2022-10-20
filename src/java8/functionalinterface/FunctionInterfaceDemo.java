package java8.functionalinterface;

// It is a predefined Interface like predicate. it returns some value.It has one abstract method called apply()
import java.util.function.Function;
public class FunctionInterfaceDemo {

	public static void main(String[] args) {
		
		Function<String,Integer> fun=s-> s.length();
		System.out.println(fun.apply("hello"));//5
		
		// Functional chaining
		int amount=3;                
		                         // 6 =   3+3   
		Function<Integer,Integer> sum=i-> i+i;//6
		
		Function<Integer,Integer> sq=i-> i*i;//3*3
		
		System.out.println(sum.apply(amount));//6
		
		System.out.println(sq.apply(amount));//9
		
		//                   3(6)  ->      6(36)           
		System.out.println(sum.andThen(sq).apply(amount));//36
		
		System.out.println(sum.compose(sq).apply(amount));//18
		                //9(18)  <-   3(9)
	}

}
