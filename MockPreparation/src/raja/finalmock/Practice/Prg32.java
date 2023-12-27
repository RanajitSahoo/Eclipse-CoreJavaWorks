package raja.finalmock.Practice;

public class Prg32 {

	public static void main(String[] args) {
		int n1=12;
		int n2=8;
		int n=n1>n2?n1:n2;
		int t=n;
		while(true) {
			if(n%n1==0&&n%n2==0)break;
			n+=t;
		}
		System.out.println(n);
		
	}

}
