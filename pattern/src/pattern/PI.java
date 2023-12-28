package pattern;

import java.util.Scanner;

public class PI {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter size");
		int n=s.nextInt();
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				if(i==1||i==n||j==n/2+1) {
					System.out.print("*");
				}
				else System.out.print(" ");
			}
			System.out.println();
		}

	}

}
