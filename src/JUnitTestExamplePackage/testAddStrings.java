package JUnitTestExamplePackage;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class testAddStrings {

	@Test
	void test() 
	{
		//fail("Not yet implemented");
		jUnitTesting obj = new jUnitTesting();
		String result = obj.addStrings("capstone", "project");
		assertEquals("capstoneproject", result);
	}

}
