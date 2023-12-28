package com.jsp.Arrays;

public class Prg7 {

	public static void main(String[] args) {
		int[] a= {1,2,3,4,5,7,9,12,19};
		int start=0,end=a.length-1;
		int key=12;
		if(isFound(a, start, end, key))System.out.println("found");
		else System.out.println("not found");
	}
	public static boolean isFound(int[] a,int start,int end ,int key) {
		if(start>end) return false;
		int mid=(start+end)/2;
		if(key==a[mid]) return true;
		if(key>a[mid]) start=mid+1;
		if(key<a[mid]) end=mid-1;
		return isFound(a, start, end, key);
	}

}
