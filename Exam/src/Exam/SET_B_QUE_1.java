package Exam;

import java.util.Scanner;

public class SET_B_QUE_1 {
	public static void main(String... args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a number ");
		int n=s.nextInt();
		int space=n;
		int star=1;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<space;j++) {
				System.out.print(" ");
			}
			for(int j=1;j<=star;j++) {
				System.out.print("*");
			}
			System.out.println();
			if(i<=n/2) {
				space--;
				star+=2;
			}else {
				space++;
				star-=2;
			}
		}
	}
}
