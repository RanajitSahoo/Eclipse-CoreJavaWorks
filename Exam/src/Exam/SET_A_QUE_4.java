package Exam;

import java.util.Scanner;

public class SET_A_QUE_4 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a size ");
		int n=s.nextInt();
		int a=0,b=1;
		int c;
		for(int i=1;i<=n;i++) {
			System.out.print(a+" ");
			c=a+b;
			a=b;
			b=c;
		}

	}

}
