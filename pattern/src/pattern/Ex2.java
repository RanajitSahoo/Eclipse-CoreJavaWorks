package pattern;

import java.util.Scanner;

public class Ex2 {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int m=sc.nextInt();
		int n=1;
		if(m<=5) {
		 n=m+(m-1);
		}else {
			System.out.println("Madorchod 5 se kam dal");
		}
		for(int i=1;i<=n;i++) {
			
			for(int j=1;j<=n;j++) {
				
				if(i==1||j==1|j==n||i==n) {
					System.out.print(1);
				}else {
					
					if(i==2||j==2|j==n-1||i==n-1) {
						System.out.print(2);
					}else {
						if(i==3||j==3|j==n-2||i==n-2) {
							System.out.print(3);
						}else {
							if(i==4||j==4|j==n-3||i==n-3) {
								System.out.print(4);
							}else {
								if(i==5||j==5|j==n-4||i==n-4) {
									System.out.print(5);
								}else {
									
								}
							}
						}
					}
				}
			}
		System.out.println();	
			
		}
		
			
			
	}
}
