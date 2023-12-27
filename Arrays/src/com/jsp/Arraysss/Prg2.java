package com.jsp.Arraysss;

import java.util.Arrays;

public class Prg2 {

	public static void main(String[] args) {
		int[] a= {1,9,8,4,0,3,2,6,7};
		Arrays.sort(a);
		int start=0,end=a.length-1;
		int key=0;
		if(binSerach(a, start, end, key))System.out.println("found");
		else System.out.println("not found");
		
	}
	public static boolean binSerach(int[] a,int start,int end,int key) {
		if(start>end) return false;
		int mid=(start+end)/2;
		if(key==a[mid]) return true;
		if(key>a[mid]) start=mid+1;
		if(key<a[mid]) end=mid-1;
		return binSerach(a, start, end, key);
	}

}
