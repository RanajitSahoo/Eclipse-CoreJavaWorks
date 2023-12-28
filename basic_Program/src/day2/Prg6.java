package day2;

public class Prg6 {

	public static void main(String[] args) {
		int c=0;
		for(int i=100;i>=1;i--) {
			int n=i;
			int sum=0;
			while(n>0) {
				int d=n%10;
				sum=sum*10+d;
				n/=10;
			}
			if(i==sum) {
				c++;
				if(c<=3)System.out.println(i);
			}
			
		}

	}

}
