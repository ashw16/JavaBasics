package java8.functionalinterface;

//It is a functional Interface which represents a prdicate(boolean-valued function) of one argument.contaions a test() functional method


import java.util.function.*;

public class PredicateDemo {

	public static void main(String[] args) {
     
		int score[]= {1,2,3,4,5,6,7,8,9,10};
		Predicate<Integer> p=x->x%2==0;
		
		Predicate<Integer> grt=y->y>5;
		for(int i=0;i<score.length;i++)
		{
			if(p.and(grt).test(score[i]))
			{
				System.out.println(score[i]);
			}
		}

	}

}
