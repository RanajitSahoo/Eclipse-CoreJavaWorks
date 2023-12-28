package com.jsp.RegEx;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailValidation {
	public static void main(String[] args) {
		String s1="raja123angul@gmail.com";
		Pattern p=Pattern.compile("[a-z]+([a-z 0-9]){3,}@([a-z]){3,10}[.]([a-z]){2,3}");
		Matcher m=p.matcher(s1);
		if(m.matches())System.out.println("Valid");
		else System.out.println("invalid");
	}
}
