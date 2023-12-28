package com.jsp.String;

public class Prg6 {

	public static void main(String[] args) {
		String s="1ja10va20 is10 j12 ";
		char[] ch=s.toCharArray();
		int i=0;
		String s1="";
		int sum=0;
		while(i<ch.length) {
			if(ch[i]>='0'&&ch[i]<='9') {
				s1+=ch[i];
			}
			else {
				if(s1!="") {
					sum+=Integer.parseInt(s1);
					s1="";
				}
			}
			i++;
		}
		System.out.println(sum);

	}

}
