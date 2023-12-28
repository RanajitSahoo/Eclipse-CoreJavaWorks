package com.jsp.Stringday2;

public class Prg6 {

	public static void main(String[] args) {
		String s1="Hello world";
		char ch[]=s1.toCharArray();
		String s2="";
		for(int i=0;i<ch.length;i++) {
			if(ch[i]=='l' && ch[i+1]=='l' && ch[i+2]=='o') {
				s2+="xx";
				i+=2;
			}
			else {
				s2+=ch[i];
			}
		}
		System.out.println(s2);

	}

}
