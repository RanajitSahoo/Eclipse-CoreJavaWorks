package pattern;

public class Prg14 {
	public static void main(String[] args) {
		int count=0,c=0;
		for(int i=1;i<=100;i++) {
			boolean prime=true;
			if(i<=1) prime=false;
			for(int j=2;j<=i/2;j++)
				if(i%j==0)prime=false;
			if(prime) {
				count++;
				if(count%2==0) {
					c++;
					if(c==3) {
						int n=i;
						int sum=0;
						while(n>0) {
							sum+=n%10;
							n/=10;
						}
						System.out.printf(i+" "+sum);
					}
				}
			}
			
		}
		
		
	}
}
