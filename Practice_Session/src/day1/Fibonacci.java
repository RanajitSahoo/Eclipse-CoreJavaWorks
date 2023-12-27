package day1;

public class Fibonacci {
	
	public static void fib(int n) {
		int a=0,b=1;
		for(int i=1;i<=n;i++) {
			System.out.print(a+" ");
			int c=a+b;
			a=b;
			b=c;
			
		}
	}
	
	public static int dToB(int n) {
		
		int sum=0,i=1;// sum=1100  i=10000
		while(n!=0) {
			int rem=n%10;//1%2=1
			sum=sum+(rem*i);//100+(1*1000)
			i *=2;//i=10000
			n /=10;//n=0
		}
//		return sum;
		 return sum;
	}

	public static void main(String[] args) {
		
//		fib(10);
		System.out.println(dToB(1100));
		
	}

}
