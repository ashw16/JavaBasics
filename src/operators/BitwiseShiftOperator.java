package operators;

public class BitwiseShiftOperator {
	public static void main(String[] args) {
		int x=10,y=-10;
		System.out.println(x<<2); // right shift
		System.out.println(x>>2);// left shift
		System.out.println(x>>>2); // zero fill right shift
		
		System.out.println(y<<2);
		System.out.println(y>>2);
		System.out.println(y>>>2);
		
	}

}
 
