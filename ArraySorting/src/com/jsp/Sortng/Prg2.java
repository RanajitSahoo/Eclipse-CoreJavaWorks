package com.jsp.Sortng;

public class Prg2 {

	public static void main(String[] args) {
		int[] a= {1,9,4,8,2,0,4,5};
		for(int i=0;i<a.length;i++) {
			int index=i;
			for(int j=i+1;j<a.length;j++) {
				if(a[j]<a[index])index=j;
				
			}
			
			if(i!=index) {
				int temp=a[index];
				a[index]=a[i];
				a[i]=temp;
			}
		}
		for(int n:a) {
			System.out.print(n+" ");
		}

	}

}
