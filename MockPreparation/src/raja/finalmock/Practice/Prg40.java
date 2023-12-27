package raja.finalmock.Practice;

public class Prg40 {

	public static void main(String[] args) {
		int n=12
				;
		int sum=0,i=1;
		while(n!=0) {
			sum+=(n%2)*i;
			i*=10;
			n/=2;
		}
		System.out.println(sum);

	}

}
