package com.inhouse.apptest;

import java.util.Scanner;

public class Greeting {

	public static void main(String[] args) {
		String input = null;
		try (Scanner scanner = new Scanner(System.in)) {
			input = scanner.nextLine();
		}
		String output = convertToUpper(input);
		System.out.println(output);
	}

	protected static String convertToUpper(String input) {
			return input.toUpperCase();
		}
}
