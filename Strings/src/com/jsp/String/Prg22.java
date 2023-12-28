package com.jsp.String;

public class Prg22 {

	public static void main(String[] args) {
		String s1="java is easy";
		char[] ch=s1.toCharArray();
		int i=0;
		
		while(i<ch.length) {
			if(i==0) {
				if(ch[i+1]>='a'&&ch[i+1]<='z') {
					ch[i+1]=(char)(ch[i+1]-32);
				}
			}
			if(ch[i]==' ') {
				if(ch[i+2]>='a'&&ch[i+2]<='z') {
					ch[i+2]=(char)(ch[i+2]-32);
				}
			}
			i++;
		}
		System.out.println(new String(ch));
	}

}
