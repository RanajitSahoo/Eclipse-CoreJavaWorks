package com.jsp.String;

public class Prg25 {

	public static void main(String[] args) {
		String s1="ja2va12 is12 easy12";
		System.out.println(add(s1));

	}
	public static int add(String s) {
		char[] ch=(s+" ").toCharArray();
		String num="";
		int sum=0;
		for(int i=0;i<ch.length;i++) {
			if(ch[i]>='0'&&ch[i]<='9') {
				num+=ch[i];
			}
			else {
				if(num!="") {
					sum+=Integer.parseInt(num);
					num="";
				}
			}
		}
		return sum;
	}

}
