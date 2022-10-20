package java8.functionalinterface;

//It accepts one argument and it returns no result. It has one abstract method called accept()

import java.util.function.Consumer;

public class ConsumerDemo {

	public static void main(String[] args) {
		
		Consumer<String> con1=s-> System.out.println(s);
		con1.accept("Hello World");
		
		//Consumer Chaining
		Consumer<String> con=s1-> System.out.println(s1.toUpperCase());
		Consumer<String> con2=s1-> System.out.println("("+s1+")");
		
		con.andThen(con2).accept("welcome to hyderabad");
	}

}
