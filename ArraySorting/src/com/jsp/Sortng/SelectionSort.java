package com.jsp.Sortng;

import java.util.Arrays;

public class SelectionSort {

	public static void main(String[] args) {
		int[] a= {1,9,4,8,2,0,4,5};
		System.out.println(Arrays.toString(a));
		sort(a);
		System.out.println(Arrays.toString(a));

	}
	
	public static void sort(int[] a) {
		for(int i=0;i<a.length-1;i++) {
			int pos=i;
			for(int j=i+1;j<a.length;j++) {
				if(a[j]<a[pos]) pos=j;
			}
			if(i!=pos) {
				int t=a[pos];
				a[pos]=a[i];
				a[i]=t;
			}
		}
	}

}
