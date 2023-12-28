package com.jsp.RegEx;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringLetterCunt {

	public static void main(String[] args) {
		Pattern p=Pattern.compile("([a-z])\\1*");
		Matcher m=p.matcher("success");
		String s1="";
		while(m.find()) {
			String t=m.group();
			System.out.println(t);
			s1 +=t.length()+t.substring(0,1);
		}
		System.out.println(s1);

	}

}
