package day_1;
//find the smallest digit in a number
public class Prg4 {

	public static void main(String[] args) {
		int n=91426;
		int t=9;
		while(n>0) {
			int d=n%10;
			
			if(t>d) {
				t=d;
			}
			
			n/=10;
		}
		System.out.println(t);
	}

}
