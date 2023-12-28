package com.jsp.RegEx;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Quantifier5 {

	public static void main(String[] args) {
		Pattern p=Pattern.compile("a{2,}");
		Matcher m=p.matcher("abaabaaaaaa,aaaaaaa,aaa,aaaa,aaaaaa");
		while(m.find()) {
			System.out.println(m.start());
			System.out.println(m.end());
			System.out.println(m.group());
		}

	}

}
