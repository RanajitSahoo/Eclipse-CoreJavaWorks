package pattern;

import java.util.Scanner;

public class Ex5 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the value of n");
		int n=s.nextInt();
		for(int i=n;i>=1;i--) {
			for(int j=n;j>=i;j--) {
				System.out.print(j);
			}
			for(int j=2*i-2;j>1;j--) {
				System.out.print(i);
			}
			for(int j=i==1?2:i;j<=n;j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		for(int i=1;i<=n;i++) {
			for(int j=n;j>=i;j--) {
				System.out.print(j);
			}
			for(int j=2*i-2;j>1;j--) {
				System.out.print(i);
			}
			for(int j=i==1?2:i;j<=n;j++) {
				System.out.print(j);
			}
			System.out.println();
		}
	}

}
