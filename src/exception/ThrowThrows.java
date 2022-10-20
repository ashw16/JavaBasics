package exception;

import java.io.IOException;

class ThrowExample
{
	void myMethod(int num) throws IOException, ClassNotFoundException
	{
		if(num==1) {
			throw new IOException("IOException occured");
		}
		else
		{
			throw new ClassNotFoundException("ClassNotFoundException occured");
		}
		
	}
}
public class ThrowThrows {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      try
      {
    	  ThrowExample obj=new ThrowExample();
    	  obj.myMethod(1);
      }
      catch(Exception e)
      {
    	  System.out.println(e);
      }
	}

}
