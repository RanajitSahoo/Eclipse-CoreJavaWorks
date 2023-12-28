package com.jsp.String;

public class DDem0 {

	public static void main(String[] args) {
		String s1="reena";
		char[] ch=s1.toCharArray();
		for(int i=0;i<ch.length;i++) {
			if(i==0) {
				ch[i]=(char)(ch[i]-32);
			}
		}
		System.out.println(new String(ch));

	}

}
