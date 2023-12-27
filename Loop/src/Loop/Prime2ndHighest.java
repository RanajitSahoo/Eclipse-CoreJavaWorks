package Loop;

import java.util.Scanner;
public class Prime2ndHighest {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Give the range for a and b for prime number");
		int a=s.nextInt();
		int b=s.nextInt();
		System.out.println("give the position to fetch--> ");
		int c=s.nextInt();
		int count=0;
		int i=0;
		for( i=b;i>=a;i--) {
			boolean prime=true;
			if(i==1)prime=false;
			for(int j=2;j<=i/2;j++) {
				if(i%j==0) {
					prime=false;
				}
			}
			if(prime) {
				count++;
				if(count==c) {
					System.out.println(i);
					break;
				}
			}
		}
		
	}

}
