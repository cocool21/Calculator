import static org.junit.Assert.*;

import org.junit.Test;
public class TestMultiplication {
	Calculation cal=new Calculation();
	@Test
	public void testMultiplication() {
		System.out.println("Test if the multiplication runs correctly");
		assertTrue(cal.Multiplication(3, 4)==12);
		System.out.println("Correct");
	}
	@Test
	public void testMultiplicationZero() {
		System.out.println("Test if the multiplication runs correctly against zeros");
		assertTrue(cal.Multiplication(0, 4)==0);
		System.out.println("Correct");
	}
	@Test
	public void testMultiplicationNegative() {
		System.out.println("Test if the multiplication runs correctly against negative numbers");
		assertTrue(cal.Multiplication(-4.5, 4)==-18);
		System.out.println("Correct");
	}
}
