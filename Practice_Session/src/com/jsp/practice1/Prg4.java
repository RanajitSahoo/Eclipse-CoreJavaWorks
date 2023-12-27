package com.jsp.practice1;

public class Prg4 {

	public static void main(String[] args) {
		String s1="Java is good";
		System.out.println(reverse(s1));

	}
	public static String reverse(String s) {
		char[] ch=s.toCharArray();
		int i=0;
		int j=s.length()-1;
		while(i<j) {
			char c=ch[i];
			ch[i]=ch[j];
			ch[j]=c;
			i++;
			j--;
		}
		return new String(ch);
	}
}
