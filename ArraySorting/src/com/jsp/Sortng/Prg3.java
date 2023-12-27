package com.jsp.Sortng;

public class Prg3 {

	public static void main(String[] args) {
		int[] a= {1,9,4,8,2,0,4,5};
		for(int i=1;i<a.length;i++) {
			int key=a[i];
			int j=i-1;
			while(j>=0&&a[j]<key) {
				a[j+1]=a[j];
				j--;
			}
			a[j+1]=key;
		}
		for(int n:a) {
			System.out.print(n);
		}
	}

}
