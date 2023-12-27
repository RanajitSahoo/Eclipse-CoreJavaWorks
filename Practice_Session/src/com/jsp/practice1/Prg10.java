package com.jsp.practice1;

public class Prg10 {

	public static void main(String[] args) {
		String s1="race";
		String s2="care";
		if(isAnagram(s1,s2))System.out.println("anagram");
		else System.out.println("not anagram");
	}
	public static boolean isAnagram(String s1,String s2) {
		s1=s1.toLowerCase();
		s2=s2.toLowerCase();
		while(s1.length()==s2.length()) {
			char c=s1.charAt(0);
			s1=s1.replace(c+"", "");
			s2=s2.replace(c+"", "");
			if(s1.length()==0&&s2.length()==0)return true;

		}
		return false;
	}

}
