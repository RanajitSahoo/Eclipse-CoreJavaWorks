package com.jsp.RegEx;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Prac3 {
	public static void main(String[] args) {
		Pattern p=Pattern.compile("b[au]t");
		Matcher m=p.matcher("butbautbat");
		while(m.find()) {
			System.out.println(m.start());
			System.out.println(m.end());
			System.out.println(m.group());
		}
	}
}
