import static org.junit.Assert.*;

import org.junit.Test;

public class TestCalculation {
	Calculation cal=new Calculation();
	@Test
	public void testAddition() {
		assertTrue(cal.Addition(3, 4)==7);
	}
er


}