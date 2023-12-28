package com.jsp.Practice;

import java.util.Arrays;

public class Prg3 {

	public static void main(String[] args) {
		String s1="abbcdeafh";
		char[] a=s1.toCharArray();
		
		
		for(int i=0;i<a.length-1;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]==a[j]) {
					char[] b=change(j, a.length-1, a);
					a=b;
				}
			}
		}
		System.out.println(new String(a));

	}
	public static char[] change(int index,int end,char[] a) {
		if(index<=-1||index>=end+1)throw new IndexOutOfBoundsException();
		for(int i=index;i<end;i++) {
			a[i]=a[i+1];
		}
		a[end]=' ';
		return a;
	}

}
