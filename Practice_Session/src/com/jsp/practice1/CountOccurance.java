package com.jsp.practice1;

public class CountOccurance {

	public static void main(String[] args) {
		String s1="banana";
		while(s1.length()>0) {
			char c=s1.charAt(0);
			String s2=s1.replace(c+"", "");
			int cn=s1.length()-s2.length();
			System.out.print(c+""+cn);
			s1=s2;
		}

	}

}
