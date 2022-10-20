package exception;

class  MyOwnException extends Exception
{
	 public MyOwnException(String message) 
	 {
		   super(message);
	 }
}
public class UserDefinedException
{
	 public void checkAge(int age) throws MyOwnException// Here i am declaring the exception using throws
	 {
		     if(age>=18)
		     {
		    	    System.out.println("You are eligible for Voting   ");
		     }
		     else
		     {
		    	 MyOwnException obj = new MyOwnException("You are not eligible for vote  ");
		    	 throw obj;
		     }
	 }

	public static void main(String[] args)
	{
		UserDefinedException obj = new UserDefinedException();
		try 
		{
			obj.checkAge(2);
		} 
		catch (MyOwnException e) 
		{
			
			 System.out.println("Main method "+e);
		}

	}

}


