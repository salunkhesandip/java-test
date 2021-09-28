package com.inhouse.interviewtest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class GreetingsTest {	
	@Test
	@DisplayName("UpperCase Test-1")
	void testUpperCase() {
		String input = "Hello World!";
		String eOut = "HELLO WORLD!";
		
		String out = Greetings.toUpper(input);
	
		//assertEquals(eOut, out);
		Assertions.assertAll(
							()->assertNotNull(out),
							()->assertEquals(eOut, out)
							);
	}
}
