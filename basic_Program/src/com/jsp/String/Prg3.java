package com.jsp.String;

public class Prg3 {

	public static void main(String[] args) {
		String s1="java is easy ";
		char[] ch=s1.toCharArray();
		String s2="";
		String s3="";
		for(int i=0;i<ch.length;i++) {
			if(ch[i]>='a'&&ch[i]<='z') {
				s2=ch[i]+s2;
			}
			else {
				if(s2!=" ") {
					s3+=s2+" ";
					
					s2="";
				}
			}
		}
		System.out.println(s3);

	}

}
