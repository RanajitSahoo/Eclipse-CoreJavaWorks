package com.jsp.String;

public class StringToCharArray {

	public static void main(String[] args) {
		String s1="Ranajit";
		for(int i=0;i<s1.length();i++) {
			System.out.print(s1.charAt(i));
		}
		System.out.println("-------");
		char[] a=s1.toCharArray();
		for(char c:a) {
			System.out.println(c);
		}
		
		String s2="";
		for(int i=s1.length()-1;i>=0;i--) {
			char c=s1.charAt(i);
			s2 += c;
		}
		System.out.println(s2);
		

	}

}
