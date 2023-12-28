package com.jsp.RegEx;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Practice {

	public static void main(String[] args) {
		Pattern p=Pattern.compile("a");
		Matcher m=p.matcher("banana");
		System.out.println(m.find());
		System.out.println(m.find());
		System.out.println(m.find());
		System.out.println(m.find());
	}

}
