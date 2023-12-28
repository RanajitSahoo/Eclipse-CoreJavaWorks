package com.jsp.RegEx;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PasswordValidator {

	public static void main(String[] args) {
		String s1="rR6@333";
		Pattern p=Pattern.compile("(?=.*[~!@#$%^&*])(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9]).{6,}");
		Matcher m=p.matcher(s1);
		if(m.matches())System.out.println("Valid");
		else System.out.println("invalid");
//		String s2="abcQ12e";
//		Pattern p1=Pattern.compile("(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9]).{6,}");
//		Matcher m2=p.matcher("aA1234a");
//		if(m2.matches())System.out.println("valis");
//		else System.out.println("inValid");
		
		
	}

}
