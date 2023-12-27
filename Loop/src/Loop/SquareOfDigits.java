package Loop;

import java.util.Scanner;

public class SquareOfDigits {

	public static void main(String[] args) {
		System.out.println("Enter a number");
		Scanner s=new Scanner(System.in);
		int n = s.nextInt();
		int sum = 0;
		while(n>0) {
			int d = n%10;
			sum  +=(d*d);
			n/=10;
		}
		System.out.println(sum);

	}

}
