package recursion;

public class SumOfDidgits {
	static int sum=0;
	static int sumOfDig(int n) {
		if(n==0)return 0;
		
		return n%10+sumOfDig(n/10);
	}

	public static void main(String[] args) {
		
		System.out.println(sumOfDig(123));
	}

}
