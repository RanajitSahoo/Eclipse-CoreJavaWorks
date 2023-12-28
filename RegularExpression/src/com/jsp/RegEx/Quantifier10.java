package com.jsp.RegEx;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Quantifier10 {

	public static void main(String[] args) {
		Pattern p=Pattern.compile("[abC]+");
		Matcher m=p.matcher("abaaaCazabbbaaaabbb");
		while(m.find()) {
			System.out.println(m.start());
			System.out.println(m.end());
			System.out.println(m.group());
		}

	}

}
