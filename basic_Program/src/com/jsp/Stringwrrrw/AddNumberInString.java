package com.jsp.Stringwrrrw;

public class AddNumberInString {

	public static void main(String[] args) {
		String s="java123 is09 easy34 ";
		char[] ch=s.toCharArray();
		int sum=0;
		String num="";
		for(int i=0;i<ch.length;i++) {
			if(ch[i]>='0' && ch[i]<='9') {
				num+=ch[i];
			}
			else {
				if(num != "") {
					int n=Integer.parseInt(num);
					sum+=n;
					num="";
				}
			}
			
		}
		System.out.println(sum);

	}

}
