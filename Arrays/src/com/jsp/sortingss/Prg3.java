package com.jsp.sortingss;

public class Prg3 {

	public static void main(String[] args) {
		int[] a= {9,1,7,0,5,2,5,8};
		for(int i=0;i<a.length-1;i++) {
			int index=i;
			for(int j=i+1;j<a.length;j++) {
				if(a[j]<a[index]) index=j;
			}
			if(i!=index) {
				int t=a[index];
				a[index]=a[i];
				a[i]=t;
			}
		}
		for(int n:a) {
			System.out.println(n);
		}

	}

}
