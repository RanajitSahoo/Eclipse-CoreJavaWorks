package pattern;

import java.util.Scanner;

public class PC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("enter size");
		int n=s.nextInt();
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				if(j==1||i==1||i==n) {
					System.out.print("*");
				}
				else System.out.print(" ");
			}
			System.out.println();
		}
	}

}
