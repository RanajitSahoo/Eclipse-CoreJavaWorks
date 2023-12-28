package com.jsp.SpecialPattern;

public class Pascal {

	public static void main(String[] args) {
		int n=5;
		int[][] a=new int [n][];
		for(int i=0;i<a.length;i++) {
			for(int j=i;j<a.length;j++) {
				System.out.print(" ");
			}
			a[i]=new int[i+1];
			for(int j=0;j<a[i].length;j++) {
				if(j==0||j==i) {
					a[i][j]=1;
					System.out.print(a[i][j]+" ");
				}else {
					a[i][j]=a[i-1][j-1]+a[i-1][j];
					System.out.print(a[i][j]+" ");
				}
			}
			System.out.println();
		}

	}

}
