package com.jsp.Arraysss;

public class Prg3 {

	public static void main(String[] args) {
		int[]a= {3,1,2,9,8,4,0,5};
		int small=a[0];
		for(int i=0;i<a.length;i++) {
			if(a[i]<small)small=a[i];
		}
		System.out.println(small);

	}

}
