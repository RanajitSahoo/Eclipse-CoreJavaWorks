package pattern;

import java.util.Scanner;

public class PA {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter size");
		int n=s.nextInt();
		int st=1;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n-i;j++) {
				System.out.print(" ");
			}
			for(int j=1;j<=st;j++) {
				if(j==1||j==st) {
					System.out.print("*");
				}else if(i==n/2+1)System.out.print("*");
				else {
					System.out.print(" ");
				}
			}
			
			System.out.println();
			st+=2;
		}
	}

}
