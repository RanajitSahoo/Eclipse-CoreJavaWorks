package com.jsp.Arraysss;

public class FirstDuplicateValue {

	public static void main(String[] args) {
		int[] a= {2, 1, 2,5, 3, 3, 4};
		for(int i=0;i<a.length-1;i++) {
			for(int j=i+1;j<a.length;j++) {
				int n=occurance(a, i, j);
				
				if(n!=-1) {
					System.out.println(n+" occurance found");
				}
			}
		}

	}
	public static int occurance(int[] a,int start,int end) {
		for(int i=start;i<end;i++) {
			int n=a[i];
			int j=i+1;
			while(j<end) {
				if(a[j++]==n)return n;
				
			}
		}
		return -1;
	}
	

}
