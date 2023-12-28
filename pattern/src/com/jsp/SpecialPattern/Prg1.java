package com.jsp.SpecialPattern;

public class Prg1 {

	public static void main(String[] args) {
		int n=5;
		
		for(int i=0;i<n;i++) {
			for(int j=i;j<n;j++) {
				System.out.print(" ");
			}
			int p=(int)Math.pow(2, i);
			int q=(int)Math.pow((i+1), 2);

			
			if(i%2==0) {
				for(int j=p==1?p:(p+1);j<=q;j++) {
					System.out.print(j+" ");
				}
			}
			else {
				for(int j=p*2;j>=(int)Math.pow(i, 2)+1;j--) {
					System.out.print(j+" ");
				}
			}

			System.out.println();
		}

	}

}
