package com.jsp.RegEx;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Prac5 {

	public static void main(String[] args) {
		Pattern p=Pattern.compile("[ab][01]");
		Matcher m=p.matcher("a1a2aa1aa8aba0b1b3bb4bb0ab1a0b1");
		while(m.find()) {
			System.out.println(m.start());
			System.out.println(m.end());
			System.out.println(m.group());
		}

	}

}
