package pattern;

import java.util.Scanner;

public class PS {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter size");
		int n=s.nextInt();
		int l=n/2;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				if(i<=l+1) {
					if(i==1||j==1||i==l+1) {
						System.out.print("*");
					}
					else System.out.print(" ");
				}else {
					if(j==n||i==n) {
						System.out.print("*");
					}
					else System.out.print(" ");
				}
			}
			System.out.println();
		}

	}

}
