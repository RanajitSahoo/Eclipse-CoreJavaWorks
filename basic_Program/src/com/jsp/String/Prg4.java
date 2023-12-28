package com.jsp.String;

public class Prg4 {

	public static void main(String[] args) {
		String s1="listen";
		String s2="silent";
		System.out.println(anagram(s1, s2));

	}
	public static boolean anagram(String s1,String s2) {
		while(s1.length()==s2.length()) {
			char c=s1.charAt(0);
			if(s1.length()!=s2.length()) return false;
			s1=s1.replace(c+"", "");
			s2=s2.replace(c+"", "");
			if(s1.length()==0&&s2.length()==0) return true;
		}
		return false;
	}

}
