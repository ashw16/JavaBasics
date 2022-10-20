package exception;

public class Throws {
    
	public static int  divideNum(int m,int n) throws ArithmeticException
	{
		int div=m/n;
	return div;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Throws obj=new Throws();
     try {
     obj.divideNum(45,0);
	}
catch(ArithmeticException e)
     {
	System.out.println("Number cannot be divide by zero");
     }
}
}
