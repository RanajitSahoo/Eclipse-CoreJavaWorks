package day2;

public class Prg4 {
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
		int c=0;
		for(int i=1;i<=100;i++) {
			if(palindrome(i)==i) {
				c++;
				if(c%2!=0)System.out.println(i);
			}
			
		}


	}

}
