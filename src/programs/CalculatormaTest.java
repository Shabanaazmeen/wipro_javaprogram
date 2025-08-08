package programs;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatormaTest {

	@Test
	public void testAdd() {
		calculator c1=new calaulator();
		assertEquals(5,c1.add(5,3));
		
	}

	@Test
	public void testSub() {
		calculator c2=new calaulator();
		assertEquals(5,c1.sub(5,3));
		
		
		fail("Not yet implemented");
	}

}
