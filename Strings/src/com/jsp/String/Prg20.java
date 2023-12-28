package com.jsp.String;

public class Prg20 {

	public static void main(String[] args) {
		String s1="care";
		String s2="race";
		if(check(s1,s2))System.out.println("Anagram");
		else System.out.println("not anagram");

	}
	
	public static boolean check(String s1,String s2) {
		s1=s1.toLowerCase();
		s2=s2.toLowerCase();
		while(s1.length()>0) {
			char c=s1.charAt(0);
			if(s1.length()!=s2.length()) return false;
			s1=s1.replace(c+"", "");
			s2=s2.replace(c+"", "");
			if(s1.length()==0&&s2.length()==0) return true;
		}
		return false;
	}

}
