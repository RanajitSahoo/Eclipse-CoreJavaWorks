package pattern;

import java.util.Scanner;

public class P9 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter size");
		int n=s.nextInt();
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				if(i==j||i+j==n+1) {
					if(i<=3)System.out.print(i);
					else System.out.print(n+1-i);
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}

	}

}
