package Loop;

import java.util.Scanner;

public class PerfectNumber {

	public static void main(String[] args) {
		System.out.println("Enter a number");
		Scanner s=new Scanner(System.in);
		int n = s.nextInt();
		int sum=0;
		for(int i=n/2;i>=1;i--) {
			if(n%i==0)sum+=i;
		}
		if(n==sum)System.out.println(n+"is a Perfect number");
		else System.out.println(n+"isn't a Perfect number");

	}

}
