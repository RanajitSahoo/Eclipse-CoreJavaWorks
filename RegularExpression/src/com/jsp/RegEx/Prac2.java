package com.jsp.RegEx;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Prac2 {

	public static void main(String[] args) {
		Pattern p=Pattern.compile("an");
		Matcher m=p.matcher("banana");
		while(m.find()) {
			System.out.println(m.start());
			System.out.println(m.end());
			System.out.println(m.group());
			System.out.println("------");
			
		}

	}

}
