package com.jsp.String;

public class Prg24 {

	public static void main(String[] args) {
		String s1="1ja2va12 is12 easy12 ";
		char[] ch=s1.toCharArray();
		int i=0;
		String num="";
		int sum=0;
		while(i<ch.length) {
			if(ch[i]>='0'&&ch[i]<='9') {
				num+=ch[i];
			}
			else {
				if(num!="") {
					sum+=Integer.parseInt(num);
					num="";
				}
			}
			i++;
		}
		System.out.println(sum);
	}

}
