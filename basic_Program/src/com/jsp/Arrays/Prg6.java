package com.jsp.Arrays;

public class Prg6 {

	public static void main(String[] args) {
		int[] a= {1,2,3,4,5,7,9,12,19};
		int k=2;
		int start=0;
		int end=a.length-1;
		
		while(start<=end) {
			int mid=(start+end)/2;
			if(k==a[mid]) {
				System.out.println("found");
				break;
			}
			else if(k>=a[mid])start=mid+1;
			else end=mid-1;
		}
		if(start>end)System.out.println("not found");

	}
	

}
