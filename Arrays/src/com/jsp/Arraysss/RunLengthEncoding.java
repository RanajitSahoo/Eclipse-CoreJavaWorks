package com.jsp.Arraysss;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RunLengthEncoding {

	public static void main(String[] args) {
		String s1="AAAAAAAAAAAAABBCCCCDD";
		Pattern p=Pattern.compile("([A-Z])\\1{0,8}");
		Matcher m=p.matcher(s1);
		String s2="";
		while(m.find()) {
			String temp=m.group();
			
			s2+=temp.length()+temp.substring(0,1);
		}
		System.out.println(s2);
	}

}
