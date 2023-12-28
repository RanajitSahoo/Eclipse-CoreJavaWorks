package com.jsp.String;

public class CountOccurance {

	public static void main(String[] args) {
		String s="Ranajit";
		System.out.println(count(s, 'a'));

	}
	
	public static int count(String s,char c) {
		
		String s1=s.replace(c+"","");
		int count = s.length()-s1.length();
		return count;
	}

}
