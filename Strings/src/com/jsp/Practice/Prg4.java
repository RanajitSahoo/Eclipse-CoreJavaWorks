package com.jsp.Practice;

public class Prg4 {

	public static void main(String[] args) {
		int n=140;
		int sum=0;
		for(int i=1;i<=n;i++) {
			sum+=i;
		}
		System.out.println(sum);
		String token="7xlonayt65c";
		String s=sum+token;
		char[] a=s.toCharArray();
		int count=0;
		for(int i=0;i<a.length;i++) {
			++count;
			if(count%3==0)a[i]='X';
		}
		System.out.println(new String(a));
	}

}
