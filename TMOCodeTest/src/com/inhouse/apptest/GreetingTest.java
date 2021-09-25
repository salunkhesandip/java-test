package com.inhouse.apptest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class GreetingTest {

	@Test
	void toUpper() {
		String input = "Hello World!";
		String expOutput = "HELLO WORLD!";
		String output = Greeting.convertToUpper(input);
		assertEquals(expOutput, output);
	}
}
