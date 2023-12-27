package raja.finalmock.Practice;

public class Prg48 {

	public static void main(String[] args) {
		int n=123;
		int c=0;
		while(n>9) {
			n/=10;
			c++;
		}
		int i=(int)Math.pow(10, c);
		System.out.println(i);
		System.out.println(rev(123,i));

	}
	public static int rev(int n,int i) {
		if(n==0)return 0;
		return n%10*i+rev(n/10,i/10);
	}

}
