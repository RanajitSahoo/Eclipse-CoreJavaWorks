package com.jsp.Arraysss;

public class subArray {

	public static void main(String[] args) {
		int[] a= {1,2,3,4,5,6,7,8,9,10};
		int sum=12;
		for(int i=0;i<a.length-1;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(sumArray(a, i, j)==sum) {
					System.out.println((i+1)+" "+(j+1));
					break;
				}
			}
		}

	}
	public static int sumArray(int[] a,int start,int end) {
		int sum=0;
		for(int i=start;i<=end;i++)sum+=a[i];
		return sum;
	}

}
