package com.jsp.Arraysss;

import java.util.Scanner;

public class Prg5 {

	public static void main(String[] args) {
//		Scanner s=new Scanner(System.in);
		int[] a= {1,0,2,6,3,9,3};
		int[] a1=new int[3];
		int key=11,k=0;
		int cn=0;
		for(int i=0;i<a.length;i++) {
			int j=i;
			if(j==a.length-1)break;
			while(k<a1.length&&j<a.length) {
				a1[k++]=a[j++];
				
			}
			k=0;
			if(display(a1)==key)cn++;
			
		}
		System.out.println(cn);
		

	}
	public static int display(int[] a) {
		int sum=0;
		for(int n:a)sum+=n;
		return sum;
	}

}
