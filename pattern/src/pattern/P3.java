package pattern;

import java.util.Scanner;

public class P3 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter size");
		int n=s.nextInt();
		
		for(int i=n;i>=1;i--) {
			for(int j=i+1;j<=n;j++) {
				System.out.print(j);
			}
			for(int j=1;j<=i;j++) {
				System.out.print(j);
			}
			
			
			System.out.println();
			
		}

	}

}
