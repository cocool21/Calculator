import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class TestDivision {
	Calculation cal=new Calculation();
	@Test
	public void testDivision() {
		System.out.println("Test if the division runs correctly");
		assertTrue(cal.Division(2, 4)==0.5);
		System.out.println("Correct");
	}
	@Test
	public void testDivisionZero() {
		System.out.println("Test if the division runs correctly against zeros");
		assertTrue(cal.Division(0, 4)==0);
		System.out.println("Correct");
	}
	@Test
	public void testDivisionNegative() {
		System.out.println("Test if the division runs correctly against negative numbers");
		assertTrue(cal.Division(-4, 4)==-1);
		System.out.println("Correct");
		}
}
