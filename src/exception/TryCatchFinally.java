package exception;

public class TryCatchFinally {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         int a=10,b=0,c;
         //int c=a/b;
         System.out.println(c=a+b);
         try
         {
        	 System.out.println("This is try block");
         }
         catch(ArithmeticException e)
         {
        	 System.out.println("This is catch block");
         }
         finally {
        	 System.out.println("This is finally block");
         }
    //System.out.println(c);     
	}

}
