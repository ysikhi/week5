package week5;
import static org.junit.Assert.*;

import org.junit.Test;

public class HouseconcostTest {
	Houseconcost t=new Houseconcost();
    
	@Test
	public void testCost() {
		assertEquals(250000.0,t.est(4 , 100, true),0);
		
	}

}
