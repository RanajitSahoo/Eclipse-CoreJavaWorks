package pattern;

import java.util.Scanner;

public class P2 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter size");
		int n=s.nextInt();
		int k=1;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n-i;j++) {
				System.out.print(" ");
			}
			for(int j=1;j<=k;j++) {
				if(j==1||j==k||i==n)System.out.print("*");
				else System.out.print(" ");
			}
			System.out.println();
			k  +=2;
		}

	}

}
