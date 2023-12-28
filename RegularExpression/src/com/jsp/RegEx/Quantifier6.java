package com.jsp.RegEx;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Quantifier6 {

	public static void main(String[] args) {
		Pattern p=Pattern.compile("a[0-9]{2,5}");
		Matcher m=p.matcher("a22brrra234ba3456ba345678ba345678");
		while(m.find()) {
			System.out.println(m.start());
			System.out.println(m.end());
			System.out.println(m.group());
		}

	}

}
