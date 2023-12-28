package com.jsp.String;

public class Prg8 {

	public static void main(String[] args) {
		String s1="java is easy";
		String[] s2=s1.split(" ");
		for(String s:s2) {
			System.out.print(rev(s)+" ");
		}
		

	}
	public static String rev(String s) {
		String s1="";
		for(int i=s.length()-1;i>=0;i--) {
			s1+=s.charAt(i);
		}
		return s1;
	}

}
