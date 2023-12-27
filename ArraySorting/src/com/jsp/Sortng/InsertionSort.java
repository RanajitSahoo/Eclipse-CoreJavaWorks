package com.jsp.Sortng;

import java.util.Arrays;

public class InsertionSort {

	public static void main(String[] args) {
		int[] a= {1,9,4,8,2,0,4,5};
		System.out.println(Arrays.toString(a));
		sort(a);
		System.out.println(Arrays.toString(a));
	}
	
	public static void sort(int[] a) {
		for(int i=0;i<a.length;i++) {
			int key = a[i];
			int j=i-1;
			while(j>=0 && key<a[j]) {
				a[j+1]=a[j];
				j--;
			}
			a[j+1]=key;
		}
	}
}
