package JUnitTestExamplePackage;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class testAddNumbers {

	@Test
	void test()
	{
		//fail("Not yet implemented");
		jUnitTesting junit = new jUnitTesting();
		int result = junit.addNumbers(100, 200);
		assertEquals(300, result);
		
	}

}
