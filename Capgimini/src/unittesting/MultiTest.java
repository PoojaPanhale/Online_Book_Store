package unittesting;

import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertSame;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.After;
import org.junit.Before;
import org.junit.jupiter.api.Test;

class MultiTest {
	@Before
	public void setup() throws Exception
	{
		System.out.println("before");
		}

	@Test
	public void checkEven() {
		assertNotNull(MultiNum.multiNum(9));
	}
	@After
	public void tearDown() throws Exception
	{

		System.out.println("After");
	}
	

}
