package pattern;

import java.util.Scanner;

public class HollowTriangle {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int star=1;
		for(int i=1;i<=n;i++) {
			for(int j=i;j<=n;j++) {
				System.out.print(" ");
			}
			for(int j=1;j<=star;j++) {
				if(j==1||j==star||i==n)System.out.print("*");
				else System.out.print(" ");
			}
			star+=2;
			System.out.println();
		}
	}
}
