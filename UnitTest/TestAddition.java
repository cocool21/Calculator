import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.FixMethodOrder;
import org.junit.runners.MethodSorters;
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class TestAddition {
	Calculation cal=new Calculation();
	@Test
	public void testAddition() {
		System.out.println("Test if the addition runs correctly");
		assertTrue(cal.Addition(3, 4)==7);
		System.out.println("Correct");
	}
	@Test
	public void testAdditionZero() {
		System.out.println("Test if the addition runs correctly against zeros");
		assertTrue(cal.Addition(0, 4)==4);
		System.out.println("Correct");
	}
	@Test
	public void testAdditionNegative() {
		System.out.println("Test of the addition runs correctly against negative numbers");
		assertTrue(cal.Addition(-4.5, 4)==-0.5);
		System.out.println("Correct");
	}
	
	
	
}