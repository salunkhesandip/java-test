package com.inhouse.interviewtest;

import java.util.Scanner;

public class Greetings {

	public static void main(String[] args) {
		System.out.println("Enter a greeting : ");
		String input = null;
		try (Scanner scanner = new Scanner(System.in)) {
			input = scanner.nextLine();
		}
		String output = toUpper(input);
		System.out.println(output);
	}

	protected static String toUpper(String input) {
		return input.toUpperCase();
	}
}
