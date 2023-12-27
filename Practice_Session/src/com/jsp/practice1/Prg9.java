package com.jsp.practice1;

public class Prg9 {

	public static void main(String[] args) {
		String s1="aaabbcccdda";
		char[] ch=s1.toCharArray();
		char c;
		String s2="";
		for(int i=0;i<ch.length;i++) {
			c=ch[i];
			int count=0;
			while(i<ch.length&&c==ch[i]) {
				count++;
				i++;
			}
			i--;
			s2+=count+""+c;
			
		}
		System.out.println(s2);
		

	}

}
