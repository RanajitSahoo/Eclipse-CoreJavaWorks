package day_4;

import java.util.Scanner;

public class Prg1 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter your number");
		int n=s.nextInt();
		int c=0;
		for(int i=n-1;i>=1;i--) {
			int nc=i;
			
			int sum=0;
			while(nc>0) {
				int d=nc%10;
				sum=sum*10+d;
				nc/=10;
			}
			
			if(sum==i) {
				System.out.println(i);
				return;
					
			}
		}
		

	}

}
