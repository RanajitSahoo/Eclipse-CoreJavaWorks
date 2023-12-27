package com.jsp.practice1;

import java.util.Arrays;

public class Prg13 {

	public static void main(String[] args) {
		int[] a= {1,8,4,9,3,2,7};
		for(int i=0;i<a.length-1;i++) {
			int index=i;
			for(int j=i+1;j<a.length;j++) {
				if(a[j]<a[index])index=j;
			}
			if(i<index) {
				int t=a[index];
				a[index]=a[i];
				a[i]=t;
			}
		}
		System.out.println(Arrays.toString(a));

	}

}
