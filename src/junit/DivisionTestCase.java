package junit;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class DivisionTestCase {

	@Test
	public void test() {
		//fail("Not yet implemented");
System.out.println("@Test Annotation");
		
		CommonPractice obj=new CommonPractice();
		
		int result=obj.div(25, 5);
		
		Assert.assertEquals(5,result);
	}

}
