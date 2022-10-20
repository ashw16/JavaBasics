package junit;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class MultiplicationTestCase {

	@Test
	public void test() {
		//fail("Not yet implemented");
		
System.out.println("@Test Annotation");
		
		CommonPractice obj=new CommonPractice();
		
		int result=obj.mul(5, 5);
		
		Assert.assertEquals(25,result);
	}

}
