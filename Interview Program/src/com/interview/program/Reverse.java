package com.interview.program;

public class Reverse {

	public static void main(String[] args) {
		String name = "Tamilvelan";
		String jaga = "";
		for (int i = name.length() - 1; i >= 0; i--) {

			jaga = jaga + name.charAt(i);

		}
		System.out.println(jaga);
	}
}
