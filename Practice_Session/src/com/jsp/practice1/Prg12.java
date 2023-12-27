package com.jsp.practice1;

import java.util.Arrays;

public class Prg12 {

	public static void main(String[] args) {
		int[] a= {1,8,4,9,3,2,7};
		for(int i=0;i<a.length-1;i++) {
			for(int j=0;j<a.length-1-i;j++) {
				if(a[j]>a[j+1]) {
					int t=a[j];
					a[j]=a[j+1];
					a[j+1]=t;
				}
			}
		}
		System.out.println(Arrays.toString(a));

	}

}
