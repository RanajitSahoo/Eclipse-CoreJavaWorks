package Loop;

import java.util.Scanner;

public class LCM {

	public static void main(String[] args) {
		System.out.println("Enter two number");
		Scanner s= new Scanner(System.in);
		int a = s.nextInt();
		int b = s.nextInt();
		int n = a>b?a:b;
		int i = n;
		while(true) {
			if(n%a==0 && n%b==0)break;
			n+=i;
		}
		System.out.println(n);

	}

}
