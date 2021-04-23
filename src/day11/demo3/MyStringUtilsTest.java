package day11.demo3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


@DisplayName("String utils testing .")
public class MyStringUtilsTest {

	@Test
	@DisplayName("while ciphering the string.")
	public void ciphrTest() {
		MyStringUtils utils = new MyStringUtils();
		
		// abc 
		// Client Expecation :: bcd
		String output = utils.cipherShiftByOne("abc");
		
		assertEquals("bcd", output, "The client expectation is bcd");
	}
	
	
	@Test
	@DisplayName("while ciphering the string.")
	@Disabled
	public void ciphrTestV1() {
		MyStringUtils utils = new MyStringUtils();
		
		// xyz
		// Client Expecation :: yza
		String output = utils.cipherShiftByOne("xyz");
		
		assertEquals("yza", output, "The client expectation is bcd");
	}
	
	
	@Test
	@DisplayName("while validating mobile number length!")
	public void mobileLengthTest() {
		MyStringUtils utils = new MyStringUtils();
		
		assertTrue(() -> utils.validateMobileNumberLength("1234567891"), "The client is expecting true for this mobile number!!");
	}

}
