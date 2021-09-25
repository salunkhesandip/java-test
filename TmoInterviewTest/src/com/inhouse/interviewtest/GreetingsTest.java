package com.inhouse.interviewtest;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class GreetingsTest {

	@Test
	@DisplayName("UpperCase Test-1")
	void testUpperCase() {
		String input = "Hello World!";
		String eOutput = "HELLO WORLD!";
		String output = Greetings.toUpper(input);
		assertEquals(eOutput, output);
	}

}
