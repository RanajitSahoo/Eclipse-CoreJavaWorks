package com.jsp.String;

public class Prg2 {

	public static void main(String[] args) {
		String s1="java is very easy";
		String[] s2=s1.split(" ");
		for(int i=0;i<s2.length;i++) {
			
				System.out.print(reverse(s2[i]));
			
			System.out.print(" ");
		}
		

	}
	public static String reverse(String s) {
		String s2="";
		for(int i=s.length()-1;i>=0;i--) {
			 s2+=s.charAt(i);
		}
		
		return s2;
	}

}
