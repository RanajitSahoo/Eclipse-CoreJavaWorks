package com.jsp.Arraysss;

public class MissingNumber {

	public static void main(String[] args) {
		int[] a= {4,2,3,5};
		int c=1;
		int temp=0;
		for(int i=0;i<a.length;i++) {
			
			if(c!=a[i]) {
				temp=c;
				c++;
				break;
			}
			else c++;
		}
		System.out.println(temp);

	}

}
