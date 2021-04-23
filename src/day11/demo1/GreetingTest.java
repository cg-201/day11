package day11.demo1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

class GreetingTest {
	
	@Test
	public void greetingTest() {
		Greeting greeting = new Greeting();
		
		// Client :: "Good Morning!!"
		String actualOutput = greeting.greet();
		
		// VERIFYING
		assertEquals("Good Morning", actualOutput);
	}
	
	
	@Test
	public void parametrizedGreetingTest() {
		Greeting greeting = new Greeting();
		
		// Client :: Good Morning Mohit!
		String actualOutput = greeting.greet("Mohit");
		
		assertEquals("Good Morning Mohit!", actualOutput);
	}

}
