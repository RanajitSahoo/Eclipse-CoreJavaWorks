package com.jsp.RegEx;

public class Prac6 {

	public static void main(String[] args) {
		String s1="as1g4j8dg4hs6";
		String s2=s1.replaceAll("[a-z][0-9]", "");
		System.out.println(s2);

	}

}
