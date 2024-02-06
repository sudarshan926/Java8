package com.java8.in;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		String s1 = "debit card";
		String s2 = "bad credit";

		char[] c = s1.toCharArray();
		char[] c2 = s2.toCharArray();
		Arrays.sort(c);
		Arrays.sort(c2);

	   String str = String.valueOf(c);
		String str2 = String.valueOf(c2);

		if (str.equals(str2)) {
			System.out.println(s1 + " Is Anagram Number");
		} else {
			System.out.println(s1 + " Is  not Anagram Number");
		}
	}
}
