package raja.finalmock.Practice;

public class Prg33 {

	public static void main(String[] args) {
		int n1=8;
		int n2=4;
		int n=n1<n2?n1:n2;
		while(true) {
			if(n1%n==0&&n2%n==0)break;
			n--;
		}
		System.out.println(n);

	}

}
