package com.jsp.exam;

import java.util.Arrays;

public class Prg1 {

	public static void main(String[] args) {
		int[] a= {1,8,2,3,7,5,2};
		for(int i=0;i<a.length-1;i++) {
			for(int j=0;j<a.length-1-i;j++) {
				if(a[j]<a[j+1]) {
					int t=a[j];
					a[j]=a[j+1];
					a[j+1]=t;
				}
			}
		}
		System.out.println(a[2]);

	}

}
