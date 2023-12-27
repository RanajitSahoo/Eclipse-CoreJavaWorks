package com.jsp.Arraysss;

import java.util.Scanner;

public class MoveElementToEnd {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int[] a= {2, 1, 2, 2, 2, 3, 4, 2};
		for(int n:a) {
			System.out.print(n+" ");
		}
		System.out.println();
		System.out.println("Enter the element to move last");
		int ele=s.nextInt();
		
		for(int i=0;i<a.length-1;i++) {
			if(a[i]==ele) {
				for(int k=i+1;k<a.length;k++) {
					
					if(a[k]!=ele) {
						if(a[i]==ele&&a[k]!=ele) {
							int temp=a[i];
							a[i]=a[k];
							a[k]=temp;
						}
						
					}else {
						continue;
					}
				}
			}else {
				continue;
			}
		}
		for(int n:a) {
			System.out.print(n+" ");
		}
		
		
	}

}
