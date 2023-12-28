package com.jsp.String;

public class Prg15 {

	public static void main(String[] args) {
		String s1="java is easy";
		System.out.println(rev(s1));

	}
	
	public static String rev(String s) {
		char[] ch=s.toCharArray();
		int i=0;
		int j=ch.length-1;
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
