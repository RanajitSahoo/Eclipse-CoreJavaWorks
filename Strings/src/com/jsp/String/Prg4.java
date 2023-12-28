package com.jsp.String;

public class Prg4 {

	public static void main(String[] args) {
		String s="i IM iM i aM raNajiT sAhoo";
		char[] ch=s.toCharArray();
		int i=0;
		while(i<ch.length) {
			if(i==0&&ch[i]!=' ') {
				if(ch[i]>='a'&&ch[i]<='z') {
					ch[i]=(char)(ch[i]-32);
				}
				int j=i+1;
				while(j<ch.length) {
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
				while(j<ch.length) {
					if(ch[j]>='A'&&ch[j]<='Z') {
						ch[j]=(char)(ch[j]+32);
					}
					j++;
				}
				
			}
			i++;
			
		}
		System.out.println(new String(ch));

	}

}
