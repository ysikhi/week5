package week5;

import static org.junit.Assert.*;

import org.junit.Test;

public class interestTest {
	 private static final double DELTA = 1e-15;
	    interest t=new interest();
	    
	  @Test
	  public void testSimple() {
	    assertEquals(60.0,t.simple(1000.0,2.0,3.0),DELTA);
	  }

	  @Test
	  
	  public void testCompound() {
	    assertEquals(1333.099243,t.compound(1200.0,5.4,2.0),DELTA);
	  }

}
