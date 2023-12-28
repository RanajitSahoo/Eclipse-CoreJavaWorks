package pattern;

import java.util.Scanner;

public class PB {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter size");
		int n=s.nextInt();
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				if(j==1||i==1||i==n||j==n||i==n/2+1) {
					System.out.print("*");
				}
				else System.out.print(" ");
			}
			System.out.println();
		}

	}

}
