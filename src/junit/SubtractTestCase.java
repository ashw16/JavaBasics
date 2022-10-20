package junit;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class SubtractTestCase {

	@Test
	public void test() {
		//fail("Not yet implemented");
		
         System.out.println("@Test Annotation");
		
		CommonPractice obj=new CommonPractice();
		
		int result=obj.sub(10, 5);
		
		Assert.assertEquals(5,result);
	}

}
