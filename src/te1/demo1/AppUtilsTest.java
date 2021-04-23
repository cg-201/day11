package te1.demo1;

import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

class AppUtilsTest {
	private AppUtils app;
	
	@BeforeEach
	public void init() {
		app = new AppUtils();
	}
	
	@AfterEach
	public void destroy() {
		app = null;
	}

	@Test
	@DisplayName("Welcome Greeting Test!")
	public void greetingTest() {
		assertEquals("helloworld", app.greetings(), ()-> "This must return hello world!!");
	}
	

	@Test
	@DisplayName("Parametrized Greeting Test!")
	public void greetingParamTest() {
		assertEquals("hello rohit", app.greetings("rohit"), ()-> "This must return hello rohit!!");
	}
	
	
	@Test
	@DisplayName("Divide test with Zero!!")
	public void divideTest() {
		assertThrows(ArithmeticException.class, () -> app.divide(12, 0), ()-> "Must throw arithmetic exception!");
	}
	
	@Test
	@RepeatedTest(value = 5)
	public void validateMobileLength() {
		assertTrue(() -> app.validateMobileNumber("1234567891"), ()-> "String length must be equal to 10.");
	}
	
	@ParameterizedTest
	@ValueSource(strings = {"1234567891", "1234567891"})
	public void validateMobileNumber(String mobile) {
		assertTrue(() -> app.validateMobileNumber(mobile)  );
	}
	
	@ParameterizedTest
	@CsvSource(value = {"1234567891", "1234567891"})
	public void validateMobileNumberV1(String mobile) {
		assertTrue(() -> app.validateMobileNumber(mobile)  );
	}
	
	
	@Test
	@DisplayName("Multiple add test!")
	public void multipleAddTest() {
		assertAll(
					() -> assertEquals(5, app.add(3, 2), "The sum must be 5."),
					() -> assertEquals(5, app.add(3, 2), "The sum must be 5."),
					() -> assertEquals(5, app.add(3, 2), "The sum must be 5.")
				);
	}
	
	@Test
	public void cipherTest() {
		assertEquals("bcd", app.cipherText("abc"));
	}
	
	@Nested
	class MathUtils{
		
		@Test
		public void addPostiveTest() {
			assertEquals(5, app.add(3, 2), "The sum must be 5.");
		}
		
		@Test
		public void addNegativeTest() {
			assertEquals(-5, app.add(-2, -3), "The sum must be -5.");
		}
	}
}
