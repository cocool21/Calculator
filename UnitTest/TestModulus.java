import static org.junit.Assert.*;

import org.junit.Test;
public class TestModulus {
	Calculation cal=new Calculation();

	@Test
	public void testModulus() {
		System.out.println("Test if the modulus runs correctly");
		assertTrue(cal.Modulus(2, 4)==2);
		System.out.println("Correct");
	}
	@Test
	public void testModulusZero() {
		System.out.println("Test if the modulus runs correctly against zeros");
		assertTrue(cal.Modulus(0, 4)==0);
		System.out.println("Correct");
	}
	@Test
	public void testModulusNegative() {
		System.out.println("Test if the modulus runs correctly against negative numbers");
		assertTrue(cal.Modulus(-4, 4)==0);
		System.out.println("Correct");
		}
}
