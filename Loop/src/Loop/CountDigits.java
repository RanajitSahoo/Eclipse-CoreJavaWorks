package Loop;

import java.util.Scanner;

public class CountDigits {

	public static void main(String[] args) {
		System.out.println("Enter a number");
		Scanner s=new Scanner(System.in);
		int n = s.nextInt();
		int nc = n;
		int count = 0;
		while(n>0) {
			count++;
			n/=10;
		}
		System.out.println("Number of digit present in "+nc+" is "+count);
	}

}
