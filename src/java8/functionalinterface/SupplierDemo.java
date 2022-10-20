package java8.functionalinterface;

//It takes no arguments. It returns some value. It has one abstract method called get().

import java.util.function.Supplier;
public class SupplierDemo {

	public static void main(String[] args) {
		
		Supplier<Double> sup=()-> Math.random();
		System.out.println(sup.get());

	}

}
