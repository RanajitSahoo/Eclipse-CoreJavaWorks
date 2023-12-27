package com.jsp.Arraysss;

import java.util.Scanner;

public class Prg6 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the size of the Array");
		int size=s.nextInt();
		int[] a=new int[size];
		for(int i=0;i<size;i++) {
			System.out.print("enter the "+(i+1)+" element--> ");
			a[i]=s.nextInt();
		}
//		int[] a= {1,0,2,6,3,9,3};
		int[] a1=new int[3];
		int key=11,k=0;
		int cn=0;
		int sum=0;
		for(int i=0;i<a.length;i++) {
			for(int j=i+2;j<a.length;j++) {
				
					a1[0]=a[i];
					a1[1]=a[i+1];
					a1[2]=a[j];
					if(summationArray(a1)==key) {
						cn++;
						for(int n:a1)System.out.print(n+" ");
						System.out.println("--");
						break;
						
					}
			}
			
		}
		System.out.println(cn);
		
	}
	public static int summationArray(int[] a) {
		int sum=0;
		for(int n:a)sum+=n;
		return sum;
	}

}
