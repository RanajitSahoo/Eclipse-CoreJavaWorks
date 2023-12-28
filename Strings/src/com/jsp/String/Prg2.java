package com.jsp.String;

public class Prg2 {

	public static void main(String[] args) {
		String s1="Java is easy";
		
		char[] ch=s1.toCharArray();
		int i=0;
		while(i<ch.length) {
			
			if(i==0) {
				if(ch[i]>='a'&& ch[i]<='z')
				ch[i]=(char)(ch[i]-32);
			}
			if(ch[i]==' ') {
				if(ch[i+1]>='a'&& ch[i+1]<='z')
				ch[i+1]=(char)(ch[i+1]-32);
				
			}
			
			i++;
		}
		System.out.println(new String(ch));
	}

}
