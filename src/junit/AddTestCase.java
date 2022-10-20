package junit;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class AddTestCase
{
	@Before
	public void method()
	{
		System.out.println("@Before Test method");
	}
	
	
	@After
	public void method2()
	{
		System.out.println("@After Test method");
	}
	
	
	@Test
	public void check()
	{
		System.out.println("@Test Annotation");
		
		CommonPractice obj=new CommonPractice();
		
		int result=obj.add(5, 5);
		
		Assert.assertEquals(10,result);
		
	}

}
