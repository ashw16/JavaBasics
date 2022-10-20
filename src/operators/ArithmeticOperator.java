package operators;

public class ArithmeticOperator {

	public static void main(String[] args) {
		/*
		int a=20;
		int b=10;
		//int c=a+b;
		System.out.println("sum is:"+(a+b));
		System.out.println("sub  is:"+(a-b));
		System.out.println("mul  is:"+(a*b));
		System.out.println("div  is:"+(a/b));
		System.out.println("mod  is:"+(a%b));
		System.out.println("inc  is:"+(a++));
		System.out.println("dec  is:"+(a--));
		
		
		int a=10,b=5,c=2;
		int d=a*b/c;
		int e=a/b*c;
		System.out.println(d); //25
		System.out.println(e);//4
		*/
		int a=10,b=5,c=3,d=2;
		
		int f=(b*(a/b+a/b));
		int g=(b*a/b+b*a/b);
		int e=((a+b)*c)/(c-d)%b;
		int h=a+b*c/d-d%a;
		int i=a-b%c*d+(a/b);
		int j=a-b%c*d+(a/b);
		
		System.out.println(f); //20
		System.out.println(g); //20
		System.out.println(e); //0
		System.out.println(h); // 15
		System.out.println(i);// 10 (int a=9,b=6,c=2,d=4;)
		System.out.println(j);// 8
		
		
		
	}
	
	
	
}
