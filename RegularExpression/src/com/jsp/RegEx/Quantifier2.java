package com.jsp.RegEx;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Quantifier2 {

	public static void main(String[] args) {
		Pattern p=Pattern.compile("a{3}");
		Matcher m=p.matcher("aaaabaaabaaaa");
		while(m.find()) {
			System.out.println(m.start());
			System.out.println(m.end());
			System.out.println(m.group());
		}

	}

}
