package com.jsp.Stringwrrrw;

public class ADdNumber {

	public static void main(String[] args) {
		String s="11 Ja10va123 is12 easy89";
		String s2=s+" ";
		String num="";
		int sum=0;
		for(int i=0;i<s2.length();i++) {
			if(s2.charAt(i)>='0' && s2.charAt(i)<='9') {
				num+=s.charAt(i);
			}else {
				if(num!="") {
					sum+=Integer.parseInt(num);
					num="";
				}
			}
		}
		System.out.println(sum);

	}

}
