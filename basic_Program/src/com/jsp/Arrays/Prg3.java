package com.jsp.Arrays;

public class Prg3 {

	public static void main(String[] args) {
		int[] a= {1,2,3,4,5};
		int i=0;
		int j=a.length-1;
		while(i<j) {
			int t=a[i];
			a[i]=a[j];
			a[j]=t;
			i++;
			j--;
		}
		for(int n:a) {
			System.out.print(n+" ");
		}

	}

}
