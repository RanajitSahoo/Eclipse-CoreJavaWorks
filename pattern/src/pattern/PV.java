package pattern;

import java.util.Scanner;

public class PV {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter size");
		int n=s.nextInt();
		int st=n*2-1;
		for(int i=n;i>=1;i--) {
			for(int j=n-i;j>=1;j--) {
				System.out.print(" ");
			}
			for(int j=st;j>=1;j--) {
				if(j==1||j==st) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
			st-=2;
		}

	}

}
