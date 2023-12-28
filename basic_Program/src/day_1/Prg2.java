package day_1;

import java.util.Scanner;
//wap to sum of all digits
public class Prg2 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
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
