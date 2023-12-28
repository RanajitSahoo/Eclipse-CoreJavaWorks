package com.jsp.Arrays;

public class Prg10 {
//Insertion sort
	public static void main(String[] args) {
		int[] a= {1,9,8,4,0,3,2,6,7};
		for(int i=1;i<a.length;i++) {
			int k=a[i];
			int j=i-1;
			while(j>=0&&a[j]>k) {
				a[j+1]=a[j];
				j--;
			}
			a[j+1]=k;
		}
		for(int n:a) {
			System.out.print(n+" ");
		}

	}

}
