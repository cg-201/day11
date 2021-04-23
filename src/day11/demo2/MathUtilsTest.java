package day11.demo2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Testing MathUtils ")
public class MathUtilsTest {

	@Test
	@DisplayName("Addition testing for MathUtils")
	public void additionTest() {
		MathUtils maths = new MathUtils();
		
		// Client Expectation : 30
		int actualOutput = maths.addition(10, 20);
		
		// verify
		assertEquals(30, actualOutput);
	}
	
	
	@Test
	@DisplayName("Subtration testing for MathUtils")
	public void subtractionTest() {
		MathUtils maths = new MathUtils();
		
		// CLIENT :: 5
		int output = maths.subtraction(10, 5);
		
		assertEquals(5, output, "Client expectation is 5");
	}
	
	
	@Test
	@DisplayName("Negation Testing for Division")
	public void divideTest() {
		MathUtils maths = new MathUtils();
		
		// CLIENT Expectatation :: ArithmeticException
		assertThrows(ArithmeticException.class, () -> maths.divide(10, 0));
	}

}






