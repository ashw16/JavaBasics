package exception;


public class Throw 
{

	public static void checkNum(int num)
		{
			if(num<1)
			{
				throw new ArithmeticException("Number is negative cannot calculate square");
			}
			else
			{
				System.out.println("square of "+num+"is:"+num);
			}
		}
      public static void main(String[] args)
      {
    	  Throw obj=new Throw();
    	  obj.checkNum(-2);
      }
	}


