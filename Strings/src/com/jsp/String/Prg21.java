package com.jsp.String;

public class Prg21 {

	public static void main(String[] args) {
		String s1="jaVa iS eAsY";
		char[] ch=s1.toCharArray();
		for(int i=0;i<ch.length;i++) {
			if(i==0) {
				if(ch[i]>='a'&&ch[i]<='z') {
					ch[i]=(char)(ch[i]-32);
				}
				int j=i+1;
				while(j<ch.length&&ch[j]!=' ') {
					if(ch[j]>='A'&&ch[j]<='Z') {
						ch[j]=(char)(ch[j]+32);
					}
					j++;
				}
			}
			
			if(ch[i]==' ') {
				if(ch[i+1]>='a'&&ch[i+1]<='z') {
					ch[i+1]=(char)(ch[i+1]-32);
				}
				int j=i+2;
				while(j<ch.length&&ch[j]!=' ') {
					if(ch[j]>='A'&&ch[j]<='Z') {
						ch[j]=(char)(ch[j]+32);
					}
					j++;
				}
			}
		}
		System.out.println(new String(ch));

	}

}
