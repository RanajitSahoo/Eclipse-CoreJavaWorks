package com.jsp.String;

import java.util.Scanner;

public class StringWithCharAtMethod {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String s1=s.next();
		System.out.println(s1.length());
		try {
			System.out.println(s1.charAt(4));
		}catch(StringIndexOutOfBoundsException e) {
			System.out.println(e.toString());
			System.out.println(s1.charAt(s1.length()-1));
		}

	}

}
