package unittesting;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.After;
import org.junit.Before;
import org.junit.jupiter.api.Test;

class Cubetest {
	@Before

	public void setUp() throws

	Exception {

	System.out.println("before");
	}
	@Test

	public void checkCube() {

	assertEquals(24, Cube.cube(3));

	}

	@After

	public void tearDown() throws Exception { System.out.println("after");
	}

}
