package day_3;

import java.util.Scanner;

public class Prg2 {

	public static void main(String[] args) {
		for(int j=1;j<=100000;j++) {
			
			int n=j;
			int nc=n;
			int c=0;
			while(n>0) {
				
				c++;
				n/=10;
			}
			n=nc;
			int sum=0;
			while(n>0) {
				int d=n%10;
				int prd=1;
//				for(int i=1;i<=c;i++) {
//					prd *= d;
//				}
				prd=(int)Math.pow(d, c);
				sum+=prd;
				n/=10;
			}
			if(nc==sum)System.out.println(j);
			

		}

	}

}
