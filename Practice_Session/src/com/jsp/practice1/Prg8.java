package com.jsp.practice1;

public class Prg8 {

	public static void main(String[] args) {
		String s1="i java is easy";
		char[] ch=s1.toCharArray();
		for(int i=0;i<ch.length;i++) {
			if(i==0) {
				ch[i]=(char)(ch[i]-32);
			}
			else if(ch[i]==' ') {
				ch[i+1]=(char)(ch[i+1]-32);
//				ch[i-1]=(char)(ch[i-1]-32);
			}
			
		}
		System.out.println(new String(ch));

	}

}
