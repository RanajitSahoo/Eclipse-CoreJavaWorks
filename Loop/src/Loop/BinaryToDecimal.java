package Loop;

import java.util.Scanner;

public class BinaryToDecimal {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Eneter your number");
		int n=s.nextInt();
		int i=1;
		int res = 0;
		while(n>0) {
			int r=n%10;
			res=res+(r*i);
			i*=2;
			n/=10;
			
		}
		System.out.println(res);

	}

}
