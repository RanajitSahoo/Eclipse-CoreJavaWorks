package com.jsp.practice1;

public class Prg7 {

	public static void main(String[] args) {
		String s1="ja1va12  1 is23 easy23";
		char[] ch=(s1+" ").toCharArray();
		String num="";
		int sum=0;
		for(int i=0;i<ch.length;i++) {
			int j=i;
			while(j<ch.length) {
				if(ch[j]>='0'&&ch[j]<='9') {
					num+=ch[j];
				}else {
					if(num!="") {
						sum+=Integer.parseInt(num);
						num="";
					}
				}
				j++;
			}
			i=j;
		}
		System.out.println(sum);

	}

}
