import static org.junit.Assert.*;

import org.junit.Test;
public class TestSubtraction {
	Calculation cal=new Calculation();
	@Test
	public void testSubstraction() {
		System.out.println("Test if the subtraction runs correctly");
		assertTrue(cal.Subtraction(3, 4)==-1);
		System.out.println("Correct");
	}
	@Test
	public void testSubtractionZero() {
		System.out.println("Test if the subtraction runs correctly against zeros");
		assertTrue(cal.Subtraction(0, 4)==-4);
		System.out.println("Correct");
	}
	@Test
	public void testSubtractionNegative() {
		System.out.println("Test if the subtraction runs correctly against negative numbers");
		assertTrue(cal.Subtraction(-4.5, 4)==-8.5);
		System.out.println("Correct");
	}
	
}
