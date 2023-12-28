package com.jsp.Stringwrrrw;

public class Prg1 {

	public static void main(String[] args) {
		String s="Ranajit";
		char[] a=s.toCharArray();
		
		for(int i=0;i<a.length;i++) {
			int c=1;
			for(int j=i+1;j<a.length;j++) {
				if(a[i]==a[j]) {
					c++;
					a[j]=' ';
				}
				
				
			}
			if(a[i]!=' ') {
				System.out.println(a[i]+""+c);
			}
		}

	}

}
