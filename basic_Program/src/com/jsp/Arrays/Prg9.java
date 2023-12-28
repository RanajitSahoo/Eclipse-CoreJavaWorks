package com.jsp.Arrays;

public class Prg9 {
	public static void main(String[] args) {
		int[] a= {9,1,4,7,6,2};
		for(int i=0;i<a.length-1;i++) {
			int index=i;
			for(int j=i+1;j<a.length;j++) {
				if(a[j]<a[index])index=j;
			}
			if(i!=index) {
				int t=a[i];
				a[i]=a[index];
				a[index]=t;
			}
		}
		for(int n:a) {
			System.out.print(n+" ");
		}
	}
}
