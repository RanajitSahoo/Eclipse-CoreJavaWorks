package com.jsp.String;

public class CountOccuranceOfString {

	public static void main(String[] args) {
		String s="Ranajit";
		while(s.length()>0) {
			char c=s.charAt(0);
			String s1=s.replace(c+"", "");
			int cn=s.length()-s1.length();
			System.out.print(c+""+cn);
			s=s1;
		}
		
	}

}
