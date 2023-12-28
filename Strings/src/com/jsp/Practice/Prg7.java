package com.jsp.Practice;

public class Prg7 {

	public static void main(String[] args) {
		String st="abcde+ABCDghabc";
		char c='a';
		char[] a=st.toCharArray();
		for(int i=0;i<a.length;i++) {
			if(a[i]==c) {
				char[] a1=change(i, a.length-1, a);
				a=a1;
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
