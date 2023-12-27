package Loop;

import java.util.Scanner;

public class NivenNumber {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter your lucky number");
		int n=s.nextInt();
		int nc=n;
		int sum=0;
		while(n>0) {
			int d=n%10;
			sum+=d;
			n/=10;
		}
		int res=nc/sum;
		System.out.println(res);
		boolean prime=true;
		for(int i=2;i<=res/2;i++) {
			if(res%i==0) {
				prime = false;
				break;
			}
		}
		String str=prime&&res>=2?"Niven number":"not Niven number";
		System.out.println(str);
	}

}
