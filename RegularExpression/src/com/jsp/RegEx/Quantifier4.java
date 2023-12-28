package com.jsp.RegEx;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Quantifier4 {

	public static void main(String[] args) {
		Pattern p=Pattern.compile("a[0-9]{2,4}");
		Matcher m=p.matcher("a22a345a345a90909a344332a232313a7686a2");
		while(m.find()) {
			System.out.println(m.start());
			System.out.println(m.end());
			System.out.println(m.group());
		}

	}

}
