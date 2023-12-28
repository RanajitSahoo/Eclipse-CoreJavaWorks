package day2;

public class Prg3 {
	public static int palindrome(int n) {
		if(n<10)return n;
		int sum=0;
		while(n>0) {
			int d=n%10;
			sum=sum*10+d;
			n/=10;
		}
		return sum;
	}

	public static void main(String[] args) {
		for(int i=1;i<=100;i++) {
			if(palindrome(i)==i)System.out.println(i);
			
		}

	}

}
