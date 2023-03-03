package unittesting;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import junit.framework.TestCase;

class CounterTest extends TestCase{
public CounterTest()
{
	}
protected void setup()
{// create a (simple ) test fixture
	// counter1 =new Counter();
	}
@Test
public void testlncrement()
{
	assertTrue(Counter.increment()==1);
//	assertTrue(Counter.increment()==2);
	}

	@Test
	
	public void testDecrement()
	{
		assertFalse(Counter.decrement()==-1);
	//	assertTrue(Counter.increment()==-2);
		}
}
