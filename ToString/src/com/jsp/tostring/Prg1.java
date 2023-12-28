package com.jsp.tostring;

public class Prg1 {

	public static void main(String[] args) {
		String s2="raja";
		String s1="";
		System.out.println(s2.length());
		for(int i=0;i<s2.length();i++) {
//			System.out.println(s1.charAt(i));
			if(s2.charAt(i)=='a') {
				s1=s1+"x";
			}else {
				s1=s1+s2.charAt(i);
			}
		}
		System.out.println(s1);

	}

}
