package Exam;

import java.util.Scanner;

public class SET_A_QUE_3 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a number ");
		int n=s.nextInt();
		int sum=0;
		while(n!=0) {
			int d=n%10;
			sum+=d;
			n/=10;
		}
		System.out.println(sum);

	}

}
