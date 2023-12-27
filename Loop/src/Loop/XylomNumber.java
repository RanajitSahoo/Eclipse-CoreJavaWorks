package Loop;

public class XylomNumber {

	public static void main(String[] args) {
		int n=13327;
		int nc=n;
		int count=0;
		while(n>9) {
			count++;
			n/=10;
		}
		n=nc;
		System.out.println(count);
		int firstdigit=n/(int)Math.pow(10, count);
		System.out.println(firstdigit);
		int lastDigit=n%10;
		System.out.println(lastDigit);
		n=n%(int)Math.pow(10, count);
		n/=10;System.out.println(n);
		int sumOfMiddile=0,sumfirstLast=0;
		while(n!=0) {
			sumOfMiddile+=n%10;
			n/=10;
		}
		sumfirstLast=firstdigit+lastDigit;
		if(sumfirstLast==sumOfMiddile)System.out.println("Xylom");
		else System.out.println("not");
		

	}

}
