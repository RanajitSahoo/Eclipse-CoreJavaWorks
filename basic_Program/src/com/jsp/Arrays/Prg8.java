package com.jsp.Arrays;

public class Prg8 {
//Bubble sort
	public static void main(String[] args) {
		int[] a= {9,1,4,7,6,2};
		for(int i=0;i<a.length-1;i++) {
			for(int j=0;j<a.length-1-i;j++) {
				if(a[j]>a[j+1]) {
					int t=a[j];
					a[j]=a[j+1];
					a[j+1]=t;
				}	
			}
		}
		for(int n:a) {
			System.out.print(n+" ");
		}
	}

}
