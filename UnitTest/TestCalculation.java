import static org.junit.Assert.*;

import org.junit.Test;

public class TestCalculation {
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