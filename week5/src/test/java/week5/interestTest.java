package week5;

import static org.junit.Assert.*;

import org.junit.Test;

public class interestTest {
    interest t=new interest();
	@Test
	public void testSimple() {
		assertEquals(1.0,t.simple(10,10,1),0);
	}

	@Test
	public void testCompound() {
		assertEquals(20.0,t.compound(10.0, 100.0, 1.0),0);
	}

}
