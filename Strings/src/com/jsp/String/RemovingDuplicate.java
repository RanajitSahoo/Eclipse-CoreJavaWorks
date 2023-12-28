package com.jsp.String;

public class RemovingDuplicate {

	public static void main(String[] args) {
		String s1="bananaj";
		char[] ch=s1.toCharArray();
		for(int i=0;i<ch.length;i++) {
			for(int j=i+1;j<ch.length;j++) {
				if(ch[i]==ch[j])ch[j]=' ';
			}
		}
		System.out.println(new String(ch));

	}

}
