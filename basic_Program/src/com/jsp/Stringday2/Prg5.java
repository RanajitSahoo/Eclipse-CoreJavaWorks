package com.jsp.Stringday2;

public class Prg5 {

	public static void main(String[] args) {
		String s2="raja";
		String s1="";
		for(int i=0;i<s2.length()-1;i++) {
			if(s2.charAt(i)=='a') {
				s1=s1+"x";
			}else {
				s1=s1+s2.charAt(i);
			}
		}
		System.out.println(s1);

	}

}
