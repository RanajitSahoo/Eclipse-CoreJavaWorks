package com.jsp.RegEx;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Prac4 {

	public static void main(String[] args) {
		Pattern p=Pattern.compile("a.b");
		Matcher m=p.matcher("a1basdgbaxba%bahfnbb&aabbabbbab");
		
		while(m.find()) {
			System.out.println(m.start());
			System.out.println(m.end());
			System.out.println(m.group());
		}
	}

}
