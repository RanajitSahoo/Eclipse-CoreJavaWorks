package com.jsp.RegEx;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Quantifier3 {

	public static void main(String[] args) {
		Pattern p=Pattern.compile("a[0-9]{3}");
		Matcher m=p.matcher("a0005a987ba567b56a34a987");
		while(m.find()) {
			System.out.println(m.start());
			System.out.println(m.end());
			System.out.println(m.group());
		}

	}

}
