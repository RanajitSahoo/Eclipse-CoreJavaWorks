package com.jsp.String;

import java.util.Scanner;

public class Prg3 {
	public static void main(String[] args) {
//		Scanner s1=new Scanner(System.in);
//		System.out.println("Enter your String in anycase it will change to initCap");
		String s="i ajit sAhoo";
		char[] ch=s.toCharArray();
		int i=0;
		while(i<ch.length) {
			
			if(i==0&&ch[i]!=' ') {
				if(ch[i]>='a'&& ch[i]<='z') {
					ch[i]=(char)(ch[i]-32);
				}
			}
			if(ch[i]==' ') {
				if(ch[i+1]>='a'&& ch[i+1]<='z') {
					ch[i+1]=(char)(ch[i+1]-32);
				}
			}
			
			i++;
		}
		System.out.println(new String(ch));
	}

}
