package com.jsp.RegEx;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Quantifier8 {

	public static void main(String[] args) {
		Pattern p=Pattern.compile("ab*c");
		Matcher m=p.matcher("ababcabbacabbccabbbbcac");
		while(m.find()) {
			System.out.println(m.start());
			System.out.println(m.end());
			System.out.println(m.group());
		}

	}

}
