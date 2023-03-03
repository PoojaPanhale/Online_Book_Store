package unittesting;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.After;
import org.junit.Before;
import org.junit.jupiter.api.Test;

class EvenTest {
	@Before
public void setup() throws Exception
{
	System.out.println("before");
	}


	@Test
	public void checkEven() {
		assertEquals(false,EvenNumber.evenNumber(17));
	}
	@After
	public void tearDown() throws Exception
	{

		System.out.println("After");
	}

}
