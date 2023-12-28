package pattern;

import java.util.Scanner;

public class P5 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter size");
		int n=s.nextInt();
		for(int i=1;i<=n;i++) {
			if(i<=(n/2)) {
				for(int j=1;j<=i;j++) {
					System.out.print("*");
					
				}
			}else {
				for(int j=i;j<=n;j++) {
					System.out.print("*");
				}
			}
			
			System.out.println();
		}

	}

}
