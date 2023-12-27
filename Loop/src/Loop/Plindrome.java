package Loop;

import java.util.Scanner;

public class Plindrome {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter your lucky number");
		int n=s.nextInt();
		int nc=n;
		int rev=0;
		while(n!=0) {
			int d=n%10;
			rev=rev*10+d;
			n/=10;
		}
		if(rev==nc) System.out.println("palindrome number");
		else System.out.println("not palindrome");

	}

}
