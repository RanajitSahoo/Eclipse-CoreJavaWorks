package com.jsp.Arraysss;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class HotSpotConnect {

	public static void main(String[] args) {
		String s1="* #  * p  * # * *";
		s1=s1.replace(" ", "");
		String s2="";
		Pattern p=Pattern.compile("[*]*p[*]*");
		Matcher m=p.matcher(s1);
		while(m.find())
		{
			s2=m.group();
		}
		System.out.println(s2);
		int i=0;
		int count=0;
		while(i<s2.length()) {
			if(s2.charAt(i)=='*')count++;
			i++;
		}
		System.out.println(count);
	}

}
