package com.jsp.Sortng;

public class Prg1 {

	public static void main(String[] args) {
		int[] a= {1,9,4,8,2,0,4,5};
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a.length-1-i;j++) {
				if(a[j]>a[j+1]) {
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
		for(int n:a) {
			System.out.print(n+" ");
		}

	}

}
